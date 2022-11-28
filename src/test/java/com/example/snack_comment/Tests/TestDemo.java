package com.example.snack_comment.Tests;

import com.example.snack_comment.entity.TbShop;
import com.example.snack_comment.mapper.TbShopMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author JJLin
 * @date 2022/11/12
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestDemo {

    @Autowired
    private TbShopMapper tbShopMapper;

    /**
     * 测试MyBatis-Plus功能
     */
    @Test
    public void test1() {
        List<TbShop> shopList = tbShopMapper.selectList(null);
        System.out.println(shopList);
    }
}
