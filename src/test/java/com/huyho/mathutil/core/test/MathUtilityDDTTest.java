/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.huyho.mathutil.core.test;

import com.huyho.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author huyho
 */
public class MathUtilityDDTTest {

    // ta cần chuẩn bị bộ data để nhồi vào cái hàm qua 2 tham số
    //đã chừa sẵn!!!
    //kĩ thuật tách data kiểm thử ra khỏi câu lệnh so sánh
    //để data ở riêng 1 chỗ, từ từ fill vào hàm so sánh
    //kĩ thuật này gọi là DDT DATA DRIVEN TESTING
    //DATA THƯỜNG SẼ ĐỂ Ở MẢNG 2 CHIỀU
    //1 CÁI LÀ ĐẦU VÀO N, 1 CÁI LÀ ĐẦU RA EXPECTED
    //VÀ CÓ NHIỀU CẶP NHƯ THẾ
    //KĨ THUẬT NÀY CÒN GỌI LÀ THAM SỐ HOÁ KIỂM THỬ
    //ĐƯA DATA VÀO QUA THAM SỐ HÀM
    //mảng 2 chiều này sẽ nhồi vào hàm ở dưới
    public static Object[][] initData() {
        Object[][] dataSet = {{0, 1},
                              {1, 1}, 
                              {3, 6}, 
                              {4, 24}, 
                              {5, 120}};

        return dataSet;
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRightArgumentReturnsOk(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}
