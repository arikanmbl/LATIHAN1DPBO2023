//class mahasiswa untuk objek mahasiswa
class Mahasiswa{
    //atribut mahasiswa
    private String nama;
    private String NIM;
    private String programStudi;
    private String fakultas;

    //constructor
    public Mahasiswa(String nama, String NIM, String programStudi, String fakultas) {
        this.nama = nama;
        this.NIM = NIM;
        this.programStudi = programStudi;
        this.fakultas = fakultas;
    }

    //getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}