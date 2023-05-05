package view;

import docarmo.listaEncadeadaInt.Lista;

public class main {

	public static void main(String[] args) {

		Lista l = new Lista();

		l.addFirst(3);
		try {
			l.addLast(5);
			l.addLast(18);
			l.addLast(12);
			l.addLast(9);
			l.addLast(7);
			l.addLast(6);
			l.addLast(2);
			l.addLast(13);
			l.addLast(4);
			l.addLast(16);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int tam = l.size();
		
		while(tam > 0) {
			try {
				int valor = l.get(tam - 1);
				tam--;
				System.out.println(valor);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
