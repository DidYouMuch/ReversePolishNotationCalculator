package me.didyoumuch.calculator.operation.imp;

import me.didyoumuch.calculator.operation.AbstractOperation;

public class AddOperation extends AbstractOperation {
    public AddOperation() {
        super('+');
    }

    @Override
    public int get(int a, int b) {
        return a+b;
    }
}
