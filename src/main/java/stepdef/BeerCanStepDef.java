package stepdef;

import io.cucumber.java.en.Given;

public class BeerCanStepDef {
    private int beerNum;
    private int count;

    @Given("I have <opening balance> beer cans")
    public void iHaveOpeningBalanceBeerCans() {
        beerNum = 10;
        count = beerNum;
        System.out.println("opening balance = " + " "+ count + "beer cans");

    }
    @io.cucumber.java.en.And("I have drunk <processed> beer cans")
    public void i_have_drunk_processed_beer_cans() {
        count = beerNum - 5;
        System.out.println("processed = " + " "+ count + "beer cans");

    }
    @io.cucumber.java.en.When("I go to my fridge")
    public void i_go_to_my_fridge() {
        System.out.println("I go to my fridge");
          }
    @io.cucumber.java.en.Then("I should have <in stock> beer cans")
    public void i_should_have_in_stock_beer_cans() {
        count = beerNum;
        System.out.println("in stock = " + " "+ count + "beer cans");
           }
}
