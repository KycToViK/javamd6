public class Duck extends Animal{
    @Override
    public String say() {
        super.word = "quack";
        return super.say();
    }
}
