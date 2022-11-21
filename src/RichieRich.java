import java.util.*;

public class RichieRich {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int x = sc.nextInt();
			System.out.println((B - A) / x);
		}
		sc.close();
	}
}
