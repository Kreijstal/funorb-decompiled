/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiagnosticSupport002 extends RuntimeException {
    Throwable throwableState0001;
    static MixedSupport138[] mixedSupport138ArrayState0001;
    static ValidationStatus validationStatusState0002;
    static int integerState0339;
    static SceneWidget sceneWidgetState0057;
    String stringState0270;
    static String stringState0271;
    static boolean booleanState0082;
    static byte[] byteArrayState0008;
    static int integerState0340;

    final static void performAction0764(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, String stringArgument8, int integerArgument9) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        try {
          MixedSupport066.sceneWidgetState0068.stringState0598 = stringArgument8;
          if (2 == TextHotspotBounds.integerState0585) {
            RenderingSupport001.sceneWidgetState0004.stringState0598 = ResourceSupport003.stringState0382;
          } else {
            RenderingSupport001.sceneWidgetState0004.stringState0598 = SceneWidgetNode.stringState0318;
          }
          integerLocal1 = 495;
          int integerLocal5 = -66 % ((14 - integerArgument3) / 34);
          integerLocal2 = 5;
          MouseWheelInput.sceneWidgetState0050.performAction1764(integerLocal1 - 10, 0, integerLocal2, integerArgument7, 5);
          AccountCreationResultPanel.sceneWidgetState0150.performAction1764(MouseWheelInput.sceneWidgetState0050.integerState0896 - sceneWidgetState0057.integerState0896, 0, 0, integerArgument7, 0);
          integerLocal2 = integerLocal2 + (integerArgument7 + integerArgument9);
          sceneWidgetState0057.performAction1764(sceneWidgetState0057.integerState0896, 0, 0, integerArgument7, AccountCreationResultPanel.sceneWidgetState0150.integerState0896);
          LobbyRoomRow.sceneWidgetState0139.performAction1764(LobbyRoomRow.sceneWidgetState0139.computeInteger1770(true), 0, integerLocal2, integerArgument6, 5);
          integerLocal3 = RenderingSupport001.sceneWidgetState0004.computeInteger1770(true);
          RenderingSupport001.sceneWidgetState0004.performAction1764(integerLocal3, 0, integerLocal2, integerArgument6, -5 + (integerLocal1 - integerLocal3));
          MixedSupport066.sceneWidgetState0068.performAction1764(integerLocal1, 0, 0, integerArgument1, 0);
          integerLocal4 = 5 + (integerArgument6 + integerLocal2);
          FullscreenStatusDialog.sceneWidgetState0052.performAction1764(integerLocal1, 0, integerArgument1, integerLocal4, 0);
          FullscreenStatusDialog.sceneWidgetState0052.rgbSpriteArrayState0033 = RichTextLayout.computeRgbSpriteArray0390(2105376, -20982, 3, FullscreenStatusDialog.sceneWidgetState0052.integerState0915, 8421504, 11579568);
          integerLocal4 = integerLocal4 + integerArgument1;
          AccountRegistrationPanel.sceneWidgetState0116.performAction1764(integerLocal1, 0, -(integerLocal4 / 2) + integerArgument2, integerLocal4, -(integerLocal1 / 2) + integerArgument5);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "jb.B(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ',' + integerArgument7 + ',' + (stringArgument8 != null ? "{...}" : "null") + ',' + integerArgument9 + ')');
        }
    }

    final static void performAction0766(String stringArgument1, byte byteArgument2) {
        try {
          if (byteArgument2 != 45) {
            DiagnosticSupport002.resetStaticState((byte) 96);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "jb.F(" + (stringArgument1 != null ? "{...}" : "null") + ',' + byteArgument2 + ')');
        }
    }

    final static void performAction0763(byte byteArgument1, String stringArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        try {
          LobbyRoomRow.booleanState0202 = true;
          MixedSupport033.sceneWidgetState0024.stringState0598 = stringArgument2;
          integerLocal1 = MixedSupport076.framebufferState0001.integerState0190;
          int integerLocal5 = 66 / ((byteArgument1 - 29) / 46);
          integerLocal2 = MixedSupport076.framebufferState0001.integerState0191;
          integerLocal3 = MixedSupport033.sceneWidgetState0024.bitmapFontState0020.textHeight(stringArgument2, 272, MixedSupport033.sceneWidgetState0024.integerState0908);
          integerLocal4 = 7 + integerLocal2 / 2 + (-110 - integerLocal3 / 2);
          SceneWidgetPart011.sceneWidgetState0115.performAction1764(320, 0, integerLocal4, -(integerLocal4 * 2) - 120 + integerLocal2, (integerLocal1 - 320) / 2);
          SceneWidgetPart011.sceneWidgetState0115.rgbSpriteArrayState0033 = RichTextLayout.computeRgbSpriteArray0390(2105376, -20982, 3, SceneWidgetPart011.sceneWidgetState0115.integerState0915, 8421504, 11579568);
          MixedSupport033.sceneWidgetState0024.performAction1764(SceneWidgetPart011.sceneWidgetState0115.integerState0896 - 24 - 24, 0, 16, SceneWidgetPart011.sceneWidgetState0115.integerState0915 - 20 - 24, 24);
          UiComponent.sceneWidgetState0009.performAction1764(80, 0, -44 + SceneWidgetPart011.sceneWidgetState0115.integerState0915, 24, 120);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "jb.C(" + byteArgument1 + ',' + (stringArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    final static char decodeCp1252Byte(byte byteArgument1, byte byteArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = byteArgument1 & 255;
        int integerLocal3;
        if (0 == integerLocal2) {
          throw new IllegalArgumentException("" + Integer.toString(integerLocal2, 16));
        }
        if (integerLocal2 >= 128 &&
          160 > integerLocal2) {
          integerLocal1 = BufferedFile.characterArrayState0006[integerLocal2 - 128];
          if (integerLocal1 == 0) {
            integerLocal1 = 63;
          }
          integerLocal2 = integerLocal1;
        }
        integerLocal3 = -109 / ((byteArgument2 - 41) / 35);
        return (char)integerLocal2;
    }

    final static MixedSupport061 computeMixedSupport0610765(java.applet.Applet appletArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        String stringLocal2 = null;
        RuntimeException runtimeExceptionLocal3 = null;
        MixedSupport061[] mixedSupport061ArrayLocal4 = null;
        MixedSupport061 mixedSupport061Local5 = null;
        int integerLocal6 = 0;
        MixedSupport061 stackMixedSupport061Local7 = null;
        MixedSupport061 stackMixedSupport061Local8 = null;
        MixedSupport061 stackMixedSupport061Local9 = null;
        RuntimeException stackRuntimeExceptionLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          stringLocal2 = MixedSupport145.computeString1791(appletArgument1, (byte) -1, "jagex-last-login-method");
          if (stringLocal2 == null) {
            stackMixedSupport061Local7 = GameApplet.mixedSupport061State0003;
            return stackMixedSupport061Local7;
          }
          mixedSupport061ArrayLocal4 = MixedSupport091.computeMixedSupport061Array1147((byte) 27);
          if (integerArgument2 != -10314) {
            integerState0339 = -54;
          }
          for (integerLocal1 = 0; integerLocal1 < mixedSupport061ArrayLocal4.length; integerLocal1++) {
            mixedSupport061Local5 = mixedSupport061ArrayLocal4[integerLocal1];
            if (mixedSupport061Local5.computeBoolean0731(stringLocal2, -39)) {
              stackMixedSupport061Local8 = mixedSupport061Local5;
              return stackMixedSupport061Local8;
            }
          }
          stackMixedSupport061Local9 = GameApplet.mixedSupport061State0003;
          return stackMixedSupport061Local9;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal13 = caughtParameterLocal14;
          runtimeExceptionLocal3 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal10 = runtimeExceptionLocal3;
          stackStringBuilderLocal11 = new StringBuilder().append("jb.G(");
          if (appletArgument1 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal10), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(',').append(integerArgument2).append(')').toString());
        }
    }

    public static void resetStaticState(byte byteArgument1) {
        stringState0271 = null;
        mixedSupport138ArrayState0001 = null;
        validationStatusState0002 = null;
        if (byteArgument1 != -9) {
          booleanState0082 = false;
        }
        sceneWidgetState0057 = null;
        byteArrayState0008 = null;
    }

    final static void performAction0767(SceneWidget sceneWidgetArgument1, SceneWidget sceneWidgetArgument2, SceneWidget sceneWidgetArgument3, int integerArgument4, SceneWidget sceneWidgetArgument5) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        String stringLocal11 = null;
        RuntimeException runtimeExceptionLocal12 = null;
        int integerLocal13 = 0;
        String stringLocal14 = null;
        integerLocal13 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (null != ComponentContainer.sceneWidgetState0069) {
            return;
          }
          LoginCredentials.booleanState0085 = false;
          if (MixedSupport144.booleanState0221) {
            stringLocal11 = MixedSupport138.stringState0591;
          } else {
            if (PacketBuffer.booleanState0228) {
              stringLocal11 = FullscreenNoticeType.stringState0338;
            } else {
              stringLocal11 = NameSuggestionsPanel.stringState0114;
            }
          }
          stringLocal14 = (String) null;
          MixedSupport020.performAction0298((String) null, 0, MixedSupport061.integerState0332, stringLocal11, -24503);
          AccountCreationResultPanel.sceneWidgetState0150.integerState0906 = ((MixedSupport040.sceneWidgetState0032.integerState0906 & 16711422) >> 1) - (8355711 & MixedSupport061.integerState0332 >> 1) + MixedSupport061.integerState0332;
          AccountCreationResultPanel.sceneWidgetState0150.integerState0899 = MixedSupport061.integerState0332 + (-(8355711 & MixedSupport061.integerState0332 >> 1) + ((16711423 & MixedSupport040.sceneWidgetState0032.integerState0899) >> 1));
          ComponentContainer.sceneWidgetState0069 = AccountCreationResultPanel.sceneWidgetState0150;
          AccountCreationResultPanel.sceneWidgetState0150.integerState0889 = MixedSupport061.integerState0332 - (((MixedSupport061.integerState0332 & 16711423) >> 1) - (8355711 & MixedSupport040.sceneWidgetState0032.integerState0889 >> 1));
          MixedSupport065.sceneWidgetState0067 = sceneWidgetState0057;
          AccountRegistrationPanel.sceneWidgetState0116 = new SceneWidget(0L, sceneWidgetArgument5);
          MixedSupport066.sceneWidgetState0068 = new SceneWidget(0L, sceneWidgetArgument1);
          FullscreenStatusDialog.sceneWidgetState0052 = new SceneWidget(0L, (SceneWidget) null);
          MouseWheelInput.sceneWidgetState0050 = new SceneWidget(0L, sceneWidgetArgument3);
          AccountCreationResultPanel.sceneWidgetState0150 = new SceneWidget(0L, sceneWidgetArgument2);
          AccountCreationResultPanel.sceneWidgetState0150.bitmapFontState0020 = MixedSupport038.bitmapFontState0013;
          MouseWheelInput.sceneWidgetState0050.performAction1768(AccountCreationResultPanel.sceneWidgetState0150, -16834);
          sceneWidgetState0057 = new SceneWidget(0L, MixedSupport065.sceneWidgetState0067);
          MouseWheelInput.sceneWidgetState0050.performAction1768(sceneWidgetState0057, -16834);
          LobbyRoomRow.sceneWidgetState0139 = new SceneWidget(0L, MixedSupport040.sceneWidgetState0032, MixedSupport100.stringState0420);
          RenderingSupport001.sceneWidgetState0004 = new SceneWidget(0L, MixedSupport040.sceneWidgetState0032);
          AccountRegistrationPanel.sceneWidgetState0116.performAction1768(MixedSupport066.sceneWidgetState0068, -16834);
          if (integerArgument4 >= -32) {
            validationStatusState0002 = (ValidationStatus) null;
          }
          AccountRegistrationPanel.sceneWidgetState0116.performAction1768(FullscreenStatusDialog.sceneWidgetState0052, -16834);
          FullscreenStatusDialog.sceneWidgetState0052.performAction1768(MouseWheelInput.sceneWidgetState0050, -16834);
          FullscreenStatusDialog.sceneWidgetState0052.performAction1768(LobbyRoomRow.sceneWidgetState0139, -16834);
          FullscreenStatusDialog.sceneWidgetState0052.performAction1768(RenderingSupport001.sceneWidgetState0004, -16834);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal10 = caughtParameterLocal15;
          runtimeExceptionLocal12 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal12;
          stackStringBuilderLocal2 = new StringBuilder().append("jb.E(");
          if (sceneWidgetArgument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',');
          if (sceneWidgetArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (sceneWidgetArgument3 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument4).append(',');
          if (sceneWidgetArgument5 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(')').toString());
        }
    }

    DiagnosticSupport002(Throwable throwableArgument1, String stringArgument2) {
        this.throwableState0001 = throwableArgument1;
        this.stringState0270 = stringArgument2;
    }

    static {
        integerState0339 = 500;
        validationStatusState0002 = new ValidationStatus();
        stringState0271 = "Previous";
        byteArrayState0008 = new byte[520];
    }
}
