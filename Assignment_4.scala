object Assignment_4 extends App{

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val encrypt = (c:Char,key:Int,alpha:String) => alpha((alpha.indexOf(c.toUpper)+key)%alpha.size)

    val decrypt = (c:Char,key:Int,alpha:String) => alpha((alpha.indexOf(c.toUpper)-key+alpha.size)%alpha.size)

    val ceaserCipher = (algo:(Char,Int,String) => Char,text:String,key:Int,alpha:String) => text.map(algo(_,key,alpha))

    val textRead = scala.io.StdIn.readLine("Enter the text you want to encrypt: ")

    val textShift = scala.io.StdIn.readLine("Enter no of Shifts: ").toInt

    val encryptedMessage = ceaserCipher(encrypt,textRead,textShift,alphabet)

    println("Encrypted text \"" + textRead + "\" into \"" + encryptedMessage + "\"")

    val decryptedMessage = ceaserCipher(decrypt,encryptedMessage,textShift,alphabet)

    println("Encrypted text \"" + encryptedMessage + "\" into \"" + decryptedMessage + "\"")
}
