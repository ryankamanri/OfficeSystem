package com.zjw.oa.mapper;


import com.zjw.oa.entity.Qjsq;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * Description 请假申请MAPPER
 *
 * @author dqy
 * @date 2021-06-30
 */
@Mapper
public interface QjsqMapper {

    void addQjsq(Qjsq qjsq) throws Exception;

    List<Qjsq> getQjList(Qjsq qjsq);

    Qjsq getQj(Qjsq qjsq);

    void agreeQj(Qjsq qjsq) throws Exception;

}
