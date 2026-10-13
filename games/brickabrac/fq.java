/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fq {
    static java.util.zip.CRC32 archiveCrc;
    static RgbSprite[] field_d;
    static RgbSprite[] field_c;
    static int[] field_e;
    static int field_b;

    final static void a(int param0, int param1, int param2, RgbSprite[] param3, int param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param3 != null &&
            param0 > 0) {
            if (param2 != 743) {
              fq.a((byte) 123);
            }
            var5_int = param3[0].canvasWidth;
            var6 = param3[2].canvasWidth;
            var7 = param3[1].canvasWidth;
            param3[0].drawTransparent(param4, param1);
            param3[2].drawTransparent(param4 + param0 - var6, param1);
            Rasterizer2D.saveClip(RasterCacheSurface.field_n);
            Rasterizer2D.intersectClip(param4 + var5_int, param1, param0 + param4 - var6, param3[1].canvasHeight + param1);
            var8 = param4 + var5_int;
            var9 = param4 - (-param0 + var6);
            for (param4 = var8; var9 > param4; param4 = param4 + var7) {
              param3[1].drawTransparent(param4, param1);
            }
            Rasterizer2D.restoreClip(RasterCacheSurface.field_n);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("fq.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        ug.field_I = param1;
        if (param0 > 83) {
          qh.field_d = param3;
          om.field_hc = param2;
          return;
        }
        fq.a((byte) -44, 39, -69, 32);
        qh.field_d = param3;
        om.field_hc = param2;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 15) {
          return;
        }
        archiveCrc = null;
        field_e = null;
        field_c = null;
    }

    static {
        archiveCrc = new java.util.zip.CRC32();
        field_b = 97;
        field_e = new int[]{1, 2, 3, 3, 5, 1, 3, 3, 5, 2, 5, 5, 5, 10, 3, 10, 1, 3, 5, 3, 5, 10, 5, 3, 5, 10, 3, 2, 5, 2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 5, 10, 2};
    }
}
