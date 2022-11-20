package me.didyoumuch.calculator.operation.imp;

import me.didyoumuch.calculator.operation.AbstractOperation;

public class DivOperation extends AbstractOperation {
    public DivOperation() {
        super('/');
    }

    @Override
    public int get(int a, int b) {
        return a/b;
    }
}
