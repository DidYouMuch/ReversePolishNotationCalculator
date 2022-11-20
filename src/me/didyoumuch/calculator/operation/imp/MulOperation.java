package me.didyoumuch.calculator.operation.imp;

import me.didyoumuch.calculator.operation.AbstractOperation;

public class MulOperation extends AbstractOperation {
    public MulOperation() {
        super('*');
    }

    @Override
    public int get(int a, int b) {
        return a*b;
    }
}
