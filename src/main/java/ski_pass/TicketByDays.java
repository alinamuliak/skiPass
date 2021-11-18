package ski_pass;
import enums.Days;
import enums.Time;
import lombok.Getter;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Getter
public class TicketByDays extends SkiPass {
    private final Time time;
    private final Days daysAmount;
    private final LocalDate dateOfPurchase;
    private int daysLeft;
    private LocalDate lastDayVisited;

    public TicketByDays(Time time, Days days) {
        this.time = time;
        this.daysAmount = days;
        daysLeft = daysAmount.getAmount();
        dateOfPurchase = LocalDate.now();
        lastDayVisited = null;
    }

    @Override
    public void use() {
        if (lastDayVisited == null) {
            lastDayVisited = LocalDate.now();
        } else if (ChronoUnit.DAYS.between(lastDayVisited, LocalDate.now()) > 0) {
            daysLeft--;
            if (daysLeft == 0) {
                this.setUsesLeft(0);
            }
        }
    }
}
