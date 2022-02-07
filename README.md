# Lab3_CVDS
### Clases de equivalencia  


   
- En el directorio de trabajo ejecutar el comando necesario para crear un proyecto maven, basado en un arquetipo:
    - Grupo: edu.eci.cvds
    - Artefacto: ClasesEquivalencia
    - Paquete: edu.eci.cvds.tdd
    - archetypeArtifactId: maven-archetype-quickstart

Para ello vamos a usar el siguiente comando:  
- mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=ClasesEquivalencia -Dpackage=edu.eci.cvds.tdd -DarchetypeArtifactId=maven-archetype-quickstart

### ACTUALIZAR Y CREAR DEPENDENCIAS EN EL PROYECTO
- Busque en internet el repositorio central de maven.
- Busque el artefacto JUnit y entre a la versión más nueva
- Ingrese a la pestaña de Maven y haga click en el texto de la dependencia para copiarlo al portapapeles.
- Edite el archivo pom.xml y realice las siguientes actualizaciones:
    - Agregue la dependencia copiada a la sección de dependencias.
    - Hay que cambiar la versión del compilador de Java a la versión 8, para ello, agregue la sección properties antes de la sección de dependencias:
    ~~~ 
    <properties>
        <maven.compiler.target>1.8</maven.compiler.target> 
        <maven.compiler.source>1.8</maven.compiler.source>

    </properties>

### COMPILAR Y EJECUTAR
- Ejecute los comandos necesarios de Maven, para compilar el proyecto y verificar que el proyecto se creó correctamente y los cambios realizados al archivo pom no generan inconvenientes.

- Busque el comando requerido para ejecutar las pruebas unitarias de un proyecto desde Maven y ejecútelo sobre el proyecto. Se debe ejecutar la clase AppTest con resultado exitoso.