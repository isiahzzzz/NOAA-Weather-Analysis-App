
import java.util.Comparator;
public class CmpCnt {

    protected int cmpCnt;

    // constructor initializes the counter to zero
    CmpCnt() {
        cmpCnt = 0;
    }

    // return the value of the embedded counter
    public int getCmpCnt() {
        return cmpCnt;
    }

    // reset the counter to 0
    public void resetCmpCnt() {
        cmpCnt = 0;
    }
}
