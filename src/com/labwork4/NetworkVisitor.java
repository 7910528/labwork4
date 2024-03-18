package com.labwork4;

/**
 * The NetworkVisitor interface defines methods for visiting different network elements.
 */
interface NetworkVisitor
{
    /**
     * Visits a cable element.
     *
     * @param cable The cable element to visit.
     */
    void visit(Cable cable);
    /**
     * Visits a server element.
     *
     * @param server The server element to visit.
     */
    void visit(Server server);
    /**
     * Visits a workstation element.
     *
     * @param workstation The workstation element to visit.
     */
    void visit(Workstation workstation);
}