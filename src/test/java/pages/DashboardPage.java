package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class DashboardPage {
	//we create this page to include the elements that are on the second page so we can call them 
	
	public DashboardPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (linkText = " Dashboard")//this is the first element located on the second page
	public WebElement dashboard_tab;
	
	@FindBy (xpath = "//a[text()=' Customers']")//this is the "Customers" icon on the second page
	public WebElement customers_tab;
	
	@FindBy (xpath = "//a[text()=' Items']")//this is the "Items" icon on the second page
	public WebElement items_tab;
	
	@FindBy (xpath = "//p[text()='Logged in successfully.']") //this is the message that appears once we login
	public WebElement loggedInSuccess_message;
	
	@FindBy (xpath = "//h6[text()=' Sales & Expenses']")      //to locate the Sales % Expenses title in the page
	public WebElement dashboard_page_SalesAndExpensesHeader; 
	
	@FindBy (xpath = "//span[text()='Amount Due']")
	public WebElement dashboard_page_AmountDue_Button;
	
	@FindBy (xpath = "//span[text()='Customers']")
	public WebElement dashboard_page_Customers_Button;
	
	@FindBy (xpath = "//span[text()='Invoices']")
	public WebElement dashboard_page_Invoices_Button;
	
	@FindBy (xpath = "//span[text()='Estimates']")
	public WebElement dashboard_page_Estimates_Button;
	
	@FindBy (xpath = "//h6[text()='Due Invoices']")
	public WebElement dashboard_page_DueInvoices_Header;
	
	@FindBy (xpath = "//h6[text()='Recent Estimates']")
	public WebElement dashboard_page_RecentEstimates_Header;
	
	@FindBy (xpath = "//canvas[@id='graph']")
	public WebElement dashboard_page_graph;
	
	@FindBy (xpath = "//div[@class='w-full my-2 md:m-0 md:w-40 h-10']")
	public WebElement dashboard_page_year_dropdown;
	
	@FindBy (xpath = "//span[text()='This year']")
	public WebElement dashboard_page_ThisYear_dropdown_option;
	
	@FindBy (xpath = "//span[text()='Previous year']")
	public WebElement dashboard_page_PreviousYear_dropdown_option;
}
