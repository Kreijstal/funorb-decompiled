/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SceneWidgetPart011 extends SceneWidget {
    static byte[][] byteArrayArrayState0008;
    private SceneWidget sceneWidgetState0113;
    static SceneWidget sceneWidgetState0114;
    private SceneWidget[] sceneWidgetArrayState0005;
    static RgbSprite rgbSpriteState0058;
    static String stringState0525;
    int integerState0773;
    private SceneWidget[] sceneWidgetArrayState0006;
    static SceneWidget sceneWidgetState0115;

    final void performAction1782(boolean booleanArgument1) {
        int integerLocal1 = 0;
        SceneWidget cachedSceneWidgetLocal2 = null;
        SceneWidget cachedSceneWidgetLocal3 = null;
        int integerLocal4;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        for (integerLocal1 = 0; this.sceneWidgetArrayState0005.length > integerLocal1; integerLocal1++) {
          if (integerLocal1 != this.integerState0773 &&
            0 != this.sceneWidgetArrayState0005[integerLocal1].integerState0891) {
            this.sceneWidgetArrayState0005[this.integerState0773].booleanState0217 = false;
            cachedSceneWidgetLocal2 = this.sceneWidgetArrayState0006[this.integerState0773];
            cachedSceneWidgetLocal2.integerState0890 = cachedSceneWidgetLocal2.integerState0890 + 10000;
            this.integerState0773 = integerLocal1;
            this.sceneWidgetArrayState0005[integerLocal1].booleanState0217 = true;
            cachedSceneWidgetLocal3 = this.sceneWidgetArrayState0006[integerLocal1];
            cachedSceneWidgetLocal3.integerState0890 = cachedSceneWidgetLocal3.integerState0890 - 10000;
          }
        }
        if (booleanArgument1) {
          this.performAction1781(-26, true, -12);
        }
    }

    public static void performAction1784(byte byteArgument1) {
        if (byteArgument1 <= 83) {
          return;
        }
        byteArrayArrayState0008 = (byte[][]) null;
        sceneWidgetState0115 = null;
        rgbSpriteState0058 = null;
        stringState0525 = null;
        sceneWidgetState0114 = null;
    }

    SceneWidgetPart011(long longArgument1, SceneWidget sceneWidgetArgument2, String[] stringArrayArgument3, SceneWidget sceneWidgetArgument4, SceneWidget[] sceneWidgetArrayArgument5, int integerArgument6) {
        super(longArgument1, (SceneWidget) null);
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
        int integerLocal11 = 0;
        RuntimeException runtimeExceptionLocal12 = null;
        SceneWidget sceneWidgetLocal13 = null;
        int integerLocal14 = 0;
        int integerLocal15;
        try {
          this.sceneWidgetArrayState0005 = new SceneWidget[stringArrayArgument3.length];
          this.sceneWidgetState0113 = new SceneWidget(0L, sceneWidgetArgument4);
          this.sceneWidgetArrayState0006 = sceneWidgetArrayArgument5;
          for (integerLocal11 = 0; stringArrayArgument3.length > integerLocal11; integerLocal11++) {
            sceneWidgetLocal13 = new SceneWidget(0L, sceneWidgetArgument2);
            sceneWidgetLocal13.stringState0598 = stringArrayArgument3[integerLocal11];
            this.sceneWidgetArrayState0005[integerLocal11] = sceneWidgetLocal13;
            this.performAction1998(sceneWidgetLocal13, -16834);
          }
          this.performAction1998(this.sceneWidgetState0113, -16834);
          integerLocal14 = 0;
          integerLocal15 = integerLocal14;
          while (integerLocal14 < sceneWidgetArrayArgument5.length) {
            this.sceneWidgetState0113.performAction1998(sceneWidgetArrayArgument5[integerLocal14], -16834);
            integerLocal14++;
          }
          this.integerState0773 = integerArgument6;
          this.sceneWidgetArrayState0005[integerArgument6].booleanState0217 = true;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal16) {
          caughtExceptionLocal10 = caughtParameterLocal16;
          runtimeExceptionLocal12 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal12;
          stackStringBuilderLocal2 = new StringBuilder().append("tc.<init>(").append(longArgument1).append(',');
          if (sceneWidgetArgument2 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',');
          if (stringArrayArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (sceneWidgetArgument4 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (sceneWidgetArrayArgument5 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument6).append(')').toString());
        }
    }

    private final void performAction1781(int integerArgument1, boolean booleanArgument2, int integerArgument3) {
        SceneWidget cachedSceneWidgetLocal1 = null;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (!booleanArgument2) {
          this.performAction1779(-2, -35, 12, -28, 52, 1, -110);
        }
        for (integerLocal2 = 0; integerLocal2 < this.sceneWidgetArrayState0005.length; integerLocal2++) {
          integerLocal3 = integerLocal2 * this.integerState0896 / this.sceneWidgetArrayState0005.length;
          integerLocal4 = this.integerState0896 * (integerLocal2 + 1) / this.sceneWidgetArrayState0005.length;
          this.sceneWidgetArrayState0005[integerLocal2].integerState0890 = integerLocal3;
          this.sceneWidgetArrayState0005[integerLocal2].integerState0903 = 0;
          this.sceneWidgetArrayState0005[integerLocal2].integerState0896 = integerLocal4 - integerLocal3;
          this.sceneWidgetArrayState0005[integerLocal2].integerState0915 = integerArgument3;
        }
        this.sceneWidgetState0113.performAction1994(this.integerState0896, 0, integerArgument3, -integerArgument3 + this.integerState0915, 0);
        integerLocal6 = 0;
        integerLocal7 = integerLocal6;
        while (integerLocal6 < this.sceneWidgetArrayState0006.length) {
          this.sceneWidgetArrayState0006[integerLocal6].performAction1994(this.sceneWidgetState0113.integerState0896 - 2 * integerArgument1, 0, integerArgument1, -(2 * integerArgument1) + this.sceneWidgetState0113.integerState0915, integerArgument1);
          if (integerLocal6 != this.integerState0773) {
            cachedSceneWidgetLocal1 = this.sceneWidgetArrayState0006[integerLocal6];
            cachedSceneWidgetLocal1.integerState0890 = cachedSceneWidgetLocal1.integerState0890 + 10000;
          }
          integerLocal6++;
        }
    }

    final static SceneWidget computeSceneWidget1783(byte byteArgument1) {
        if (byteArgument1 != 98) {
          return (SceneWidget) null;
        }
        return MixedSupport025.computeSceneWidget0417((byte) 108);
    }

    final void performAction1779(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
        if (integerArgument7 >= -44) {
          this.performAction1781(4, true, -41);
        }
        this.integerState0915 = integerArgument1;
        this.integerState0896 = integerArgument3;
        this.integerState0890 = integerArgument6;
        this.integerState0903 = integerArgument2;
        this.performAction1781(integerArgument4, true, integerArgument5);
    }

    final static int computeInteger1780(int integerArgument1, MixedSupport056 mixedSupport056Argument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        RuntimeException runtimeExceptionLocal8 = null;
        int integerLocal9;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal1 = MixedSupport062.integerState0332;
          if (mixedSupport056Argument2.integerState0290 == 2) {
            if (!mixedSupport056Argument2.booleanState0070) {
              if (mixedSupport056Argument2.integerState0291 == 0 &&
                mixedSupport056Argument2.integerState0286 == 0) {
                integerLocal9 = MixedSupport129.integerArrayState0207[mixedSupport056Argument2.integerState0290];
              } else {
                integerLocal9 = MixedSupport138.integerArrayState0234[mixedSupport056Argument2.integerState0290];
              }
            } else {
              integerLocal9 = MixedSupport062.integerState0332;
            }
          } else {
            if (4 != mixedSupport056Argument2.integerState0290) {
              if (mixedSupport056Argument2.longState0021 != MixedSupport134.longState0050) {
                integerLocal9 = MixedSupport138.integerArrayState0234[mixedSupport056Argument2.integerState0290];
              } else {
                integerLocal9 = MixedSupport129.integerArrayState0207[mixedSupport056Argument2.integerState0290];
              }
            } else {
              integerLocal9 = MixedSupport138.integerArrayState0234[mixedSupport056Argument2.integerState0290];
            }
          }
          if (integerArgument1 != 4636) {
            SceneWidgetPart011.computeSceneWidget1783((byte) 85);
          }
          stackIntegerLocal3 = integerLocal9;
          return stackIntegerLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal7 = caughtParameterLocal10;
          runtimeExceptionLocal8 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal8;
          stackStringBuilderLocal5 = new StringBuilder().append("tc.C(").append(integerArgument1).append(',');
          if (mixedSupport056Argument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    static {
    }
}
