/**
 * Problem: Read and print the contents of a text file using byte-stream,
 * character-stream, and NIO-based approaches.
 */
package file_handling;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.BufferedReader;


/** Demonstrates three standard Java techniques for reading a text file. */
public class ReadFromFile {
	/** Reads the configured input file and prints its contents three times. */
	public static void main(String[] args) throws IOException,Exception {
	String filePath = "/Users/aditya/eclipse-workspace-java/java_practice/src/file_handling/input.txt";
	int val ;
	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
	while((val = bis.read() )  != -1) {	
		System.out.print((char)val);
	}
	bis.close();
	System.out.println();
	BufferedReader brs = new BufferedReader(new FileReader(filePath));
	List<String> lines=new ArrayList<>();
	String temp;
	while((temp = brs.readLine())!=null) {
		lines.add(temp);
	}
	for(String line : lines) {
		System.out.println(line);
	}
	brs.close();
	System.out.println();
	
	List<String> liness = Files.readAllLines(Paths.get(filePath));
	for(String line : liness) {
		System.out.println(line);
	}
	}
}
