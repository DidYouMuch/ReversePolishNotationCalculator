package me.didyoumuch.calculator.operation.imp;

import me.didyoumuch.calculator.operation.AbstractOperation;

public class SubOperation extends AbstractOperation {
    public SubOperation() {
        super('-');
    }

    @Override
    public int get(int a, int b) {
        return a - b;
    }
}
