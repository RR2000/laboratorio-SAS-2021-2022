package businesslogic.procedure;

import java.util.ArrayList;
import java.util.List;

public class GroupedSteps {

    private ArrayList<String> steps;

    public GroupedSteps() {
        this.steps = new ArrayList<>();
    }

    public ArrayList<String> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<String> steps) {
        this.steps = steps;
    }
}
