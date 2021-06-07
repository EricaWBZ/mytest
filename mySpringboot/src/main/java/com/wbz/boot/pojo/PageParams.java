package com.wbz.boot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class PageParams {
    private Integer pageNum;       //页码
    private Integer pageSize;      //每页个数
}
