# Algorithms in Java Programming

## Contents
### Part 1: Pseudo-code, algorithm analysis and linear data structures
* [Pseudo-code]()
* Stack
* Queues
* Linked list

### Part 2: Sorting algorithms
* Insertion sort 
* Merge sort
* Heapsort algorithms
* Quick 

### Part 3: Hash tables, trees
* Direct-address tables
* Binary search trees
* Red black trees

### Part 4: Priority Queues, Huffman trees, Graphs
* Priority Queues, Huffman trees
* Graphs and graph representations





**Algorithm basics**
- pseudo-code conventions
- analysing algorithms using RAM
- worst case analysis
- best case analysis
- express the time complexity using asymptotic
- notations
- solving recurrences via recursion tree
- ALL sorting algorithms covered in this module.

## Pseudocode and algorithm analysis

Approach 1
```java
//Counting one by one
for r = 1 to n
    for c = 1 to n
        sum = sum + 1
return sum
```
Approach 2
```java
//Counting line by line
for r = 1 to n
   sum = sum + n
return sum
```
Approach 3
```java
//Counting by calculation
return n * n
```

Task: Given a linear search problem scenario:

Input: array A of $n$ integers and a targeted integer $x$
Output: the index of integer $x$.
```java
public class test {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        int x = 2;
        for (int i = 0; i < A.length; i++){
          if(x == A[i]){
            System.out.println("the index is " + i);
          }
        }
    }
}
```

```c
Index = 1
while index ≤ n and A[index] ≠ x
  index=index+1
if index > n
  index = 0
return index
```

Pesudocode tips:
- Indentation indicates block strucure.
- While, for, and repeat-until and if-else similar to Java, Python, etc.
- "//" indicates a comment.
- Variables are local to the given procedure.
- organise compound data into objects, which are composed of attributes. (A.length)
- Pointer to the data representing the array or object.
- Attribute notation can "cascade".
- allow multiple values to be returned in a single return statement.
- error indicates that an error occured beacuse conditions were wrong for the procedure to have been called.
  
## Algorithm analysis

### Experimental approach
For the experimental approach, you need to:

- write a program implementing the algorithm
- run the program with inputs of varying size and composition
- use a method lto get an accurate measure of the actual running time
- plot the results such as in the figure below:

<div align = center><img src=./figs/Diagram.png width="60%"></div>
 
limitations for the experimental approach:

- It is necessary to implement the algorithm, which may be difficult and expensive.
- It may not be feasible waiting for hours to get a single experimental data.
- Results may not be indicative of the running time on other inputs not included in the experiment.
- In order to compare two algorithms, the same hardware and software environments must be used.

### Theoretical approach
For the theoretical analysis approach:

- It uses a mathematical description of the algorithm instead of an implementation, which is cheap.
- It characterises running time as a function of the input size, n.
- It takes into account all possible inputs.
- It allows us to evaluate the speed of an algorithm independent of the hardware/software environment.
Some example input sizes are:

Bear in mind that it is the second approach, theoretical analysis that will be used in the rest of this module.

**COUNTING** algorithms. Without actually running the programs, it is apparent that COUNTING-3 is the fastest, COUNTING-2 the second and COUNTING-1 is the slowest. But how did you reach the conclusion? Is it the case that the number of counts plays a key role? We need a model to work out the instructions and their cost. 

The **Random Access Machine (RAM) Model** will be used here.
<div align = center><img src='https://onlinestudy.york.ac.uk/users/372/files/12379/preview?verifier=E9WSwiLwq1DQ8nungfJQfqtm74i81yAB4Gsd1rb8' width="60%"></div>

The key ideas:

- A Central Processing Unit (CPU) with a potentially unbounded bank of memory cells, each of which can hold an arbitrary number or character. Memory cells are numbered and accessing any cell in memory takes unit time.
- Instructions are executed one after another. No concurrent operations are assumed.
- Each instruction takes a constant amount of time.
- Instructions are primitive operations such as evaluating an expression, assigning a value to a variable, indexing into an array, calling a method and returning from a method. They are identifiable in pseudocode, and largely independent from the programming language.
- Assuming each line of pseudo-code (with one or a few primitive operations) requires a constant time $c_i$
  - The exact definition is not important.
  - Calling a method takes a constant time but executing that method may take more time.

## Worst case and best case senario
Running time depends on
- particular input
- input size.

<div align = center><img src='https://onlinestudy.york.ac.uk/users/372/files/12398/preview?verifier=9o2U6SSxBlnP3wCrX6fNtn4KMh87iNytKYYUKZa0' width="60%"></div>

Most often we describe the behaviour of an algorithm by stating its **worst-case time complexity**: the maximum number of basic operations performed by the algorithm on any input of size $n$. Worst-case running time gives a guaranteed upper bound because everybody likes a guarantee. It is easier to analyse. Average case is difficult to determine, it is just as bad as the worst case.

### Time Complexity

**Asymptotic Notations**:
- Big-oh $O$
  
  An algorithm’s running time is $O(n^2)$, it is an **asymptotic upper bound** which means it could be some constant times $n^2$, $n$ or some constant, but not some constant times $n^3$
- Big-theta $Θ$

  An algorithm’s running time is $Θ(n^2)$, means it could only be some constant times $n^2$ but not anything else.
- Big omega $\Omega$ are called . 
  
  An algorithm’s running time is $Ω(n^2)$, it is an **asymptotic lower bound** which means it could be some constant times $n^2$, $n^3$ or $n^4$ , but not some constant times $n$.

<div align = center><img src='https://media.geeksforgeeks.org/wp-content/cdn-uploads/mypic.png'></div>


Times of repetitions of each statement $T(n)$
High efficiency to low efficienty:
1. constant $O(1)$: **Best**
2. logarithmic $O(lgn)$ 

```java
// example of time complexity O(lgn)
public class Whileloop {
    public static void main(String[] args) {
        int i = 1;
        while (i < 1024){
            i = i * 2;
        }
    }
}
```
3. linear $O(n)$ 
```java
// example of time complexity O(lgn)
public class Whileloop {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++){
           i = i + 3;
        }
    }
}
```   

4. $O(nlgn)$


5. $O(n^2)$quadratic
6. $O(n^3)$cubic
7. $O(2^n)$ exponential


- 
- 
- 
- dismiss constants, lower powers, coefficients, when computing $O(n)$.
e.g., $T(n)=3n^2+2n+2=O(n^2)$

- Time complexity: $O(lgn)$



---

**Data structure is the way to store and organise data in order to facilitate access and modification. Algorithms need to manipulate different data structures, and they go hand in hand. We have studied some data structures e.g. primitive data, object and arrays.**

Mathematical sets are static while sets in Computer Science are dynamic. Elements in a set is represented by an object (say $x$) and an object contains a key field (say $k$) and some satellite data. General operations on a dynamic set $S$ include

- SEARCH (S, k)
- INSERT (S, x)
- DELETE (S, x)
- MINIMUM (S)
- MAXIMUM (S)
- SUCCESSOR (S, x): returns the next larger object with respect to the key value.
- PREDECESSOR (S, x): returns the next smaller object with respect to the key value



## Stack




**Stack**:
 - LIFO: Last In First Out
 - $S.top$
 - basic operations $O(1)$
   - PUSH $(S, x)$
   - POP $(S)$
   - STACK-EMPTY$(S)$

```java
// STACK-EMPTY(S)
if S.top == 0
    return TRUE
else 
    return FALSE
```

```java
// PUSH(S, x)
S.top = S.top + 1
S[S.top] = x
```

```java
// POP(S)
if STACK-EMPTY(S)
    error "underflow"
else S.top = S.top - 1
    return S[S.top + 1]
```

**Queues**:
- FIFO: 
      First In First Out
- tail & Q.head
  
  Q.head is the first element of queue.

  Q.tail is the next insersion position of the last element. 
- 2 basic operations $O(1)$
  - ENQUEUE $(Q, x)$
  - DEQUEUE $(Q)$

## Hash tables

## Direct-address tables

