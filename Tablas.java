import java.util.*;
	public class Tablas{
		public static void main(String[] args) {

			System.out.println("                           Bienvenido");
			int w;
			int x;
			int y; 
			int z;
			int h;
			
			Scanner n=new Scanner(System.in);
			System.out.println("--------Elija la opcion que quiera y el programa lo ejecutara--------");
			
			System.out.println("1.Varios multiplos, 2.Hasta que tabla quieres ver, 3.Salir");
			z=n.nextInt();

			switch(z){
				case 1:
				System.out.print("Escriba la tabla que quiere ver: ");
				w=n.nextInt();

				System.out.print("Hasta que multiplo quiere ver: ");
				x=n.nextInt();

				for(int i=1; i<=x; i++){
					 
				int a=i*w;

				System.out.println(w+"*"+i+"="+a);
				}
				System.out.println("Se muestra hasta el multiplo "+x);	
				break;

				case 2:
				System.out.print("Hasta que tabla quieres ver: ");
				h=n.nextInt();

				for(int d=h; d>=1;d--){
					System.out.println("Tabla de multiplicar del "+ d);
					for (int j=1;j<=10 ;j++){
						System.out.println(d+"*"+j+"="+d*j);
					}					
					
					
				}
				System.out.println("Se mostro hasta la tabla del "+h);
				break;

				case 3:
				System.out.print("El programa se cerro exitosamente");

				break;

				default:

				System.out.println("solo 3 opciones estan disponibles");

					}	
	
			}
}