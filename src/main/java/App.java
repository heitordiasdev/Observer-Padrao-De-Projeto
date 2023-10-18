import principal.Canal;
import principal.ConcretaAssinante;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        var canal = new Canal();

        var listaAssinantes = new ArrayList<ConcretaAssinante>();
        listaAssinantes.add(new ConcretaAssinante("Heitor"));
        listaAssinantes.add(new ConcretaAssinante("Guga"));
        listaAssinantes.add(new ConcretaAssinante("Pedro"));
        listaAssinantes.add(new ConcretaAssinante("Rafael"));

        canal.adicionarAssinantes(listaAssinantes);

        listaAssinantes.forEach(concretaAssinante -> {
            concretaAssinante.assinarCanal(canal);
        });

        canal.upload("Padrão Observer - Primeiro Video");
    }
}
