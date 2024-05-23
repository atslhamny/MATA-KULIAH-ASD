package Tugas204;

public class node {
    int id;
    String judulFilm;
    double rating;

    node prev, next;

    node(node prev, int id, String judulFilm, double rating, node next) {
        this.prev = prev;
        this.id = id;
        this.judulFilm = judulFilm;
        this.rating = rating;
        this.next = next;
    }
}