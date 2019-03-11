package operator;

import cell.MemoryCells;

public interface Operator
{
    public static final String OPERATOR_CYCLE_START = "[";
    public static final String OPERATOR_CYCLE_END   = "]";
    public static final String OPERATOR_MINUS       = "-";
    public static final String OPERATOR_PLUS        = "+";
    public static final String OPERATOR_NEXT        = ">";
    public static final String OPERATOR_PREV        = "<";
    public static final String OPERATOR_OUT         = ".";
    public static final int    OPERATOR_LENGTH      = 1;

    void execute(MemoryCells cells);

    default int getCountInnerOperators()
    {
        return OPERATOR_LENGTH;
    }
}
