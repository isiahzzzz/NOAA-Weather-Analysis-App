import java.util.Scanner;
import java.util.stream.Stream;

/**
 * REVISION HISTORY
 */
public class NOAAWeatherApp {

    private Database data;

    /**
     * Method handles entire application
     * @param fileName name of file to read from
     */
    public void menu(String fileName) {
        Scanner sc = new Scanner(System.in);
        String key;
        //todo: menu options here.
        System.out.println("DEVELOPMENT MENU: ");
        System.out.println("N - CREATE NEW DATABASE FROM FILE");
        System.out.println("P - PRINT MENU");
        System.out.println("S - SORTS OPTIONS");
        System.out.println("Q - QUIT");
        key = sc.next();
        try {

            switch (key.toLowerCase()) {
                //todo: initialize database
                case "n":
                    data = new Database(fileName);
                    menu(fileName);
                    break;
                //todo: terminate program
                case "q":
                    break;

                case "p":
                    System.out.println("How many data points do you want to " +
                            "print?");
                    int prints = sc.nextInt();
                    Stream.of(data.getDataSet()).limit(prints).forEach(System.out::println);
                    menu(fileName);
                    break;
                case "s":
                    data.sorts();
                    menu(fileName);
            }
        }catch (NullPointerException e) {
            System.err.println("No database found, please create new database" +
                    " from file before continuing");
            menu(fileName);
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
