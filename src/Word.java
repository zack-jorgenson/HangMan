import acm.graphics.GCompound;
import acm.util.RandomGenerator;
public class Word extends GCompound{
    private Space[] spaces;
    private String word;
    private String chars = "";
    public boolean won = false;
    public Word(String word){
        Space[] spaces = new Space[word.length()];
        for(int i = 0; i<word.length();i++){
            spaces[i]=new Space(String.valueOf(word.charAt(i)));
            add(spaces[i],spaces[i].getWidth()*1.5*i,0);
        }
        this.spaces = spaces;
        this.word = word;
    }
    public boolean showLetters(String letter){
        boolean won = true;
        if(chars.contains(letter)){
            return true;
        }
        chars = chars + letter;
        if(word.contains(letter)) {
            for (int i = 0; i < spaces.length; i++) {
                spaces[i].showLetter(letter);
                if(!spaces[i].letter.isVisible()){
                    won = false;
                }
            }
            this.won=won;
            return true;
        }
        add(new Letter(letter), RandomGenerator.getInstance().nextInt(-200, 200),RandomGenerator.getInstance().nextInt(30, 150));
        return false;
    }
}
