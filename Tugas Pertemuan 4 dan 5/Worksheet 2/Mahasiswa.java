public class Mahasiswa {
    // Atribut dibuat private agar sesuai prinsip enkapsulasi
    private String nama;
    private String nim;
    private String jurusan;

    // Konstruktor
    public Mahasiswa(String nama, String nim, String jurusan) {
        setNama(nama);      // gunakan setter agar validasi tetap berlaku
        this.nim = nim;
        setJurusan(jurusan);
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("❌ Nama tidak boleh kosong!");
        } else {
            this.nama = nama;
        }
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        if (jurusan == null || jurusan.trim().isEmpty()) {
            System.out.println("❌ Jurusan tidak boleh kosong!");
        } else {
            this.jurusan = jurusan;
        }
    }

    // Method untuk menampilkan data
    public void tampilkanInfo() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
    }
}
