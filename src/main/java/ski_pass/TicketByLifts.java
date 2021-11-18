package ski_pass;

import enums.Lifts;
import enums.Time;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;

@Getter
public class TicketByLifts extends SkiPass {
    private final Lifts liftsAmount;

    TicketByLifts(Time time, Lifts lifts) {
        this.time = time;
        this.liftsAmount = lifts;
        usesLeft = liftsAmount.getAmount();
    }

    @Override
    public void use() {
        if (!isDateValid()){
            setUsesLeft(0);
        }
        usesLeft--;
    }
}
