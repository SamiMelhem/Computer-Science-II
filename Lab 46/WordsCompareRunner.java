import static java.lang.System.*;
public class WordsCompareRunner
{
   public static void main( String args[] )
   {
      WordsCompare test = new WordsCompare();
      test.setWords("abe","ape");
      test.compare();
      out.println(test);
      test.setWords("giraffe","gorilla");
      test.compare();
      out.println(test);
      test.setWords("one","two");
      test.compare();
      out.println(test);
      test.setWords("fun","funny");
      test.compare();
      out.println(test);
      test.setWords("123","19");
      test.compare();
      out.println(test);
      test.setWords("193","1910");
      test.compare();
      out.println(test);
      test.setWords("goofy","godfather");
      test.compare();
      out.println(test);
      test.setWords("funnel","fun");
      test.compare();
      out.println(test);
   }
}