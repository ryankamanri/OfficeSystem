package com.zjw.oa.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zjw.oa.entity.Gsgg;
import com.zjw.oa.entity.Xmjd;
import com.zjw.oa.service.GgService;
import com.zjw.oa.util.JsonUtil;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Description gongsigonggao-controller
 *
 * @author dddz97
 * @date 2019-03-21 10:49:24
 */
@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/gsxx")
public class GgController {

    @Resource
    private GgService ggService;

    /**
     * 公告
     * @return
     */
    @RequestMapping(value = "/gsgg")
    @ResponseBody
    @CrossOrigin
    public JSONArray getGgList() {
        List<Gsgg> list = ggService.getGgList();
        String jsonStr = JsonUtil.serializeDate(list);
        return JSON.parseArray(jsonStr);
    }

    /**
     * 项目进度
     * @return
     */
    @RequestMapping(value = "/xmjd")
    @ResponseBody
    @CrossOrigin
    public JSONArray getXmList() {
        List<Xmjd> list = ggService.getxmList();
        String jsonStr = JsonUtil.serializeDate(list);
        return JSON.parseArray(jsonStr);
    }

    @RequestMapping(value = "addGg")

    @CrossOrigin
    public JSONObject AddGg(@RequestBody Gsgg gsgg)
    {

//        gsgg.setGgTime(ggTime);
//        gsgg.setGgTitle(ggTitle);
//        gsgg.setGgNr(ggNr);

        try{
            ggService.AddGg(gsgg);
        }catch (Exception e){
            return JSON.parseObject("{success:false,msg:\"添加公告失败！\"}");
        }
       return JSON.parseObject("{success:true,msg:\"添加公告成功！\"}");

    }

    @RequestMapping(value="delGg")
    @CrossOrigin
    public JSONObject DelGg(@RequestBody Gsgg gsgg)
    {
        try{
            ggService.DelGg(gsgg);
        }catch (Exception e){
            return JSON.parseObject("{success:false,msg:\"删除公告失败！\"}");
        }
        return JSON.parseObject("{success:true,msg:\"删除公告成功！\"}");
    }

}
