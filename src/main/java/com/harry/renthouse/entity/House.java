package com.harry.renthouse.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * 房屋实体类
 * @author Harry Xu
 * @date 2020/5/9 14:14
 */
@Entity
@Data
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Integer price;

    private Integer area;

    private Integer room;

    private Integer floor;

    private Integer totalFloor;

    private Integer watchTimes;

    private Integer buildYear;

    private Integer status;

    private LocalDateTime createTime;

    private LocalDateTime lastUpdateTime;

    private String cityEnName;

    private String regionEnName;

    private String cover;

    private Integer direction;

    /* 到地铁的距离 */
    private Integer distanceToSubway;

    /** 客厅数量 **/
    private Integer parlour;

    /* 小区名称 */
    private String district;

    /* 所属管理员id */
    private Long adminId;

    private Integer bathroom;

    /* 街道 */
    private String street;

}
