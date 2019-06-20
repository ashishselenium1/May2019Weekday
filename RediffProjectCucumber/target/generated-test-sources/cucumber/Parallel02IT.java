import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"D:/Whizdom-Trainings/Online Training Workspace/MayWeekday19/RediffProjectCucumber/src/test/resources/com/features/Portfolio.feature:38"},
        plugin = {"json:D:/Whizdom-Trainings/Online Training Workspace/MayWeekday19/RediffProjectCucumber/target/cucumber-parallel/2.json", "html:D:/Whizdom-Trainings/Online Training Workspace/MayWeekday19/RediffProjectCucumber/target/cucumber-parallel/2"},
        monochrome = true,
        glue = {"com.qtpselenium.rediff.stepdef"})
public class Parallel02IT {
}
