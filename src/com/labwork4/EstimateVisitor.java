package com.labwork4;

/**
 * The EstimateVisitor class represents a concrete visitor that calculates estimates
 * for network elements in the network structure.
 */
public class EstimateVisitor implements NetworkVisitor
{
    /** The estimate of the network structure. */
    private int estimate;
    /**
     * Gets the estimate of the network structure.
     *
     * @return The estimate of the network structure.
     */
    public int getEstimate()
    {
        return estimate;
    }
    @Override
    public void visit(Cable cable)
    {
        estimate += 50;
    }
    @Override
    public void visit(Server server)
    {
        estimate += 500;
    }
    @Override
    public void visit(Workstation workstation)
    {
        estimate += 200;
    }
}