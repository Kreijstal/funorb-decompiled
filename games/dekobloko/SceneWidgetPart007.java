/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SceneWidgetPart007 extends SceneWidget {
    static boolean booleanState0113;
    static SceneWidgetPart005 sceneWidgetPart005State0002;
    private SceneWidget sceneWidgetState0080;
    private StringBuilder stringBuilderState0003;
    private SceneWidgetPart003 sceneWidgetPart003State0002;
    private SceneWidget sceneWidgetState0081;
    static int[][] integerArrayArrayState0017;
    private SceneWidget[] sceneWidgetArrayState0003;
    long longState0031;
    private SceneWidget sceneWidgetState0082;
    private SceneWidget sceneWidgetState0083;
    static boolean booleanState0114;
    private SceneWidget sceneWidgetState0084;
    private SceneWidget sceneWidgetState0085;
    static int integerState0506;
    private int integerState0507;

    public static void performAction1187(int integerArgument1) {
        integerArrayArrayState0017 = (int[][]) null;
        if (integerArgument1 != 256) {
          return;
        }
        sceneWidgetPart005State0002 = null;
    }

    final static RgbSprite computeRgbSprite1179(int integerArgument1, int integerArgument2, String stringArgument3, RenderingSupport010 renderingSupport010Argument4, int integerArgument5, int integerArgument6, byte byteArgument7) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RgbSprite stackRgbSpriteLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        int integerLocal10 = 0;
        RuntimeException runtimeExceptionLocal11 = null;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        RgbSprite rgbSpriteLocal17 = null;
        int[] integerArrayLocal18 = null;
        RgbSprite rgbSpriteLocal19 = null;
        int integerLocal20 = 0;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        int integerLocal23 = 0;
        int integerLocal24 = 0;
        int integerLocal25 = 0;
        int integerLocal26 = 0;
        int integerLocal27 = 0;
        int integerLocal28 = 0;
        int[] integerArrayLocal29 = null;
        int integerLocal30;
        int integerLocal31;
        int integerLocal32;
        int integerLocal33;
        integerLocal28 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal10 = renderingSupport010Argument4.computeInteger1208(stringArgument3) - 1;
          while (integerArgument5 * (2 + integerLocal10) >= 620) {
            integerArgument5--;
          }
          integerLocal12 = renderingSupport010Argument4.integerState0523 + renderingSupport010Argument4.integerState0518;
          integerLocal13 = integerArgument5;
          integerLocal14 = integerLocal13 / 4;
          integerArrayLocal29 = SoftwareRaster.integerArrayState0063;
          integerLocal15 = SoftwareRaster.integerState0285;
          integerLocal16 = SoftwareRaster.integerState0284;
          rgbSpriteLocal17 = new RgbSprite(integerLocal10, integerLocal12);
          rgbSpriteLocal17.performAction0278();
          renderingSupport010Argument4.performAction1211(stringArgument3, 0, renderingSupport010Argument4.integerState0518, 16777215, -1);
          if (0 == integerArgument6) {
            integerArgument6 = 65793;
          }
          SoftwareRaster.performAction0724(integerArrayLocal29, integerLocal15, integerLocal16);
          integerArrayLocal18 = rgbSpriteLocal17.integerArrayState0024;
          rgbSpriteLocal19 = new RgbSprite((2 + integerLocal10) * integerLocal13, integerLocal13 * (2 + integerLocal12));
          rgbSpriteLocal19.performAction0278();
          for (integerLocal20 = 0; integerLocal12 > integerLocal20; integerLocal20++) {
            for (integerLocal21 = 0; integerLocal10 > integerLocal21; integerLocal21++) {
              if (integerArrayLocal18[integerLocal20 * integerLocal10 + integerLocal21] != 0) {
                integerLocal22 = integerLocal13 * (integerLocal21 + 1);
                integerLocal23 = (integerLocal20 + 1) * integerLocal13;
                SoftwareRaster.performAction0740(integerLocal22, integerLocal23, integerLocal13 - integerLocal14, integerArgument6 | -16777216);
                SoftwareRaster.performAction0740(-1 + integerLocal13 + integerLocal22, integerLocal23, integerLocal13 - integerLocal14, integerArgument6 | -16777216);
                SoftwareRaster.performAction0740(integerLocal22, integerLocal23 + integerLocal13 - 1, -integerLocal14 + integerLocal13, integerArgument6 | -16777216);
                SoftwareRaster.performAction0740(integerLocal22 + (integerLocal13 - 1), integerLocal13 + integerLocal23 - 1, -integerLocal14 + integerLocal13, integerArgument6 | -16777216);
              }
            }
          }
          SoftwareRaster.performAction0724(integerArrayLocal29, integerLocal15, integerLocal16);
          for (integerLocal30 = 0; integerLocal30 < integerLocal12; integerLocal30++) {
            for (integerLocal31 = 0; integerLocal10 > integerLocal31; integerLocal31++) {
              if (0 != integerArrayLocal18[integerLocal31 + integerLocal30 * integerLocal10]) {
                integerLocal32 = integerLocal13 + integerLocal31 * integerLocal13;
                integerLocal33 = integerLocal32 + integerLocal13;
                integerLocal24 = integerLocal13 * integerLocal30 + integerLocal13;
                integerLocal25 = integerLocal13 + integerLocal24;
                for (integerLocal1 = integerLocal24; integerLocal1 < integerLocal25; integerLocal1++) {
                  integerLocal26 = 256 * (integerLocal1 - integerLocal13) / (integerLocal13 * integerLocal12);
                  integerLocal27 = MixedSupport042.computeInteger0594(integerArgument2, integerLocal26, 256, integerArgument1, 124);
                  for (integerLocal2 = integerLocal32; integerLocal33 > integerLocal2; integerLocal2++) {
                    rgbSpriteLocal19.integerArrayState0024[integerLocal2 + rgbSpriteLocal19.integerState0258 * integerLocal1] = UiComponentPart006.computeInteger0388(-16777216, integerLocal27);
                  }
                }
              }
            }
          }
          if (byteArgument7 < 84) {
            SceneWidgetPart007.performAction1187(17);
          }
          stackRgbSpriteLocal3 = rgbSpriteLocal19;
          return stackRgbSpriteLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal34) {
          caughtExceptionLocal9 = caughtParameterLocal34;
          runtimeExceptionLocal11 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal11;
          stackStringBuilderLocal5 = new StringBuilder().append("mg.B(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (stringArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',');
          if (renderingSupport010Argument4 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(byteArgument7).append(')').toString());
        }
    }

    final boolean computeBoolean1184(boolean booleanArgument1) {
        if (booleanArgument1) {
          return false;
        }
        if (this.integerState0507 != -2) {
          return false;
        }
        if (MixedSupport153.integerState0931 == 13) {
          this.integerState0507 = -1;
          return true;
        }
        return true;
    }

    final static void performAction1180(int integerArgument1, RgbSprite rgbSpriteArgument2, RgbSprite rgbSpriteArgument3) {
        int integerLocal1 = 0;
        int[] integerArrayLocal2 = null;
        int[] integerArrayLocal3 = null;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int[] integerArrayLocal6 = null;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        RuntimeException runtimeExceptionLocal13 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerArrayLocal6 = rgbSpriteArgument3.integerArrayState0024;
          integerArrayLocal2 = integerArrayLocal6;
          integerArrayLocal3 = rgbSpriteArgument2.integerArrayState0024;
          integerLocal4 = integerArrayLocal6.length;
          for (integerLocal1 = integerArgument1; integerLocal1 < integerLocal4; integerLocal1++) {
            if (0 == integerArrayLocal3[integerLocal1]) {
              integerArrayLocal6[integerLocal1] = 0;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal12 = caughtParameterLocal14;
          runtimeExceptionLocal13 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal13;
          stackStringBuilderLocal8 = new StringBuilder().append("mg.J(").append(integerArgument1).append(',');
          if (rgbSpriteArgument2 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',');
          if (rgbSpriteArgument3 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(')').toString());
        }
    }

    private final int computeInteger1181(SceneWidget sceneWidgetArgument1, int integerArgument2, int integerArgument3, SceneWidget sceneWidgetArgument4, int integerArgument5, String stringArgument6) {
        SceneWidget sceneWidgetLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        int stackIntegerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        try {
          sceneWidgetLocal1 = new SceneWidget(0L, sceneWidgetArgument1, 0, integerArgument2, integerArgument3, integerArgument5, stringArgument6);
          sceneWidgetArgument4.performAction1998(sceneWidgetLocal1, -16834);
          integerArgument2 += 32;
          stackIntegerLocal3 = integerArgument2;
          return stackIntegerLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeExceptionLocal2 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("mg.M(");
          if (sceneWidgetArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (sceneWidgetArgument4 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument5).append(',');
          if (stringArgument6 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(')').toString());
        }
    }

    private final int computeInteger1182(boolean booleanArgument1, SceneWidget sceneWidgetArgument2, SceneWidget sceneWidgetArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int stackIntegerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          integerArgument4 += 8;
          if (!booleanArgument1) {
            integerArrayArrayState0017 = (int[][]) null;
          }
          integerLocal1 = sceneWidgetArgument2.bitmapFontState0020.computeInteger1223(sceneWidgetArgument2.stringState0598, integerArgument5 - sceneWidgetArgument2.integerState0893 * 2, sceneWidgetArgument2.integerState0908);
          sceneWidgetArgument2.performAction1994(integerArgument5, 0, integerArgument4, integerLocal1, 0);
          sceneWidgetArgument3.performAction1998(sceneWidgetArgument2, -16834);
          integerArgument4 = integerArgument4 + (integerLocal1 - 0);
          stackIntegerLocal3 = integerArgument4;
          return stackIntegerLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("mg.C(").append(booleanArgument1).append(',');
          if (sceneWidgetArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',');
          if (sceneWidgetArgument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument4).append(',').append(integerArgument5).append(')').toString());
        }
    }

    final int computeInteger1185(int integerArgument1, boolean booleanArgument2) {
        int integerLocal1 = 0;
        SceneWidgetPart003 stackSceneWidgetPart003Local2 = null;
        boolean stackBooleanLocal3 = false;
        SceneWidget stackSceneWidgetLocal4 = null;
        boolean stackBooleanLocal5 = false;
        int integerLocal6;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        this.performAction2002(false, booleanArgument2);
        if (integerArgument1 != 497) {
          return -95;
        }
        if (null != this.sceneWidgetState0085) {
          this.sceneWidgetState0085.stringState0598 = this.stringBuilderState0003.toString();
          this.sceneWidgetState0085.integerState0890 = (this.integerState0896 - this.sceneWidgetState0085.bitmapFontState0020.computeInteger1208(this.sceneWidgetState0085.stringState0598)) / 2;
          this.sceneWidgetState0085.integerState0896 = this.integerState0896 - this.sceneWidgetState0085.integerState0890;
          if (null != this.sceneWidgetPart003State0002 &&
            0 != this.sceneWidgetPart003State0002.integerState0891) {
            stackSceneWidgetPart003Local2 = this.sceneWidgetPart003State0002;
            stackBooleanLocal3 = !(this.sceneWidgetPart003State0002.booleanState0217);
            stackSceneWidgetPart003Local2.booleanState0217 = stackBooleanLocal3;
          }
          for (integerLocal1 = 0; NetworkArchiveRequestManager.integerState0598 > integerLocal1; integerLocal1++) {
            if (this.sceneWidgetArrayState0003[integerLocal1] != null) {
              stackSceneWidgetLocal4 = this.sceneWidgetArrayState0003[integerLocal1];
              stackBooleanLocal5 = !(this.stringBuilderState0003.length() <= 0);
              stackSceneWidgetLocal4.booleanState0212 = stackBooleanLocal5;
              if (this.sceneWidgetArrayState0003[integerLocal1].booleanState0212 &&
                0 != this.sceneWidgetArrayState0003[integerLocal1].integerState0891) {
                return integerLocal1;
              }
            }
          }
        }
        if (this.sceneWidgetState0080.integerState0891 != 0) {
          return -1;
        }
        if (booleanArgument2 &&
          0 != SceneWidgetPart005.integerState0328 &&
          0 == this.integerState0891) {
          return -1;
        }
        return this.integerState0507;
    }

    final boolean computeBoolean1186(int integerArgument1) {
        boolean stackBooleanLocal1 = false;
        if (integerArgument1 != 5658) {
          SceneWidgetPart007.performAction1187(-70);
        }
        stackBooleanLocal1 = (null != this.sceneWidgetPart003State0002) && (this.sceneWidgetPart003State0002.booleanState0217);
        return stackBooleanLocal1;
    }

    final String computeString1188(byte byteArgument1) {
        if (byteArgument1 != -96) {
          booleanState0113 = true;
        }
        return this.stringBuilderState0003.toString();
    }

    final static void performAction1183(int integerArgument1, boolean booleanArgument2) {
        AudioSupport002.mixedSupport006State0002 = booleanArgument2 ? new MixedSupport006(MixedSupport135.stringState0557, MixedSupport020.sceneWidgetState0012) : new MixedSupport006(MixedSupport031.stringState0152, RenderingSupport006.sceneWidgetState0056);
        MixedSupport030.sceneWidgetState0023 = new SceneWidget(0L, (SceneWidget) null);
        MixedSupport030.sceneWidgetState0023.performAction1998(AudioSupport002.mixedSupport006State0002.sceneWidgetPart011State0001, -16834);
        MixedSupport030.sceneWidgetState0023.performAction1998(ComponentDecorator.sceneWidgetState0078, -16834);
        MixedSupport087.sceneWidgetState0087 = new SceneWidget((long)integerArgument1, MusicTrack.sceneWidgetState0127);
        MixedSupport020.sceneWidgetState0013 = new SceneWidget(0L, (SceneWidget) null);
        MixedSupport087.sceneWidgetState0087.performAction1998(MixedSupport059.sceneWidgetState0054, -16834);
        MixedSupport087.sceneWidgetState0087.performAction1998(MixedSupport020.sceneWidgetState0013, -16834);
        MixedSupport020.sceneWidgetState0013.performAction1998(RenderingSupport004.sceneWidgetState0039, -16834);
        MixedSupport020.sceneWidgetState0013.performAction1998(GameSession.sceneWidgetState0099, -16834);
        UiComponentPart032.performAction1927(booleanArgument2, -2);
    }

    SceneWidgetPart007(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, SceneWidget sceneWidgetArgument6, SceneWidget sceneWidgetArgument7, SceneWidget sceneWidgetArgument8, SceneWidget sceneWidgetArgument9, SceneWidgetPart003 sceneWidgetPart003Argument10, SceneWidget sceneWidgetArgument11, String stringArgument12, long longArgument13) {
        super(0L, sceneWidgetArgument6);
        StringBuilder discarded$1 = null;
        int integerLocal2 = 0;
        SceneWidget[] sceneWidgetArrayLocal3 = null;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        SceneWidget[] sceneWidgetArrayLocal15 = null;
        Object stackObjectLocal16;
        SceneWidgetPart003 stackSceneWidgetPart003Local17;
        SceneWidgetPart003 stackSceneWidgetPart003Local18;
        long stackLongLocal19;
        SceneWidgetPart003 stackSceneWidgetPart003Local20;
        Object stackObjectLocal21;
        SceneWidgetPart003 stackSceneWidgetPart003Local22;
        SceneWidgetPart003 stackSceneWidgetPart003Local23;
        String stackStringLocal24;
        SceneWidget stackSceneWidgetLocal25 = null;
        boolean stackBooleanLocal26 = false;
        RuntimeException stackRuntimeExceptionLocal27 = null;
        StringBuilder stackStringBuilderLocal28 = null;
        String stackStringLocal29 = null;
        StringBuilder stackStringBuilderLocal30 = null;
        String stackStringLocal31 = null;
        StringBuilder stackStringBuilderLocal32 = null;
        String stackStringLocal33 = null;
        StringBuilder stackStringBuilderLocal34 = null;
        String stackStringLocal35 = null;
        StringBuilder stackStringBuilderLocal36 = null;
        String stackStringLocal37 = null;
        StringBuilder stackStringBuilderLocal38 = null;
        String stackStringLocal39 = null;
        StringBuilder stackStringBuilderLocal40 = null;
        String stackStringLocal41 = null;
        RuntimeException caughtExceptionLocal42 = null;
        RuntimeException runtimeExceptionLocal43 = null;
        Object stackObjectLocal44;
        SceneWidgetPart003 stackSceneWidgetPart003Local45;
        SceneWidgetPart003 stackSceneWidgetPart003Local46;
        Object stackObjectLocal47;
        SceneWidgetPart003 stackSceneWidgetPart003Local48;
        SceneWidgetPart003 stackSceneWidgetPart003Local49;
        int integerLocal50;
        int integerLocal51;
        int integerLocal52;
        int integerLocal53;
        int integerLocal54;
        int integerLocal55;
        int integerLocal56;
        int integerLocal57;
        int integerLocal58;
        int integerLocal59;
        int integerLocal60;
        int integerLocal61;
        int integerLocal62;
        int integerLocal63;
        int integerLocal64;
        int integerLocal65;
        int integerLocal66;
        this.integerState0507 = -2;
        try {
          this.longState0031 = longArgument13;
          this.sceneWidgetState0082 = new SceneWidget(0L, sceneWidgetArgument7, MixedSupport135.stringState0556.toUpperCase());
          this.sceneWidgetState0082.integerState0916 = 1;
          this.performAction1998(this.sceneWidgetState0082, -16834);
          this.sceneWidgetState0080 = new SceneWidget(0L, sceneWidgetArgument8);
          this.sceneWidgetState0082.performAction1998(this.sceneWidgetState0080, -16834);
          this.sceneWidgetState0084 = new SceneWidget(0L, (SceneWidget) null);
          this.performAction1998(this.sceneWidgetState0084, -16834);
          if (stringArgument12 != null) {
            this.sceneWidgetState0081 = new SceneWidget(0L, sceneWidgetArgument9, UiComponentPart023.stringState0423);
            this.sceneWidgetState0081.integerState0916 = 1;
            this.sceneWidgetState0081.integerState0910 = 11184810;
            this.sceneWidgetState0084.performAction1998(this.sceneWidgetState0081, -16834);
            this.sceneWidgetState0083 = new SceneWidget(0L, sceneWidgetArgument9, MixedSupport101.stringState0407);
            this.sceneWidgetState0083.integerState0916 = 1;
            this.sceneWidgetState0083.integerState0910 = 11184810;
            this.sceneWidgetState0084.performAction1998(this.sceneWidgetState0083, -16834);
            this.sceneWidgetState0085 = new SceneWidget(0L, sceneWidgetArgument9);
            this.sceneWidgetState0085.integerState0910 = 16764006;
            this.sceneWidgetState0084.performAction1998(this.sceneWidgetState0085, -16834);
            this.sceneWidgetState0085.stringState0599 = "|";
            if (!(MixedSupport021.integerState0123 < 5) ||
              !(MixedSupport126.integerState0776 < 2)) {
              regionExit1: {
                stackObjectLocal16 = this;
                stackSceneWidgetPart003Local17 = null;
                stackSceneWidgetPart003Local18 = null;
                stackLongLocal19 = 0L;
                stackSceneWidgetPart003Local20 = (SceneWidgetPart003) (sceneWidgetPart003Argument10);
                if (MixedSupport021.integerState0123 < 7) {
                  stackObjectLocal44 = this;
                  stackSceneWidgetPart003Local45 = null;
                  stackSceneWidgetPart003Local46 = null;
                  if (MixedSupport126.integerState0776 < 2) {
                    stackObjectLocal21 = this;
                    stackSceneWidgetPart003Local22 = null;
                    stackSceneWidgetPart003Local23 = null;
                    stackStringLocal24 = UiComponentPart028.stringState0481;
                    break regionExit1;
                  }
                }
                stackObjectLocal47 = this;
                stackSceneWidgetPart003Local48 = null;
                stackSceneWidgetPart003Local49 = null;
                stackStringLocal24 = NodeHashTable.stringState0505;
              }
              this.sceneWidgetPart003State0002 = new SceneWidgetPart003(stackLongLocal19, stackSceneWidgetPart003Local20, stackStringLocal24);
              this.sceneWidgetState0084.performAction1998(this.sceneWidgetPart003State0002, -16834);
            }
            sceneWidgetArrayLocal15 = new SceneWidget[3];
            sceneWidgetArrayLocal3 = sceneWidgetArrayLocal15;
            sceneWidgetArrayLocal15[0] = new SceneWidget(0L, (SceneWidget) null);
            this.sceneWidgetState0084.performAction1998(sceneWidgetArrayLocal15[0], -16834);
            sceneWidgetArrayLocal15[1] = new SceneWidget(0L, (SceneWidget) null);
            this.sceneWidgetState0084.performAction1998(sceneWidgetArrayLocal15[1], -16834);
            sceneWidgetArrayLocal15[2] = new SceneWidget(0L, (SceneWidget) null);
            this.sceneWidgetState0084.performAction1998(sceneWidgetArrayLocal15[2], -16834);
            this.sceneWidgetArrayState0003 = new SceneWidget[NetworkArchiveRequestManager.integerState0598];
            for (integerLocal4 = 0; integerLocal4 < NetworkArchiveRequestManager.integerState0598; integerLocal4++) {
              if (UiComponentPart024.stringArrayState0032[integerLocal4] != null) {
                this.sceneWidgetArrayState0003[integerLocal4] = new SceneWidget(0L, sceneWidgetArgument11, UiComponentPart024.stringArrayState0032[integerLocal4]);
                this.sceneWidgetArrayState0003[integerLocal4].integerState0916 = 0;
                stackSceneWidgetLocal25 = this.sceneWidgetArrayState0003[integerLocal4];
                stackBooleanLocal26 = (stringArgument12 != null);
                stackSceneWidgetLocal25.booleanState0212 = stackBooleanLocal26;
                this.sceneWidgetState0084.performAction1998(this.sceneWidgetArrayState0003[integerLocal4], -16834);
              }
            }
            this.stringBuilderState0003 = new StringBuilder(12);
            if (stringArgument12 != null) {
              discarded$1 = this.stringBuilderState0003.append(stringArgument12);
            }
            integerLocal56 = 0;
            integerLocal5 = sceneWidgetArgument7.bitmapFontState0020.computeInteger1208(TextLayout.stringState0085);
            if (integerLocal5 > integerLocal56) {
              integerLocal56 = integerLocal5;
            }
            integerLocal57 = sceneWidgetArgument7.bitmapFontState0020.computeInteger1208(MixedSupport138.stringState0568);
            if (integerLocal56 < integerLocal57) {
              integerLocal56 = integerLocal57;
            }
            integerLocal58 = sceneWidgetArgument7.bitmapFontState0020.computeInteger1208(MixedSupport070.stringState0293);
            if (integerLocal58 > integerLocal56) {
              integerLocal56 = integerLocal58;
            }
            for (integerLocal59 = 0; integerLocal59 < NetworkArchiveRequestManager.integerState0598; integerLocal59++) {
              if (this.sceneWidgetArrayState0003[integerLocal59] != null) {
                integerLocal6 = this.sceneWidgetArrayState0003[integerLocal59].computeInteger2000(true);
                if (integerLocal6 > integerLocal56) {
                  integerLocal56 = integerLocal6;
                }
              }
            }
            if (integerLocal56 > 140) {
              integerLocal56 = 140;
            }
            integerLocal60 = 0;
            integerLocal61 = 0;
            integerLocal62 = 0;
            integerLocal62 = this.computeInteger1181(sceneWidgetArgument7, integerLocal62, integerLocal56, sceneWidgetArrayLocal15[0], 24, TextLayout.stringState0085);
            integerLocal62 = this.computeInteger1182(true, this.sceneWidgetArrayState0003[6], sceneWidgetArrayLocal15[0], integerLocal62, integerLocal56);
            integerLocal62 = this.computeInteger1182(true, this.sceneWidgetArrayState0003[9], sceneWidgetArrayLocal15[0], integerLocal62, integerLocal56);
            integerLocal62 = this.computeInteger1182(true, this.sceneWidgetArrayState0003[5], sceneWidgetArrayLocal15[0], integerLocal62, integerLocal56);
            integerLocal62 = this.computeInteger1182(true, this.sceneWidgetArrayState0003[7], sceneWidgetArrayLocal15[0], integerLocal62, integerLocal56);
            integerLocal62 = this.computeInteger1182(true, this.sceneWidgetArrayState0003[15], sceneWidgetArrayLocal15[0], integerLocal62, integerLocal56);
            integerLocal62 = this.computeInteger1182(true, this.sceneWidgetArrayState0003[4], sceneWidgetArrayLocal15[0], integerLocal62, integerLocal56);
            if (integerLocal62 > integerLocal60) {
              integerLocal60 = integerLocal62;
            }
            integerLocal63 = 0;
            integerLocal63 = this.computeInteger1181(sceneWidgetArgument7, integerLocal63, integerLocal56, sceneWidgetArrayLocal15[1], 24, MixedSupport138.stringState0568);
            integerLocal63 = this.computeInteger1182(true, this.sceneWidgetArrayState0003[16], sceneWidgetArrayLocal15[1], integerLocal63, integerLocal56);
            integerLocal63 = this.computeInteger1182(true, this.sceneWidgetArrayState0003[17], sceneWidgetArrayLocal15[1], integerLocal63, integerLocal56);
            integerLocal63 = this.computeInteger1182(true, this.sceneWidgetArrayState0003[18], sceneWidgetArrayLocal15[1], integerLocal63, integerLocal56);
            integerLocal63 = this.computeInteger1182(true, this.sceneWidgetArrayState0003[19], sceneWidgetArrayLocal15[1], integerLocal63, integerLocal56);
            integerLocal63 = this.computeInteger1182(true, this.sceneWidgetArrayState0003[20], sceneWidgetArrayLocal15[1], integerLocal63, integerLocal56);
            if (integerLocal60 < integerLocal63) {
              integerLocal60 = integerLocal63;
            }
            integerLocal64 = 0;
            integerLocal64 = this.computeInteger1181(sceneWidgetArgument7, integerLocal64, integerLocal56, sceneWidgetArrayLocal15[2], 24, MixedSupport070.stringState0293);
            integerLocal64 = this.computeInteger1182(true, this.sceneWidgetArrayState0003[13], sceneWidgetArrayLocal15[2], integerLocal64, integerLocal56);
            integerLocal64 = this.computeInteger1182(true, this.sceneWidgetArrayState0003[21], sceneWidgetArrayLocal15[2], integerLocal64, integerLocal56);
            integerLocal64 = this.computeInteger1182(true, this.sceneWidgetArrayState0003[11], sceneWidgetArrayLocal15[2], integerLocal64, integerLocal56);
            if (integerLocal60 < integerLocal64) {
              integerLocal60 = integerLocal64;
            }
            integerLocal7 = 3 * integerLocal56 + 26;
            integerLocal8 = this.sceneWidgetState0082.computeInteger2000(true);
            if (integerLocal8 > integerLocal7) {
              integerLocal7 = integerLocal8;
            }
            if (this.sceneWidgetPart003State0002 != null) {
              integerLocal65 = this.sceneWidgetPart003State0002.computeInteger0674(4, -4168);
              if (integerLocal7 < integerLocal65) {
                integerLocal7 = integerLocal65;
              }
            }
            this.sceneWidgetState0082.performAction1994(13 - (-integerLocal7 - 13), 0, 0, 24, 0);
            this.sceneWidgetState0080.performAction1994(15, 0, 5, 15, -20 + this.sceneWidgetState0082.integerState0896);
            integerLocal9 = 10;
            this.sceneWidgetState0081.performAction1994(integerLocal7, 0, integerLocal9, ComponentContainer.integerState0377 * 2, 13);
            integerLocal9 = integerLocal9 + 2 * ComponentContainer.integerState0377;
            this.sceneWidgetState0083.performAction1994(integerLocal7, 0, integerLocal9, ComponentContainer.integerState0377 * 2, 13);
            integerLocal9 = integerLocal9 + (2 * ComponentContainer.integerState0377 + 10);
            this.sceneWidgetState0085.performAction1994(0, 0, integerLocal9, ComponentContainer.integerState0377, 0);
            integerLocal9 = integerLocal9 + (ComponentContainer.integerState0377 + 10);
            if (null != this.sceneWidgetPart003State0002) {
              integerLocal66 = this.sceneWidgetPart003State0002.computeInteger0674(4, -4168);
              this.sceneWidgetPart003State0002.performAction0673(integerLocal66, 8, integerLocal9, (integerLocal7 - integerLocal66) / 2 + 13, 4, ComponentContainer.integerState0377);
              integerLocal9 = integerLocal9 + (10 + ComponentContainer.integerState0377);
            }
            sceneWidgetArrayLocal15[0].performAction1994(integerLocal56, 0, integerLocal9, integerLocal60, 13);
            sceneWidgetArrayLocal15[1].performAction1994(integerLocal56, 0, integerLocal9, integerLocal60, 13 + (integerLocal56 + 13));
            sceneWidgetArrayLocal15[2].performAction1994(integerLocal56, 0, integerLocal9, integerLocal60, 2 * integerLocal56 + 13 + 26);
            integerLocal10 = integerLocal9;
            this.sceneWidgetState0084.performAction1994(13 + integerLocal7 + 13, 0, 24, 10 + integerLocal60 + integerLocal10, 0);
            this.sceneWidgetState0084.rgbSpriteArrayState0033 = RichTextLayout.computeRgbSpriteArray0428(2105376, -20982, 3, this.sceneWidgetState0084.integerState0915, 8421504, 11579568);
            integerLocal11 = 13 + integerLocal7 + 13;
            integerLocal12 = 10 + (integerLocal10 + (24 + integerLocal60));
            integerLocal13 = MixedSupport146.computeInteger1953(integerArgument3, -18265, integerLocal11, integerArgument1);
            integerLocal14 = MixedSupport093.computeInteger1303(integerArgument4, 0, integerLocal12, integerArgument2);
            this.performAction1994(integerLocal11, 0, integerLocal14, integerLocal12, integerLocal13);
            return;
          }
          this.sceneWidgetState0081 = new SceneWidget(0L, sceneWidgetArgument9, MixedSupport052.stringState0219);
          this.sceneWidgetState0081.integerState0910 = 11184810;
          this.sceneWidgetState0081.integerState0916 = 1;
          this.sceneWidgetState0084.performAction1998(this.sceneWidgetState0081, -16834);
          integerLocal2 = 226;
          integerLocal50 = 10;
          integerLocal51 = this.sceneWidgetState0081.bitmapFontState0020.computeInteger1209(this.sceneWidgetState0081.stringState0598, integerLocal2);
          this.sceneWidgetState0081.performAction1994(integerLocal2, 0, integerLocal50, ComponentContainer.integerState0377 * integerLocal51, 13);
          integerLocal50 = integerLocal50 + ComponentContainer.integerState0377 * integerLocal51;
          this.sceneWidgetState0084.performAction1994(integerLocal2 + 13 + 13, 0, 24, 10 + integerLocal50, 0);
          this.sceneWidgetState0084.rgbSpriteArrayState0033 = RichTextLayout.computeRgbSpriteArray0428(2105376, -20982, 3, this.sceneWidgetState0084.integerState0915, 8421504, 11579568);
          integerLocal52 = 26 + integerLocal2;
          integerLocal53 = integerLocal50 + 34;
          integerLocal54 = MixedSupport146.computeInteger1953(integerArgument3, -18265, integerLocal52, integerArgument1);
          integerLocal55 = MixedSupport093.computeInteger1303(integerArgument4, 0, integerLocal53, integerArgument2);
          this.performAction1994(integerLocal52, 0, integerLocal55, integerLocal53, integerLocal54);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal67) {
          caughtExceptionLocal42 = caughtParameterLocal67;
          runtimeExceptionLocal43 = caughtExceptionLocal42;
          stackRuntimeExceptionLocal27 = runtimeExceptionLocal43;
          stackStringBuilderLocal28 = new StringBuilder().append("mg.<init>(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',');
          if (sceneWidgetArgument6 == null) {
            stackStringLocal29 = "null";
          } else {
            stackStringLocal29 = "{...}";
          }
          stackStringBuilderLocal30 = ((StringBuilder) (Object) stackStringBuilderLocal28).append(stackStringLocal29).append(',');
          if (sceneWidgetArgument7 == null) {
            stackStringLocal31 = "null";
          } else {
            stackStringLocal31 = "{...}";
          }
          stackStringBuilderLocal32 = ((StringBuilder) (Object) stackStringBuilderLocal30).append(stackStringLocal31).append(',');
          if (sceneWidgetArgument8 == null) {
            stackStringLocal33 = "null";
          } else {
            stackStringLocal33 = "{...}";
          }
          stackStringBuilderLocal34 = ((StringBuilder) (Object) stackStringBuilderLocal32).append(stackStringLocal33).append(',');
          if (sceneWidgetArgument9 == null) {
            stackStringLocal35 = "null";
          } else {
            stackStringLocal35 = "{...}";
          }
          stackStringBuilderLocal36 = ((StringBuilder) (Object) stackStringBuilderLocal34).append(stackStringLocal35).append(',');
          if (sceneWidgetPart003Argument10 == null) {
            stackStringLocal37 = "null";
          } else {
            stackStringLocal37 = "{...}";
          }
          stackStringBuilderLocal38 = ((StringBuilder) (Object) stackStringBuilderLocal36).append(stackStringLocal37).append(',');
          if (sceneWidgetArgument11 == null) {
            stackStringLocal39 = "null";
          } else {
            stackStringLocal39 = "{...}";
          }
          stackStringBuilderLocal40 = ((StringBuilder) (Object) stackStringBuilderLocal38).append(stackStringLocal39).append(',');
          if (stringArgument12 == null) {
            stackStringLocal41 = "null";
          } else {
            stackStringLocal41 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal27), ((StringBuilder) (Object) stackStringBuilderLocal40).append(stackStringLocal41).append(',').append(longArgument13).append(')').toString());
        }
    }

    static {
        booleanState0113 = false;
    }
}
