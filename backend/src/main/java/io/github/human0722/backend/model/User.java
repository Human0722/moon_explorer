package io.github.human0722.backend.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

/**
 * @author xueliang
 * @date 2023-03-17 17:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
}
