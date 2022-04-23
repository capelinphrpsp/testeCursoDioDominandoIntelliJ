package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma
{
    public static void main( String args[] )
    {
        final Gato gato = new Gato();
        final Livro livro = new Livro("Poliana moça", 1500);
        final int a = 5, b = 3;

        System.out.println( "Hello world !" + Integer.toString( a + b ) );
        System.out.println( gato );
        System.out.println( livro );
    }
}

class Livro
{
    private String titulo;
    private int paginas;

    public Livro(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return paginas == livro.paginas && Objects.equals(titulo, livro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}