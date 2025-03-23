package ast;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Prog{
    public Main main;
    public ArrayList<Fun> funs;
    public Prog(Main main, ArrayList<Fun> funs)
    {
        this.main = main;
        this.funs = funs;
    }

    public void geraCodigo(PrintWriter out) {
        if (funs != null) {
            for (Fun fun : funs) {
                fun.geraCodigo(out);
                out.println();
            }
        }
        
        if (main != null) {
            main.geraCodigo(out);
        }
    }
}

