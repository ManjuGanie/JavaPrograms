
public class GCDExample {

	public static void main(String[] args) 
	{
		int x=90, y=60,gcd=1;
		for(int i =1; i<=x && i<=y; i++)
		{
			if(x%i==0 && y%i==0)
				gcd=i;
		}	
System.out.printf("GCD of %d and %d is: %d", x,y,gcd);
	}

}
