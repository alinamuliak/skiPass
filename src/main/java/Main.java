import enums.Days;
import enums.Lifts;
import enums.Seasons;
import enums.Time;
import ski_pass.SkiPass;
import ski_pass.SkiSystem;
import ski_pass.TicketByDays;
import ski_pass.Turnstile;

public class Main {
    public static void main(String[] args) {
        SkiSystem skiSystem = SkiSystem.getSkiSystem();
        SkiPass skiPass = skiSystem.createSkiPass(Time.WORKDAY, Lifts.TEN_LIFTS);
        SkiPass skiPass1 = skiSystem.createSkiPass(Time.WEEKEND, Days.FIVE_DAYS);
        SkiPass skiPass2 = skiSystem.createSkiPass(Seasons.AUTUMN);


        Turnstile tr = new Turnstile();
//        depending on which day you are testing it,
//        you'll get different results, because of workday,
//        weekend and season passes
        for (int i = 0; i<10; i++) {
            tr.scanPass(skiPass);
            tr.scanPass(skiPass1);
            tr.scanPass(skiPass2);
        }
        System.out.println(skiSystem.getRegisteredCards());
        System.out.println(skiSystem.getLogEvents());
    }
}
