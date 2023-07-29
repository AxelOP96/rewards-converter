
public class RewardValue {
	private double cashValue;
	private double milesValue;
	
	public RewardValue(double cashValue) {
		this.cashValue= cashValue;
	}
	public RewardValue(int milesValue) {
		this.milesValue= milesValue;
	}
	public double getCashValue() {
		return cashValue;
	}
	public void setCashValue(double cashValue) {
		this.cashValue = cashValue;
	}
	public double getMilesValue() {
		return milesValue;
	}
	public void setMilesValue(double milesValue) {
		this.milesValue = milesValue;
	}
	
}
