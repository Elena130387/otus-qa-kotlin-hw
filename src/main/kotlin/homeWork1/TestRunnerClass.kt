package homeWork1
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println
import kotlin.reflect.full.declaredFunctions

class TestRunnerClass: TestRunner {

    override fun <T> runTest(steps: T, test: () -> Unit) {
        steps::class.declaredFunctions.forEach {
            if (it.name.startsWith("before")) {
                println("Start before method: ${it.name}")
                it.call(steps)
                println("Finish before method: ${it.name}")
            }
        }
        test()
        steps::class.declaredFunctions.forEach {
            if (it.name.startsWith("after")) {
                println("Start after method: ${it.name}")
                it.call(steps)
                println("Finish after method: ${it.name}")
            }
        }
    }
}