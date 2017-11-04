package cz.expertkom.ju.task;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Main {

	private static final String LIST = "list: ";
	private static final String TEXT = "text ";

	// private static int count = 10;
	private static int countInt = 10;

	public static void main(String[] args) /*throws UnirestException */ {

		System.out.println("****************************************************");
		Helper helper = new Helper();
				for(String s: Helper.getS()) System.out.println ("*"+s);
		System.out.println(helper.rtz);
		System.out.println("****************************************************");
		
		/* vytvoření nákupního seznamu osoby typu Person: */
		
		/* objekt pro definici typu využívá abstraktní třídu a kontruktor jejího potomka */ 
		Person person = new Customer("Jan", "Nov�k");
		
		List<Item> items = new ArrayList<Item>();
		
		Product product = new Product();
		product.setName("mleko"); /*přidává do seznamu instance potomka definované třídy v seznamu */
		items.add(product); /* do seznamu se přidává refernce na objekt, nikoliv objekt samostný */
		
		/* tohle neprojde protože ResultException nemá s Item nic společného */ 
		/*
		ResultException resultException = new ResultException("pokus");
		items.add(resultException);
		*/

		Car car = new Car();
		car.setJmeno("Škoda");
		items.add(car);
		
		Product product2 = new Product();
		product2.setName("máslo");
		items.add(product2);
		
		
		
		

		 /* vlastnost objektu Person se nastaví na pole items - mají stejný typ 
		  * objekt erson tak obsahuje i nákupní seznam Lis<Item> 
		  */
		person.setItems(items);

		/* převední Person do Stringu typu JSON */
		Gson gson = new Gson(); /* vytvoření instance typu Gson */
		String json = gson.toJson(person); /* přes instanci typu Gson převod metodou .toJson do stringu */
		System.out.println("json:"+json);
		System.out.println("****************************************************");

		for (Item i : items) {
			System.out.println("položka:"+i);
			if (i instanceof Nameable) {/*jak ho to napadlo ptát se na instanci typu Nameable */
				Nameable p = (Nameable) i; /* cast-ování ? */
				/* pravidla přetypování !!!! */
				
				String name = p.getName();
				String jmeno = ((Nameable) i).getName();
				System.out.println("     name: " + name+", "+jmeno);
			} else {
				System.out.println("     není instanceof Nameable");
			}
		}
		
		
		System.out.println("****************************************************");
		System.out.println(Helper.getSum(5,106));

	}
}
