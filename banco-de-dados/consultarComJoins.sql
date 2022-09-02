
-- Precisa por apelidos para não dar ambiguidade no VS code. No workebench não precisa. Códigos do workbench:


select * from cidades c 
inner join prefeitos p
 on c.id = p.cidade_id;

 select * from cidades c
 left join prefeitos p 
 on c.id=p.cidade_id;
 
 select * from cidades c
 right join prefeitos p 
 on c.id=p.cidade_id;
 
 select * from cidades c
 left join prefeitos p 
 on c.id=p.cidade_id
 union
 select * from cidades c
 right join prefeitos p 
 on c.id=p.cidade_id;