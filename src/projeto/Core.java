/*
 *
 */
package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



public class Core {
    
    public double menorNota(){
        List<Aluno> aluno = new ImportacaoArquivo().arquivoLeitura();
        
        double menor = -1;
        
        for (Aluno alunos : aluno) {
            if(alunos.getNote()<menor || menor ==-1){
                menor=alunos.getNote();
            }    
        }
        System.out.println("A menor Nota é: "+menor);
       return menor;  
    }
    
    public double maiornota(){
        List<Aluno> aluno = new ImportacaoArquivo().arquivoLeitura();
        double maior=-1;
        
        for (Aluno alunos : aluno) {
            if(alunos.getNote()>maior || maior==-1){
                maior=alunos.getNote();
            }
        }
        System.out.println("A maior Nota é: "+maior);
        return maior;
    } 
    
    public double media(){
        List<Aluno> aluno = new ImportacaoArquivo().arquivoLeitura();
        double total=0;
        for (Aluno alunos : aluno) {
            total+=alunos.note;
        }
        double media=total/aluno.size();
        System.out.println("A Média é: "+media);
        return media;
    }
   
}
