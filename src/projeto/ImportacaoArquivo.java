/*
 * Classe para Importar e Dividir os Arquivos
 */
package projeto;

import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Files;

public class ImportacaoArquivo {
    
    public List<Aluno> arquivoLeitura(){
        List<Aluno> listaAluno = new ArrayList<>();
            
        try {
            InputStream ins = new FileInputStream("aluno.txt");
            Scanner obj = new Scanner(ins);
                while (obj.hasNext()){
                String[] textoSeparado = obj.nextLine().split(",");
                
                Aluno aluno = new Aluno();
                 
                 aluno.id = Integer.parseInt(textoSeparado[0]);
                 aluno.name = textoSeparado[1];
                 aluno.note = Double.parseDouble(textoSeparado[2]);
                 
                 listaAluno.add(aluno);
                }
                
                for(Aluno alunos: listaAluno){
                    System.out.println(alunos);
                }
                           
        } catch (FileNotFoundException ex) {
            System.out.println("Erro Ao Carregar o Arquivo!");
        }
        return listaAluno;
    }
    
}
