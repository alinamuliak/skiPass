package ski_pass;

import enums.Lifts;
import enums.Time;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;

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

    @Override
    public void use() {
        if (!isDateValid()){
            setUsesLeft(0);
        }
        liftsLeft--;
    }
}
