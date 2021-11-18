package ski_pass;

import enums.Seasons;
import enums.Time;

public class TicketBySeason extends SkiPass {
    private Time time;
    private Seasons season;

    public TicketBySeason(Seasons season) {
        time = Time.WEEKEND;
        this.season = season;
    }
}
