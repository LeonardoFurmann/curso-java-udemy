alter table estados
modify column regiao ENUM('Norte' , 'Nordeste', 'Centro-Oeste', 'Sudeste', 'Sul') NOT NULL;

update estados
set nome = "Maranhão"
WHERE sigla = 'MA'

select est.nome from estados est where sigla = "MA"

update estados
set nome = "Paraná", populacao = 11.32
where sigla = "PR"

select est.nome from estados est where sigla = "PR"