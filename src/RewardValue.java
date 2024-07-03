package main.java;

public class RewardValue 
{
	 double cash;//cash in double
	 int miles;//miles in int
	
	public RewardValue(double cash)//constructor for cash
	{
		this.cash=cash;
		ConvertCashIntoMiles(cash);
	}
	public RewardValue(int miles)//constructor for miles
	{
		this.miles=miles;
		ConvertMilesIntoCash(miles);
	}
	
	public int getMilesValue()
	{
		return miles;
	}
	public double getCashValue()
	{
		return cash;
	}	
	
	public int ConvertCashIntoMiles(double cash)
	//function will return cash to miles value
	{
		this.miles=(int)(cash/0.0035);
		return this.miles;
	}
	public double ConvertMilesIntoCash(int miles)
	//function will return miles to cash value
	{
		this.cash=0.0035*miles;
		return this.cash;
	}
}
