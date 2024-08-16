public class Main {
    public static void main(String[] args) {

        int number = 25;
        int remainder;
        int counter = 0;


        for (int i = 1; i < number; i++) {
            remainder = number % i;
            if (remainder == 0) {
                counter = counter + i;
            }

        }
        //System.out.println(counter);
        if (counter == number) {
            System.out.println("Sayı mükemmel sayıdır.");
        } else {
            System.out.println("Sayı mükemmel sayı değildir");
        }
    }
}