import java.util.Scanner;

/**
 * REVISION HISTORY
 */
public class NOAAWeatherApp {

    private Database data;

    public void menu(String fileName) {
        Scanner sc = new Scanner(System.in);
        String key;
        //todo: menu options here.
        System.out.println("Press N to create new database from file.");
        key = sc.next();

        switch(key.toLowerCase()) {
            //todo: initialize database
            case "n" : data = new Database(fileName);
                break;
            //todo: terminate program
            case "q" :
                break;
        }
    }
    public void run(String fileName) {
        menu(fileName);
    }

    /**
     *
     * @param args filepath
     */
    public static void main(String[] args){
        NOAAWeatherApp driver = new NOAAWeatherApp();
        if(args.length == 0){
            System.err.println("usage: program args -> filename");
            //System.exit 1 -- BAD FILE ARGS
            System.exit(1);
        } else {
            driver.run(args[0]);
        }

    }
}
