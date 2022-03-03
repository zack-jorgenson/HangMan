import acm.graphics.GCompound;

public class Space extends GCompound {
    public Letter letter;
    public Space(String letter){
        this.letter = new Letter(letter);
        add(this.letter,15-this.letter.getWidth()/2,0);
        this.letter.setVisible(false);
        add(new Underscore(30,4),0,4);
    }
    public void showLetter(String letter){
        if(letter.equals(this.letter.getLetter())){
            this.letter.setVisible(true);
        }
    }
}
