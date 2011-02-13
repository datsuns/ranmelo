/**
 * 
 */
package jp.ranmelo;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/**
 * ���M��ԊĎ��N���X
 * 
 * @author Owner
 *
 */
public class MyPhoneStateListener extends PhoneStateListener{
	private android.content.Context _m_Context;

	public MyPhoneStateListener( android.content.Context context )
	{
		_m_Context = context;
	}
	
	/**
	 * ���M��ԊĎ��n���h��
	 * 
	 * @param	state	���M���
	 * @param	number	���M�ԍ�(�̂͂�)
	 */
	@Override
    public void onCallStateChanged(int state, String number) {
        switch(state) {
        case TelephonyManager.CALL_STATE_RINGING:	//���Ă�����
            break;
        case TelephonyManager.CALL_STATE_OFFHOOK:	//�d�b�ɏo��
            break;
        case TelephonyManager.CALL_STATE_IDLE:		//�I��
            break;
        }
    }
}
