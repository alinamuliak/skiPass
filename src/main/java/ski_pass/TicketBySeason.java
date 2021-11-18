package ski_pass;

import enums.Seasons;
import enums.Time;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class TicketBySeason extends SkiPass {
    private Seasons season;

    TicketBySeason(Seasons season) {
        time = Time.WEEKEND;
        this.season = season;
    }


    @Override
    public boolean isValid() {
        LocalDate today = LocalDate.now();
        return (season == Seasons.WINTER && (today.getMonth() == Month.DECEMBER ||
                today.getMonth() == Month.JANUARY || today.getMonth() == Month.FEBRUARY)) ||
                (season == Seasons.SPRING && (today.getMonth() == Month.MARCH ||
                        today.getMonth() == Month.APRIL || today.getMonth() == Month.MAY)) ||
                (season == Seasons.SUMMER && (today.getMonth() == Month.JUNE ||
                        today.getMonth() == Month.JULY || today.getMonth() == Month.AUGUST)) ||
                (season == Seasons.AUTUMN && (today.getMonth() == Month.SEPTEMBER ||
                        today.getMonth() == Month.OCTOBER || today.getMonth() == Month.NOVEMBER));
    }

    @Override
    public void use() {
        if (!isDateValid() || !isValid()) {
            setUsesLeft(0);
        }
    }
}
