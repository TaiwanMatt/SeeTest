import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

//	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String path="C:\\Users\\Administrator\\Desktop\\Test\\";
		DateFormat dateFormat = new SimpleDateFormat("MM_dd_HH_mm_ss");
		Date d = new Date();
		
		File f=new File(path,dateFormat.format(d).toString()+".txt");
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f,true)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
