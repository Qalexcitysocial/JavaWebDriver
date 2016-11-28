import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class DeleteFileOrDirectory {	
	public static void main(String... args){
		FileHandler.delete(new File("C:\\SelDir\\"));
	}
}
