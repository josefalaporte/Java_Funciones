public class MetInstancia {

    private int number;

    public MetInstancia(int num){
        this.number = num;
    }

    public void printNumber(){
        System.out.println("The number is : " + number);
    }

    public static void main(String[] args) {
        MetInstancia example = new MetInstancia(56);
        example.printNumber();
    }
}

/* Metodo instancia
Estos métodos pertenecen a una instancia particular de la clase y actúan sobre los datos de esa instancia.
Se llaman en el contexto de un objeto y pueden acceder a las variables de instancia.
Se definen sin la palabra clave static. */
