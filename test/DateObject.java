
import daoproject.model.Person;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateObject {

    public static void main(String[] args) throws ParseException { //date nya di letakkan di sini, bukan di catch
        Date now = new Date();
        System.out.println("Tanggal :  " + now);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); // kalo MM bulan angka, MMM bulannya jadi nov, MMMM jadi november
        String nowFmt = sdf.format(now);                             // m kecil itu menit, M besar itu month
        // dd MMMM yyyy HH:mm:ss untuk waktu
        System.out.println("Tanggal Format :  " + nowFmt);
        Date dob = sdf.parse("12-01-1995");
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd MMMM yyyy");
        String aaa = sdf1.format(dob);
        System.out.println("Tanggal Lahir Aidha:  " + aaa);
        System.out.println("==========================================");
        
        
        
    }

}
