import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"D:/Whizdom-Trainings/Online Training Workspace/MayWeekday19/RediffProjectCucumber/src/test/resources/com/features/login.feature:23"},
        plugin = {"json:D:/Whizdom-Trainings/Online Training Workspace/MayWeekday19/RediffProjectCucumber/target/cucumber-parallel/3.json", "html:D:/Whizdom-Trainings/Online Training Workspace/MayWeekday19/RediffProjectCucumber/target/cucumber-parallel/3"},
        monochrome = true,
        glue = {"com.qtpselenium.rediff.stepdef"})
public class Parallel03IT {
}
