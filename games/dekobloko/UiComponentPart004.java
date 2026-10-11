/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class UiComponentPart004 extends UiComponentPart030 {
    private UiComponentPart010 uiComponentPart010State0001;
    private int integerState0089;
    private int integerState0090;
    static int integerState0091;
    static RenderingSupport008 renderingSupport008State0002;
    private int integerState0092;
    private UiComponent uiComponentState0001;
    private MixedSupport057 mixedSupport057State0001;
    private int integerState0093;
    private int integerState0094;
    static RgbSprite rgbSpriteState0009;
    static int integerState0095;
    static String stringState0065;

    final void performAction0202(byte byteArgument1) {
        if (this.mixedSupport057State0001 != MixedSupport022.mixedSupport057State0002) {
          int integerLocal1 = -119 % ((byteArgument1 - 30) / 39);
          this.integerState0093 = 0;
          this.mixedSupport057State0001 = MixedSupport112.mixedSupport057State0004;
          this.performAction0199(this.uiComponentState0001, -29870);
          this.uiComponentPart010State0001.integerState0187 = 0;
          this.uiComponentState0001 = null;
          return;
        }
    }

    private final void performAction0199(UiComponent uiComponentArgument1, int integerArgument2) {
        UiComponent uiComponentLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        try {
          if (this.uiComponentPart010State0001 != null) {
            this.uiComponentPart010State0001.performAction0161((byte) 111);
          }
          boolean sharedTailLocal7 = (uiComponentArgument1 != null);
          if (!sharedTailLocal7) {
            this.uiComponentPart010State0001 = new UiComponentPart010();
            sharedTailLocal7 = (DekoBlokoClient.obfuscationControl);
          }
          if (sharedTailLocal7) {
            uiComponentArgument1.performAction0241(uiComponentArgument1.integerState0108, uiComponentArgument1.integerState0107, 6, this.integerState0089 + 6, -16555);
            this.uiComponentPart010State0001 = new UiComponentPart010(uiComponentArgument1);
          }
          this.performAction1012(this.uiComponentPart010State0001, (byte) -55);
          this.uiComponentState0001 = null;
          if (integerArgument2 != -29870) {
            uiComponentLocal1 = (UiComponent) null;
            this.performAction0201((UiComponent) null, (byte) -56);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal5 = caughtParameterLocal8;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("ca.U(");
          if (uiComponentArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument2).append(')').toString());
        }
    }

    final static void performAction0200(String stringArgument1, String stringArgument2, String stringArgument3, byte byteArgument4, int integerArgument5, int integerArgument6) {
        MixedSupport056 mixedSupport056Local1 = null;
        try {
          mixedSupport056Local1 = new MixedSupport056(integerArgument5, stringArgument1, integerArgument6, stringArgument2, stringArgument3);
          MixedSupport112.performAction1596(mixedSupport056Local1, -3);
          int integerLocal2 = 121 % ((20 - byteArgument4) / 42);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ca.W(" + (stringArgument1 != null ? "{...}" : "null") + ',' + (stringArgument2 != null ? "{...}" : "null") + ',' + (stringArgument3 != null ? "{...}" : "null") + ',' + byteArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ')');
        }
    }

    final static RgbSprite[] computeRgbSpriteArray0197(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, boolean booleanArgument6, int integerArgument7, int integerArgument8, int integerArgument9) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        int integerLocal7 = 0;
        RgbSprite[] rgbSpriteArrayLocal8 = null;
        RgbSprite[] rgbSpriteArrayLocal9 = null;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        RgbSprite rgbSpriteLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15;
        int integerLocal16;
        int integerLocal17;
        int integerLocal18;
        int integerLocal19;
        integerLocal14 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal7 = integerArgument2 + (integerArgument4 + integerArgument5);
        rgbSpriteArrayLocal8 = new RgbSprite[]{new RgbSprite(integerLocal7, integerLocal7), new RgbSprite(integerArgument9, integerLocal7), new RgbSprite(integerLocal7, integerLocal7), new RgbSprite(integerLocal7, integerArgument9), new RgbSprite(64, 64), new RgbSprite(integerLocal7, integerArgument9), new RgbSprite(integerLocal7, integerLocal7), new RgbSprite(integerArgument9, integerLocal7), new RgbSprite(integerLocal7, integerLocal7)};
        rgbSpriteArrayLocal9 = rgbSpriteArrayLocal8;
        if (booleanArgument6) {
          integerState0095 = -21;
        }
        integerLocal11 = 0;
        scanLoop1: while (true) {
          if (rgbSpriteArrayLocal9.length > integerLocal11) {
            rgbSpriteLocal12 = rgbSpriteArrayLocal9[integerLocal11];
            stackIntegerLocal1 = 0;
            if (integerLocal14 != 0) {
              break scanLoop1;
            }
            integerLocal13 = stackIntegerLocal1;
            while (integerLocal13 < rgbSpriteLocal12.integerArrayState0024.length) {
              rgbSpriteLocal12.integerArrayState0024[integerLocal13] = integerArgument1;
              integerLocal13++;
            }
            integerLocal11++;
            continue scanLoop1;
          }
          stackIntegerLocal1 = 0;
          break;
        }
        integerLocal10 = stackIntegerLocal1;
        scanLoop2: while (true) {
          if (integerLocal10 < integerArgument4) {
            stackIntegerLocal2 = 0;
            if (integerLocal14 != 0) {
              break scanLoop2;
            }
            integerLocal16 = stackIntegerLocal2;
            while (integerLocal7 > integerLocal16) {
              rgbSpriteArrayLocal8[6].integerArrayState0024[integerLocal16 + (integerLocal7 - integerLocal10 - 1) * integerLocal7] = integerArgument3;
              rgbSpriteArrayLocal8[8].integerArrayState0024[(-1 + (integerLocal7 - integerLocal10)) * integerLocal7 + integerLocal16] = integerArgument3;
              rgbSpriteArrayLocal8[2].integerArrayState0024[-integerLocal10 - 1 + integerLocal7 + integerLocal16 * integerLocal7] = integerArgument3;
              rgbSpriteArrayLocal8[8].integerArrayState0024[integerLocal16 * integerLocal7 + (-integerLocal10 + (-1 + integerLocal7))] = integerArgument3;
              integerLocal16++;
            }
            integerLocal10++;
            continue scanLoop2;
          }
          stackIntegerLocal2 = 0;
          break;
        }
        integerLocal15 = stackIntegerLocal2;
        while (true) {
          stackIntegerLocal3 = integerLocal15;
          stackIntegerLocal4 = integerArgument4;
          if (stackIntegerLocal3 < stackIntegerLocal4) {
            stackIntegerLocal5 = 0;
            if (integerLocal14 == 0) {
              integerLocal17 = stackIntegerLocal5;
              while (integerLocal7 > integerLocal17) {
                rgbSpriteArrayLocal8[0].integerArrayState0024[integerLocal17 + integerLocal7 * integerLocal15] = integerArgument8;
                rgbSpriteArrayLocal8[0].integerArrayState0024[integerLocal7 * integerLocal17 + integerLocal15] = integerArgument8;
                stackIntegerLocal3 = ~(-integerLocal15 + integerLocal7);
                stackIntegerLocal4 = ~integerLocal17;
                if (stackIntegerLocal3 < stackIntegerLocal4) {
                  rgbSpriteArrayLocal8[2].integerArrayState0024[integerLocal17 + integerLocal15 * integerLocal7] = integerArgument8;
                  rgbSpriteArrayLocal8[6].integerArrayState0024[integerLocal17 * integerLocal7 + integerLocal15] = integerArgument8;
                }
                integerLocal17++;
              }
              integerLocal15++;
              continue;
            }
          } else {
            stackIntegerLocal5 = 0;
          }
          integerLocal15 = stackIntegerLocal5;
          scanLoop3: while (true) {
            if (integerArgument9 > integerLocal15) {
              stackIntegerLocal6 = 0;
              if (integerLocal14 != 0) {
                break scanLoop3;
              }
              integerLocal18 = stackIntegerLocal6;
              while (integerLocal18 < integerArgument4) {
                rgbSpriteArrayLocal8[7].integerArrayState0024[(-1 + integerLocal7 - integerLocal18) * integerArgument9 + integerLocal15] = integerArgument3;
                rgbSpriteArrayLocal8[5].integerArrayState0024[-integerLocal18 - (1 - integerLocal7 - integerLocal15 * integerLocal7)] = integerArgument3;
                rgbSpriteArrayLocal8[1].integerArrayState0024[integerLocal18 * integerArgument9 + integerLocal15] = integerArgument8;
                rgbSpriteArrayLocal8[3].integerArrayState0024[integerLocal7 * integerLocal15 + integerLocal18] = integerArgument8;
                integerLocal18++;
              }
              integerLocal15++;
              continue scanLoop3;
            }
            stackIntegerLocal6 = 0;
            break;
          }
          integerLocal15 = stackIntegerLocal6;
          scanLoop4: while (integerArgument9 >> 1 > integerLocal15) {
            integerLocal19 = 0;
            while (true) {
              if (integerLocal19 < integerArgument5) {
                rgbSpriteArrayLocal8[1].integerArrayState0024[integerLocal15 + integerArgument9 * (-1 - integerLocal19 + integerLocal7)] = integerArgument7;
                rgbSpriteArrayLocal8[3].integerArrayState0024[-integerLocal19 - (1 - integerLocal7 - integerLocal7 * integerLocal15)] = integerArgument7;
                rgbSpriteArrayLocal8[7].integerArrayState0024[integerLocal19 * integerArgument9 + integerLocal15] = integerArgument7;
                rgbSpriteArrayLocal8[5].integerArrayState0024[integerLocal19 + integerLocal7 * integerLocal15] = integerArgument7;
                integerLocal19++;
                if (integerLocal14 == 0) {
                  continue;
                }
              } else {
                integerLocal15++;
              }
              break;
            }
            if (integerLocal14 == 0) {
              continue scanLoop4;
            }
            break;
          }
          return rgbSpriteArrayLocal8;
        }
    }

    void performAction0201(UiComponent uiComponentArgument1, byte byteArgument2) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        try {
          if (byteArgument2 < 10) {
            integerState0095 = -79;
          }
          this.uiComponentState0001 = uiComponentArgument1;
          if (MixedSupport039.mixedSupport057State0003 == this.mixedSupport057State0001) {
            this.performAction1761(this.uiComponentState0001.integerState0107 + 12, this.integerState0090, this.uiComponentState0001.integerState0108 + this.integerState0089 + 12, 194);
            this.integerState0093 = 0;
            if (!DekoBlokoClient.obfuscationControl) {
              return;
            }
          }
          if (MixedSupport022.mixedSupport057State0002 != this.mixedSupport057State0001) {
            this.mixedSupport057State0001 = MixedSupport022.mixedSupport057State0002;
            this.integerState0093 = 0;
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal4 = caughtParameterLocal6;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal5;
          stackStringBuilderLocal2 = new StringBuilder().append("ca.T(");
          if (uiComponentArgument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final static RgbSprite[] computeRgbSpriteArray0205(int integerArgument1) {
        boolean stackBooleanLocal1 = false;
        int stackIntegerLocal2 = 0;
        boolean stackOut_2_0;
        RgbSprite[] rgbSpriteArrayLocal4 = null;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int[] integerArrayLocal8 = null;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int[] integerArrayLocal11 = null;
        int[] integerArrayLocal12 = null;
        int[] integerArrayLocal13 = null;
        byte[] byteArrayLocal14 = null;
        byte[] byteArrayLocal15 = null;
        integerLocal10 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        rgbSpriteArrayLocal4 = new RgbSprite[GameDomainSupport002.integerState0177];
        integerLocal5 = integerArgument1;
        boolean naturalLoopExitLocal16 = false;
        while (!(naturalLoopExitLocal16 = (!(integerLocal5 < GameDomainSupport002.integerState0177)))) {
          integerLocal6 = MixedSupport052.integerArrayState0054[integerLocal5] * MixedSupport130.integerArrayState0208[integerLocal5];
          byteArrayLocal14 = SceneWidgetPart011.byteArrayArrayState0008[integerLocal5];
          stackOut_2_0 = MixedSupport022.booleanArrayState0004[integerLocal5];
          stackIntegerLocal2 = stackOut_2_0 ? 1 : 0;
          stackBooleanLocal1 = stackOut_2_0;
          if (integerLocal10 == 0) {
            boolean frameRemainderLocal17 = true;
            if (!stackBooleanLocal1) {
              integerArrayLocal11 = new int[integerLocal6];
              integerLocal7 = 0;
              while (integerLocal6 > integerLocal7) {
                integerArrayLocal11[integerLocal7] = NetworkSupport006.integerArrayState0152[MixedSupport079.computeInteger1051(255, (int) byteArrayLocal14[integerLocal7])];
                integerLocal7++;
              }
              rgbSpriteArrayLocal4[integerLocal5] = new RgbSprite(MixedSupport029.integerState0181, MixedSupport057.integerState0297, InputAdapter006.integerArrayState0206[integerLocal5], MixedSupport039.integerArrayState0047[integerLocal5], MixedSupport130.integerArrayState0208[integerLocal5], MixedSupport052.integerArrayState0054[integerLocal5], integerArrayLocal11);
              frameRemainderLocal17 = false;
            }
            else {
              byteArrayLocal15 = MixedSupport102.byteArrayArrayState0007[integerLocal5];
              integerArrayLocal13 = new int[integerLocal6];
              integerArrayLocal12 = integerArrayLocal13;
              integerArrayLocal8 = integerArrayLocal12;
              integerLocal9 = 0;
              while (integerLocal6 > integerLocal9) {
                integerArrayLocal8[integerLocal9] = UiComponentPart006.computeInteger0388(MixedSupport079.computeInteger1051((int) byteArrayLocal15[integerLocal9], 255) << 24, NetworkSupport006.integerArrayState0152[MixedSupport079.computeInteger1051((int) byteArrayLocal14[integerLocal9], 255)]);
                integerLocal9++;
              }
              rgbSpriteArrayLocal4[integerLocal5] = (RgbSprite) ((Object) new RenderingSupport009(MixedSupport029.integerState0181, MixedSupport057.integerState0297, InputAdapter006.integerArrayState0206[integerLocal5], MixedSupport039.integerArrayState0047[integerLocal5], MixedSupport130.integerArrayState0208[integerLocal5], MixedSupport052.integerArrayState0054[integerLocal5], integerArrayLocal13));
            }
            integerLocal5++;
            continue;
          }
          break;
        }
        if (naturalLoopExitLocal16) {
          stackIntegerLocal2 = 126;
        }
        MixedSupport094.performAction1305(stackIntegerLocal2);
        return rgbSpriteArrayLocal4;
    }

    public static void performAction0204(int integerArgument1) {
        if (integerArgument1 <= 72) {
          return;
        }
        renderingSupport008State0002 = null;
        stringState0065 = null;
        rgbSpriteState0009 = null;
    }

    boolean computeBoolean0198(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, char characterArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (super.computeBoolean0198(82, integerArgument2, uiComponentArgument3, characterArgument4)) {
            return true;
          }
          integerLocal1 = 54 % ((integerArgument1 + 22) / 49);
          if (this.uiComponentPart010State0001 != null) {
            if (98 == integerArgument2) {
              this.uiComponentPart010State0001.computeBoolean0240(false, uiComponentArgument3);
            }
            if (integerArgument2 != 99) {
              return false;
            }
            this.uiComponentPart010State0001.computeBoolean0240(false, uiComponentArgument3);
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal2 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal2;
          stackStringBuilderLocal4 = new StringBuilder().append("ca.QA(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(characterArgument4).append(')').toString());
        }
    }

    final void performAction0203(int integerArgument1) {
        if (null != this.mixedSupport057State0001) {
          if (this.mixedSupport057State0001 != MixedSupport112.mixedSupport057State0004) {
            this.performAction0174(108, this.uiComponentState0001.integerState0107 + 12, this.integerState0089 + 12 + this.uiComponentState0001.integerState0108);
            this.performAction0199(this.uiComponentState0001, -29870);
          }
          this.uiComponentPart010State0001.integerState0187 = 256;
          this.mixedSupport057State0001 = null;
        }
        super.performAction0203(92);
        int integerLocal1 = 11 % ((-15 - integerArgument1) / 49);
    }

    boolean computeBoolean0182(byte byteArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (byteArgument1 <= 15) {
          integerState0095 = -126;
        }
        boolean frameRemainderLocal4 = true;
        if (this.mixedSupport057State0001 != null) {
          if ((MixedSupport022.mixedSupport057State0002 != this.mixedSupport057State0001) &&
            (frameRemainderLocal4 = (this.mixedSupport057State0001 == MixedSupport112.mixedSupport057State0004))) {
            integerLocal1 = this.integerState0093 + 1;
            this.integerState0093 = this.integerState0093 + 1;
            if (integerLocal1 != this.integerState0094) {
              this.uiComponentPart010State0001.integerState0187 = (this.integerState0093 << 8) / this.integerState0094;
              frameRemainderLocal4 = (integerLocal3 != 0);
            }
            if (frameRemainderLocal4) {
              this.uiComponentPart010State0001.integerState0187 = 256;
              this.mixedSupport057State0001 = null;
              frameRemainderLocal4 = (integerLocal3 != 0);
            }
          }
          if (frameRemainderLocal4) {
            integerLocal2 = this.integerState0093 + 1;
            this.integerState0093 = this.integerState0093 + 1;
            if (integerLocal2 != this.integerState0092) {
              this.uiComponentPart010State0001.integerState0187 = -((this.integerState0093 << 8) / this.integerState0092) + 256;
              if (integerLocal3 != 0) {
                this.mixedSupport057State0001 = MixedSupport039.mixedSupport057State0003;
                this.performAction1761(12 + this.uiComponentState0001.integerState0107, this.integerState0090, this.integerState0089 + 12 + this.uiComponentState0001.integerState0108, 194);
                this.uiComponentPart010State0001.integerState0187 = 0;
                this.integerState0093 = 0;
              }
            } else {
              this.mixedSupport057State0001 = MixedSupport039.mixedSupport057State0003;
              this.performAction1761(12 + this.uiComponentState0001.integerState0107, this.integerState0090, this.integerState0089 + 12 + this.uiComponentState0001.integerState0108, 194);
              this.uiComponentPart010State0001.integerState0187 = 0;
              this.integerState0093 = 0;
            }
          }
        }
        return super.computeBoolean0182((byte) 47);
    }

    UiComponentPart004(UiComponentPart016 uiComponentPart016Argument1, UiComponent uiComponentArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        super(uiComponentPart016Argument1, uiComponentArgument2.integerState0107 + 12, 12 + (integerArgument3 + uiComponentArgument2.integerState0108));
        try {
          this.integerState0094 = integerArgument4;
          this.integerState0092 = integerArgument4;
          this.integerState0089 = integerArgument3;
          this.integerState0090 = integerArgument5;
          this.performAction0199(uiComponentArgument2, -29870);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ca.<init>(" + (uiComponentPart016Argument1 != null ? "{...}" : "null") + ',' + (uiComponentArgument2 != null ? "{...}" : "null") + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ')');
        }
    }

    final boolean computeBoolean0180(byte byteArgument1) {
        if (byteArgument1 <= 77) {
          this.mixedSupport057State0001 = (MixedSupport057) null;
        }
        this.performAction0203(-109);
        return super.computeBoolean0180((byte) 116);
    }

    static {
        stringState0065 = "Your ignore list is full. Max of 100 hit.";
    }
}
