package runner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdactinPom {
	@FindBy(id ="username")
	public static WebElement username;
	
	@FindBy(id ="password")
	public static WebElement password;
	
	@FindBy(id ="login")
	public static WebElement login;
	
	@FindBy(className ="Welcome_menu")
	public static WebElement booking_page;
	
	@FindBy(id ="location")
	public static WebElement location;
	
	@FindBy(id ="hotels")
	public static WebElement hotelname;
	
	@FindBy(id ="room_type")
	public static WebElement roomtype;
	
	@FindBy(id ="room_nos")
	public static WebElement roomnos;
	
	@FindBy(id ="datepick_in")
	public static WebElement datein;
	
	@FindBy(id ="datepick_out")
	public static WebElement dateout;
	
	@FindBy(id ="adult_room")
	public static WebElement aroom;
	
	@FindBy(id ="child_room")
	public static WebElement croom;
	
	@FindBy(id ="Submit")
	public static WebElement submit;
	
	@FindBy(id ="radiobutton_0")
	public static WebElement select_booking;
	
	@FindBy(id ="continue")
	public static WebElement Continue;
	
	@FindBy(id ="first_name")
	public static WebElement first_name;
	
	@FindBy(id ="last_name")
	public static WebElement last_name;
	
	@FindBy(id ="address")
	public static WebElement address;
	
	@FindBy(id ="cc_num")
	public static WebElement creditcardnum;
	
	@FindBy(id ="cc_type")
	public static WebElement creditcardtype;
	
	@FindBy(id ="cc_exp_month")
	public static WebElement expmonth;
	
	@FindBy(id ="cc_exp_year")
	public static WebElement expyear;
	
	@FindBy(id ="cc_cvv")
	public static WebElement cvv;
	
	@FindBy(id ="book_now")
	public static WebElement book;
	
	@FindBy(id ="my_itinerary")
	public static WebElement myit;
	
	@FindBy(xpath ="//input[@name='ids[]'])[1]")
	public static WebElement cancelhotel;
	
	@FindBy(name ="cancelall")
	public static WebElement cancelselected;
	
	@FindBy(id ="logout")
	public static WebElement logout;
	
	}
