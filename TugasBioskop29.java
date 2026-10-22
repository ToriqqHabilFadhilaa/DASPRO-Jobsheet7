import java.util.Scanner;

public class TugasBioskop29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int hargaTiket = 50000;
        int totalTiket = 0;
        long totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan ulang!");
                continue;
            }

            long subtotal = (long) jumlahTiket * hargaTiket;
            long diskon = 0;

            if (jumlahTiket > 10) {
                diskon = subtotal * 15 / 100;
            } else if (jumlahTiket > 4) {
                diskon = subtotal * 10 / 100;
            }

            long totalBayar = subtotal - diskon;

            totalTiket += jumlahTiket;
            totalPenjualan += totalBayar;

            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Subtotal: Rp " + subtotal);
            System.out.println("Diskon: Rp " + diskon);
            System.out.println("Total pembayaran: Rp " + totalBayar);
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan hari ini: Rp " + totalPenjualan);

        sc.close();
    }
}
