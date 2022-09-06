object Main {
  def main(args: Array[String]): Unit = {
    def encryption(x:String,y:Int):Unit={

      var z:Array[String] = new Array[String](x.length() )
      var a=0
      var w=0
      z(0)=x
      //print(z(0)(1))

      for( a <- 0 to x.length-1) {
        if ((z(0)(a).toInt > 64 && z(0)(a).toInt < 91) || (z(0)(a).toInt > 96 && z(0)(a).toInt < 123)) {
          if(z(0)(a).toInt > 64 && z(0)(a).toInt < 91){
            if (z(0)(a).toInt + (y % 26) > 91) {
              print((z(0)(a).toInt + (y % 26) - 26).toChar)
              //z(0)(a) - 26
            }
            else if (z(0)(a).toInt < 91) {
              print((z(0)(a).toInt + (y % 26)).toChar)
              //z(0)(a) += (y%26)
            }
        }
          else {
              if (z(0)(a).toInt+(y%26)> 123) {
                //z(0)(a)- 26
                print((z(0)(a).toInt+(y%26)-26).toChar)
              }
              else if (z(0)(a).toInt > 95) {
              print((z(0)(a).toInt+(y%26)).toChar)
              //z(0)(a) + (y%26)

            }
          }
        }
        else{
          print(z(0)(a))
        }
      }


    }



    def decryption(x:String,y:Int):Unit={

      var z:Array[String] = new Array[String](x.length() )
      var a=0
      var w=0
      z(0)=x
      //print(z(0)(1))

      for( a <- 0 to x.length-1) {
        if ((z(0)(a).toInt > 64 && z(0)(a).toInt < 91) || (z(0)(a).toInt > 96 && z(0)(a).toInt < 123)) {
          if(z(0)(a).toInt > 64 && z(0)(a).toInt < 91) {
              if (z(0)(a).toInt - (y % 26) < 65) {
                print((z(0)(a).toInt - (y % 26) + 26).toChar)
                //z(0)(a) - 26
              }
              else if (z(0)(a).toInt > 65) {
                print((z(0)(a).toInt - (y % 26)).toChar)
                //z(0)(a) += (y%26)
              }
          }
          else {
            if (z(0)(a).toInt-(y%26)<97) {
              //z(0)(a)- 26
              print((z(0)(a).toInt-(y%26)+26).toChar)
            }
            else if (z(0)(a).toInt <97) {
              print((z(0)(a).toInt-(y%26)).toChar)
              //z(0)(a) + (y%26)

            }
          }
        }
        else{
          print(z(0)(a))
        }
      }


    }

    def chiper(): Unit = {
      printf("Enter the String :")
      val result = scala.io.StdIn.readLine()
      printf("Enter the amount of character want to switch :")
      val num=scala.io.StdIn.readInt()
      //encryption(result,num)
      //decryption(result,num)

    }
    chiper()
  }
}