# 排序

- [排序算法](https://zh.wikipedia.org/wiki/%E6%8E%92%E5%BA%8F%E7%AE%97%E6%B3%95)

- [外排序](https://zh.wikipedia.org/wiki/%E5%A4%96%E6%8E%92%E5%BA%8F)


## 外排序

能够处理极大量数据的排序算法。通常采用一种“排序-归并”的策略。
外排序有： 外归并排序，外分配排序（类似于内排序中的桶排序），
此外还有一些不耗费附加磁盘空间的原地排序算法。


## 内排序


排序算法的衡量：数据对象，时间复杂度，稳定性，空间复杂度，

- [排序算法](https://zh.wikipedia.org/wiki/%E6%8E%92%E5%BA%8F%E7%AE%97%E6%B3%95)

常见 排序实现：

- [排序](https://github.com/BoBoMEe/JavaNote/blob/master/data_structures_algorithms/src/main/java/com/bobomee/android/data_structures_algorithms/sort/)


参考链接：

- http://www.jianshu.com/p/cd1cd85f4b96
- http://blog.csdn.net/han_xiaoyang/article/details/12163251
- https://juejin.im/entry/580af4bd2e958a0055fcb19f
- https://juejin.im/post/58e5dd51a0bb9f0069089890


# 查找

- 顺序查找 ：O(n)
- 二分查找 ：最坏情况下log2(n+1)，期望复杂度O(log2n)
- 插值查找 ：O(log2(log2n))
- 斐波那契查找： 最坏，O(log2n)，期望O(log2n)
- 树表查找 ： 最坏情况下O(n)，期望O(logn)
- 分块查找
- 哈希查找 ："直接定址"与"解决冲突"是哈希表的两大特点

常见 查找实现

- [查找](https://github.com/BoBoMEe/JavaNote/blob/master/data_structures_algorithms/src/main/java/com/bobomee/android/data_structures_algorithms/find/)

