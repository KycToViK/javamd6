public class Mouse extends Animal{
    @Override
    public String say() {
        super.word = "squeek";
        return super.say();
    }
}
