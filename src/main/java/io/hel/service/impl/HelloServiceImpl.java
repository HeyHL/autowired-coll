package io.hel.service.impl;

import io.hel.comp.LangSupport;
import io.hel.holder.ApplicationContextHolder;
import io.hel.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * helei
 * 2022/3/23 11:36
 * description:
 */
@SuppressWarnings("all")
@Service
public class HelloServiceImpl implements HelloService {

    // NB!
    @Autowired
    private Map<String, LangSupport> langSupportMap;

    @Autowired
    private ApplicationContextHolder applicationContextHolder;

    public String sayHello(String name, String lang) {
        LangSupport langSupport = langSupportMap.get(lang);
//        LangSupport langSupport = applicationContextHolder.getApplicationContext().getBean(lang, LangSupport.class);
        langSupport.lang();
        return "hello, " + name;
    }
}
