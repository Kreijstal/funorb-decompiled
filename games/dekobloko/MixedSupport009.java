/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport009 extends MixedSupport001 {
    static UiComponentPart019 uiComponentPart019State0001;
    static String stringState0039;
    private MixedSupport123 mixedSupport123State0001;
    private MixedSupport123[] mixedSupport123ArrayState0001;
    static int[][] integerArrayArrayState0004;
    static String stringState0040;
    static int[] integerArrayState0015;
    static int[] integerArrayState0016;
    static int integerState0054;
    static String stringState0041;

    private final void performAction0108(byte byteArgument1, MixedSupport009 mixedSupport009Argument2, boolean booleanArgument3) {
        MixedSupport123 cachedMixedSupport123Local1 = null;
        MixedSupport123 stackMixedSupport123Local2 = null;
        MixedSupport123 stackMixedSupport123Local3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        int integerLocal8 = 0;
        RuntimeException runtimeExceptionLocal9 = null;
        MixedSupport123 mixedSupport123Local10 = null;
        MixedSupport123 mixedSupport123Local11 = null;
        int integerLocal12 = 0;
        int integerLocal13;
        integerLocal12 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          super.performAction0009(-12253, mixedSupport009Argument2);
          if (booleanArgument3) {
            for (integerLocal8 = 0; integerLocal8 < 6; integerLocal8++) {
              mixedSupport123Local10 = this.mixedSupport123ArrayState0001[integerLocal8];
              if (mixedSupport123Local10 != null) {
                mixedSupport123Local11 = mixedSupport009Argument2.mixedSupport123ArrayState0001[integerLocal8];
                stackMixedSupport123Local2 = mixedSupport123Local10;
                if (mixedSupport123Local11 == null) {
                  cachedMixedSupport123Local1 = new MixedSupport123();
                  mixedSupport009Argument2.mixedSupport123ArrayState0001[integerLocal8] = cachedMixedSupport123Local1;
                  stackMixedSupport123Local3 = cachedMixedSupport123Local1;
                } else {
                  stackMixedSupport123Local3 = mixedSupport123Local11;
                }
                ((MixedSupport123) (Object) stackMixedSupport123Local2).performAction1752(stackMixedSupport123Local3, 1);
              } else {
                mixedSupport009Argument2.mixedSupport123ArrayState0001[integerLocal8] = null;
              }
            }
          } else {
            MixedSupport008.performAction0086(this.mixedSupport123ArrayState0001, 0, mixedSupport009Argument2.mixedSupport123ArrayState0001, 0, 6);
          }
          integerLocal13 = -82 % ((-68 - byteArgument1) / 44);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal7 = caughtParameterLocal14;
          runtimeExceptionLocal9 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal9;
          stackStringBuilderLocal5 = new StringBuilder().append("bc.I(").append(byteArgument1).append(',');
          if (mixedSupport009Argument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(booleanArgument3).append(')').toString());
        }
    }

    final void performAction0110(int integerArgument1, RgbSprite[] rgbSpriteArrayArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        try {
          if (integerArgument1 <= 97) {
            UiComponent uiComponentLocal2 = (UiComponent) null;
            this.performAction0018(true, -54, 87, (byte) -121, (UiComponent) null);
          }
          integerLocal1 = integerArgument3;
          if (this.mixedSupport123ArrayState0001[integerLocal1] == null) {
            this.mixedSupport123ArrayState0001[integerLocal1] = new MixedSupport123();
          }
          this.mixedSupport123ArrayState0001[integerArgument3].rgbSpriteArrayState0027 = rgbSpriteArrayArgument2;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "bc.H(" + integerArgument1 + ',' + (rgbSpriteArrayArgument2 != null ? "{...}" : "null") + ',' + integerArgument3 + ')');
        }
    }

    MixedSupport009(MixedSupport009 mixedSupport009Argument1, boolean booleanArgument2) {
        this();
        try {
          mixedSupport009Argument1.performAction0108((byte) -117, this, booleanArgument2);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "bc.<init>(" + (mixedSupport009Argument1 != null ? "{...}" : "null") + ',' + booleanArgument2 + ')');
        }
    }

    public MixedSupport009() {
        this.mixedSupport123ArrayState0001 = new MixedSupport123[6];
        this.mixedSupport123State0001 = new MixedSupport123();
        MixedSupport123 cachedMixedSupport123Local1 = new MixedSupport123();
        this.mixedSupport123ArrayState0001[0] = cachedMixedSupport123Local1;
        MixedSupport123 mixedSupport123Local2 = cachedMixedSupport123Local1;
        mixedSupport123Local2.performAction1755((byte) 68);
    }

    final MixedSupport123 computeMixedSupport1230109(int integerArgument1, int integerArgument2) {
        if (integerArgument2 <= 0) {
          uiComponentPart019State0001 = (UiComponentPart019) null;
        }
        MixedSupport123 cachedMixedSupport123Local1 = new MixedSupport123();
        this.mixedSupport123ArrayState0001[integerArgument1] = cachedMixedSupport123Local1;
        return cachedMixedSupport123Local1;
    }

    final static String computeString0112(CharSequence charSequenceArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException runtimeExceptionLocal3 = null;
        char[] characterArrayLocal4 = null;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        char[] characterArrayLocal7 = null;
        char[] characterArrayLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException stackRuntimeExceptionLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument2 != 65) {
            stringState0041 = (String) null;
          }
          integerLocal2 = charSequenceArgument1.length();
          if (integerLocal2 > 20) {
            integerLocal2 = 20;
          }
          characterArrayLocal8 = new char[integerLocal2];
          characterArrayLocal7 = characterArrayLocal8;
          characterArrayLocal4 = characterArrayLocal7;
          for (integerLocal1 = 0; integerLocal1 < integerLocal2; integerLocal1++) {
            integerLocal5 = charSequenceArgument1.charAt(integerLocal1);
            if (65 <= integerLocal5 &&
              integerLocal5 <= 90) {
              characterArrayLocal4[integerLocal1] = (char)(-65 + (integerLocal5 + 97));
            } else if ((integerLocal5 < 97 ||
              integerLocal5 > 122) &&
              (integerLocal5 < 48 ||
              integerLocal5 > 57)) {
              characterArrayLocal4[integerLocal1] = (char)95;
            } else {
              characterArrayLocal4[integerLocal1] = (char)integerLocal5;
            }
          }
          stackStringLocal9 = new String(characterArrayLocal8);
          return stackStringLocal9;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal13 = caughtParameterLocal14;
          runtimeExceptionLocal3 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal10 = runtimeExceptionLocal3;
          stackStringBuilderLocal11 = new StringBuilder().append("bc.E(");
          if (charSequenceArgument1 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal10), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(',').append(integerArgument2).append(')').toString());
        }
    }

    public final void performAction0018(boolean booleanArgument1, int integerArgument2, int integerArgument3, byte byteArgument4, UiComponent uiComponentArgument5) {
        UiComponent stackUiComponentLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        MixedSupport123 mixedSupport123Local7 = null;
        MixedSupport123 mixedSupport123Local8 = null;
        UiComponent uiComponentLocal9 = null;
        InteractiveComponent interactiveComponentLocal10 = null;
        MixedSupport123 mixedSupport123Local11 = null;
        MixedSupport123 mixedSupport123Local12 = null;
        MixedSupport123 mixedSupport123Local13 = null;
        MixedSupport123 mixedSupport123Local14 = null;
        try {
          if (uiComponentArgument5 instanceof InteractiveComponent) {
            stackUiComponentLocal1 = (UiComponent) (uiComponentArgument5);
          } else {
            stackUiComponentLocal1 = null;
          }
          interactiveComponentLocal10 = (InteractiveComponent) (stackUiComponentLocal1);
          RenderingSupport004.performAction0640(uiComponentArgument5.integerState0104 + integerArgument3, 20763, uiComponentArgument5.integerState0107 + uiComponentArgument5.integerState0110 + integerArgument2, integerArgument2 + uiComponentArgument5.integerState0110, uiComponentArgument5.integerState0104 + integerArgument3 + uiComponentArgument5.integerState0108);
          if (interactiveComponentLocal10 != null) {
            booleanArgument1 = booleanArgument1 & interactiveComponentLocal10.booleanState0035;
          }
          mixedSupport123Local7 = this.mixedSupport123ArrayState0001[0];
          this.mixedSupport123State0001.performAction1755((byte) 80);
          mixedSupport123Local7.performAction1753(this.mixedSupport123State0001, this, 122, integerArgument3, integerArgument2, uiComponentArgument5);
          if (interactiveComponentLocal10 != null) {
            if (interactiveComponentLocal10.booleanState0034) {
              mixedSupport123Local11 = this.mixedSupport123ArrayState0001[1];
              if (mixedSupport123Local11 != null) {
                mixedSupport123Local11.performAction1753(this.mixedSupport123State0001, this, 127, integerArgument3, integerArgument2, uiComponentArgument5);
              }
            }
            if (interactiveComponentLocal10.booleanState0018) {
              mixedSupport123Local12 = this.mixedSupport123ArrayState0001[3];
              if (interactiveComponentLocal10.integerState0109 != 0 &&
                mixedSupport123Local12 != null) {
                mixedSupport123Local12.performAction1753(this.mixedSupport123State0001, this, 122, integerArgument3, integerArgument2, uiComponentArgument5);
              } else {
                mixedSupport123Local8 = this.mixedSupport123ArrayState0001[2];
                if (mixedSupport123Local8 != null) {
                  mixedSupport123Local8.performAction1753(this.mixedSupport123State0001, this, 126, integerArgument3, integerArgument2, uiComponentArgument5);
                }
              }
            }
          }
          if (uiComponentArgument5.computeBoolean0239(true)) {
            mixedSupport123Local13 = this.mixedSupport123ArrayState0001[5];
            if (mixedSupport123Local13 != null) {
              mixedSupport123Local13.performAction1753(this.mixedSupport123State0001, this, 126, integerArgument3, integerArgument2, uiComponentArgument5);
            }
          }
          if (!booleanArgument1) {
            mixedSupport123Local14 = this.mixedSupport123ArrayState0001[4];
            if (mixedSupport123Local14 != null) {
              mixedSupport123Local14.performAction1753(this.mixedSupport123State0001, this, 124, integerArgument3, integerArgument2, uiComponentArgument5);
            }
          }
          this.mixedSupport123State0001.performAction1747(-2, uiComponentArgument5, integerArgument2, this, integerArgument3);
          MixedSupport086.performAction1200((byte) -5);
          if (byteArgument4 > -60) {
            uiComponentLocal9 = (UiComponent) null;
            this.performAction0018(true, -61, 21, (byte) -12, (UiComponent) null);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal5 = caughtParameterLocal15;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("bc.B(").append(booleanArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(byteArgument4).append(',');
          if (uiComponentArgument5 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    final void performAction0111(RgbSprite rgbSpriteArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        MixedSupport123[] mixedSupport123ArrayLocal2 = null;
        MixedSupport123 mixedSupport123Local3 = null;
        int integerLocal4 = 0;
        MixedSupport123[] mixedSupport123ArrayLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        RuntimeException runtimeExceptionLocal10 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          mixedSupport123ArrayLocal5 = this.mixedSupport123ArrayState0001;
          mixedSupport123ArrayLocal2 = mixedSupport123ArrayLocal5;
          if (integerArgument2 != 2) {
            stringState0039 = (String) null;
          }
          for (integerLocal1 = 0; integerLocal1 < mixedSupport123ArrayLocal5.length; integerLocal1++) {
            mixedSupport123Local3 = mixedSupport123ArrayLocal5[integerLocal1];
            if (mixedSupport123Local3 != null) {
              mixedSupport123Local3.rgbSpriteState0057 = rgbSpriteArgument1;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal9 = caughtParameterLocal11;
          runtimeExceptionLocal10 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal10;
          stackStringBuilderLocal7 = new StringBuilder().append("bc.G(");
          if (rgbSpriteArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument2).append(')').toString());
        }
    }

    final void performAction0113(RgbSprite[] rgbSpriteArrayArgument1, boolean booleanArgument2) {
        MixedSupport123[] mixedSupport123ArrayLocal1 = null;
        int integerLocal2 = 0;
        MixedSupport123 mixedSupport123Local3 = null;
        int integerLocal4 = 0;
        MixedSupport123[] mixedSupport123ArrayLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        RuntimeException runtimeExceptionLocal10 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          mixedSupport123ArrayLocal5 = this.mixedSupport123ArrayState0001;
          mixedSupport123ArrayLocal1 = mixedSupport123ArrayLocal5;
          integerLocal2 = 0;
          if (booleanArgument2) {
            return;
          }
          while (integerLocal2 < mixedSupport123ArrayLocal5.length) {
            mixedSupport123Local3 = mixedSupport123ArrayLocal5[integerLocal2];
            if (mixedSupport123Local3 != null) {
              mixedSupport123Local3.rgbSpriteArrayState0027 = rgbSpriteArrayArgument1;
            }
            integerLocal2++;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal9 = caughtParameterLocal11;
          runtimeExceptionLocal10 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal10;
          stackStringBuilderLocal7 = new StringBuilder().append("bc.A(");
          if (rgbSpriteArrayArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(booleanArgument2).append(')').toString());
        }
    }

    public static void performAction0114(byte byteArgument1) {
        stringState0039 = null;
        integerArrayState0015 = null;
        integerArrayArrayState0004 = (int[][]) null;
        stringState0041 = null;
        if (byteArgument1 >= -101) {
          stringState0041 = (String) null;
        }
        integerArrayState0016 = null;
        stringState0040 = null;
        uiComponentPart019State0001 = null;
    }

    static {
        stringState0039 = "No spectators";
        integerArrayState0016 = new int[8192];
        stringState0040 = "Allow spectators?";
        stringState0041 = "To play a multiplayer game, please log in or create a free account.";
    }
}
