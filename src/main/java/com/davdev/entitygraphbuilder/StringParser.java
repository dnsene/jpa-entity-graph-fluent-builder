package com.davdev.entitygraphbuilder;


import com.davdev.entitygraphbuilder.antlr.ExpandLexer;
import com.davdev.entitygraphbuilder.antlr.ExpandParser;
import com.davdev.entitygraphbuilder.impl.NodeListener;
import com.davdev.entitygraphbuilder.impl.TreeNode;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class StringParser {

    public TreeNode<String> parseToTree(String graph) throws BadSyntaxException {
        ExpandLexer expandLexer = new ExpandLexer(CharStreams.fromString(graph));
        CommonTokenStream tokens = new CommonTokenStream(expandLexer);
        ExpandParser parser = new ExpandParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        NodeListener listener= new NodeListener();
        ExpandParser.NodelistContext nodeList = parser.nodelist();
        if(parser.getNumberOfSyntaxErrors() > 0 ){
            throw new BadSyntaxException();
        }
        walker.walk(listener, nodeList);
        return listener.treeNode;
    }
}
