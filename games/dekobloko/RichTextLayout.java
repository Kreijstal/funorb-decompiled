/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RichTextLayout extends TextLayout {
    private boolean booleanState0030;
    private int integerState0156;
    static int integerState0157;
    private int integerState0158;
    static SceneWidget sceneWidgetState0020;
    static String stringState0133;
    private int integerState0159;
    private String stringState0134;
    static int integerState0160;
    static java.math.BigInteger bigIntegerState0001;
    static int integerState0161;
    static RgbSprite rgbSpriteState0015;
    static SceneWidget sceneWidgetState0021;
    private BitmapFont font;
    static int integerState0162;
    private int integerState0163;
    private int integerState0164;
    static String stringState0135;
    static String stringState0136;
    static MixedSupport016 mixedSupport016State0001;

    final void performAction0429(int integerArgument1, int integerArgument2, String stringArgument3, byte byteArgument4, BitmapFont bitmapFontArgument5) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        int integerLocal8 = 0;
        TextLineMetrics textLineMetricsLocal9 = null;
        try {
          if (stringArgument3 == null) {
            this.lines = null;
            return;
          }
          if (bitmapFontArgument5 == this.font &&
            this.booleanState0030 &&
            this.integerState0158 == 1 &&
            null != this.stringState0134 &&
            this.stringState0134.equals(stringArgument3)) {
            return;
          }
          this.font = bitmapFontArgument5;
          this.integerState0158 = 1;
          if (byteArgument4 != 8) {
            RichTextLayout.computeRgbSpriteArray0428(54, 119, -124, -51, 32, 28);
          }
          this.booleanState0030 = true;
          textLineMetricsLocal9 = this.computeTextLineMetrics0430(-95, integerArgument1, bitmapFontArgument5, stringArgument3);
          integerLocal8 = bitmapFontArgument5.computeInteger1208(stringArgument3);
          textLineMetricsLocal9.characterXPositions[0] = integerArgument2 - (integerLocal8 >> 1);
          textLineMetricsLocal9.characterXPositions[stringArgument3.length()] = integerArgument2 + (integerLocal8 >> 1);
          InputAdapter003.performAction0751(textLineMetricsLocal9, bitmapFontArgument5, 0, stringArgument3, byteArgument4 ^ -9);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal6 = caughtParameterLocal10;
          runtimeExceptionLocal7 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal7;
          stackStringBuilderLocal2 = new StringBuilder().append("ea.M(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (stringArgument3 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(byteArgument4).append(',');
          if (bitmapFontArgument5 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    final static boolean computeBoolean0436(byte byteArgument1) {
        if (byteArgument1 >= -23) {
          return false;
        }
        if (MixedSupport052.integerState0269 < 10) {
          return false;
        }
        if (!MixedSupport141.booleanState0194) {
          return !NodeHashTable.computeBoolean1711(-12851) ? true : false;
        }
        return false;
    }

    final static RgbSprite[] computeRgbSpriteArray0428(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        RgbSprite rgbSpriteLocal1 = null;
        RgbSprite rgbSpriteLocal2 = null;
        Object objectLocal3 = null;
        RgbSprite rgbSpriteLocal4 = null;
        int[] integerArrayLocal5 = SoftwareRaster.integerArrayState0063;
        int[] integerArrayLocal6 = integerArrayLocal5;
        int[] integerArrayLocal7 = integerArrayLocal6;
        int[] integerArrayLocal8 = integerArrayLocal7;
        int integerLocal9 = SoftwareRaster.integerState0285;
        int integerLocal10 = SoftwareRaster.integerState0284;
        RgbSprite rgbSpriteLocal11 = new RgbSprite(integerArgument3, integerArgument4 - integerArgument3 * 2);
        rgbSpriteLocal11.performAction0278();
        SoftwareRaster.performAction0739(0, 0, integerArgument3, integerArgument4 - 2 * integerArgument3, integerArgument6, integerArgument5);
        RgbSprite rgbSpriteLocal12 = new RgbSprite(integerArgument3, integerArgument3);
        rgbSpriteLocal12.performAction0278();
        SoftwareRaster.performAction0719(0, 0, integerArgument3, integerArgument3, integerArgument6);
        RgbSprite rgbSpriteLocal13 = new RgbSprite(16, integerArgument3);
        if (integerArgument2 == -20982) {
          rgbSpriteLocal13.performAction0278();
          SoftwareRaster.performAction0719(0, 0, 16, integerArgument3, integerArgument6);
          rgbSpriteLocal1 = new RgbSprite(integerArgument3, integerArgument3);
          rgbSpriteLocal1.performAction0278();
          SoftwareRaster.performAction0719(0, 0, integerArgument3, integerArgument3, integerArgument5);
          rgbSpriteLocal2 = new RgbSprite(16, integerArgument3);
          rgbSpriteLocal2.performAction0278();
          SoftwareRaster.performAction0719(0, 0, 16, integerArgument3, integerArgument5);
          objectLocal3 = null;
          if (integerArgument1 > 0) {
            rgbSpriteLocal4 = new RgbSprite(16, 16);
            objectLocal3 = rgbSpriteLocal4;
            rgbSpriteLocal4.performAction0278();
            SoftwareRaster.performAction0719(0, 0, 16, 16, integerArgument1);
          }
          SoftwareRaster.performAction0724(integerArrayLocal5, integerLocal9, integerLocal10);
          return new RgbSprite[]{rgbSpriteLocal12, rgbSpriteLocal13, rgbSpriteLocal12, rgbSpriteLocal11, (RgbSprite) (objectLocal3), rgbSpriteLocal11, rgbSpriteLocal1, rgbSpriteLocal2, rgbSpriteLocal1};
        }
        return (RgbSprite[]) null;
    }

    final void performAction0432(int integerArgument1, BitmapFont bitmapFontArgument2, String stringArgument3, int integerArgument4, int integerArgument5) {
        TextLineMetrics textLineMetricsLocal1 = null;
        TextLineMetrics textLineMetricsLocal2 = null;
        if (stringArgument3 == null) {
          this.lines = null;
          return;
        }
        if (integerArgument5 <= 11) {
          integerState0161 = -109;
        }
        if (bitmapFontArgument2 == this.font && this.booleanState0030 && this.integerState0158 == 0 && null != this.stringState0134 &&
          this.stringState0134.equals(stringArgument3)) {
          return;
        }
        try {
          this.booleanState0030 = true;
          this.font = bitmapFontArgument2;
          this.stringState0134 = stringArgument3;
          this.integerState0158 = 0;
          textLineMetricsLocal1 = this.computeTextLineMetrics0430(-27, integerArgument4, bitmapFontArgument2, stringArgument3);
          textLineMetricsLocal2 = textLineMetricsLocal1;
          textLineMetricsLocal1.characterXPositions[0] = integerArgument1;
          textLineMetricsLocal2.characterXPositions[stringArgument3.length()] = bitmapFontArgument2.computeInteger1208(stringArgument3) + integerArgument1;
          InputAdapter003.performAction0751(textLineMetricsLocal2, bitmapFontArgument2, 0, stringArgument3, -1);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ea.T(" + integerArgument1 + ',' + (bitmapFontArgument2 != null ? "{...}" : "null") + ',' + (stringArgument3 != null ? "{...}" : "null") + ',' + integerArgument4 + ',' + integerArgument5 + ')');
        }
    }

    final void performAction0433(String stringArgument1, int integerArgument2, BitmapFont bitmapFontArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8) {
        TextLineMetrics stackTextLineMetricsLocal1;
        TextLineMetrics stackTextLineMetricsLocal2;
        int stackIntegerLocal3;
        int stackIntegerLocal4;
        TextLineMetrics stackTextLineMetricsLocal5 = null;
        TextLineMetrics stackTextLineMetricsLocal6 = null;
        int stackIntegerLocal7 = 0;
        TextLineMetrics stackTextLineMetricsLocal8 = null;
        BitmapFont stackBitmapFontLocal9 = null;
        int stackIntegerLocal10 = 0;
        RuntimeException stackRuntimeExceptionLocal11 = null;
        StringBuilder stackStringBuilderLocal12 = null;
        String stackStringLocal13 = null;
        StringBuilder stackStringBuilderLocal14 = null;
        String stackStringLocal15 = null;
        RuntimeException caughtExceptionLocal16 = null;
        RuntimeException runtimeExceptionLocal17 = null;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        int integerLocal20 = 0;
        String stringLocal21 = null;
        TextLineMetrics textLineMetricsLocal22 = null;
        int integerLocal23 = 0;
        String[] stringArrayLocal24 = null;
        String[] stringArrayLocal25 = null;
        int integerLocal26;
        integerLocal23 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument8 == 0) {
            integerArgument8 = bitmapFontArgument3.integerState0516;
          }
          if (stringArgument1 == null) {
            this.lines = null;
            return;
          }
          if (this.font == bitmapFontArgument3 &&
            !this.booleanState0030 &&
            this.integerState0158 == integerArgument6 &&
            this.integerState0164 == integerArgument2 &&
            integerArgument8 == this.integerState0156 &&
            this.integerState0159 == integerArgument5 &&
            integerArgument4 == this.integerState0163 &&
            null != this.stringState0134 &&
            this.stringState0134.equals(stringArgument1)) {
            return;
          }
          this.integerState0156 = integerArgument8;
          this.stringState0134 = stringArgument1;
          this.integerState0164 = integerArgument2;
          this.integerState0163 = integerArgument4;
          this.font = bitmapFontArgument3;
          this.integerState0159 = integerArgument5;
          this.booleanState0030 = false;
          this.integerState0158 = integerArgument6;
          stringArrayLocal24 = new String[bitmapFontArgument3.computeInteger1209(stringArgument1, integerArgument4) + 1];
          stringArrayLocal25 = stringArrayLocal24;
          integerLocal18 = Math.max(1, bitmapFontArgument3.computeInteger1215(stringArgument1, new int[]{integerArgument4}, stringArrayLocal25));
          if (this.integerState0164 == 3 &&
            integerLocal18 == 1) {
            this.integerState0164 = 1;
          }
          if (integerArgument7 < 8) {
            RichTextLayout.computeString0435(true);
          }
          this.lines = new TextLineMetrics[integerLocal18];
          if (this.integerState0164 != 0) {
            if (this.integerState0164 == 1) {
              integerLocal19 = (-(integerLocal18 * this.integerState0156) + this.integerState0159 >> 1) + bitmapFontArgument3.integerState0518;
            } else {
              if (this.integerState0164 == 2) {
                integerLocal19 = -(this.integerState0156 * integerLocal18) - bitmapFontArgument3.integerState0523 + this.integerState0159;
              } else {
                integerLocal20 = (-(integerLocal18 * this.integerState0156) + this.integerState0159) / (1 + integerLocal18);
                if (integerLocal20 < 0) {
                  integerLocal20 = 0;
                }
                integerLocal19 = integerLocal20 + bitmapFontArgument3.integerState0518;
                this.integerState0156 = this.integerState0156 + integerLocal20;
              }
            }
          } else {
            integerLocal19 = bitmapFontArgument3.integerState0518;
          }
          for (integerLocal26 = 0; integerLocal18 > integerLocal26; integerLocal26++) {
            stringLocal21 = stringArrayLocal24[integerLocal26];
            stackTextLineMetricsLocal1 = null;
            stackTextLineMetricsLocal2 = null;
            stackIntegerLocal3 = -bitmapFontArgument3.integerState0518 + integerLocal19;
            stackIntegerLocal4 = bitmapFontArgument3.integerState0523 + integerLocal19;
            if (stringLocal21 != null) {
              stackTextLineMetricsLocal5 = null;
              stackTextLineMetricsLocal6 = null;
              stackIntegerLocal7 = stringLocal21.length();
            } else {
              stackTextLineMetricsLocal5 = null;
              stackTextLineMetricsLocal6 = null;
              stackIntegerLocal7 = 0;
            }
            textLineMetricsLocal22 = new TextLineMetrics(stackIntegerLocal3, stackIntegerLocal4, stackIntegerLocal7);
            textLineMetricsLocal22.characterXPositions[0] = 0;
            if (stringLocal21 != null) {
              textLineMetricsLocal22.characterXPositions[stringLocal21.length()] = bitmapFontArgument3.computeInteger1208(stringLocal21);
              stackTextLineMetricsLocal8 = textLineMetricsLocal22;
              stackBitmapFontLocal9 = (BitmapFont) (bitmapFontArgument3);
              if (integerArgument6 == 3) {
                stackIntegerLocal10 = this.computeInteger0250((byte) 64, bitmapFontArgument3.computeInteger1208(stringLocal21), stringLocal21, integerArgument4);
              } else {
                stackIntegerLocal10 = 0;
              }
              InputAdapter003.performAction0751(stackTextLineMetricsLocal8, stackBitmapFontLocal9, stackIntegerLocal10, stringLocal21, -1);
            }
            this.lines[integerLocal26] = textLineMetricsLocal22;
            integerLocal19 = integerLocal19 + integerArgument8;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal27) {
          caughtExceptionLocal16 = caughtParameterLocal27;
          runtimeExceptionLocal17 = caughtExceptionLocal16;
          stackRuntimeExceptionLocal11 = runtimeExceptionLocal17;
          stackStringBuilderLocal12 = new StringBuilder().append("ea.R(");
          if (stringArgument1 == null) {
            stackStringLocal13 = "null";
          } else {
            stackStringLocal13 = "{...}";
          }
          stackStringBuilderLocal14 = ((StringBuilder) (Object) stackStringBuilderLocal12).append(stackStringLocal13).append(',').append(integerArgument2).append(',');
          if (bitmapFontArgument3 == null) {
            stackStringLocal15 = "null";
          } else {
            stackStringLocal15 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal11), ((StringBuilder) (Object) stackStringBuilderLocal14).append(stackStringLocal15).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(integerArgument7).append(',').append(integerArgument8).append(')').toString());
        }
    }

    final static String computeString0435(boolean booleanArgument1) {
        if (MixedSupport152.booleanState0222) {
          if (!booleanArgument1) {
            RichTextLayout.computeString0435(true);
            return null;
          }
          return null;
        }
        if (MixedSupport066.integerState0341 < MixedSupport093.integerState0545) {
          if (!booleanArgument1) {
            RichTextLayout.computeString0435(true);
            return null;
          }
          return null;
        }
        if (UiComponentPart013.integerState0274 + MixedSupport093.integerState0545 > MixedSupport066.integerState0341) {
          return MixedSupport070.stringState0295;
        }
        if (!booleanArgument1) {
          RichTextLayout.computeString0435(true);
          return null;
        }
        return null;
    }

    final void performAction0431(int integerArgument1, BitmapFont bitmapFontArgument2, int integerArgument3, int integerArgument4, String stringArgument5) {
        TextLineMetrics textLineMetricsLocal1 = null;
        TextLineMetrics textLineMetricsLocal2 = null;
        if (stringArgument5 == null) {
          this.lines = null;
          return;
        }
        if (this.font == bitmapFontArgument2 &&
          this.booleanState0030 &&
          this.integerState0158 == 2 &&
          this.stringState0134 != null &&
          this.stringState0134.equals(stringArgument5)) {
          return;
        }
        try {
          this.stringState0134 = stringArgument5;
          this.font = bitmapFontArgument2;
          this.booleanState0030 = true;
          this.integerState0158 = 2;
          textLineMetricsLocal1 = this.computeTextLineMetrics0430(88, integerArgument4, bitmapFontArgument2, stringArgument5);
          textLineMetricsLocal2 = textLineMetricsLocal1;
          textLineMetricsLocal2.characterXPositions[integerArgument1] = -bitmapFontArgument2.computeInteger1208(stringArgument5) + integerArgument3;
          textLineMetricsLocal2.characterXPositions[stringArgument5.length()] = integerArgument3;
          InputAdapter003.performAction0751(textLineMetricsLocal2, bitmapFontArgument2, 0, stringArgument5, -1);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ea.N(" + integerArgument1 + ',' + (bitmapFontArgument2 != null ? "{...}" : "null") + ',' + integerArgument3 + ',' + integerArgument4 + ',' + (stringArgument5 != null ? "{...}" : "null") + ')');
        }
    }

    public static void performAction0434(byte byteArgument1) {
        if (byteArgument1 == -37) {
          stringState0135 = null;
          mixedSupport016State0001 = null;
          stringState0133 = null;
          bigIntegerState0001 = null;
          sceneWidgetState0020 = null;
          rgbSpriteState0015 = null;
          sceneWidgetState0021 = null;
          stringState0136 = null;
          return;
        }
    }

    public RichTextLayout() {
    }

    private final TextLineMetrics computeTextLineMetrics0430(int integerArgument1, int integerArgument2, BitmapFont bitmapFontArgument3, String stringArgument4) {
        TextLineMetrics textLineMetricsLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        TextLineMetrics textLineMetricsLocal4 = null;
        TextLineMetrics stackTextLineMetricsLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        try {
          textLineMetricsLocal4 = new TextLineMetrics(integerArgument2 - bitmapFontArgument3.integerState0518, integerArgument2 + bitmapFontArgument3.integerState0523, stringArgument4.length());
          textLineMetricsLocal1 = textLineMetricsLocal4;
          integerLocal3 = -31 / ((27 - integerArgument1) / 34);
          this.lines = new TextLineMetrics[]{textLineMetricsLocal4};
          stackTextLineMetricsLocal5 = textLineMetricsLocal1;
          return stackTextLineMetricsLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeExceptionLocal2 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("ea.L(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (bitmapFontArgument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (stringArgument4 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(')').toString());
        }
    }

    final static boolean computeBoolean0437(byte byteArgument1) {
        if (byteArgument1 <= 34) {
          stringState0135 = (String) null;
          if (SceneWidget.mixedSupport104State0001 != null) {
            return true;
          }
          if (SceneWidgetPart009.computeBoolean1518(-6)) {
            return true;
          }
          if (MixedSupport102.sceneWidgetPart007State0001 != null) {
            return true;
          }
          if (!DualNodeDeque.computeBoolean0036(48)) {
            return false;
          }
          return true;
        }
        if (SceneWidget.mixedSupport104State0001 != null) {
          return true;
        }
        if (SceneWidgetPart009.computeBoolean1518(-6)) {
          return true;
        }
        if (MixedSupport102.sceneWidgetPart007State0001 != null) {
          return true;
        }
        if (!DualNodeDeque.computeBoolean0036(48)) {
          return false;
        }
        return true;
    }

    static {
        integerState0160 = 0;
        stringState0133 = "Invite players";
        stringState0135 = "Under the Sea";
        integerState0162 = 0;
        integerState0157 = 360;
        stringState0136 = "Enter the name you'd prefer. This is the name displayed to other players.";
        bigIntegerState0001 = new java.math.BigInteger("65537");
    }
}
