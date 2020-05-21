package covid19SL;

public class DataProcessor {
    private static final String FILE_PATH = "C:/Users/Sandun/eclipse-workspace/covid19SL/src/covid-19-data.json";
    
    public static void main(String[] args) {
        DataReader reader = new DataReader();
        reader.readData(FILE_PATH);
    }

}
