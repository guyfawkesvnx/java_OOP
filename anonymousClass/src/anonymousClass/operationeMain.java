package anonymousClass;

import java.util.Scanner;

public class operationeMain {
	public static void main(String agrs[]) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a :");
		a = sc.nextInt();
		System.out.println("Nhap b :");
		b = sc.nextInt();
		operation op = new operation() {
			
			@Override
			int subj(int a, int b) {
				
				return a - b;
			}
			
			@Override
			int add(int a, int b) {
				
				return a + b;
			}
		};
		System.out.println("a + b =" + op.add(a, b));
		System.out.println("a - b =" + op.subj(a, b));
	}
}