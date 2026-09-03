Markdown.

¿Que es Markdown?

1. Markdown es un lenguaje de marcado ligero que permite dar formato a 
texto plano (legible en cualquier dispositivo) de forma sencilla y legible, 
convirtiéndose fácilmente en HTML. 
Su sintaxis es muy sencilla, intuitiva y potente, ya que está formada por 
caracteres simples fáciles de recordar (por ejemplo, #, *, [], etc). 
Es muy usado en GitHub, documentación técnica, blogs, foros, notas 
personales y últimamente para interactuar con sistemas de IA. 
Los documentos Markdown son simplemente archivos de texto plano 
con extensión .md. 
Puedes escribir Markdown desde cualquier editor de texto, aunque 
también existen herramientas especializadas y soporte dentro de 
cualquier editor de código (que cuentan con vistas previas para 
visualizar el resultado del texto formateado en Markdown).

Git

1. ¿Qué es un repositorio en Git y como se diferencia de un prooyecto "Normal"

-Un repositorio en Git es una carpeta de proyecto que practicamente pues Git controla y en la que registra el historialcompleto de cambios de los archivos a lo largo del tiempo. A diferencia de un proyecto pues "Normal" (una carpeta común sin control de versiones), es un repositorio permite volver a versiones anteriores, comparar cambios, trabajar en paralelo mediante ramas y colaborar con otras personas sin perder el historial de modificaciones.

2.¿Cuáles son las tres áreas principales de Git y qué papel cumple cada una?

-Working directory (directorio de trabajo): es la carpeta real del proyecto donde se editan los archivos

-Stanging area/index: es una zona intermedia donde se colocan los cambios que se quieren incluir en el proximo commit (mediante git add)

-Repository (Repositorio): es donde Git guarda de forma permanente el historial de commits, una vez confirmados con git commit.


3. ¿Cómo representa Git los cambios internamente?(blob,tree,commit,tag)

-Blob:Almacena el contenido de un archivo(sin su nombre ni metadatos).

Tree: representa una carpeta; enlaza blobs y otros trees, guardando la estructura de directorios.
Commit: apunta a un tree específico (el estado del proyecto en ese momento) y guarda metadatos como autor, fecha, mensaje y el commit padre.
Tag: es una referencia fija que apunta a un commit específico, normalmente usada para marcar versiones (ej. v1.0).

4. ¿Cómo se crea un commit y qué información almacena un objeto commit?

Un commit se crea con git commit -m "mensaje", después de haber añadido los cambios al staging area con git add. Un objeto commit almacena: el snapshot del proyecto (referencia a un tree), el o los commits padres, el autor y la fecha, y el mensaje descriptivo del cambio.

5. ¿Cuál es la diferencia entre git pull y git fetch?

git fetch descarga los cambios del repositorio remoto, pero no los mezcla con la rama local (solo actualiza las referencias remotas). git pull hace lo mismo que fetch, pero además fusiona automáticamente esos cambios con la rama local en la que se está trabajando.

6. ¿Qué es un branch (rama) en Git y cómo gestiona Git los punteros a commits?

Un branch es una línea independiente de desarrollo dentro de un repositorio; permite trabajar en nuevas funcionalidades sin afectar la rama principal. Internamente, una rama es simplemente un puntero (referencia) que apunta al último commit de esa línea de trabajo. Cuando se hace un nuevo commit, el puntero de la rama activa se mueve automáticamente al nuevo commit.

7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?

Un merge se realiza con git merge nombre-rama, combinando los cambios de una rama con la rama actual. Pueden surgir conflictos cuando el mismo archivo (o la misma línea) fue modificado de forma distinta en ambas ramas. Git marca esas zonas en el archivo con <<<<<<<, ======= y >>>>>>>. Para resolverlos, hay que editar manualmente el archivo eligiendo qué cambios conservar, luego hacer git add sobre el archivo resuelto y finalmente git commit para cerrar el merge.

8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?

git add mueve los cambios del directorio de trabajo al staging area, marcándolos como listos para ser incluidos en el próximo commit. Si se omite este paso, los cambios seguirán existiendo en los archivos pero git commit no los incluirá, ya que Git solo confirma lo que está en el staging area.

9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?

Es un archivo de texto donde se especifican patrones de archivos o carpetas que Git debe ignorar (no rastrear ni incluir en los commits), como archivos temporales, compilados o de configuración local. Esto evita que se suban al repositorio archivos innecesarios o sensibles.

10. ¿Cuál es la diferencia entre un "commit amend" (--amend) y un nuevo commit?

git commit --amend modifica el último commit ya realizado (permite cambiar su mensaje o añadirle cambios adicionales), reemplazándolo por uno nuevo con el mismo padre. Un commit nuevo, en cambio, se añade al historial como un paso adicional, sin alterar los commits anteriores.

11. ¿Cómo se utiliza git stash y en qué escenarios es útil?

git stash guarda temporalmente los cambios no confirmados del directorio de trabajo, dejándolo limpio como si no hubiera cambios pendientes. Es útil cuando se necesita cambiar de rama rápidamente sin perder el trabajo en progreso ni tener que hacer un commit incompleto. Luego se pueden recuperar los cambios con git stash pop.

12. ¿Qué mecanismos ofrece Git para deshacer cambios? (reset, revert, checkout)
git reset: mueve el puntero de la rama a un commit anterior, pudiendo conservar o descartar los cambios según la opción usada (--soft, --mixed, --hard).
git revert: crea un nuevo commit que deshace los cambios de un commit anterior, sin eliminar el historial.
git checkout: permite descartar cambios no confirmados en archivos específicos, o cambiar entre ramas/commits.
13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos se usan para forks?

Un remoto es una referencia a una URL de un repositorio externo. origin normalmente apunta al repositorio propio del que se clonó el proyecto, mientras que upstream suele apuntar al repositorio original cuando se trabaja sobre un fork. Se configuran con git remote add nombre URL, se pueden ver con git remote -v, y para sincronizar un fork con el original se usa git fetch upstream seguido de un merge o rebase.

14. ¿Cómo puedo inspeccionar el historial de commits? (git log, git diff, git show)
git log: muestra el historial de commits (autor, fecha, mensaje).
git diff: muestra las diferencias entre el directorio de trabajo, el staging area o distintos commits.
git show: muestra el contenido detallado y los cambios introducidos por un commit específico.
Programación (Java)
15. ¿Cuáles son los tipos de datos primitivos en Java?

byte, short, int, long, float, double, char y boolean.

16. ¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en Java?

if/else permiten ejecutar bloques de código según se cumpla o no una condición booleana. switch evalúa una variable contra varios valores posibles y ejecuta el bloque correspondiente. Los bucles (for, while, do-while) permiten repetir un bloque de código mientras se cumpla una condición, siendo for ideal cuando se conoce el número de iteraciones y while/do-while cuando depende de una condición dinámica.

17. ¿Por qué es importante usar nombres significativos para variables y métodos?

Porque hacen el código más legible y fácil de mantener, tanto para uno mismo como para otras personas que trabajen en el mismo proyecto. Un buen nombre describe claramente el propósito de la variable o método, reduciendo la necesidad de comentarios adicionales y previniendo errores de interpretación.

18. ¿Qué es la Programación Orientada a Objetos (POO)?

Es un paradigma de programación que organiza el código en torno a "objetos", que combinan datos (atributos) y comportamientos (métodos), modelando entidades del mundo real o del dominio del problema mediante clases.

19. ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos?
Encapsulamiento: ocultar los detalles internos de un objeto y exponer solo lo necesario.
Herencia: permite que una clase herede atributos y métodos de otra.
Polimorfismo: permite que un mismo método se comporte de forma distinta según el objeto que lo invoque.
Abstracción: permite modelar entidades complejas centrándose solo en sus características esenciales.
20. ¿Qué es la herencia en POO y cómo se utiliza en Java?

La herencia permite que una clase (subclase) adquiera atributos y métodos de otra clase (superclase), promoviendo la reutilización de código. En Java se implementa con la palabra clave extends, por ejemplo: class Perro extends Animal { }.

21. ¿Qué son los modificadores de acceso y cuáles son los más comunes en Java?

Son palabras clave que controlan la visibilidad de clases, atributos y métodos. Los más comunes en Java son:

public: accesible desde cualquier lugar.
private: accesible solo dentro de la misma clase.
protected: accesible dentro del mismo paquete y por subclases.
(sin modificador, "default"): accesible solo dentro del mismo paquete.
22. ¿Qué es una variable de entorno y por qué son importantes para Java o la programación en general?

Una variable de entorno es un valor configurado a nivel del sistema operativo que los programas pueden consultar, como rutas de instalación o configuraciones del sistema. En el caso de Java, la variable PATH es fundamental porque le indica al sistema dónde encontrar los ejecutables java y javac, permitiendo compilar y ejecutar programas Java desde cualquier ubicación en la terminal.