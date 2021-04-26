import java.util.Scanner;

public class Programa {
	
  double a, b, c;
  Scanner sc = new Scanner(System.in);
private boolean salir;
	void iniciar(){
		//escribe aquí tú código
    cargarVariables();
    desplegarMenu();
	}
	
  void cargarVariables(){
  
   System.out.println("Ingrese valor de a :  ");
   a=sc.nextDouble();
   System.out.println("Ingrese valor de b :  ");
   b=sc.nextDouble();
   System.out.println("Ingrese valor de c :  ");
   c=sc.nextDouble();

  }
	//Escribe aquí el resto de métodos que necesites para resolver el problema
	void desplegarMenu() {

      
       do { // Imprime menú

            System.out.println("1. El cuadrado y la raíz cuadrada de cada valor ");
			    	System.out.println("2. Bhaskara utilizando ax2 + bx + c.");
			    	System.out.println("3. El mayor de tres números, reutilizando el método que calcula el mayor de 2.");
			    	System.out.println("4. Circunferencia, siendo a, b y c tres valores de radio distinto. ");
			    	System.out.println("0. Salir");     
            int opcion = sc.nextInt();

        switch (opcion) {
            case 1: // Ingresar valores
              
              System.out.print(" El valor al cuadrado de a es : "+ cuadrado (a)+ " y la raiz es : "+raiz(a));
              System.out.print(" El valor al cuadrado de a es : "+cuadrado (b)+ " y la raiz es : "+raiz(b));   
              System.out.print(" El valor al cuadrado de a es : "+cuadrado (c)+ " y la raiz es : "+raiz(c));           

              break;
            case 2: 
              
              Bhaskara(a,b,c);

              break;

            case 3: 
             
               double mayorEntre2=max(a,b,c);
             
              break;

              
            case 4 :
              
              
            	Circunferencia(a,b,c);
            	
            	
              
              break;
            case 0: // Salir
              salir = true;
              break;
            default:
              System.out.println("Opción incorrecta");
        } 
    } while (salir != true);
           
  }

   double cuadrado(double x)  {

      double resul= Math.pow(x,2);
      return resul;

   }  

  double raiz (double x)  {

      double resul= Math.sqrt(x);
      return resul;  

  }

  void Bhaskara(double a, double b,  double c ) {

       double delta =(b*b)-(4*a*c);
				 if(delta<0)
              System.out.println(" No hay raices ");
                else {
              
              double x1=(b *(-1)+ raiz(delta))/(2*a);
			  double x2=(b *(-1)- raiz(delta))/(2*a);
              System.out.println("Las raices son : "+x1 + " y " + x2);

             
  }

}


 double mayorEntre2(double x, double y ) {
  if(x>y)
      return x;
  else
      return y;    

 }
	
   
  double max(double a, double b,  double c ){
    double resul2=mayorEntre2(mayorEntre2(a, b ) , c);
    return resul2;
  } 
  
  
  void Circunferencia(double a, double b , double c) {
	  
	  
	  double longitud=Math.PI*a;
	  
	 double area=Math.PI*Math.pow(a, 2);
	    
      System.out.println("La longitud de la Circunferencia a es :" + longitud + " y el area es " + area );
	  

   double longitub=Math.PI*b;
	  
	 double areab=Math.PI*Math.pow(b, 2);

     System.out.println("La longitud de la Circunferencia b es :" + longitub + " y el area es " + areab );	 


   double longituc=Math.PI*b;
	  
	 double areac=Math.PI*Math.pow(b, 2);

     System.out.println("La longitud de la Circunferencia c es :" + longituc + " y el area es " + areac );	 


  }
  
	  
    
  
  
  
  
}