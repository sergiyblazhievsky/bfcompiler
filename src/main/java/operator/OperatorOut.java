package operator;

import cell.MemoryCells;

public class OperatorOut
    implements Operator
{
    @Override
    public void execute(MemoryCells cells)
    {
        System.out.println(Character.toChars(cells.getCurrentCell()));
    }
}
