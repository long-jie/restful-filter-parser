package org.capybara.restful.filter.builder;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.capybara.restful.filter.RestFilter;
import org.capybara.restful.filter.paser.RestFilterGenerator;
import org.capybara.restful.filter.paser.RestFilterLexer;
import org.capybara.restful.filter.paser.RestFilterParser;

/**
 * @author long jie
 * @since 2024/12/7 17:56
 */
public class RestFilterBuilder {

    public static RestFilter buildRestFilter(String filter) {
        CodePointCharStream charStream = CharStreams.fromString(filter);
        RestFilterLexer lexer = new RestFilterLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        RestFilterParser parser = new RestFilterParser(tokenStream);
        ParseTree tree = parser.filter();
        RestFilterGenerator restFilterGenerator = new RestFilterGenerator();
        return restFilterGenerator.visit(tree);
    }

}
