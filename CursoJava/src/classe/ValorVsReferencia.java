package classe;

public class ValorVsReferencia {
	int a = 2;
	int b = a; // passagem por valor
	int c; // valor 0 na mem�ria
	
	Object a = new Object();
	Object b = a; // passagem por refer�ncia
	Object c; // null
}
