![CS121 Banner](images/CS121-BANNER.svg)
# Module 3 Lab Guide (part 1)
[Lab Introduction Video](https://boisestate.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=eb37a585-2543-437d-a818-ae24017afdb0&start=0)  

**NOTE: Please remember to [open the workspace](images/open-lab-workspace.png) before beginning on the lab activities. If you see an error message stating that VSCode Failed to resolve the main method, that the build path is invalid, or that the java file is not on the classpath, you most likely have forgotten to open the workspace correctly.**

[Code Style and Code Quality Requirements Video](https://youtu.be/LgCIyZesyig) 

### Code Style Requirements
Please review the [CS121 Style Guide](https://docs.google.com/document/d/1LWbGQBKkApnNAzzgwOSvRM03DmhYWx5yEfecT2WXfjI/edit?usp=sharing) and apply it in all lab activities and projects this semester. Coding Style will assessed as part of your lab and project grades.

### Code Quality Requirements
- Code must compile without warnings using openjdk11
- Code must run without errors or warnings on safe-path and edge test cases
- More to come as we learn about input validation and exception handling
## Lab Warmup - AccountGenerator
[Walkthrough Video](https://boisestate.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=93186327-17eb-485d-8581-ae24017afdb1&start=0)
### Problem Description
Write an application that prompts for and reads the user's first name and last name (separately) using a Scanner. Then print a string composed of the first letterof the user's first name, followed by the first five characters of the user's last name, followed by a random number in the range of 10 to 99. All letters should be converted to lowercase before being displayed. Assume that the lastname is at least five letters long.  Similar algorithms are sometimes used to generate usernames for new computer accounts.  Your program should match the expected output below, except with a different randomly generated number. 

#### Expected Program Output (with sample user input)
```
Enter your first name: Luke
Enter your last name: Hindman
Username: lhindm83
```

### Implementation Guide
1. Expand the folder named AccountGenerator and create a new file named AccountGenerator.java
2. Design a program to satisfy the requirements in the Problem Description and enter the program code in AccountGenerator.java
3. Test the program with the sample user input using the run link above the main method
4. Commit the changes to your local repository with a message stating that Lab Warmup is completed.
5. Push the changes from your local repository to the github classroom repository.



## Lab Activity 1 - SphereCalculator
### Problem Description
Write an application that reads the radius of a sphere from the user using a Scanner and prints its volume and surface area.  Use the following formulas, in which r represents the sphere's radius.  Print the output to four decimal places using the %f format specifier with the printf() method presented in the reading.  Your program should match the expected output below.

<img src="images/volume-and-surface-area-formula.png" alt="Sphere Formulas" width="350">

#### Expected Program Output (with sample user input)
```
Enter the sphere's radius: 150
Volume: 14137166.9412
Surface area: 282743.3388
```

### Impementation Guide
1. Expand the folder named SphereCalculator and create a new file named SphereCalculator.java
2. Design a program to satisfy the requirements in the Problem Description and enter the program code in SphereCalculator.java
3. Test the program with the sample user input using the run link above the main method
4. Commit the changes to your local repository with a message stating that Lab Activity 1 is completed.
5. Push the changes from your local repository to the github classroom repository.