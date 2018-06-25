package mayton.oracle {

import java.io.{OutputStream, PrintWriter, FileOutputStream}
import System.out
import System.err
import java.util.Random

/**
  * Main
  *
  * 6-Fef-2017 - (mayton) Initial commit.
  */
object Main {

  def main(args: Array[String]): Unit = {

    args.length match {

      case 0 => {
        err.println(s"Usage: java -jar OracleSchemaAdvisor-X.XX [jdbc-shortcut-string]\n")
        err.println(s"Where:\n")
        err.println(s"  jdbc-shortcut-string is ::= login/pwd@host:[port]:SID, or\n")
        err.println(s"                              login/pwd@host:[port]/SERVICE, or\n")
        System.exit(1)
      }

      case 1 => {
        new OracleSchemaAdvisor().process
        val res = (System.currentTimeMillis - begin) / 1000
        err.println(s"Elapsed time : $res sec\n")
        System.exit(2)
      }

      case _ => {
        println("Unknown command line arguments!")
      }

    }
    System.exit(0)
  }

}


}