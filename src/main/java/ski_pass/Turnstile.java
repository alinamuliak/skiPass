package ski_pass;

import ski_pass.SkiPass;
import ski_pass.SkiSystem;

public class Turnstile {
    private SkiSystem skiSystem = SkiSystem.getSkiSystem();

    public boolean scanPass(SkiPass skiPass) {
        if (skiPass.isValid() && skiPass.isDateValid()) {
            skiPass.use();
            skiSystem.logEntryEvent(skiPass + " PASS ALLOWED.");
            return true;
        }
        skiSystem.blockSkiPass(skiPass);
        skiSystem.logEntryEvent(skiPass + " PASS DENIED.");
        return false;
    }
}
