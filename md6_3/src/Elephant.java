public class Elephant extends Animal{
    @Override
    public String say() {
        super.word = "toot";
        return super.say();
    }
}
