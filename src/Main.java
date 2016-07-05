import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		StringBuilder word = new StringBuilder();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word:");
		word.append(in.nextLine());
		System.out.println(word.reverse());
		in.close();

	}
}