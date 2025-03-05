package assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;



class Ecommerce
{
	private int order_id;
	private String name;
	private int order_price;
	private String month;
	private int year;
	private String city;
	private String order_category;
	private int order_qty;
	public Ecommerce()
	{
		
	}
	public Ecommerce(int order_id, String name, int order_price, String month, int year, String city,
			String order_category, int order_qty) {
		super();
		this.order_id = order_id;
		this.name = name;
		this.order_price = order_price;
		this.month = month;
		this.year = year;
		this.city = city;
		this.order_category = order_category;
		this.order_qty = order_qty;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOrder_price() {
		return order_price;
	}
	public void setOrder_price(int order_price) {
		this.order_price = order_price;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getOrder_category() {
		return order_category;
	}
	public void setOrder_category(String order_category) {
		this.order_category = order_category;
	}
	public int getOrder_qty() {
		return order_qty;
	}
	public void setOrder_qty(int order_qty) {
		this.order_qty = order_qty;
	}
	@Override
	public String toString() {
		return "Ecommerce [order_id=" + order_id + ", name=" + name + ", order_price=" + order_price + ", month="
				+ month + ", year=" + year + ", city=" + city + ", order_category=" + order_category + ", order_qty="
				+ order_qty + "]";
	}
	
	
}
public class Exp1 {

	public static void highestOrders(List<Ecommerce>ecomlist)
	{
		/*DoubleSummaryStatistics highOrders= 
				ecomlist.stream()
                .collect(Collectors.summarizingDouble(Ecommerce :: getOrder_qty));
		System.out.println("Highest Orders");
		System.out.println(highOrders.getMax());*/
		Map<Integer,Optional<Ecommerce>> cnt=ecomlist.stream().
	             collect(Collectors.groupingBy(Ecommerce :: getYear,
	            		 Collectors.maxBy(Comparator.comparing(Ecommerce ::getOrder_qty))));
		cnt.forEach((k,v)->System.out.println(k+" -->"+v));
	
	}
	public static void catgWise(List<Ecommerce>ecomlist)
	{
		Map<String, Long> result= ecomlist.stream()
                .collect(Collectors.groupingBy(Ecommerce :: getOrder_category,
              		  Collectors.counting()));
		result.forEach((k,v)->System.out.println(k+" -->"+v));
	}
	public static void maxPrice(List<Ecommerce>ecomlist)
	{
	DoubleSummaryStatistics ecomprice= 
	ecomlist.stream()
    .collect(Collectors.summarizingDouble(Ecommerce :: getOrder_price));
	System.out.println("Maximum price: "+ecomprice.getMax());
	}
	public static void monthAvg(List<Ecommerce>ecomlist) {
		Map<String, Double> result= ecomlist.stream()
                .collect(Collectors.groupingBy(Ecommerce :: getMonth,
                		Collectors.averagingDouble((Ecommerce ::getOrder_price))));
		result.forEach((k,v)->System.out.println(k+" -->"+v));
	}
	
	public static void minPrice(List<Ecommerce>ecomlist)
	{
	DoubleSummaryStatistics ecomprice= 
	ecomlist.stream()
    .collect(Collectors.summarizingDouble(Ecommerce :: getOrder_price));
	System.out.println("Minimum price: "+ecomprice.getMin());
	}
	
	public static void firstOrder(List<Ecommerce>ecomlist)
	{
		Optional<Ecommerce> frstOrder=
				ecomlist.stream()
				.sorted(Comparator.comparing(Ecommerce :: getOrder_id))
				.findFirst();
		Ecommerce ecom=frstOrder.get();
		System.out.println("First order");
		System.out.println("================");
		System.out.println("Name: "+ecom.getName());
		System.out.println("City: "+ecom.getCity());
		System.out.println("Month: "+ecom.getMonth());
		System.out.println("Year: "+ecom.getYear());
		System.out.println("Order Category: "+ecom.getOrder_category());
		System.out.println("Order price: "+ecom.getOrder_price());
		System.out.println("================");


	}
	public static void main(String[] args) {
	    List<Ecommerce> ecomlist=new ArrayList<Ecommerce>();
	    
	    ecomlist.add(new Ecommerce(1101,"Rohith",230,"March",2021,"Chennai","Daily Essentials",2));
	    ecomlist.add(new Ecommerce(1201,"Sita",530,"May",2019,"Hyderabad","Clothing",5));
	    ecomlist.add(new Ecommerce(1111,"Rahul",790,"April",2022,"Kochi","Food",3));
	    ecomlist.add(new Ecommerce(1121,"Sheela",330,"June",2023,"Banglore","Beverages",12));
	    ecomlist.add(new Ecommerce(1321,"Kohli",222,"Sept",2011,"pune","Electronics",5));
	    ecomlist.add(new Ecommerce(1222,"Ram",111,"July",2020,"Chennai","Beauty Products",12));
	    ecomlist.add(new Ecommerce(1122,"Jaisawal",1122,"Oct",2022,"Delhi","Books",13));
	    ecomlist.add(new Ecommerce(1231,"Gita",217,"Feb",2024,"Hyderabad","Daily Essentials",11));
	    ecomlist.add(new Ecommerce(1223,"Deepak",312,"Aug",2021,"Lahore","Clothing",6));
	    ecomlist.add(new Ecommerce(1199,"Leela",333,"Nov",2022,"Pune","Hair products",2));
	    ecomlist.add(new Ecommerce(1065,"Pandey",343,"Jan",2018,"Bihar","Furniture",3));
	    ecomlist.add(new Ecommerce(1001,"Varsha",555,"Dec",2017,"Jammu","Decors",8));
	    ecomlist.add(new Ecommerce(1021,"Dhoni",1555,"May",2015,"Gujarat","Medicines",9));
	    ecomlist.add(new Ecommerce(1023,"Aarthi",1666,"March",2018,"Mumbai","Clothing",15));
	    ecomlist.add(new Ecommerce(1104,"Rohan",1230,"April",2025,"Banglore","Food",9));
	    ecomlist.add(new Ecommerce(1006,"SVR",1750,"Oct",2016,"Hyderabad","Beverages",13));

	    Exp1.highestOrders(ecomlist);
	    Exp1.catgWise(ecomlist);
	    Exp1.maxPrice(ecomlist);
	    Exp1.monthAvg(ecomlist);
	    Exp1.minPrice(ecomlist);
	    Exp1.firstOrder(ecomlist);
	    
	}
}
