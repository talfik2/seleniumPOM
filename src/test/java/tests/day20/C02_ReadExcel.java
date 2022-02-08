package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ReadExcel {


    @Test
    public void test01() throws IOException {

        // ulkeler excel inin 3 satirini yazdirin
        String path="src/test/java/Resorses/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fis);

        for (int i=0 ; i<4 ; i++){

            System.out.print(workbook.getSheet("Sayfa1").getRow(2).getCell(i)+" ");
        }
        System.out.println();


        System.out.println("\n=====================");
        //ilk 20 ulkenin baskentlerinin Turkce isimlerini yazdirin

        for (int i=0; i<=20 ;i++){

            System.out.println(i+" "+workbook.getSheet("Sayfa1").getRow(i).getCell(3));
        }

    }
}
