package Models;


public class Card {
    //Tha Value that appears when a card flipped
    private final int value;
    private boolean flipped;
    private  boolean matched;


    public Card(int value){
        this.value = value;
        this.flipped = false;
        this.matched = false;

    }

    public int getValue(){
        return value;
    }

    public boolean isFlipped() {
        return flipped;
    }

    public boolean isMatched() {
        return matched;
    }

    public void setFlipped(boolean flipped) {
        this.flipped = flipped;
    }

    public void setMatched(boolean matched) {
        this.matched = matched;
    }
}
