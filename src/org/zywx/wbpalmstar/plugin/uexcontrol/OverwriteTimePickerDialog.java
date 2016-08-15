package org.zywx.wbpalmstar.plugin.uexcontrol;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.WindowManager;

public class OverwriteTimePickerDialog extends TimePickerDialog {

	public OverwriteTimePickerDialog(Context context,
			OnTimeSetListener callBack, int hourOfDay, int minute,
			boolean is24HourView) {
		super(context, callBack, hourOfDay, minute, is24HourView);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().setSoftInputMode(
				WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE
						| WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub

	}

    @Override
    public void onClick(DialogInterface dialog, int which) {
        // ĳЩ�ֻ��ֶ�����ʱ��󱣴���Ч����Ҫ�ͷŽ���������������
        if (dialog instanceof TimePickerDialog) {
            ((TimePickerDialog) dialog).getWindow().getDecorView().clearFocus();
        }
        super.onClick(dialog, which);
    }
}
