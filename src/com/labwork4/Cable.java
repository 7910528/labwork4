package com.labwork4;

/**
 * The Cable class represents a cable element in the network structure.
 */
public class Cable implements NetworkElement
{
    @Override
    public void accept(NetworkVisitor visitor)
    {
        visitor.visit(this);
    }
    @Override
    public void configure()
    {
        System.out.println("Configuring cable...");
    }
}