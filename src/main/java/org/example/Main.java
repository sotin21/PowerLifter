public class Main {
    public static void main(String[] args) {
        powerlifter lifter = new powerlifter("Seba Soto", 21, 82.5, 60.0, 80.0, 100.0);
        System.out.println("Nombre: " + lifter.getNombre());
        System.out.println("Edad: " + lifter.getEdad());
        System.out.println("Peso: " + lifter.getPeso());
        System.out.println("Marca en press de banca: " + lifter.getMarcaPressBanca());
        System.out.println("Marca en sentadilla: " + lifter.getMarcaSentadilla());
        System.out.println("Marca en peso muerto: " + lifter.getMarcaPesoMuerto());
    }
}