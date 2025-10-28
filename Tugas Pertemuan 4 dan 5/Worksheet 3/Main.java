public class Main {
    public static void main(String[] args) {
        // Objek dengan data valid
        Mahasiswa m1 = new Mahasiswa("Adit", "231011", "Informatika", 20);
        m1.tampilkanInfo();

        // Objek dengan umur tidak valid
        System.out.println("\n-- Uji Validasi Umur --");
        Mahasiswa m2 = new Mahasiswa("Budi", "231012", "Sistem Informasi", -5);
        m2.tampilkanInfo();
    }
}
