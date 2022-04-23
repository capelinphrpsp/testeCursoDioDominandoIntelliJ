package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma
{
    public static void main( String args[] )
    {
        final Gato gato = new Gato();
        final int a = 5, b = 3;

        System.out.println( "Hello world !" + Integer.toString( a + b ) );
        System.out.println( gato );
    }
}