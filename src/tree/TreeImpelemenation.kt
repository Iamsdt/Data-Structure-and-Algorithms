package tree

/*
Terminology
1. Root: every tree must have a root. Any tree can not contain one more root
2. Edge: the connecting link between any two nodes is called EDGE. If size of tree is N,
then the maximum edge is N-1
3. Parent: The node which is predecessor of any node is called as PARENT node.
4. Child: The node which is descendant of any node is called as CHILD node.
5. Siblings: nodes which belong to same Parent are called as SIBLINGS
6. Leaf: the node which does not have a child is called as Leaf Node. Also called Terminal node
7. Internal Node: the node which has at least one child is Called Internal Node. Also called as
Non terminal Node. it can be described by, node other than leaf node are called as Internal node.
Root node is also is Internal Node.
8. Degree: the total number of children of a node is called as Degree of that node. Total number
of children
9. the root node said to be at level 0 and the children node are at level 1 and the children
of nodes which at level 1 will be at level 2 ...
10. Height: the total number of edge from leaf node to a particular node in the longest path
is called as Height of that node
11. Depth
//shown video 8:00 min tree 1
 */