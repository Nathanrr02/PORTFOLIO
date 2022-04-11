package nrr;
O import javax.swing.JOptionPane;
public class Nrr {
    public static void main (String [] args) {
      String nome = JOptionPane.showInputDialog ("Digite seu nome");
      JOptionPane.showMessageDialog (null, "Bem vindo, "+nome);
      String idade = JOptionPane.showInputDialog ("Digite seu idade");
      String msg = "Que legal "+nome+", você tem "+idade+" anos.";
      JOptionPane.showMessageDialog (null, msg);
      String rl = JOptionPane.showInputDialog ("Qualo contrário de papelada ?");
      if(rl.equals ("pavestida")) {
          JOptionPane.showMessageDialog (null, "Acertou!");
