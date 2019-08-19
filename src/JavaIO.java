import java.io.File;
import java.util.Scanner;


public class JavaIO {
	public static void main(String[] args) {
		
		File file = new File("output.txt");
		try(Scanner sc = new Scanner(file)){
			
			String str = sc.nextLine();
			
			System.out.println(str);
			
			str = sc.nextLine();
			
			System.out.println(str);
			
			str = sc.nextLine();
			
			System.out.println(str);
			
	} catch(Exception e) {
		}
	}

}
