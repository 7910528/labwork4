package com.labwork4;

public class Main
{
    public static void main(String[] args)
    {
        Cable cable = new Cable();
        Server server = new Server();
        Workstation workstation = new Workstation();
        Network network = new Network();
        network.addElement(cable);
        network.addElement(server);
        network.addElement(workstation);
        EstimateVisitor estimateVisitor = new EstimateVisitor();
        network.performOperation(estimateVisitor);
        System.out.println("Estimate for network structure: $" + estimateVisitor.getEstimate());
    }
}