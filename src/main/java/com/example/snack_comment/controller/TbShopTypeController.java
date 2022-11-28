package com.example.snack_comment.controller;


import com.example.snack_comment.dto.Result;
import com.example.snack_comment.entity.TbShopType;
import com.example.snack_comment.service.TbShopTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author CoderFaFa
 * @since 2022-11-13
 */
@CrossOrigin
@RestController
@RequestMapping("/tb-shop-type")
public class TbShopTypeController {

    @Autowired
    private TbShopTypeService typeService;

    @GetMapping
    public Result shopTypeList() {
        List<TbShopType> typeList = typeService.list(null);
        return Result.ok().data("shopTypeList", typeList);
    }
}

