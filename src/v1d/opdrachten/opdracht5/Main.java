package v1d.opdrachten.opdracht5;

public class Main {
    public static void main(String[] args) {
        String zaagPatroon = "s";
        for(int nummer = 1; nummer!=11; nummer++){
            System.out.println(zaagPatroon);
            if (zaagPatroon.length() == 2)  {
                zaagPatroon = "s";
            } else {
                zaagPatroon += "s";
            }
        }
    }
}
