/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversorchallenge;


import javax.swing.JOptionPane;
/**
 *
 * @author paulotintaya
 */
public class OpcionesConversion {
    ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
	String opcion = JOptionPane.showInputDialog(null,
			"Elije la moneda a la que deseas convertir tu dinero", "Moneda", JOptionPane.PLAIN_MESSAGE, null, new Object[] 
					{"De Pesos Dominicano a Dólar", "De Pesos Dominicano a Euro", "De Pesos Dominicano a Libra Esterlina", "De Pesos a Yen", "De Pesos a Won Coreano", 
					"De Dólar a Pesos","De Euro a Pesos"},"Selección").toString();

	switch (opcion) {
	case "De Pesos Dominicano a Dólar" :
		monedas.ConvertirPesoDominicanosADolares(valor);
		break;
	
	case "De Pesos Dominicano a Euro" :
		monedas.ConvertirPesoDominicanosAEuro(valor);
		break;
		
	case "De Pesos Dominicano a Libra Esterlina" :
		monedas.ConvertirPesoDominicanosAEuro(valor);
		break;
	
	case "De Pesos a Yen" :
		monedas.ConvertirDePesosaYen(valor);
		break;
		
	case "De Pesos a Won Coreano" :
		monedas.ConvertirDePesosaWonCoreano(valor);
		break;
	
	case "De Dólar a Pesos" :
		monedas.ConvertirDeDólarPesos(valor);
		break;
		
	case "De Euro a Pesos" :
		monedas.ConvertirDeEuroPeso(valor);
		break;
		
		}
	}
}
