Algoritmo LIBROS
	precio<-0
	cantidad<-0
	libro<-1
	resultado<-0
	D<-0
	Escribir "/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/"
	Escribir "              Bienvenido"
	Escribir "/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/"
	
	Escribir "En esta libreria deberas indicarme cunatos libros compras y su precio"
	Escribir "¿Cuantos libros llevas?"
	Leer cantidad
	Mientras libro<=cantidad Hacer
		Escribir "Dame el precio del libro #", + libro
		Leer precio
		resultado<-resultado+precio
	     libro<-libro+1
	Fin Mientras

	Si resultado>1000 Entonces
		resultado<-resultado-(resultado*0.20)
		Escribir "Tu Total a pagar es de: $",+resultado
		
	SiNo
		Escribir "Tu Total a pagar es de: $",+resultado
	Fin Si
FinAlgoritmo
