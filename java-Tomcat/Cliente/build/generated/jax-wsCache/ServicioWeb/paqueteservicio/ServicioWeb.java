/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteServicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author javier
 */
@WebService(serviceName = "ServicioWeb")
public class ServicioWeb {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "serieFibonacci")
    public String serieFibonacci(@WebParam(name = "numero") int numero) {
        //TODO write your implementation code here:
        int f,a=0;
        int b=1;
        String res="";
        for (int i = 0; i < numero; i++) {
            f=a+b;
            b=a;
            a=f;
            res = res + f + ",";
        }
        return res;
    }
}
