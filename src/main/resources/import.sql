INSERT INTO user (id, username, password, firstname, lastname, email, phone_number) VALUES (1, 'Employer1', '111', 'Emp', 'Emp', 'emp@emp.com', '32434234');

INSERT INTO authority (id, name) VALUES (1, 'ROLE_USER');
INSERT INTO authority (id, name) VALUES (2, 'ROLE_ADMIN');
INSERT INTO authority (id, name) VALUES (3, 'ROLE_EMPLOYER');
INSERT INTO authority (id, name) VALUES (4, 'ROLE_MANAGER');

INSERT INTO user_authority (user_id, authority_id) VALUES (1, 3);
INSERT INTO user_authority (user_id, authority_id) VALUES (1, 4);
