CREATE TABLE msc_learners
(
    id       INT NOT NULL,
    name     VARCHAR(255) NULL,
    email    VARCHAR(255) NULL,
    password VARCHAR(255) NULL,
    college  VARCHAR(255) NULL,
    company  VARCHAR(255) NULL,
    CONSTRAINT pk_msc_learners PRIMARY KEY (id)
);

CREATE TABLE msc_mentors
(
    id              INT NOT NULL,
    name            VARCHAR(255) NULL,
    email           VARCHAR(255) NULL,
    password        VARCHAR(255) NULL,
    avg_rating DOUBLE NOT NULL,
    current_company VARCHAR(255) NULL,
    CONSTRAINT pk_msc_mentors PRIMARY KEY (id)
);

CREATE TABLE products
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    name          VARCHAR(255) NULL,
    category      VARCHAR(255) NULL,
    `description` VARCHAR(255) NULL,
    CONSTRAINT pk_products PRIMARY KEY (id)
);