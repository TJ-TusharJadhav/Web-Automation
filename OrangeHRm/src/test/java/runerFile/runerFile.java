package runerFile;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		dryRun=true,
//		monochrome = true,
//		features =  {"feature\\add_employee_personal_Details.feature"},
				features =  {"feature\\Add_Employee.feature"},
		
//		features =  {"feature"},
//		tags="@Login1",
        glue={"StepDefination"}	,
//      
        plugin= {"pretty", "html:target/cucumber-reports","html:target/cucumber-html-report"}
		
		
		
        
         )
public class runerFile {

	

}
