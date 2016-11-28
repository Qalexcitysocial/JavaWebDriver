import java.io.File;

import org.openqa.selenium.io.TemporaryFilesystem;

public class ChangeTmpFS {
	public static void main(String... args) {
		TemporaryFilesystem tmpFS = TemporaryFilesystem.getTmpFsBasedOn(new File("C:\\TmpFS"));
		
		File f = tmpFS.createTempDir("prefix1", "suffix1");
		System.out.println(f.getAbsolutePath());
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
