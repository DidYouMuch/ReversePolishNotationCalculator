package me.didyoumuch.calculator.operation;

public abstract class AbstractOperation {
    private char character;
    public AbstractOperation(char character){
        this.character = character;
    }

    public char getCharacter() {
        return character;
    }

    public abstract int get(int a, int b);
}
