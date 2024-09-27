package com.zhanghaixin;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 代码生成器
 */
public class CodeGet {

    public static void main(String[] args) {

        // 1、创建代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 2、全局配置
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        //gc.setOutputDir(projectPath + "/src/main/java");  //projectPath表示当前目录的路劲，但是可能会存在问题，所以写成了下边这种绝对路径
        gc.setOutputDir("D:\\ideaProject\\workSpaceThree\\guli_parent\\service\\service-edu"+"/src/main/java");//写成绝对路径

        gc.setServiceName("%sService");	//去掉Service接口的首字母I，比如自动生成后是UserService，如果不加就是IUserService
        gc.setAuthor("test");//设置作者
        gc.setOpen(false);//生成文件后是否自动展开，没多大用处
        gc.setFileOverride(false);//重复生成时是否覆盖，一般时不覆盖
        mpg.setGlobalConfig(gc);

        gc.setIdType(IdType.ID_WORKER_STR);//主键策略，如果数据库主键是number就用ID_WORKER，是字符串类型就用ID_WORKER_STR
        gc.setDateType(DateType.ONLY_DATE);//定义生成的实体类种的日期类型
        gc.setSwagger2(true);//swagger

        // 3、数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        // 4、包配置
        PackageConfig pc = new PackageConfig();

        //最终生成的包名就是com.atguigu.edusercvice
        pc.setParent("com.atguigu");
        pc.setModuleName("eduservice"); //模块名

        //最终生成的包名就是com.atguigu.edusercvice.controller
        pc.setController("controller");
        pc.setEntity("entity");
        pc.setService("service");
        pc.setMapper("mapper");
        mpg.setPackageInfo(pc);

        // 5、策略配置
        StrategyConfig strategy = new StrategyConfig();

        strategy.setInclude("edu_course_description","edu_chapter","edu_video");//根据哪个表生成，可以添加多个，逗号隔开

        strategy.setNaming(NamingStrategy.underline_to_camel);//数据库表映射到实体的命名策略

        strategy.setColumnNaming(NamingStrategy.underline_to_camel);//数据库表字段映射到实体的命名策略
        strategy.setEntityLombokModel(true); // lombok 模型 @Accessors(chain = true) setter链式操作

        strategy.setRestControllerStyle(true); //restful api风格控制器
        strategy.setControllerMappingHyphenStyle(true); //url中驼峰转连字符

        mpg.setStrategy(strategy);

        // 6、执行
        mpg.execute();
    }
}
