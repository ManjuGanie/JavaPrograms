import java.util.Arrays;

public class SortArrays 
{
public static void main(String[] args) 
{
	int[] array = new int[] {90,23,550,49,463,58,96,15,460,950};
	
	Arrays.sort(array);
	
	System.out.println("Elements of array sorted in ascending order:");
	
	for (int i=0; i<array.length;i++)
	{
		System.out.println(array[i]);
}
	
}

}
