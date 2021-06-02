package com.viewwuyou.myblog.model.DO;

import java.util.Date;
import java.util.List;

public class ArticleDO {
    private int id;
    private String name;
    private Date gmtCreate;
    private Date gmtModify;
    private String author;
    private ContentDO contentDO;
    private List<TagDO> tagDOS;
    private String summary;
    private String url;

    public ArticleDO() {
    }

    public ArticleDO(int id, String name, Date gmtCreate, Date gmtModify, String author, ContentDO contentDO, List<TagDO> tagDOS, String summary, String url) {
        this.id = id;
        this.name = name;
        this.gmtCreate = gmtCreate;
        this.gmtModify = gmtModify;
        this.author = author;
        this.contentDO = contentDO;
        this.tagDOS = tagDOS;
        this.summary = summary;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ContentDO getContentDO() {
        return contentDO;
    }

    public void setContentDO(ContentDO contentDO) {
        this.contentDO = contentDO;
    }

    public List<TagDO> getTagDOS() {
        return tagDOS;
    }

    public void setTagDOS(List<TagDO> tagDOS) {
        this.tagDOS = tagDOS;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
