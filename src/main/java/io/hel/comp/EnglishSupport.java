package io.hel.comp;

import org.springframework.stereotype.Component;

/**
 * helei
 * 2022/3/23 11:43
 * description:
 */
@SuppressWarnings("all")
@Component(value = "english")
public class EnglishSupport implements LangSupport {
    public void lang() {
        System.out.println("English");
    }
}
