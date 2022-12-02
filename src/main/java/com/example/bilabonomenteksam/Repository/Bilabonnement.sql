CREATE DATABASE Car;

USE Car;




CREATE TABLE ListOfCars
(
    vehicleNumber    INT,
    frameNumber    INT,
    make         VARCHAR(50),
    model         VARCHAR(50),
    equipmentLevel   INT,
    steelPrice      DOUBLE,
    reg_Charge DOUBLE,
    co2_Emmission DOUBLE,
    status VARCHAR(50),
    PRIMARY KEY (vehicleNumber)
);

CREATE TABLE RentalAgreements
(
    id INT AUTO_INCREMENT,
    vehicleNumber int,
    name VARCHAR(50),
    email VARCHAR(50),
    phoneNumber int,
    address VARCHAR(50),
    rentalPeriod VARCHAR(50),
    price int,
    PRIMARY KEY (id),
    FOREIGN KEY (vehicleNumber) REFERENCES ListOfCars(vehicleNumber)
);


INSERT INTO ListOfCars(vehicleNumber, frameNumber, make, model, equipmentLevel, steelPrice, reg_Charge, co2_Emmission,status)VALUES (1, 1111, 'Citroen', 'C5 X', 5, 58000, 23000, 345,'');
INSERT INTO ListOfCars(vehicleNumber, frameNumber, make, model, equipmentLevel, steelPrice, reg_Charge, co2_Emmission,status)VALUES (2, 1222, 'Ford', 'Ford Mustang', 8, 230000, 40000, 567,'');
INSERT INTO ListOfCars(vehicleNumber, frameNumber, make, model, equipmentLevel, steelPrice, reg_Charge, co2_Emmission,status)VALUES (3, 1333, 'Merzedes', 'Mercedes-Benz C-Klasse', 9, 82000, 45000, 321,'');
INSERT INTO ListOfCars(vehicleNumber, frameNumber, make, model, equipmentLevel, steelPrice, reg_Charge, co2_Emmission,status)VALUES (4, 1444, 'Peagout', '308', 6, 66000, 35000, 212,'');
INSERT INTO ListOfCars(vehicleNumber, frameNumber, make, model, equipmentLevel, steelPrice, reg_Charge, co2_Emmission,status)VALUES (5, 1555, 'Audi', 'A3', 10, 100000, 40000, 145,'');
INSERT INTO ListOfCars(vehicleNumber, frameNumber, make, model, equipmentLevel, steelPrice, reg_Charge, co2_Emmission,status)VALUES (6, 1666, 'Saab', '9-3 SportCombi', 10, 70000, 30000, 123,'');
INSERT INTO ListOfCars(vehicleNumber, frameNumber, make, model, equipmentLevel, steelPrice, reg_Charge, co2_Emmission,status)VALUES (7, 1777, 'Fiat', '500', 7, 50000, 13000, 123,'');
INSERT INTO ListOfCars(vehicleNumber, frameNumber, make, model, equipmentLevel, steelPrice, reg_Charge, co2_Emmission,status)VALUES (8, 1899, 'BMW', 'X5', 5, 100000, 15000, 231,'');
INSERT INTO ListOfCars(vehicleNumber, frameNumber, make, model, equipmentLevel, steelPrice, reg_Charge, co2_Emmission,status)VALUES (9, 1999, 'Kia', 'Sportage', 2, 60000, 20000, 123,'');
INSERT INTO ListOfCars(vehicleNumber, frameNumber, make, model, equipmentLevel, steelPrice, reg_Charge, co2_Emmission,status)VALUES (10, 2000, 'Volvo', 'XC90', 5, 65000, 10000, 423,'');

INSERT INTO RentalAgreements(id, name, email, phoneNumber,address, rentalPeriod, price)  VALUES(1,'Test','Test@test.test',12345,'test vej nr. 21','Et antal måneder',4000);
SELECT * FROM ListOfCars Inner JOIN RentalAgreements on ListOfCars.vehicleNumber = RentalAgreements.id=1;

SELECT * FROM ListOfCars;
SELECT * FROM RentalAgreements;
DROP DATABASE Car;
DROP TABLE ListOfCars;
DROP TABLE RentalAgreements;