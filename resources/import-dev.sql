-- SQL statements which are executed at application startup if hibernate.hbm2ddl.auto is 'create' or 'create-drop'

INSERT INTO TB_USER(LOGIN, NAME, PASSWORD) VALUES('rbonifacio@cic.unb.br', 'Rodrigo Bonifacio', 'rodrigo');
INSERT INTO TB_USER(LOGIN, NAME, PASSWORD) VALUES('murlsousa@gmail.com>', 'Murilo Sousa', 'murilo');



INSERT INTO TB_BUG_CATEGORY VALUES(0, 'Undefined', 'Undefined');
INSERT INTO TB_BUG_CATEGORY VALUES(1, 'Object out of bounds for any state', 'For all game states, an object is at an invalid world position');
INSERT INTO TB_BUG_CATEGORY VALUES(2, 'Object out of bounds at a specific state', 'Only during certain game states, an object is at an invalid world position');


INSERT INTO TB_BUG_REPORT(NUMBER, SHORT_DESCRIPTION, DESCRIPTION, URL) VALUES(1, 'FOO', 'BLAH', 'http://cic.unb.br');
INSERT INTO TB_BUG_REPORT(NUMBER, SHORT_DESCRIPTION, DESCRIPTION, URL) VALUES(2, 'BLAH', 'BLAH', 'http://cic.unb.br');
INSERT INTO TB_BUG_REPORT(NUMBER, SHORT_DESCRIPTION, DESCRIPTION, URL) VALUES(2, 'BLAH', 'BLAH', 'http://cic.unb.br');
INSERT INTO TB_BUG_REPORT(NUMBER, SHORT_DESCRIPTION, DESCRIPTION, URL) VALUES(2, 'BLAH', 'BLAH', 'http://cic.unb.br');
INSERT INTO TB_BUG_REPORT(NUMBER, SHORT_DESCRIPTION, DESCRIPTION, URL) VALUES(2, 'BLAH', 'BLAH', 'http://cic.unb.br');
INSERT INTO TB_BUG_REPORT(NUMBER, SHORT_DESCRIPTION, DESCRIPTION, URL) VALUES(2, 'BLAH', 'BLAH', 'http://cic.unb.br');
INSERT INTO TB_BUG_REPORT(NUMBER, SHORT_DESCRIPTION, DESCRIPTION, URL) VALUES(2, 'BLAH', 'BLAH', 'http://cic.unb.br');
INSERT INTO TB_BUG_REPORT(NUMBER, SHORT_DESCRIPTION, DESCRIPTION, URL) VALUES(2, 'BLAH', 'BLAH', 'http://cic.unb.br');
INSERT INTO TB_BUG_REPORT(NUMBER, SHORT_DESCRIPTION, DESCRIPTION, URL) VALUES(2, 'BLAH', 'BLAH', 'http://cic.unb.br');
INSERT INTO TB_BUG_REPORT(NUMBER, SHORT_DESCRIPTION, DESCRIPTION, URL) VALUES(2, 'BLAH', 'BLAH', 'http://cic.unb.br');
INSERT INTO TB_BUG_REPORT(NUMBER, SHORT_DESCRIPTION, DESCRIPTION, URL) VALUES(2, 'BLAH', 'BLAH', 'http://cic.unb.br');


INSERT INTO TB_REVIEW(USERID, BUGREPORTID,REVIWED) SELECT u.id, b.id, FALSE FROM TB_USER u, TB_BUG_REPORT b;

