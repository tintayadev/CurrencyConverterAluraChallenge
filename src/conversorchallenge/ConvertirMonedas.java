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
public class ConvertirMonedas {
    public void ConvertirBolivianosADolares(double valor) {
            double monedaDolar = valor * 0.14;
            monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
            JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}

	public void ConvertirBolivianosAEuro(double valor) {
            double monedaEuro = valor * 0.13;
            monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
            JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}

	public void ConvertirBolivianosAEsterlina(double valor) {
            double monedaLibraEsterlina = valor * 0.12;
            monedaLibraEsterlina = (double) Math.round(monedaLibraEsterlina *100d) /100;
            JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibraEsterlina + " Libras Esterlinas");
	}
	public void ConvertirDeBolivianosAYen(double valor) {
            double monedaYen = valor * 19.07;
            monedaYen = (double) Math.round(monedaYen * 100d) / 100;
            JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yenes");
	}

	public void ConvertirDeBolivianosAWonCoreano(double valor) {
            double monedaWonCoreano = valor *188.36;
            monedaWonCoreano = (double) Math.round(monedaWonCoreano) / 100;
            JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWonCoreano + " Coreano");
	}

	public void ConvertirDeDolarABolivianos(double valor) {
            double DólarPesos = valor * 6.91;
            DólarPesos = (double) Math.round(DólarPesos * 100d) / 100;
            JOptionPane.showMessageDialog(null, "Tienes $ " + DólarPesos + " Bolivianos");
	}

	public void ConvertirDeEuroABoliviano(double valor) {
            double monedaEuroPeso = valor * 7.45;
            monedaEuroPeso = (double) Math.round(monedaEuroPeso * 100d) / 100;
            JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuroPeso + " Bolivianos");
	}
}
