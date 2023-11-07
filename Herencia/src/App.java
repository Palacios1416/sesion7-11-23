public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("Pescado", 20.00, false, true);
        Perro yupi = new Perro("Yupi", 15, true, true, true, true, "Chaw Chaw");
        
        animal.Comer();
        yupi.Comer();

        
    }
}
