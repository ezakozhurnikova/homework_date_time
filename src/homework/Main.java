package homework;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Получить и вывести на экран:
-текущую дату
-текущий год, месяц и день


        //1.-текущую дату
        //-текущий год, месяц и день
        LocalDate today = LocalDate.now();
        System.out.println("today is " + LocalDate.now().getDayOfMonth() + " " + LocalDate.now().getMonth());
        System.out.println("today is " + today);
        /*today is 27 MARCH
          2023-03-27*/

        //2. Создать дату , например день рождения и вывести на экран
        LocalDate birthday = LocalDate.of(1989, 03, 30);
        System.out.println("My Birthday is " + birthday);
        //My Birthday is 1989-03-30

        //3.Создать две даты и проверить на равенство
        LocalDate one = LocalDate.parse("2023-07-07");
        LocalDate two = LocalDate.parse("2023-07-02");
        boolean equalsDate = one.isEqual(two);
        System.out.println("Is 2023-07-07 the same 2023-07-02? " + equalsDate);
        //Is 2023-07-07 the same 2023-07-02? false

        //4.Получить и вывести на экран текущее время
        LocalTime time = LocalTime.now();
        System.out.println("now is " + time);
        //now is 17:29:37.568241800

        //5.текущее время + 3 часа
        LocalTime plusThreeHours = time.plusHours(3);
        System.out.println("time plus 3 hours is " + plusThreeHours);
        //time plus 3 hours is 20:31:24.042280400

        //6.Создать дату на неделю позже сегодняшней
        LocalDate datePlusOneWeek = LocalDate.now().plusWeeks(1);
        System.out.println("After one week will be " + datePlusOneWeek);
        //After one week will be 2023-04-03

        //7.Создать дату, которая была на год раньше сегодняшней используя метод minus
        LocalDate minusOneYear = LocalDate.now().minusYears(1);
        System.out.println("One year before was " + minusOneYear);
        //One year before was 2022-03-27

        //8.Создать дату на год позже сегодняшней используя plus метод
        LocalDate plusOneYear = LocalDate.now().plusYears(1);
        System.out.println("After one year will be " + plusOneYear);
        //After one year will be 2024-03-27

        //9.Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
        LocalDate yesterday = LocalDate.now().minusDays(1);
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        boolean beforeToday = yesterday.isBefore(LocalDate.now());
        System.out.println("Is yesterday before today? " + beforeToday);
        boolean afterToday = tomorrow.isAfter(LocalDate.now());
        System.out.println("Is tomorrow after today? " + afterToday);
        //Is yesterday before today? true
        //Is tomorrow after today? true

        //*Написать метод, принимающий лист из нескольких дат типа LocalDate и возвращающий количество дней
        //между самой ранней и поздней датами*/
    }
   /* public int daysDifference(List<LocalDate>dates){
        String min= " ";
        for (int i=0; i<dates.size(); i++)
            if (dates.get(i).isAfter(dates.get(0))) ;
        }
    }*/
}
