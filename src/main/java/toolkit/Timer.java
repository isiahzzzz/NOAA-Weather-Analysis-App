package toolkit;

public class Timer {
    private long startTime;
    private long result;
    protected void startTimer() {
        this.startTime = System.nanoTime();
    }
    protected void endTimer() {
        this.result = (System.nanoTime() - this.startTime) / 1000000;
    }
    protected long getResult() {
        startTime = 0;
        return this.result;
    }
}
