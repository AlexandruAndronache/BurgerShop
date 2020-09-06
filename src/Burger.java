public class Burger {

    private String bread;
    private String meat;
    private String vegetable;

    public String chooseBread(String breadFromBurger) {
        return breadFromBurger;
    }


    public void setBread(String breadChoice) {
        this.bread = breadChoice;
    }

    public String getBread() {
        return this.bread;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getVegetable() {
        return vegetable;
    }

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }

}
