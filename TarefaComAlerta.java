public class TarefaComAlerta extends Tarefa implements Notificacao {

    public TarefaComAlerta(String titulo, String descricao, String prazo, int prioridade) {
        super(titulo, descricao, prazo, prioridade);
        this.enviarNotificacao();
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Alerta: A tarefa '" + super.getTitulo() + "' foi criada com sucesso!");
    }
}
