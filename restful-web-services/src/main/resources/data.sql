INSERT INTO user_details(id, birth_date, name) VALUES(10001, current_date(), 'Andrew');
INSERT INTO user_details(id, birth_date, name) VALUES(10002, current_date(), 'Barry');
INSERT INTO user_details(id, birth_date, name) VALUES(10003, current_date(), 'Chris');

INSERT INTO post(id, description, user_id) VALUES (20001, 'Post 1', 10001);
INSERT INTO post(id, description, user_id) VALUES (20002, 'Post 2', 10002);
INSERT INTO post(id, description, user_id) VALUES (20003, 'Post 3', 10003);
INSERT INTO post(id, description, user_id) VALUES (20004, 'Post 4', 10003);