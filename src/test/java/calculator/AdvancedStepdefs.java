package calculator;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AdvancedStepdefs {
    private AdvancedCalculator calculator;
    private int value1;
    private int value2;
    private float result;

    @Before
    public void before() {
        calculator = new AdvancedCalculator();
    }

    @Given("Two integer input values, {int} and {int}")
    public void twoIntegerInputValuesFirstAndSecond(int first, int second) {
        value1 = first;
        value2 = second;
    }

    @ParameterType("[\\*\\/\\^]")
    public char operation(String operation) {
        if (operation.length() != 1)
            throw new IllegalArgumentException("Invalid operation");

        return operation.charAt(0);
    }

    @When("I apply the operation {operation} to the two values")
    public void iApplyTheOperationOperationToTheTwoValues(char operation) {
        result = calculator.applyOperator(value1, value2, operation);
    }

    @Then("I expect the {float}")
    public void iExpectTheResultResult(float result) {
        Assert.assertEquals(result, this.result, 0);
    }
}
