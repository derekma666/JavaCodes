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

**Stack**:
 - LIFO
 - S.top
 - basic operations (O(1))
- PUSH(S, x)
- POP(S)
- STACK-EMPTY(S)

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

**Queue**:
Q.head is the first element of queue.
Q.tail is the next insersion position of the last element. 

