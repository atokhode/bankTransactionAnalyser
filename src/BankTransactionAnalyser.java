import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankTransactionAnalyser {
    private static final String RESOURCES="src/main/resources";

    public static void main(final String... args) throws IOException{
        final Path path = Paths.get(RESOURCES + args[0]);
        final List<String> lines = Files.readAllLines(path);
        double total = 0d;

        for(final String line: lines){
            final String[] columns = line.split(" , ");
            final double amount = Double.parseDouble(columns[1]);
        }

        System.out.println("The final total for all transactions is "+ total);
    }
}
