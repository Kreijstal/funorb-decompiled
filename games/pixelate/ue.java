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
        int[] var7 = null;
        int[] var8 = null;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              var8 = new int[la.field_a.length];
              var7 = var8;
              var3 = var7;
              if (param1 == 118) {
                break L1;
              } else {
                field_p = (String) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var8.length <= var4) {
                var4 = ok.a(tg.field_f, param1 ^ -3, var2_int);
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var8.length) {
                    stackOut_15_0 = ok.a(tg.field_f, -125, la.field_a.length);
                    stackIn_16_0 = stackOut_15_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4 = var4 - var8[var5];
                    if (var4 <= 0) {
                      stackOut_12_0 = var5;
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var5++;
                      continue L3;
                    }
                  }
                }
              } else {
                L4: {
                  var3[var4] = -Math.abs(param0 + -la.field_a[var4]) + 30;
                  if (var8[var4] >= 0) {
                    break L4;
                  } else {
                    var8[var4] = 0;
                    break L4;
                  }
                }
                var2_int = var2_int + var8[var4];
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ue.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0;
        } else {
          return stackIn_16_0;
        }
    }

    final static boolean a(byte param0) {
        int var1 = -8 % ((18 - param0) / 51);
        return ka.field_W != null ? true : false;
    }

    public static void a(int param0) {
        field_p = null;
        field_t = null;
        field_q = null;
        if (param0 != 30) {
            field_q = (String) null;
        }
    }

    final static void b(int param0, byte param1) {
        fa var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        hf var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 42) {
                break L1;
              } else {
                field_p = (String) null;
                break L1;
              }
            }
            var4 = (hf) ((Object) dh.field_a.c(1504642273));
            L2: while (true) {
              if (var4 == null) {
                var2 = tj.field_z.c(1504642273);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    ro.a(126, param0);
                    var2 = tj.field_z.f(1504642273);
                    continue L3;
                  }
                }
              } else {
                id.a((byte) -117, var4, param0);
                var4 = (hf) ((Object) dh.field_a.f(param1 + 1504642231));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "ue.B(" + param0 + ',' + param1 + ')');
        }
    }

    ue() {
    }

    static {
        field_q = "Change display name";
        field_p = "Invalid date";
    }
}
