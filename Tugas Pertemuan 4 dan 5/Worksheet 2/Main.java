public class Main {
    public static void main(String[] args) {
        // Contoh input valid
        Mahasiswa m1 = new Mahasiswa("Muzakki", "24552011062", "Teknik Informatika");
        m1.tampilkanInfo();

        // Contoh input tidak valid (nama dan jurusan kosong)
        System.out.println("\n-- Uji Validasi --");
        Mahasiswa m2 = new Mahasiswa("", "231012", "");
        m2.tampilkanInfo();
    }
}
