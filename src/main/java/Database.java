import au.com.bytecode.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Objects;
/**
 * REVISION HISTORY
 */
public class Database {
    //todo: Will be the ArrayList of Records.
    private ArrayList<Objects> dataSet;

    /**
     * Initializes database
     * @param fileName filename
     */
    public Database(String fileName) {
        try {
            //todo: finish scanning once record object is complete
            CSVReader reader = new CSVReader(new FileReader(fileName));
        } catch (FileNotFoundException e){
            System.err.println("Could not locate " + fileName);
            System.exit(2);
        }
    }
}
