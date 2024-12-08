package org.capybara.restful.filter;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.capybara.restful.filter.filter.paser.RestFilterLexer;
import org.capybara.restful.filter.filter.paser.RestFilterParser;

/**
 * RestFilter构建器
 *
 * @author long jie
 * @since 2024/12/7 17:56
 */
public class RestFilterBuilder {

    /**
     * 接收一个filter过滤串，封装在一个RestFilter对象中
     *
     * @param filter 过滤字符串
     * @return RestFilter
     */
    public static String buildRestFilter(String filter) {
        CodePointCharStream charStream = CharStreams.fromString(filter);
        RestFilterLexer lexer = new RestFilterLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        RestFilterParser parser = new RestFilterParser(tokenStream);
        ParseTree tree = parser.filter();

        return null;
    }

}
