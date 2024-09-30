public class Bird extends Animal{
    @Override
    public String say() {
        super.word = "tweet";
        return super.say();
    }
}
