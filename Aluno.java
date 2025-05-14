package lingua.linguagens.java;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import javax.swing.*;

class Aluno{
        String nome;
        LocalDate idade;
        String curso;
        
                ArrayList<String> aulasAssistidas;
            
        /**    aulasAssistidas.add(new aula(titulo, data)}
        @param Aluno diz a respeito sobre algumas informações dos alunos
        @param nome nome do aluno
        @param idade idade do aluno
        @param curso curso do aluno
        */
        
        public Aluno(String nome, LocalDate idade, String curso){
            this.nome = nome;
            this.idade = idade;
            this.curso = curso;

            this.aulasAssistidas = new ArrayList<>();
            
        }
        
        public int calcularIdade(){
            return Period.between(idade, LocalDate.now()).getYears();
        }
        
        
        public String assistindoAula(String aula){
               this.aulasAssistidas.add(aula);
               return aula;
        }
        
        public String relacaoAula(){
            String coco = "";
            coco += aulasAssistidas;
            return coco;
        }
    }
        
          
        



