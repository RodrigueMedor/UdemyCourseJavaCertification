package flightreservationproject.flightreservationproject.util;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import flightreservationproject.flightreservationproject.domain.Reservation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.itextpdf.text.Document;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

@Component
public class PdfGenerator {

    private static final Logger LOGGER = LoggerFactory.getLogger(PdfGenerator.class);

    public void generateItenary(Reservation reservation, String filePath){
        LOGGER.info("generateItinerary()");
        Document document=new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            document.addTitle("Here is your Flight tiket");
            document.add(generateTable(reservation));
            document.close();
        }catch (FileNotFoundException | DocumentException ex){
            LOGGER.info("Error in finding file");
            LOGGER.error("Exception in generateItinerary " +ex);
            ex.printStackTrace();
        }
    }

    public PdfPTable generateTable(Reservation reservation){
        PdfPTable table= new PdfPTable(2);

        PdfPCell cell = new PdfPCell(new Phrase("Flight Itinerary"));

        cell.setColspan(2);
        table.addCell(cell);

        table.addCell("Ailines");
        table.addCell(reservation.getFlight().getDepartureCity());

        table.addCell("Departure Time");
        table.addCell(reservation.getFlight().getEstimatedDepartureTime().toString());

        cell = new PdfPCell(new Phrase("Passenger Details"));
        cell.setColspan(2);
        table.addCell(cell);

        table.addCell("Last name");
        table.addCell(reservation.getPassenger().getLastname());

        table.addCell("First name");
        table.addCell(reservation.getPassenger().getFirstname());

        table.addCell("Email");
        table.addCell(reservation.getPassenger().getEmail());

        table.addCell("Phone");
        table.addCell(reservation.getPassenger().getPhone());

        return table;
    }
}
