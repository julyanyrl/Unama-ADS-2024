
class TarefaNaoUrgente extends Tarefa {
    private String observacao;

    public TarefaNaoUrgente(String titulo, String descricao, String prazo, String observacao) {
        super(titulo, descricao, prazo, 1); 
        this.observacao = observacao;
    }

     // Métodos getters e setters
     public String getRazaoBaixa() {
        return this.observacao;
    }

    public void setRazaoBaixa(String razaoBaixa) {
        this.observacao = razaoBaixa;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Observação: " + observacao);
        System.out.println("=================================");
    }
}