package org.capybara.restful.filter;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.capybara.restful.filter.filter.paser.RestFilterLexer;
import org.capybara.restful.filter.filter.paser.RestFilterParser;
import org.capybara.restful.filter.filter.qfilter.QFilter;
import org.capybara.restful.filter.filter.qfilter.QFilterVisitor;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.List;

/**
 * @author long jie
 * @since 2024/12/8 21:29
 */
class QFilterVisitorTest {

    @Test
    void testQFilterVisitor() throws SQLException {
        CodePointCharStream charStream = CharStreams.fromString("name EQ 'Bob' AND age EQ 24 OR name in ( 'Alice', 'James')");
        RestFilterLexer lexer = new RestFilterLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        RestFilterParser parser = new RestFilterParser(tokenStream);
        ParseTree tree = parser.filter();

        QFilter qFilter = new QFilterVisitor().visit(tree);
        System.out.println(qFilter);
        System.out.println(qFilter.toParameterizedFilter());
        System.out.println(qFilter.getParameterizedParams());

        String url = "jdbc:mysql://192.168.189.136:3306/mysql2024?serverTimezone=Asia/Shanghai";
        Connection connection = DriverManager.getConnection(url, "root", "root");
        String sql = "select id,name,age from users where " + qFilter.toParameterizedFilter();
        PreparedStatement stmt = connection.prepareStatement(sql);
        List<Object> parameterizedParams = qFilter.getParameterizedParams();
        for (int i = 1; i <= parameterizedParams.size(); i++) {
            stmt.setObject(i, parameterizedParams.get(i - 1));
        }
        ResultSet resultSet = stmt.executeQuery();
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            System.out.println(name);
        }
    }

}
