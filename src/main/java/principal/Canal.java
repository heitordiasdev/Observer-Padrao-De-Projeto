package principal;

import interfaces.Assinante;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Canal {

    private List<ConcretaAssinante> assinantes;
    private String titulo;

    public Canal(){
        this.assinantes = new ArrayList<>();
    }

    public void adicionarAssinantes(List<ConcretaAssinante> assinantes){
        this.assinantes = assinantes;
    }

    public void removerAssinantes(ConcretaAssinante concretaAssinante){
        this.assinantes.remove(concretaAssinante);
    }

    public void notificarAssinantes(){
        this.assinantes.forEach(ConcretaAssinante::update);
    }

    public void upload(String titulo){
        this.titulo = titulo;
        notificarAssinantes();
    }



}
