DROP TABLE IF EXISTS article_tag;

CREATE TABLE article_tag (
    id INT PRIMARY KEY AUTO_INCREMENT ,
    article_id BIGINT NOT NULL ,
    tag_id INT NOT NULL ,
    FOREIGN KEY (article_id) REFERENCES article(article_id),
    FOREIGN KEY (tag_id) REFERENCES tag(tag_id)
);