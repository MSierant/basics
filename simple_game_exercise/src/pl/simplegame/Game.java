package pl.simplegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Game extends JPanel implements KeyListener, ActionListener {
    private int x = 300;
    private int points = 0;
    private Timer time;
    private int speed = 20;
    private int ex = 10;
    private int ey = 10;
    private Random number = new Random();
    private int EnemyX1 = number.nextInt(6)*100;
    private int EnemyX2 = number.nextInt(6)*100;



    public Game(){

        time = new Timer(10, this);
        time.start();

        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        addKeyListener(this);
    }
    public void paint(Graphics g){
        //background
        g.setColor(Color.darkGray);
        g.fillRect(0,0,700,600);

        //player
        g.setColor(Color.blue);
        g.fillRect(x,475,75,75);

        //enemy
        g.setColor(Color.red);
        g.fillRect(EnemyX1,ey,100,100);
        g.fillRect(EnemyX2,ey,100,100);

        //points
        g.setColor(Color.white);
        g.setFont(new Font("Serif",Font.BOLD,30));
        g.drawString("Points: " + points, 550,20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        //difficulty
        ey+=5;

        if (ey==580){
            points++;
            ey=10;
            EnemyX1 = number.nextInt(6)*100;
            EnemyX2 = number.nextInt(6)*100;
        }
        Rectangle player = new Rectangle(x,475,75,75);
        Rectangle Enemy1 = new Rectangle(EnemyX1,ey,100,100);
        Rectangle Enemy2 = new Rectangle(EnemyX2,ey,100,100);
        if (player.intersects(Enemy1) || player.intersects(Enemy2)) {
            time.stop();

        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_A) {
            if (x==20) x = 20;
             else x-=speed;
        }

        if(e.getKeyCode() == KeyEvent.VK_D){
            if (x==600)  x = 600;
             else x+=speed;
        }
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            reset();
        }
    }

    private void reset() {
        ey = 10;
        EnemyX1 = number.nextInt(6)*100;
        EnemyX2 = number.nextInt(6)*100;
        x = 300;
        points = 0;
        time.start();

    }


    @Override
    public void keyReleased(KeyEvent e) {

    }
}
