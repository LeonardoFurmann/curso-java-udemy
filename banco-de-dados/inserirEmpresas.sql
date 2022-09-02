
-- modificando tabela empresas cnpj para varchar

ALTER TABLE empresas MODIFY cnpj  VARCHAR(14);

insert into empresas (nome, cnpj)
values 
    ('Bradesco', 898989898989),
    ('Vale', 898989677989),
    ('Cielo', 898355598989);

-- descrever tabela
desc empresas;

select * from empresas;
select * from cidades;

insert into empresas_unidades(empresa_id,cidade_id, sede)
values 
    (1,1,1),
    (1,4,0),
    (2,1,0),
    (2,4,1);