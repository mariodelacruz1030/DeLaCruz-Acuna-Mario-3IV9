Algoritmo MAY_MEN3
	A<-0
	B<-0
	C<-0
	Escribir "Escribe el primer valor: "
	Leer A
	Escribir "Escribe el segundo valor: "
	Leer B
	Escribir "Escribe el tercer valor: "
	Leer C
	
	Mientras A=B o B=C o C=A Hacer
		Escribir "Los valores no pueden ser iguales, por favor cambialos"
		Escribir "El primer valor es: "
		Leer A
		Escribir "El segundo valor es: "
		Leer B
		Escribir "El tercer valor es: "
		Leer C
	Fin Mientras
	
	Si A>B y A>C Entonces
		Escribir "El mayor numero es: ", A
		Si B>C Entonces
			Escribir "El menor numero es: ", C
			
		SiNo
			Escribir "El menor numero es: ", B
		Fin Si
	SiNo
		Si B>A y B>C Entonces
			Escribir "El mayor numero es: ", B
			Si A>C Entonces
				Escribir "El menor numero es: ", C
				
			SiNo
				Escribir "El menor numero es: ", A
			Fin Si
		SiNo
			Si C>A y C>B Entonces
				Escribir "El mayor numero es: ", C
				Si A>B Entonces
					Escribir "El menor numero es: ", B
				SiNo
					Escribir "El menor numero es: ", A
				Fin Si
			Fin Si
		FinSi
	Fin Si
FinAlgoritmo