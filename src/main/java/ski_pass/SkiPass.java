package ski_pass;

import id_generator.IdGenerator;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public abstract class SkiPass {
    private final int id = IdGenerator.createId();
    private boolean valid = true;
}
