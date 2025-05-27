package lingua.linguagens.java;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

import javax.swing.*;


public class Principal {
    
public static void main(String[] args){
            /*perguntas: gerais */ 

     LocalDate nascimento = null;

      try {
          String nome = JOptionPane.showInputDialog("Your name is: ");
          if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome nao pode estar vazia");
          }

          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

     
          String nascimentoStr = JOptionPane.showInputDialog("Your nasciment is(Year/Month/day): ");
          if (nascimento == null || nascimento.isEmpty()){
            throw new IllegalArgumentException("Nascimento nao pode estar vazia");
          }

          String curso = JOptionPane.showInputDialog(null,  "Your course is: ");
          if (curso == null || curso.isEmpty()) {
            throw new IllegalArgumentException("Curso nao pode estar vazio");
          } 

          if (isNumeric(curso)){
            throw new IllegalArgumentException("Não pode haver numeros no curso");
          }


          /* int anoAtual = LocalDate.now().getYear();
          int anoNascimento = anoAtual - idade;

          idadeInput = LocalDate.parse(nascimento, formatter);

          LocalDate idade = Integer.parseInt(nascimento); */
          
        

            /*aluno: */
        Aluno luccas = new Aluno(nome, nascimento, curso);{  
      JOptionPane.showMessageDialog(null, "Your age is: " +  luccas.calcularIdade());
      JOptionPane.showMessageDialog(null, "Your name is: " + nome);
      JOptionPane.showMessageDialog(null, "Your course is: " + curso);
      luccas.assistindoAula("java ");
      luccas.assistindoAula(",java script ");
      luccas.assistindoAula(",sistema operacional");
      JOptionPane.showMessageDialog(null, "Your watched classes is: " + luccas.aulasAssistidas);
          }

        } catch (NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Erro: A idade deve ser um número válido.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        }
        catch (IllegalArgumentException e){
          JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }


        /*exibições */
        ArrayList<String> formacoes = new ArrayList<>();
      formacoes.add("Mestrado em " + curso);

        Professor joao = new Professor(nome, nascimento, curso, "tecnologia", formacoes);{
      JOptionPane.showMessageDialog(null,"Hello teacher, your name is: " + joao.getNome());
      JOptionPane.showMessageDialog(null,"Teacher, your course is: " + curso);
      JOptionPane.showMessageDialog(null, "Your age is: " +  joao.calcularIdade());
      joao.darAulas("java");
      JOptionPane.showMessageDialog(null, joao.relacaoAula());
      } 
    }
    private static boolean isNumeric(String str) {
      return str.matches("\\d+");
      }
}



 //* JOptionPane.showMessageDialog(null, "Your watched classes is: " + relacao); acho que nao faz sentido voce colocar as suas aulas assistidas
//*JOptionPane.showMessageDialog(null, "Your age is: " + luccas.calcularIdade());Professor wendel = new Professor(nome, idade, curso, curso, null){
/* PROFESSOR */ 
    /* JOptionPane.showMessageDialog(null, "Your name is: " + nome);
    JOptionPane.showMessageDialog(null, "Your age is: " +  calcularIdade());
    JOptionPane.showMessageDialog(null, "Your course is: " + formackage lingua.linguagens.java;*/
