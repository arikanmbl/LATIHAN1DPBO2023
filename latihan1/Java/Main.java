//import library
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //membuat scanner
    private static Scanner input = new Scanner(System.in);

    //method untuk meminta input data mahasiswa dari user
    private static Mahasiswa inputMahasiswa() {
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        String NIM = input.nextLine();
        System.out.print("Masukkan program studi: ");
        String programStudi = input.nextLine();
        System.out.print("Masukkan fakultas: ");
        String fakultas = input.nextLine();
        return new Mahasiswa(nama, NIM, programStudi, fakultas);
    }

    //method untuk menampilkan menu yang dapat dipilih user
    public static void main(String[] args) {
        DaftarMahasiswa daftar = new DaftarMahasiswa();
        int pilihan = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah mahasiswa");
            System.out.println("2. Ubah data mahasiswa");
            System.out.println("3. Hapus data mahasiswa");
            System.out.println("4. Tampilkan daftar mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                //menambahkan daftar mahasiswa
                case 1:
                    daftar.tambahMahasiswa(inputMahasiswa());
                    break;
                //mengubah data mahasiswa
                case 2:
                    daftar.tampilkanDaftar();
                    System.out.print("Masukkan nomor urut mahasiswa yang akan diubah: ");
                    int index = input.nextInt();
                    input.nextLine();
                    daftar.ubahMahasiswa(index - 1, inputMahasiswa());
                    break;
                //menghapus data mahasiswa
                case 3:
                    daftar.tampilkanDaftar();
                    System.out.print("Masukkan nomor urut mahasiswa yang akan dihapus: ");
                    index = input.nextInt();
                    input.nextLine();
                    daftar.hapusMahasiswa(index - 1);
                    break;
                //menampilkan daftar mahasiswa
                case 4:
                    daftar.tampilkanDaftar();
                    break;
                //keluar dari program
                case 0:
                    break;
                //pilihan angka selain yang ada di menu
                default:
                    System.out.println("Pilihan tidak valid! Mohon pilih nomor 1 - 4.");
                    break;
            }
        } while (pilihan != 0);
        System.out.println("Terima kasih telah menggunakan program ini.");
    }
}