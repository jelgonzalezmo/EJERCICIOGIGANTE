/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casasoftware;

import Dao.Archivo;
import datos.Admon;
import datos.CasaSoftware;
import datos.Consultor;
import datos.Contrato;
import datos.Lider;
import datos.Programador;
import excepciones.NombreExcepcion;
import excepciones.LenguajeExcepcion;
import excepciones.SalarioExcepcion;
import java.io.FileNotFoundException;

/**
 *
 * @author Profe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        CasaSoftware cs = new CasaSoftware();
        Contrato c2 = null;
        Programador c3 = null;
        Lider c4 = null;

        try {
            Contrato c1 = new Consultor(1, "ibghfhjfddg");
            cs.adicionarContrato(c1);
            c2 = new Admon(2111111, "fgfjgjgyyyk", 11011111);
            cs.adicionarContrato(c2);
            c3 = new Programador(2111111, "fjkhkyyyuky", 1111110, "java");
            cs.adicionarContrato(c3);
            c4 = new Lider(3, "fuykyyyyyyyyl,jh", 1111110, "javadoc");
            c4.adicionarProgramador(c3);
            cs.adicionarContrato(c4);
                    } catch (NombreExcepcion ex) {
            ex.printStackTrace();
        } catch (LenguajeExcepcion ex) {
            ex.printStackTrace();
        } catch (SalarioExcepcion ex) {
            ex.printStackTrace();
        }
        System.out.println(cs.mostrarInformacion());
        Archivo db=new Archivo();
        db.escribir(cs);
        
            }
}
