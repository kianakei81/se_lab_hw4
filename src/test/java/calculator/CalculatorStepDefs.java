package calculator;

import static org.junit.Assert.*;

import io.cucumber.java.en.*;

public class CalculatorStepDefs {
    private double operand1;
    private double operand2;
    private String operator;
    private String result;

    @Given("the first operand is {double}")
    public void theFirstOperandIs(double operand1) {
        this.operand1 = operand1;
    }

    @And("the second operand is {double}")
    public void theSecondOperandIs(double operand2) {
        this.operand2 = operand2;
    }

    @And("the operator is {string}")
    public void theOperatorIs(String operator) {
        this.operator = operator;
    }

    @When("the calculation is performed")
    public void theCalculationIsPerformed() {
        try {
            result = String.valueOf(Calculator.calculate(operand1, operand2, operator));
        } catch (IllegalArgumentException e) {
            result = "error";
        }
    }

    @Then("the result should be {string}")
    public void theResultShouldBe(String expectedResult) {
        assertEquals(expectedResult, result);
    }
}