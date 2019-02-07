package steps;

import com.example.myapplication.R;
import com.mauriciotogneri.greencoffee.GreenCoffeeSteps;
import com.mauriciotogneri.greencoffee.annotations.Given;
import com.mauriciotogneri.greencoffee.annotations.Then;
import com.mauriciotogneri.greencoffee.annotations.When;

public class UserRegisterSteps extends GreenCoffeeSteps {
    @Given("^I see an empty registration form$")
    public void i_see_an_empty_registration_form() {
        onViewWithId(R.id.editTextEmail).isEmpty();
        onViewWithId(R.id.editTextName).isEmpty();
        onViewWithId(R.id.editTextAge).isEmpty();
        onViewWithId(R.id.editTextPassword).isEmpty();
        onViewWithId(R.id.editTextPasswordVerification).isEmpty();
    }

    @When("^i introduced as email \"([^\"]*)\"$")
    public void i_introduced_as_email(String arg1) {
        onViewWithId(R.id.editTextEmail).type(arg1);
        closeKeyboard();
    }

    @When("^i introduced as name \"([^\"]*)\"$")
    public void i_introduced_as_name(String arg1) {
        onViewWithId(R.id.editTextName).type(arg1);
        closeKeyboard();
    }

    @When("^i intruducced as username \"([^\"]*)\"$")
    public void i_intruducced_as_username(String arg1) {
        onViewWithId(R.id.editTextUsername).type(arg1);
        closeKeyboard();
    }

    @When("^i introduced as password \"([^\"]*)\"$")
    public void i_introduced_as_password(String arg1) {
        onViewWithId(R.id.editTextPassword).type(arg1);
        closeKeyboard();
    }

    @When("^i introduced an invalid verification password \"([^\"]*)\"$")
    public void i_introduced_an_invalid_verification_password(String arg1) {
        onViewWithId(R.id.editTextPasswordVerification).type(arg1);
        closeKeyboard();
    }

    @When("^i click on the Sign up button$")
    public void i_click_on_the_Sign_up_button() {
        waitFor(1000);
        onViewWithId(R.id.buttonSignUp).click();
    }

    @Then("^I see an error message saying 'Password and password validation should match'$")
    public void i_see_an_error_message_saying_Password_and_password_validation_should_match() {
        onViewWithText(string(R.string.passwordMismatch)).isDisplayed();
        onViewWithText("Password and password validation should match").isDisplayed();
    }

    @When("^i introduced an invalid email \"([^\"]*)\"$")
    public void i_introduced_an_invalid_email(String arg1) {
        onViewWithId(R.id.editTextEmail).type(arg1);
        closeKeyboard();
    }

    @When("^i introduced as verification password \"([^\"]*)\"$")
    public void i_introduced_as_verification_password(String arg1) {
        onViewWithId(R.id.editTextPasswordVerification).type(arg1);
        closeKeyboard();
    }

    @Then("^I see an error message saying 'Invalid email\\. The email should be of type email@domain\\.com'$")
    public void i_see_an_error_message_saying_Invalid_email_The_email_should_be_of_type_email_domain_com() {
        onViewWithText(string(R.string.invalidEmail)).isDisplayed();
        onViewWithText("Invalid email. The email should be of type email@domain.com").isDisplayed();
    }


    @Then("^I see an error message saying 'Please fill all the fields' $")
    public void i_see_an_error_message_saying_Please_fill_all_the_fields() {
        onViewWithText(string(R.string.emptyFields)).isDisplayed();
        onViewWithText("Please fill all the fields").isDisplayed();
    }

    @When("^i introduced an used email \"([^\"]*)\"$")
    public void i_introduced_an_used_email(String arg1) {
        onViewWithId(R.id.editTextEmail).type(arg1);
        closeKeyboard();
    }

    @Then("^I see an error message saying 'This email is already in use\\. Please verify your email field'$")
    public void i_see_an_error_message_saying_This_email_is_already_in_use_Please_verify_your_email_field() {
        waitFor(1000);
        onViewWithText(string(R.string.emailAlreadyUsed)).isDisplayed();
        onViewWithText("This email is already in use. Please verify your email field").isDisplayed();
    }

    @Then("^I see an error message saying 'This username is already in use\\. Please verify your username field'$")
    public void i_see_an_error_message_saying_This_username_is_already_in_use_Please_verify_your_username_field() {
        waitFor(1000);
        onViewWithText(string(R.string.usernameAlreadyUsed)).isDisplayed();
        onViewWithText("This username is already in use. Please verify your username field'").isDisplayed();
    }

    @When("^i click on the Login textView$")
    public void i_click_on_the_Login_textView() {
        onViewWithId(R.id.textViewLogin).click();
    }

    @Then("^i see the LoginActivity$")
    public void i_see_the_LoginActivity() {
        waitFor(1000);
        onViewWithId(R.id.textViewSignup).isDisplayed();
    }

    @Then("^I see the DashboardActivity$")
    public void i_see_the_DashboardActivity() {
        waitFor(1000);
        onViewWithText("My Dashboard").isDisplayed();
    }

}
