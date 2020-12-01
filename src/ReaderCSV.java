import java.io.*;

public class ReaderCSV {
    private static final String COMMA_DELIMITER=",";
    private static final String NEW_LINE_SEPARATOR="\n";
    private static String path="CSVFile/writeFile.csv";

    public static void readerCSV() throws IOException {
        File file=new File(path);
        if (!file.exists()){
            System.out.println("File not found");
        }
        FileReader fileReader= new FileReader(file);
        BufferedReader bufferedReader= new BufferedReader(fileReader);

        String line=null;
        while ((line= bufferedReader.readLine())!=null){
            String[] country=line.split(COMMA_DELIMITER);
            System.out.println("Country{" +
                    "id=" + country[0] +
                    ", code='" + country[1] + '\'' +
                    ", name='" + country[2] + '\'' +
                    '}');
        }
        bufferedReader.close();
    }
}
