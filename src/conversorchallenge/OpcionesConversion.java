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
	String opcion = JOptionPane.showInputDialog(
                null,
		"Elije la moneda a la que deseas convertir tu dinero",
                "Moneda",
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[]{"De Bolivianos a Dólar", "De Bolivianos a Euro", "De Bolivianos a Libra Esterlina", "De Bolivianos a Yen", "De Bolivianos a Won Coreano", "De Dólar a Bolivianos","De Euro a Bolivianos"},
                "Selección"
        ).toString();

	switch (opcion) {
	case "De Bolivianos a Dólar" :
		monedas.ConvertirBolivianosADolares(valor);
		break;
	
	case "De Bolivianos a Euro" :
		monedas.ConvertirBolivianosAEuro(valor);
		break;
		
	case "De Bolivianos a Libra Esterlina" :
		monedas.ConvertirBolivianosAEsterlina(valor);
		break;
	
	case "De Bolivianos a Yen" :
		monedas.ConvertirDeBolivianosAYen(valor);
		break;
		
	case "De Bolivianos a Won Coreano" :
		monedas.ConvertirDeBolivianosAWonCoreano(valor);
		break;
	
	case "De Dólar a Bolivianos" :
		monedas.ConvertirDeDolarABolivianos(valor);
		break;
		
	case "De Euro a Bolivianos" :
		monedas.ConvertirDeEuroABoliviano(valor);
		break;
		
		}
	}
}
