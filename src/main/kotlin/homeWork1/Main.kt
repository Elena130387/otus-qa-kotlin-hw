package homeWork1

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println

fun main() {
    val baseTest = BaseTest()
    val test = TestRunnerClass()

    fun testFun(){
        println("Primary testFun started")
    }
    test.runTest(baseTest) { testFun() }
}