# Liga_Basket
Una liga de basket nos pide realizar un sistema para obtener ciertas estadísticas sobre los equipos y jugadores. Uso de objetos y ArrayList : búsquedas, recorridos y operaciones con la mismas.


Una liga de basket nos pide realizar un sistema para obtener ciertas estadísticas sobre los equipos y
jugadores que participan actualmente de la misma.

De cada equipo se conoce su nombre y un listado de jugadores.

Por cada jugador contamos con los siguientes atributos:
● numero : int (se supone único en cada equipo)
● apellido: string
● nombre: string
● posicion: Posicion (valores posibles: BASE, ESCOLTA, ALERO, PIVOT, ALA_PIVOT)
● valoración : entero (entre 50 y 100)


Un equipo nunca puede tener más de 18 jugadores inscriptos en su plantilla.

Desarrollar:

● Método Público agregarJugador(): Recibe todos los datos necesarios y agrega un jugador al
equipo. Retorna un booleano de confirmación.

● Método privado buscarJugador(): Recibe el número de un jugador. Si lo encuentra lo retorna,
de no encontrarlo devuelve null.

La clase Liga contará con un nombre, un listado de equipos y deberá incluir los siguientes métodos:
● Método público agregarEquipo(): Recibe todos los datos necesarios y agrega un equipo a la
liga. Retorna un booleano de confirmación.

● Método privado buscarEquipo(): Recibe el nombre de un equipo. Si lo encuentra lo retorna,
de no encontrarlo devuelve null.

● Método público competir() : Recibe dos nombres de equipos (el primero es local y el segundo
es el visitante) y, si ambos existen en la liga, debe retornar cuál sería el resultado
eventualmente (LOCAL, VISITANTE) basándose en las valoraciones de sus jugadores (si
hubiera empate en las valoraciones se adjudica al local). Si no existiera algún equipo, debe
retornar PARTIDO_INEXISTENTE.

● Método público mostrarAllStar() : Imprime por pantalla los mejores 5 jugadores de toda la liga
(1 por cada posición)

