
public class Mainn {
	public static void main(String[] args) {
		Documento doc = new Documento();
		doc.setTexto("IFC POO");
		System.out.println(doc);
		Impressora imp = new Impressora();
		imp.imprimir(doc);
	}
}
