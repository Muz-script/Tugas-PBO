import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Membuat tanggal lahir spesifik
        Calendar cal = Calendar.getInstance();
        cal.set(2004, Calendar.JULY, 12);
        Date tgl = cal.getTime();

        // Data skills
        String[] skills = {"Java", "Python", "HTML"};

        // Objek Mahasiswa valid
        Mahasiswa m1 = new Mahasiswa("Muzakki", "24552011062", "Teknik Informatika", 21, tgl, skills);
        m1.tampilkanInfo();

        // Objek Mahasiswa tidak valid
        System.out.println("\n-- Uji Validasi Data Salah --");
        Mahasiswa m2 = new Mahasiswa("Budi123", "", "IT", -5, null, new String[]{});
        m2.tampilkanInfo();
    }
}
