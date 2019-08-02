package ng.com.refactoringjavatokotllin

class CurrencyFormatUtil {
	companion object{
		@JvmStatic
		fun Number.asCurrency(symbol: String) = "$symbol${currencyFormat.format(toDouble())}"
		@JvmStatic
		fun String.asCurrency(symbol: String) = "$symbol${currencyFormat.format(toDouble())}"
	}
}