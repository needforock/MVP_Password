package ve.needforock.mvp_password;

/**
 * Created by Soporte on 21-Aug-17.
 */

public class PasswordVerification {
    VerificationCallBack verificationCallBack;

    public PasswordVerification(VerificationCallBack verificationCallBack) {
        this.verificationCallBack = verificationCallBack;
    }

    public void Verification(String value){
        if (value.trim().length()>0) {
            if (value.trim().length() >= 8) {
                verificationCallBack.PasswordVerification("Password tiene longitud mayor o igual a 8");
            } else {
                verificationCallBack.PasswordVerification("Password tiene longitud menor a 8");
            }
        }else{
            verificationCallBack.BlankInput();
        }

    }
}
