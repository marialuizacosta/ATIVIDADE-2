public class Contato {
    private String nome;
    private int quantidade;
    private String enviadas;
    private String recebidas;
    private String naoLida;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNaoLida() {
        return naoLida;
    }
    public void setNaoLida(String naoLida){
        this.naoLida = naoLida;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }
    
    public String getEnviadas() {
        return enviadas;
    }
    public void setEnviadas(String enviadas) {
        this.enviadas = enviadas;
    }

    public String getRecebidas() {
        return recebidas;
    }
    public void setRecebidas(String recebidas) {
    this.recebidas = recebidas;
    }
    public void recebeMensagem(String zapp) {
      System.out.println("Última mensagem enviada para o contato Parede1:\n Eita bicho ruim!!!!");
        setRecebidas(this.getRecebidas() + zapp + "\n");
    }

    public void enviar(String zapp) {
        System.out.println("-Bzzzzz-Bzzzzz-");
        this.quantidade += 1;
        this.enviadas += zapp + "\n";
        setNaoLida(this.getNaoLida() + zapp + "\n");

    }

    public void mostrarNaoLidas() {
        System.out.println(this.getNome()+ " te enviou: ");
        System.out.println(getNaoLida());
        setQuantidade(0);
        setNaoLida("");

    }
  

}
