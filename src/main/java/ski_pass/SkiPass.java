package ski_pass;

import id_generator.IdGenerator;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
public abstract class SkiPass {
    private final int id = IdGenerator.createId();
    private int usesLeft;
    public abstract void use();

    public boolean isValid() {
        return usesLeft > 0;
    }
}
