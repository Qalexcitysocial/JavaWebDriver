import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class CopySimilarFilesFromSrcToDestDir {
	public static void main(String... args){
		try {
			FileHandler.copy(new File("C:\\Src\\"), new File("C:\\Dest\\"), ".txt");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
