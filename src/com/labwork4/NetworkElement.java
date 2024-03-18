package com.labwork4;

/**
 * The NetworkElement interface represents the elements of the network structure.
 * It defines methods for accepting a visitor and configuring the element.
 */
interface NetworkElement
{
    /**
     * Accepts a visitor for the element.
     *
     * @param visitor The visitor to accept.
     */
    void accept(NetworkVisitor visitor);
    /**
     * Configures the network element (stub that outputs information about the called method and its arguments to the console).
     */
    void configure();
}