import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
public class AddressBookIOService {
    public void writeContactDetails(Map<String, List<Contacts>> addressBooks) {
        Path path = Paths.get("ContactDetails.txt");
        StringBuilder contactDetailsBuilder = new StringBuilder();
        addressBooks.keySet().forEach(keyOfBook -> {
            contactDetailsBuilder.append("\n").append(keyOfBook).append("->\n");
            addressBooks.get(keyOfBook).forEach(contacts -> {
                String string = contacts.toString();
                contactDetailsBuilder.append(string);
            });
        });
        try {
            Files.deleteIfExists(path);
            Files.write(path, contactDetailsBuilder.toString().getBytes());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    public void writeContactDetailsInCSV(Map<String, List<Contacts>> addressBooks) {
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter("ContactDetails.csv"));
            for (Contacts contacts: addressBooks.contactBook) {
                String[] data = new String[] {contacts.getFirst_name(), contacts.getLast_name(), contacts.getPhone_number(),
                        contacts.getEmail(), contacts.getCity(), contacts.getState(), contacts.getZipcode()};
                csvWriter.writeNext(data);
            }
            csvWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}