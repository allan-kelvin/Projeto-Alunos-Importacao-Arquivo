/* Projeto Notas Aluno*/
package projeto;

public class Main {
    public static void main(String[] args) {
        
        try {
            /*Trazendo o arquivo de Leitura*/
           new ImportacaoArquivo().arquivoLeitura();
            
            /*Trazendo a menor Nota*/
           new Core().menorNota();
           
           /*Trazendo a Maior Nota*/
           new Core().maiornota();
          
           /*Trazendo a media*/
           new Core().media();
            
        } catch (Exception e) {
            
        }
    }
    
}
