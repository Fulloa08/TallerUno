# TallerUno
descripción de su solución, métodos y como los usará.
La solución consiste en un programa que administra y visualiza el contenido de una matriz
*Métodos*
dimensiónMatriz : toma como parámetros las dimensiones ingresadas por el usuario de número de filas y columnas.
Crea una matriz vacia con dimensiones entregadas anteriormente por el usuario, retorna una matriz.
validarDimensiones: método que valide si la matriz creada es de las dimensiones dadas por el usuario y verificar que los datos dados por el usario sean mayor que 1. retorna un booleano
crearMatriz: una vez que haya pasado por validar Dimensiones, se crea la matriz. Retorna una matriz.
llenarMatriz: luego de crear la Matriz se llena con valores aleatorios usando Math.random. No se retorna nada, es tipo Void.
mostrarFila: muestra una fila de la matriz que desee el usuario. Retorna un vector con la fila que quiera ver el usuario.
matrizCero: Recorre la amtriz para saber si es que el 50% de los datos contenidos en la matriz son Cero, si es que es así retorna 0 si es que no es así y de lo contrario, un 1.
menu : printeo de las opciones que pueda ingresar el usuario. No retorna nada, solo printea. Es Void.
validarOpcion: recibe un Scanner del usuario y llama a los métodos que solicite el usuario según las opciones que hayan disponibles. No retorna nada, es Void.

