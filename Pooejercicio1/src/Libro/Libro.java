/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

/**
 *Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas
 * @author Lenovo
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int pagina;

    public Libro() {
    }

    public Libro(String nombre, String titulo, String autor, int pagina) {
        this.isbn = nombre;
        this.titulo = titulo;
        this.autor = autor;
        this.pagina = pagina;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String nombre) {
        this.isbn = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", pagina=" + pagina + '}';
    }

}
