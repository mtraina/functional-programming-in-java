package chapter02

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class GettingStartedSpec extends Specification {

    def "it should calculate #expected as factorial of #n"(){
        expect:
        GettingStarted.factorial(n) == expected

        where:
        n   | expected
        0   | 1
        3   | 6
        5   | 120
        10  | 3628800
    }

    def "it should calculate #expected as fibonacci of #n"(){
        expect:
        GettingStarted.fibonacci(n) == expected

        where:
        n   | expected
        0   | 0
        1   | 1
        2   | 1
        3   | 2
        4   | 3
        5   | 5
        6   | 8
        10  | 55

    }
}
