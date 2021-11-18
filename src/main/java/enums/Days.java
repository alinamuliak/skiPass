package enums;

import lombok.Getter;

@Getter
public enum Days {
    ONE_DAY(1), TWO_DAYS(2), FIVE_DAYS(5);
    private int amount;

    Days(int amount) {
        this.amount = amount;
    }
}
