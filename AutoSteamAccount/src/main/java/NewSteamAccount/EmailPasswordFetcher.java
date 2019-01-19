package NewSteamAccount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmailPasswordFetcher {
    private String email;
    private String password;
    private BufferedReader bufferedReader;

    public EmailPasswordFetcher() throws IOException {
        bufferedReader = new BufferedReader(new FileReader("/Users/jevittith/4.2_JT_Labs/AutoSteamAccount/src/main/resources/Email_Info.txt"));
        this.email = bufferedReader.readLine();
        this.password = bufferedReader.readLine();
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
