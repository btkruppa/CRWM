CREATE TABLE PLAYER (
PLAYER_ID INT PRIMARY KEY,
EMAIL VARCHAR(50) UNIQUE,
PLAYER_PASSWORD VARCHAR(20),
FIRST_NAME VARCHAR(20),
LAST_NAME VARCHAR(20),
HIGH_SCORES NUMBER,
IS_DEV VARCHAR(20)
);
/
CREATE TABLE LEADERBOARD (
LEADERBOARD_ID INT PRIMARY KEY,
USER_ID VARCHAR(20),
SCORE NUMBER
);
/
ALTER TABLE LEADERBOARD
ADD CONSTRAINT FK_USER_ID
FOREIGN KEY (USER_ID) REFERENCES PLAYER(PLAYER_ID);
/
CREATE SEQUENCE SQ_PLAYER_ID_PK
START WITH 10000
INCREMENT BY 10;
/
CREATE OR REPLACE TRIGGER TR_INSERT_PLAYER_ID
BEFORE INSERT ON PLAYER 
FOR EACH ROW
BEGIN 
    SELECT SQ_PLAYER_ID_PK.NEXTVAL INTO :NEW.PLAYER_ID FROM DUAL;
END;
/
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('kboden0@google.com', 'qn36JJ6E9ov', 'Karoly', 'Boden', '114383566', 'false');
/
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('jcromett1@statco.com', 'aIValPqO', 'Jone', 'Cromett', '746368599', 'false');
/
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('lberridge2@netlg.com', 'Ks7bPBfIqX', 'Lazare', 'Berridge', '609301551', 'false');
/
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('rhaibel3@irs.gov', 'Mjeiveyj5jM', 'Roderic', 'Haibel', '626797711', 'false');
/
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('rwhetson4@dagon.com', 'Y6KkbYWP1cO', 'Reuben', 'Whetson', '860140548', 'false');
/
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('hdurrell0@indigo.com', 'yTXA0LXDON', 'Herby', 'Durrell', 796121652, 'false');
/
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('mnation1@ailmail.com', 'lBPb3c9', 'Mayer', 'Nation', 648021327, 'false');
/
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('hfylan2@telgraph.com', '2wE7BR', 'Hammad', 'Fylan', 588576524, 'false');
/
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('nnancarrow3@uiuc.edu', 'GpTfq7IRG', 'Nikolos', 'Nancarrow', 388770525, 'false');
/
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('aharwell4@cross.org', 'KAw0H4ZY', 'Alwyn', 'Harwell', 526495310, 'false');
/
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('myakubovic5@buzz.com', 'lcHMVnKpWm', 'Michelle', 'Yakubovich', 025072409, 'false');
/
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('rbourgeois6@msn.com', 'h1trHVs', 'Rica', 'Bourgeois', 280320318, 'false');
/
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('kstoneb7@oracle.com', 'PBvHNhD', 'Kenon', 'Stonebridge', 341146115, 'false');
/
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('tpascoe8@ebay.com', '02GI8qU', 'Tori', 'Pascoe', 835394044, 'false');
/
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('gpetro9@journal.com', 'Nq6dr2m', 'Gavra', 'Petrolli', 586412287, 'false');
/
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('mcouch@crwm.com', 'qwerty', 'Max', 'Couch', 548302749, 'true');
/
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('dwatts@crwm.com', 'qwerty', 'Darius', 'Watts', 803795037, 'true');
/
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('jmulrenin@crwm.com', 'qwerty', 'Jake', 'Mulrenin', 793050384, 'true');
/ 
insert into PLAYER (EMAIL, PLAYER_PASSWORD, FIRST_NAME, LAST_NAME, HIGH_SCORES, IS_DEV) values ('rruiz@crwm.com', 'qwerty', 'Rebecca', 'Ruiz', 947930753, 'true');
/
CREATE SEQUENCE SQ_LEADERBOARD_ID_PK
START WITH 1
INCREMENT BY 1;
/
CREATE OR REPLACE TRIGGER TR_INSERT_LEADERBOARD_ID
BEFORE INSERT ON LEADERBOARD 
FOR EACH ROW
BEGIN 
    SELECT SQ_LEADERBOARD_ID_PK.NEXTVAL INTO :NEW.LEADERBOARD_ID FROM DUAL;
END;
/
INSERT INTO LEADERBOARD (USER_ID, SCORE) VALUES ('rruiz@crwm.com', 947930753);
/
INSERT INTO LEADERBOARD (USER_ID, SCORE) VALUES ('rwhetson4@dagon.com', 860140548);
/
INSERT INTO LEADERBOARD (USER_ID, SCORE) VALUES ('tpascoe@ebay.com', 835394044);
/
INSERT INTO LEADERBOARD (USER_ID, SCORE) VALUES ('dwatts@crwm.com', 803795037);
/
INSERT INTO LEADERBOARD (USER_ID, SCORE) VALUES ('hdurrell0@indigo.com', 796121652);
/



