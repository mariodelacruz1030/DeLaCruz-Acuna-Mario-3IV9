Algoritmo sin_titulo
	Definir num Como Real
	Definir cont Como Entero
	
		Escribir "Digame un numero para saber si es primo"
		Leer num 
		
		Para i<-1 Hasta num Hacer
			Si num%i=0 Entonces
				cont<-cont+1
				
			FinSi
		Fin Para
		Si cont=2 Entonces
			Escribir num, " es primo"
		SiNo
			Escribir num, " no es primo"
		FinSi
FinAlgoritmo
