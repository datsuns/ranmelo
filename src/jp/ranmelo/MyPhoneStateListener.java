/**
 * 
 */
package jp.ranmelo;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.widget.Toast;

/**
 * 着信状態監視クラス
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
	 * 着信状態監視ハンドラ
	 * 
	 * @param	state	着信状態
	 * @param	number	着信番号(のはず)
	 */
	@Override
    public void onCallStateChanged(int state, String number) {
        switch(state) {
        case TelephonyManager.CALL_STATE_RINGING:	// 鳴っている状態
        case TelephonyManager.CALL_STATE_OFFHOOK:	// 電話に出た
            break;

        case TelephonyManager.CALL_STATE_IDLE:		// 終了
        	/*
        	 * 次のいずれの場合もここにくる模様
        	 * ・着信応答 -> 切断
        	 * ・着信のまま -> 切断
        	 * ・着信拒否
        	 * 
        	 * よってここで着信音を変更すればよいはず
        	 */
        	Toast.makeText( _copiedContext, "Ringtone should be changed here !", Toast.LENGTH_LONG ).show();
            break;
        }
    }
}
