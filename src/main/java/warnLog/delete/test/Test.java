package warnLog.delete.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;

@Controller
public class Test {

	static String password = "1234";

	public static void main (String arg[]) {
		BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder ();
		String encodedPass = bcpe.encode(password);
		System.out.println(encodedPass);
		System.out.println(bcpe.matches(password, encodedPass));
	}

	private static void testMethod () {
		System.out.println("啊啊啊啊");
	}
}
