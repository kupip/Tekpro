/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Application launches from this class
 *
 * @author Goteti Santosh Ravi Teja
 */
public class StoreDriver {

    /**
     *
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        int managerCount = 0;
        int salesAssociateCount = 0;
        int cashierCount=0;

        PrintWriter pwd = new PrintWriter(new File("C:\\Users\\rafif\\OneDrive\\Documents\\Berkas Polban\\Semester 2\\Tekpro\\Java files\\Tekpro\\Pertemuan 5\\store\\outputFile.txt"));
        Scanner sc = new Scanner(new File("C:\\Users\\rafif\\OneDrive\\Documents\\Berkas Polban\\Semester 2\\Tekpro\\Java files\\Tekpro\\Pertemuan 5\\store\\inputFile.txt"));
        
        List<Manager> managerList = new ArrayList<Manager>();
        
        List<SalesAssociate> SalesAssociateList = new ArrayList<SalesAssociate>();
        
        List<Cashier> CashierList = new ArrayList<Cashier>();
        while (sc.hasNext()) {

            String employeeType = sc.nextLine();
            String storeDetails = sc.nextLine();
            String empName = sc.nextLine();
            double basePay = sc.nextDouble();
            double numberOfHoursWorked = sc.nextDouble();
            double hourlyRate = sc.nextDouble();

            if (employeeType.equals("Manager")) {
                double currentSales = sc.nextDouble();
                double CurrentStoreSales = sc.nextDouble();

                Manager manager = new Manager(CurrentStoreSales, currentSales, numberOfHoursWorked,
                        hourlyRate, storeDetails, basePay, empName);
//              String str = sc.nextLine(); // pengisian  yang tidak perlu
                sc.nextLine();
                managerList.add(manager);

            } else if (employeeType.equals("Sales Associate")){
                double salesRate = sc.nextDouble();
                SalesAssociate salesAssociate = new SalesAssociate(salesRate, numberOfHoursWorked, hourlyRate, storeDetails, empName, basePay);
                SalesAssociateList.add(salesAssociate);
                if (sc.hasNext()) {
                    sc.nextLine();
                }
            } else {
            	int transactionDone = sc.nextInt();
            	Cashier aCashier = new Cashier(transactionDone, numberOfHoursWorked, hourlyRate, storeDetails, basePay, empName);
            	CashierList.add(aCashier);
            	if (sc.hasNext()) {
            		sc.nextLine();
            	}
            }

        }

        System.out.println("******************************************************");
        System.out.println("Number of employees working as MANAGER are: " + managerList.size());
        System.out.println("******************************************************");
        pwd.println("******************************************************");
        pwd.println("Number of employees working as MANAGER are: " + managerList.size());
        pwd.println("******************************************************");
        
        for (Manager manager : managerList) {
            managerCount++;
            System.out.println(managerCount + ". Manager Details:");
            System.out.println(manager);
            pwd.println(managerCount + ". Manager Details:");
            pwd.println(manager);
            System.out.println("Percentage of sales done: " + String.format("%.2f", manager.salesPercentByManager()) + "%");
            pwd.println("Percentage of sales done: " + String.format("%.2f", manager.salesPercentByManager()) + "%");
            System.out.println("Gross Payment: $" + String.format("%.1f", manager.calculatePay()));
            pwd.println("Gross Payment: $" + String.format("%.1f", manager.calculatePay()));
            System.out.println("Remaining store revenue: $" + manager.calculateRemainingStoreRevenue(manager.getTotalStoreSales()));
            pwd.println("Remaining store revenue: $" + manager.calculateRemainingStoreRevenue(manager.getTotalStoreSales()));

            System.out.print("Is " + manager.getEmployeeName() + " eligible for promotion? ");
            if (manager.checkPromotionEligibility() == true) {
                System.out.println("Yes, he is \n");
            } else {
                System.out.println("No, he needs to work harder\n");
            }

        }

        System.out.println("******************************************************");
        System.out.println("Number of employees working as SALES ASSOCIATES are: " + SalesAssociateList.size());
        System.out.println("******************************************************");
        pwd.println("******************************************************");
        pwd.println("Number of employees working as SALES ASSOCIATES are: " + SalesAssociateList.size());
        pwd.println("******************************************************");

        for (SalesAssociate salesAssociate : SalesAssociateList) {
            salesAssociateCount++;
            System.out.println(salesAssociateCount + ". Sales Associate Details:");
            System.out.println(salesAssociate);
            pwd.println(salesAssociate);
            System.out.println("Total commission: $" + salesAssociate.calculateCommission());
            System.out.println("Gross Payment: $" + salesAssociate.calculatePay());

            pwd.println("Total commission: $" + salesAssociate.calculateCommission());
            pwd.println("Gross Payment: $" + salesAssociate.calculatePay());
            System.out.print("Is " + salesAssociate.getEmployeeName() + " eligible for promotion? ");
            if (salesAssociate.checkPromotionEligibility() == true) {
                System.out.println("Yes, he/she is eligible\n");
            } else {
                System.out.println("No, he/she needs to work harder\n");
            }

        }
        
        System.out.println("******************************************************");
        System.out.println("Number of employees working as CASHIER are: " + CashierList.size());
        System.out.println("******************************************************");
        pwd.println("******************************************************");
        pwd.println("Number of employees working as CASHIER are: " + CashierList.size());
        pwd.println("******************************************************");
        
        for (Cashier cashier: CashierList) {
            cashierCount++;
            System.out.println(cashierCount + ". Cashier Details:");
            System.out.println(cashier);
            pwd.println(cashier);
            System.out.println("Total commission: $" + cashier.calculateCommission());
            System.out.println("Gross Payment: $" + cashier.calculatePay());

            pwd.println("Total commission: $" + cashier.calculateCommission());
            pwd.println("Gross Payment: $" + cashier.calculatePay());
            
            System.out.print("Is " + cashier.getEmployeeName() + " eligible for promotion? ");
            if (cashier.checkPromotionEligibility() == true) {
                System.out.println("Yes, he/she is eligible\n");
            } else {
                System.out.println("No, he/she needs to work harder\n");
            }
            System.out.println("Nominal Jaminan Sosial: $" + cashier.hitungJaminanSosial());
            System.out.println("Kelayakan untuk mengambil cuti: " + ((cashier.layakCuti())?"layak":"tidak layak"));
            System.out.println("Nominal THR: $" + cashier.hitungJumlahTHR(cashier.getBasePay()));
        }
        
        pwd.close();
        sc.close();
        //   For loop ends after this
    }
}
