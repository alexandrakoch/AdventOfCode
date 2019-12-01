package Day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class SingleLineReader {

    String[] singleWidthRead(String fileLoc) {
        BufferedReader reader;
        String[] workingArray = new String[100];
        int i = 0;
        try {
            reader = new BufferedReader(new FileReader(fileLoc));
            String currLine = reader.readLine();
            while (currLine != null) {
                workingArray[i] = currLine;
                i++;
                currLine = reader.readLine();
            }
            reader.close();
            return workingArray;
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
