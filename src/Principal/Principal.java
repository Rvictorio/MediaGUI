package Principal;

import Contas.Notas;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {

        Notas mediaDaNota =new Notas();

        String identificacao = JOptionPane.showInputDialog("Digite o nome ou ID: ");

        try
        {
            mediaDaNota.setPrimeiraNota(Float.parseFloat(JOptionPane.showInputDialog ("Digite a primeira nota:")));
        }
        catch(java.lang.NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Primeira nota invalida!" +
                    "\nUtilize apenas números");
            mediaDaNota.setPrimeiraNota(Float.parseFloat(JOptionPane.showInputDialog ("Digite a primeira nota:")));
        }

        try
        {
            mediaDaNota.setSegundaNota(Float.parseFloat (JOptionPane.showInputDialog("Digite a segunda nota:")));
        }
        catch(java.lang.NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Segunda nota invalida!" +
                    "\nUtilize apenas números");
            mediaDaNota.setSegundaNota(Float.parseFloat (JOptionPane.showInputDialog("Digite a segunda nota:")));
        }

        finally {
            JOptionPane.showMessageDialog(null, "Resultado da média do"
                            +" '" +identificacao + "' " + "é: " +
                            mediaDaNota.notaDaMedia(mediaDaNota.getPrimeiraNota(), mediaDaNota.getSegundaNota()),
                    "Resultado", JOptionPane.WARNING_MESSAGE);
        }


    }
}
