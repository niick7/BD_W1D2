# Big Data W1D2

This part of the assignment starts where [W1D1](https://github.com/niick7/BD_W1D1) left off. Yesterday you created the Mapper Class. Today  you are going to create the Reducer Class.
Write a Java program to accomplish the following tasks.

**PREPARATION**
1.	Create a class **GroupByPair** with two data members. First member is **Key**. Second member is a **list of Values**.
2.	Create a class **Reducer**. This has two data members. **A list of Key-Value Pair and a list of GroupByPair**.
3.	Create a class **WordCountW1D2**. This class has two data members. **One Mapper object and One Reducer object**.
4.	Create following methods in WordCountW1D2.

**TODO**
1.	Sort the list of Key-Value Pair.
2.	Iterating through (the sorted) list of Key-Value Pair, create a new list of GroupByPair so that all values associated with the same key are grouped together and kept in one GroupByPair.
3.	Print the GroupByPair list.
4.	Iterate through GroupBy list “sum” the values and print out (key, sum) pairs. 
Include additional print statements so that the output produced matches the sample output file attached.

**NOTE**
1. Use the test data from [W1D1](https://github.com/niick7/BD_W1D1).
2. Observe that you just simulated word count MapReduce with one Mapper and one Reducer.
