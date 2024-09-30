public class Fish extends Animal{
    @Override
    public String say() {
        super.word = "blub";
        return super.say();
    }
}
