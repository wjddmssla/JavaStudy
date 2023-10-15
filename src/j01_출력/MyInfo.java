package j01_출력;

public class MyInfo {

	public static void main(String[] args) {
		char name1 = '박';
		char name2 = '정';
		char name3 = '은';
		String name = "박정은";
		
		int age = 23;
		
		String address = "부산 사하구";
		
		System.out.print("이름: ");
		System.out.println("" + name1 + name2 + name3);
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println(address);
		System.out.println();

		System.out.print("이름: ");
		System.out.println("박정은");
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println("부산 사하구");
		System.out.println();
		
		System.out.print("이름: ");
		System.out.println("박정은");
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println("부산 사하구");
		System.out.println();
	}

}
