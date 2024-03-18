package com.labwork4;

import java.util.ArrayList;

/**
 * The Network class represents a collection of network elements.
 */
public class Network
{
    /** The list of network elements. */
    private ArrayList<NetworkElement> elements = new ArrayList<>();
    /**
     * Adds a network element to the network.
     *
     * @param element The network element to add.
     */
    public void addElement(NetworkElement element)
    {
        elements.add(element);
    }
    /**
     * Performs an operation on each network element using the specified visitor.
     *
     * @param visitor The visitor representing the operation to perform.
     */
    public void performOperation(NetworkVisitor visitor)
    {
        for (NetworkElement element : elements)
        {
            element.accept(visitor);
            element.configure();
        }
    }
}