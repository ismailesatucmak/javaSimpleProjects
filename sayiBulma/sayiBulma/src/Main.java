public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 9};
        int aranacak = 6;
        int i;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println("Aranan sayı dizide.");
        } else {
            System.out.println("Aranan sayı dizide değil.");
        }
    }
}