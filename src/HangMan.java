import acm.program.GraphicsProgram;

public class HangMan extends GraphicsProgram {
    @Override
    public void init(){
        add(new Hanger(100,200),100,100);
    }
    public static void main(String[] args) {
        new HangMan().start();
    }
}
