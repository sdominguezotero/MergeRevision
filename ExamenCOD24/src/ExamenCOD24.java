
package examencod;

/**
 *
 * @author TheG�dric94
 */
public class ExamenCOD {

    /**
     * @param args the command line arguments
     * @version Versi�n 8.1.2
     */
    public static void main(String[] args) {
 int iN = 11;
 System.out.println("Siempre tenemos pavo.");
            	if (metodoMio(iN))
System.out.println("Es numero primo.");
else
 System.out.println("NO es numero primo.");           	 
          	 
for (int x=2;x<1000;x++) {
if (metodoMio(x))
System.out.print(x + " ");                         

System.out.print("Commit 3 master");
}         	 

System.out.print("Commit 3 Branch 2");
	}

    /**
     *El m�todo va sumandole 1 a J hasta que sea igual a variable
     * @param variable
     * @return Devuelve el valor de aux (True o False)
     */
    public static boolean metodoMio(int variable){
        
int j = 2;
boolean aux=true;
while ((aux) && (j!=variable)){
if (variable % j == 0)
aux = false;
j++;
}
return aux;
  } 	 
    
}
