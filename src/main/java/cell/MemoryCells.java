package cell;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MemoryCells
{
    private static final Integer       MEMORY_SIZE = 50;
    private              List<Integer> cells       = new ArrayList<>();
    private              int           pointer     = 0;

    public MemoryCells()
    {
        cells = Stream.generate(() -> 0).limit(MEMORY_SIZE).collect(toList());
    }

    public Integer getCurrentCell()
    {
        return cells.get(pointer);
    }

    public void setCurrentCell(Integer value)
    {
        cells.set(pointer, value);
    }

    public int getPointer()
    {
        return pointer;
    }

    public void setPointer(int pointer)
    {
        this.pointer = pointer;
    }
}
