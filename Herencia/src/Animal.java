public class Animal {
    private String nombre;
    private double peso;
    private boolean tienePatas;
    private boolean tieneOjos;

    public Animal(String nombre, double peso, boolean tienePatas, boolean tieneOjos) {
        this.nombre = nombre;
        this.peso = peso;
        this.tienePatas = tienePatas;
        this.tieneOjos = tieneOjos;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public boolean getTienePatas() {
        return tienePatas;
    }
    public void setTienePatas(boolean tienePatas) {
        this.tienePatas = tienePatas;
    }
    public boolean getTieneOjos() {
        return tieneOjos;
    }
    public void setTieneOjos(boolean tieneOjos) {
        this.tieneOjos = tieneOjos;
    }
    
    public void Comer(){
        System.out.println("El animal esta comiendo");
    }
    public void Moverse(){
        System.out.println("");
    }
}
