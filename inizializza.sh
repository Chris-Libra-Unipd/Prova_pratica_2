#
#mvn archetype:generate -DgroupId=it.unipd.mtss -DartifactId=roman-number -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false


# Usa il primo parametro come nome file

PERCORSO_FILE="./src/main/java/it/unipd/mtss"
ItoR="$PERCORSO_FILE/IntegerToRoman.java"
Pri="$PERCORSO_FILE/RomanPrinter.java"

TEST_DIR="./src/test/java/it/unipd/mtss"
TEST_ItoR="$TEST_DIR/IntegerToRomanTest.java"
TEST_Pri="$TEST_DIR/RomanPrinterTest.java"

touch "$ItoR"
touch "$Pri"

echo -e "package it.unipd.mtss; \n public class IntegerToRoman { \n public static String convert(int number){ \n  // TODO \n   return null; \n  } \n }" > "$ItoR"
echo -e "package it.unipd.mtss; \n public class RomanPrinter { \n public static String print(int num){ \n   return printAsciiArt(IntegerToRoman.convert(num)); \n } \n private static String printAsciiArt(String romanNumber){ \n //TODO \n return null; \n } \n } \n" > "$Pri" 


touch "$TEST_ItoR"
touch "$TEST_Pri"

echo -e "package it.unipd.mtss;  \n  \n import static org.junit.Assert.assertTrue; \n  \n import org.junit.Test; \n  \n /** \n  * Unit test for simple App. \n  */ \n public class IntegerToRomanTest  \n { \n     /** \n      * Rigorous Test :-) \n      */ \n     @Test \n     public void shouldAnswerWithTrue() \n     { \n         assertTrue( true ); \n     } \n } \n  \n " > "$TEST_ItoR"
echo -e "package it.unipd.mtss;  \n  \n import static org.junit.Assert.assertTrue; \n  \n import org.junit.Test; \n  \n /** \n  * Unit test for simple App. \n  */ \n public class RomanPrinterTest  \n { \n     /** \n      * Rigorous Test :-) \n      */ \n     @Test \n     public void shouldAnswerWithTrue() \n     { \n         assertTrue( true ); \n     } \n } \n  \n " > "$TEST_Pri"


PERCORSO_CHECK_STYLE="./src/main"

mkdir "$PERCORSO_CHECK_STYLE/resources"

PERCORSO_CHECK_STYLE="$PERCORSO_CHECK_STYLE/resources"

touch "$PERCORSO_CHECK_STYLE/checkstyle.xml"

