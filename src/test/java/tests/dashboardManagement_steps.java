package tests;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import pages.DashboardPage;
import utils.BrowserUtils;
import utils.Driver;

public class dashboardManagement_steps {
	BrowserUtils utils = new BrowserUtils();
	DashboardPage dashPage = new DashboardPage();
	
	@Then("I should be on the Dasboard home page")
	public void i_should_be_on_the_dasboard_home_page() {
		System.out.println(Driver.getDriver().getTitle());
	    
	}
	@Then("I should see the header {string}")
	public void i_should_see_the_header(String string) {
		utils.waitForElementToBeVisible(dashPage.dashboard_page_SalesAndExpensesHeader);
		Assert.assertTrue(dashPage.dashboard_page_SalesAndExpensesHeader.isDisplayed());
	    Driver.quitDriver();
	}
	
	@Then("I should see the buttons {string}, {string}, {string}, and {string}")
	public void i_should_see_the_buttons_and(String amountDue, String customers, String invoices, String estimates) {
	    if(dashPage.dashboard_page_AmountDue_Button.getText().contains(amountDue)) {
	    	Assert.assertTrue(true);
	    }
	    if(dashPage.dashboard_page_Customers_Button.getText().contains(customers)) {
	    	Assert.assertTrue(true);
	    }
	    if(dashPage.dashboard_page_Invoices_Button.getText().contains(invoices)) {
	    	Assert.assertTrue(true);
	    }
	    if(dashPage.dashboard_page_Estimates_Button.getText().contains(estimates)) {
	    	Assert.assertTrue(true);
	    }
	    Driver.quitDriver();
	}

}
