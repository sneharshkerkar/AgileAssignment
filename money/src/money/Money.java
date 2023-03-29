package money;

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
		return this.moneyCurrency;
	}
	
	public String compareCurrency(String note) {
		int currentvalue=100;
		if(moneyValue>currentvalue) {
			note="more";
		}else if(moneyValue<currentvalue) {
			note="less";
		}else {
			note="equal";
		}
		
		return note;
	}
}
