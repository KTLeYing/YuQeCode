package com.tme.mytest1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName :   L5DTO
 * @Description: L5DTO
 * @Author: v_ktlema
 * @CreateDate: 2021/4/22 16:24
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class L5DTO {

    private Integer modId;
    private Integer cmdId;
    private Float timeout;

}
