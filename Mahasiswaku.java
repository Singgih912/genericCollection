public class Mahasiswaku {
    public static void main(String[] args) {
        Mahasiswa<String, String, String> m = new Mahasiswa<>();
        m.setNim("1102020");
        m.setName("Restu");
        m.setClas("21");

        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClass());
    }

}
