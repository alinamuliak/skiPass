package ski_pass;

import enums.Seasons;
import enums.Time;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class TicketBySeason extends SkiPass {
    private Time time;
    private Seasons season;
    private Date dateOfPurchase;

    public TicketBySeason(Seasons season) {
        time = Time.WEEKEND;
        this.season = season;
        dateOfPurchase = new Date();
    }

    @Override
    public void use() {
        if (!isDateValid() || !isSeasonValid()) {
            setUsesLeft(0);
        }
    }

    private boolean isSeasonValid() {
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
}
