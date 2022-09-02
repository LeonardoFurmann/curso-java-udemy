
-- Precisa por apelidos para não dar ambiguidade no VS code. No workebench não precisa. Códigos do workbench:


select e.nome, c.nome
from empresas e, empresas_unidades eu, cidades c
where e.id = eu.empresa_id
and c.id = eu.cidades_id
and sede;

-- Com apelidos

select e.nome as Empresa, c.nome as Cidade
from empresas e, empresas_unidades eu, cidades c
where e.id = eu.empresa_id
and c.id = eu.cidade_id
and sede;
