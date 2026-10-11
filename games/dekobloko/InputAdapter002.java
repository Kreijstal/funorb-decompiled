/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InputAdapter002 implements CallbackContract004 {
    static String stringState0033;
    private int integerState0040;
    private int integerState0041;
    static String stringState0034;
    private int integerState0042;
    private BitmapFont bitmapFontState0004;
    private int integerState0043;
    private int integerState0044;
    private int integerState0045;
    static SceneWidgetPart003 sceneWidgetPart003State0001;
    private int integerState0046;

    public static void performAction0075(byte byteArgument1) {
        stringState0033 = null;
        if (byteArgument1 != -100) {
          stringState0034 = (String) null;
          sceneWidgetPart003State0001 = null;
          stringState0034 = null;
          return;
        }
        sceneWidgetPart003State0001 = null;
        stringState0034 = null;
    }

    final static void performAction0077(int integerArgument1, java.awt.Component componentArgument2) {
        try {
          if (integerArgument1 != -2204) {
            InputAdapter002.performAction0075((byte) 21);
          }
          componentArgument2.addMouseListener(MixedSupport063.mouseInputState0001);
          componentArgument2.addMouseMotionListener(MixedSupport063.mouseInputState0001);
          componentArgument2.addFocusListener(MixedSupport063.mouseInputState0001);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "al.D(" + integerArgument1 + ',' + (componentArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void performAction0018(boolean booleanArgument1, int integerArgument2, int integerArgument3, byte byteArgument4, UiComponent uiComponentArgument5) {
        RuntimeException runtimeExceptionLocal1 = null;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        double doubleLocal4 = 0.0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        UiComponentPart001 uiComponentPart001Local8 = null;
        UiComponent stackUiComponentLocal9 = null;
        RuntimeException stackRuntimeExceptionLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        double doubleLocal14;
        int integerLocal15;
        int integerLocal16;
        try {
          if (!(uiComponentArgument5 instanceof UiComponentPart001)) {
            stackUiComponentLocal9 = null;
          } else {
            stackUiComponentLocal9 = (UiComponent) (uiComponentArgument5);
          }
          uiComponentPart001Local8 = (UiComponentPart001) (stackUiComponentLocal9);
          if (uiComponentPart001Local8 == null) {
          }
          SoftwareRaster.performAction0719(integerArgument2 + uiComponentArgument5.integerState0110, integerArgument3 + uiComponentArgument5.integerState0104, uiComponentArgument5.integerState0107, uiComponentArgument5.integerState0108, this.integerState0042);
          integerLocal2 = integerArgument2 - (-uiComponentArgument5.integerState0110 - uiComponentPart001Local8.integerState0032);
          integerLocal3 = integerArgument3 + uiComponentArgument5.integerState0104 + uiComponentPart001Local8.integerState0037;
          SoftwareRaster.performAction0740(integerLocal2, integerLocal3, uiComponentPart001Local8.integerState0035, this.integerState0041);
          if (uiComponentPart001Local8.integerState0036 != -1) {
            doubleLocal4 = 3.141592653589793 * (double)uiComponentPart001Local8.integerState0036 * 2.0 / (double)uiComponentPart001Local8.integerState0038;
            integerLocal5 = (int)(-Math.sin(doubleLocal4) * (double)uiComponentPart001Local8.integerState0035);
            integerLocal6 = (int)(Math.cos(doubleLocal4) * (double)uiComponentPart001Local8.integerState0035);
            SoftwareRaster.performAction0740(integerLocal5 + integerLocal2, integerLocal3 + integerLocal6, 1, this.integerState0045);
          }
          SoftwareRaster.performAction0740(integerLocal2, integerLocal3, 2, 1);
          doubleLocal14 = 3.141592653589793 * (double)uiComponentPart001Local8.integerState0033 * 2.0 / (double)uiComponentPart001Local8.integerState0038;
          integerLocal15 = (int)(-Math.sin(doubleLocal14) * (double)uiComponentPart001Local8.integerState0035);
          integerLocal16 = (int)(Math.cos(doubleLocal14) * (double)uiComponentPart001Local8.integerState0035);
          SoftwareRaster.performAction0729(integerLocal2, integerLocal3, integerLocal15 + integerLocal2, integerLocal3 + integerLocal16, 1);
          if (this.bitmapFontState0004 != null) {
            integerLocal7 = this.integerState0046 + (uiComponentPart001Local8.integerState0035 + uiComponentPart001Local8.integerState0032);
            this.bitmapFontState0004.computeInteger1213(uiComponentArgument5.stringState0078, integerArgument2 - (-uiComponentArgument5.integerState0110 - integerLocal7), uiComponentArgument5.integerState0104 + (integerArgument3 + this.integerState0044), -this.integerState0046 - (integerLocal7 - uiComponentArgument5.integerState0107), uiComponentArgument5.integerState0108 - (this.integerState0046 << 1), this.integerState0043, this.integerState0040, 1, 1, 0);
          }
          if (byteArgument4 <= -60) {
            return;
          }
          stringState0034 = (String) null;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal17) {
          caughtExceptionLocal13 = caughtParameterLocal17;
          runtimeExceptionLocal1 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal10 = runtimeExceptionLocal1;
          stackStringBuilderLocal11 = new StringBuilder().append("al.B(").append(booleanArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(byteArgument4).append(',');
          if (uiComponentArgument5 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal10), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(')').toString());
        }
    }

    final static int computeInteger0076(int integerArgument1, int integerArgument2) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        MixedSupport021.asyncTaskState0001 = null;
        MixedSupport053.integerState0273 = integerArgument1;
        UiComponentPart028.bufferedSocketState0003 = null;
        int integerLocal2 = MixedSupport014.integerState0099;
        MixedSupport014.integerState0099 = MixedSupport050.integerState0265;
        if (51 == integerArgument2) {
          MixedSupport124.networkSupport003State0003.integerState0131 = 2;
          MixedSupport124.networkSupport003State0003.integerState0132 = MixedSupport124.networkSupport003State0003.integerState0132 + 1;
          MixedSupport050.integerState0265 = integerLocal2;
          if (MixedSupport124.networkSupport003State0003.integerState0132 < 2) {
            if (2 > MixedSupport124.networkSupport003State0003.integerState0132) {
              if (MixedSupport124.networkSupport003State0003.integerState0132 < 4) {
                return -1;
              }
              return 1;
            }
            if (integerArgument2 != 50) {
              if (MixedSupport124.networkSupport003State0003.integerState0132 >= 4) {
                return 1;
              }
              return -1;
            }
            return 5;
          }
          if (51 == integerArgument2) {
            return 2;
          }
          if (2 > MixedSupport124.networkSupport003State0003.integerState0132) {
            if (MixedSupport124.networkSupport003State0003.integerState0132 >= 4) {
              return 1;
            }
            return -1;
          }
          if (integerArgument2 == 50) {
            return 5;
          }
          if (MixedSupport124.networkSupport003State0003.integerState0132 >= 4) {
            return 1;
          }
          return -1;
        }
        if (integerArgument2 == 50) {
          MixedSupport124.networkSupport003State0003.integerState0131 = 5;
          MixedSupport124.networkSupport003State0003.integerState0132 = MixedSupport124.networkSupport003State0003.integerState0132 + 1;
          MixedSupport050.integerState0265 = integerLocal2;
          if (MixedSupport124.networkSupport003State0003.integerState0132 >= 2) {
            if (51 != integerArgument2) {
              if (2 <= MixedSupport124.networkSupport003State0003.integerState0132 &&
                integerArgument2 == 50) {
                return 5;
              }
              if (MixedSupport124.networkSupport003State0003.integerState0132 >= 4) {
                return 1;
              }
              return -1;
            }
            return 2;
          }
          if (2 <= MixedSupport124.networkSupport003State0003.integerState0132 &&
            integerArgument2 == 50) {
            return 5;
          }
          if (MixedSupport124.networkSupport003State0003.integerState0132 >= 4) {
            return 1;
          }
          return -1;
        }
        MixedSupport124.networkSupport003State0003.integerState0131 = 1;
        MixedSupport124.networkSupport003State0003.integerState0132 = MixedSupport124.networkSupport003State0003.integerState0132 + 1;
        MixedSupport050.integerState0265 = integerLocal2;
        if (MixedSupport124.networkSupport003State0003.integerState0132 >= 2) {
          if (51 != integerArgument2) {
            if (2 <= MixedSupport124.networkSupport003State0003.integerState0132 &&
              integerArgument2 == 50) {
              return 5;
            }
            if (MixedSupport124.networkSupport003State0003.integerState0132 >= 4) {
              return 1;
            }
            return -1;
          }
          return 2;
        }
        if (2 <= MixedSupport124.networkSupport003State0003.integerState0132 &&
          integerArgument2 == 50) {
          return 5;
        }
        if (MixedSupport124.networkSupport003State0003.integerState0132 >= 4) {
          return 1;
        }
        return -1;
    }

    InputAdapter002(BitmapFont bitmapFontArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8) {
        try {
          this.bitmapFontState0004 = bitmapFontArgument1;
          this.integerState0040 = integerArgument5;
          this.integerState0043 = integerArgument4;
          this.integerState0045 = integerArgument7;
          this.integerState0042 = integerArgument8;
          this.integerState0041 = integerArgument6;
          this.integerState0044 = integerArgument3;
          this.integerState0046 = integerArgument2;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "al.<init>(" + (bitmapFontArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ',' + integerArgument7 + ',' + integerArgument8 + ')');
        }
    }

    static {
        stringState0033 = "Friends";
        stringState0034 = "Updates will sent to the email address you've given";
    }
}
