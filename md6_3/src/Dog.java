public class Dog extends Animal{

    @Override
    public String say() {
        super.word = "woof";
        return super.say();
    }
}
