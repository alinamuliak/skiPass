package ski_pass;

import enums.Seasons;
import enums.Time;

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

    }
}
