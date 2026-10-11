/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport074 implements CallbackContract004 {
    private int integerState0392;
    private int integerState0393;
    private int integerState0394;
    static int integerState0395;
    static String stringState0314;
    static int integerState0396;
    private int integerState0397;
    static MixedSupport139 mixedSupport139State0004;
    private int integerState0398;
    private int integerState0399;
    private int integerState0400;
    private int integerState0401;
    static int integerState0402;
    private BitmapFont bitmapFontState0016;
    private int integerState0403;
    private int integerState0404;
    private int integerState0405;
    static String stringState0315;
    static byte[] byteArrayState0011;

    final static String computeString1032(boolean booleanArgument1, boolean booleanArgument2, boolean booleanArgument3, boolean booleanArgument4) {
        int integerLocal1 = 0;
        int integerLocal2;
        if (booleanArgument4) {
          integerLocal1 = 0;
          if (booleanArgument3) {
            integerLocal1 += 4;
          }
          if (booleanArgument1) {
            integerLocal1 += 2;
          }
          if (booleanArgument2) {
            integerLocal1++;
          }
          return BufferedSocket.stringArrayState0036[integerLocal1];
        }
        mixedSupport139State0004 = (MixedSupport139) null;
        integerLocal2 = 0;
        if (booleanArgument3) {
          integerLocal2 += 4;
        }
        if (booleanArgument1) {
          integerLocal2 += 2;
        }
        if (booleanArgument2) {
          integerLocal2++;
        }
        return BufferedSocket.stringArrayState0036[integerLocal2];
    }

    final static void performAction1031(int integerArgument1, int integerArgument2, NetworkSupport005 networkSupport005Argument3) {
        CipherPacketBuffer cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
        cipherPacketBufferLocal1.performAction1861(integerArgument1, -4);
        cipherPacketBufferLocal1.position = cipherPacketBufferLocal1.position + 1;
        int integerLocal2 = cipherPacketBufferLocal1.position;
        cipherPacketBufferLocal1.performAction2073(true, 1);
        cipherPacketBufferLocal1.performAction2073(true, networkSupport005Argument3.integerState0385);
        if (integerArgument2 != -15016) {
          return;
        }
        try {
          cipherPacketBufferLocal1.performAction2073(true, networkSupport005Argument3.integerState0383);
          cipherPacketBufferLocal1.performAction2067(networkSupport005Argument3.integerState0382, false);
          cipherPacketBufferLocal1.performAction2067(networkSupport005Argument3.integerState0386, false);
          cipherPacketBufferLocal1.performAction2067(networkSupport005Argument3.integerState0387, false);
          cipherPacketBufferLocal1.performAction2067(networkSupport005Argument3.integerState0384, false);
          cipherPacketBufferLocal1.computeInteger2061((byte) -15, integerLocal2);
          cipherPacketBufferLocal1.performAction2079(cipherPacketBufferLocal1.position - integerLocal2, true);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "kk.C(" + integerArgument1 + ',' + integerArgument2 + ',' + (networkSupport005Argument3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void performAction1030(byte byteArgument1) {
        if (byteArgument1 <= -54) {
          byteArrayState0011 = null;
          stringState0314 = null;
          stringState0315 = null;
          mixedSupport139State0004 = null;
          return;
        }
        stringState0315 = (String) null;
        byteArrayState0011 = null;
        stringState0314 = null;
        stringState0315 = null;
        mixedSupport139State0004 = null;
    }

    public final void performAction0018(boolean booleanArgument1, int integerArgument2, int integerArgument3, byte byteArgument4, UiComponent uiComponentArgument5) {
        UiComponent stackUiComponentLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        UiComponentPart009 uiComponentPart009Local11 = null;
        try {
          if (byteArgument4 > -60) {
            MixedSupport074.performAction1030((byte) -80);
          }
          if (!(uiComponentArgument5 instanceof UiComponentPart009)) {
            stackUiComponentLocal1 = null;
          } else {
            stackUiComponentLocal1 = (UiComponent) (uiComponentArgument5);
          }
          uiComponentPart009Local11 = (UiComponentPart009) (stackUiComponentLocal1);
          if (uiComponentPart009Local11 != null) {
            booleanArgument1 = booleanArgument1 & uiComponentPart009Local11.booleanState0035;
          }
          integerLocal7 = 5592405;
          SoftwareRaster.performAction0719(integerArgument2 + uiComponentArgument5.integerState0110, integerArgument3 + uiComponentArgument5.integerState0104, uiComponentArgument5.integerState0107, uiComponentArgument5.integerState0108, this.integerState0394);
          if (booleanArgument1) {
            integerLocal7 = 16777215;
          }
          integerLocal8 = integerArgument2 + uiComponentArgument5.integerState0110 + this.integerState0401;
          integerLocal9 = uiComponentArgument5.integerState0104 + integerArgument3 + this.integerState0393;
          SoftwareRaster.performAction0738(integerLocal8, integerLocal9, this.integerState0404, this.integerState0392, 5592405);
          SoftwareRaster.performAction0719(integerLocal8, integerLocal9, this.integerState0404, this.integerState0392, integerLocal7);
          if (uiComponentPart009Local11.booleanState0034) {
            SoftwareRaster.performAction0729(integerLocal8, integerLocal9, this.integerState0404 + integerLocal8, integerLocal9 + this.integerState0392, 1);
            SoftwareRaster.performAction0729(integerLocal8 + this.integerState0404, integerLocal9, integerLocal8, this.integerState0392 + integerLocal9, 1);
          }
          if (this.bitmapFontState0016 == null) {
            return;
          }
          integerLocal10 = this.integerState0404 + this.integerState0401 + this.integerState0400;
          this.bitmapFontState0016.computeInteger1213(uiComponentArgument5.stringState0078, integerArgument2 + uiComponentArgument5.integerState0110 + integerLocal10, this.integerState0399 + integerArgument3 + uiComponentArgument5.integerState0104, uiComponentArgument5.integerState0107 - (this.integerState0400 + integerLocal10), -(this.integerState0400 << 1) + uiComponentArgument5.integerState0108, this.integerState0397, this.integerState0405, this.integerState0403, this.integerState0398, 0);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal5 = caughtParameterLocal12;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("kk.B(").append(booleanArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(byteArgument4).append(',');
          if (uiComponentArgument5 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    MixedSupport074(BitmapFont bitmapFontArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10) {
        this.integerState0403 = 1;
        this.integerState0398 = 1;
        try {
          this.integerState0393 = integerArgument7;
          this.integerState0400 = integerArgument2;
          this.integerState0404 = integerArgument9;
          this.integerState0405 = integerArgument5;
          this.integerState0397 = integerArgument4;
          this.integerState0399 = integerArgument3;
          this.integerState0394 = integerArgument10;
          this.integerState0392 = integerArgument8;
          this.bitmapFontState0016 = bitmapFontArgument1;
          this.integerState0401 = integerArgument6;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "kk.<init>(" + (bitmapFontArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ',' + integerArgument7 + ',' + integerArgument8 + ',' + integerArgument9 + ',' + integerArgument10 + ')');
        }
    }

    static {
        stringState0314 = "Hide chat";
        stringState0315 = "<%0>: ";
        mixedSupport139State0004 = new MixedSupport139();
    }
}
