/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  gusta
 * Created: 16/10/2018
 */

CREATE TABLE `dependente` (
  `iddependente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `grauParentesco` varchar(45) DEFAULT NULL,
  `idCandidato` int(11) DEFAULT NULL,
  PRIMARY KEY (`iddependente`),
  KEY `idCandidato_idx` (`idCandidato`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8