DROP TABLE IF EXISTS Article;

CREATE TABLE Article (
    article_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    article_name VARCHAR(255) NOT NULL ,
    article_url VARCHAR(255) NOT NULL ,
    article_author VARCHAR(255) ,
    article_content_id INT NOT NULL ,
    article_summary TEXT ,
    article_gmt DATETIME NOT NULL ,
    article_modify_gmt DATETIME NOT NULL ,
    FOREIGN KEY (article_content_id) REFERENCES Content(content_id)
);