package lingua.linguagens.java;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.*;
import javax.xml.crypto.Data;

public class Principal {
    
public static void main(String[] args){
    String nome = JOptionPane.showInputDialog(null,  "Your name is: ");
    String idade = JOptionPane.showInputDialog(null,  "Your nasciment is(Year-Month-Day): ");

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate nascimento = LocalDate.parse(idade, formatter);
    LocalDate hoje = LocalDate.now();
    //* LocalDate idade0 = Period.between(idade, hoje).getYears();
    
    String curso = JOptionPane.showInputDialog(null,  "Your course is: ");
    //* String relacao = JOptionPane.showInputDialog(null,  "Your watched classes is: ");
    
 
    Aluno luccas = new Aluno(nome, null, curso);
    JOptionPane.showMessageDialog(null, "Your name is: " + nome);
    JOptionPane.showMessageDialog(null, "Your age is: " +  nascimento);
    JOptionPane.showMessageDialog(null, "Your course is: " + curso);
   

    luccas.assistindoAula("java ");
    luccas.assistindoAula(",java script ");
    luccas.assistindoAula(",sistema operacional");
    JOptionPane.showMessageDialog(null, "Your watched classes is: " + luccas.aulasAssistidas);
    
}
}
 //* JOptionPane.showMessageDialog(null, "Your watched classes is: " + relacao); acho que nao faz sentido voce colocar as suas aulas assistidas
//*JOptionPane.showMessageDialog(null, "Your age is: " + luccas.calcularIdade());