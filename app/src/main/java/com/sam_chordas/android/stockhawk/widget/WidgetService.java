package com.sam_chordas.android.stockhawk.widget;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by himanshu on 3/12/16.
 */
public class WidgetService extends RemoteViewsService
{

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent)
    {
        return (new WidgetRemoteViewsFactory(this.getApplicationContext(), intent));
    }

}