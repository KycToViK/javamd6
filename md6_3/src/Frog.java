public class Frog extends Animal{
    @Override
    public String say() {
        super.word = "croak";
        return super.say();
    }
}
