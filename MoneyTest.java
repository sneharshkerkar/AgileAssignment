package agileassignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {
	Money myMoney = new Money(200, "Rs");
	   Money myMoney2 = new Money(200, "$");
	   
	   @Test
		void testMoneyValue() {
			//fail("Not yet implemented");
			assertEquals(myMoney.getMoneyValue(),200);
		}
		

		@Test
		void testCurrencyValue() {
			//fail("Not yet implemented");
			assertEquals(myMoney.getMoneyCurrency(),"Rs");
		}
		
		

}
