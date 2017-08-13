package classe;

public class ValorVsReferencia {
	int a = 2;
	int b = a; // passagem por valor
	int c; // valor 0 na memória
	
	Object a = new Object();
	Object b = a; // passagem por referência
	Object c; // null
}
