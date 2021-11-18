package system;

import enums.Days;
import enums.Lifts;
import enums.Seasons;
import enums.Time;
import ski_pass.SkiPass;
import ski_pass.TicketByDays;
import ski_pass.TicketByLifts;
import ski_pass.TicketBySeason;

import java.util.ArrayList;
import java.util.List;

public class SkiSystem {
    public static SkiSystem skiSystem;
    private List<SkiPass> registeredCards = new ArrayList<>();
    private List<String> logEvents = new ArrayList<>();
    private SkiSystem() {}

    public static SkiSystem getSkiSystem() {
        if (skiSystem == null) {
            skiSystem = new SkiSystem();
        }
        return skiSystem;
    }

    public SkiPass createSkiPass(Time timeType, Days days) {
        SkiPass skiPass = new TicketByDays(timeType, days);
        registeredCards.add(skiPass);
        return skiPass;
    }

    public SkiPass createSkiPass(Time timeType, Lifts lifts) {
        SkiPass skiPass = new TicketByLifts(timeType, lifts);
        registeredCards.add(skiPass);
        return skiPass;
    }

    public SkiPass createSkiPass(Seasons season) {
        SkiPass skiPass = new TicketBySeason(season);
        registeredCards.add(skiPass);
        return skiPass;
    }

    public void logEntryEvent(String skiPassEntryInfo) {
        logEvents.add(skiPassEntryInfo);
    }

    public void blockSkiPass(SkiPass skiPass) {
        skiPass.setUsesLeft(0);
    }
}
