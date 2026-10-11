/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart006 extends ComponentDecorator {
    static int integerState0133;
    static UiComponentPart023 uiComponentPart023State0001;
    private BitmapFont bitmapFontState0009;
    private int integerState0134;
    static MixedSupport111 mixedSupport111State0001;
    static String stringState0108;
    private boolean booleanState0026;
    static String stringState0109;
    private int integerState0135;
    private int integerState0136;
    static int integerState0137;
    static CipherPacketBuffer cipherPacketBufferState0001;
    static boolean booleanState0027;
    private String stringState0110;

    UiComponentPart006(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, UiComponent uiComponentArgument5, boolean booleanArgument6, int integerArgument7, int integerArgument8, BitmapFont bitmapFontArgument9, int integerArgument10, String stringArgument11) {
        super(integerArgument1, integerArgument2, integerArgument3, integerArgument4, (CallbackContract004) null, (CallbackContract006) null);
        boolean stackBooleanLocal1 = false;
        int stackIntegerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        int integerLocal11 = 0;
        RuntimeException runtimeExceptionLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        try {
          stackBooleanLocal1 = (booleanArgument6);
          this.booleanState0026 = stackBooleanLocal1;
          this.integerState0135 = integerArgument10;
          this.uiComponentState0002 = uiComponentArgument5;
          this.integerState0134 = integerArgument8;
          this.bitmapFontState0009 = bitmapFontArgument9;
          this.stringState0110 = stringArgument11;
          this.integerState0136 = integerArgument7;
          integerLocal11 = -this.integerState0134 + this.integerState0136;
          integerLocal13 = this.bitmapFontState0009.computeInteger1223(stringArgument11, integerLocal11, this.bitmapFontState0009.integerState0518) + this.integerState0134 * 2;
          if (integerLocal13 > integerArgument4) {
            this.performAction0241(integerLocal13, integerArgument3, integerArgument1, integerArgument2, -16555);
          } else {
            integerLocal13 = integerArgument4;
          }
          if (!this.booleanState0026) {
            stackIntegerLocal2 = this.integerState0136 + this.integerState0134 * 2;
          } else {
            stackIntegerLocal2 = 0;
          }
          integerLocal14 = stackIntegerLocal2;
          this.uiComponentState0002.performAction0241(-(this.integerState0134 * 2) + integerArgument4, integerArgument3 - this.integerState0136 - 3 * this.integerState0134, integerLocal14, this.integerState0134 + (integerLocal13 - integerArgument4 >> 1), -16555);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal10 = caughtParameterLocal15;
          runtimeExceptionLocal12 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal12;
          stackStringBuilderLocal4 = new StringBuilder().append("de.<init>(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',');
          if (uiComponentArgument5 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(booleanArgument6).append(',').append(integerArgument7).append(',').append(integerArgument8).append(',');
          if (bitmapFontArgument9 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument10).append(',');
          if (stringArgument11 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(')').toString());
        }
    }

    public static void performAction0390(int integerArgument1) {
        uiComponentPart023State0001 = null;
        cipherPacketBufferState0001 = null;
        stringState0109 = null;
        mixedSupport111State0001 = null;
        if (integerArgument1 >= -117) {
          stringState0109 = (String) null;
        }
        stringState0108 = null;
    }

    static int computeInteger0388(int integerArgument1, int integerArgument2) {
        return integerArgument1 | integerArgument2;
    }

    final static void performAction0387(boolean booleanArgument1, int integerArgument2, String stringArgument3, int integerArgument4, boolean booleanArgument5) {
        String stackStringLocal1 = null;
        int stackIntegerLocal2 = 0;
        String stackStringLocal3 = null;
        boolean stackBooleanLocal4 = false;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        RuntimeException runtimeExceptionLocal11 = null;
        String stringLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        String stringLocal17 = null;
        int integerLocal18;
        int integerLocal19;
        int integerLocal20;
        int integerLocal21;
        integerLocal16 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          UiComponentPart023.booleanState0134 = true;
          MixedSupport074.integerState0395 = integerArgument4;
          stringLocal17 = stringArgument3;
          if (!booleanArgument5) {
            stackStringLocal1 = NetworkSupport007.stringState0345;
          } else {
            stackStringLocal1 = UiComponentPart026.stringState0461;
          }
          stringLocal12 = stackStringLocal1;
          if (MixedSupport074.integerState0395 == 0) {
            integerLocal13 = MixedSupport126.computeInteger1794(stringLocal17, 116, 480, ResourceSupport004.stringArrayState0031, SoftwareFramebuffer.bitmapFontState0021);
            integerLocal14 = integerLocal13 + 3;
            MixedSupport136.integerArrayState0211 = new int[integerLocal14];
            UiComponentPart010.stringArrayState0012 = new String[integerLocal14];
            for (integerLocal15 = 0; integerLocal15 < integerLocal14; integerLocal15++) {
              MixedSupport136.integerArrayState0211[integerLocal15] = -1;
            }
            UiComponentPart010.integerArrayState0039 = new int[2];
            for (integerLocal15 = 0; integerLocal15 < integerLocal13; integerLocal15++) {
              UiComponentPart010.stringArrayState0012[integerLocal15] = ResourceSupport004.stringArrayState0031[integerLocal15];
            }
            UiComponentPart010.stringArrayState0012[-3 + integerLocal14] = "";
            UiComponentPart010.stringArrayState0012[integerLocal14 - 2] = stringLocal12;
            MixedSupport136.integerArrayState0211[integerLocal14 - 2] = 0;
            UiComponentPart010.integerArrayState0039[0] = 1;
            UiComponentPart010.stringArrayState0012[-1 + integerLocal14] = UiComponentPart021.stringState0383;
            MixedSupport136.integerArrayState0211[-1 + integerLocal14] = 1;
            UiComponentPart010.integerArrayState0039[1] = 2;
          } else {
            if (MixedSupport074.integerState0395 != 1) {
              throw new IllegalArgumentException();
            }
            integerLocal13 = MixedSupport126.computeInteger1794(stringLocal17, 104, 480, ResourceSupport004.stringArrayState0031, SoftwareFramebuffer.bitmapFontState0021);
            integerLocal14 = 2 + integerLocal13;
            MixedSupport136.integerArrayState0211 = new int[integerLocal14];
            UiComponentPart010.stringArrayState0012 = new String[integerLocal14];
            for (integerLocal15 = 0; integerLocal15 < integerLocal14; integerLocal15++) {
              MixedSupport136.integerArrayState0211[integerLocal15] = -1;
            }
            UiComponentPart010.integerArrayState0039 = new int[1];
            for (integerLocal15 = 0; integerLocal15 < integerLocal13; integerLocal15++) {
              UiComponentPart010.stringArrayState0012[integerLocal15] = ResourceSupport004.stringArrayState0031[integerLocal15];
            }
            UiComponentPart010.stringArrayState0012[integerLocal14 - 2] = "";
            UiComponentPart010.stringArrayState0012[-1 + integerLocal14] = UiComponentPart021.stringState0383;
            MixedSupport136.integerArrayState0211[-1 + integerLocal14] = 0;
            UiComponentPart010.integerArrayState0039[0] = 2;
          }
          UiComponentPart033.mixedSupport121State0004.integerState0756 = UiComponentPart010.integerArrayState0039.length;
          integerLocal18 = 0;
          integerLocal20 = 0;
          if (integerArgument2 != -5540) {
            return;
          }
          while (integerLocal20 < UiComponentPart010.stringArrayState0012.length) {
            stackIntegerLocal2 = 0;
            stackStringLocal3 = UiComponentPart010.stringArrayState0012[integerLocal20];
            stackBooleanLocal4 = !(0 > MixedSupport136.integerArrayState0211[integerLocal20]);
            integerLocal19 = NetworkArchiveRequestManager.computeInteger1467(stackIntegerLocal2, stackStringLocal3, stackBooleanLocal4);
            if (MixedSupport136.integerArrayState0211[integerLocal20] != -1) {
              integerLocal19 = integerLocal19 + ResourceSupport002.integerState0050 * 2;
            }
            if (integerLocal19 > integerLocal18) {
              integerLocal18 = integerLocal19;
            }
            integerLocal20++;
          }
          MixedSupport003.integerState0018 = (AudioSupport002.integerState0344 + MixedSupport080.integerState0433 << 1) * UiComponentPart033.mixedSupport121State0004.integerState0756;
          MixedSupport035.integerState0219 = -(integerLocal18 >> 1) + (MixedSupport004.integerState0029 + integerLocal18);
          ResourceSupport001.integerState0021 = MixedSupport004.integerState0029 - (integerLocal18 >> 1);
          for (integerLocal21 = 0; integerLocal21 < UiComponentPart010.stringArrayState0012.length; integerLocal21++) {
            stackIntegerLocal5 = MixedSupport003.integerState0018;
            if (MixedSupport136.integerArrayState0211[integerLocal21] < 0) {
              stackIntegerLocal6 = ComponentDecorator.integerState0497;
            } else {
              stackIntegerLocal6 = UiComponentPart032.integerState0835;
            }
            MixedSupport003.integerState0018 = stackIntegerLocal5 + stackIntegerLocal6;
          }
          MixedSupport116.integerState0721 = MixedSupport074.integerState0402 - (MixedSupport003.integerState0018 >> 1);
          UiComponentPart033.mixedSupport121State0004.performAction1722(0, 0, MixedSupport106.computeInteger1448(MixedSupport106.integerState0590, -2141435999, HashNode.integerState0069), booleanArgument1);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal22) {
          caughtExceptionLocal10 = caughtParameterLocal22;
          runtimeExceptionLocal11 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal11;
          stackStringBuilderLocal8 = new StringBuilder().append("de.B(").append(booleanArgument1).append(',').append(integerArgument2).append(',');
          if (stringArgument3 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument4).append(',').append(booleanArgument5).append(')').toString());
        }
    }

    final void performAction0175(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = integerArgument1 + this.integerState0110;
        int integerLocal2 = this.integerState0104 + integerArgument4;
        if (integerArgument2 > -103) {
          return;
        }
        super.performAction0175(integerArgument1, -109, integerArgument3, integerArgument4);
        if (integerArgument3 != 0) {
          return;
        }
        int integerLocal3 = this.booleanState0026 ? this.integerState0107 + (-this.integerState0136 - 2 * this.integerState0134) : 0;
        this.bitmapFontState0009.computeInteger1213(this.stringState0110, integerLocal3 + integerLocal1 + this.integerState0134, integerLocal2 + this.integerState0134, -this.integerState0134 + this.integerState0136, this.integerState0108 - 2 * this.integerState0134, this.integerState0135, -1, this.booleanState0026 ? 0 : 2, 1, this.bitmapFontState0009.integerState0518);
    }

    final static RgbSprite[] computeRgbSpriteArray0389(boolean booleanArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        byte[] byteArrayLocal3 = null;
        int[] integerArrayLocal4 = null;
        int integerLocal5 = 0;
        int integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        RgbSprite[] rgbSpriteArrayLocal7 = new RgbSprite[GameDomainSupport002.integerState0177];
        for (integerLocal1 = 0; integerLocal1 < GameDomainSupport002.integerState0177; integerLocal1++) {
          integerLocal2 = MixedSupport052.integerArrayState0054[integerLocal1] * MixedSupport130.integerArrayState0208[integerLocal1];
          byteArrayLocal3 = SceneWidgetPart011.byteArrayArrayState0008[integerLocal1];
          integerArrayLocal4 = new int[integerLocal2];
          for (integerLocal5 = 0; integerLocal5 < integerLocal2; integerLocal5++) {
            integerArrayLocal4[integerLocal5] = NetworkSupport006.integerArrayState0152[MixedSupport079.computeInteger1051((int) byteArrayLocal3[integerLocal5], 255)];
          }
          rgbSpriteArrayLocal7[integerLocal1] = new RgbSprite(MixedSupport029.integerState0181, MixedSupport057.integerState0297, InputAdapter006.integerArrayState0206[integerLocal1], MixedSupport039.integerArrayState0047[integerLocal1], MixedSupport130.integerArrayState0208[integerLocal1], MixedSupport052.integerArrayState0054[integerLocal1], integerArrayLocal4);
        }
        MixedSupport094.performAction1305(126);
        if (booleanArgument1) {
          uiComponentPart023State0001 = (UiComponentPart023) null;
        }
        return rgbSpriteArrayLocal7;
    }

    final String computeString0242(byte byteArgument1) {
        int integerLocal1 = this.uiComponentState0002.booleanState0018 ? 1 : 0;
        this.uiComponentState0002.booleanState0018 = this.booleanState0018;
        String stringLocal2 = this.uiComponentState0002.computeString0242(byteArgument1);
        this.uiComponentState0002.booleanState0018 = integerLocal1 != 0 ? true : false;
        return stringLocal2;
    }

    static {
        stringState0108 = "If you do nothing the game will revert to normal view in <%0> second.";
        stringState0109 = "Instructions";
        booleanState0027 = false;
        mixedSupport111State0001 = new MixedSupport111(12, 0, 1, 0);
    }
}
