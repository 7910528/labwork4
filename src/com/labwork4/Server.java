package com.labwork4;

/**
 * The Server class represents a server element in the network structure.
 */
public class Server implements NetworkElement
{
    @Override
    public void accept(NetworkVisitor visitor)
    {
        visitor.visit(this);
    }
    @Override
    public void configure()
    {
        System.out.println("Initializing server...");
    }
}