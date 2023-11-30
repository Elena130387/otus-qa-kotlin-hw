package homeWork1

interface TestRunner {
    fun <T> runTest (steps: T, test: () -> Unit)
}