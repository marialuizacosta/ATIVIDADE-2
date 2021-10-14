public class Produto{
private String nome;
private float preco;
private int quantidade;


public String getNome(){
  return nome;
}
public void setNome(String nome){
  this.nome = nome;
}
public float getPreco(){
  return preco;
}
public void setPreco(float preco){
  this.preco = preco;
}
public int getQuantidade(){
  return quantidade;
}
public void setQuantidade( int quantidade){
  this.quantidade = quantidade;
}
 

 public void comprar() {
        if (this.quantidade > 0) {
            this.quantidade = this.quantidade - 1;
            System.out.println("COMPRADO");
        } else {
            System.out.println("ACABOU");
        }

}

}
