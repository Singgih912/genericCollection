import java.util.ArrayList;

public class Keranjang<T extends Barang> {

    private ArrayList<T> items = new ArrayList<>();

    public void tambah(T item) {
        items.add(item);
        System.out.println(item.getNama() + " ditambahkan ke keranjang.");
    }

    public void tampilKeranjang() {
        if (items.isEmpty()) {
            System.out.println("Keranjang kosong.");
            return;
        }
        System.out.println("Isi Keranjang:");
        for (T item : items) {
            System.out.println("  - " + item.getNama() + " | Rp " + item.getHarga());
        }
    }

    public double totalHarga() {
        double total = 0;
        for (T item : items) {
            total += item.getHarga();
        }
        return total;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}