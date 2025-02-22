public class Musica {
    String titulo;
    float duracao;
    String artista;
    String genero;

    //construtor padrao
    public Musica(){

    }

    public Musica(String titulo, String artista, float duracao, String generoMusica) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.artista = artista;
        this.genero = generoMusica;
    }
}
