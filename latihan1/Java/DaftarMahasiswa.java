//import library
import java.util.ArrayList;
import java.util.Scanner;

//class daftarMahasiswa untuk menyimpan daftar mahasiswa
class DaftarMahasiswa {
    private ArrayList<Mahasiswa> daftar = new ArrayList<Mahasiswa>();

    //method untuk menambahkan mahasiswa baru ke dalam daftar
    public void tambahMahasiswa(Mahasiswa m) {
        daftar.add(m);
        System.out.println("Mahasiswa baru berhasil ditambahkan!");
    }

    //method untuk mengubah data mahasiswa di dalam daftar
    public void ubahMahasiswa(int index, Mahasiswa m) {
        daftar.set(index, m);
        System.out.println("Data mahasiswa berhasil diubah!");
    }

    //method untuk menghapus mahasiswa dari daftar
    public void hapusMahasiswa(int index) {
        daftar.remove(index);
        System.out.println("Data mahasiswa berhasil dihapus!");
    }

    //method untuk menampilkan daftar mahasiswa dalam bentuk list
    public void tampilkanDaftar() {
        System.out.println("Daftar Mahasiswa Universitas Pendidikan Indonesia");
        System.out.println("=================================================");
        for (int i = 0; i < daftar.size(); i++) {
            System.out.println("ID \t\t: " + (i + 1));
            System.out.println("Nama \t\t: " + daftar.get(i).getNama());
            System.out.println("NIM \t\t: " + daftar.get(i).getNIM());
            System.out.println("Prodi \t\t: " + daftar.get(i).getProgramStudi());
            System.out.println("Fakultas \t: " + daftar.get(i).getFakultas() + "\n");
        }
    }
}