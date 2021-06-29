import org.junit.Test
import ru.vldf.filecomparsion.getFileComparisonThrowableOrNull
import java.io.File

class Demo {
    @Test
    fun main() {
        val file = object {}::class.java.getResource("expectedFile") ?: error("")
        val throwable = getFileComparisonThrowableOrNull(
            "Test",
            "42",
            File(file.file)
        )
        throw throwable!!
    }
}