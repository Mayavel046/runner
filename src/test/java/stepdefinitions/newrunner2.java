package stepdefinitions;

import java.io.IOException;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.AdactinRunner;

public class newrunner2 extends AdactinRunner{
	
	
	@Before("@login")
	public void login() {

		System.out.println("Login");
}
	@Before("@searching")
	public void search_hotel() {
		System.out.println("Searching the Hotel");
	}
	
	@Before("@booking")
	public void book_hotel() {
		System.out.println("Booking the Hotel");
	}
	@Before("@itinerary")
	public void itinerary() {
		System.out.println("My Itinerary");
	}
	
	@Given("^user navigate the login page$")
	public void user_navigate_the_login_page() throws IOException{
	   getDriver();
	   getproperties();
	   getul(url);
	   implicitwait(30);
	   
	   
	}

	@When("^user enter the valid username and password$")
	public void user_enter_the_valid_username_and_password(){
		pagefactory();
		senkeys(username, user);
		senkeys(password, pass);
		
	}

	@Then("^Then clicks the lgin button$")
	public void then_clicks_the_lgin_button() {
	    click(login);
	}

//	@Given("^check the user search hotel page$")
//	public void check_the_user_search_hotel_page() throws Throwable {
//		checkpage(url1);
//	}

	@When("^User select the location in location Field$")
	public void user_select_the_location_in_location_Field(){
	    dropdown(location, "Melbourne");
	}

	@When("^User select the Hotel in Hotel Field$")
	public void user_select_the_Hotel_in_Hotel_Field() throws Throwable {
		dropdown(hotelname, "Hotel Sunshine");
	}

	@When("^User select the room type in room type Field$")
	public void user_select_the_room_type_in_room_type_Field(){
	   dropdown(roomtype, "Double");
	}

	@When("^User select the Number of Rooms in Number of Rooms Field$")
	public void user_select_the_Number_of_Rooms_in_Number_of_Rooms_Field() {
	 dropdown(roomnos, "4");
	}

	@When("^User select the Check in date in Check in date Field$")
	public void user_select_the_Check_in_date_in_Check_in_date_Field(){
	senkeys(datein, "22/1/2022");   
		
	}

	@When("^User select the Check out date in Check out date Field$")
	public void user_select_the_Check_out_date_in_Check_out_date_Field() {
		senkeys(dateout, "25/1/2022");
	}

	@When("^User select the Adult per room in Adults per room Field$")
	public void user_select_the_Adult_per_room_in_Adults_per_room_Field(){
	 dropdown(aroom, "2");
	}

	@When("^User select the Childrens per room in Childrens per room Field$")
	public void user_select_the_Childrens_per_room_in_Childrens_per_room_Field(){
		dropdown(croom, "1");
	}

	@Then("^clicks the Search Button$")
	public void clicks_the_Search_Button(){
	    click(submit);
	}

	@Then("^clicks Hotels deatils radio button$")
	public void clicks_Hotels_deatils_radio_button(){
	    click(select_booking);
	}

	@Then("^clicks the continue button$")
	public void clicks_the_continue_button(){
	    click(Continue);
	}

//	@Given("^check the user book a Hotel page$")
//	public void check_the_user_book_a_Hotel_page() throws Throwable {
//		checkpage(url2);
//	}

	@Given("^User enter the first and last name$")
	public void user_enter_the_first_and_last_name(){
		jscript(first_name);
	    senkeys(first_name, "Maya");
	    senkeys(last_name, "vel");
	}

	@When("^User enter the Adress$")
	public void user_enter_the_Adress() throws Throwable {
	    senkeys(address, Address);
	}

	@When("^User enter the Credit card deatils$")
	public void user_enter_the_Credit_card_deatils() {
		senkeys(creditcardnum, Card_no);
	}

	@When("^User enter the Credit card type$")
	public void user_enter_the_Credit_card_type() {
		dropdown(creditcardtype, ctype);
	}

	@When("^User Select Expiry month and Expiry Year$")
	public void user_Select_Expiry_month_and_Expiry_Year(){
	    dropdown(expmonth, Expiry_month);
	    dropdown(expyear, Expiry_year);
	}

	@When("User Enter the cvv number")
	public void user_Enter_the_cvv_number() {
		senkeys(cvv,cvv1);
	}

	

	@Then("^clicks the booknow Button$")
	public void clicks_the_booknow_Button(){
	    click(book);
	}

	@Then("^Clicks the itinerary Button$")
	public void clicks_the_itinerary_Button(){
	    click(myit);
	}

//	@Given("^Check the user in booked Itinerary page$")
//	public void check_the_user_in_booked_Itinerary_page() throws Throwable {
//	    checkpage(url3);
//	}

    @When("^User take the screenshot for booking details$")
	public void user_take_the_screenshot_for_booking_details() throws Throwable {
	screenshot("Book");
	}
	
	@Then("^User select the unwanted Booked details$")
	public void User_select_the_unwanted_Booked_details(){
	    click(cancelhotel);
	}

	@Then("^Clicks the cancel selected$")
	public void clicks_the_cancel_selected() throws Throwable {
	    jscript(cancelselected);
	    click(cancelselected);
	    confirm_alert();
	    
		
	}

	@Then("^user Take the Screenshot for cancelled selected$")
	public void user_Take_the_Screenshot_for_cancelled_selected() throws Throwable {
		screenshot("Book");
	}

	@Then("^clicks the logout button$")
	public void clicks_the_logout_button(){
	    click(logout);
	    close();
	}
	

}
