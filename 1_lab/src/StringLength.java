import java.util.ArrayList;

public class StringLength implements ITask {
    @Override
    public String Run(ArrayList<String> data) {
        return String.valueOf(data.get(0).length());
    }
}
