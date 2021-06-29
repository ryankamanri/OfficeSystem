package com.zjw.oa.service;

import com.zjw.oa.entity.Gsgg;
import com.zjw.oa.entity.Xmjd;

import java.util.List;

/**
 * Description 用户service层
 *
 * @author dddz97
 * @date 2019-03-21 10:47:26
 */
public interface GgService {


    List<Gsgg> getGgList();

    List<Xmjd> getxmList();

    void AddGg(Gsgg gsgg) throws Exception;

    void DelGg(Gsgg gsgg) throws  Exception;

}
