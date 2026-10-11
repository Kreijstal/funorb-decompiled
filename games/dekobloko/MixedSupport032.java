/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport032 {
    private MixedSupport078 mixedSupport078State0001;
    static String stringState0157;
    private ResourceArchive resourceArchiveState0006;
    private ResourceArchive resourceArchiveState0007;

    public static void performAction0519(byte byteArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        try {
          if (byteArgument1 != 82) {
            MixedSupport032.performAction0519((byte) 15);
          }
          stringState0157 = null;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal3) {
          caughtExceptionLocal1 = caughtParameterLocal3;
          runtimeExceptionLocal2 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "em.F(" + byteArgument1 + ')');
        }
    }

    final static boolean computeBoolean0525(byte byteArgument1) {
        RuntimeException runtimeExceptionLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException caughtExceptionLocal3 = null;
        try {
          if (byteArgument1 < -107) {
            stackBooleanLocal2 = !(ThemeTips.mixedSupport124State0001.computeBoolean1767(80));
            return stackBooleanLocal2;
          }
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal4) {
          caughtExceptionLocal3 = caughtParameterLocal4;
          runtimeExceptionLocal1 = caughtExceptionLocal3;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal1), "em.B(" + byteArgument1 + ')');
        }
    }

    final static void performAction0521(int integerArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        try {
          MixedSupport005.uiComponentPart016State0001.performAction0948(true);
          if (NetworkSupport010.uiComponentPart026State0001 == null) {
            NetworkSupport010.uiComponentPart026State0001 = new UiComponentPart026(MixedSupport005.uiComponentPart016State0001, MixedSupport029.stringState0148);
          }
          if (integerArgument1 != -1199770620) {
            stringState0157 = (String) null;
          }
          MixedSupport005.uiComponentPart016State0001.performAction0945((byte) -119, NetworkSupport010.uiComponentPart026State0001);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal3) {
          caughtExceptionLocal1 = caughtParameterLocal3;
          runtimeExceptionLocal2 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "em.G(" + integerArgument1 + ')');
        }
    }

    final MixedSupport003 computeMixedSupport0030522(int integerArgument1, int integerArgument2) {
        MixedSupport003 mixedSupport003Local1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        byte[] byteArrayLocal3 = null;
        int integerLocal4 = 0;
        MixedSupport003 stackMixedSupport003Local5 = null;
        MixedSupport003 stackMixedSupport003Local6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        MixedSupport003 mixedSupport003Local8;
        try {
          mixedSupport003Local1 = (MixedSupport003) (this.mixedSupport078State0001.computeObject1046((long)integerArgument2, (byte) -30));
          if (null != mixedSupport003Local1) {
            stackMixedSupport003Local5 = mixedSupport003Local1;
            return stackMixedSupport003Local5;
          }
          integerLocal4 = 57 / ((integerArgument1 + 79) / 38);
          if (integerArgument2 < 32768) {
            byteArrayLocal3 = this.resourceArchiveState0007.computeByteArray0912(integerArgument2, 63, 0);
          }
          if (integerArgument2 >= 32768 ||
            DekoBlokoClient.obfuscationControl) {
            byteArrayLocal3 = this.resourceArchiveState0006.computeByteArray0912(32767 & integerArgument2, 49, 0);
          }
          mixedSupport003Local8 = new MixedSupport003();
          if (byteArrayLocal3 != null) {
            mixedSupport003Local8.performAction0039((byte) -4, new PacketBuffer(byteArrayLocal3));
          }
          if (integerArgument2 >= 32768) {
            mixedSupport003Local8.performAction0042(-1);
          }
          this.mixedSupport078State0001.performAction1048(mixedSupport003Local8, (long)integerArgument2, 69);
          stackMixedSupport003Local6 = mixedSupport003Local8;
          return stackMixedSupport003Local6;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal7 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "em.C(" + integerArgument1 + ',' + integerArgument2 + ')');
        }
    }

    final static void performAction0524(MixedSupport145 mixedSupport145Argument1, boolean booleanArgument2, int integerArgument3, byte byteArgument4, int integerArgument5) {
        byte cachedByteLocal1 = 0;
        boolean stackBooleanLocal2 = false;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        boolean stackOut_9_0;
        int integerLocal12 = 0;
        RuntimeException runtimeExceptionLocal13 = null;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        int integerLocal20 = 0;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        int integerLocal23 = 0;
        int integerLocal24 = 0;
        int integerLocal25 = 0;
        int integerLocal26 = 0;
        int integerLocal27 = 0;
        int stackIntegerLocal28;
        int stackIntegerLocal29;
        int integerLocal30;
        int integerLocal31;
        int integerLocal32;
        int integerLocal33;
        int integerLocal34;
        integerLocal27 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal12 = SceneWidgetPart010.computeInteger1667((byte) 127, (-integerArgument5 + integerArgument3) * 3);
          integerLocal14 = integerArgument5 * 3;
          integerLocal15 = integerLocal12 - 10;
          MixedSupport113.performAction1614(0);
          if (0 < mixedSupport145Argument1.byteState0004 &&
            null != mixedSupport145Argument1.byteArrayState0033) {
            MixedSupport018.performAction0272((byte) 127);
          }
          MixedSupport124.integerState0771 = 0;
          integerLocal16 = 0;
          boolean naturalLoopExitLocal35 = false;
          while (!(naturalLoopExitLocal35 = (!(mixedSupport145Argument1.shortState0001 > integerLocal16)))) {
            integerLocal17 = mixedSupport145Argument1.shortArrayState0002[integerLocal16];
            integerLocal18 = mixedSupport145Argument1.shortArrayState0015[integerLocal16];
            integerLocal19 = mixedSupport145Argument1.shortArrayState0008[integerLocal16];
            stackOut_9_0 = booleanArgument2;
            stackIntegerLocal6 = stackOut_9_0 ? 1 : 0;
            stackBooleanLocal2 = stackOut_9_0;
            if (integerLocal27 == 0) {
              if (stackBooleanLocal2) {
                integerLocal20 = MixedSupport075.integerArrayState0137[integerLocal17];
                integerLocal21 = MixedSupport116.integerArrayState0200[integerLocal17];
                integerLocal22 = -integerLocal20 + MixedSupport075.integerArrayState0137[integerLocal18];
                integerLocal23 = MixedSupport075.integerArrayState0137[integerLocal19] - integerLocal20;
                integerLocal24 = -integerLocal21 + MixedSupport116.integerArrayState0200[integerLocal18];
                integerLocal25 = MixedSupport116.integerArrayState0200[integerLocal19] - integerLocal21;
              }
              if (!stackBooleanLocal2 ||
                !(integerLocal25 * integerLocal22 - integerLocal23 * integerLocal24 >= 0)) {
                integerLocal33 = MixedSupport145.integerArrayState0248[integerLocal17];
                if (integerLocal33 != -2147483648) {
                  integerLocal34 = MixedSupport145.integerArrayState0248[integerLocal18];
                  if (integerLocal34 != -2147483648) {
                    integerLocal22 = MixedSupport145.integerArrayState0248[integerLocal19];
                    if (integerLocal22 != -2147483648) {
                      integerLocal23 = integerLocal22 + (integerLocal34 + integerLocal33) - integerLocal14;
                      if (0 > integerLocal15) {
                        stackIntegerLocal3 = integerLocal23 << -integerLocal15;
                      } else {
                        stackIntegerLocal3 = integerLocal23 >> integerLocal15;
                      }
                      integerLocal24 = -stackIntegerLocal3 + MixedSupport001.integerArrayState0001.length - 1;
                      integerLocal25 = MixedSupport001.integerArrayState0001[integerLocal24];
                      while (true) {
                        if (integerLocal25 >> 4 != 0) {
                          integerLocal24--;
                          stackIntegerLocal4 = ~integerLocal24;
                          stackIntegerLocal5 = -1;
                          if (stackIntegerLocal4 > stackIntegerLocal5) {
                            System.err.println("Out of range!");
                            break;
                          }
                          integerLocal25 = MixedSupport001.integerArrayState0001[integerLocal24];
                          continue;
                        }
                        stackIntegerLocal28 = integerLocal25;
                        stackIntegerLocal29 = integerLocal24 << 4;
                        integerLocal26 = stackIntegerLocal28 + stackIntegerLocal29;
                        SceneWidgetPart004.integerArrayState0053[integerLocal26] = integerLocal16;
                        MixedSupport001.integerArrayState0001[integerLocal24] = integerLocal25 + 1;
                        if (mixedSupport145Argument1.byteState0004 > 0 &&
                          mixedSupport145Argument1.byteArrayState0033 != null) {
                          cachedByteLocal1 = mixedSupport145Argument1.byteArrayState0033[integerLocal16];
                          SceneWidgetPart008.integerArrayState0170[cachedByteLocal1] = SceneWidgetPart008.integerArrayState0170[cachedByteLocal1] + 1;
                        }
                        MixedSupport124.integerState0771 = MixedSupport124.integerState0771 + 1;
                        break;
                      }
                    }
                  }
                }
              }
              integerLocal16++;
              continue;
            }
            break;
          }
          if (naturalLoopExitLocal35) {
            stackIntegerLocal6 = -1;
          }
          if (stackIntegerLocal6 > ~mixedSupport145Argument1.byteState0004 &&
            null != mixedSupport145Argument1.byteArrayState0033) {
            integerLocal30 = 0;
            integerLocal31 = 0;
            while (!(SceneWidgetPart008.integerArrayState0170.length <= integerLocal31)) {
              integerLocal32 = SceneWidgetPart008.integerArrayState0170[integerLocal31];
              SceneWidgetPart008.integerArrayState0170[integerLocal31] = integerLocal30;
              integerLocal30 = integerLocal30 + integerLocal32;
              integerLocal31++;
              if (integerLocal27 != 0) {
                return;
              }
            }
          }
          if (byteArgument4 < 44) {
            stringState0157 = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal36) {
          caughtExceptionLocal10 = caughtParameterLocal36;
          runtimeExceptionLocal13 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal13;
          stackStringBuilderLocal8 = new StringBuilder().append("em.A(");
          if (mixedSupport145Argument1 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(booleanArgument2).append(',').append(integerArgument3).append(',').append(byteArgument4).append(',').append(integerArgument5).append(')').toString());
        }
    }

    final static int[] computeIntegerArray0523(int integerArgument1, int integerArgument2, byte byteArgument3) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int[] stackIntegerArrayLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        try {
          if (byteArgument3 != 90) {
            MixedSupport032.computeIntegerArray0523(107, 61, (byte) -72);
          }
          integerLocal1 = MixedSupport121.computeInteger1720(integerArgument2, -104);
          integerLocal3 = MixedSupport135.computeInteger1854(integerArgument2, 92);
          integerLocal4 = MixedSupport121.computeInteger1720(integerArgument1, -122);
          integerLocal5 = MixedSupport135.computeInteger1854(integerArgument1, -63);
          integerLocal6 = (int)((long)integerLocal4 * (long)integerLocal1 >> 16);
          integerLocal7 = (int)((long)integerLocal5 * (long)integerLocal1 >> 16);
          integerLocal8 = (int)((long)integerLocal4 * (long)integerLocal3 >> 16);
          integerLocal9 = (int)((long)integerLocal5 * (long)integerLocal3 >> 16);
          stackIntegerArrayLocal10 = new int[]{0, 0, 0, integerLocal5, 0, integerLocal4, integerLocal6, integerLocal3, -integerLocal7, -integerLocal8, integerLocal1, integerLocal9};
          return stackIntegerArrayLocal10;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeExceptionLocal2 = caughtExceptionLocal11;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "em.E(" + integerArgument1 + ',' + integerArgument2 + ',' + byteArgument3 + ')');
        }
    }

    final static void performAction0520(byte byteArgument1, ResourceArchive resourceArchiveArgument2) {
        RuntimeException runtimeException = null;
        RgbSprite rgbSpriteLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          rgbSpriteLocal2 = new RgbSprite(resourceArchiveArgument2.computeByteArray0916(0, "", "final_frame.jpg"), (java.awt.Component) ((Object) GameDomainSupport004.canvasState0001));
          integerLocal3 = rgbSpriteLocal2.integerState0258;
          integerLocal4 = rgbSpriteLocal2.integerState0255;
          IterableNodeCollection.performAction1876(-9074);
          CodecSupport003.rgbSpriteState0051 = new RgbSprite(integerLocal3, 3 * integerLocal4 / 4);
          CodecSupport003.rgbSpriteState0051.performAction0278();
          rgbSpriteLocal2.performAction0312(0, 0);
          MixedSupport110.rgbSpriteState0046 = new RgbSprite(integerLocal3, -CodecSupport003.rgbSpriteState0051.integerState0255 + integerLocal4);
          MixedSupport110.rgbSpriteState0046.performAction0278();
          rgbSpriteLocal2.performAction0312(0, -CodecSupport003.rgbSpriteState0051.integerState0255);
          if (byteArgument1 != -113) {
            MixedSupport032.computeIntegerArray0523(16, 35, (byte) 0);
          }
          MixedSupport110.rgbSpriteState0046.integerState0256 = CodecSupport003.rgbSpriteState0051.integerState0255;
          MixedSupport086.performAction1200((byte) -5);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeException = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeException;
          stackStringBuilderLocal6 = new StringBuilder().append("em.D(").append(byteArgument1).append(',');
          if (resourceArchiveArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    MixedSupport032(int integerArgument1, ResourceArchive resourceArchiveArgument2, ResourceArchive resourceArchiveArgument3) {
        RuntimeException runtimeException = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        this.mixedSupport078State0001 = new MixedSupport078(64);
        try {
          this.resourceArchiveState0006 = resourceArchiveArgument3;
          this.resourceArchiveState0007 = resourceArchiveArgument2;
          if (null != this.resourceArchiveState0007) {
            this.resourceArchiveState0007.computeInteger0925(-5228, 0);
          }
          if (this.resourceArchiveState0006 != null) {
            this.resourceArchiveState0006.computeInteger0925(-5228, 0);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeException = caughtExceptionLocal7;
          stackRuntimeExceptionLocal2 = runtimeException;
          stackStringBuilderLocal3 = new StringBuilder().append("em.<init>(").append(integerArgument1).append(',');
          if (resourceArchiveArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          stackStringBuilderLocal5 = ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',');
          if (resourceArchiveArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    static {
        stringState0157 = "<%0> has withdrawn the request to join.";
    }
}
