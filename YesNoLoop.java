import java.util.Scanner;

public class YesNoLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.print("Apakah kamu mau melanjutkan? (yes/no): ");
            answer = scanner.nextLine().trim().toLowerCase();

            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Jawaban tidak valid, coba lagi.");
            }
        } while (!answer.equals("yes") && !answer.equals("no"));

        if (answer.equals("yes")) {
            System.out.println("Tiket Bioskop ");
            System.out.println("1. Reguler : Rp. 30000 ");
            System.out.println("2. Premium : Rp. 60000 ");
            System.out.println("3. VIP : Rp. 100000 ");

            System.out.println("Pilih Tiket : ");
            int tiket = input.nextInt();

            System.out.println("Jumlah Tiket : ");
            int jumlah = input.nextInt();
        } else {
            System.out.println("Kamu memilih untuk berhenti.");
        }

        scanner.close();
    }
}
