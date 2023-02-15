#include <iostream>
#include <vector>
#include <string>

using namespace std;

//class Mahasiswa
class Mahasiswa {
    public:
        string nama;
        string NIM;
        string programStudi;
        string fakultas;

        //constructor
        Mahasiswa(string nama, string NIM, string programStudi, string fakultas) {
            this->nama = nama;
            this->NIM = NIM;
            this->programStudi = programStudi;
            this->fakultas = fakultas;
        }
};

//class DaftarMahasiswa
class DaftarMahasiswa {
    private:
        vector<Mahasiswa> daftar;

    public:
        //method untuk menambahkan data mahasiswa
        void tambahMahasiswa(Mahasiswa m) {
            daftar.push_back(m);
            cout << "Mahasiswa baru berhasil ditambahkan!" << endl;
        }

        //method untuk mengubah data mahasiswa
        void ubahMahasiswa(int index, Mahasiswa m) {
            daftar[index] = m;
            cout << "Data mahasiswa berhasil diubah!" << endl;
        }

        //method untuk menghapus data mahasiswa
        void hapusMahasiswa(int index) {
            daftar.erase(daftar.begin() + index);
            cout << "Data mahasiswa berhasil dihapus!" << endl;
        }

        //method untuk menampilkan data mahasiswa
        void tampilkanDaftar() {
            cout << "Daftar Mahasiswa Universitas Pendidikan Indonesia" << endl;
            cout << "=================================================" << endl;
            for (int i = 0; i < daftar.size(); i++) {
                cout << "ID \t\t: " << i + 1 << endl;
                cout << "Nama \t\t: " << daftar[i].nama << endl;
                cout << "NIM \t\t: " <<  daftar[i].NIM << endl;
                cout << "Prodi \t\t: " << daftar[i].programStudi << endl;
                cout << "Fakultas \t: " << daftar[i].fakultas << "\n" << endl;
            }
        }
};

//fungsi input
Mahasiswa inputMahasiswa() {
    string nama, NIM, programStudi, fakultas;
    cin.ignore();

    cout << "Masukkan nama: ";
    getline(cin, nama);

    cout << "Masukkan NIM: ";
    getline(cin, NIM);    

    cout << "Masukkan program studi: ";
    getline(cin, programStudi);

    cout << "Masukkan fakultas: ";
    getline(cin, fakultas);

    return Mahasiswa(nama, NIM, programStudi, fakultas);
}

int main() {
    DaftarMahasiswa daftar;

    int pilihan = 0;
    while (pilihan != 5) {
        cout << "\nMenu:" << endl;
        cout << "1. Tambah Mahasiswa" << endl;
        cout << "2. Ubah Mahasiswa" << endl;
        cout << "3. Hapus Mahasiswa" << endl;
        cout << "4. Tampilkan Daftar Mahasiswa" << endl;
        cout << "5. Keluar" << endl;
        cout << "Masukkan pilihan Anda (1-4): ";
        cin >> pilihan;

        if (pilihan == 1) {
            //menambah daftar mahasiswa
            Mahasiswa m = inputMahasiswa();
            daftar.tambahMahasiswa(m);
        } else if (pilihan == 2) {
            //mengubah data mahasiswa
            int index;
            daftar.tampilkanDaftar();
            cout << "Masukkan nomor urut mahasiswa yang akan diubah: ";
            cin >> index;
            index--;

            Mahasiswa m = inputMahasiswa();
            daftar.ubahMahasiswa(index, m);
        } else if (pilihan == 3) {
            //menghapus data mahasiswa
            int index;
            daftar.tampilkanDaftar();
            cout << "Masukkan index mahasiswa (mulai dari 1): ";
            cin >> index;
            index--;

            daftar.hapusMahasiswa(index);
        } else if (pilihan == 4) {
            //tampilkan daftar mahasiswa
            daftar.tampilkanDaftar();
        }else if (pilihan == 5){
            //program selesai
            cout << "Terimakasih, sampai jumpa kembali." << endl;
        }
        else{
            //jika pilihan tidak valid
            cout << "Pilihan tidak ada. Mohon pilih nomor 1 - 4." << endl;
        }
    }

    return 0;
}
