package v1d.opdrachten.opdracht4;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int som = 0;
        while (count != 40){
            som = som + count;
            count = count + 1;
        }
        System.out.println("Het antwoord is: " + som);
    }
}
