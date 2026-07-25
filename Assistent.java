import java.io.*;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Assistent {
    static TreeMap<String,String> ia =new TreeMap<>();
    static String resposta="";
    static File f = new File("perguntass.txt");


   static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    static  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static void main(String[] args) throws IOException {
    f.createNewFile();
        Assistent as = new Assistent();
        String tecla ="";






        while(!tecla.equals("n")){
            bw.write("digite sua pergunta");
            bw.newLine();
            bw.flush();
            String l =br.readLine();
            as.sabe(l);
            bw.write("digite n se quiser para o codigo");
            bw.newLine();
            bw.flush();
            tecla= br.readLine();
        }

    }
    void fingindoquesabe(String l ,String j) throws IOException {

        String k =l.toLowerCase().trim();


        if (ia.get(k)==null){
            bw.write("esta palavra nao tem resposta deseja adiconala");
            bw.newLine();
            bw.flush();

            ia.put(k,j);
            bw.write("resposta adiconada com sucesso");
            bw.newLine();
            bw.flush();

        }


    }
    void sabe(String l) throws IOException {
        BufferedReader bfr =new BufferedReader(new FileReader(f));

        String bfl;
        StringTokenizer st;
        while ((bfl=bfr.readLine())!=null) {

            st=new StringTokenizer(bfl,"=");
            ia.put(st.nextToken().toLowerCase(),st.nextToken().toLowerCase().trim());



        }

        String k =l.toLowerCase().trim();


        if (ia.get(k)!=null){
        bw.write("sua resposta e");
        bw.newLine();
        bw.flush();
        bw.write(ia.get(k));
        bw.newLine();
        bw.flush();}
        else {
            BufferedWriter bww = new BufferedWriter(new FileWriter(f));
            for (int i = 0; i < ia.size(); i++) {
            String a= ia.navigableKeySet().toArray()[i].toString();
                ia.get(a);

                bww.write(a+"="+ ia.get(a));
                bww.newLine();
                bww.flush();
            }
            bw.write("nao temos reposta adiciona a resposta");
            bw.newLine();
            bw.flush();
           resposta=br.readLine();

            bww.write(k+"="+resposta);
            bww.newLine();
            bww.flush();

            fingindoquesabe(k,resposta);
        }
    }
}
