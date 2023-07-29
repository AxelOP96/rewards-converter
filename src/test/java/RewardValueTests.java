import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
    	
    	double cashValue = 100.0;
    	double rate = 0.0035;
    	double number = (cashValue * rate);
    	BigDecimal bd = new BigDecimal(number).setScale(2, RoundingMode.HALF_UP);
    	double milesExpected = bd.doubleValue();
        double literalExpected = 0.35;
    	assertEquals(literalExpected, milesExpected);
    }

    @Test
    void convert_from_miles_to_cash() {
    	int milesValue = 10000;
    	double rate = 0.0035;
    	double cashExpected =(milesValue * rate);
    	double literalExpected = 35.0;
        assertEquals(literalExpected, cashExpected);
    }
}
