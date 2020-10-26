Algoritmo Calificaciones
	Definir calif Como Entero
	Definir nombre Como Caracter
	Definir fcalif Como Caracter
	n<-0

	Escribir Sin Saltar "Dime cuantos alumnos deseas calificar: "
	Leer n
	Dimension nombre[n]
	Dimension calif[n]
	Dimension fcalif[n]
	
   Para i<-1 Hasta n Hacer
		Escribir Sin Saltar "Ingresa el nombre del alumno #", i ": "
		Leer nombre[i]
		Escribir Sin Saltar "Ingresa su calificación"
		Leer calif[i]
	Mientras calif[i]<1 o calif[i]>20 Hacer
		Escribir "Ese valor es invalido, insertelo de nuevo por favor: "
		Leer calif[i]
	Fin Mientras
	Si calif[i]==19 o calif[i]=20 Entonces
		fcalif[i]<-"A"
	SiNo
		Si calif[i]==16 o calif[i]=17 o calif[i]=18 Entonces
			fcalif[i]<-"B"
		SiNo
			Si calif[i]==13 o calif[i]=14 o calif[i]=15 Entonces
				fcalif[i]<-"C"
			SiNo
				Si calif[i]==10 o calif[i]=11 o calif[i]=12 Entonces
					fcalif[i]<-"D"
				SiNo
					Si calif[i]<=9 y calif[i]>=1 Entonces
						fcalif[i]<-"E"
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
   Fin Para
   Para i<-1 Hasta n  Hacer
	   Escribir "#", i, "  ", nombre[i], ":  ", fcalif[i]
   Fin Para
FinAlgoritmo
