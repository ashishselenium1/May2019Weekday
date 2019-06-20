package temp;

import java.util.Date;

public class Timstamp_Ex {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString().replaceAll(":", "_"));

	}

}
