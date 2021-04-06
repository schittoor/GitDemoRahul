package Global;



import java.io.FileInputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class lit {



	public static void main(String[] args) {
	    String abcd = "bdca";
	    char[] chars = abcd.toCharArray();

	    Arrays.sort(chars);
	    String sorted = new String(chars);

	    System.out.println(sorted);
		}

}


