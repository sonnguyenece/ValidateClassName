import java.util.regex.Pattern;

public class ClassName {
    private String ACCOUNT_REGEX = "^[ACP]\\d{4}[A-Za-z0-9_]*[GHIKLM]$";

    ClassName() {

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        return pattern.matcher(regex).matches();
    }
}
