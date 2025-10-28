
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Data awal
        String[] skillAwal = {"Java", "Python"};
        Calendar cal = Calendar.getInstance();
        cal.set(2005, Calendar.JANUARY, 5); // tahun, bulan, tanggal
        Date tgl = cal.getTime();

        Mahasiswa m1 = new Mahasiswa("Muzakki", "24552011062", "Teknik Informatika", 20, tgl, skillAwal);
        m1.tampilkanInfo();

        // Uji defensive copy: ubah array skillAwal setelah objek dibuat
        System.out.println("\n-- Uji Defensive Copy --");
        skillAwal[0] = "C++"; // mencoba mengubah skill dari luar
        m1.tampilkanInfo(); // data internal tidak berubah
    }
}
