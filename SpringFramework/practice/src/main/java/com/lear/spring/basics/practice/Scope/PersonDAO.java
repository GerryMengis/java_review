package com.lear.spring.basics.practice.Scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {
    
    @Autowired
    JDBCConnection jdbcConnection;

    public JDBCConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JDBCConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }





}
