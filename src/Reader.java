import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// import java.nio.charset.StandardCharsets;

public class Reader {
    
    private File file;
    private FileReader fileReader;
    private BufferedReader bufferedReader;

    public Reader(String path) {
        file = new File(path);
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        bufferedReader = new BufferedReader(fileReader);
    }

    public File getFile() { return file; }
    public FileReader getFileReader() { return fileReader; }
    public BufferedReader getBufferedReader() { return bufferedReader; }

    public String readAll() throws IOException {
        String s = "";
        String line = bufferedReader.readLine();
        while (line != null){
            s +=line + "\n";
            line = bufferedReader.readLine();
        }
        return s;
    }

}
