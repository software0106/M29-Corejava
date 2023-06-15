package in.tnsif.thiskeyworddemo;

public class ThisKeywordExample {
	private int cvv;
	private long atmno;
	public ThisKeywordExample(int cvv, long atmno) {
		super();
		this.cvv = cvv;
		this.atmno = atmno;
	}
	public void print()
	{
		System.out.println("cvv -> "+cvv+" atm No -> "+atmno);
	}
	
}