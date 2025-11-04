package steps;
import org.example.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSteps {
    int result; // Global result var
    Calculator calculator; // Object testing

    //BDD logic derived from Gherkin
    @Given("I have a calculator")
    public void i_have_calculator(){
        calculator = new Calculator();
        System.out.println("Caclulator Initialized");
    }

    @When("I add {int} and {int}")
    public void i_add_and(int num1, int num2){
        result = calculator.add(num1,num2);
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expected){
        assertEquals(expected,result);
    }
}
