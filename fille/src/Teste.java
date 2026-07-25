import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Teste {

    public static void main(String[] args) throws IOException {

            int[] x ={2,4,6,8,10};

            int[]y ={5,9,13,17,21};

            double peso = 0.01;

            int epoca=1000;

            double w=0.0;

            double b=0.0;

        double previsao=0;

        double erro=0;

        for (int i = 0; i < epoca; i++) {
            //esses erros vai somar

            double erroy=0;

            double errox=0;

            for (int j = 0; j < x.length; j++) {

                previsao=w*x[j]+b;

                erro=previsao-y[j];

                erroy+=erro*x[j];

                errox+=erro;

                w=w-(peso *  2/x.length)*erroy;

                b=b-(peso *2/x.length)*errox;


            }





        }

        System.out.println(90*w+b);

    }
}
