package bugil.bada.bugilapp.tool;

import java.math.BigDecimal;

import itmir.tistory.com.xor.SecurityXor;

/**
 * Created by whdghks913 on 2015-12-20.
 */
public class HiddenCode {
    /**
     * PrivateCode.java 파일은 공개하지 않으며 단순히 int형 숫자를 선언해둔 파일이고,
     * 원당고 앱의 공지사항등을 임의로 게시할 수 없도록 설계되었습니다.
     */
    //public static final int HIDDEN_FIRST_CODE = PrivateCode.MY_HIDDEN_FIRST_CODE;
    //public static final int HIDDEN_SECOND_CODE = PrivateCode.MY_HIDDEN_SECOND_CODE;
/**
    public static String getHiddenCode() {
        BigDecimal bigDecimal = new BigDecimal(getFirstHiddenCode())
                .multiply(new BigDecimal(getSecondHiddenCode()));
        return bigDecimal.toString();
    }

    private static int getFirstHiddenCode() {
        SecurityXor securityXor = new SecurityXor();
        int num = securityXor.getSecurityXor(securityXor.getSecurityXor(456, securityXor.getSecurityXor(HIDDEN_FIRST_CODE, 123)), 456);
        return num - 89;
    }

    private static int getSecondHiddenCode() {
        // 877
        SecurityXor securityXor = new SecurityXor();
        int num = securityXor.getSecurityXor(securityXor.getSecurityXor(768, securityXor.getSecurityXor(HIDDEN_SECOND_CODE, 2013)), 126);
        return num + 1121;
    }**/
}
