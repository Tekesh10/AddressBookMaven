import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
public class AddressBookIOService {
    private static final String FILE_NAME = "ContactDetails.txt";
    public void writeContactDetails(Map<String, List<Contacts>> addressBooks) {
        Path path = Paths.get(FILE_NAME);
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
}