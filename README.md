# MinHeightBST
- given a non empty array  of distinst integer, 
- contruct a BST from  the integer and return root of the BST 
- the tree must return minimine the height of the BST
- array = [1, 2, 5, 7, 10, 13 ,14 ,15 ,22]
- they can get multiple outcome here is one:

     -![alt text](https://github.com/hieunugent/MinHeightBST/blob/master/Untitled%20Diagram.png)
   
 # Solution
 - get the midpoint of the array and add to the tree, 
 - continue do find the midpoint of the left side and the right side add to leftnode and rightnode
 - call recursive function
 - why's "midpoint"?
   - the only way to make the tree balance is get the mid point. 
   - so the depth of tree is equal for both left and right side
