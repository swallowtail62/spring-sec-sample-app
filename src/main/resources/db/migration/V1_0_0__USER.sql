CREATE TABLE IF NOT EXISTS `user`
(
    user_id          INT          NOT NULL AUTO_INCREMENT,
    user_name        VARCHAR(128) NOT NULL,
    password         VARCHAR(256) NOT NULL,
    email            VARCHAR(256) NOT NULL,
    input_user       VARCHAR(20)  NOT NULL,
    input_timestamp  TIMESTAMP    NOT NULL,
    update_user      VARCHAR(20)  NOT NULL,
    update_timestamp TIMESTAMP    NOT NULL,
    PRIMARY KEY (user_id),
    UNIQUE KEY (email)
);
