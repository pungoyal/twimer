import com.thoughtworks.twimer.domain.Activities;
import com.thoughtworks.twimer.factories.ActivitiesFactory;
import junit.framework.TestCase;
import org.junit.Test;

public class ActivitiesFactoryTest extends TestCase {
    @Test
    public void testManufactureActivities() {

        ActivitiesFactory factory = new ActivitiesFactory();
        String json = "[{\"billable\": false, \"client_name\": \"ThoughtWorks\", \"project\": \"IS\", \"id\": 1, \"client\": \"TWORKS1\", \"sub_project_name\": \"Application Architecture\", \"sub_project\": \"APP_ARCH\", \"project_name\": \"Information Services\"}, {\"billable\": false, \"client_name\": \"ThoughtWorks\", \"project\": \"IS\", \"id\": 2, \"client\": \"TWORKS1\", \"sub_project_name\": \"Miscellaneous\", \"sub_project\": \"MISC\", \"project_name\": \"Information Services\"}]";
        Activities activities = factory.parse(json);

        assertEquals(1, activities.size());
    }
}