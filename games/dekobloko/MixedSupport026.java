/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport026 extends MixedSupport059 {
    private long longState0008;
    static int integerState0153;
    static SceneWidgetPart008 sceneWidgetPart008State0001;
    static boolean booleanState0028;
    private long[] longArrayState0002;
    private long longState0009;
    static String stringState0127;
    private long longState0010;
    static RgbSprite[] rgbSpriteArrayState0009;
    static String stringState0128;
    static String stringState0129;
    static boolean booleanState0029;
    private int integerState0154;
    private int integerState0155;

    final int computeInteger0419(byte byteArgument1, long longArgument2) {
        int integerLocal1;
        int integerLocal2;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (byteArgument1 != 109) {
          return -6;
        }
        if (this.longState0008 < this.longState0009) {
          this.longState0010 = this.longState0010 + (-this.longState0008 + this.longState0009);
          this.longState0008 = this.longState0008 + (this.longState0009 - this.longState0008);
          this.longState0009 = this.longState0009 + longArgument2;
          return 1;
        }
        integerLocal1 = 0;
        do {
          integerLocal1++;
          this.longState0009 = this.longState0009 + longArgument2;
        } while (integerLocal1 < 10 &&
          this.longState0009 < this.longState0008);
        if (this.longState0009 < this.longState0008) {
          this.longState0009 = this.longState0008;
        }
        return integerLocal1;
    }

    final void performAction0422(int integerArgument1) {
        if (integerArgument1 != -30693) {
          return;
        }
        this.longState0010 = 0L;
        if (this.longState0008 < this.longState0009) {
          this.longState0008 = this.longState0008 + (-this.longState0008 + this.longState0009);
        }
    }

    public static void performAction0424(int integerArgument1) {
        stringState0128 = null;
        stringState0129 = null;
        sceneWidgetPart008State0001 = null;
        stringState0127 = null;
        rgbSpriteArrayState0009 = null;
        if (integerArgument1 <= 65) {
          MixedSupport026.computeMixedSupport0030421((byte) 101);
        }
    }

    final long computeLong0420(int integerArgument1) {
        this.longState0008 = this.longState0008 + this.computeLong0423(-8325);
        if (integerArgument1 != -22962) {
          this.integerState0155 = 53;
        }
        if (this.longState0008 < this.longState0009) {
          return (-this.longState0008 + this.longState0009) / 1000000L;
        }
        return 0L;
    }

    final static MixedSupport003 computeMixedSupport0030421(byte byteArgument1) {
        int integerLocal1 = 0;
        MixedSupport003 mixedSupport003Local2 = null;
        int integerLocal3 = 0;
        MixedSupport003 stackMixedSupport003Local4 = null;
        Throwable caughtExceptionLocal5 = null;
        IllegalArgumentException illegalArgumentExceptionLocal6 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (byteArgument1 < 25) {
            stringState0128 = (String) null;
          }
          integerLocal1 = 0;
          while (true) {
            mixedSupport003Local2 = ReturnedShapeCache.mixedSupport032State0001.computeMixedSupport0030522(-39, integerLocal1);
            if (!mixedSupport003Local2.booleanState0002) {
              integerLocal1++;
              continue;
            }
            break;
          }
          stackMixedSupport003Local4 = mixedSupport003Local2;
          return stackMixedSupport003Local4;
        } catch (java.lang.IllegalArgumentException caughtParameterLocal7) {
          caughtExceptionLocal5 = caughtParameterLocal7;
          illegalArgumentExceptionLocal6 = (IllegalArgumentException) (Object) caughtExceptionLocal5;
          return null;
        }
    }

    private final long computeLong0423(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        long longLocal3 = System.nanoTime();
        long longLocal4 = longLocal3 - this.longState0010;
        if (integerArgument1 != -8325) {
          this.computeLong0420(110);
        }
        this.longState0010 = longLocal3;
        if (longLocal4 > -5000000000L &&
          longLocal4 < 5000000000L) {
          this.longArrayState0002[this.integerState0155] = longLocal4;
          if (this.integerState0154 < 1) {
            this.integerState0154 = this.integerState0154 + 1;
          }
          this.integerState0155 = (1 + this.integerState0155) % 10;
        }
        long longLocal5 = 0L;
        for (integerLocal1 = 1; integerLocal1 <= this.integerState0154; integerLocal1++) {
          longLocal5 = longLocal5 + this.longArrayState0002[(10 + (this.integerState0155 - integerLocal1)) % 10];
        }
        return longLocal5 / (long)this.integerState0154;
    }

    MixedSupport026() {
        this.longState0008 = 0L;
        this.longState0010 = 0L;
        this.longArrayState0002 = new long[10];
        this.integerState0154 = 1;
        this.integerState0155 = 0;
        this.longState0009 = 0L;
        this.longState0008 = System.nanoTime();
        this.longState0009 = System.nanoTime();
    }

    static {
        stringState0127 = "Service unavailable";
        stringState0128 = "Flowers";
        integerState0153 = 20;
        stringState0129 = "Match 4 or more to make them disappear, like this:";
        rgbSpriteArrayState0009 = new RgbSprite[8];
    }
}
