package operator;

import cell.MemoryCells;

public class OperatorPrev
    implements Operator
{
    @Override
    public void execute(MemoryCells cells)
    {
        cells.setPointer(cells.getPointer() - 1);
    }
}
