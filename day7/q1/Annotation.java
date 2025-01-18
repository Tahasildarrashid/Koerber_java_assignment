package day7.q1;

import day7.q1.Author;

@Author(name = "Johny")
@Version(number = 1.0f)
public class Annotation {

    @Author(name = "Johny")
    @Version(number = 1.0f)
    public class annotation {

        @Author(name = "Author1")
        @Version(number = 2.0f)
        public void annotatedMethod1() {
        }

        @Author(name = "Author2")
        @Version(number = 4.0f)
        public void annotatedMethod2() {
        }
    }
}
