import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class CreateDirectory {
	public static void main(String... args){
		try {
			FileHandler.createDir(new File("C:\\SelDir"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
