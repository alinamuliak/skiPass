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
    private final Days daysAmount;
    private LocalDate lastDayVisited;

    TicketByDays(Time time, Days days) {
        if (days.getAmount() > 2) {
            days = Days.TWO_DAYS;
        }
        this.time = time;
        this.daysAmount = days;
        usesLeft = daysAmount.getAmount();
        lastDayVisited = null;
    }

    @Override
    public void use() {
        if (!isDateValid()){
            setUsesLeft(0);
        }
        if (lastDayVisited == null) {
            lastDayVisited = LocalDate.now();
        } else if (ChronoUnit.DAYS.between(lastDayVisited, LocalDate.now()) > 0) {
            usesLeft--;
        }
    }
}
