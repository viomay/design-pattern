package cn.leon.pattern.factory.simple;

import cn.leon.pattern.factory.BakedRaengmyeon;
import cn.leon.pattern.factory.EggBurger;
import cn.leon.pattern.factory.Food;

/**
 * 简单工厂
 * （深夜食堂）
 * @author Leon
 */
public class SimpleFactory {
    // 菜单
    public Food getDelicious(String foodName) {
        if ("BakedRaengmyeon".equals(foodName)) {
            return new BakedRaengmyeon();
        } else if ("EggBurger".equals(foodName)) {
            return new EggBurger();
        }
        return null;
    }
}
