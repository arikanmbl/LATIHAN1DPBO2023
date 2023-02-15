<?php

//class Mahasiswa untuk menampung data setiap mahasiswa
class Mahasiswa {
    public $nama;
    public $NIM;
    public $program_studi;
    public $fakultas;

    public function __construct($nama, $NIM, $program_studi, $fakultas) {
        $this->nama = $nama;
        $this->NIM = $NIM;
        $this->program_studi = $program_studi;
        $this->fakultas = $fakultas;
    }
}

//data mahasiswa
$mahasiswa1 = new Mahasiswa("Ayurika", "2003717", "Ilmu Komputer", "FPMIPA");
$mahasiswa2 = new Mahasiswa("Bayu", "2008362", "Fisika", "FPMIPA");
$mahasiswa3 = new Mahasiswa("Cezia", "2027389", "Manajemen", "FPEB");

//tampilkan informasi data mahasiswa
echo "Data Mahasiswa 1\n";
echo "Nama: " . $mahasiswa1->nama . "\n";
echo "NIM: " . $mahasiswa1->NIM . "\n";
echo "Program Studi: " . $mahasiswa1->program_studi . "\n";
echo "Fakultas: " . $mahasiswa1->fakultas . "\n\n";

echo "Data Mahasiswa 2\n";
echo "Nama: " . $mahasiswa2->nama . "\n";
echo "NIM: " . $mahasiswa2->NIM . "\n";
echo "Program Studi: " . $mahasiswa2->program_studi . "\n";
echo "Fakultas: " . $mahasiswa2->fakultas . "\n\n";

echo "Data Mahasiswa 3\n";
echo "Nama: " . $mahasiswa3->nama . "\n";
echo "NIM: " . $mahasiswa3->NIM . "\n";
echo "Program Studi: " . $mahasiswa3->program_studi . "\n";
echo "Fakultas: " . $mahasiswa3->fakultas . "\n\n";

?>
