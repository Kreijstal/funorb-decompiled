/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpecularTableHelpers {
    static String field_a;

    final static void buildSpecularTable(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = ZombieDawn.field_J;
        try {
          TriangleRasterizer.useRasterClip();
          SweepingSpotlight.field_H = new int[260];
          GlowAreaSupport.field_a = 11;
          if (param0 != 255) {
            field_a = (String) null;
          }
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            SweepingSpotlight.field_H[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (SweepingSpotlight.field_H.length > var5) {
            SweepingSpotlight.field_H[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var1), "ta.A(" + param0 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          return;
        }
        field_a = null;
    }

    static {
        field_a = "Player";
    }
}
