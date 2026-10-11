/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SceneWidgetPart002 extends SceneWidget {
    static int[] integerArrayState0049;
    static String stringState0193;
    private RgbSprite[] rgbSpriteArrayState0014;
    static boolean booleanState0051;
    private SceneWidgetPart009[] sceneWidgetPart009ArrayState0001;
    static int integerState0241;
    private int integerState0242;
    private int integerState0243;
    private int integerState0244;
    private SceneWidget sceneWidgetState0036;
    private SceneWidget sceneWidgetState0037;
    private int integerState0245;
    private int[] integerArrayState0050;
    private int integerState0246;
    private int integerState0247;
    static String stringState0194;
    private int integerState0248;
    static int integerState0249;

    final boolean computeBoolean0624(int integerArgument1) {
        if (this.integerState0246 != -2) {
          return false;
        }
        int integerLocal1 = -62 % ((-76 - integerArgument1) / 48);
        if (MixedSupport153.integerState0931 != 13) {
          return true;
        }
        this.integerState0246 = -1;
        return true;
    }

    final int computeInteger0622(int integerArgument1, boolean booleanArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal3;
        this.performAction2002(false, booleanArgument2);
        if (!booleanArgument2) {
          return -2;
        }
        for (integerLocal1 = 0; integerLocal1 < this.integerState0243; integerLocal1++) {
          if (this.sceneWidgetPart009ArrayState0001[integerLocal1].integerState0891 != 0) {
            return this.integerArrayState0050[integerLocal1];
          }
        }
        if (0 != SceneWidgetPart005.integerState0328) {
          return -1;
        }
        integerLocal3 = -1 / ((integerArgument1 - 52) / 63);
        return this.integerState0246;
    }

    final void performAction0621(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        String stringLocal7;
        int integerLocal8;
        int integerLocal9;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (0 == this.integerState0243) {
          this.sceneWidgetPart009ArrayState0001[this.integerState0243] = new SceneWidgetPart009(0L, (SceneWidget) null, (SceneWidget) null, this.sceneWidgetState0037, (RgbSprite) null, MixedSupport099.stringState0394);
          this.sceneWidgetPart009ArrayState0001[this.integerState0243].integerState0885 = 1;
          this.performAction1998(this.sceneWidgetPart009ArrayState0001[this.integerState0243], -16834);
          this.integerArrayState0050[this.integerState0243] = -1;
          this.integerState0243 = this.integerState0243 + 1;
        }
        integerLocal2 = 0;
        for (integerLocal3 = 0; this.integerState0243 > integerLocal3; integerLocal3++) {
          integerLocal4 = this.sceneWidgetPart009ArrayState0001[integerLocal3].computeInteger1517(this.integerState0245, this.integerState0248, 1940);
          if (integerLocal2 < integerLocal4) {
            integerLocal2 = integerLocal4;
          }
        }
        integerLocal2 = integerLocal2 + this.integerState0244 * 2;
        integerLocal8 = this.integerState0243 * this.integerState0247 + this.integerState0242 + this.integerState0242;
        integerLocal9 = MixedSupport146.computeInteger1953(integerArgument5, -18265, integerLocal2, integerArgument2);
        integerLocal5 = MixedSupport093.computeInteger1303(integerArgument4, 0, integerLocal8, integerArgument1);
        this.performAction1994(integerLocal2, 0, integerLocal5, integerLocal8, integerLocal9);
        if (integerArgument3 < 38) {
          stringLocal7 = (String) null;
          this.performAction0620((String) null, -17, -15);
        }
        for (integerLocal1 = 0; integerLocal1 < this.integerState0243; integerLocal1++) {
          this.sceneWidgetPart009ArrayState0001[integerLocal1].performAction1515(this.integerState0247, this.integerState0245, this.integerState0244, this.integerState0242 + this.integerState0247 * integerLocal1, -(this.integerState0244 * 2) + integerLocal2, this.integerState0248, 500);
        }
    }

    final static void performAction0617(int integerArgument1, String stringArgument2) {
        MixedSupport115.performAction1657((byte) 73, stringArgument2);
        if (integerArgument1 >= -68) {
          return;
        }
        try {
          MixedSupport154.performAction2044(false, -106, MixedSupport066.stringState0273);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "gb.D(" + integerArgument1 + ',' + (stringArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean computeBoolean0618(int integerArgument1, ResourceArchive resourceArchiveArgument2, int integerArgument3, int integerArgument4) {
        byte[] byteArrayLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        byte[] byteArrayLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          byteArrayLocal3 = resourceArchiveArgument2.computeByteArray0912(integerArgument3, 108, integerArgument1);
          byteArrayLocal1 = byteArrayLocal3;
          if (integerArgument4 <= 34) {
            return true;
          }
          if (byteArrayLocal3 == null) {
            return false;
          }
          Framebuffer.performAction0465((byte) -72, byteArrayLocal3);
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("gb.K(").append(integerArgument1).append(',');
          if (resourceArchiveArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final static void performAction0619(int integerArgument1, boolean booleanArgument2, byte byteArgument3, int integerArgument4) {
        if (!GameDomainSupport004.booleanState0087) {
          return;
        }
        MixedSupport059.sceneWidgetState0055.performAction2002(false, booleanArgument2);
        int integerLocal1 = SceneWidgetPart007.sceneWidgetPart005State0002.computeBoolean0805(-1) ? 1 : 0;
        if (SceneWidgetPart005.integerState0328 != 0 &&
          integerLocal1 == 0) {
          booleanArgument2 = false;
          UiComponentPart026.performAction1582(13);
        }
        if (booleanArgument2) {
          SceneWidgetPart007.sceneWidgetPart005State0002.performAction0797(integerArgument4, integerArgument1, -115);
        }
        if (integerLocal1 != 0) {
          MixedSupport059.sceneWidgetState0055.performAction2002(false, booleanArgument2);
        }
        int integerLocal2 = -27 % ((byteArgument3 + 66) / 56);
        int integerLocal3 = SceneWidgetPart007.sceneWidgetPart005State0002.computeInteger0807(-108) + SceneWidgetPart007.sceneWidgetPart005State0002.integerState0892;
        if (integerLocal3 > 640) {
          MixedSupport077.integerState0416 = MixedSupport077.integerState0416 + 5;
        } else {
          if (integerLocal3 < 635 &&
            !(0 >= MixedSupport077.integerState0416)) {
            MixedSupport077.integerState0416 = MixedSupport077.integerState0416 - 5;
          }
        }
    }

    final void performAction0616(int integerArgument1, int integerArgument2, RgbSprite rgbSpriteArgument3, String stringArgument4) {
        this.sceneWidgetPart009ArrayState0001[this.integerState0243] = new SceneWidgetPart009(0L, (SceneWidget) null, (SceneWidget) null, this.sceneWidgetState0036, rgbSpriteArgument3, stringArgument4);
        this.sceneWidgetPart009ArrayState0001[this.integerState0243].rgbSpriteArrayState0035 = this.rgbSpriteArrayState0014;
        this.sceneWidgetPart009ArrayState0001[this.integerState0243].booleanState0214 = true;
        this.sceneWidgetPart009ArrayState0001[this.integerState0243].integerState0885 = 1;
        this.performAction1998(this.sceneWidgetPart009ArrayState0001[this.integerState0243], -16834);
        this.integerArrayState0050[this.integerState0243] = integerArgument2;
        if (integerArgument1 != 4193) {
          return;
        }
        try {
          this.integerState0243 = this.integerState0243 + 1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "gb.C(" + integerArgument1 + ',' + integerArgument2 + ',' + (rgbSpriteArgument3 != null ? "{...}" : "null") + ',' + (stringArgument4 != null ? "{...}" : "null") + ')');
        }
    }

    SceneWidgetPart002(SceneWidgetPart002 sceneWidgetPart002Argument1) {
        this(sceneWidgetPart002Argument1, sceneWidgetPart002Argument1.rgbSpriteArrayState0014, sceneWidgetPart002Argument1.sceneWidgetState0037, sceneWidgetPart002Argument1.sceneWidgetState0036, sceneWidgetPart002Argument1.integerState0244, sceneWidgetPart002Argument1.integerState0245, sceneWidgetPart002Argument1.integerState0248, sceneWidgetPart002Argument1.integerState0242, sceneWidgetPart002Argument1.integerState0247);
    }

    SceneWidgetPart002(SceneWidget sceneWidgetArgument1, RgbSprite[] rgbSpriteArrayArgument2, SceneWidget sceneWidgetArgument3, SceneWidget sceneWidgetArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9) {
        super(0L, sceneWidgetArgument1);
        this.sceneWidgetPart009ArrayState0001 = new SceneWidgetPart009[256];
        this.integerArrayState0050 = new int[256];
        this.integerState0246 = -2;
        try {
          this.sceneWidgetState0036 = sceneWidgetArgument4;
          this.integerState0244 = integerArgument5;
          this.integerState0247 = integerArgument9;
          this.integerState0245 = integerArgument6;
          this.integerState0248 = integerArgument7;
          this.sceneWidgetState0037 = sceneWidgetArgument3;
          this.rgbSpriteArrayState0014 = rgbSpriteArrayArgument2;
          this.integerState0242 = integerArgument8;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "gb.<init>(" + (sceneWidgetArgument1 != null ? "{...}" : "null") + ',' + (rgbSpriteArrayArgument2 != null ? "{...}" : "null") + ',' + (sceneWidgetArgument3 != null ? "{...}" : "null") + ',' + (sceneWidgetArgument4 != null ? "{...}" : "null") + ',' + integerArgument5 + ',' + integerArgument6 + ',' + integerArgument7 + ',' + integerArgument8 + ',' + integerArgument9 + ')');
        }
    }

    final void performAction0620(String stringArgument1, int integerArgument2, int integerArgument3) {
        try {
          this.sceneWidgetPart009ArrayState0001[this.integerState0243] = new SceneWidgetPart009(0L, (SceneWidget) null, (SceneWidget) null, this.sceneWidgetState0036, (RgbSprite) null, stringArgument1);
          this.sceneWidgetPart009ArrayState0001[this.integerState0243].rgbSpriteArrayState0035 = this.rgbSpriteArrayState0014;
          this.sceneWidgetPart009ArrayState0001[this.integerState0243].booleanState0214 = true;
          this.sceneWidgetPart009ArrayState0001[this.integerState0243].integerState0885 = 1;
          int integerLocal1 = -81 / ((24 - integerArgument3) / 32);
          this.performAction1998(this.sceneWidgetPart009ArrayState0001[this.integerState0243], -16834);
          this.integerArrayState0050[this.integerState0243] = integerArgument2;
          this.integerState0243 = this.integerState0243 + 1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "gb.L(" + (stringArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ')');
        }
    }

    public static void performAction0623(int integerArgument1) {
        stringState0193 = null;
        integerArrayState0049 = null;
        stringState0194 = null;
        if (integerArgument1 != -2) {
          integerState0241 = -46;
        }
    }

    static {
        stringState0193 = "Join";
        integerState0241 = 0;
        stringState0194 = "Encouraging rule breaking";
        integerArrayState0049 = new int[12];
        integerState0249 = integerState0241;
    }
}
