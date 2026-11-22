/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport009 extends MixedSupport001 {
    static UiComponentPart019 uiComponentPart019State0001;
    static String stringState0039;
    private MixedSupport118 mixedSupport118State0001;
    private MixedSupport118[] mixedSupport118ArrayState0001;
    static int[][] integerArrayArrayState0004;
    static String stringState0040;
    static int[] integerArrayState0015;
    static int[] integerArrayState0016;
    static int integerState0054;
    static String stringState0041;

    private final void performAction0098(byte byteArgument1, MixedSupport009 mixedSupport009Argument2, boolean booleanArgument3) {
        MixedSupport118 cachedMixedSupport118Local1 = null;
        MixedSupport118 stackMixedSupport118Local2 = null;
        MixedSupport118 stackMixedSupport118Local3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        int integerLocal8 = 0;
        RuntimeException runtimeExceptionLocal9 = null;
        MixedSupport118 mixedSupport118Local10 = null;
        MixedSupport118 mixedSupport118Local11 = null;
        int integerLocal12 = 0;
        int integerLocal13;
        integerLocal12 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          super.performAction0008(-12253, mixedSupport009Argument2);
          if (booleanArgument3) {
            for (integerLocal8 = 0; integerLocal8 < 6; integerLocal8++) {
              mixedSupport118Local10 = this.mixedSupport118ArrayState0001[integerLocal8];
              if (mixedSupport118Local10 != null) {
                mixedSupport118Local11 = mixedSupport009Argument2.mixedSupport118ArrayState0001[integerLocal8];
                stackMixedSupport118Local2 = mixedSupport118Local10;
                if (mixedSupport118Local11 == null) {
                  cachedMixedSupport118Local1 = new MixedSupport118();
                  mixedSupport009Argument2.mixedSupport118ArrayState0001[integerLocal8] = cachedMixedSupport118Local1;
                  stackMixedSupport118Local3 = cachedMixedSupport118Local1;
                } else {
                  stackMixedSupport118Local3 = mixedSupport118Local11;
                }
                ((MixedSupport118) (Object) stackMixedSupport118Local2).performAction1546(stackMixedSupport118Local3, 1);
              } else {
                mixedSupport009Argument2.mixedSupport118ArrayState0001[integerLocal8] = null;
              }
            }
          } else {
            MixedSupport008.performAction0077(this.mixedSupport118ArrayState0001, 0, mixedSupport009Argument2.mixedSupport118ArrayState0001, 0, 6);
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
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(booleanArgument3).append(')').toString());
        }
    }

    final void performAction0100(int integerArgument1, RgbSprite[] rgbSpriteArrayArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        try {
          if (integerArgument1 <= 97) {
            UiComponent uiComponentLocal2 = (UiComponent) null;
            this.performAction0017(true, -54, 87, (byte) -121, (UiComponent) null);
          }
          integerLocal1 = integerArgument3;
          if (this.mixedSupport118ArrayState0001[integerLocal1] == null) {
            this.mixedSupport118ArrayState0001[integerLocal1] = new MixedSupport118();
          }
          this.mixedSupport118ArrayState0001[integerArgument3].rgbSpriteArrayState0027 = rgbSpriteArrayArgument2;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "bc.H(" + integerArgument1 + ',' + (rgbSpriteArrayArgument2 != null ? "{...}" : "null") + ',' + integerArgument3 + ')');
        }
    }

    MixedSupport009(MixedSupport009 mixedSupport009Argument1, boolean booleanArgument2) {
        this();
        try {
          mixedSupport009Argument1.performAction0098((byte) -117, this, booleanArgument2);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "bc.<init>(" + (mixedSupport009Argument1 != null ? "{...}" : "null") + ',' + booleanArgument2 + ')');
        }
    }

    public MixedSupport009() {
        this.mixedSupport118ArrayState0001 = new MixedSupport118[6];
        this.mixedSupport118State0001 = new MixedSupport118();
        MixedSupport118 cachedMixedSupport118Local1 = new MixedSupport118();
        this.mixedSupport118ArrayState0001[0] = cachedMixedSupport118Local1;
        MixedSupport118 mixedSupport118Local2 = cachedMixedSupport118Local1;
        mixedSupport118Local2.performAction1549((byte) 68);
    }

    final MixedSupport118 computeMixedSupport1180099(int integerArgument1, int integerArgument2) {
        if (integerArgument2 <= 0) {
          uiComponentPart019State0001 = (UiComponentPart019) null;
        }
        MixedSupport118 cachedMixedSupport118Local1 = new MixedSupport118();
        this.mixedSupport118ArrayState0001[integerArgument1] = cachedMixedSupport118Local1;
        return cachedMixedSupport118Local1;
    }

    final static String computeString0102(CharSequence charSequenceArgument1, int integerArgument2) {
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
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal10), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(',').append(integerArgument2).append(')').toString());
        }
    }

    public final void performAction0017(boolean booleanArgument1, int integerArgument2, int integerArgument3, byte byteArgument4, UiComponent uiComponentArgument5) {
        UiComponent stackUiComponentLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        MixedSupport118 mixedSupport118Local7 = null;
        MixedSupport118 mixedSupport118Local8 = null;
        UiComponent uiComponentLocal9 = null;
        InteractiveComponent interactiveComponentLocal10 = null;
        MixedSupport118 mixedSupport118Local11 = null;
        MixedSupport118 mixedSupport118Local12 = null;
        MixedSupport118 mixedSupport118Local13 = null;
        MixedSupport118 mixedSupport118Local14 = null;
        try {
          if (uiComponentArgument5 instanceof InteractiveComponent) {
            stackUiComponentLocal1 = (UiComponent) (uiComponentArgument5);
          } else {
            stackUiComponentLocal1 = null;
          }
          interactiveComponentLocal10 = (InteractiveComponent) (stackUiComponentLocal1);
          RenderingSupport004.performAction0579(uiComponentArgument5.integerState0104 + integerArgument3, 20763, uiComponentArgument5.integerState0107 + uiComponentArgument5.integerState0110 + integerArgument2, integerArgument2 + uiComponentArgument5.integerState0110, uiComponentArgument5.integerState0104 + integerArgument3 + uiComponentArgument5.integerState0108);
          if (interactiveComponentLocal10 != null) {
            booleanArgument1 = booleanArgument1 & interactiveComponentLocal10.booleanState0035;
          }
          mixedSupport118Local7 = this.mixedSupport118ArrayState0001[0];
          this.mixedSupport118State0001.performAction1549((byte) 80);
          mixedSupport118Local7.performAction1547(this.mixedSupport118State0001, this, 122, integerArgument3, integerArgument2, uiComponentArgument5);
          if (interactiveComponentLocal10 != null) {
            if (interactiveComponentLocal10.booleanState0034) {
              mixedSupport118Local11 = this.mixedSupport118ArrayState0001[1];
              if (mixedSupport118Local11 != null) {
                mixedSupport118Local11.performAction1547(this.mixedSupport118State0001, this, 127, integerArgument3, integerArgument2, uiComponentArgument5);
              }
            }
            if (interactiveComponentLocal10.booleanState0018) {
              mixedSupport118Local12 = this.mixedSupport118ArrayState0001[3];
              if (interactiveComponentLocal10.integerState0109 != 0 &&
                mixedSupport118Local12 != null) {
                mixedSupport118Local12.performAction1547(this.mixedSupport118State0001, this, 122, integerArgument3, integerArgument2, uiComponentArgument5);
              } else {
                mixedSupport118Local8 = this.mixedSupport118ArrayState0001[2];
                if (mixedSupport118Local8 != null) {
                  mixedSupport118Local8.performAction1547(this.mixedSupport118State0001, this, 126, integerArgument3, integerArgument2, uiComponentArgument5);
                }
              }
            }
          }
          if (uiComponentArgument5.computeBoolean0220(true)) {
            mixedSupport118Local13 = this.mixedSupport118ArrayState0001[5];
            if (mixedSupport118Local13 != null) {
              mixedSupport118Local13.performAction1547(this.mixedSupport118State0001, this, 126, integerArgument3, integerArgument2, uiComponentArgument5);
            }
          }
          if (!booleanArgument1) {
            mixedSupport118Local14 = this.mixedSupport118ArrayState0001[4];
            if (mixedSupport118Local14 != null) {
              mixedSupport118Local14.performAction1547(this.mixedSupport118State0001, this, 124, integerArgument3, integerArgument2, uiComponentArgument5);
            }
          }
          this.mixedSupport118State0001.performAction1541(-2, uiComponentArgument5, integerArgument2, this, integerArgument3);
          ByteStorage.performAction1060((byte) -5);
          if (byteArgument4 > -60) {
            uiComponentLocal9 = (UiComponent) null;
            this.performAction0017(true, -61, 21, (byte) -12, (UiComponent) null);
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
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    final void performAction0101(RgbSprite rgbSpriteArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        MixedSupport118[] mixedSupport118ArrayLocal2 = null;
        MixedSupport118 mixedSupport118Local3 = null;
        int integerLocal4 = 0;
        MixedSupport118[] mixedSupport118ArrayLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        RuntimeException runtimeExceptionLocal10 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          mixedSupport118ArrayLocal5 = this.mixedSupport118ArrayState0001;
          mixedSupport118ArrayLocal2 = mixedSupport118ArrayLocal5;
          if (integerArgument2 != 2) {
            stringState0039 = (String) null;
          }
          for (integerLocal1 = 0; integerLocal1 < mixedSupport118ArrayLocal5.length; integerLocal1++) {
            mixedSupport118Local3 = mixedSupport118ArrayLocal5[integerLocal1];
            if (mixedSupport118Local3 != null) {
              mixedSupport118Local3.rgbSpriteState0057 = rgbSpriteArgument1;
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
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument2).append(')').toString());
        }
    }

    final void performAction0103(RgbSprite[] rgbSpriteArrayArgument1, boolean booleanArgument2) {
        MixedSupport118[] mixedSupport118ArrayLocal1 = null;
        int integerLocal2 = 0;
        MixedSupport118 mixedSupport118Local3 = null;
        int integerLocal4 = 0;
        MixedSupport118[] mixedSupport118ArrayLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        RuntimeException runtimeExceptionLocal10 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          mixedSupport118ArrayLocal5 = this.mixedSupport118ArrayState0001;
          mixedSupport118ArrayLocal1 = mixedSupport118ArrayLocal5;
          integerLocal2 = 0;
          if (booleanArgument2) {
            return;
          }
          while (integerLocal2 < mixedSupport118ArrayLocal5.length) {
            mixedSupport118Local3 = mixedSupport118ArrayLocal5[integerLocal2];
            if (mixedSupport118Local3 != null) {
              mixedSupport118Local3.rgbSpriteArrayState0027 = rgbSpriteArrayArgument1;
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
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(booleanArgument2).append(')').toString());
        }
    }

    public static void clearStaticReferences(byte byteArgument1) {
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
