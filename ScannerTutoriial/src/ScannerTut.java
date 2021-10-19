import java.util.Scanner;

public class ScannerTut {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your first name?");
		String name = scan.next();
		System.out.println(name);
	}

}
