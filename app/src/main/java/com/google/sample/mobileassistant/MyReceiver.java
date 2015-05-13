/*
 * Copyright (c) 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.sample.mobileassistant;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.sample.mobileassistant.backend2.shoppingassistant.Shoppingassistant;
import com.google.sample.mobileassistant.backend2.shoppingassistant.Shoppingassistant.Builder;
import com.google.sample.mobileassistant.backend2.shoppingassistant.Shoppingassistant.Deviceinfos;
import com.google.sample.mobileassistant.backend2.shoppingassistant.model.DeviceInfo;

import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import java.io.IOException;


public class MyReceiver extends BroadcastReceiver {

  Intent myIntent;

  @Override
  public void onReceive(Context context, Intent intent) {
    //Log.d("2erlog","2erlog>>>>>>>>>>>>>>>>>>>>>>>>");
   // myIntent = new Intent(context, NotifService.class);
   // context.startService(myIntent);
    //Log.d("3erlog","3erlog>>>>>>>>>>>>>>>>>>>>>>>>");
  }
}