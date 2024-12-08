package org.capybara.restful.filter;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author long jie
 * @since 2024/12/8 15:02
 */
@Data
@Table(name = "users")
public class UserDO {
    @Id
    private long id;
    @Column(name ="name")
    private String name;
    private Integer age;



}
