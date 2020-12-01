import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriterCSV {
    private static final String COMMA_DELIMITER=",";
    private static final String NEW_LINE_SEPARATOR="\n";
    private static String path="CSVFile/writeFile.csv";


    public static void writeFile(Country country) throws IOException {
        FileWriter fileWriter= new FileWriter(new File(path),true);
        fileWriter.append(String.valueOf(country.getId()));
        fileWriter.append(COMMA_DELIMITER);
        fileWriter.append(country.getCode());
        fileWriter.append(COMMA_DELIMITER);
        fileWriter.append(country.getName());
        fileWriter.append(NEW_LINE_SEPARATOR);
        fileWriter.close();
    }
}
