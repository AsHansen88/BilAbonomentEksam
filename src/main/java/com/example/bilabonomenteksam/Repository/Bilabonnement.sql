CREATE DATABASE Bil;

USE Bil;

CREATE TABLE Lejeaftaler{
    id INT AUTO_INCREMENT,
    name VARCHAR(50) ,
    bil VARCHAR(50) ,
    kmKørt DOUBLE,
    udlejningsDato VARCHAR(50),
    udlejningsPeriode VARCHAR(50),
    vilkår VARCHAR(50),
    PRIMARY KEY(id),
    FOREIGN KEY(vognummer) REFERENCES ListeAfBiler(vognnummer)
};

CREATE TABLE ListAfBiler{
    vognnummer INT,
    stelnummer INT,
    mærke VARCHAR(50),
    model VARCHAR(50),
    udstyrnivue VARCHAR(50),
    stålpris DOUBLE,
    reg_afgidt DOUBLE,
    co2_udlidning DOUBLE,
    PRIMARY KEY(vognnummer)
};

INSERT INTO ListAfBiler(vognummer, stelnummer,mærke,model,udstyrnivue,stålpris,reg_afgidt,) VALUES()
INSERT INTO ListAfBiler(vognummer, stelnummer,mærke,model,udstyrnivue,stålpris,reg_afgidt,) VALUES()
INSERT INTO ListAfBiler(vognummer, stelnummer,mærke,model,udstyrnivue,stålpris,reg_afgidt,) VALUES()
INSERT INTO ListAfBiler(vognummer, stelnummer,mærke,model,udstyrnivue,stålpris,reg_afgidt,) VALUES()
INSERT INTO ListAfBiler(vognummer, stelnummer,mærke,model,udstyrnivue,stålpris,reg_afgidt,) VALUES()
INSERT INTO ListAfBiler(vognummer, stelnummer,mærke,model,udstyrnivue,stålpris,reg_afgidt,) VALUES()
INSERT INTO ListAfBiler(vognummer, stelnummer,mærke,model,udstyrnivue,stålpris,reg_afgidt,) VALUES()
INSERT INTO ListAfBiler(vognummer, stelnummer,mærke,model,udstyrnivue,stålpris,reg_afgidt,) VALUES()
INSERT INTO ListAfBiler(vognummer, stelnummer,mærke,model,udstyrnivue,stålpris,reg_afgidt,) VALUES()
INSERT INTO ListAfBiler(vognummer, stelnummer,mærke,model,udstyrnivue,stålpris,reg_afgidt,) VALUES()
