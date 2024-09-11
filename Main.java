import java.time.LocalDate;
import java.time.temporal.chronounit;




class Tarefa{
    

    //encapsulamento  esconder dados do usuarios(publuc, private)
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;

// Construtor:(construir apartir de uma class um objeto.)
public Tarefa( String titulo, String descricao, String prazo, int prioridade){
    this.titulo = titulo;
    this.descricao = descricao;
    this.prazo =  prazo;
    this.prioridade = prioridade;

}
//construtor 2 : contrutor com menos parâmetros.
public Tarefa(String titulo,String prazo){
    this.titulo=titulo;
    this.prazo=prazo;
    this.descricao="";
    this.prioridade=0;


}


    // Metodo Get e Set
    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo ){
        this.titulo = titulo ;


    }
    //Método para calcular dias restantes 
    public long calcularDiasRestantes(){
        LocalDAte dataPrazo= LocalData.parse(this.prazo);
        LocalDate hoje = LocalDate.now();
        
        



    }


}




public class Main {

public static void main ( String[] args) {
    //(Tarefa tarefa1 = new) sintax de como printar os atributos.
   Tarefa tarefa1 = new Tarefa (" Estudar POO","Revisar conceitos de classes e objetos","2024-09-24", 1 );
    
    System.out.println("Titulo:" + tarefa1.getTitulo());
    System.out.println("Descricao:" +Tarefa1.getdescricao());
    System.out.println();
    System.out.println("========Imprimir com metodo exibirdetalhe=======");
    tarefa.exibirdetalhe();


    Tarefa tarefa2= new Tarefa("Estudar para a prova", "2050-13-23");
    tarefa2.exibirdetalhe();



}   
}