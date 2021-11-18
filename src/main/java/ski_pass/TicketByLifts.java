package ski_pass;

import enums.Days;
import enums.Lifts;
import enums.Time;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class TicketByLifts extends SkiPass {
    private Time time;
    private Lifts liftsAmount;
    private int liftsLeft;

    public TicketByLifts(Time time, Lifts lifts) {
        this.time = time;
        this.liftsAmount = lifts;
        liftsLeft = liftsAmount.getAmount();
    }

    public void decreaseLifts() {
        liftsLeft--;
    }
}
