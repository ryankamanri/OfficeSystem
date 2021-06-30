package com.zjw.oa.service;



import com.zjw.oa.entity.Qjsq;

import java.util.List;

/**
 * Description 请假
 *
 * @author dqy
 * @date 2021-06-30
 */
public interface QjsqService {

    void addQjsq(Qjsq qjsq) throws Exception;

    List<Qjsq> getQjList(Qjsq qjsq);

    Qjsq getQj(Qjsq qjsq);

    void agreeQj(Qjsq qjsq) throws Exception;

}
