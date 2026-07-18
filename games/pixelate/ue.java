/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ue extends fa {
    int[][] field_l;
    static ak field_t;
    static String field_q;
    String[][] field_r;
    int field_s;
    int field_o;
    static String field_p;
    boolean field_n;
    int field_m;
    long[][] field_k;

    final static int a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = new int[la.field_a.length];
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                var4 = ok.a(tg.field_f, -117, var2_int);
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3.length) {
                    stackOut_13_0 = ok.a(tg.field_f, -125, la.field_a.length);
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    var4 = var4 - var3[var5];
                    if (var4 <= 0) {
                      stackOut_10_0 = var5;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  var3[var4] = -Math.abs(param0 + -la.field_a[var4]) + 30;
                  if (var3[var4] >= 0) {
                    break L3;
                  } else {
                    var3[var4] = 0;
                    break L3;
                  }
                }
                var2_int = var2_int + var3[var4];
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ue.C(" + param0 + ',' + 118 + ')');
        }
        return stackIn_14_0;
    }

    final static boolean a(byte param0) {
        int var1 = -8 % ((18 - param0) / 51);
        return ka.field_W != null ? true : false;
    }

    public static void a() {
        field_p = null;
        field_t = null;
        field_q = null;
    }

    final static void b() {
        fa var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        hf var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var4 = (hf) (Object) dh.field_a.c(1504642273);
            L1: while (true) {
              if (var4 == null) {
                var2 = tj.field_z.c(1504642273);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    ro.a(126, 4);
                    var2 = tj.field_z.f(1504642273);
                    continue L2;
                  }
                }
              } else {
                id.a((byte) -117, var4, 4);
                var4 = (hf) (Object) dh.field_a.f(1504642273);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2_ref, "ue.B(" + 4 + ',' + 42 + ')');
        }
    }

    ue() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Change display name";
        field_p = "Invalid date";
    }
}
