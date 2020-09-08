package com.davdev.entitygraphbuilder.impl;


import com.davdev.entitygraphbuilder.antlr.ExpandBaseListener;
import com.davdev.entitygraphbuilder.antlr.ExpandParser;

public class NodeListener extends ExpandBaseListener {

    public TreeNode<String> treeNode ;
    private TreeNode<String> currentNode;

    public NodeListener() {
        treeNode = new TreeNode<>(null);
        currentNode = treeNode;
    }

    @Override
    public void enterNode(ExpandParser.NodeContext ctx) {
        currentNode = currentNode.addChild(ctx.VARIABLE().getText());
    }

    @Override
    public void exitNode(ExpandParser.NodeContext ctx) {
        currentNode = currentNode.parent;

    }

}
