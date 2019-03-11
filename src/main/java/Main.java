import cell.MemoryCells;
import operator.Operator;
import operator.OperatorFactory;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    private static List<Operator> program = new ArrayList<>();
    private static MemoryCells    cells   = new MemoryCells();

    public static void main(String[] args)
    {
        parse(args[0]);

        program.forEach(op -> op.execute(cells));
    }

    private static void parse(String input)
    {
        while (input.length() > 0)
        {
            Operator op = OperatorFactory.getOperator(input);
            program.add(op);
            if (input.indexOf(Operator.OPERATOR_CYCLE_START) == 0)
            {
                input = input.substring(op.getCountInnerOperators() + Operator.OPERATOR_CYCLE_START.length());
            }
            input = input.substring(Operator.OPERATOR_LENGTH);
        }
    }
}
