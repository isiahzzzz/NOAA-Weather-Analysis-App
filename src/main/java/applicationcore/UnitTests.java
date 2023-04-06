package applicationcore;

import datatypes.Record;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class UnitTests {

    /**
     * Test that checks continuity of mergeSort results against built in Java
     * sort algorithm.
     */
    @Test
    public void mergeSortValidation() {
        Database data = new Database("D:\\Development\\NOAAWeatherApp\\PortlandWeatherData.csv", null);
        data.JUnitTest = true;
        int size = data.getDataArray().length;
        data.trimArrayForTest(size);
        Record[] array = data.getDataArray();
        Record[] control = data.getDataArray();
        Comparator<Record> cmp = new Record.CmpTMax();
        Arrays.sort(control, cmp);
        data.pickSorts(4, "tmax");
        assertEquals("Merge sort failed to create a fully ordered list", Arrays.compare(array, control), 0);
    }
}
