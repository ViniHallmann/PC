package ast;

import java.util.ArrayList;

public class Prog{
    public Main main;
    public ArrayList<Fun> funs;
    public Prog(Main main, ArrayList<Fun> funs)
    {
        this.main = main;
        this.funs = funs;
    }

    if (main != null) {
        main.geraCodigo(out);
    }

    if (funs != null) {
        for (Fun fun : funs) {
            fun.geraCodigo(out);
        }
    }
}

