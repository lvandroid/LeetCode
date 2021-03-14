package com.bsty.leetcode.week1;

import com.bsty.leetcode.Node;

import java.util.ArrayList;
import java.util.List;

public class _589N叉树的前序遍历 {
    List<Integer> list= new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root==null)return list;
        list.add(root.val);
        for(Node node: root.children){
            preorder(node);
        }
        return list;
    }
}
