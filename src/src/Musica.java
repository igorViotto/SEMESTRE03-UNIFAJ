public class Musica {
    private String titulo;
    private String artista;
    private float duracao;
    private String genero;

    // Construtor da classe Musica
    public Musica(String titulo, String artista, float duracao, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.genero = genero;
    }

    // Método para exibir detalhes da música
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duração: " + duracao + " min");
        System.out.println("Gênero: " + genero);
        System.out.println("------------------------");
    }
}