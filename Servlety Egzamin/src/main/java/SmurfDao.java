import java.util.ArrayList;
import java.util.List;

public class SmurfDao {
    public List<Smurf> getList() {
        List<Smurf> smurfList = new ArrayList<>();
        smurfList.add(
                new Smurf("Papa Smerf", "broda", "najstarszy ze smerfów"));
        smurfList.add(
                new Smurf("Ważniak", "okulary", "Przemądrzały i apodyktyczny"));
        smurfList.add(
                new Smurf("Smerfetka", "sukienka", "jedyna kobieta w wiosce Smerfów"));
        smurfList.add(
                new Smurf("Malarz", "Czerwony płaszcz i czarna muszka", "Uwielbia obrazy. Pięknie maluje, najczęściej Smerfetkę i krajobrazy"));
        smurfList.add(
                new Smurf("Pracuś", "Szelki przy spodniach i daszek", "166 letni Smerf, który jest wynalazcą. Uwielbia robić genialne wynalazki, które nie zawsze się udają"));
        return smurfList;
    }
}
