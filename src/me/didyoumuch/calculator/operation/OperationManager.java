package me.didyoumuch.calculator.operation;

import me.didyoumuch.calculator.operation.imp.AddOperation;
import me.didyoumuch.calculator.operation.imp.DivOperation;
import me.didyoumuch.calculator.operation.imp.MulOperation;
import me.didyoumuch.calculator.operation.imp.SubOperation;

import java.util.ArrayList;

public class OperationManager {
    private ArrayList<AbstractOperation> operations;
    public OperationManager(){
        this.operations = new ArrayList<>();

        this.operations.add(new AddOperation());
        this.operations.add(new SubOperation());
        this.operations.add(new DivOperation());
        this.operations.add(new MulOperation());
    }

    public AbstractOperation getByChar(char oop){
        for (AbstractOperation op : this.operations){
            if(op.getCharacter() == oop){
                return op;
            }
        }
        return null;
    }
}
