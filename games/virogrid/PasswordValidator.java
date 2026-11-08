/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordValidator extends TextFieldValidator {
    static String field_n;
    static String field_p;
    private EditableTextWidget field_o;
    private EditableTextWidget field_q;

    final static int pollAccountUiResult(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != 3938) {
            field_n = (String) null;
          }
          QueuedListRequest.field_l.processPointerFrame(ResizableDialog.field_O, LoginMethod.field_i, (byte) -127, true);
          QueuedListRequest.field_l.updateLayers(-89);
          while (GrowableIntList.pollKeyEvent((byte) -123)) {
            QueuedListRequest.field_l.dispatchKeyInput(ScrollPane.field_Gb, PopupMenuHelpers.field_d, -98);
          }
          if (BufferedSocket.field_r != -1) {
            var1_int = BufferedSocket.field_r;
            DualLinkHashTable.setLoginResultCode(-1, -1);
            stackIn_8_0 = var1_int;
            return stackIn_8_0;
          }
          if (NameEntryPopup.field_Fb) {
            stackIn_11_0 = 3;
            return stackIn_11_0;
          }
          if (ScrollPaneWithFooter.field_Kb == MouseWheelInput.field_c) {
            stackIn_14_0 = 1;
            return stackIn_14_0;
          }
          if (!ValidationIndicator.field_I.isComplete(-97)) {
            stackIn_17_0 = 1;
            return stackIn_17_0;
          }
          if (ScrollPaneWithFooter.field_Kb != MusicVoiceMixer.field_l) {
            stackIn_22_0 = -1;
            return stackIn_22_0;
          }
          stackIn_20_0 = 2;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "sn.J(" + param0 + ')');
        }
    }

    private final boolean containsEmailPart(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -22274) {
            field_n = (String) null;
          }
          var3 = this.field_o.field_n.toLowerCase();
          var4 = param1.toLowerCase();
          if (var3.length() > 0) {
            if (0 >= var4.length()) {
              return false;
            }
            var5 = var3.lastIndexOf("@");
            if (0 <= var5 &&
              var5 < var3.length() - 1) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(1 + var5);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (var4.indexOf(var7) >= 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("sn.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static Sprite loadSpriteByName(Js5Archive param0, String param1, String param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Sprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            PasswordValidator.releaseStatics((byte) -70);
          }
          var4_int = param0.findGroupId(-1, param2);
          var5 = param0.getFileId(-125, var4_int, param1);
          stackIn_3_0 = ValidationIndicator.loadSprite(param0, -80, var5, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("sn.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    PasswordValidator(EditableTextWidget param0, EditableTextWidget param1, EditableTextWidget param2) {
        super(param0);
        try {
          this.field_o = param2;
          this.field_q = param1;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "sn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String describeText(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = this.field_q.field_n.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            return null;
          }
          var5 = var4;
          if (ClientEnvironmentHelpers.isLengthOutOfRange((byte) 80, var5)) {
            stackIn_5_0 = BufferedFile.field_l;
            return stackIn_5_0;
          }
          if (GzipDecompressor.containsNonAlphanumeric(-685, var5)) {
            stackIn_9_0 = EmailValidator.field_z;
            return stackIn_9_0;
          }
          if (DateOfBirthValidator.isAllSameCharacter(var5, param0 + 26484)) {
            stackIn_12_0 = ValidatedTextWidget.field_V;
            return stackIn_12_0;
          }
          if (this.containsEmailPart(-22274, param1)) {
            stackIn_16_0 = MusicVolumeAndOverlayHelpers.field_a;
            return stackIn_16_0;
          }
          if (param0 != -26358) {
            var6 = (String) null;
            PasswordValidator.loadSpriteByName((Js5Archive) null, (String) null, (String) null, false);
          }
          if (var7.length() <= 0) {
            stackIn_21_0 = StatusAndUrlHelpers.field_f;
            return stackIn_21_0;
          }
          if (StrongCacheReference.containsTextOrReverse(var5, var7, (byte) 126)) {
            stackIn_25_0 = SingleChildWidget.field_A;
            return stackIn_25_0;
          }
          if (MouseInputHandler.containsForwardOrReversed(var5, var7, true)) {
            stackIn_28_0 = FadeLayer.field_G;
            return stackIn_28_0;
          }
          if (!ValidationIndicator.containsForwardOrReversed(var5, var7, false)) {
            stackIn_33_0 = BufferedFile.field_l;
            return stackIn_33_0;
          }
          stackIn_31_0 = SingleChildWidget.field_A;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("sn.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final static void drawHalfBlendGouraudSpan(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int[] param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = Virogrid.field_F ? 1 : 0;
        try {
          while (true) {
            param3--;
            if (param3 < 0) {
              break;
            }
            var17 = param7;
            var10 = var17;
            var11 = param6;
            var12 = param9;
            var13 = param4;
            var14 = param1;
            var15 = (16711422 & var17[var11]) >> 1;
            var10[var11] = var15 + (WidgetFactoryHelpers.bitAnd(33455969, var14) >> 17) - (-WidgetFactoryHelpers.bitAnd(16711680, var12 >> 1) - (WidgetFactoryHelpers.bitAnd(33423751, var13) >> 9));
            param4 = param4 + param0;
            param9 = param9 + param8;
            param1 = param1 + param2;
            param6++;
          }
          int var10_int = -53 % ((param5 + 14) / 62);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "sn.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + param9 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        int var1 = -63 / ((-50 - param0) / 36);
        field_p = null;
        field_n = null;
    }

    final AudioSetupHelpers validationStateForText(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        AudioSetupHelpers stackIn_2_0 = null;
        AudioSetupHelpers stackIn_5_0 = null;
        AudioSetupHelpers stackIn_9_0 = null;
        AudioSetupHelpers stackIn_12_0 = null;
        AudioSetupHelpers stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_q.field_n.toLowerCase();
          var4 = param0.toLowerCase();
          if (0 == var4.length()) {
            stackIn_2_0 = GuestPlayHelpers.field_c;
            return stackIn_2_0;
          }
          if (!param1) {
            stackIn_5_0 = (AudioSetupHelpers) null;
            return stackIn_5_0;
          }
          if (!DialWidgetPainter.isAcceptablePassword(-95, var3, var4)) {
            stackIn_9_0 = GuestPlayHelpers.field_c;
            return stackIn_9_0;
          }
          if (!this.containsEmailPart(-22274, param0)) {
            stackIn_14_0 = CachedTextLayout.field_i;
            return stackIn_14_0;
          }
          stackIn_12_0 = GuestPlayHelpers.field_c;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("sn.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_n = "The account name you use to access RuneScape and other Jagex.com games";
        field_p = "Pause Menu";
    }
}
