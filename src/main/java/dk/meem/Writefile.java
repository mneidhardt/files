package dk.meem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writefile {
	
	public static void bufferedWriter(String reportPath, String fileName, long sizeInBytes) throws IOException {
	    BufferedWriter bufferedWriter = null;
	    try {
	      FileWriter writer = new FileWriter(reportPath + File.separator + fileName, true);
	      bufferedWriter = new BufferedWriter(writer);
	      
	      String content = "weirdlyAbstractButCorrectweirdlyAbstractButCorrectweirdlyAbstractButCorrectweirdlyAbstractButCorrect";

	      for (long i=0; i<sizeInBytes/100; i++) {
	    	  bufferedWriter.write(content);
	      }
	      
	      bufferedWriter.close();
	    } catch (Exception e) {
	      throw e;
	    } finally {
	      if (bufferedWriter != null) {
	        bufferedWriter.close();
	      }
	    }
	  }
}
