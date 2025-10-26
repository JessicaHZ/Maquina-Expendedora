public class Billete {
    private int id;
    private String nombre;
    private double precio;
    private int tipoPapel;

    public Billete(int id, String nombre, double precio, int tipoPapel) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.tipoPapel = tipoPapel;
    }

    public int getId() { 
        return id; 
    }

    public String getNombre() { 
        return nombre; 
    }

    public double getPrecio() { 
        return precio; 
    }

    public int getTipoPapel() { 
        return tipoPapel; 
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}


