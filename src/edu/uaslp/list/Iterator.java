package edu.uaslp.list;

public interface Iterator <T>{

    /**
     * Regresa el valor del nodo actual y avanza al siguiente
     *
     * @return valor del nodo actual
     */
    T next();

    /**
     * Indica si se puede seguir iterando en la lista
     * @return true si se puede avanzar (se puede llamar a next) o de lo contrario, false
     *
     * @see Iterator next
     */

    boolean hasNext();
}
