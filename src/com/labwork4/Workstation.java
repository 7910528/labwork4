package com.labwork4;

/**
 * The Workstation class represents a workstation element in the network structure.
 */
public class Workstation implements NetworkElement
{
    @Override
    public void accept(NetworkVisitor visitor)
    {
        visitor.visit(this);
    }
    @Override
    public void configure()
    {
        System.out.println("Setting up workstation...");
    }
}