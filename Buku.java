public class Buku extends Barang {

    private String penulis;

    public Buku(String nama, double harga, int stok, String penulis) {
        super(nama, harga, stok);
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Buku    : " + getNama());
        System.out.println("Penulis : " + penulis);
        System.out.println("Harga   : Rp " + getHarga());
        System.out.println("Stok    : " + getStok());
    }
}