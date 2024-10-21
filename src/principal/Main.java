package principal;

import dtos.ResponseMoneda;
import modelos.Moneda;
import transition.TransitionJsonResponseMoneda;

import javax.swing.*;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {


        //creamos la comunicacion con el usuario
        String seleccionCodigoMoneda;
        boolean continuar = true;
        while (continuar) {
            String[] opciones = {"USD", "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM",
                    "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTN", "BWP", "BYN", "BZD",
                    "CAD", "CDF", "CHF", "CLP", "CNY", "COP", "CRC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD",
                    "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "FOK", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF",
                    "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK",
                    "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KID", "KMF", "KRW", "KWD", "KYD", "KZT", "LAK",
                    "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRU", "MUR",
                    "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN",
                    "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG",
                    "SEK", "SGD", "SHP", "SLE", "SLL", "SOS", "SRD", "SSP", "STN", "SYP", "SZL", "THB", "TJS", "TMT",
                    "TND", "TOP", "TRY", "TTD", "TVD", "TWD", "TZS", "UAH", "UGX", "UYU", "UZS", "VES", "VND", "VUV",
                    "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW", "ZWL"};


            // Mostrar el cuadro de diálogo con las opciones
             seleccionCodigoMoneda = (String) JOptionPane.showInputDialog(
                    null,                          // Componente padre, null para centrar
                    "Seleccione el codigo moneda que desea convertir:",      // Mensaje
                    "Desplegable de opciones",     // Título de la ventana
                    JOptionPane.QUESTION_MESSAGE,  // Tipo de mensaje
                    null,                          // Ícono personalizado, null para usar el ícono por defecto
                    opciones,                      // Opciones a mostrar
                    opciones[0]                    // Opción por defecto (la primera en este caso)
            );

            //LLamamos a la clase transitoria que hace la logica de recuperar los datos de la moneda
            TransitionJsonResponseMoneda transitionJsonResponseMoneda = new TransitionJsonResponseMoneda(seleccionCodigoMoneda);
            Moneda moneda = transitionJsonResponseMoneda.getMoneda();

            System.out.println(moneda);

            String monedaALaQueSeDeseaConvertir = (String) JOptionPane.showInputDialog(
                    null,                          // Componente padre, null para centrar
                    "Seleccione la Moneda a la que desea convertir:",      // Mensaje
                    "Desplegable de opciones",     // Título de la ventana
                    JOptionPane.QUESTION_MESSAGE,  // Tipo de mensaje
                    null,                          // Ícono personalizado, null para usar el ícono por defecto
                    opciones,                      // Opciones a mostrar
                    opciones[0]                    // Opción por defecto (la primera en este caso)
            );

            for (Map.Entry<String, Double> ratio : moneda.getRatiosMoneda().entrySet()) {
                if (ratio.getKey().equalsIgnoreCase(monedaALaQueSeDeseaConvertir)) {
                    JOptionPane.showMessageDialog(null,
                            "la cantidad equivalente seria :" + ratio.getValue()
                                    + " "+ monedaALaQueSeDeseaConvertir);
                }
            }


            String[] opcionesContinuar = {"Deseo Continuar consultando Monedas", "Deseo Salir del Programa"};
            // Mostrar el cuadro de diálogo con las opciones
            String seleccionContinuar = (String) JOptionPane.showInputDialog(
                    null,                          // Componente padre, null para centrar
                    "Seleccione una opción:",      // Mensaje
                    "Consulta",     // Título de la ventana
                    JOptionPane.QUESTION_MESSAGE,  // Tipo de mensaje
                    null,                          // Ícono personalizado, null para usar el ícono por defecto
                    opcionesContinuar,                      // Opciones a mostrar
                    opciones[0]                    // Opción por defecto (la primera en este caso)
            );
            if (seleccionContinuar == null || seleccionContinuar.equalsIgnoreCase("Deseo Salir del Programa") ) {
                continuar = false;
                JOptionPane.showMessageDialog(null,"Gracias por utilizar nuestro conversor de moneda ");
            }
        }





    }

}