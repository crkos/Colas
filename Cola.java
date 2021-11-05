import java.util.zip.DataFormatException;

public class Cola {
	int espacio[];
	int frente, fin, cantidad, maximo;

    public Cola(int tamanio) {
		cantidad = 0;
		frente = 0;
		maximo = tamanio;
		fin = -1;
		espacio = new int[maximo];
	}

	public boolean vacia(){
		if(cantidad == 0){
			System.out.println("La cola esta vacia");
			return true;
		}else{
			System.out.println("La cola no esta vacia");
			return false;
		}
	}

	public boolean llena(){
		if(cantidad == maximo){
			System.out.println("La cola esta llena");
			return true;
		}else{
			System.out.println("La cola no esta llena");
			return false;
		}
	}

	public void push(int dato) {
		if(llena()){
			System.out.println("La cola está llena, no se pueden insertar mas datos");
		}else{
			if(fin+1 >= maximo){
				fin = 0;
			}else{
				fin = fin+1;
			}
			espacio[fin] = dato;
			cantidad++;
			System.out.println("Se inserto el dato en la pila");
		}
	}

	public int pop(){
		int datoExtraido = 0;
		if(vacia()){
			System.out.println("La cola esta vacia, no se puede sacar un dato");
		}else{
			datoExtraido = espacio[frente];
			cantidad--;
			if(frente+1 >= maximo){
				frente = 0;
			}else{
				frente++;
			}
			System.out.println("Dato extraido de la cola: "+datoExtraido);
			
		}
		return datoExtraido;
		
	}
	
	public int frente(){
		int primerElemento = 0;
		if(vacia()){
			System.out.println("La cola esta vacia");
		}else{
			
			primerElemento = espacio[frente];
			System.out.println("El frente es: "+primerElemento);
		}
		return primerElemento;
	}

	public int fin() {
		int finElemento = 0;
		if(vacia()){
			System.out.println("La cola esta vacia");
		}else{
			
			finElemento = espacio[fin];
			System.out.println("El fin es: "+finElemento);
		}
		return finElemento;
	}

	public void vaciar() {
		fin = -1;
		frente = 0;
		cantidad = 0;
		System.out.println("Se ha vaciado la cola");
	}

	public int tamano(){
		System.out.println("El tamano de la cola es: "+cantidad);
		return cantidad;
	}


}