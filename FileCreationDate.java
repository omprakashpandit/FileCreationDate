import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileCreationDate {

	public static void main(String[] argv){

	    File file = new File( "D:\\Data\\Lohit\\SUBMISSION_DRAWING.dxf" );
	    String fileCreationDate="";
		BasicFileAttributes attributes; 
		try {
		    attributes = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
		    FileTime time = attributes.creationTime();
		    
		    String pattern = "dd-MM-yyyy";
		    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			
		    fileCreationDate = simpleDateFormat.format( new Date( time.toMillis() ) );
		    System.out.println( "The file creation date : " + fileCreationDate );
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
}