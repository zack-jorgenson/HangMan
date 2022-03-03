import acm.graphics.GLabel;

import java.awt.*;

public class Letter extends GLabel {
    String letter;
    public Letter(String letter){
        super(letter);
        this.letter = letter;
        this.setFont(new Font("FONT",1,25));
    }
    public String getLetter(){
        return letter;
    }
}
