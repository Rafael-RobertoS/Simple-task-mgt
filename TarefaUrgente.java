public class TarefaUrgente extends Tarefa{
private String
razaoPrioridade;

public TarefaUrgente(String titulo,String descricao,String prazo,String razaoPrioridade)
{
super (titulo,descricao,prazo,5);
this.razaoPrioridade=razaoPrioridade;
public String getrazaoPrioridade(){
    return this.razaoPrioridade;

}
public void setrazaoPrioridade(String razaoPrioridade){}
    @Override
    public void exibirDetalhes(){
super.exibirDetalhes();
System.out.println("Razao da urgencia:"+this.razaoPrioridade);
TarefaUrgente tarefaUrg1=new TarefaUrgente("Estudar para a prova ","conceitos de pqd ","2024-10-02","Não entendi nada");
tarefaUrg1.exibirDetalhes();
    
}

}

}