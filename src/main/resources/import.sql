INSERT INTO user (id, username, password, firstname, lastname, email, phone_number) VALUES (1, 'user', '123', 'Fan', 'Jin', 'test', '32434234');
INSERT INTO user (id, username, password, firstname, lastname, email, phone_number) VALUES (2, 'admin', '123', 'Jing', 'Xiao', 'test', '32434234');

INSERT INTO authority (id, name) VALUES (1, 'ROLE_USER');
INSERT INTO authority (id, name) VALUES (2, 'ROLE_ADMIN');

INSERT INTO user_authority (user_id, authority_id) VALUES (1, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (2, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (2, 2);
