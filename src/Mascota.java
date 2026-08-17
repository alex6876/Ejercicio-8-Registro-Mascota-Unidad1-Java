public class Mascota {

    String nombre;
    String especie;
    int edad;


    public Mascota(String nombre, String especie, int edad) {

        this.edad = edad;
        this.nombre = nombre;
        this.especie = especie;

    }

    public void Incremento(){

        edad++;

    }

    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Especie: "+especie);
        System.out.println("Edad: "+edad+" años");
    }

    public static void main(String[] args) {

        Mascota mascota = new Mascota("Simón", "Pitbull", 4);
        mascota.mostrar();
        mascota.Incremento();

        System.out.println("================= 1 año después =================");

        mascota.mostrar();
        mascota.Incremento();

        System.out.println("================= 2 año después =================");
        mascota.mostrar();
        mascota.Incremento();

        System.out.println("================= 3 año después =================");
        mascota.mostrar();
    }
}
