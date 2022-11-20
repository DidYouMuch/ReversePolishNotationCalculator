package me.didyoumuch.calculator;

import me.didyoumuch.calculator.operation.AbstractOperation;
import me.didyoumuch.calculator.operation.OperationManager;

import java.util.ArrayList;
import java.util.Stack;

public class Calculator {
    private String expression;
    private OperationManager operationManager;
    public Calculator(String expression){
        this.expression = expression;
        this.operationManager = new OperationManager();
    }

    public OperationManager getOperationManager() {
        return operationManager;
    }

    public int get(){
        String[] elements = this.expression.split(" ");
        Stack<Integer> stack = new Stack<>();
        for (int index = 0; index < elements.length; index++ ) {
            String current = elements[index];
            if (current.contains("+") || current.contains("-") || current.contains("*") || current.contains("/")) {
                int right = stack.pop();
                int left = stack.pop();
                AbstractOperation math = this.getOperationManager().getByChar(current.charAt(0));
                int result = math.get(left, right);
                stack.push(result);
            } else {
                stack.push(Integer.valueOf(current));
            }
        }
        return stack.pop();
    }
}
