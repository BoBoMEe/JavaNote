## List
一个有序且有索引的容器，允许重复值的出现。
## Set
一个无序的唯一对象的容器,不允许重复值出现。
## Map
一个基于键值对以及哈希的数据结构，不允许相同的键值出现。

## 对比

### 重复对象
List 允许，Set 不允许，而Map中键对象必须唯一。
### 排序
List 有序，Set 无序，而Map也没有规定顺序。

- 某些 Set 实现比如 LinkedHashSet 还是保持了每个元素的插入顺序。
- 此外 SortedSet  的实现 TreeSet ， SortedMap的实现 TreeMap 也通过 Comparator  或者 Comparable 维护了一个排序顺序。

### NULL值
List允许多个null值，Set允许一个null值，Map可以有多个null值和最多一个null键。

- Hashtable 既不允许 null 键也不允许 null 值。

## 流行实现

### List

- ArrayList：提供了使用索引的随意访问
- LinkedList ：的链表结构对于经常需要从 List 中添加或删除元素的场合比较合适
- Vector ：可以理解为同步的ArrayList
- Stack：继承Vector，实现了一个标准的后进先出的栈。

### Set

- HashSet 也不能提供任何排序保证，基于 HashMap 实现
- TreeSet 实现了 SortedSet 接口，根据其 compare() 和 compareTo() 的定义进行排序的有序容器。
- LinkedHashSet：继承HashSet， 除了提供 Set 接口的唯一性，还提供了元素的有序性。

### Map

- HashMap 是 Map 接口的一个非同步的通用实现
- Hashtable 是 HashMap 的一个提供了同步功能的副本
- HashMap 和 Hashtable 都不能像 LinkedHashMap 那样做任何排序保证
- TreeMap 也是一个有序的数据结构，它按照键的值进行升序排列。

##   Comparable与Comparator

都是Java中用于实现对象的比较、排序的接口。
```java
//Comparable
public class Student implements Comparable{
public int compareTo(Student another) {}
}
Collections.sort( studentList )

//Comparator
public class Student{}

class StudentComparator implements Comparator { 
public int compare(Student one, Student another) {}
}

Collections.sort( StudentList , new StudentComparator());
```

思维脑图： http://www.xmind.net/m/UPWK





