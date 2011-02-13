/**
 * 
 */
package jp.ranmelo;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/**
 * 着信状態監視クラス
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
	 * 着信状態監視ハンドラ
	 * 
	 * @param	state	着信状態
	 * @param	number	着信番号(のはず)
	 */
	@Override
    public void onCallStateChanged(int state, String number) {
        switch(state) {
        case TelephonyManager.CALL_STATE_RINGING:	//鳴っている状態
            break;
        case TelephonyManager.CALL_STATE_OFFHOOK:	//電話に出た
            break;
        case TelephonyManager.CALL_STATE_IDLE:		//終了
            break;
        }
    }
}
