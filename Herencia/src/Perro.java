public class Perro extends Animal {

    private boolean tieneCola;
    private boolean tieneOrejas;
    private String raza;
    public Perro(String nombre, double peso, boolean tienePatas, boolean tieneOjos, boolean tieneCola, boolean tieneOrejas, String raza) {
        super(nombre, peso, tienePatas, tieneOjos);
        this.tieneCola=tieneCola;
        this.tieneOrejas=tieneOrejas;
        this.raza=raza;
    }
    //aplicando polimorfismo
    @Override
    public void Comer(){
        System.out.println("El perro esta comiendo");
    }
}
