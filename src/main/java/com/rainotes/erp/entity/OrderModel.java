package com.rainotes.erp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author testjava
 * @since 2020-09-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OrderModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer orderId;

    private String orderNum;

    private Integer creater;

    private Date createTime;

    private Integer checker;

    private Date checkTime;

    private Integer completer;

    private Date endTime;

    private Integer orderType;

    private Integer orderState;

    private Integer totalNum;

    private Double totalPrice;

    private Integer supplierId;


}
