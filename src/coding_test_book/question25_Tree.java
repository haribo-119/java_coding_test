package coding_test_book;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class question25_Tree {
    public static void main(String[] args) {
        int[] node = {1, 2, 3, 4, 5, 6, 7};
        TreeNode root = arrayToBinaryTree(node, 0);
        preorder(root); // 전위순회
        System.out.println();
        printTree(root); // 중위순회
        System.out.println();
        postorder(root); // 후위순회
    }

    // 배열을 이진트리로 변환하는 함수
    public static TreeNode arrayToBinaryTree(int[] arr, int idx) {
        if (idx >= arr.length) return null;
        TreeNode node = new TreeNode(arr[idx]);
        node.left = arrayToBinaryTree(arr, 2 * idx + 1);
        node.right = arrayToBinaryTree(arr, 2 * idx + 2);
        return node;
    }

    // 전위 순회
    public static void preorder(TreeNode node) {
        if (node == null) return;
        System.out.print(node.val + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // 중위 순회
    public static void printTree(TreeNode node) {
        if (node == null) return;
        printTree(node.left);
        System.out.print(node.val + " ");
        printTree(node.right);
    }

    // 후위 순회
    public static void postorder(TreeNode node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val + " ");
    }

}