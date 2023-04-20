DROP TABLE IF EXISTS visits;
DROP TABLE IF EXISTS odontologists;
DROP TABLE IF EXISTS clients;

CREATE TABLE clients(
	id INT NOT NULL AUTO_INCREMENT,
	dni VARCHAR(9) NOT NULL,
	name_surname VARCHAR(255) DEFAULT NULL,
	phone_number VARCHAR(15) DEFAULT NULL,
	email VARCHAR(255) NOT NULL,
	insurance VARCHAR(100) DEFAULT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE odontologists(
	id INT NOT NULL AUTO_INCREMENT,
	dni VARCHAR(9) NOT NULL,
	name_surname VARCHAR(255) DEFAULT NULL,
	phone_number VARCHAR(15) DEFAULT NULL,
	email VARCHAR(255) NOT NULL,
	speciality VARCHAR(100) DEFAULT NULL,
	medical_license_no INT NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE visits(
	id INT NOT NULL AUTO_INCREMENT,
	client_id INT NOT NULL,
	odontologist_id INT NOT NULL,
	procedure_type VARCHAR(155) DEFAULT NULL,
	scheduled DATETIME DEFAULT CURRENT_TIMESTAMP,
	price DECIMAL(10,2) DEFAULT NULL,
	PRIMARY KEY(id),
	CONSTRAINT FK_visit_client FOREIGN KEY (client_id) REFERENCES clients(id) ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT FK_visit_odontologist FOREIGN KEY (odontologist_id) REFERENCES odontologists(id) ON UPDATE CASCADE ON DELETE CASCADE
);


INSERT INTO clients(dni, name_surname, phone_number, email, insurance) VALUES ('11111111A', 'Client 1', '977844840', 'client1@gmail.com', 'Adeslas');
INSERT INTO clients(dni, name_surname, phone_number, email, insurance) VALUES ('22222222B', 'Client 2', '977864879', 'client2@hotmail.com', 'Mutua');
INSERT INTO clients(dni, name_surname, phone_number, email, insurance) VALUES ('33333333C', 'Client 3', '977854879', 'client3@gmail.com', 'Adeslas');
INSERT INTO clients(dni, name_surname, phone_number, email, insurance) VALUES ('44444444D', 'Client 4', '977874879', 'client4@gmail.com', 'Sanitas');
INSERT INTO clients(dni, name_surname, phone_number, email, insurance) VALUES ('55555555E', 'Client 5', '977862779', 'client5@shadymail.com', 'AXA');
INSERT INTO clients(dni, name_surname, phone_number, email, insurance) VALUES ('66666666F', 'Client 6', '977865079', 'client6@gmail.com', 'Sanitas');

INSERT INTO odontologists(dni, name_surname, phone_number, email, speciality, medical_license_no)
VALUES ('33333333A', 'Doctor 1', '977648971', 'doctor1@gmail.com', 'Surgery', 77145698);
INSERT INTO odontologists(dni, name_surname, phone_number, email, speciality, medical_license_no)
VALUES ('22222222B', 'Doctor 2', '977608971', 'doctor2@outlook.com', 'Orthodontics', 11445678);
INSERT INTO odontologists(dni, name_surname, phone_number, email, speciality, medical_license_no)
VALUES ('11111111C', 'Doctor 3', '977688471', 'doctor3@hotmail.com', 'Pediatric Dentistry', 8746987);

INSERT INTO visits(client_id, odontologist_id, procedure_type, scheduled, price) VALUES (1, 1, 'Teeth Cleaning', '2022-04-25 09:05:00', 299.90);
INSERT INTO visits(client_id, odontologist_id, procedure_type, scheduled, price) VALUES (2, 1, 'Dental Implant', '2022-04-25 10:00:00', 480.50);
INSERT INTO visits(client_id, odontologist_id, procedure_type, scheduled, price) VALUES (3, 1, 'Root Canal', '2022-04-25 12:30:00', 150.00);
INSERT INTO visits(client_id, odontologist_id, procedure_type, scheduled, price) VALUES (4, 2, 'Tooth Extraction', '2022-04-25 09:05:00', 80.99);
INSERT INTO visits(client_id, odontologist_id, procedure_type, scheduled, price) VALUES (5, 2, 'Periodontal Treatment', '2022-04-25 13:20:00', 437.20);
INSERT INTO visits(client_id, odontologist_id, procedure_type, scheduled, price) VALUES (6, 3, 'Dental Filling', '2022-04-25 09:05:00', 100.40);