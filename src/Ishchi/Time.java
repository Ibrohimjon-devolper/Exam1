package Ishchi;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Time {


    public static void main(String[] args) throws InterruptedException {

        LocalDate start = LocalDate.of(1990, 1, 1);
        LocalDate end = LocalDate.of(2024, 1, 1);
        AtomicInteger OverallWorkDay = new AtomicInteger(0);

        Long startYear = (long) start.getYear();
        Long endYear = (long) end.getYear();


        Runnable task = () -> {
            LocalDate currentDay = start;
            while (!currentDay.isEqual(end)) {
                if (isWorkDay(currentDay)) {
                    OverallWorkDay.incrementAndGet();
                }
                currentDay = currentDay.plusDays(1);
            }
        };


        Thread thread1 = new Thread(task);
        thread1.start();

        thread1.join();


        System.out.println("Jami ish kunlari : " + OverallWorkDay.get());
        isLeapYear1(startYear, endYear);


    }

    private static boolean isWorkDay(LocalDate current) {
        return switch (current.getDayOfWeek()) {
            case MONDAY, THURSDAY, WEDNESDAY, TUESDAY, FRIDAY -> true;
            default -> false;
        };


    }


    private static void isLeapYear1(Long startYear, Long endYear) {

        for (Long i = startYear; i <= endYear; i++) {
            int current = i.intValue();
            if (LocalDate.of(current, 1, 1).isLeapYear()) {
                System.out.println("Kabisa yili : " + current);
            }
        }
    }


}
