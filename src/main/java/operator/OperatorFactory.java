package operator;

import java.util.List;

public class OperatorFactory
{

    public static Operator getOperator(String input)
    {
        Operator result = null;
        if (input.indexOf(Operator.OPERATOR_PLUS) == 0)
        {
            result = new OperatorPlus();
        }
        if (input.indexOf(Operator.OPERATOR_MINUS) == 0)
        {
            result = new OperatorMinus();
        }
        if (input.indexOf(Operator.OPERATOR_NEXT) == 0)
        {
            result = new OperatorNext();
        }
        if (input.indexOf(Operator.OPERATOR_PREV) == 0)
        {
            result = new OperatorPrev();
        }
        if (input.indexOf(Operator.OPERATOR_OUT) == 0)
        {
            result = new OperatorOut();
        }
        if (input.indexOf(Operator.OPERATOR_CYCLE_START) == 0)
        {
            result = new OperatorCycle(input.substring(Operator.OPERATOR_CYCLE_START.length()));
        }
        return result;
    }
}
