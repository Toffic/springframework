/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponentScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Pro
 */
@Component
public class PersonDAOComponent {
    @Autowired
    JdbcConnectionComponent jdbcConnection;

    public JdbcConnectionComponent getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JdbcConnectionComponent jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
    
    
}
