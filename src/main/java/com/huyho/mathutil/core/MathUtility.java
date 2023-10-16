package com.huyho.mathutil.core;

//clas này sẽ chứa các hàm static sinh ra để làm tool dùng chung cho các
//nơi khác
//cái gì mà dùng chung cho nhiều nơi, chỉ nhận info, trả về info qua hàm
//mà ko cần lưu trữ gì cả, cái đó nên là STATIC
//ĐỒ NÀO MÀ LÀ STATIC THÌ GỌI TRỰC TIẾP QUA TÊN CLASS.
//KO BAO GIỜ GỌI STATIC QUA CON ĐƯỜNG NEW!!!!!!!!!
public class MathUtility {

    public static final double PI = 3.14;
    //C: public const double Pi = 3.14 //ko cần chữ static mà vẩn là
    //static nếu có từ khoá const
    //const C# ~ final Java

    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20");
        }
        if (n == 0 || n == 1) {
            return 1; //nếu có thể kết thức sớm, thì kết thúc ngay
        }
        
        return n * getFactorial(n - 1); //đệ quy
    }
    //ĐỆ QUY - RECURSION
    //BÚP BÊ NGA - ĐỆ QUY LÀ GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
    //                  NHỎ ĐẾN 1 MỨC THÌ DỪNG LẠI
    //5! = 1.2.3.4    .5
    //5! =       4! X 5 = 5 X 4!
    //4! = 1.2.3   .4
    //4!       3! X 4 = 4 X 3!
    //3!              = 3 X 2!
    //2!              = 2 X 1!
    //N!              = N X (N - 1)!
    
    
    
    //KĨ THUẬT KIỂM THỬ HỒI QUY - REGRESSION TEST
    //TEST LẠI NHỮNG THỨ ĐÃ TỪNG TEST ĐỂ XÁC NHẬN NÓ CÒN CÓ ỔN KHÔNG
    //TẠI SAO PHẢI TEST LẠI??
    //CODE THEO THỜI GIAN SẼ CÓ THAY ĐỔI, THAY ĐỔI VÌ
    //1. ANH EM FIX BUG, SẼ SỬA CODE
    //2. ANH EM TỐI ƯU, CHỈNH SỬA CODE ĐỂ CODE DẸP HƠN, CHẠY TỐT HƠN
    //   NHANH HƠN
    //3. ANH EM THÊM HÀM MỚI, METHOD MỚI
    
    //KHI SỬA CODE, PHẢI TEST LẠI ĐỂ ĐẢM BẢO NÓ VẪN NGON VẪN XANH
    //NẾU TEST = TAY CỰC KÌ MẤT SỨC, COI CHỪNG SAI SÓT
    //NẾU CÓ TEST SCRIPT, TA CHỈ VIỆC RUN, VÀ NHÌN MÀU ĐƯA RA
    //NẾU MÀU XANH, CODE CHỈNH SỬA ỔN, VÌ THOẢ EXPECTED == ACTUAL
    //NẾU MÀU ĐỎ, CODE KO ỔN, SỬA TIẾP ĐẾN KHI NÀO ỔN
    //TA TEST LẠI MÀ CHỈ CẦN NHÌN MÀU -> NHANH, KO HAO SỨC, CHÍNH XÁC
    //MIỄN ĐỦ TEST CASE, TEST SCRIPT
    
    //TEST LẠI NHỮNG THỨ ĐÃ TỪNG TEST GỌI LÀ TEST HỒI QUY REGRESSION
    
    
    
    //hàm tính n! = 1.2.3...n
    //KO CÓ GIAI THỪA CỦA SỐ ÂM, N < 0 KO TÍNH DC
    //NẾU N QUÁ LỚN THÌ TRÀN KIỂU LONG, LONG CHỈ CHỊU DC 18 CON SỐ 0
    //20! VỪA ĐỦ 18 SỐ 0, DO ĐÓ: KO TÍNH GIAI THỪA TỪ 21 TRỞ ĐI
    //0! = 1! = 1 - QUY ƯỚC
//    public static long getFactorial(int n) {
//
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20");
//        }
//        if (n == 0 || n == 1) {
//            return 1; //nếu có thể kết thức sớm, thì kết thúc ngay
//        }
//        //sống đến chỗ này, sure n = 2..20 Vì nếu ko chết dọc đường ở
//        //2 cụm if ở trên rồi, KO CẦN ELSE NẾU TRC ĐÓ XÀI RETURN
//        long result = 1; // giai thừa khởi đầu là 1
//        //nhân dồn 2 3 4 5...n vào biến này thì thành n!
//
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//
//    }
}
