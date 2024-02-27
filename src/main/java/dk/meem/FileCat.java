package dk.meem;

import java.io.IOException;

public class FileCat {

	
    public static void main(String[] args) throws IOException {
    	long t = System.currentTimeMillis();
    	
        Writefile.bufferedWriter("./", "testfile.1.txt", 1000*1024*900);
        Writefile.bufferedWriter("./", "testfile.2.txt", 1000*1024*900);
        Writefile.bufferedWriter("./", "testfile.3.txt", 1000*1024*900);
        Writefile.bufferedWriter("./", "testfile.4.txt", 1000*1024*900);
    	
    	String[] files = {"testfile.1.txt", "testfile.2.txt", "testfile.3.txt", "testfile.4.txt", "outfile.txt"};
    	MergeFiles.merge(files);
    	
    	System.out.println("Done in " + ((System.currentTimeMillis()-t)/1000) + " secs.");
	}
}
