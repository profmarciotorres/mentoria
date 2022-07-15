// import br.edu.ifsul.bcc.too.base.topico3.Colecoes;
// import br.edu.ifsul.bcc.too.base.topico3.util.Aluno;
// import br.edu.ifsul.bcc.too.base.topico3.util.Carro;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author telmo
 */
public class Exercicio7 {


    Exercicio7(){

        exer71();
    }

    public void exer71(){

          /*
        7.1) Codifique uma classe chamada: Carro. Essa classe deve ter os seguintes atributos: nome, modelo, fabricante, numero do chassi  e valor de mercado.
           O construtor (público) deverá receber dados para inicializar todos esses atributos. Sobrescreva o método toString para retornar o codigo e modelo.
           Na classe Exercicio7 crie um novo método para realizar os seguintes
             procedimentos: criar e inicializar cinco objetos da
            classe Carro.
           Adicione-os em uma lista da interface Map ordenada. Ao adicionar defina uma chave sequencial. Imprima na tela a listagem de carros.
    */


          Carro c = new Carro("Fusca",
                              "1300L", "VW",
                              "123abc", 7500.0f);

          System.out.println(c.toString()); // Carro@1f3a452
          System.out.println(c); // toString
          System.out.println(c.getModelo()); // 1300L

          Carro c1 = new Carro("Passsat",
                               "pointer", "VW",
                               "923abc", 9500F);

                               // Chave, Valor
          Map<Integer, Carro> mapCarros = new HashMap<>();
          // o Carro 1 é o c
          // o Carro 2 é o c1
           mapCarros.put(1, c); // Fusca
           mapCarros.put(2, c1);
           mapCarros.put(1, new Carro("Onix", "LT", "Chevrolet", "3423", 80000F));


           mapCarros.get(1); // Onix

           Collection<Carro> valores = mapCarros.values();
           for (Carro cadaCarro : valores) {
            System.out.println(cadaCarro);
           }

           Set<Integer> chaves = mapCarros.keySet();

           for (Integer cadaChave : chaves) System.out.println(cadaChave); // 1, 2


           //System.out.println(mapCarros);

           System.out.println("Modelo do carro - codigo 1: " +
                               mapCarros.get(1));
           System.out.println("Modelo do carro - codigo 2: " +
                               mapCarros.get(2));

           SortedMap<Integer, Carro> carros = criarCincoCarros();

           // pega as chaves e os valores -> entrada é a chave/valor juntos!
           Set<Entry<Integer, Carro>> entradas = carros.entrySet();

           for (Entry<Integer, Carro> ent : entradas) { // percorrer as entradas
            // 1 -> Carro
            // 2 -> Carro
            // 3 -> Carro
            System.out.println(ent.getKey() + " " + ent.getValue());
           }

           List<Pneu> pneus = new ArrayList<>();
           pneus.add(new Pneu()); // C
           pneus.add(new Pneu()); // J
           pneus.add(new Pneu()); // A

           System.out.println(pneus); // C J A (ordem garantida)

           Collections.sort(pneus);

           System.out.println(pneus); // A C J (classificado)

      }

      SortedMap<Integer, Carro> criarCincoCarros() {
        // Map = HashMap // sem classificação
        SortedMap<Integer, Carro> mapa = new TreeMap<>(); // com classificação

        for (int i = 1; i <= 5; i++) {
          mapa.put(i, new Carro("Carro " + i, "Modelo " + i, "Fabricante " + i, "Numero " + i, i * 10000F));
        }

        return mapa;

      }

  /*


        7.2) Codifique uma classe chamada: Pneu. Essa classe deve ter os seguintes atributos: codigo, modelo, posição, medida, fabricante e valor.
           O construtor (público) deverá receber dados para inicializar todos esses atributos. Sobrescreva o método toString para retornar o codigo e modelo.
           Na classe Exercicio7 crie um novo método para realizar os seguintes procedimentos: criar e inicializar quatro objetos da classe Pneu.
           Adicione-os em uma lista. Implemente um mescanismo para classificar os objetos contidos nessa lista pelo modelo (descendente).
           Imprima na tela dos Pneus.


        7.3) Altere a classe Carro incluindo um atributo para armazenar uma lista de Pneus. Na classe Exercicio7 crie um novo método para realizar os seguintes procedimentos:
             criar e inicializar três objetos do tipo Carro. Para cada objeto do tipo Carro, adicione outros 4 objetos do tipo Pneu. Imprima na tela a lista de Carros e os seus respectivos Pneus.

    */


    public static void main(String[] args) {

         new Exercicio7();
    }

}


class Pneu implements Comparable<Pneu> { // tornando o Pneu comparável/classificável
  Integer codigo;
  String modelo;


  @Override
  public int compareTo(Pneu outroPneu) { // 5
    Pneu estePneu = this; // 3
    // return outroPneu.modelo.compareTo(estePneu.modelo);
    return estePneu.modelo.compareTo(outroPneu.modelo);
  }
}
// 3 compareto 5 = -1
// 5 compareto 3  = +1


// -1, 0, +1

class Poupanca implements Comparable<Poupanca> {
  long saldo; // inteiro longo primitivo (não é objeto)

  @Override
  public int compareTo(Poupanca outra) {
    if (this.saldo > outra.saldo) return 1;
    if (this.saldo < outra.saldo) return -1;
    return 0;
  }
}
/*
 * poup1 = Poupanca(400)
 * poup2 = Poupanca(500)
 * Poupanca(100)
 * Poupanca(700)
 *
 * poup1.compareTo(poup2) ? -1
 * poup2.compareTo(poup1) ? 1
 *
 * if (poup1.compareTo(poup2) == 0) {
 *   println(poups tem o mesmo saldo)
 * }
 *
 */
