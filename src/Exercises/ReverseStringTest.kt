package Exercises

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test
import org.junit.Assert.assertEquals

class ReverseStringTest {

    @Test
    fun reverseUsingSB(){
        Assert.assertEquals1("bs niltok",reverseUsingSB("kotlin sb"))
    }

    @Test fun reverseUsingLoop(){
        Assert.assertEquals1("pool niltok", reverseUsingLoop("kotlin loop"))
    }


}