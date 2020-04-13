package com.luoys.onepiece.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/member")
public class member {

    @Autowired
    JdbcTemplate onePiece;

    @RequestMapping(value = "/queryAllCards", method = RequestMethod.GET)
    public List<Map<String, Object>> queryAll() {

        List<Map<String, Object>> allMembers = onePiece.queryForList("select biz_id, user_name from package_bind_log;");
        return allMembers;

    }

    @RequestMapping(value = "/invalid", method = RequestMethod.GET)
    public String invalid(@RequestParam("biz_id") String biz_id) {
        if (biz_id == null) {
            return "卡号{biz_id}不能为空";
        }
        int rows = onePiece.update("update package_bind_log set `status` = 3 where biz_id=?;", new Object[] {biz_id});
        if (rows == 0)
            return "卡号不存在";
        else
            return "卡号："+biz_id+"，作废成功";

    }

    @RequestMapping(value = "/expires", method = RequestMethod.GET)
    public String expires(@RequestParam("biz_id") String biz_id) {
        if (biz_id == null) {
            return "卡号{biz_id}不能为空";
        }
        int rows = onePiece.update("update package_bind_log set gmt_invalid=DATE_SUB(CURDATE(),INTERVAL 1 DAY) where biz_id=?;", new Object[] {biz_id});
        if (rows == 0)
            return "卡号不存在";
        else
            return "卡号："+biz_id+"，过期成功";

    }

}
