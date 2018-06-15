package com.zr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class TextEditor {

    /*
        避免混淆
    */
//    @Qualifier("spellChecker")
    @Resource(name = "spellChecker")
    private SpellChecker spellChecker;

    /*
        构造函数中的 @Autowired:除去XML配置中的constructor-arg
    */
    @Autowired
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }
    /*
        属性中的 @Autowired:除去XML配置中属性ref
    */
    @Autowired
    public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    /*
         @PostConstruct注释作为初始化回调函数的一个替代，@PreDestroy注释作为销毁回调函数的一个替代
    */
//    @PostConstruct
//    public void init(){
//        System.out.println("Bean is going through init.");
//    }
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Bean will destroy now.");
//    }
}