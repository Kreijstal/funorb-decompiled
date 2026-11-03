/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AgeValidator extends TextInputValidator {
    static int[] field_o;
    static int field_r;
    static String whichGroupDoYouWant;
    static String gameoptCannotbecombined1;
    static byte[] field_s;
    static String unableToAddFriend;
    static boolean field_p;
    static int field_q;
    static String createAlertPasscontainsnamePartial;

    final na validationStateForText(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        na stackIn_2_0 = null;
        na stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!AgeValidator.isFriend(10, var4)) {
            stackIn_2_0 = gp.field_d;
            return stackIn_2_0;
          }
          var5 = (CharSequence) ((Object) param0);
          var3_int = GameApplet.a((byte) 114, var5);
          if (!param1) {
            field_s = (byte[]) null;
          }
          if (var3_int > 0 &&
            var3_int <= 130) {
            return ProxySocketConnector.field_e;
          }
          stackIn_9_0 = gp.field_d;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ka.K(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        unableToAddFriend = null;
        createAlertPasscontainsnamePartial = null;
        gameoptCannotbecombined1 = null;
        field_o = null;
        field_s = null;
        whichGroupDoYouWant = null;
        if (!param0) {
          createAlertPasscontainsnamePartial = (String) null;
        }
    }

    final static boolean isFriend(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 10) {
            AgeValidator.a(false, 105);
          }
          stackIn_3_0 = na.isValidInteger(10, true, param1, 87);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ka.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        PlayingSound var2 = null;
        PlayingSound var2Lifetime1;
        try {
          BallDebugOverlay.field_b = param1;
          if (!param0) {
            field_q = -113;
          }
          var2 = (PlayingSound) (oj.field_o.last((byte) -36));
          while (var2 != null) {
            if (var2.field_m.b(-108)) {
              var2.field_o.setVolume(BallDebugOverlay.field_b * var2.field_n + 128 >> 8);
            } else {
              var2.unlink((byte) -117);
            }
            var2 = (PlayingSound) (oj.field_o.previous((byte) -5));
          }
          if (null != UsernameSuggestionsPanel.field_R) {
            var2Lifetime1 = (PlayingSound) (UsernameSuggestionsPanel.field_R.last((byte) 113));
            while (var2Lifetime1 != null) {
              if (!var2Lifetime1.field_m.b(-113)) {
                var2Lifetime1.unlink((byte) -117);
              } else {
                var2Lifetime1.field_o.setVolume(128 + var2Lifetime1.field_n * BallDebugOverlay.field_b >> 8);
              }
              var2Lifetime1 = (PlayingSound) (UsernameSuggestionsPanel.field_R.previous((byte) -5));
            }
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ka.M(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(byte param0) {
        if (param0 > -71) {
          field_r = 25;
          if (ArrayWidgetGroup.field_H) {
            SoftwareRasterizer.darkenRectangle(SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipTop, SoftwareRasterizer.clipRight - SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipBottom - SoftwareRasterizer.clipTop);
            e.field_a.drawRoot((byte) -79, false);
            return;
          }
          return;
        }
        if (!ArrayWidgetGroup.field_H) {
          return;
        }
        SoftwareRasterizer.darkenRectangle(SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipTop, SoftwareRasterizer.clipRight - SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipBottom - SoftwareRasterizer.clipTop);
        e.field_a.drawRoot((byte) -79, false);
    }

    final static void h(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        try {
          var4 = ProgressDialog.field_ib;
          var1 = var4;
          var2 = param0;
          var3 = var4.length;
          while (var3 > var2) {
            var4[var2++] = 0;
            var4[var2++] = 0;
            var4[var2++] = 0;
            var4[var2++] = 0;
            var4[var2++] = 0;
            var4[var2++] = 0;
            var4[var2++] = 0;
            var4[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "ka.O(" + param0 + ')');
        }
    }

    AgeValidator(TextInputWidget param0) {
        super(param0);
    }

    final String validationMessageForText(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            var4 = (String) null;
            this.validationMessageForText((String) null, -21);
          }
          if (this.validationStateForText(param0, true) != gp.field_d) {
            return null;
          }
          stackIn_5_0 = ThemeSelectScreen.createAlertInvalidage;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ka.L(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = new int[4];
        gameoptCannotbecombined1 = "This option cannot be combined with the current '<%0>' setting.";
        unableToAddFriend = "Unable to add friend - system busy";
        whichGroupDoYouWant = "<%0>, which group do you want to play as?";
        createAlertPasscontainsnamePartial = "This password is part of your Player Name, and would be easy to guess";
        field_p = false;
    }
}
