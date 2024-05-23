package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.dgc.Lease;
import java.util.List;

public class FileManager {

    private  static final String FILE_NAME = "contracts.csv";
    public void saveContract(Contract contract) {

        try {

            // BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true));
            String contractType = "";

            if (contract instanceof SalesContract) {
                contractType = "SALE";

            } else if (contract instanceof LeaseContract) {
                contractType = "LEASE";
            }
            SalesContract salesContract = (SalesContract) contract;
            String contractInfo = contractType + "|" + salesContract.getDate() + "|" + salesContract.getCustomerName() + "|" + salesContract.getCustomerEmail() + "|";

            Vehicle vehicle = contract.getVehicleSold();
            if (contract instanceof SalesContract) {


                // SalesContract salesContract = (SalesContract) contract;
                //  BufferedWriter write(contractInfo + vehicle.getVin() + "|" + vehicle.getYear() + "|" + vehicle.getMake() + "|" + vehicle.getColor() + "|" + vehicle.getOdometer() + "|" + vehicle.getPrice() + "|" + vehicle.getModel() + "|" + salesContract.getSalesTaxAmount() + "|" + salesContract.getProcessingFees() + "|" + salesContract.getRecordingFees() + "|" + salesContract.isFinance();
                LeaseContract leaseContract = (LeaseContract) contract;


                // bw.newLine();

            }

            System.out.println("Contract is saved successfully to csv file ");


            // } catch (IOException) {

            {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
