package com.example.snack_comment.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.snack_comment.dto.Result;
import com.example.snack_comment.entity.TbShop;
import com.example.snack_comment.exceptions.CustomException;
import com.example.snack_comment.mapper.TbShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author CoderFaFa
 * @since 2022-11-13
 */
@RestController
@RequestMapping("/tb-shop")
public class TbShopController {

    @Autowired
    private TbShopMapper tbShopMapper;

    @GetMapping
    public Result tbShopList() {
        List<TbShop> shopList = tbShopMapper.selectList(null);
        return Result.ok().data("shopList", shopList);
    }
}

