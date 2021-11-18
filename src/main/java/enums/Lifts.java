package enums;

import lombok.Getter;

@Getter
public enum Lifts {
    TEN_LIFTS(10), TWENTY_LIFTS(20), FIFTY_LIFTS(50), HUNDRED_LIFTS(100);
    private int amount;

    Lifts(int amount) {
        this.amount = amount;
    }
}
