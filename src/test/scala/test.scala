import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class FooSpec extends FlatSpec with ShouldMatchers {

  "This test" should "pass with flying colours" in {
    val stack = 2
    stack should equal (2)
}

  it should "fail on this test though" in {
    val something = "foo"
    evaluating { something  } should produce [NoSuchMethodException]
  }
}
