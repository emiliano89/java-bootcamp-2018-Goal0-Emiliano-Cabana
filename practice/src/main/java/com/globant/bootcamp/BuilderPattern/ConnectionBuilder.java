/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author Emiliano
 */
public interface ConnectionBuilder {
    void buildUser();
    void buildPass();
    void buildConn();

    Connect getConnection();
}
