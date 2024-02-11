package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//when we run this code it will be with junit, so the explaination is the cucumber class will RunWith JUnit and it will
//go locate the features file glue it to test package where the UserManagement_steps are and filter through it to get
//the tag that we want to run

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/resources/features",//we put ./src...etc because we are inside the TestRunner file and we
		                                         //we need to get out of the folder src/test/java to get to 
		                                         //src/test/resources/features
		glue="tests",     //here we put all our step definitions folders which are all in tests package 
		//tags="@invalidEmailLogin"//we want this scenario to be run so we bring the tag from cucumber file
		dryRun = true, //dryRun scans the whole features files and find unimplemented scenario steps if there is any
		              //when it's false, it just turns itself off and doesn't do anything 
		//tags = "createItem"
		//tags="@newCustomerBTNTest"
		//tags="@newCustomerBasicInfoFormLabel"
		//tags="@newCustomerBasicInfoFields"
		//tags="@editItem"
		//tags="@customerTableColumns"
		//tags="@customerTableMoreOptions"
		//tags="@newCustomerCreatedMessage"
		//tags="@newCustomerInvalidNoInfo"
		//tags="@newCustomers"
		//tags="@newCustomerFormErrorMessages"
		//tags="@SalesandExpensesHeader"
		//tags="@dashboardButtons"
		tags="@dashboardHeaders"
		)

public class DryRunner {

}
