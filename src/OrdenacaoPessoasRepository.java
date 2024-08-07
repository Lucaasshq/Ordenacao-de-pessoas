import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoPessoasRepository {
    private final List<Pessoas> listaPessoas;

    public OrdenacaoPessoasRepository() {
        listaPessoas = new ArrayList<Pessoas>();
    }

    public void adicionarPessoa( String nome, int idade, double altura) {
        listaPessoas.add(new Pessoas(nome, idade, altura));
    }

    public List<Pessoas> ordenarPorIdade() {
        List<Pessoas> pessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoas> ordenarPorAltura() {
        List<Pessoas> pessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
}
