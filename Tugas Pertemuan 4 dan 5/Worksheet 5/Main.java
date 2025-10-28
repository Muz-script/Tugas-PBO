import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Buat tanggal lahir spesifik
        Calendar cal = Calendar.getInstance();
        cal.set(2005, Calendar.JANUARY, 5);
        Date tgl = cal.getTime();

        String[] skills = {"Java", "HTML"};

        // Data valid
        Mahasiswa m1 = new Mahasiswa("Muzakki", "24552011062", "Teknik Informatika", 20, tgl, skills);
        m1.tampilkanInfo();

        // Uji validasi nama & jurusan
        System.out.println("\n-- Uji Validasi --");
        Mahasiswa m2 = new Mahasiswa("Budi123", "231012", "IT", 19, tgl, skills);
        m2.tampilkanInfo();
    }
}
