-- Inserção de dados na tabela tb_departamentos
INSERT INTO tb_departamentos(name) VALUES ('Gestão');
INSERT INTO tb_departamentos(name) VALUES ('Informática');

-- Inserção de dados na tabela tb_usuarios
INSERT INTO tb_usuarios(departamento_id, name, email) VALUES (1, 'Maria', 'maria@gmail.com');
INSERT INTO tb_usuarios(departamento_id, name, email) VALUES (1, 'Bob', 'bob@gmail.com');
INSERT INTO tb_usuarios(departamento_id, name, email) VALUES (2, 'Alex', 'alex@gmail.com');
INSERT INTO tb_usuarios(departamento_id, name, email) VALUES (2, 'Ana', 'ana@gmail.com');
