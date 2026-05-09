import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Maintoko {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("    TOKO BUKU KAMPUS");
        System.out.println("========================================");
        System.out.println("Silakan login terlebih dahulu.");
        System.out.print("NIM    : ");
        String nim = scanner.nextLine();
        System.out.print("Nama   : ");
        String nama = scanner.nextLine();
        System.out.print("Kelas  : ");
        int kelas = Integer.parseInt(scanner.nextLine().trim());

        Mahasiswa<String, String, Integer> mahasiswa = new Mahasiswa<>();
        mahasiswa.setNim(nim);
        mahasiswa.setName(nama);
        mahasiswa.setClas(kelas);

        System.out.println("\nSelamat datang, " + mahasiswa.getName() + "!");
        System.out.println("NIM   : " + mahasiswa.getNim());
        System.out.println("Kelas : " + mahasiswa.getClas());

        ArrayList<Barang> daftarBarang = new ArrayList<>();
        daftarBarang.add(new Buku("Java OOP", 85000, 10, "Budi Santoso"));
        daftarBarang.add(new Buku("Clean Code", 120000, 5, "Robert C. Martin"));
        daftarBarang.add(new Alattulis("Pulpen", 5000, 100, "Pilot"));
        daftarBarang.add(new Alattulis("Pensil 2B", 3000, 50, "Faber Castell"));

        Keranjang<Barang> keranjang = new Keranjang<>();
        ArrayDeque<String> riwayat = new ArrayDeque<>();

        boolean running = true;
        while (running) {
            System.out.println("\n========================================");
            System.out.println("  MENU - " + mahasiswa.getName());
            System.out.println("========================================");
            System.out.println("1. Lihat semua produk");
            System.out.println("2. Tambah ke keranjang");
            System.out.println("3. Lihat keranjang");
            System.out.println("4. Lihat riwayat transaksi");
            System.out.println("5. Checkout");
            System.out.println("6. Keluar");
            System.out.println("----------------------------------------");
            System.out.print("Pilih menu: ");

            String pilih = scanner.nextLine().trim();

            switch (pilih) {
                case "1":
                    System.out.println("\n--- DAFTAR PRODUK ---");
                    for (int i = 0; i < daftarBarang.size(); i++) {
                        System.out.println("\n[" + (i + 1) + "]");
                        daftarBarang.get(i).tampilInfo();
                    }
                    break;

                case "2":
                    System.out.println("\n--- PILIH PRODUK ---");
                    for (int i = 0; i < daftarBarang.size(); i++) {
                        System.out.println("[" + (i + 1) + "] " + daftarBarang.get(i).getNama() + " - Rp " + daftarBarang.get(i).getHarga());
                    }
                    System.out.print("Nomor produk: ");
                    int nomorProduk = Integer.parseInt(scanner.nextLine().trim()) - 1;
                    if (nomorProduk >= 0 && nomorProduk < daftarBarang.size()) {
                        Barang dipilih = daftarBarang.get(nomorProduk);
                        if (dipilih.getStok() > 0) {
                            keranjang.tambah(dipilih);
                            riwayat.push(mahasiswa.getName() + " menambahkan: " + dipilih.getNama());
                        } else {
                            System.out.println("Stok habis!");
                        }
                    } else {
                        System.out.println("Nomor tidak valid!");
                    }
                    break;

                case "3":
                    System.out.println();
                    keranjang.tampilKeranjang();
                    System.out.println("Total: Rp " + keranjang.totalHarga());
                    break;

                case "4":
                    System.out.println("\n--- RIWAYAT TRANSAKSI " + mahasiswa.getName() + " ---");
                    if (riwayat.isEmpty()) {
                        System.out.println("Belum ada transaksi.");
                    } else {
                        for (String r : riwayat) {
                            System.out.println("- " + r);
                        }
                    }
                    break;

                case "5":
                    if (keranjang.isEmpty()) {
                        System.out.println("Keranjang kosong!");
                    } else {
                        System.out.println("\n--- CHECKOUT ---");
                        System.out.println("Pembeli  : " + mahasiswa.getName());
                        System.out.println("NIM      : " + mahasiswa.getNim());
                        System.out.println("Kelas    : " + mahasiswa.getClas());
                        keranjang.tampilKeranjang();
                        System.out.println("Total    : Rp " + keranjang.totalHarga());
                        riwayat.push(mahasiswa.getName() + " checkout - Total: Rp " + keranjang.totalHarga());
                        System.out.println("Transaksi berhasil! Terima kasih, " + mahasiswa.getName() + "!");
                    }
                    break;

                case "6":
                    System.out.println("Sampai jumpa, " + mahasiswa.getName() + "!");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }

        scanner.close();
    }
}