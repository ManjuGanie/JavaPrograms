
public class Average 
{
public static void main(String[] args) {
	int n=5, result=0;
	
	int a[]=new int[5];
	
	a[0] = 30;

	a[1] = 40;
	
	a[2] = 50;
	
	a[3] = 60;
	
	a[4] = 70;
	for (int i = 0; i<n; i++)
		
	result = result+a[i];
	
	System.out.println("average of ("+a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+") is ="+ result/n);
}
}
