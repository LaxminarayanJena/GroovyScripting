# JavaCollections

![1](https://user-images.githubusercontent.com/24494133/42983259-59542568-8c03-11e8-94ef-35683ebfd111.PNG)

  ### Difference between array list and linked list <br />

	Array list is faster for iteration compared to linked list
	Array list is slower for adding and removing of elements compared to linked list.
	
Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the bits are shifted in memory.Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.

### List
List is an interface and an ordered collection it maintains the insertion order and allow duplicate values
### Set
Set is interface.Set is stored in unordered way and does not allow duplicate values. 
### HashSet
HashSet is class which implements Set. elements are not sorted and unordered .performance better than treeset and linkedhashset
### TreeSet
A TreeSet is a set where the elements are sorted (and thus ordered).TreeSet performance is better to LinkedHashSet excluding insertion and removal operations because, it has to sort the elements after each insertion and removal operations
### LinkedHashSet
LinkedHashSet maintains the insertion order. When we iterate through a HashSet, the order is unpredictable.The performance of LinkedHashSet is slow to TreeSet. The performance LinkedHashSet is almost similar to HashSet but slower because, LinkedHashSet maintains LinkedList internally to maintain the insertion order of elements
	
### Difference between listand arraylist <br />
  List is an interface while ArrayList is a class

### Difference between LinkedHashMap and HashMap <br />
LinkedHashMap maintains insertion order of keys, order in which keys are inserted in to LinkedHashMap. On the other hand HashMap doesn't maintain any order or keys or values

## MapInterface
![11](https://user-images.githubusercontent.com/24494133/42983775-20b9d3a8-8c06-11e8-8573-fd8059f54169.PNG)

## HashMap vs HashTable vs HashSet
![2](https://user-images.githubusercontent.com/24494133/42985695-37274c88-8c10-11e8-92b5-912f80dbdbc8.PNG)

HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.(null pointer exception when u try get)</br>
if you add duplicate keys including null in map then previous value will be replaced.no error in hashmap
