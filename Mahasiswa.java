public class Mahasiswa<N, S, I> {

    private N nim;
    private S name;
    private I clas;

    public N getNim() {
        return nim;
    }

    public void setNim(N nim) {
        this.nim = nim;
    }

    public S getName() {
        return name;
    }

    public void setName(S name) {
        this.name = name;
    }

    public I getClas() {
        return clas;
    }

    public void setClas(I clas) {
        this.clas = clas;
    }
}