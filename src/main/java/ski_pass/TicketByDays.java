package ski_pass;
import enums.Days;
import enums.Time;
import lombok.Getter;
import lombok.Setter;

@Getter
public class TicketByDays extends SkiPass {
    private Time time;
    private Days daysAmount;
    private int daysLeft;

    public TicketByDays(Time time, Days days) {
        this.time = time;
        this.daysAmount = days;
        daysLeft = daysAmount.getAmount();
    }

    public void decreaseDay() {
        daysLeft--;
    }
}
