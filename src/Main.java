import java.time.*;
public class Main {
    public static void main(String[] args) {
       LocalDate sarcina1 = LocalDate.of(2024, Month.JANUARY, 2);
        System.out.println(sarcina1);
        LocalTime sarcina2 = LocalTime.of(13, 20);
        System.out.println(sarcina2);
        LocalDateTime sarcina3 = LocalDateTime.of( sarcina1, sarcina2);
        System.out.println(sarcina3);
        ZoneId zone = ZoneId.of("America/New_York");
        ZonedDateTime sarcina4 = ZonedDateTime.of(sarcina1, sarcina2, zone);
        System.out.println(sarcina4);
        sarcina1 = sarcina1.plusDays(1);
        sarcina1 = sarcina1.plusYears(1);
        sarcina2 = sarcina2.plusMinutes(1);
        sarcina2 = sarcina2.plusHours(1);
        LocalDateTime sarcina5 = LocalDateTime.of( sarcina1, sarcina2);
        System.out.println(sarcina5);
        }
    }



//        1.	Creați o LocalDate care va reprezente data de 2 ianuarie 2024
//        2.	Creați o LocalTime care va reprezenta ora 13:20
//        3.	Creați o LocalDateTime care va reprezente data de 2 ianuarie 2024 ora 13:20
//        4.	Creați o ZoneDateTime care va reprezente data de 2 ianuarie 2024 ora 13:20 în America
//        5.	Adăugați un minut, o ora, o zi, un an, la data de mai sus

