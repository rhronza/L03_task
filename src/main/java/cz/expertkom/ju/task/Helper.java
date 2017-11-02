package cz.expertkom.ju.task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Helper {
	
	private static final List<String> S = new ArrayList<String>();
	
	static {
		S.add("text999");
	}
	
	public static List<String> getS() {
		return S;
	}


	private static AtomicBoolean atomicBoolean = new AtomicBoolean(true);
	
	private static final Object LOCK = new Object();
	


	private static Object o = null;
	
	public String rtz = "ahoj";

	public static final String URL = "http://neco";

		
	private static int i1;
	private static int i2;

	public static int getSum(final int i1, final int i2 /*, List<String> list*/) {
		
		int result = i1 + i2;

		if (result > 100) {
			try {
				throw new ResultException(null);
			} catch (ResultException e) {
				System.out.println("výsledek je větší než 100");
			}
		}
		//  list.add("vysledek je "+result);

		return result;
	}

}
