public class Cow extends Animal{
    @Override
    public String say() {
        super.word = "moo";
        return super.say();
    }
}
