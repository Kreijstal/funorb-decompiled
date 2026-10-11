/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport110 implements CallbackContract004 {
    private int integerState0655;
    private int integerState0656;
    static String stringState0452;
    static boolean booleanState0153;
    private int integerState0657;
    static String stringState0453;
    private int integerState0658;
    private int integerState0659;
    private BitmapFont bitmapFontState0018;
    static RgbSprite rgbSpriteState0046;
    private int integerState0660;

    final static void performAction1550(byte byteArgument1) {
        try {
          Exception exceptionLocal1 = null;
          Throwable caughtExceptionLocal2 = null;
          if (null != UiComponentPart008.mixedSupport091State0001) {
            try {
              UiComponentPart008.mixedSupport091State0001.performAction1268(0L, (byte) -109);
              UiComponentPart008.mixedSupport091State0001.performAction1270(UiComponentPart006.cipherPacketBufferState0001.payload, (byte) 117, UiComponentPart006.cipherPacketBufferState0001.position, 24);
            } catch (java.lang.Exception caughtParameterLocal3) {
              caughtExceptionLocal2 = caughtParameterLocal3;
              exceptionLocal1 = (Exception) (Object) caughtExceptionLocal2;
            }
          }
          if (byteArgument1 != 64) {
            return;
          }
          UiComponentPart006.cipherPacketBufferState0001.position = UiComponentPart006.cipherPacketBufferState0001.position + 24;
        } catch (RuntimeException | Error uncheckedExceptionLocal4) {
          throw uncheckedExceptionLocal4;
        } catch (Throwable checkedExceptionLocal5) {
          throw new RuntimeException(checkedExceptionLocal5);
        }
    }

    final static RenderingSupport008 computeRenderingSupport0081551(int integerArgument1, boolean booleanArgument2) {
        GameDomainSupport002 gameDomainSupport002Local1 = null;
        GameDomainSupport002 gameDomainSupport002Local2 = null;
        GameDomainSupport002 gameDomainSupport002Local3 = null;
        GameDomainSupport002 gameDomainSupport002Local4 = null;
        GameDomainSupport002 gameDomainSupport002Local5 = null;
        RenderingSupport008 renderingSupport008Local6 = new RenderingSupport008(4);
        RenderingSupport008 renderingSupport008Local7 = renderingSupport008Local6;
        if (UiComponentPart023.computeBoolean1421(-30146)) {
          gameDomainSupport002Local5 = new GameDomainSupport002(20, UiComponentPart026.stringState0461, MixedSupport001.renderingSupport010State0001);
          gameDomainSupport002Local5.integerState0174 = 320 - gameDomainSupport002Local5.integerState0176 / 2;
          gameDomainSupport002Local5.integerState0178 = 372;
          renderingSupport008Local7.performAction0969(gameDomainSupport002Local5, 122);
        } else {
          renderingSupport008Local6.performAction0969(new GameDomainSupport002(22, MixedSupport120.stringArrayState0041[0], MixedSupport001.renderingSupport010State0001), 127);
          renderingSupport008Local6.performAction0969(new GameDomainSupport002(22, MixedSupport120.stringArrayState0041[1], MixedSupport001.renderingSupport010State0001), 120);
          renderingSupport008Local6.performAction0969(new GameDomainSupport002(22, MixedSupport120.stringArrayState0041[2], MixedSupport001.renderingSupport010State0001), 117);
          gameDomainSupport002Local1 = renderingSupport008Local6.gameDomainSupport002ArrayState0001[0];
          GameDomainSupport002 gameDomainSupport002Local8 = gameDomainSupport002Local1;
          gameDomainSupport002Local2 = renderingSupport008Local6.gameDomainSupport002ArrayState0001[1];
          renderingSupport008Local6.gameDomainSupport002ArrayState0001[2].integerState0176 = 185;
          gameDomainSupport002Local2.integerState0176 = 185;
          gameDomainSupport002Local1.integerState0176 = 185;
          renderingSupport008Local6.gameDomainSupport002ArrayState0001[0].integerState0174 = 120 - renderingSupport008Local6.gameDomainSupport002ArrayState0001[0].integerState0176 / 2;
          renderingSupport008Local6.gameDomainSupport002ArrayState0001[1].integerState0174 = -(renderingSupport008Local6.gameDomainSupport002ArrayState0001[1].integerState0176 / 2) + 320;
          renderingSupport008Local6.gameDomainSupport002ArrayState0001[2].integerState0174 = -(renderingSupport008Local6.gameDomainSupport002ArrayState0001[2].integerState0176 / 2) + 520;
          gameDomainSupport002Local3 = renderingSupport008Local6.gameDomainSupport002ArrayState0001[0];
          gameDomainSupport002Local4 = renderingSupport008Local6.gameDomainSupport002ArrayState0001[1];
          renderingSupport008Local6.gameDomainSupport002ArrayState0001[2].integerState0178 = 372;
          gameDomainSupport002Local4.integerState0178 = 372;
          gameDomainSupport002Local3.integerState0178 = 372;
        }
        GameDomainSupport002 gameDomainSupport002Local9 = new GameDomainSupport002(13, MixedSupport101.stringState0411, MixedSupport001.renderingSupport010State0001);
        gameDomainSupport002Local9.integerState0174 = -(gameDomainSupport002Local9.integerState0176 / 2) + 320;
        gameDomainSupport002Local9.integerState0178 = 415;
        renderingSupport008Local7.performAction0969(gameDomainSupport002Local9, 115);
        renderingSupport008Local7.integerState0372 = 272;
        renderingSupport008Local7.integerState0368 = 500;
        renderingSupport008Local7.integerState0374 = 70;
        renderingSupport008Local7.integerState0375 = 76;
        renderingSupport008Local7.performAction0968(MixedSupport036.integerState0222, booleanArgument2, -129);
        if (integerArgument1 <= -3) {
          return renderingSupport008Local7;
        }
        stringState0453 = (String) null;
        return renderingSupport008Local7;
    }

    public final void performAction0018(boolean booleanArgument1, int integerArgument2, int integerArgument3, byte byteArgument4, UiComponent uiComponentArgument5) {
        int integerLocal1 = 0;
        UiComponent stackUiComponentLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        UiComponentPart002 uiComponentPart002Local12 = null;
        integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (uiComponentArgument5 instanceof UiComponentPart002) {
            stackUiComponentLocal2 = (UiComponent) (uiComponentArgument5);
          } else {
            stackUiComponentLocal2 = null;
          }
          uiComponentPart002Local12 = (UiComponentPart002) (stackUiComponentLocal2);
          SoftwareRaster.performAction0719(uiComponentArgument5.integerState0110 + integerArgument2, integerArgument3 + uiComponentArgument5.integerState0104, uiComponentArgument5.integerState0107, uiComponentArgument5.integerState0108, this.integerState0660);
          if (uiComponentPart002Local12 != null) {
          }
          integerLocal8 = -(2 * uiComponentPart002Local12.integerState0049) + uiComponentArgument5.integerState0107;
          integerLocal9 = uiComponentPart002Local12.integerState0049 + uiComponentArgument5.integerState0110 + integerArgument2;
          integerLocal10 = uiComponentArgument5.integerState0104 + integerArgument3 + uiComponentPart002Local12.integerState0048;
          SoftwareRaster.performAction0729(integerLocal9, integerLocal10, integerLocal8 + integerLocal9, integerLocal10, this.integerState0659);
          if (byteArgument4 > -60) {
            return;
          }
          for (integerLocal1 = -1 + uiComponentPart002Local12.computeInteger0090(true); integerLocal1 >= 0; integerLocal1--) {
            SoftwareRaster.performAction0740(uiComponentPart002Local12.computeInteger0089(-1, integerLocal1) * integerLocal8 / uiComponentPart002Local12.computeInteger0092(-15317) + integerLocal9, integerLocal10, this.integerState0658, this.integerState0655);
          }
          if (null == this.bitmapFontState0018) {
            return;
          }
          this.bitmapFontState0018.performAction1224(uiComponentPart002Local12.stringState0078, integerLocal9 + integerLocal8 / 2, uiComponentPart002Local12.integerState0048 + this.bitmapFontState0018.integerState0516 + integerLocal10, this.integerState0657, this.integerState0656);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal6 = caughtParameterLocal13;
          runtimeExceptionLocal7 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal7;
          stackStringBuilderLocal4 = new StringBuilder().append("qj.B(").append(booleanArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(byteArgument4).append(',');
          if (uiComponentArgument5 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    public static void performAction1553(byte byteArgument1) {
        rgbSpriteState0046 = null;
        stringState0452 = null;
        if (byteArgument1 <= 118) {
          return;
        }
        stringState0453 = null;
    }

    final static String computeString1552(byte[] byteArrayArgument1, int integerArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        String stackStringLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (integerArgument2 != 2) {
            booleanState0153 = false;
          }
          stackStringLocal2 = MixedSupport140.computeString1906(byteArrayArgument1, 0, 0, byteArrayArgument1.length);
          return stackStringLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("qj.E(");
          if (byteArrayArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(')').toString());
        }
    }

    MixedSupport110(BitmapFont bitmapFontArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
        try {
          this.integerState0657 = integerArgument2;
          this.integerState0658 = integerArgument6;
          this.integerState0655 = integerArgument7;
          this.integerState0656 = integerArgument3;
          this.integerState0660 = integerArgument5;
          this.bitmapFontState0018 = bitmapFontArgument1;
          this.integerState0659 = integerArgument4;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "qj.<init>(" + (bitmapFontArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ',' + integerArgument7 + ')');
        }
    }

    static {
        stringState0452 = "On";
        stringState0453 = "Location";
    }
}
