DROP TABLE IF EXISTS Content;

CREATE TABLE Content (
    content_id INT PRIMARY KEY AUTO_INCREMENT,
    content_parent_id INT,
    content_text VARCHAR(255) NOT NULL ,
    foreign key (content_parent_id) REFERENCES Content(content_id)
);