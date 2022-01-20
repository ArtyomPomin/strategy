public class Cook {

    private Menu ListOfFood = null;

    public void setStrategy(Menu food) {
        this.ListOfFood = food;
    }

    public void paint() {
        if (ListOfFood == null) {
            System.out.println("Cooking something");
        } else {
            ListOfFood.cook();

        }
    }
}