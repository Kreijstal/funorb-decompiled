/*
 * Decompiled by CFR-JS 0.4.0.
 */
class MixedSupport001 implements CallbackContract004, CallbackContract012 {
    int integerState0001;
    int integerState0002;
    static int[] integerArrayState0001;
    BitmapFont bitmapFontState0001;
    int integerState0003;
    int integerState0004;
    static String stringState0001;
    static RenderingSupport010 renderingSupport010State0001;
    static int[] integerArrayState0002;
    private int integerState0005;
    int integerState0006;
    int integerState0007;
    int integerState0008;
    static int[] integerArrayState0003;
    int integerState0009;
    private boolean booleanState0001;
    int integerState0010;
    static int integerState0011;
    int integerState0012;
    private static long[] longArrayState0001;
    static int integerState0013;
    static String stringState0002;
    static RgbSprite[] rgbSpriteArrayState0001;
    static String stringState0003;
    static RgbSprite rgbSpriteState0001;
    static int integerState0014;

    private final int computeInteger0024(UiComponent uiComponentArgument1, byte byteArgument2) {
        int discarded$1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        UiComponent uiComponentLocal3 = null;
        int stackIntegerLocal4 = 0;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (byteArgument2 >= -124) {
            uiComponentLocal3 = (UiComponent) null;
            discarded$1 = this.computeInteger0023((UiComponent) null, 125, -17, 115);
          }
          stackIntegerLocal4 = uiComponentArgument1.integerState0108 - (this.integerState0003 + this.integerState0010);
          return stackIntegerLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("a.AA(");
          if (uiComponentArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(byteArgument2).append(')').toString());
        }
    }

    public final int computeInteger0013(UiComponent uiComponentArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int stackIntegerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          this.computeTextLayout0012(uiComponentArgument1, (byte) 83);
          integerLocal1 = -78 / ((-85 - integerArgument2) / 36);
          stackIntegerLocal3 = uiComponentArgument1.textLayoutState0001.computeInteger0258(-1) + this.integerState0003 + this.integerState0010;
          return stackIntegerLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("a.GA(");
          if (uiComponentArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(')').toString());
        }
    }

    public final TextLayout computeTextLayout0012(UiComponent uiComponentArgument1, byte byteArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        UiComponent uiComponentLocal2 = null;
        TextLayout stackTextLayoutLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (null == uiComponentArgument1.textLayoutState0001) {
            uiComponentArgument1.textLayoutState0001 = (TextLayout) ((Object) new RichTextLayout());
          }
          if (this.booleanState0001) {
            ((RichTextLayout) (uiComponentArgument1.textLayoutState0001)).performAction0433(this.computeString0021(uiComponentArgument1, (byte) 121), this.integerState0004, this.bitmapFontState0001, this.computeInteger0019(false, uiComponentArgument1), this.computeInteger0024(uiComponentArgument1, (byte) -128), this.integerState0009, 86, this.integerState0006);
          } else {
            this.performAction0025(uiComponentArgument1, 18580);
          }
          if (byteArgument2 < 38) {
            uiComponentLocal2 = (UiComponent) null;
            this.computeInteger0002((byte) -75, (UiComponent) null, 115);
          }
          stackTextLayoutLocal3 = uiComponentArgument1.textLayoutState0001;
          return stackTextLayoutLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal1 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("a.T(");
          if (uiComponentArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(byteArgument2).append(')').toString());
        }
    }

    MixedSupport001(BitmapFont bitmapFontArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8) {
        this(bitmapFontArgument1, integerArgument2, integerArgument2, integerArgument3, integerArgument3, integerArgument4, integerArgument5, integerArgument6, integerArgument7, integerArgument8, -1, 2147483647, false);
    }

    private final int computeInteger0023(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (integerArgument3 >= 72) {
            stackIntegerLocal3 = integerArgument2 + (this.integerState0008 + (uiComponentArgument1.integerState0110 + integerArgument4)) + uiComponentArgument1.integerState0103;
            return stackIntegerLocal3;
          }
          stackIntegerLocal2 = -124;
          return stackIntegerLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal1 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("a.N(");
          if (uiComponentArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    public final void performAction0015(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        TextLineMetrics textLineMetricsLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        TextLayout textLayoutLocal7 = null;
        TextLayout textLayoutLocal8 = null;
        int stackIntegerLocal9 = 0;
        int stackIntegerLocal10 = 0;
        int stackIntegerLocal11 = 0;
        int stackIntegerLocal12;
        RuntimeException stackRuntimeExceptionLocal13 = null;
        StringBuilder stackStringBuilderLocal14 = null;
        String stackStringLocal15 = null;
        RuntimeException caughtExceptionLocal16 = null;
        RuntimeException runtimeExceptionLocal17 = null;
        try {
          if (uiComponentArgument1.computeBoolean0239(true)) {
            textLayoutLocal7 = this.computeTextLayout0012(uiComponentArgument1, (byte) 53);
            textLayoutLocal8 = textLayoutLocal7;
            integerLocal1 = textLayoutLocal8.computeInteger0256(false, integerArgument2);
            textLineMetricsLocal2 = textLayoutLocal7.lines[integerLocal1];
            integerLocal3 = textLayoutLocal8.computeInteger0249((byte) -94, integerArgument2);
            integerLocal4 = this.computeInteger0023(uiComponentArgument1, integerLocal3, integerArgument3 + 110, integerArgument4);
            integerLocal5 = this.computeInteger0006(integerArgument5, 0, uiComponentArgument1) + Math.max(0, textLineMetricsLocal2.topY);
            stackIntegerLocal9 = this.computeInteger0006(integerArgument5, 0, uiComponentArgument1);
            stackIntegerLocal10 = this.computeInteger0024(uiComponentArgument1, (byte) -128);
            stackIntegerLocal11 = textLineMetricsLocal2.bottomY;
            if (textLayoutLocal8.lines.length > 1 + integerLocal1) {
              stackIntegerLocal12 = textLayoutLocal7.lines[integerLocal1 + 1].topY;
            } else {
              stackIntegerLocal12 = textLineMetricsLocal2.bottomY;
            }
            integerLocal6 = stackIntegerLocal9 + Math.min(stackIntegerLocal10, Math.min(stackIntegerLocal11, stackIntegerLocal12));
            RenderingSupport004.performAction0640(integerArgument5 + uiComponentArgument1.integerState0104, 20763, uiComponentArgument1.integerState0110 + (integerArgument4 + uiComponentArgument1.integerState0107), uiComponentArgument1.integerState0110 + integerArgument4, uiComponentArgument1.integerState0104 + integerArgument5 + uiComponentArgument1.integerState0108);
            RenderingSupport001.networkSupport002State0001.performAction0192(integerLocal4, integerLocal5, integerLocal4, this.integerState0012, (byte) 64, integerLocal6);
            MixedSupport086.performAction1200((byte) -5);
          }
          if (integerArgument3 != 1) {
            this.integerState0007 = -31;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal18) {
          caughtExceptionLocal16 = caughtParameterLocal18;
          runtimeExceptionLocal17 = caughtExceptionLocal16;
          stackRuntimeExceptionLocal13 = runtimeExceptionLocal17;
          stackStringBuilderLocal14 = new StringBuilder().append("a.BA(");
          if (uiComponentArgument1 == null) {
            stackStringLocal15 = "null";
          } else {
            stackStringLocal15 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal13), ((StringBuilder) (Object) stackStringBuilderLocal14).append(stackStringLocal15).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(')').toString());
        }
    }

    public void performAction0018(boolean booleanArgument1, int integerArgument2, int integerArgument3, byte byteArgument4, UiComponent uiComponentArgument5) {
        int discarded$0 = 0;
        if (byteArgument4 >= -60) {
          UiComponent uiComponentLocal2 = (UiComponent) null;
          discarded$0 = this.computeInteger0023((UiComponent) null, 118, -123, 71);
        }
        if (null == this.bitmapFontState0001) {
          return;
        }
        try {
          this.performAction0010(integerArgument3, uiComponentArgument5, (byte) -102, integerArgument2);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "a.B(" + booleanArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + byteArgument4 + ',' + (uiComponentArgument5 != null ? "{...}" : "null") + ')');
        }
    }

    public final int computeInteger0022(UiComponent uiComponentArgument1, int integerArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        int stackIntegerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          this.computeTextLayout0012(uiComponentArgument1, (byte) 60);
          if (integerArgument2 != 0) {
            this.bitmapFontState0001 = (BitmapFont) null;
          }
          stackIntegerLocal2 = uiComponentArgument1.textLayoutState0001.computeInteger0255(false) + this.integerState0008 + this.integerState0001;
          return stackIntegerLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("a.L(");
          if (uiComponentArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(')').toString());
        }
    }

    final static void performAction0011(int integerArgument1, boolean booleanArgument2, boolean booleanArgument3) {
        MixedSupport104 mixedSupport104Local1 = null;
        String stringLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        SceneWidgetPart014 sceneWidgetPart014Local5 = ComponentDecorator.computeSceneWidgetPart0141139(integerArgument1, booleanArgument2, (byte) 99);
        MixedSupport104 mixedSupport104Local6;
        if (sceneWidgetPart014Local5 != null) {
          SceneWidget.mixedSupport104State0001.performAction1410(false, 29072);
          mixedSupport104Local1 = SceneWidget.mixedSupport104State0001;
          stringLocal2 = MixedSupport042.stringState0184;
          mixedSupport104Local1.sceneWidgetPart002State0002.performAction0620(stringLocal2, 5, 68);
          mixedSupport104Local6 = SceneWidget.mixedSupport104State0001;
          integerLocal3 = UiComponentPart013.integerState0276;
          integerLocal4 = TextLineMetrics.integerState0535;
          mixedSupport104Local6.sceneWidgetPart002State0002.performAction0621(integerLocal4, integerLocal3, 63, 0, 0);
        }
        UiComponentPart013.performAction0694(booleanArgument3, booleanArgument2, integerArgument1);
    }

    final static void performAction0017(String stringArgument1, boolean booleanArgument2, java.applet.Applet appletArgument3) {
        try {
          String stringLocal1 = null;
          String stringLocal2 = null;
          String stringLocal3 = null;
          String stringLocal4 = null;
          RuntimeException stackRuntimeExceptionLocal5 = null;
          StringBuilder stackStringBuilderLocal6 = null;
          String stackStringLocal7 = null;
          StringBuilder stackStringBuilderLocal8 = null;
          String stackStringLocal9 = null;
          Throwable caughtExceptionLocal10 = null;
          Throwable throwableLocal11 = null;
          RuntimeException runtimeExceptionLocal12 = null;
          String stringLocal13;
          String stringLocal14;
          String stringLocal15;
          String stringLocal16;
          String stringLocal17;
          String stringLocal18;
          try {
            MixedSupport112.stringState0462 = stringArgument1;
            try {
              stringLocal3 = appletArgument3.getParameter("cookieprefix");
              stringLocal2 = stringLocal3;
              stringLocal13 = stringLocal3;
              stringLocal1 = appletArgument3.getParameter("cookiehost");
              stringLocal14 = stringLocal1;
              stringLocal15 = stringLocal1;
              if (booleanArgument2) {
                return;
              }
              stringLocal4 = stringLocal3 + "settings=" + stringArgument1 + "; version=1; path=/; domain=" + stringLocal1;
              stringLocal16 = stringLocal4;
              stringLocal17 = stringLocal4;
              if (stringArgument1.length() == 0) {
                stringLocal18 = stringLocal4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              } else {
                stringLocal18 = stringLocal4 + "; Expires=" + CipherPacketBuffer.computeString1856((byte) 60, MixedSupport063.computeLong0827(4) + 94608000000L) + "; Max-Age=" + 94608000L;
              }
              MixedSupport088.performAction1240((byte) -51, appletArgument3, "document.cookie=\"" + stringLocal18 + "\"");
            } catch (java.lang.Throwable caughtParameterLocal19) {
              caughtExceptionLocal10 = caughtParameterLocal19;
              throwableLocal11 = caughtExceptionLocal10;
            }
            NetworkSupport007.performAction1166((byte) 127, appletArgument3);
            return;
          } catch (java.lang.RuntimeException caughtParameterLocal20) {
            caughtExceptionLocal10 = caughtParameterLocal20;
            runtimeExceptionLocal12 = (RuntimeException) (Object) caughtExceptionLocal10;
            stackRuntimeExceptionLocal5 = runtimeExceptionLocal12;
            stackStringBuilderLocal6 = new StringBuilder().append("a.EA(");
            if (stringArgument1 == null) {
              stackStringLocal7 = "null";
            } else {
              stackStringLocal7 = "{...}";
            }
            stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(booleanArgument2).append(',');
            if (appletArgument3 == null) {
              stackStringLocal9 = "null";
            } else {
              stackStringLocal9 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal21) {
          throw uncheckedExceptionLocal21;
        } catch (Throwable checkedExceptionLocal22) {
          throw new RuntimeException(checkedExceptionLocal22);
        }
    }

    public final int computeInteger0019(boolean booleanArgument1, UiComponent uiComponentArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        int stackIntegerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (booleanArgument1) {
            this.computeInteger0001((byte) 94);
          }
          stackIntegerLocal2 = uiComponentArgument2.integerState0107 - this.integerState0008 - this.integerState0001;
          return stackIntegerLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("a.DA(").append(booleanArgument1).append(',');
          if (uiComponentArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    public final int computeInteger0002(byte byteArgument1, UiComponent uiComponentArgument2, int integerArgument3) {
        int discarded$1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        UiComponent uiComponentLocal3 = null;
        int stackIntegerLocal4 = 0;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (byteArgument1 <= 6) {
            uiComponentLocal3 = (UiComponent) null;
            discarded$1 = this.computeInteger0024((UiComponent) null, (byte) -126);
          }
          stackIntegerLocal4 = this.computeInteger0023(uiComponentArgument2, 0, 97, integerArgument3);
          return stackIntegerLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("a.S(").append(byteArgument1).append(',');
          if (uiComponentArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument3).append(')').toString());
        }
    }

    public final void performAction0004(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, UiComponent uiComponentArgument6) {
        int integerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        RuntimeException runtimeExceptionLocal8 = null;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        TextLineMetrics textLineMetricsLocal13 = null;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        TextLayout textLayoutLocal17 = null;
        TextLayout textLayoutLocal18 = null;
        integerLocal16 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument2 == integerArgument1) {
            return;
          }
          if (uiComponentArgument6.computeBoolean0239(true)) {
            textLayoutLocal17 = this.computeTextLayout0012(uiComponentArgument6, (byte) 100);
            textLayoutLocal18 = textLayoutLocal17;
            if (integerArgument1 < integerArgument2) {
              integerLocal10 = integerArgument2;
              integerLocal9 = integerArgument1;
            } else {
              integerLocal10 = integerArgument1;
              integerLocal9 = integerArgument2;
            }
            integerLocal11 = textLayoutLocal18.computeInteger0256(false, integerLocal9);
            integerLocal12 = textLayoutLocal18.computeInteger0256(false, integerLocal10);
            RenderingSupport004.performAction0640(integerArgument3 + uiComponentArgument6.integerState0104, 20763, uiComponentArgument6.integerState0107 + integerArgument4 + uiComponentArgument6.integerState0110, uiComponentArgument6.integerState0110 + integerArgument4, integerArgument3 + (uiComponentArgument6.integerState0104 + uiComponentArgument6.integerState0108));
            for (integerLocal1 = integerLocal11; integerLocal1 <= integerLocal12; integerLocal1++) {
              textLineMetricsLocal13 = textLayoutLocal17.lines[integerLocal1];
              if (integerLocal1 == integerLocal11) {
                stackIntegerLocal2 = textLayoutLocal18.computeInteger0249((byte) -94, integerLocal9);
              } else {
                stackIntegerLocal2 = textLineMetricsLocal13.characterXPositions[0];
              }
              integerLocal14 = stackIntegerLocal2;
              if (integerLocal1 != integerLocal12) {
                if (textLineMetricsLocal13 != null) {
                  stackIntegerLocal3 = textLineMetricsLocal13.characterXPositions[-1 + textLineMetricsLocal13.characterXPositions.length];
                } else {
                  stackIntegerLocal3 = 0;
                }
              } else {
                stackIntegerLocal3 = textLayoutLocal18.computeInteger0249((byte) -94, integerLocal10);
              }
              integerLocal15 = stackIntegerLocal3;
              RenderingSupport001.networkSupport002State0001.performAction0189((byte) -115, textLineMetricsLocal13.topY + uiComponentArgument6.integerState0105 + (integerArgument3 - (-uiComponentArgument6.integerState0104 - this.integerState0003)), this.integerState0007 >>> 24, -integerLocal14 + integerLocal15, textLineMetricsLocal13.bottomY, this.integerState0007, this.computeInteger0023(uiComponentArgument6, integerLocal14, 96, integerArgument4));
            }
            MixedSupport086.performAction1200((byte) -5);
          }
          if (integerArgument5 > -89) {
            this.integerState0001 = -114;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal19) {
          caughtExceptionLocal7 = caughtParameterLocal19;
          runtimeExceptionLocal8 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal8;
          stackStringBuilderLocal5 = new StringBuilder().append("a.W(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',');
          if (uiComponentArgument6 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    private final int computeInteger0014(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        int stackIntegerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (integerArgument2 != 20881) {
            this.integerState0012 = 65;
          }
          stackIntegerLocal2 = integerArgument3 + (this.integerState0003 + (uiComponentArgument1.integerState0104 + integerArgument4)) + uiComponentArgument1.integerState0105;
          return stackIntegerLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("a.J(");
          if (uiComponentArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    private final void performAction0025(UiComponent uiComponentArgument1, int integerArgument2) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        MixedSupport001 mixedSupport001Local11 = null;
        int integerLocal12;
        integerLocal10 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (null == uiComponentArgument1.textLayoutState0001) {
            uiComponentArgument1.textLayoutState0001 = (TextLayout) ((Object) new RichTextLayout());
          }
          integerLocal5 = this.computeInteger0019(false, uiComponentArgument1);
          integerLocal7 = this.computeInteger0024(uiComponentArgument1, (byte) -127);
          if (integerArgument2 != 18580) {
            mixedSupport001Local11 = (MixedSupport001) null;
            this.performAction0009(-13, (MixedSupport001) null);
          }
          integerLocal9 = this.integerState0004;
          if (integerLocal9 != 0) {
            if (integerLocal9 == 2) {
              integerLocal8 = -this.bitmapFontState0001.integerState0523 + integerLocal7;
            } else {
              if (integerLocal9 != 3 &&
                integerLocal9 != 1) {
              }
              integerLocal8 = (-this.bitmapFontState0001.integerState0523 + integerLocal7 - this.bitmapFontState0001.integerState0518 >> 1) + this.bitmapFontState0001.integerState0518;
            }
          } else {
            integerLocal8 = this.bitmapFontState0001.integerState0518;
          }
          integerLocal12 = this.integerState0009;
          if (integerLocal12 != 0 &&
            integerLocal12 != 3) {
            if (integerLocal12 == 1) {
              if (!(uiComponentArgument1.textLayoutState0001 instanceof RichTextLayout)) {
                return;
              }
              ((RichTextLayout) (uiComponentArgument1.textLayoutState0001)).performAction0429(integerLocal8, integerLocal5 >> 1, this.computeString0021(uiComponentArgument1, (byte) 116), (byte) 8, this.bitmapFontState0001);
              return;
            }
            if (2 != integerLocal12) {
              return;
            }
            if (!(uiComponentArgument1.textLayoutState0001 instanceof RichTextLayout)) {
              return;
            }
            ((RichTextLayout) (uiComponentArgument1.textLayoutState0001)).performAction0431(integerArgument2 ^ 18580, this.bitmapFontState0001, integerLocal5, integerLocal8, this.computeString0021(uiComponentArgument1, (byte) 122));
            return;
          }
          if (uiComponentArgument1.textLayoutState0001 instanceof RichTextLayout) {
            ((RichTextLayout) (uiComponentArgument1.textLayoutState0001)).performAction0432(0, this.bitmapFontState0001, this.computeString0021(uiComponentArgument1, (byte) 127), integerLocal8, 25);
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal4 = caughtParameterLocal13;
          runtimeExceptionLocal6 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal6;
          stackStringBuilderLocal2 = new StringBuilder().append("a.Q(");
          if (uiComponentArgument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(integerArgument2).append(')').toString());
        }
    }

    String computeString0021(UiComponent uiComponentArgument1, byte byteArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          integerLocal1 = -9 % ((byteArgument2 - 59) / 53);
          stackStringLocal3 = uiComponentArgument1.stringState0078;
          return stackStringLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("a.D(");
          if (uiComponentArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(byteArgument2).append(')').toString());
        }
    }

    private final void performAction0005(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, UiComponent uiComponentArgument5, boolean booleanArgument6, int integerArgument7, int integerArgument8) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11;
        integerLocal10 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          RenderingSupport004.performAction0640(uiComponentArgument5.integerState0104 + integerArgument8, 20763, uiComponentArgument5.integerState0107 + (uiComponentArgument5.integerState0110 + integerArgument4), integerArgument4 + uiComponentArgument5.integerState0110, integerArgument8 + uiComponentArgument5.integerState0104 + uiComponentArgument5.integerState0108);
          if (!booleanArgument6) {
            return;
          }
          boolean frameRemainderLocal12 = true;
          integerLocal5 = this.computeInteger0019(false, uiComponentArgument5);
          integerLocal7 = this.computeInteger0024(uiComponentArgument5, (byte) -125);
          if (this.booleanState0001) {
            this.bitmapFontState0001.computeInteger1213(this.computeString0021(uiComponentArgument5, (byte) -36), this.computeInteger0023(uiComponentArgument5, integerArgument1, 74, integerArgument4), this.computeInteger0014(uiComponentArgument5, 20881, integerArgument7, integerArgument8), integerLocal5, integerLocal7, integerArgument2, integerArgument3, this.integerState0009, this.integerState0004, this.integerState0006);
          } else {
            integerLocal9 = this.integerState0004;
            if (integerLocal9 == 0) {
              integerLocal8 = this.bitmapFontState0001.integerState0518;
            } else {
              if (2 != integerLocal9) {
                if (integerLocal9 != 3 &&
                  integerLocal9 != 1) {
                }
                integerLocal8 = (-this.bitmapFontState0001.integerState0518 + integerLocal7 - this.bitmapFontState0001.integerState0523 >> 1) + this.bitmapFontState0001.integerState0518;
              } else {
                integerLocal8 = -this.bitmapFontState0001.integerState0523 + integerLocal7;
              }
            }
            integerLocal11 = this.integerState0009;
            if (0 != integerLocal11 &&
              integerLocal11 != 3) {
              if (integerLocal11 == 1) {
                this.bitmapFontState0001.performAction1224(this.computeString0021(uiComponentArgument5, (byte) -67), this.computeInteger0023(uiComponentArgument5, integerArgument1, 122, integerArgument4) + (integerLocal5 >> 1), integerLocal8 + this.computeInteger0014(uiComponentArgument5, 20881, integerArgument7, integerArgument8), integerArgument2, integerArgument3);
              } else {
                if ((integerLocal11 == 2)) {
                  this.bitmapFontState0001.performAction1228(this.computeString0021(uiComponentArgument5, (byte) 123), integerLocal5 + this.computeInteger0023(uiComponentArgument5, integerArgument1, 78, integerArgument4), this.computeInteger0014(uiComponentArgument5, 20881, integerArgument7, integerArgument8) + integerLocal8, integerArgument2, integerArgument3);
                }
              }
              frameRemainderLocal12 = false;
            }
            else {
              this.bitmapFontState0001.performAction1211(this.computeString0021(uiComponentArgument5, (byte) -50), this.computeInteger0023(uiComponentArgument5, integerArgument1, 81, integerArgument4), integerLocal8 + this.computeInteger0014(uiComponentArgument5, 20881, integerArgument7, integerArgument8), integerArgument2, integerArgument3);
            }
          }
          MixedSupport086.performAction1200((byte) -5);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal4 = caughtParameterLocal13;
          runtimeExceptionLocal6 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal6;
          stackStringBuilderLocal2 = new StringBuilder().append("a.R(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',');
          if (uiComponentArgument5 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(booleanArgument6).append(',').append(integerArgument7).append(',').append(integerArgument8).append(')').toString());
        }
    }

    final static String computeString0016(java.applet.Applet appletArgument1, byte byteArgument2) {
        try {
          int integerLocal1 = 0;
          String stringLocal2 = null;
          String stringLocal3 = null;
          String[] stringArrayLocal4 = null;
          int integerLocal5 = 0;
          int integerLocal6 = 0;
          java.applet.Applet appletLocal7 = null;
          String stringLocal8 = null;
          String stackStringLocal9 = null;
          String stackStringLocal10 = null;
          String stackStringLocal11 = null;
          RuntimeException stackRuntimeExceptionLocal12 = null;
          StringBuilder stackStringBuilderLocal13 = null;
          String stackStringLocal14 = null;
          Throwable caughtExceptionLocal15 = null;
          Throwable throwableLocal16 = null;
          RuntimeException runtimeExceptionLocal17 = null;
          integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          try {
            try {
              if (byteArgument2 <= 110) {
                appletLocal7 = (java.applet.Applet) null;
                MixedSupport001.performAction0017((String) null, false, (java.applet.Applet) null);
              }
              stringLocal8 = appletArgument1.getParameter("cookieprefix");
              stringLocal2 = stringLocal8 + "settings";
              stringLocal3 = (String) (MixedSupport088.computeObject1242(true, "getcookies", appletArgument1));
              stringArrayLocal4 = ResourceArchive.computeStringArray0907(';', (byte) 66, stringLocal3);
              for (integerLocal1 = 0; stringArrayLocal4.length > integerLocal1; integerLocal1++) {
                integerLocal5 = stringArrayLocal4[integerLocal1].indexOf('=');
                if (integerLocal5 >= 0 &&
                  stringArrayLocal4[integerLocal1].substring(0, integerLocal5).trim().equals(stringLocal2)) {
                  stackStringLocal9 = stringArrayLocal4[integerLocal1].substring(integerLocal5 + 1).trim();
                  return stackStringLocal9;
                }
              }
            } catch (java.lang.Throwable caughtParameterLocal18) {
              caughtExceptionLocal15 = caughtParameterLocal18;
              throwableLocal16 = caughtExceptionLocal15;
            }
            if (null == MixedSupport112.stringState0462) {
              stackStringLocal11 = appletArgument1.getParameter("settings");
              return stackStringLocal11;
            }
            stackStringLocal10 = MixedSupport112.stringState0462;
            return stackStringLocal10;
          } catch (java.lang.RuntimeException caughtParameterLocal19) {
            caughtExceptionLocal15 = caughtParameterLocal19;
            runtimeExceptionLocal17 = (RuntimeException) (Object) caughtExceptionLocal15;
            stackRuntimeExceptionLocal12 = runtimeExceptionLocal17;
            stackStringBuilderLocal13 = new StringBuilder().append("a.K(");
            if (appletArgument1 == null) {
              stackStringLocal14 = "null";
            } else {
              stackStringLocal14 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal12), ((StringBuilder) (Object) stackStringBuilderLocal13).append(stackStringLocal14).append(',').append(byteArgument2).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal20) {
          throw uncheckedExceptionLocal20;
        } catch (Throwable checkedExceptionLocal21) {
          throw new RuntimeException(checkedExceptionLocal21);
        }
    }

    public static void performAction0003(int integerArgument1) {
        if (integerArgument1 != -1) {
          return;
        }
        stringState0001 = null;
        stringState0003 = null;
        stringState0002 = null;
        rgbSpriteArrayState0001 = null;
        longArrayState0001 = null;
        integerArrayState0002 = null;
        integerArrayState0001 = null;
        integerArrayState0003 = null;
        renderingSupport010State0001 = null;
        rgbSpriteState0001 = null;
    }

    public final int computeInteger0001(byte byteArgument1) {
        if (byteArgument1 > -4) {
          return -27;
        }
        return this.bitmapFontState0001.integerState0523 + this.bitmapFontState0001.integerState0518;
    }

    private final void performAction0010(int integerArgument1, UiComponent uiComponentArgument2, byte byteArgument3, int integerArgument4) {
        try {
          if (byteArgument3 >= -1) {
            UiComponent uiComponentLocal1 = (UiComponent) null;
            this.performAction0025((UiComponent) null, 109);
          }
          this.performAction0005(0, this.integerState0002, this.integerState0005, integerArgument4, uiComponentArgument2, true, 0, integerArgument1);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "a.M(" + integerArgument1 + ',' + (uiComponentArgument2 != null ? "{...}" : "null") + ',' + byteArgument3 + ',' + integerArgument4 + ')');
        }
    }

    public final int computeInteger0007(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        RuntimeException runtimeExceptionLocal1 = null;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (integerArgument2 != -257) {
            stackIntegerLocal2 = -101;
            return stackIntegerLocal2;
          }
          this.computeTextLayout0012(uiComponentArgument3, (byte) 46);
          stackIntegerLocal3 = uiComponentArgument3.textLayoutState0001.computeInteger0253(integerArgument6 - this.computeInteger0002((byte) 81, uiComponentArgument3, integerArgument1), integerArgument5 - this.computeInteger0006(integerArgument4, 0, uiComponentArgument3), integerArgument2 ^ 32172);
          return stackIntegerLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal1 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("a.CA(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(')').toString());
        }
    }

    final static IndexedSprite computeIndexedSprite0020(int integerArgument1) {
        IndexedSprite indexedSpriteLocal1 = new IndexedSprite(MixedSupport029.integerState0181, MixedSupport057.integerState0297, InputAdapter006.integerArrayState0206[0], MixedSupport039.integerArrayState0047[0], MixedSupport130.integerArrayState0208[0], MixedSupport052.integerArrayState0054[0], SceneWidgetPart011.byteArrayArrayState0008[integerArgument1], NetworkSupport006.integerArrayState0152);
        MixedSupport094.performAction1305(127);
        return indexedSpriteLocal1;
    }

    protected MixedSupport001() {
    }

    final static void performAction0008(int integerArgument1, int integerArgument2, RawSound rawSoundArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        try {
          integerLocal1 = (int)(0.5 + (double)(integerArgument5 * rawSoundArgument3.integerState0794) * Math.pow(2.0, 0.0008333333333333334 * (double)integerArgument1) / (double)PcmPlayer.integerState0209);
          CollectionSupport002.pcmStreamMixerState0001.performAction1192(rawSoundArgument3, integerLocal1, GameDomainSupport005.integerState0578 * integerArgument2, integerArgument4 << 6);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "a.O(" + integerArgument1 + ',' + integerArgument2 + ',' + (rawSoundArgument3 != null ? "{...}" : "null") + ',' + integerArgument4 + ',' + integerArgument5 + ')');
        }
    }

    MixedSupport001(BitmapFont bitmapFontArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, boolean booleanArgument13) {
        try {
          this.integerState0003 = integerArgument4;
          this.integerState0005 = integerArgument7;
          this.integerState0006 = integerArgument10;
          this.integerState0001 = integerArgument3;
          this.integerState0002 = integerArgument6;
          this.integerState0009 = integerArgument8;
          this.integerState0010 = integerArgument5;
          this.integerState0012 = integerArgument11;
          this.integerState0008 = integerArgument2;
          this.bitmapFontState0001 = bitmapFontArgument1;
          this.integerState0004 = integerArgument9;
          this.integerState0007 = integerArgument12;
          this.booleanState0001 = booleanArgument13 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "a.<init>(" + (bitmapFontArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ',' + integerArgument7 + ',' + integerArgument8 + ',' + integerArgument9 + ',' + integerArgument10 + ',' + integerArgument11 + ',' + integerArgument12 + ',' + booleanArgument13 + ')');
        }
    }

    final void performAction0009(int integerArgument1, MixedSupport001 mixedSupport001Argument2) {
        try {
          mixedSupport001Argument2.integerState0001 = this.integerState0001;
          mixedSupport001Argument2.integerState0005 = this.integerState0005;
          mixedSupport001Argument2.integerState0003 = this.integerState0003;
          mixedSupport001Argument2.integerState0002 = this.integerState0002;
          mixedSupport001Argument2.integerState0007 = this.integerState0007;
          if (integerArgument1 != -12253) {
            this.integerState0008 = -80;
          }
          mixedSupport001Argument2.integerState0008 = this.integerState0008;
          mixedSupport001Argument2.integerState0006 = this.integerState0006;
          mixedSupport001Argument2.integerState0004 = this.integerState0004;
          mixedSupport001Argument2.integerState0010 = this.integerState0010;
          mixedSupport001Argument2.integerState0009 = this.integerState0009;
          mixedSupport001Argument2.bitmapFontState0001 = this.bitmapFontState0001;
          mixedSupport001Argument2.booleanState0001 = this.booleanState0001;
          mixedSupport001Argument2.integerState0012 = this.integerState0012;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "a.U(" + integerArgument1 + ',' + (mixedSupport001Argument2 != null ? "{...}" : "null") + ')');
        }
    }

    public final int computeInteger0006(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3) {
        int discarded$1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        UiComponent uiComponentLocal3 = null;
        int stackIntegerLocal4 = 0;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (integerArgument2 != 0) {
            uiComponentLocal3 = (UiComponent) null;
            discarded$1 = this.computeInteger0024((UiComponent) null, (byte) 33);
          }
          stackIntegerLocal4 = this.computeInteger0014(uiComponentArgument3, 20881, 0, integerArgument1);
          return stackIntegerLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("a.HA(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    static {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3;
        int integerLocal4;
        long longLocal5;
        int integerLocal6;
        stringState0001 = "<%0><br>IS OUT!";
        integerArrayState0001 = new int[1024];
        integerState0011 = 128;
        integerArrayState0003 = new int[256];
        for (integerLocal1 = 0; integerLocal1 < 256; integerLocal1++) {
          integerLocal3 = integerLocal1;
          for (integerLocal4 = 0; integerLocal4 < 8; integerLocal4++) {
            if ((1 & integerLocal3) == 1) {
              integerLocal3 = -306674912 ^ integerLocal3 >>> 1;
            } else {
              integerLocal3 = integerLocal3 >>> 1;
            }
          }
          integerArrayState0003[integerLocal1] = integerLocal3;
        }
        longArrayState0001 = new long[256];
        stringState0002 = "Theme";
        stringState0003 = "Invite";
        for (integerLocal6 = 0; 256 > integerLocal6; integerLocal6++) {
          longLocal5 = (long)integerLocal6;
          for (integerLocal2 = 0; integerLocal2 < 8; integerLocal2++) {
            if ((longLocal5 & 1L) != 1L) {
              longLocal5 = longLocal5 >>> 1;
            } else {
              longLocal5 = longLocal5 >>> 1 ^ -3932672073523589310L;
            }
          }
          longArrayState0001[integerLocal6] = longLocal5;
        }
    }
}
