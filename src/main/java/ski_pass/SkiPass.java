package ski_pass;

import enums.Time;
import id_generator.IdGenerator;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Setter @Getter @ToString
public abstract class SkiPass {
    private final int id = IdGenerator.createId();
    protected int usesLeft;
    protected Time time;
    public abstract void use();

    public boolean isValid() {
        return usesLeft > 0;
    }

    public boolean isDateValid() {
        DayOfWeek today = LocalDate.now().getDayOfWeek();
        if (time == Time.WEEKEND) {
            return today == DayOfWeek.SATURDAY || today == DayOfWeek.SUNDAY;
        }
        return today != DayOfWeek.SATURDAY && today != DayOfWeek.SUNDAY;

    }
}
