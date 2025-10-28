import java.util.Arrays;
import java.util.Date;

public class Mahasiswa {
    // Atribut private (enkapsulasi)
    private String nama;
    private String nim;
    private String jurusan;
    private int umur;
    private Date tglLahir;
    private String[] skills;

    // Konstruktor
    public Mahasiswa(String nama, String nim, String jurusan, int umur, Date tglLahir, String[] skills) {
        setNama(nama);
        setNim(nim);
        setJurusan(jurusan);
        setUmur(umur);
        setTglLahir(tglLahir);
        setSkills(skills);
    }

    // Getter & Setter untuk nama
    public String getNama() { return nama; }
    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("X Nama tidak boleh kosong!");
        } else if (!nama.matches("[a-zA-Z ]+")) {
            System.out.println("X Nama hanya boleh mengandung huruf dan spasi!");
        } else {
            this.nama = nama;
        }
    }

    // Getter & Setter untuk NIM
    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }

    // Getter & Setter untuk jurusan
    public String getJurusan() { return jurusan; }
    public void setJurusan(String jurusan) {
        if (jurusan == null || jurusan.trim().isEmpty()) {
            System.out.println("X Jurusan tidak boleh kosong!");
        } else if (jurusan.length() < 3) {
            System.out.println("X Jurusan harus minimal 3 karakter!");
        } else {
            this.jurusan = jurusan;
        }
    }

    // Getter & Setter untuk umur
    public int getUmur() { return umur; }
    public void setUmur(int umur) {
        if (umur <= 0) {
            System.out.println("X Umur harus lebih dari 0!");
        } else {
            this.umur = umur;
        }
    }

    // Getter & Setter untuk tglLahir (defensive copy)
    public Date getTglLahir() {
        return (tglLahir != null) ? new Date(tglLahir.getTime()) : null;
    }
    public void setTglLahir(Date tglLahir) {
        if (tglLahir != null) {
            this.tglLahir = new Date(tglLahir.getTime());
        } else {
            System.out.println("X Tanggal lahir tidak boleh null!");
        }
    }

    // Getter & Setter untuk skills (defensive copy)
    public String[] getSkills() {
        return (skills != null) ? Arrays.copyOf(skills, skills.length) : null;
    }
    public void setSkills(String[] skills) {
        if (skills != null) {
            this.skills = Arrays.copyOf(skills, skills.length);
        } else {
            System.out.println("X Skills tidak boleh null!");
        }
    }

    // Method tampilkan data
    public void tampilkanInfo() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama       : " + nama);
        System.out.println("NIM        : " + nim);
        System.out.println("Jurusan    : " + jurusan);
        System.out.println("Umur       : " + umur);
        System.out.println("Tgl Lahir  : " + tglLahir);
        System.out.println("Skills     : " + Arrays.toString(skills));
    }
}
