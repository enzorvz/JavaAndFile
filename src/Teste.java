import java.io.File;
import java.io.*;
public class Teste {

    static void main(String[] args) throws IOException {

        File f = new File("//home//enzo//Desktop//txt.exe");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        f.createNewFile();
        bw.write("import java.io.File;");
        bw.newLine();
        bw.write("import java.io.*;");
        bw.newLine();
        bw.write("public class Teste {");
        bw.newLine();
        bw.write("static void main(String[] args) throws IOException {");
        bw.newLine();
        bw.write("  File f = new File(\"//home//enzo//Desktop//txtt.exe\");");
        bw.newLine();
        bw.write("   f.createNewFile();}}");
        bw.newLine();
        bw.flush();



    }
}
