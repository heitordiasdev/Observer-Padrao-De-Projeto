package principal;

import interfaces.Assinante;

public class ConcretaAssinante implements Assinante {

    private String nome;
    private Canal canal;

    public ConcretaAssinante (String nome){
        this.nome = nome;
    }

    public void assinarCanal(Canal canal){
        this.canal = canal;
    }

    @Override
    public void update() {
        System.out.println(nome +
                ", um novo vídeo foi upado"+
                " ao canal!! " + canal.getTitulo());
    }
}
