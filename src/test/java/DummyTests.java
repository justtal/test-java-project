import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DummyTests {

  @Mock
  private Object object;

  @Before
  public void setup() throws Exception {
  }

  @After
  public void teardown() {
  }

  @Test
  public void trueTest() throws Exception {
    Assert.assertEquals("true", true, true);
  }

}


