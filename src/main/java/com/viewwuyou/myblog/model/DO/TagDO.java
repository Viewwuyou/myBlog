package com.viewwuyou.myblog.model.DO;

public class TagDO {
    private Integer id;
    private String context;
    private ArticleDO articleDO;

    public TagDO() {
    }

    public TagDO(Integer id, String context, ArticleDO articleDO) {
        this.id = id;
        this.context = context;
        this.articleDO = articleDO;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public ArticleDO getArticleDO() {
        return articleDO;
    }

    public void setArticleDO(ArticleDO articleDO) {
        this.articleDO = articleDO;
    }
}
