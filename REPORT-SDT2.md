# REPORT - GIT

**Name:** Martín Felgueres Díaz
**Subject:** Software Development Tools  
**Date:** 5 of december of 2024

---


## Crear un repositorio remoto (en GitHub, ...)

![](SDT/image007.png)

## Clonar el repositorio vacío (git clone)

We click in the option of clone repository and we write the URL of the repository that we have created at GitHub.

![](SDT/image009.png)

When we loaded the project it looked something like this:

![](SDT/image011.png)

## Crear en la carpeta del repositorio local un proyecto vacío utilizando el lenguaje elegido

This is the route of the project at the local machine:

![](SDT/image013.png)

## Hacer commit de todo el proyecto en el repositorio (git commit -m "message ...")

![](SDT/image015.png)

In GitHub we can see every commits.

![](SDT/image017.png)

## Agregar código simple al proyecto Java/C++/C# (por ejemplo, crear tabla, escribir elementos de la tabla)

We write Java code:

![](SDT/image019.png)

## Hacer commit de los cambios

We click on commit and push the changes.

![](SDT/image021.png)

## Agregar más código (por ejemplo, inicializar tabla con valores aleatorios)

As in the previous section I would have already initialized a 4x4 matrix with random values, now I initialize a 40x40 one and if the number is prime I set it to 0.

![](SDT/image023.png)

## Hacer commit de los cambios

We click on commit and push the changes.

![](SDT/image025.png)
![](SDT/image027.png)

## Agregar más código (por ejemplo, ordenar elementos de la tabla)

![](SDT/image029.png)

## Hacer commit de los cambios

We click on commit and push the changes.

![](SDT/image031.png)

## Consultar el historial de código (git log)

![](SDT/image033.png)

## Consultar anotaciones del código (git blame)

![](SDT/image035.png)
![](SDT/image037.png)
![](SDT/image039.png)
![](SDT/image041.png)

## Intentar checkout de diferentes revisiones (git checkout)

We check de hash of one of our last commits.

![](SDT/image043.png)

We do a checkout with this hash.

![](SDT/image045.png)

We can see the changes at Main.java.

![](SDT/image047.png)

We come to the last commit.

![](SDT/image049.png)

## Agregar cambios al código, pero no hacer commit

I add this line to the code.

![](SDT/image051.png)

## Intentar revertir los últimos cambios (git revert)

We want to revert the last commit so we will do a git revert using the second hash.

![](SDT/image053.png)

We can see that is impossible to do a git revert while there are some changes that you haven’t committed.

![](SDT/image055.png)

## Subir el proyecto al repositorio remoto (git push)

We click on commit and push changes.

![](SDT/image057.png)

## r) Eliminar el proyecto local y el repositorio local

## s) Clonar el proyecto desde el repositorio remoto (git clone)

![](SDT/image059.png)
![](SDT/image061.png)

## t) Crear una etiqueta/release y probar cambiar entre esta etiqueta y la rama master (git branch, git tag)

We create a tag with name v1.

![](SDT/image063.png)

We switch to v1 and then to main.

![](SDT/image065.png)

## u) Crear una nueva rama a partir de la rama master

![](SDT/image067.png)

## w) Cambiar a la nueva rama (git merge)

![](SDT/image069.png)

## x) Mejorar el código en la nueva rama (por ejemplo, cambiar el algoritmo de ordenamiento)

The condition is to be a prime number and bigger than 50.

![](SDT/image071.png)

We commited and push into the branch1.

![](SDT/image073.png)

## y) Fusionar la nueva rama con la rama master

And now we will merge this branch into master. For this we have to be in master branch and then make de merge with the branch.

![](SDT/image075.png)

If we go to GitHub we can see that the branch1 had recent pushes, so GitHub will give us the possibility to make a pull request which is a way to merge the content of one branch to another, seeing in detail what is being modified and whether there are conflicts or not and if so, being able to solve them manually.

![](SDT/image077.png)

We click on compare and pull request and we see this:

![](SDT/image079.png)

Here we can see what we will modify into the master branch. In this case I just modify the condition to initialize a number of the matrix to 0. The red color is what was in the master branch. And green what is new. In this case we don’t have to solve any conflicts.

![](SDT/image081.png)

We create the pull request:

![](SDT/image083.png)

And the branch1 was merged into master.

![](SDT/image085.png)

Now we see the code of master branch and we can see the change:

![](SDT/image088.png)

## z) Compartir la URL del repositorio con un amigo (asegurarse de dar acceso primero)

![](SDT/image090.png)
![](SDT/image092.png)

We enter in another account and we can accept the invitation.

![](SDT/image094.png)

## z1) Intentar producir un conflicto

We go to branch1.

![](SDT/image096.png)

We modify several lines of code trying to create conflicts.

What I had before have modified.

![](SDT/image098.png)

The result of modification.

![](SDT/image100.png)

We have to committed the changes in branch1 and go to master branch, now we can do a merge with branch1. We can see that some conflicts have happened.

![](SDT/image102.png)

The conflicts:

![](SDT/image104.png)
![](SDT/image106.png)

## z2) Resolver el conflicto y subir la solución al repositorio remoto

I solved the manually:

![](SDT/image108.png)
![](SDT/image110.png)

Now we can merge branch1 into master branch.

![](SDT/image112.png)


## z3) Enviar la URL del repositorio al profesor junto con un informe breve (no olvidar establecer acceso para el profesor)
