package jp.ranmelo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

public class Ranmelo extends Activity {
	private TelephonyManager _telephonyManager;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setPhoneStateLisner();
        setContentView(R.layout.main);
    }
    
    /**
     * ’…Mó‘ÔŠÄ‹ƒnƒ“ƒhƒ‰İ’è
     */
    private void setPhoneStateLisner()
    {
    	_telephonyManager = (TelephonyManager)getSystemService( Context.TELEPHONY_SERVICE );
    	_telephonyManager.listen( new MyPhoneStateListener(this), PhoneStateListener.LISTEN_CALL_STATE );
    }
}