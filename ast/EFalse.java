package ast;


public class EFalse extends Exp{
	
	public EFalse()
	{
	  super();
	  
	}

	public void geraCodigo(PrintWriter out) {
    	out.print(value);
	}

}
