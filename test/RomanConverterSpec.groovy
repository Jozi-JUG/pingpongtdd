import spock.lang.Specification
import spock.lang.Unroll

public class RomanConverterSpec extends Specification {

    @Unroll("The roman numeral #romanNumeral is equivalent to #decimalNumber")
    def "Basic roman numerals"() {
        expect:
        RomanConverter.Convert(romanNumeral) == decimalNumber

        where:
        romanNumeral | decimalNumber
        "I"          | 1
        "V"          | 5
        "X"          | 10
        "L"          | 50
        "C"          | 100
        "D"          | 500
        "M"          | 1000
    }

    @Unroll("""#smallerNumeral#biggerNumeral = #decimal i.e.
    #smallerNumeral(#smallerValue) placed before #biggerNumeral(#biggerValue) indicates #biggerValue - #smallerValue""")
    def "Special cases [IV, IX, XL, XC, CD and and CM]"() {
        expect:
        RomanConverter.Convert(smallerNumeral + biggerNumeral) == decimal

        where:
        smallerNumeral | smallerValue | biggerNumeral | biggerValue | decimal
        "I"            | 1            | "V"           | 5           | 4
        "I"            | 1            | "X"           | 10          | 9
        "X"            | 10           | "L"           | 50          | 40
        "X"            | 10           | "C"           | 100         | 90
        "C"            | 100          | "D"           | 500         | 400
        "C"            | 100          | "M"           | 1000        | 900
    }

    @Unroll("'#invalidRomanNumeral' is wrong and can't be converted")
    def "Throws a runtime exception when the user supplies invalid combinations"() {
        when:
        println RomanConverter.Convert(invalidRomanNumeral)

        then:
        thrown RuntimeException

        where:
        invalidRomanNumeral | _
        "IIII"              | _
        "XXXXX"             | _
        "IM"                | _
        "IIXII"             | _
        "VX"                | _
        ""                  | _
        "A"                 | _
    }

    @Unroll("The roman numeral #romanNumeral is equivalent to #decimalNumber")
    def "Compound numbers"() {
        expect:
        RomanConverter.Convert(romanNumeral) == decimalNumber

        where:
        romanNumeral | decimalNumber
        "II"         | 2
        "III"        | 3
        "iv"         | 4
        "VI"         | 6
        "LXVI"       | 66
        "XC"         | 90
        "IX"         | 9
        "CMXCIX"     | 999
        "MCMXCI"     | 1991
    }
}
