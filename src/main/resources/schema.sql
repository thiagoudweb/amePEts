-- Criar tabela adotante
CREATE TABLE IF NOT EXISTS adotante (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL,
    cpf VARCHAR(11) UNIQUE NOT NULL,
    telefone VARCHAR(15) UNIQUE NOT NULL
);

-- Criar tabela historico_adotante
CREATE TABLE IF NOT EXISTS historico_adotante (
    id BIGSERIAL PRIMARY KEY,
    data_adocao TIMESTAMP NOT NULL,
    nome_animal VARCHAR(255) NOT NULL,
    tipo_animal VARCHAR(100) NOT NULL,
    adotante_id BIGINT,
    FOREIGN KEY (adotante_id) REFERENCES adotante(id) ON DELETE CASCADE
);

-- Criar tabela ong_adocao
CREATE TABLE IF NOT EXISTS ong_adocao (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL,
    endereco VARCHAR(255) NOT NULL,
    telefone VARCHAR(255) NOT NULL,
    cnpj_cpf VARCHAR(20) UNIQUE NOT NULL,
    documentacao TEXT,
    status_aprovacao VARCHAR(20) NOT NULL DEFAULT 'PENDENTE',
    data_cadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
