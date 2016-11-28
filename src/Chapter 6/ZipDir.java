import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.Zip;

public class ZipDir {
	public static void main(String... args){
		Zip zip = new Zip();
		try {
			zip.zip(new File("C:\\TmpFS"), new File("C:\\TmpFS.zip"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
