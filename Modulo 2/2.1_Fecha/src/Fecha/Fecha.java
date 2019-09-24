package Fecha;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * @author Felipe Guerra
 */
public class Fecha {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //FECHAS
        System.out.println("LocalDate");
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(1991, 02, 07);
        LocalDate ld3 = LocalDate.parse("2019-09-15");
        System.out.println(ld1.isAfter(ld2));
        System.out.println(ld1.isBefore(ld2));
        System.out.println(ld3.getDayOfWeek());
        System.out.println(ld1 + "||" + ld2 + "||" + ld3);
        System.out.println("=============");
        
        //TIEMPOS
        System.out.println("LocalTime");
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(2,40);
        LocalTime lt3 = LocalTime.parse("18:55");
        System.out.println(lt1.isAfter(lt2));
        System.out.println(lt1.isBefore(lt2));
        System.out.println(lt3.getHour());
        System.out.println(lt1 + "||" + lt2 + "||" + lt3);
        System.out.println("=============");
        
        //FECHA Y TIEMPO
        System.out.println("LocalDateTime:");
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(1991, Month.SEPTEMBER, 9, 2, 13);
        LocalDateTime ldt3 = LocalDateTime.parse("2019-09-18 02:14", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        System.out.println(ldt1.isAfter(ldt2));
        System.out.println(ldt1.isBefore(ldt2));
        ldt3 = ldt3.plusDays(13);
        System.out.println(ldt1 + "||" + ldt2 + "||" + ldt3);
        System.out.println("=============");
        
        //PERIODOS
        System.out.println("Periodos");
        Period per = Period.between(ld2, ld1);
        System.out.println(per.getDays() + "días");
        System.out.println(per.getMonths() + "meses");
        System.out.println(per.getYears() + "años");
        System.out.println("=============");
        
        //FORMATEAR FECHAS
        System.out.println("Formateo de Fechas");
        // MÁS FORMATOS: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        System.out.println(DateTimeFormatter.ofPattern("EEEE dd/MMMM/yyyy h:m:s a").format(ldt1));
    }
}