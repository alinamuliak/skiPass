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
    private int daysLeft;
    private LocalDate lastDayVisited;

    public TicketByDays(Time time, Days days) {
        this.time = time;
        this.daysAmount = days;
        daysLeft = daysAmount.getAmount();
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
            daysLeft--;
        }
    }
}
