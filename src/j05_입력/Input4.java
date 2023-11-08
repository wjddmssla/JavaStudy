package j05_입력;

import java.util.Scanner;

public class Input4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String names = null;
		String phones = null;
		
		
		System.out.print("이름을 입력해 주세요.(여러명 입력 가능): ");
		names = scanner.nextLine();
		System.out.print("연락처를 입력해 주세요.(여러개 입력 가능): ");
		phones = scanner.nextLine();
		
		names = names.replaceAll(" ", "님, ") + "님";
		phones = "010-" + phones.replaceAll(", ", "/010-")
				.replaceAll(" ", "-");
		
		System.out.println(names);
		System.out.println(phones);
		
	}

}












