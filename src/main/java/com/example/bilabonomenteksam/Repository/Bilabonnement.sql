CREATE DATABASE Car;

USE Car;

CREATE TABLE Lejeaftaler
(
    id                INT AUTO_INCREMENT,
    name              VARCHAR(50),
    bil               VARCHAR(50),
    kmKørt            DOUBLE,
    udlejningsDato    VARCHAR(50),
    udlejningsPeriode VARCHAR(50),
    vilkår            VARCHAR(50),
    PRIMARY KEY (id)
);


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

SELECT * FROM ListOfCars;

DROP DATABASE Bil;
DROP TABLE ListOfCars;