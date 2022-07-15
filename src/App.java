import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class App {
  public static void main(String[] args) {

    List<Integer> lista = new ArrayList<>();
    // ordem é garantida
    lista.add(3); // 0
    lista.add(1); // 1
    lista.add(2); // 2

    System.out.println(lista.size()); // tamanho
    System.out.println(lista.get(0)); // 3

    // 2 tipos de for, com índice, ou for each (para cada)
    for (Integer item : lista) { // ESCOPO
      System.out.println(item); // 3, 1, 2
    }

    Set<Integer> conjunto = new HashSet<>();
    // não garante a ordem, não é posicional
    conjunto.add(3);
    conjunto.add(1);
    conjunto.add(2);
    conjunto.add(3);

    System.out.println(conjunto.size());
    System.out.println("Imprimindo o conjunto");
    for (Integer item : conjunto) {
      System.out.println(item);
    }
    // chave String, valor Integer
    Map<String, Integer> idades = new TreeMap<>();
    // chave:Natália -> valor:20
    idades.put("Natália", 20);
    idades.put("Mariana", 24);
    idades.put("Jovita", 19);
    idades.put("Marcio", 45);

    Integer id = idades.get("Jovita");

    System.out.println(id); // 19
    System.out.println(idades.get("Mariana")); // 24

    // Chave, Valor
    Map<Integer, Cliente> cadastro = new HashMap<>();

    cadastro.put(123, new Cliente("Roberto", "88877722233"));
    cadastro.put(192, new Cliente("Maria", "88833322211"));
    cadastro.put(599, new Cliente("Marcelo", "90933311222"));

    System.out.println(formata(cadastro.get(192))); // 2do Cliente
    // back-end, front-end (artes -> User eXperience)


  }

  static String formata(Cliente c) {
    return "Nome: " + c.nome + " CPF: " + c.cpf;
  }
}

class Cliente {
  String nome;
  String cpf;

  Cliente(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }


}



class Texto {
  String autor = "Anônimo";

  void imprime() { // é um método da instância/objeto (requer um new)

  }

  static void formata(String autor) { // é um método da classe/tipo (não requer new)

  }
}
