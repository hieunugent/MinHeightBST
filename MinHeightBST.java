import java.util.*;
import java.lang.Math;

class Program {
  public static BST minHeightBst(List<Integer> array) {
    // Write your code here.
		
		return nodeValue(array, 0, array.size()-1);
  
  }
	public static BST nodeValue(List<Integer> array, int l, int r){
		if(l>r) return null;
		int mid = (l + r)/2;
		
		BST node = new BST(array.get(mid));
		node.left=(nodeValue(array, l, mid-1));
		node.right=(nodeValue(array, mid+1, r));
		return node;
		
	}
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
      left = null;
      right = null;
    }

    public void insert(int value) {
      if (value < this.value) {
        if (left == null) {
          left = new BST(value);
        } else {
          left.insert(value);
        }
      } else {
        if (right == null) {
          right = new BST(value);
        } else {
          right.insert(value);
        }
      }
    }
  }
}
