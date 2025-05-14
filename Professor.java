package lingua.linguagens.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;

class Professor extends Aluno{
    ArrayList<String> formacoes;
        String area;

        /**
         * peculiaridades do contrutor do professor
         * @param nome
         * @param idade
         * @param curso
         * @param area
         * @param formacoes ele recebe uma lista do tipo String com a formações do professor uma tapioca
         */

        public Professor(String nome, LocalDate idade, String curso,String area,ArrayList<String> formacoes) {
                super(nome, idade, curso);
                this.area = area;
            }

        public String darAulas(String aulas){
            this.aulasAssistidas.add(aulas);
            return aulas;
        }
        
        public String relacaoAulas(String aulas){
            String ministrar = "";
            ministrar += aulasAssistidas;
            return ministrar;
        }

        //nao sei se precisa botar o calculo de novo
        public int calcularIdade(){
        return Period.between(idade, LocalDate.now()).getYears();
}
    
    public static void main(String[] args) {
        Professor joao = new Professor("Wendel", LocalDate.of(2000, 12, 12), "informatica", "tecnologia", null);
        System.out.println(joao.nome);
        System.out.println(joao.calcularIdade());
        System.out.println(joao.curso);
        System.out.println(joao.area);
        joao.darAulas("java");
        System.out.println(joao.relacaoAula());

    }
    }
    
    

