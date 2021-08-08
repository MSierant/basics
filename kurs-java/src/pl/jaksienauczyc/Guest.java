package pl.jaksienauczyc;

public class Guest {
    private String name;
    private String meal;
    private int phoneNumber;
    private Boolean isVegan;

    public Guest(String name, String meal, int phoneNumber, Boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Boolean getVegan() {
        return isVegan;
    }
    public void displayGuestInformation() {
        System.out.println("Imie: " + name);
        System.out.println("Preferowany posiłek: " + meal);
        System.out.println("Nr telefonu : " + phoneNumber);
        String isVeganString = isVegan ? "tak" : "nie";
        System.out.println("Weganin? "+ isVeganString);
    }
}
