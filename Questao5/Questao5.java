public class Questao5 {
    public static void main(String[] args) throws Exception {
        Contato contato = new Contato();
        contato.setNome ("Parede1");
        
       contato.recebeMensagem("Eita bicho ruim!!!!");


        System.out.println("Voce tem " + contato.getQuantidade() + " mensagens nao lidas com "
                + contato.getNome() + "!");

        contato.enviar("OOOOOOOOOOOOOOO");
        contato.enviar("COMO QUE EU FALO COM VC ");
        contato.enviar("5 DIAS DEPOIS VC ME RESPONDE");
        contato.enviar("VC EXIGE MINHA RESPOSTA IMEDIATA");
        contato.enviar("E ME CHAMA DE RUIM?");


        
        System.out.println("Voce tem " + contato.getQuantidade() + " mensagens não lidas com "
                + contato.getNome() + "!");

      
        
        contato.mostrarNaoLidas();

     
        
        System.out.println("Voce tem " + contato.getQuantidade() + " mensagens não lidas com "
                + contato.getNome() + "!");

    }
}
