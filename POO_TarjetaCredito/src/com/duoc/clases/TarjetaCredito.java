package com.duoc.clases;

import java.text.DecimalFormat;

public class TarjetaCredito {
    
    //Atributos
    private String nro_tarjeta; //Cadena de 16 dígitos, separados por un - cada 4 números
    private int cupo_autorizado; //Monto máximo posible a ocupar
    private int cupo_disponible; //Monto que esta disponible para ser usado.
    private boolean estado; //TRUE para definir que la tarjeta está activo, FALSE para definir que la tarjeta está bloqueada
    
    //Contructores
    public TarjetaCredito() {
    }

    public TarjetaCredito(String nro_tarjeta, int cupo_autorizado, int cupo_disponible, boolean estado) {
        this.nro_tarjeta = nro_tarjeta;
        this.cupo_autorizado = cupo_autorizado;
        this.cupo_disponible = cupo_disponible;
        this.estado = estado;
    }
    
    //Accesadores y Mutadores (Getters & Setters)
    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public int getCupo_autorizado() {
        return cupo_autorizado;
    }

    public void setCupo_autorizado(int cupo_autorizado) {
        this.cupo_autorizado = cupo_autorizado;
    }

    public int getCupo_disponible() {
        return cupo_disponible;
    }

    public void setCupo_disponible(int cupo_disponible) {
        this.cupo_disponible = cupo_disponible;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    //Métods CUSTOM
    
    /**
     * Este método permite evaluar si es factible realizar una compra. Para esto
     * se validará si la tarjeta está activa y el monto a comprar es menor o 
     * igual al cupo disponible. En caso de cumplirse ambas condiciones se procederá
     * a descontar del cupo disponible el monto ingresado y se retornará TRUE.
     * En caso que al menos una de las condiciones no se cumplan se retornará FALSE
     * lo que implica que no se pudo realizar la compra.
     * 
     * 
     * @param monto int
     * @return boolean
     * @author Christian Sarmiento
     * @version v1.0
     */
    public boolean comprar(int monto){
        if (estado == true && monto <= cupo_disponible)
        {
            cupo_disponible = cupo_disponible - monto; //cupo_disponible -= monto;
            return true;
        }
        return false;
    }
    
    /**
     * Este método permite abonar a la deuda o cupo utlizado de la tarjeta.
     * El monto se sumará al cupo disponible generando un nuevo disponible.
     * Se puede dar el caso en el cual el cupo disponible sea mayor al 
     * autorizado.
     * 
     * @param monto int 
     * @author Christian Sarmiento
     * @version v1.0
     */
    public void pagarDeuda(int monto){
        cupo_disponible += monto;
    }
    
    /**
     * Este método permite aumentar el cupo autorizado de la tarjeta.
     * Para realizar el proceso de debe cumplir que la tarjeta esta activa.
     * En cuyo caso el monto ingresado se agregará al cupo autorizado 
     * generando un nuevo cupo autorizado, retornando TRUE como resultado del }
     * proceso. En caso contrario, es decir, que la tarjeta este bloqueada
     * no se podrá completar el proceso y se retornará FALSE.
     * 
     * @param monto int 
     * @return boolean
     * @author Christian Sarmiento
     * @version v1.0
     */
    public boolean aumentarCupoAutorizado(int monto){
        if (estado)
        {
            cupo_disponible += monto;
            return true;
        }
        return false;
    }
    
    /**
     * Este método permite bloquear una tarjeta solo si esta tarjeta se 
     * encuentra desbloqueada o activa. Si por el contrario la tarjeta ya se 
     * encuentra bloqueada no se podra bloquear.
     * 
     * @return boolean
     */
    public boolean bloquearTarjeta(){
        if(estado)
        {
            estado = false;
            return true;
        }
        return false;
    }
    
    /**
     * Este método permite desbloquear una tarjeta solo si esta tarjeta se 
     * encuentra bloqueada o inactiva. Si por el contrario la tarjeta ya se 
     * encuentra desbloqueada no se podra desbloquear.
     * 
     * @return boolean
     */
    public boolean desbloquearTarjeta(){
        if(estado == false)
        {
            estado = true;
            return true;
        }
        return false;
    }
    
    public String informacionTarjeta(){
        DecimalFormat formatoCupos = new DecimalFormat("$ ###,###");
        
        String estado = "Habilitada";
        if(this.estado == false)
        {
            estado = "Bloqueada";
        }
        String info = 
                "Nro. Tarjeta: " + nro_tarjeta + "\n" + 
                "Cupo Autorizado: " + formatoCupos.format(cupo_autorizado) + "\n" +
                "Cupo Disponible: " + formatoCupos.format(cupo_disponible) + "\n" + 
                "Estado: " + estado;
        return info;
    }
    
    
    
    
    
}
