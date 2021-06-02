package com.viewwuyou.myblog.model.DO;

import java.util.List;

public class ContentDO {
    private Integer id;
    private ContentDO parent;
    private List<ContentDO> sons;
    private String context;
    private ArticleDO articleDO;


    public ContentDO() {
    }

    public ContentDO(Integer id, ContentDO parent, List<ContentDO> sons, String context, ArticleDO articleDO) {
        this.id = id;
        this.parent = parent;
        this.sons = sons;
        this.context = context;
        this.articleDO = articleDO;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ContentDO getParent() {
        return parent;
    }

    public void setParent(ContentDO parent) {
        this.parent = parent;
    }

    public List<ContentDO> getSons() {
        return sons;
    }

    public void setSons(List<ContentDO> sons) {
        this.sons = sons;
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
