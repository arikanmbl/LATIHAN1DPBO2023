#class mahasiswa untuk objek mahasiswa
class Mahasiswa:
    def __init__(self, nama, nim, prodi, fakultas):
        self.nama = nama
        self.nim = nim
        self.prodi = prodi
        self.fakultas = fakultas

    def __str__(self):
        return f"Nama \t\t: {self.nama}\nNIM \t\t: {self.nim}\nProdi \t\t: {self.prodi}\nFakultas \t: {self.fakultas}\n"

#class DaftarMahasiswa untuk mengelola daftar mahasiswa
class DaftarMahasiswa:
    def __init__(self):
        self.daftar_mahasiswa = []

    #method untuk menambah daftar mahasiswa
    def tambah_mahasiswa(self, mahasiswa):
        self.daftar_mahasiswa.append(mahasiswa)

    #method untuk mengubah data mahasiswa
    def ubah_mahasiswa(self, nim, mahasiswa_baru):
        for i, mahasiswa in enumerate(self.daftar_mahasiswa):
            if mahasiswa.nim == nim:
                self.daftar_mahasiswa[i] = mahasiswa_baru

    #method untuk menghapus data mahasiswa
    def hapus_mahasiswa(self, nim):
        for i, mahasiswa in enumerate(self.daftar_mahasiswa):
            if mahasiswa.nim == nim:
                del self.daftar_mahasiswa[i]

    #method untuk menampikan daftar mahasiswa
    def tampilkan_daftar(self):
        if not self.daftar_mahasiswa:
            print("Tidak ada mahasiswa yang terdaftar.")
        else:
            print("Daftar Mahasiswa Universitas Pendidikan Indonesia\n")
            for i, mahasiswa in enumerate(self.daftar_mahasiswa):
                print(f"ID \t\t\t: {i+1}")
                print(mahasiswa)

#fungsi untuk meminta input data mahasiswa dari user
def input_mahasiswa():
    nama = input("Masukkan nama: ")
    nim = input("Masukkan NIM: ")
    prodi = input("Masukkan program studi: ")
    fakultas = input("Masukkan fakultas: ")
    return Mahasiswa(nama, nim, prodi, fakultas)

if __name__ == "__main__":
    #membuat objek DaftarMahasiswa
    daftar_mahasiswa = DaftarMahasiswa()
    while True:
        #menampilkan menu program yang dapat dipilih user
        print("\nMenu:")
        print("1. Tambah Mahasiswa")
        print("2. Ubah Data Mahasiswa")
        print("3. Hapus Mahasiswa")
        print("4. Tampilkan Daftar Mahasiswa")
        print("5. Keluar")
        pilihan = int(input("Masukkan pilihan: "))

        if pilihan == 1:
            #menambahkan mahasiswa ke dalam daftar mahasiswa
            mahasiswa = input_mahasiswa()
            daftar_mahasiswa.tambah_mahasiswa(mahasiswa)
            print("Mahasiswa berhasil ditambahkan.")
        elif pilihan == 2:
            #mengubah data mahasiswa
            daftar_mahasiswa.tampilkan_daftar()
            nim = input("Masukkan nomor urut mahasiswa yang ingin diubah: ")
            mahasiswa_baru = input_mahasiswa()
            daftar_mahasiswa.ubah_mahasiswa(nim, mahasiswa_baru)
            print("Data mahasiswa berhasil diubah!")
        elif pilihan == 3:
            #menghapus data mahasiswa
            daftar_mahasiswa.tampilkan_daftar()
            nim = input("Masukkan nomor urut mahasiswa yang ingin dihapus: ")
            daftar_mahasiswa.hapus_mahasiswa(nim)
            print("Mahasiswa berhasil dihapus!")
        elif pilihan == 4:
            #menampilkan daftar mahasiswa
            daftar_mahasiswa.tampilkan_daftar()
        elif pilihan == 5:
            #keluar dari program
            break
        else:
            #ketika user memilih pilihan selain daripada yang ada di menu
            print("Pilihan tidak valid! Mohon pilih nomor 1 - 5")
