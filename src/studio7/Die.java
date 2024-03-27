package studio7;

public class Die {

	private int Sides;
	public Die(int n) {
		Sides=n;
	}
	public int Throw() {
		return (int)(Math.random()*Sides)+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d1=new Die (6);
		System.out.println(d1.Throw());
	}

}
