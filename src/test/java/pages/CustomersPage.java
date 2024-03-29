package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class CustomersPage {
	
	public CustomersPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy (xpath = "//h3[text()='Customers']")// to grab the element "Customers" in the page
	public WebElement customer_page_Customers_TextHeader;

	@FindBy (xpath = "//button[text()=' New Customer']")//to locate the "New Customer" button
	public WebElement customer_page_NewCustomerBTN;

	@FindBy (xpath = "//h6[text()='Basic Info']") //to locate the "basic info" on the page
	public WebElement customer_page_BasicInfo_Form_Label;

	@FindBy (xpath = "//h3[text()='New Customer']") //to locate the "New Customer" on the page
	public WebElement customer_page_NewCustomer_TextHeader;

	@FindBy (xpath = "(//input[@name='name'])[1]")//to locate Display name box on Basic info page
	public WebElement customer_page_BasicInfo_DisplayName_Field;
	
    //a lot of mess here you need to go to the video or ask about this next one
	@FindBy (xpath = "(//div[@class='relative rounded-md shadow-sm font-base']/input)[2]")
	public WebElement customer_page_BasicInfo_PrimaryContactName_Field;

	@FindBy (xpath = "(//input[@name='phone'])[1]")
	public WebElement customer_page_BasicInfo_Phone_Field;

	@FindBy (xpath = "(//div//child::input[@type='text'])[6]")
	public WebElement customer_page_BasicInfo_PrimaryCurrency_Field;

	@FindBy (xpath = "//input[@name='email']")
	public WebElement customer_page_BasicInfo_Email_Field;

	@FindBy (xpath = "//input[@type='url']")
	public WebElement customer_page_BasicInfo_Website_Field;

	@FindBy (xpath = "(//input[@name='name'])[2]")
	public WebElement customer_page_BasicInfo_Prefix_Field;

	@FindBy (xpath = "//table")
	public WebElement customer_page_CustomerTable;

	@FindBy (xpath = "//label[text()='No customers yet!']")
	public WebElement customer_page_NoCustomersYet_text;

	@FindBy (xpath = "//button[@type='submit']")
	public WebElement customer_page_NewCustomerSubmit_BTN;
	
	@FindBy (xpath = "//th[contains(text(), 'Name')]")
	public WebElement customer_page_customerTable_Name_Column;

	@FindBy (xpath = "//th[contains(text(), 'Phone')]")
	public WebElement customer_page_customerTable_Phone_Column;

	@FindBy (xpath = "//th[contains(text(), 'Amount Due')]")
	public WebElement customer_page_customerTable_AmountDue_Column;

	@FindBy (xpath = "//th[contains(text(), 'Added On')]")
	public WebElement customer_page_customerTable_AddedOn_Column;

	@FindBy (xpath = "(//button[contains(@id, 'headlessui')])[3]")
	public WebElement customer_page_customerTable_3dotMoreLink;

	@FindBy (xpath = "//a[text()=' Edit']")
	public WebElement customer_page_customerTable_3dotMoreLink_Edit;

	@FindBy (xpath = "//a[text()=' View']")
	public WebElement customer_page_customerTable_3dotMoreLink_View;

	@FindBy (xpath = "//a[text()=' Delete']")
	public WebElement customer_page_customerTable_3dotMoreLink_Delete;

	@FindBy (xpath = "//p[text()='Customer created successfully']")
	public WebElement customer_page_newCustomer_Success_Message;

	@FindBy (xpath = "(//button[contains(@id, 'headlessui')])[4]")
	public WebElement customer_page_newCustomer_3dotMoreLink;

	@FindBy (xpath = "//button[text()='Ok']")
	public WebElement customer_page_customerTable_3dotMoreLink_Delete_OK_BTN;

	@FindBy (xpath = "//span[text()='Field is required']")
	public WebElement customer_page_newCustomer_FieldIsRequired_Error_Message;
	
	@FindBy (xpath = "(//div[text()='Select Country'])[1]")
	public WebElement customer_page_newCustomer_Billing_CountryField;

	@FindBy (xpath = "(//input[@name='address_name'])[1]")
	public WebElement customer_page_newCustomer_Billing_NameField;

	@FindBy (xpath = "//input[@name='billing.state']")
	public WebElement customer_page_newCustomer_Billing_StateField;

	@FindBy (xpath = "//input[@name=\'billing.city\']")
	public WebElement customer_page_newCustomer_Billing_CityField;

	@FindBy (xpath = "(//input[@name=\"zip\"])[1]")
	public WebElement customer_page_newCustomer_Billing_ZipcodeField;

	@FindBy (xpath = "//button[text()=' Copy from Billing']")
	public WebElement customer_page_newCustomer_CopyFromBillingBTN;

	@FindBy (xpath = "//input[@name='address_name']")
	public WebElement customer_page_newCustomer_Shipping_NameField;

	@FindBy (xpath = "(//input[@type='text']//following-sibling::div[text()='Select Country'])[1]")
	public WebElement customer_page_newCustomer_Billing_CountryDropDown;

	@FindBy (xpath = "(//span[text()='United States'])[1]")
	public WebElement customer_page_newCustomer_Billing_CountryDropDown_UnitedStates;

	@FindBy (xpath = "//h6[text()=' Sales & Expenses']")
	public WebElement customer_page_Sales_and_Expenses_header;
	
    //in this last step the requirement said that we need to put 3 times wrong data and instead of going and grab
	//each xpath individually for 3 times we could save time and grab them all at once like bellow. 
	@FindBy (xpath = "//span[text()='Name must have at least 3 letters.'] | //span[text()='Field is required'] | //span[text()='Incorrect Email.']")
	public List<WebElement> customer_page_NewCustomer_nameEmail_ErrorMessages;
	
}
