import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class EXCELhander {



        private static final String FILE_NAME = "data.xlsx";

        public static void writePersonneToExcel(Personne personne) {
            try (FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
                 Workbook workbook = new XSSFWorkbook(fileInputStream)) {

                Sheet sheet = workbook.getSheetAt(0);

                int rowCount = sheet.getLastRowNum();
                Row row = sheet.createRow(++rowCount);

                row.createCell(0).setCellValue(personne.getNom());
                row.createCell(1).setCellValue(personne.getAge());
                row.createCell(2).setCellValue(personne.getSexe());
                row.createCell(3).setCellValue(personne.getTaille());
                row.createCell(4).setCellValue(personne.getPoids());
                row.createCell(5).setCellValue(personne.calculerIMC());

                try (FileOutputStream outputStream = new FileOutputStream(FILE_NAME)) {
                    workbook.write(outputStream);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


