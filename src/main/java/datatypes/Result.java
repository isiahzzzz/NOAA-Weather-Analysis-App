package datatypes;

public class Result {
    private String sortName;
    private long N;
    private long timeTaken;
    private double projectedComparisons;
    private double actualComparisons;

    public Result(String sortName, long N, long timeTaken, double projectedComparisons, double actualComparisons) {
        this.sortName = sortName;
        this.N = N;
        this.timeTaken = timeTaken;
        this.projectedComparisons = projectedComparisons;
        this.actualComparisons = actualComparisons;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public long getN() {
        return N;
    }

    public void setN(long n) {
        N = n;
    }

    public long getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(long timeTaken) {
        this.timeTaken = timeTaken;
    }

    public double getProjectedComparisons() {
        return projectedComparisons;
    }

    public void setProjectedComparisons(long projectedComparisons) {
        this.projectedComparisons = projectedComparisons;
    }

    public double getActualComparisons() {
        return actualComparisons;
    }

    public void setActualComparisons(long actualComparisons) {
        this.actualComparisons = actualComparisons;
    }
}
