public class Main {
    public static void main(String[] args) {
        //220-284
        int number1 = 220;
        int number2 = 284;
        int reminder1, reminder2;
        int counter1 = 0, counter2 = 0;

        for (int i = 1; i < number1; i++) {
            reminder1 = number1 % i;
            if (reminder1 == 0) {
                counter1 = counter1 + i;
            }

        }

        for (int j = 1; j < number2; j++) {
            reminder2 = number2 % j;
            if (reminder2 == 0) {
                counter2 = counter2 + j;
            }
        }

        if (number1 == counter2 && number2 == counter1) {
            System.out.println("Sayılar arkada sayıdır.");
        } else {
            System.out.println("Sayılar arkadaş sayı değildir.");
        }
    }
}