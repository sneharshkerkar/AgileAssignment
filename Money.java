package agileassignment;

public class Money {
	private int moneyValue;
	private String moneyCurrency;
	
	public Money(int moneyValue, String moneyCurrency ) {
		this.moneyValue = moneyValue;
		this.moneyCurrency = moneyCurrency;
	}
    
	public int getMoneyValue() {
		return this.moneyValue;
	}
	
	public String getMoneyCurrency() {
		return moneyCurrency;
	}
}
