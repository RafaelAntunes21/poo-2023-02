public class TestaLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Imperfeitos", "Christina Lauren", "Faro Editorial", 2022);
        Livro livro2 = new Livro("A Biblioteca da Meia Noite", "Matt Haigan", "Bertrand Brasil", 2020);
        Livro livro3 = new Livro("É assim que acaba", "Collen Hoover", "Galera", 2018);

        System.out.println("\nLivro 1:" + livro1);
        System.out.println("\nLivro 2:" + livro2);
        System.out.println("\nLivro 3:" + livro3);
    }
}
