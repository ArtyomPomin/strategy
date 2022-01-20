public class Editor {
    public static void main(String[] args) {
        Cook p = new Cook();
        p.paint();
        p.setStrategy(new CookSoup());
        p.paint();
        p.setStrategy(new CookMeat());
        p.paint();
        p.setStrategy(new CookDessert());
        p.paint();
        p.setStrategy(null);
        p.paint();
    }
}
