/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MultiHandleSliderWidget extends ButtonWidget {
    static int[] field_T;
    private GrowableIntList handleValues;
    static int[] field_N;
    static String justplay;
    static int field_V;
    static String hsFriendTip;
    private int maximumValue;
    static int field_X;
    int field_R;
    static String[] field_W;
    int railInset;

    final int getHandleCount(int param0) {
        if (param0 == 0) {
          return this.handleValues.size((byte) 98);
        }
        UiWidget var3 = (UiWidget) null;
        this.handlePointerPress((UiWidget) null, -110, false, -50, 44, -90, -14);
        return this.handleValues.size((byte) 98);
    }

    final boolean handlePointerPress(UiWidget param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Pool.field_O;
        try {
          if (!super.handlePointerPress(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -param1 + (param6 - this.railInset);
          var9 = -(2 * this.railInset) + this.widgetWidth;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (0 > var8_int) {
            var8_int = 0;
          }
          var8_int = var8_int * this.maximumValue / var9;
          if (param3 != 1) {
            if (param3 == 2) {
              var10 = 2147483647;
              var11 = -1;
              for (var12 = 0; this.handleValues.size((byte) 87) > var12; var12++) {
                var13 = -var8_int + this.handleValues.get(var12, 2229);
                var13 = var13 * var13;
                if (var10 > var13) {
                  var11 = var12;
                  var10 = var13;
                }
              }
              if (var11 < 0) {
                return true;
              }
              this.handleValues.removeAt(var11, 40);
            }
          } else {
            this.handleValues.add((byte) -2, var8_int);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_26_0 = var8;
          stackIn_26_1 = new StringBuilder().append("va.AA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        hsFriendTip = null;
        field_W = null;
        field_N = null;
        justplay = null;
        if (param0 == 2) {
          field_T = null;
          return;
        }
        MultiHandleSliderWidget.isReflectionCheckReady((byte) 126);
        field_T = null;
    }

    final int getMaximumValue(int param0) {
        if (param0 != 0) {
          return 73;
        }
        return this.maximumValue;
    }

    final static String requestAddFriend(String name, int opcode, int obfuscationGuard) {
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        CipherPacketBuffer var6 = null;
        CharSequence var7 = null;
        try {
          var7 = (CharSequence) ((Object) name);
          if (!ProgressBarWidget.isAllowedDisplayName(-25908, var7)) {
            stackIn_2_0 = ModelInstance.invalidName;
            return stackIn_2_0;
          }
          if (2 != ChatInputSupport.field_a) {
            stackIn_6_0 = AgeValidator.unableToAddFriend;
            return stackIn_6_0;
          }
          if (BallEvent.isLocalPlayerName((byte) 3, name)) {
            stackIn_10_0 = QuickChatHelpDialog.cannotAddYourself;
            return stackIn_10_0;
          }
          if (DialogLayer.isFriendName(name, -1)) {
            stackIn_13_0 = AccountWelcomePanel.substituteTemplateArguments(new String[]{name}, -1, RankingsScreen.friendlistdupe);
            return stackIn_13_0;
          }
          if (AccountWelcomePanel.field_S >= 100 &&
            UsernameSuggestionsPanel.field_V <= 0) {
            stackIn_18_0 = MessageDialogContent.friendlistfull;
            return stackIn_18_0;
          }
          if (AccountWelcomePanel.field_S >= 200) {
            stackIn_22_0 = MessageDialogContent.friendlistfull;
            return stackIn_22_0;
          }
          if (MenuSelection.isIgnoredName(name, 24552)) {
            stackIn_26_0 = AccountWelcomePanel.substituteTemplateArguments(new String[]{name}, -1, DisplayNamePanel.removeignorefirst);
            return stackIn_26_0;
          }
          var6 = JaggrabDownloader.field_j;
          var6.writeCipheredOpcode(false, opcode);
          var6.position = var6.position + 1;
          var4 = var6.position;
          var6.writeByte(0, false);
          var5 = -59 % ((-53 - obfuscationGuard) / 33);
          var6.writeNullTerminatedString(-9946, name);
          var6.writeByteLengthPrefix(var6.position - var4, true);
          stackIn_28_0 = null;
          return (String) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("va.G(");
          if (name == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(opcode).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static boolean isReflectionCheckReady(byte obfuscationGuard) {
        ReflectionCheck var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ReflectionCheck var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          var5 = (ReflectionCheck) (MessageScreen.field_H.last((byte) -88));
          var1 = var5;
          if (var1 == null) {
            return false;
          }
          var2 = 0;
          var3 = -7 % ((obfuscationGuard + 62) / 57);
          while (var1.field_t > var2) {
            if (null != var5.field_n[var2] &&
              0 == var5.field_n[var2].field_f) {
              return false;
            }
            if (null != var5.field_p[var2] &&
              var5.field_p[var2].field_f == 0) {
              return false;
            }
            var2++;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "va.F(" + obfuscationGuard + ')');
        }
    }

    final static void centerWidgetVertically(boolean obfuscationGuard, UiComponent container, UiComponent widget) {
        try {
          if (obfuscationGuard) {
            field_T = (int[]) null;
          }
          widget.localY = -widget.height + container.height >> 1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "va.D(" + obfuscationGuard + ',' + (container != null ? "{...}" : "null") + ',' + (widget != null ? "{...}" : "null") + ')');
        }
    }

    final int getHandleValueAt(byte param0, int param1) {
        if (param0 > -22) {
          UiComponent var4 = (UiComponent) null;
          MultiHandleSliderWidget.centerWidgetVertically(true, (UiComponent) null, (UiComponent) null);
          if (0 > param1) {
            return -1;
          }
          if (param1 < this.handleValues.size((byte) 127)) {
            return this.handleValues.get(param1, 2229);
          }
          return -1;
        }
        if (0 > param1) {
          return -1;
        }
        if (param1 < this.handleValues.size((byte) 127)) {
          return this.handleValues.get(param1, 2229);
        }
        return -1;
    }

    private MultiHandleSliderWidget() throws Throwable {
        throw new Error();
    }

    static {
        hsFriendTip = "Friends can be added in multiplayer<nbsp>games";
        justplay = "Just play";
    }
}
