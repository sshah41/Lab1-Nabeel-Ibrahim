[![Build Status](https://travis-ci.org/LoyolaChicagoCode/hello-java.svg?branch=master)](https://travis-ci.org/LoyolaChicagoCode/hello-java)

This build will always fail because it has 2 examples of failing tests:
one based on the source code, and one based on an incorrect test.

# Learning Objectives

* Simple hello world example
* Experience with Git source code management
* Building with Gradle (using the Gradle wrapper)
* Automated unit testing with JUnit
* Continuous integration with Travis

# System requirements

* Java 6 SDK or later

# Running the Application

On Linux or Mac OS X:

    $ ./gradlew run
	
On Windows:
	
    > gradlew run

# Running the Tests

On Linux or Mac OS X:

    $ ./gradlew test
	
On Windows:
	
    > gradlew test

# Running the Application Outside Gradle

Unlike running the application using Gradle's `run` task,
this allows passing command-line arguments.

On Linux or Mac OS X:

    $ ./build/scripts/hello-java arg1 arg2 arg3

or

    $ java -jar build/lib/hello-java.jar arg1 arg2 arg3

On Windows:

    > .\build\scripts\hello-java arg1 arg2 arg3

or

    > java -jar build\lib\hello-java.jar arg1 arg2 arg3

    #Discussion for part2:
     *What would be a really simple solution if n were not an argument, i.e., if it were always 17?
      * If it were always 17 you can hard code it to 17 and wouldn't have to worry about the negative number.
      * Also, you can just print ln from 1 to 17 and do an if, else if and else loop for 3. 5 and 15 respectively.
     *How could you have automatically tested your initial solution from part 2?
      * Well, the solution in part 2 did not have arrays. We would have used a AssertEquals to test int vs int and
      * int vs String in case of 3,5, or 15.
     *What changes between parts 2, 3, and 4, and what stays the same? Does it matter what list implementation you
     *choose? If so, in what way(s)?
       *The logic for the core program stays the same. In part three we convert it into a method and use arrays.
       *We were not able to do part 4.