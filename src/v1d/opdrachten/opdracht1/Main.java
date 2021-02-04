package v1d.opdrachten.opdracht1;

public class Main {
    // Dit is voor werkboek opdracht 1
    public static final String ansi_Kleur = "\u001B[3";

    public static void main(String[] args) {
            for(int nummer = 1; nummer!=11; nummer++){
                System.out.println(ansi_Kleur + nummer +"m" + "Het Getal is: " +nummer);
            }
    }
}
