package main.java;

public class RewardValue 
{
	double cash;//cash in double
	int miles;//miles in int
	
	public RewardValue(double cash)//constructor for cash
	{
		this.cash=cash;
	}
	public RewardValue(int miles)//constructor for mile
	{
		this.miles=miles;
	}
	
	public int getMilesValue()
	//function will return cash to miles value
	{
		miles=(int)(cash/0.0035);
		return miles;
	}
	
	public double getCashValue()//function will return miles to cash value
	{
		cash=0.0035*miles;
		return cash;
	}	
}
