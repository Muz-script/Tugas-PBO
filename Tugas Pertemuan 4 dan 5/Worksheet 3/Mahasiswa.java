public class Mahasiswa {
    // Atribut private (enkapsulasi)
    private String nama;
    private String nim;
    private String jurusan;
    private int umur; // atribut baru

    // Konstruktor
    public Mahasiswa(String nama, String nim, String jurusan, int umur) {
        setNama(nama);
        this.nim = nim;
        setJurusan(jurusan);
        setUmur(umur);
    }

    // Getter & Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("X Nama tidak boleh kosong!");
        } else {
            this.nama = nama;
        }
    }

    // Getter & Setter untuk NIM
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Getter & Setter untuk jurusan
    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        if (jurusan == null || jurusan.trim().isEmpty()) {
            System.out.println("X Jurusan tidak boleh kosong!");
        } else {
            this.jurusan = jurusan;
        }
    }

    // Getter & Setter untuk umur
    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur <= 0) {
            System.out.println("X Umur harus lebih dari 0!");
        } else {
            this.umur = umur;
        }
    }

    // Method tampilkan data
    public void tampilkanInfo() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Umur    : " + umur);
    }
}
