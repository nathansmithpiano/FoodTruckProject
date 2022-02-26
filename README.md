# FoodTruckProject

### Description
  -- Developed for Skill Distillery Bootcamp Cohort 32 --

  This application allows for a user to input and process information about their food trucks.  Up to five food trucks are allowed and a user must input at least one food truck.

  Using the console, a user will input:
    1. The name of each food truck.
    2. The type of cuisine offered by each food truck
    3. The rating for each food trucks

  When a user is done adding food trucks, when entering a name, they can enter "quit" (without quotation marks) and the application will move forward.

  Afterward, a user is given four options:
    1. List all existing food trucks.
    2. See the average rating of food trucks.
    3. Display the highest-rated food truck.
    4. Quit the program.

  The application will continue to run until option 4 is entered.

### Lessons Learned
  This was the first time I used constants and access modifiers in a Java application.  While this was good practice, it was not the primary challenge.

  Rather, a greater challenge came from creating instances and adding to an array of those instances within separate methods.  At first, I wanted to update the array dynamically - that is, to grow the array so it would contain only the instances created following user input.  This lead to additional problems...

  With this strategy, I attempted to create an instance within one method and pass that instance into another method which would add it to the array.  The second method would take in the array as a parameter and return a new array.  The original array would be set to that array.

  This created an issue.  The resultant array contained the value of references for these newly created instances, and as those instances were created in a method, once that method terminated, the instances were no longer available and the resultant array contained null elements.

  Through this process, sometimes the resultant array contained null elements, and sometimes an error resulted while attempting to access values within the array.

  In this final attempt, rather than dynamically adjusting the array, I created it as a constant of fixed length matching the maximum number of food trucks, five.  Then, when parsing through the array, I filtered out null elements.

  Use of Scanner(System.in) presented some issues as well.  Using close() and re-creating the same scanner threw errors.  Instead of doing this within methods, I instantiated the scanner as a static object within the Handler class and closed it once the application terminates.  This was my first time doing so.  Still, I feel a better solution is warranted.

### Technologies Used
  - Eclipse IDE
  - Java SE 1.8
  - Atom
  - Git
  - Terminal
  - Google Chrome
  - Mac OSX

### What was fun?
  The challenge with references becoming null was a fun challenge, and working through this helped me further understand how objects are different from primitive data types. I enjoyed using multiple files and seeing somewhat better organization within my code.  My main() only contains 4 lines.  I also enjoyed implementing encapsulation and polymorphism.

### Thoughts For The Future
  - I would have enjoyed further segmenting of the Handler class so that no scrolling is needed.  
  - I also would enjoy exploring inheritance and more complex applications.
  - I hope to find better ways of processing user input through the keyboard and the console, and/or better ways of implementing java.util.Scanner.

  ~ ~ ~ Onwards and upwards! ~ ~ ~
