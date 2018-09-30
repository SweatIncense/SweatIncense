package com.qfedu.hanxiang.uitl;

import java.util.Random;

/**
 * @创建人 Fung
 * @创建时间 $date$
 * @描述
 */
public class RandomX {

    //生成随机数
    public static String createRandom() {

        Random rand = new Random();//生成随机数
        String cardNnumer = "";
        for (int i = 0; i < 6; i++) {
            cardNnumer += rand.nextInt(10);//生成6位数字
        }
       return  cardNnumer;

    }

}








