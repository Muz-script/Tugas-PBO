public class Mahasiswa {
    // Atribut (belum dienkapsulasi)
    String nama;
    String nim;
    String jurusan;

    // Konstruktor
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Method untuk menampilkan data
    public void tampilkanInfo() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
    }
}
