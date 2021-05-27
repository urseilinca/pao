
CREATE TABLE `clients` (
`id` int (11) NOT NULL AUTO_INCREMENT,
`nume` varchar(100) NOT NULL,
`cnp` varchar(100) NOT NULL,
`varsta` int (11) NOT NULL ,
`email` varchar(100) NOT NULL,
`nrtelef` varchar(100) NOT NULL,
PRIMARY KEY (`id`));

CREATE TABLE `programari` (
`id` int (11) NOT NULL AUTO_INCREMENT,
`nume` varchar(100) NOT NULL,
`cdata` varchar(100) NOT NULL,
`varsta` int (11) NOT NULL ,
`ora` varchar(100) NOT NULL,
PRIMARY KEY (`id`));


DELIMITER $$

CREATE FUNCTION `total_amount_per_type` ( bank_account_type varchar(100))
    RETURNS DOUBLE
BEGIN
	DECLARE total_amount double;
    SELECT sum(balance) INTO total_amount FROM bankaccounts ba WHERE ba.type = bank_account_type;
RETURN total_amount;
END$$

DELIMITER ;