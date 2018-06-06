package Runner;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Parag\\cucumberproject\\git\\cucumberproject\\src\\main\\java\\Features", //the path of the feature files
		glue={"C:\\Users\\Parag\\cucumberproject\\git\\cucumberproject\\src\\main\\java\\stepDefinations"}		
		)
public class TestRunner 
{

}
