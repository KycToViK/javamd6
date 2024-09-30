public class Cat extends Animal{
    @Override
    public String say() {
        super.word = "meow";
        return super.say();
    }
}
