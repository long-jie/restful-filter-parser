package org.capybara.restful.filter;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Config;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.mapper.util.Sqls;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author long jie
 * @since 2024/12/8 14:58
 */
class MyBatisTest {
    @Test
    void testQuery() throws IOException {
        // 获取核心配置文件的输入流
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        // 获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(stream);
        //从刚刚创建的 sqlSessionFactory 中获取 session
        SqlSession session = sqlSessionFactory.openSession();
        //创建一个MapperHelper
        MapperHelper mapperHelper = new MapperHelper();
        //特殊配置
        Config config = new Config();
        //主键自增回写方法,默认值MYSQL,详细说明请看文档
        config.setIDENTITY("MYSQL");
        //支持getter和setter方法上的注解
        config.setEnableMethodAnnotation(true);
        //设置 insert 和 update 中，是否判断字符串类型!=''
        config.setNotEmpty(true);
        //校验Example中的类型和最终调用时Mapper的泛型是否一致
        config.setCheckExampleEntityClass(true);
        //启用简单类型
        config.setUseSimpleType(true);
        //枚举按简单类型处理
        config.setEnumAsSimpleType(true);
        //自动处理关键字 - mysql
        config.setWrapKeyword("`{0}`");
        //设置配置
        mapperHelper.setConfig(config);
        //注册通用接口，和其他集成方式中的 mappers 参数作用相同
        //4.0 之后的版本，如果类似 Mapper.class 这样的基础接口带有 @RegisterMapper 注解，就不必在这里注册
        mapperHelper.registerMapper(Mapper.class);
        //配置 mapperHelper 后，执行下面的操作
        mapperHelper.processConfiguration(session.getConfiguration());

//        Example example = new Example(UserDO.class);
//        Example.Criteria criteria = example.createCriteria();
//        criteria.andEqualTo("name", "Bob").andEqualTo("age", 24);
//        example.or(example.createCriteria().andLike("name", "%J%"));
//        UserMapper userMapper = session.getMapper(UserMapper.class);
//        List<UserDO> userDOS = userMapper.selectByExample(example);
//        System.out.println(userDOS);

        String s = RestFilterBuilder.buildRestFilter("name EQ 'Bob' AND age EQ 24 OR name EQ 'Alice'");
        System.out.println(s);

//        Sqls sql1 = Sqls.custom().andGreaterThan("name", "Bob");
//        Sqls sql2 = Sqls.custom().andGreaterThan("age", 24);
//        Sqls sql3 = Sqls.custom().andLike("name", "%J%");
//        Example.Builder builder = Example.builder(UserDO.class)
//                .select("name", "age")
//                .where(sql1)
//                .andWhere(sql2)
//                .orWhere(sql3);
//        Example example = builder.build();
//        UserMapper userMapper = session.getMapper(UserMapper.class);
//        List<UserDO> userDOS = userMapper.selectByExample(example);
//        System.out.println(userDOS);

    }
}
