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

		Person person = new Customer("Jan", "Nov�k");
		
		Helper helper = new Helper();
		
		for(String s: Helper.getS()) System.out.println ("*"+s);
		System.out.println(helper.rtz);
		
		/****************************************************/

		List<Item> items = new ArrayList<Item>();
		Product product = new Product();
		product.setName("mleko");
		items.add(product);

		Car car = new Car();
		items.add(car);

		person.setItems(items);

		Gson gson = new Gson();
		String json = gson.toJson(person);
		System.out.println("json:"+json);
		/****************************************************/

		for (Item i : items) {
			System.out.println("položka:"+i);
			if (i instanceof Nameable) {
				Nameable p = (Nameable) i;
				String name = p.getName();
				System.out.println("     name: " + name);
			}
		}
		
		System.out.println(Helper.getSum(5,106));

	}
}
