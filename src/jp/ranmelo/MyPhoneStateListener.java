/**
 * 
 */
package jp.ranmelo;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.widget.Toast;

/**
 * ���M��ԊĎ��N���X
 * 
 * @author Owner
 *
 */
public class MyPhoneStateListener extends PhoneStateListener{
	private android.content.Context _copiedContext;

	public MyPhoneStateListener( android.content.Context context )
	{
		_copiedContext = context;
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
        case TelephonyManager.CALL_STATE_RINGING:	// ���Ă�����
        case TelephonyManager.CALL_STATE_OFFHOOK:	// �d�b�ɏo��
            break;

        case TelephonyManager.CALL_STATE_IDLE:		// �I��
        	/*
        	 * ���̂�����̏ꍇ�������ɂ���͗l
        	 * �E���M���� -> �ؒf
        	 * �E���M�̂܂� -> �ؒf
        	 * �E���M����
        	 * 
        	 * ����Ă����Œ��M����ύX����΂悢�͂�
        	 */
        	Toast.makeText( _copiedContext, "Ringtone should be changed here !", Toast.LENGTH_LONG ).show();
            break;
        }
    }
}
