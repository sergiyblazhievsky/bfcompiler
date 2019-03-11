package operator;

import cell.MemoryCells;

public class OperatorPlus
    implements Operator
{
    @Override
    public void execute(MemoryCells cells)
    {
        cells.setCurrentCell(cells.getCurrentCell() + 1);
    }
}
