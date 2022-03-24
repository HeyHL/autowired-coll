package io.hel.comp;

import org.springframework.stereotype.Component;

/**
 * helei
 * 2022/3/23 11:39
 * description:
 */
@SuppressWarnings("all")
@Component(value = "chinese")
public class ChineseSupport implements LangSupport {


    public void lang() {
        System.out.println("Chinese");
    }
}
