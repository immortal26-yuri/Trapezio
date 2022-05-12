import java.util.Scanner;

/**
*
*@author Scozzi
*
*@version 0
*
*@param B base maggiore
*@param b base minore
*@param h altezza
*
*/
public class Trapezio {

	Scanner tastiera = new Scanner(System.in);
	
	/**
	 * Dichiarazione attributi
	 */
	private double B;
	private double b;
	private double h;
	
	/**
	 * 
	 * Metodo costruttore
	 *
	 */
	public Trapezio(double BaseM, double Basem, double altezza) {
		B = BaseM;
		b = Basem;
		h = altezza;
	}

	/**
	 *Metedo usato per il calcolo area
	 * 
	 *@return risultato area
	 *
	 */
	public double CalcolaArea() {

		/**
		 *  calcolo dell'area trapezio
		 * 
		 */
		double area = (B+b)*h/2;

		return area;
		}
}