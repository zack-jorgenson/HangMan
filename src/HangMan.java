import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Locale;

public class HangMan extends GraphicsProgram {
    @Override
    public void init(){
        String[] words = {"sock","agony","conflict","thirsty","realism","split","tape","feather","order","evening","eaux","theme","reception","launch","expertise","combine","venus","circumstance","element","surround","belt","average","block","legislation","myth","to","president","church","arrangement","waste","halt","twist","trait","nervous","pat","tired","braid","draw","defeat","witch","disagreement","bullet","precede","mark","advice","ditch","blast","tower","hostile","wilderness"};
        Man man = new Man(40,160);
        add(man,155,125);
        add(new Hanger(100,200),100,100);
        String w = words[RandomGenerator.getInstance().nextInt(0,words.length-1)].toUpperCase(Locale.ROOT);
        Word word = new Word(w);
        add(word,300,300);
        addKeyListeners(new Listener(word, man));
        while (true){
            pause(1);
            if(man.lost||word.won){
                pause(1000);
                System.exit(1);
            }
        }
    }
    public static void main(String[] args) {
        new HangMan().start();
    }
}
