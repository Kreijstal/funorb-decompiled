/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vc {
    private static long[] field_g;
    static java.util.zip.CRC32 field_c;
    static String field_f;
    static int field_a;
    static boolean[][][] field_d;
    static int[][] field_b;
    static boolean field_e;

    public static void a(boolean param0) {
        if (param0) {
            vc.a(true);
        }
        field_b = (int[][]) null;
        field_f = null;
        field_c = null;
        field_d = (boolean[][][]) null;
        field_g = null;
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
            return true;
        }
        return gi.field_c;
    }

    static {
        $cfr$clinit: {
            long var0 = 0L;
            int var2 = 0;
            int var3 = 0;
            field_g = new long[256];
            var2 = 0;
            L0: while (true) {
              if (-257 >= (var2 ^ -1)) {
                field_c = new java.util.zip.CRC32();
                field_a = 0;
                field_b = new int[][]{new int[]{16, 48}, new int[]{16, 27}};
                field_d = new boolean[][][]{new boolean[][]{new boolean[]{false, false, true}, new boolean[]{false, true}, new boolean[]{false, true}, new boolean[]{true, true, true, true, true, true}, new boolean[]{false, true}, new boolean[]{false}, new boolean[]{true, true, true, true, true, true}}, new boolean[][]{new boolean[]{false, true}, new boolean[]{false, false, false, true}, new boolean[]{false, false, false, false, false, true}, new boolean[]{false, true, true, false, true, false}, new boolean[]{false, false, false, false, true}, new boolean[]{false, false, false, false, true}, new boolean[]{false}}, new boolean[][]{new boolean[]{false, false, true}, new boolean[]{false, true}, new boolean[]{false, false, false, true}, new boolean[]{false, true, true, true, true, true}, new boolean[]{false, false, true}, new boolean[]{false}, new boolean[]{true, true, true, true, true, true}}};
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= 8) {
                    field_g[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if (1L == (var0 & 1L)) {
                      var0 = -3932672073523589310L ^ var0 >>> -1530602751;
                      var3++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
