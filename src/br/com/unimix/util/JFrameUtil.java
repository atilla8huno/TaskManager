package br.com.unimix.util;

import java.awt.Component;
import java.awt.Container;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author ATILLA
 */
public class JFrameUtil {

    private static SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    
    /**
     * Este método limpa todos os campos do container recebido por argumento.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     */
    public static void limparCamposDoContainer(Container cont){
        for(Component c : cont.getComponents()){
            if(c instanceof JTextField){
                JTextField temp = (JTextField) c;
                temp.setText("");
            } else if (c instanceof JFormattedTextField){
                JFormattedTextField temp = (JFormattedTextField) c;
                temp.setText("");
            } else if (c instanceof JComboBox){
                JComboBox temp = (JComboBox) c;
                temp.setSelectedIndex(0);
            } else if (c instanceof JTextArea){
                JTextArea temp = (JTextArea) c;
                temp.setText("");
            } else if (c instanceof Container){
                Container temp = (Container) c;
                limparCamposDoContainer(temp);
            }
        }
    }
    
    /**
     * Este método recebe um título e uma mensagem como parâmentro e exibe uma
     * mensagem de erro.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   String titulo
     * @param   String msg
     */
    public static void showMensagemDeErro(String titulo, String msg){
        JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Este método recebe um título e uma mensagem como parâmentro e exibe uma
     * mensagem de informação.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   String titulo
     * @param   String msg
     */
    public static void showMensagemDeInformacao(String titulo, String msg){
        JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Este método recebe um título e uma mensagem como parâmentro e exibe uma
     * mensagem de alerta.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   String titulo
     * @param   String msg
     */
    public static void showMensagemDeAlerta(String titulo, String msg){
        JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.WARNING_MESSAGE);
    }
    
    /**
     * Este método recebe uma Data como parâmentro e retorna no formato texto dd/MM/yyyy
     * 
     * @author  Átilla Barros
     * @date    15/02/2013
     * @param   Date data
     * @return  String
     */
    public static String date2String(Date data){
        return formatador.format(data);
    }
    
    /**
     * Este método recebe uma Data em String como parâmentro e retorna em Date dd/MM/yyyy
     * 
     * @author  Átilla Barros
     * @date    15/02/2013
     * @param   String data
     * @return  Date
     */
    public static Date string2Date(String data) {
        try {
            return formatador.parse(data);
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
