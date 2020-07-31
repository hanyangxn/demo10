package com.xn.test6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/12/29.
 */
public class Test {
    public static void main(String[] args) {
        List<Obj> list=new ArrayList<>();
        User user=new User("zhangsan");
        User user1=new User("lisi");
        list.add(user);
        list.add(user1);
        for (Obj obj:list) {
            obj.update("haha");
        }
    }
}
