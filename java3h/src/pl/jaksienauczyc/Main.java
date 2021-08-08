package pl.jaksienauczyc;

import pl.jaksienauczyc.drive.Drive;
import pl.jaksienauczyc.drive.HDDDrive;
import pl.jaksienauczyc.drive.SSDDrive;
import pl.jaksienauczyc.file.File;
import pl.jaksienauczyc.file.imagefile.GIFImageFile;
import pl.jaksienauczyc.file.imagefile.JPGImageFile;
import pl.jaksienauczyc.file.musicfile.MP3MusicFile;

public class Main {

    public static void main(String[] args) {
        GIFImageFile gif1 = new GIFImageFile("nazwa1", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200, 80);

        MP3MusicFile mp3file = new MP3MusicFile("plik.mp3", 4000, "Marilyn Manson", "Broken Needle", 100);

        Drive drive = new HDDDrive();
        drive.addFile(gif1);
        drive.addFile(jpg1);
        drive.addFile(mp3file);

        drive.listFiles();
        File file = drive.findFile("plik.mp3");
        System.out.println(file.getSize());

    }
}
