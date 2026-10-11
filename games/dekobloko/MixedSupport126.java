/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport126 extends MixedSupport155 {
    private UiComponentPart028 uiComponentPart028State0007;
    private UiComponentPart028 uiComponentPart028State0008;
    static String stringState0526;
    static int integerState0774;
    static volatile int integerState0775;
    static int integerState0776;
    static boolean[] booleanArrayState0010;
    static String stringState0527;

    final String computeString0816(String stringArgument1, byte byteArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        String stringLocal2 = null;
        String stringLocal3 = null;
        String stringLocal4 = null;
        String stringLocal5 = null;
        Object stackObjectLocal6 = null;
        String stackStringLocal7 = null;
        String stackStringLocal8 = null;
        String stackStringLocal9 = null;
        String stackStringLocal10 = null;
        String stackStringLocal11 = null;
        String stackStringLocal12 = null;
        String stackStringLocal13 = null;
        String stackStringLocal14 = null;
        String stackStringLocal15 = null;
        RuntimeException stackRuntimeExceptionLocal16 = null;
        StringBuilder stackStringBuilderLocal17 = null;
        String stackStringLocal18 = null;
        RuntimeException caughtExceptionLocal19 = null;
        try {
          stringLocal5 = this.uiComponentPart028State0007.stringState0078.toLowerCase();
          stringLocal2 = stringArgument1.toLowerCase();
          if (stringLocal2.length() == 0) {
            stackObjectLocal6 = null;
            return (String) (stackObjectLocal6);
          }
          stringLocal3 = stringLocal2;
          if (DekoBlokoClient.computeBoolean0325(byteArgument2 + 111, stringLocal3)) {
            stackStringLocal7 = MixedSupport103.stringState0415;
            return stackStringLocal7;
          }
          if (InputAdapter005.computeBoolean1531(stringLocal3, 0)) {
            stackStringLocal8 = AnimatedTileRegion.stringState0566;
            return stackStringLocal8;
          }
          if (MixedSupport085.computeBoolean1157(stringLocal3, (byte) -121)) {
            stackStringLocal9 = CodecSupport001.stringState0328;
            return stackStringLocal9;
          }
          if (this.computeBoolean1795(stringArgument1, (byte) 14)) {
            stackStringLocal10 = MixedSupport010.stringState0049;
            return stackStringLocal10;
          }
          if (byteArgument2 != -11) {
            stringLocal4 = (String) null;
            this.computeString0816((String) null, (byte) -103);
          }
          if (stringLocal5.length() <= 0) {
            stackStringLocal15 = MixedSupport027.stringState0130;
            return stackStringLocal15;
          }
          if (MixedSupport092.computeBoolean1302(false, stringLocal5, stringLocal3)) {
            stackStringLocal11 = MixedSupport112.stringState0463;
            return stackStringLocal11;
          }
          if (MixedSupport062.computeBoolean0825(stringLocal3, stringLocal5, (byte) -126)) {
            stackStringLocal12 = MixedSupport090.stringState0364;
            return stackStringLocal12;
          }
          if (!UiComponentPart013.computeBoolean0691(stringLocal5, (byte) -11, stringLocal3)) {
            stackStringLocal14 = MixedSupport103.stringState0415;
            return stackStringLocal14;
          }
          stackStringLocal13 = MixedSupport112.stringState0463;
          return stackStringLocal13;
        } catch (java.lang.RuntimeException caughtParameterLocal20) {
          caughtExceptionLocal19 = caughtParameterLocal20;
          runtimeExceptionLocal1 = caughtExceptionLocal19;
          stackRuntimeExceptionLocal16 = runtimeExceptionLocal1;
          stackStringBuilderLocal17 = new StringBuilder().append("te.A(");
          if (stringArgument1 == null) {
            stackStringLocal18 = "null";
          } else {
            stackStringLocal18 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal16), ((StringBuilder) (Object) stackStringBuilderLocal17).append(stackStringLocal18).append(',').append(byteArgument2).append(')').toString());
        }
    }

    MixedSupport126(UiComponentPart028 uiComponentPart028Argument1, UiComponentPart028 uiComponentPart028Argument2, UiComponentPart028 uiComponentPart028Argument3) {
        super(uiComponentPart028Argument1);
        try {
          this.uiComponentPart028State0008 = uiComponentPart028Argument3;
          this.uiComponentPart028State0007 = uiComponentPart028Argument2;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "te.<init>(" + (uiComponentPart028Argument1 != null ? "{...}" : "null") + ',' + (uiComponentPart028Argument2 != null ? "{...}" : "null") + ',' + (uiComponentPart028Argument3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void performAction1796(int integerArgument1) {
        stringState0527 = null;
        if (integerArgument1 != 0) {
          BitmapFont bitmapFontLocal1 = (BitmapFont) null;
          MixedSupport126.computeInteger1794((String) null, 15, -79, (String[]) null, (BitmapFont) null);
        }
        booleanArrayState0010 = null;
        stringState0526 = null;
    }

    private final boolean computeBoolean1795(String stringArgument1, byte byteArgument2) {
        String stringLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        String stringLocal3 = null;
        int integerLocal4 = 0;
        String stringLocal5 = null;
        String stringLocal6 = null;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        try {
          if (byteArgument2 != 14) {
            MixedSupport126.performAction1796(-108);
          }
          stringLocal1 = this.uiComponentPart028State0008.stringState0078.toLowerCase();
          stringLocal3 = stringArgument1.toLowerCase();
          if (0 < stringLocal1.length() &&
            stringLocal3.length() > 0) {
            integerLocal4 = stringLocal1.lastIndexOf("@");
            if (integerLocal4 >= 0 &&
              integerLocal4 < -1 + stringLocal1.length()) {
              stringLocal5 = stringLocal1.substring(0, integerLocal4);
              stringLocal6 = stringLocal1.substring(integerLocal4 + 1);
              if (stringLocal3.indexOf(stringLocal5) >= 0) {
                return true;
              }
              if (stringLocal3.indexOf(stringLocal6) >= 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal2 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal2;
          stackStringBuilderLocal8 = new StringBuilder().append("te.C(");
          if (stringArgument1 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final static int computeInteger1794(String stringArgument1, int integerArgument2, int integerArgument3, String[] stringArrayArgument4, BitmapFont bitmapFontArgument5) {
        int integerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        StringBuilder stackStringBuilderLocal12 = null;
        String stackStringLocal13 = null;
        RuntimeException caughtExceptionLocal14 = null;
        int integerLocal15 = 0;
        RuntimeException runtimeExceptionLocal16 = null;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        int integerLocal20 = 0;
        String stringLocal21 = null;
        int integerLocal22 = 0;
        int integerLocal23 = 0;
        int integerLocal24;
        integerLocal23 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal15 = bitmapFontArgument5.computeInteger1208(stringArgument1);
          if (integerLocal15 <= integerArgument3 &&
            stringArgument1.indexOf("<br>") == -1) {
            stringArrayArgument4[0] = stringArgument1;
            stackIntegerLocal5 = 1;
            return stackIntegerLocal5;
          }
          integerLocal17 = (integerArgument3 + integerLocal15 - 1) / integerArgument3;
          integerArgument3 = integerLocal15 / integerLocal17;
          integerLocal24 = 0;
          integerLocal18 = 0;
          integerLocal19 = stringArgument1.length();
          for (integerLocal1 = 0; integerLocal1 < integerLocal19; integerLocal1++) {
            integerLocal20 = stringArgument1.charAt(integerLocal1);
            if (32 == integerLocal20 ||
              45 == integerLocal20) {
              stringLocal21 = stringArgument1.substring(integerLocal18, integerLocal1 + 1).trim();
              integerLocal22 = bitmapFontArgument5.computeInteger1208(stringLocal21);
              if (integerArgument3 <= integerLocal22) {
                integerLocal18 = integerLocal1 + 1;
                previousIntegerLocal2 = integerLocal24;
                integerLocal24++;
                stringArrayArgument4[previousIntegerLocal2] = stringLocal21;
              }
            }
            if (62 == integerLocal20 &&
              stringArgument1.regionMatches(integerLocal1 - 3, "<br>", 0, 4)) {
              previousIntegerLocal3 = integerLocal24;
              integerLocal24++;
              stringArrayArgument4[previousIntegerLocal3] = stringArgument1.substring(integerLocal18, -3 + integerLocal1).trim();
              integerLocal18 = integerLocal1 + 1;
            }
          }
          if (integerLocal18 < integerLocal19) {
            previousIntegerLocal4 = integerLocal24;
            integerLocal24++;
            stringArrayArgument4[previousIntegerLocal4] = stringArgument1.substring(integerLocal18, integerLocal19).trim();
          }
          if (integerArgument2 <= 65) {
            stringState0526 = (String) null;
          }
          stackIntegerLocal6 = integerLocal24;
          return stackIntegerLocal6;
        } catch (java.lang.RuntimeException caughtParameterLocal25) {
          caughtExceptionLocal14 = caughtParameterLocal25;
          runtimeExceptionLocal16 = caughtExceptionLocal14;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal16;
          stackStringBuilderLocal8 = new StringBuilder().append("te.E(");
          if (stringArgument1 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (stringArrayArgument4 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          stackStringBuilderLocal12 = ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',');
          if (bitmapFontArgument5 == null) {
            stackStringLocal13 = "null";
          } else {
            stackStringLocal13 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal12).append(stackStringLocal13).append(')').toString());
        }
    }

    final RenderingSupport015 computeRenderingSupport0150817(String stringArgument1, byte byteArgument2) {
        String stringLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        String stringLocal3 = null;
        RenderingSupport015 stackRenderingSupport015Local4 = null;
        RenderingSupport015 stackRenderingSupport015Local5 = null;
        RenderingSupport015 stackRenderingSupport015Local6 = null;
        RenderingSupport015 stackRenderingSupport015Local7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        try {
          stringLocal1 = this.uiComponentPart028State0007.stringState0078.toLowerCase();
          stringLocal3 = stringArgument1.toLowerCase();
          if (0 == stringLocal3.length()) {
            stackRenderingSupport015Local4 = MixedSupport149.renderingSupport015State0005;
            return stackRenderingSupport015Local4;
          }
          if (!MixedSupport047.computeBoolean0637(-118, stringLocal1, stringLocal3)) {
            stackRenderingSupport015Local5 = MixedSupport149.renderingSupport015State0005;
            return stackRenderingSupport015Local5;
          }
          if (byteArgument2 != -40) {
            integerState0774 = -71;
          }
          if (!this.computeBoolean1795(stringArgument1, (byte) 14)) {
            stackRenderingSupport015Local7 = MixedSupport023.renderingSupport015State0001;
            return stackRenderingSupport015Local7;
          }
          stackRenderingSupport015Local6 = MixedSupport149.renderingSupport015State0005;
          return stackRenderingSupport015Local6;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeExceptionLocal2 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal2;
          stackStringBuilderLocal9 = new StringBuilder().append("te.B(");
          if (stringArgument1 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(byteArgument2).append(')').toString());
        }
    }

    static {
        stringState0526 = null;
        integerState0775 = -1;
        booleanArrayState0010 = new boolean[64];
    }
}
