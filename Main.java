import java.util.Scanner;


public class Main {
public static void main(String[] args) throws Exception{
    int seleccion = 0;
    Scanner in = new Scanner(System.in);

    Cola cola = new Cola(5);
    
    do {
        System.out.println("\nMenu:"
                + "\n1.- Insertar dato en la cola"
                + "\n2.- Quitar dato de la cola"
                + "\n3.- Checar si esta vacia la cola"
                + "\n4.- Checar si esta llena la cola"
                + "\n5.- Mostrar el frente de la cola"
                + "\n6.- Vaciar la cola"
                + "\n7.- Mostrar el tamaño de la cola"
                + "\n8.- Mostrar el fin de la cola"
                + "\n0.- Salir");
        System.out.println("Seleccion: ");
        seleccion = in.nextInt();
        System.out.println("");

        switch(seleccion)
        {
        case 1:
        
            int insertar;
            System.out.print("Escribe el numero a insertar: ");
            insertar = in.nextInt();
            cola.push(insertar);
            break;
        case 2:
            cola.pop();

            break;
        case 3:
            cola.vacia();
            break;
        case 4:
            cola.llena();
            break;
        case 5:
             cola.frente();
            break;
        case 6:
            cola.vacia();
            break;
        case 7:
            cola.tamano();
            break;
        case 8:
            cola.fin();
            break;
        }
    }while(seleccion!=0);



    }
}