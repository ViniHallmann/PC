package ast;
import java.io.PrintWriter;

public class EFloat extends Exp{
	public float value;
	
	
	public EFloat(float value)
	{
	  this.value = value;
	  
	} 
	public void geraCodigo(PrintWriter out) {
		out.print(value);
	}

}
