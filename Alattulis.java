public class Alattulis extends Barang {

    private String merk;

    public Alattulis(String nama, double harga, int stok, String merk) {
        super(nama, harga, stok);
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Alat Tulis : " + getNama());
        System.out.println("Merk       : " + merk);
        System.out.println("Harga      : Rp " + getHarga());
        System.out.println("Stok       : " + getStok());
    }
}