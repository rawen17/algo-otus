import java.util.ArrayList;
import java.util.List;

public class StringLength implements ITask{
    @Override
    public String run(List<String> data) {
        if (data.isEmpty()) {
            return "";
        }
        return String.valueOf(data.get(0).length());
    }
}
