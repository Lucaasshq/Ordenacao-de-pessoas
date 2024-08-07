public class Usuario {
    public static void main(String[] args) {
        OrdenacaoPessoasRepository ordenacaoPessoas = new OrdenacaoPessoasRepository();

        ordenacaoPessoas.adicionarPessoa("Lucas", 20, 1.65);
        ordenacaoPessoas.adicionarPessoa("Matheus", 24, 1.66);
        ordenacaoPessoas.adicionarPessoa("Priscila", 36, 1.55);
        ordenacaoPessoas.adicionarPessoa("Gerson", 22, 1.60);

        System.out.println("Ordenado por idade");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println("Ordenado por Altura");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
