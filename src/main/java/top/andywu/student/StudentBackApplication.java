package top.andywu.student;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("top.andywu.student.dao")
@SpringBootApplication
public class StudentBackApplication {

    public static void main(String[] args) {

        SpringApplication.run(StudentBackApplication.class, args);
    }

}
