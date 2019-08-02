package ng.com.refactoringjavatokotllin

import java.text.DecimalFormat
import ng.com.refactoringjavatokotllin.CurrencyFormatUtil.Companion.asCurrency


@JvmField
val currencyFormat = DecimalFormat("#,###,###.##")
@JvmField
val DEFAULT_CURRENCY = "₦"


fun Double.asCurrency() = asCurrency(DEFAULT_CURRENCY)

fun String.asCurrency() = asCurrency(DEFAULT_CURRENCY)

fun Int.asCurrency() = asCurrency(DEFAULT_CURRENCY)