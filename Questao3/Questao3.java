public class Questao3 {
  public static void main(String [] args)throws Exception {
Aviao aviao = new Aviao();
aviao.setAltitude(10);
aviao.setVelocidade(900);

System.out.println("\nVelocidade atual: "+aviao.getVelocidade()+" km/h ");
System.out.println("Altitude atual: "+aviao.getAltitude()+"km\n");
  
aviao.reduzirVelocidade();
aviao.reduzirAltitude();

System.out.println("Velocidade reduzida");
System.out.println("Altitude reduzida");

System.out.println("\nVelocidade atual: "+aviao.reduzirVelocidade()+"km/h");
System.out.println("Altitude atual: "+aviao.reduzirAltitude()+"km\n");
  }
}
