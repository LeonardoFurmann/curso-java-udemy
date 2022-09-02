CREATE TABLE IF NOT EXISTS empresas(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(225) NOT NULL,
    cnpj INT UNSIGNED,
    PRIMARY KEY (id),
    UNIQUE KEY (cnpj)
);


-- muitos para muitos precisa criar outra tabela

CREATE TABLE IF NOT EXISTS empresas_unidades(
    empresa_id int UNSIGNED NOT NULL,
    cidade_id int UNSIGNED NOT NULL,
    sede TINYINT(1) NOT NULL,
    PRIMARY KEY (empresa_id, cidade_id)
);