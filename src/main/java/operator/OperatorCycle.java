package operator;

import cell.MemoryCells;

import java.util.ArrayList;
import java.util.List;

public class OperatorCycle
    implements Operator
{
    private List<Operator> innerOperators = new ArrayList<>();

    public OperatorCycle(String input)
    {
        while (input.indexOf(Operator.OPERATOR_CYCLE_END) != 0)
        {
            Operator op = OperatorFactory.getOperator(input);
            if (op instanceof OperatorCycle)
            {
                input = input.substring(((OperatorCycle) op).getCountInnerOperators());
            }
            innerOperators.add(op);
            input = input.substring(OPERATOR_LENGTH);
        }
    }

    @Override
    public void execute(MemoryCells cells)
    {
        while (cells.getCurrentCell() != 0)
        {
            innerOperators.stream().forEach(op -> op.execute(cells));
        }
    }

    public int getCountInnerOperators()
    {
        return innerOperators.stream().mapToInt(o -> o.getCountInnerOperators()).sum()
               + Operator.OPERATOR_CYCLE_START.length();
    }
}
