package com.davdev.entitygraphbuilder;

import com.davdev.entitygraphbuilder.impl.TreeNode;

import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.Subgraph;


public class GraphBuilder {

    private final EntityManager entityManager;
    private final StringParser stringParser;

    public GraphBuilder(StringParser stringParser, EntityManager entityManager) {
        this.stringParser = stringParser;
        this.entityManager = entityManager;
    }


    public EntityGraph<?> parseToGraph(String expandQueryParam, Class<?> clazz) throws BadSyntaxException {
        TreeNode<String> treeNode = stringParser.parseToTree(expandQueryParam);
        return buildGraph(treeNode, clazz);
    }

    private EntityGraph<?>  buildGraph(TreeNode<String> tree, Class<?> clazz){
        EntityGraph<?>  graph = entityManager.createEntityGraph(clazz);
        for (TreeNode<String> child : tree.children) {
            if(child.isLeaf()){
                graph.addAttributeNodes(child.data);
            }else{
                Subgraph<?>  subGraph = graph.addSubgraph(child.data);
                handleSubGraph(child, subGraph);
            }
        }
        return graph;
    }


    private void handleSubGraph(TreeNode<String> node, Subgraph<?>  graph){
        for (TreeNode<String> child : node.children) {
            if(child.isLeaf()){
                graph.addAttributeNodes(child.data);
            }else{
                Subgraph<?>  subGraph = graph.addSubgraph(child.data);
                handleSubGraph(child, subGraph);
            }
        }
    }

}
