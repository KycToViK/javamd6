public class VegetarianSoup extends SoupBase {
    double vegetables;

    public VegetarianSoup(SoupBase soupBase, double salt) {
        super(soupBase.water, salt);
    }

    public VegetarianSoup(double water, double salt, double vegetables) {
        super(water, salt);
        this.vegetables = vegetables;
    }

    // реализуйте необходимые конструкторы

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты вегетарианского супа:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Овощи: " + vegetables + " г.");
    }
}