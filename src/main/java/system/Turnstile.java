package system;

import ski_pass.SkiPass;

public class Turnstile {
    private SkiSystem skiSystem = SkiSystem.getSkiSystem();

    public boolean scanPass(SkiPass skiPass) {
        if (skiPass.isValid()) {
            skiPass.use();
            if (!skiPass.isValid()){
                skiSystem.blockSkiPass(skiPass);
            }
            skiSystem.logEntryEvent(skiPass + "PASS ALLOWED.");
            return true;
        }
        skiSystem.logEntryEvent(skiPass + "PASS DENIED.");
        return false;
    }
}
