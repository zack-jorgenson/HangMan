import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Locale;

public class Listener implements KeyListener {
    private Word word;
    private Man man;
    public Listener(Word word, Man man){
        this.man = man;
        this.word = word;
    }
    @Override
    public void keyTyped(KeyEvent e) {
        boolean win;
        win = word.showLetters(String.valueOf(e.getKeyChar()).toUpperCase(Locale.ROOT));
        if(!win){
            man.drawNext();
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
    }
    @Override
    public void keyReleased(KeyEvent e){
    }
}