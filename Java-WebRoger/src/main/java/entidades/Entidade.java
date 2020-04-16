package entidades;

import persistencia.Persiste;

import java.sql.SQLException;

public abstract class Entidade implements Persiste {

    public abstract Contato busca(String nome) throws SQLException;
}

