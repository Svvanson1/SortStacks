# SortStacks
Sorts a map of Stacks based on their size.

Takes an integer array representing stack sizes in a constructor, populates a new stack to the height of the integer inputted. For instance if [0] in the integer array was 5 a stack of the size 5 would be created and inputted into the Hash Map. For now the stacks sort with bubble-sort but eventually I will implement a unique Stack Sorting algorithm. Duplicate entries into the array will be merged into one (Because of HashMap).  
Stacks only contain Boolean (Smallest bit size) values for now, eventually I will make everything generic and possibly take data from objects to add or take away from the stack size

NOTE: My Unique Stack Sorting algorithm will only work with a concurrent Java implementation which I haven't added yet.
