package cu;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.FileWriter;

abstract class CSVS{
    abstract void toApproved(String A, String B, String C, String D, String E, String F, String G, String H);
    abstract void toApproved(String A, String B, String C, String D, String E, String F, String G, String H, String I, String J, String K);
    abstract void registerChange(String A, String B, String C, String D, String E);
    abstract void registerChange(String A, String B, String C, String D, String E, String F, String G);
}

public class Gui_Csv extends CSVS{
    public void toApproved(String index, String insuranceID, String PL, String name, String age, String carmodel, String TOI, String pAccount) {
        System.out.println("=====================");
        System.out.println(name + " Approved");
        System.out.println("=====================");
        try (CSVWriter AWriter = new CSVWriter(new FileWriter("csvThings/approvedInsurance.csv", true))) {
            String[] aI = {index, insuranceID, PL, name, age, carmodel, TOI, pAccount};
            AWriter.writeNext(aI);  
        } catch (IOException i) {
            System.out.println("A CSV error occurred");
        }
    }
    public void toApproved(String number, String insuranceID, String name, String age, String DE, String carmodel, String carage, String AH, String plateNumber, String TOI, String premAcc) {
        try (CSVWriter AWriter = new CSVWriter(new FileWriter("csvThings/fullListOfInsurance.csv", true))) {
            String[] aI2 = {number, insuranceID, name, age, DE, carmodel, carage, AH, plateNumber, TOI, premAcc};
            AWriter.writeNext(aI2);  
        } catch (IOException i) {
            System.out.println("A CSV error occurred");
        }
    }
    public void registerChange(String insuranceID, String PN, String carModel, String TOI, String PM) {
        try (CSVReader csvReader = new CSVReader(new FileReader("csvThings/approvedInsurance.csv"))) {
            List<String[]> rows = csvReader.readAll();
            int countRows = 0;
            for (String[] row : rows) {
                if (row[1].equals(insuranceID)) {
                    countRows +=1;
                }
            }
            for (String[] row : rows) {
                if (row[0].equals("0") && row[1].equals(insuranceID)) {
                    try (CSVWriter writer = new CSVWriter(new FileWriter("csvThings/approvedInsurance.csv", true))) {
                        String[] updatedRow = {String.valueOf(countRows), insuranceID, PN, row[3], row[4], carModel, TOI, PM};
                        writer.writeNext(updatedRow);
                    } catch (IOException e) {
                        System.out.println("A CSV error occurred");
                    }
                }
            }

        } catch (IOException | CsvException e) {
            System.out.println("A CSV error occurred");
        }
    }
    public void registerChange(String insuranceID, String PN, String carModel, String carAge, String AH, String TOI, String PM) {
        try (CSVReader csvReader = new CSVReader(new FileReader("csvThings/fullListOfInsurance.csv"))) {
            List<String[]> rows = csvReader.readAll();
            int countRows = 0;
            for (String[] row : rows) {
                if (row[1].equals(insuranceID)) {
                    countRows +=1;
                }
            }
            for (String[] row : rows) {
                if (row[0].equals("0") && row[1].equals(insuranceID)) {
                    try (CSVWriter writer = new CSVWriter(new FileWriter("csvThings/fullListOfInsurance.csv", true))) {
                        String[] updatedRow = {String.valueOf(countRows), insuranceID, row[2], row[3], row[4], carModel, carAge, AH, PN, TOI, PM};
                        writer.writeNext(updatedRow);
                    } catch (IOException e) {
                        System.out.println("A CSV error occurred");
                    }
                }
            }

        } catch (IOException | CsvException e) {
            System.out.println("A CSV error occurred");
        }
    }
}
