package ski_pass;

import enums.Lifts;
import enums.Time;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor @Getter
public class TicketByLifts extends SkiPass {
    private Time time;
    private Lifts liftsAmount;
    private Date dateOfPurchase;
    private int liftsLeft;

    public TicketByLifts(Time time, Lifts lifts) {
        this.time = time;
        this.liftsAmount = lifts;
        liftsLeft = liftsAmount.getAmount();
        dateOfPurchase = new Date();
    }

    @Override
    public void use() {
        liftsLeft--;
        if (liftsLeft == 0) {
            this.setUsesLeft(0);
        }
    }
}
