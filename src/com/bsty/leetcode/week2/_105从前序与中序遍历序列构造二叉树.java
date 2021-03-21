package com.bsty.leetcode.week2;

import com.bsty.leetcode.TreeNode;

public class _105从前序与中序遍历序列构造二叉树 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, inorder, Long.MAX_VALUE + 1);
    }

    int pre = 0;
    int in = 0;

    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, long stop) {
        if(pre == preorder.length){
            return null;
        }
        if(inorder[in] == stop){
            in++;
            return null;
        }
        int rootVal = preorder[pre++];
        TreeNode root = new TreeNode(rootVal);
        root.left = buildTreeHelper(preorder,inorder,rootVal);
        root.right = buildTreeHelper(preorder,inorder,stop);
        return root;
    }
}
