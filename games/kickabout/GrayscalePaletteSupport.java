/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrayscalePaletteSupport {
    static UiLayoutNode field_a;
    static int[] field_b;

    final static void initializeGrayscalePalette(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Kickabout.field_G;
        try {
          WhirlpoolHasher.field_d = new int[16];
          if (param0) {
            return;
          }
          for (var1_int = 0; var1_int < WhirlpoolHasher.field_d.length; var1_int++) {
            WhirlpoolHasher.field_d[var1_int] = (var1_int << 2) * 65793;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "g.A(" + param0 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_b = null;
        if (!param0) {
          field_a = (UiLayoutNode) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_b = new int[5];
        field_b[0] = 286720;
        field_b[3] = 163840;
        field_b[4] = 327680;
        field_b[2] = 163840;
        field_b[1] = 163840;
    }
}
