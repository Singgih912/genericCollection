import java.util.ArrayList;
import java.util.ArrayDeque;

public class ContohCollection {

    public static void main(String[] args) {

        System.out.println("========== ARRAYLIST ==========");
        ArrayList<String> listMahasiswa = new ArrayList<>();
        listMahasiswa.add("Ferdi");
        listMahasiswa.add("Budi");
        listMahasiswa.add("Andi");
        listMahasiswa.add("Sari");

        System.out.println("Isi ArrayList:");
        for (String nama : listMahasiswa) {
            System.out.println("- " + nama);
        }

        listMahasiswa.remove("Budi");
        System.out.println("\nSetelah remove Budi:");
        for (String nama : listMahasiswa) {
            System.out.println("- " + nama);
        }

        System.out.println("\nUkuran ArrayList: " + listMahasiswa.size());
        System.out.println("Index ke-0: " + listMahasiswa.get(0));

        System.out.println("\n========== ARRAYDEQUE ==========");
        ArrayDeque<String> antrian = new ArrayDeque<>();
        antrian.add("Mahasiswa A");
        antrian.add("Mahasiswa B");
        antrian.add("Mahasiswa C");

        System.out.println("Isi ArrayDeque:");
        for (String s : antrian) {
            System.out.println("- " + s);
        }

        System.out.println("\nPeek (lihat depan): " + antrian.peek());
        System.out.println("Poll (ambil depan): " + antrian.poll());

        System.out.println("\nSetelah poll:");
        for (String s : antrian) {
            System.out.println("- " + s);
        }

        antrian.push("Mahasiswa D");
        System.out.println("\nSetelah push Mahasiswa D:");
        for (String s : antrian) {
            System.out.println("- " + s);
        }
    }
}