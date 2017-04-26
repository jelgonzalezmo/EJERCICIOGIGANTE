/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.io.FileNotFoundException;
import datos.CasaSoftware;
/**
 *
 * @author Estudiante
 */
public interface CasaSofwareDB {
    public void escribir (CasaSoftware cs)
    throws FileNotFoundException;
    public  CasaSoftware leer();
}
