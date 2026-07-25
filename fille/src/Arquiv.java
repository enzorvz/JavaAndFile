import java.io.*;
import java.util.StringTokenizer;

public class Arquiv {

    static void main(String[] args) throws IOException {

        File f = new File("perguntass.txt");
        BufferedReader bfr =new BufferedReader(new FileReader(f));
        StringTokenizer st;
        String bfl;

        while ((bfl=bfr.readLine())!=null) {
            st=new StringTokenizer(bfl,"|");
            System.out.println(st.nextToken());
            System.out.println(st.nextToken());


        }

    }
}
