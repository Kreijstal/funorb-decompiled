/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class hc extends mf {
    private static int[] field_l;
    static int field_o;
    private fe field_k;
    private boolean field_n;
    private String field_m;

    final static void f(int param0) {
        de.a((byte) -52, we.field_a, sf.field_a, true);
        ga.field_a = true;
    }

    public static void g(int param0) {
        field_l = null;
        if (param0 != 2098078177) {
            field_l = null;
        }
    }

    final static boolean a(int param0, int param1) {
        try {
            if (!(nk.field_N.field_m < param0)) {
                return true;
            }
            if (jc.field_H == null) {
                return false;
            }
            int var2_int = jc.field_H.c((byte) 89);
            if (var2_int > 0) {
                if (-nk.field_N.field_m + param0 < var2_int) {
                    var2_int = -nk.field_N.field_m + param0;
                }
                jc.field_H.a(nk.field_N.field_k, 114, var2_int, nk.field_N.field_m);
                eg.field_C = d.a((byte) 29);
                nk.field_N.field_m = nk.field_N.field_m + var2_int;
                if (param0 > nk.field_N.field_m) {
                    return false;
                }
                nk.field_N.field_m = 0;
                return true;
            }
            {
                if (var2_int >= 0) {
                    if (30000L >= eh.a(2)) {
                        return false;
                    }
                }
                ql.a(-114);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((hc) this).field_k.a(param1, param0) != hg.field_c) {
              if (((hc) this).a(-1, param0) != hg.field_c) {
                stackOut_6_0 = eh.field_h;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = wl.field_d;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = ((hc) this).field_k.a(param0, -1);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("hc.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final static void c(boolean param0) {
        if (!f.field_e) {
            if (null == ok.field_c) {
                ok.field_c = dc.a((byte) 103, 4);
            }
            if (ok.field_c.field_i) {
                qf.field_l = qf.field_l & ~ok.field_c.field_j;
                ti.field_a = ti.field_a | ok.field_c.field_j;
                ok.field_c = null;
                f.field_e = true;
            }
        }
        if (!e.field_a) {
            if (!(null != rf.field_a)) {
                rf.field_a = ff.c(5, 1, 2, 0);
            }
            if (!(!rf.field_a.field_j)) {
                if (rf.field_a.field_n[0] > pl.field_A) {
                    pl.field_A = rf.field_a.field_n[0];
                }
                e.field_a = true;
                rf.field_a = null;
            }
        }
        if (f.field_e) {
            if (!(!e.field_a)) {
                cf.a((byte) 79);
            }
        }
    }

    final static void a(pg param0, boolean param1, int param2) {
        try {
            sf.field_j.a((wl) (Object) param0, false);
            pg.a(4, true, param0);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "hc.I(" + (param0 != null ? "{...}" : "null") + ',' + false + ',' + 4 + ')');
        }
    }

    hc(og param0, og param1) {
        super(param0);
        ((hc) this).field_n = false;
        ((hc) this).field_m = "";
        try {
            ((hc) this).field_k = new fe(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "hc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ok a(int param0, String param1) {
        sf var3 = null;
        RuntimeException var3_ref = null;
        ok stackIn_3_0 = null;
        ok stackIn_7_0 = null;
        ok stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ok stackOut_2_0 = null;
        ok stackOut_6_0 = null;
        ok stackOut_11_0 = null;
        ok stackOut_10_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((hc) this).field_k.a(param0, param1) == hg.field_c) {
              stackOut_2_0 = hg.field_c;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1.equals((Object) (Object) ((hc) this).field_m)) {
                  break L1;
                } else {
                  var3 = ad.a(param1, 6);
                  if (var3.a(true)) {
                    ((hc) this).field_m = param1;
                    ((hc) this).field_n = var3.b(25843);
                    break L1;
                  } else {
                    stackOut_6_0 = l.field_S;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                }
              }
              L2: {
                if (!((hc) this).field_n) {
                  stackOut_11_0 = hg.field_c;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = gf.field_V;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("hc.C(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_o = 200;
        field_l = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
            var6 = (long)(1 + (var0 << 1));
            var4 = (long)((var0 << 1) + -1);
            var2 = (int)(-32768L + (var4 * var4 >> 18));
            var3 = (int)(-32768L + (var6 * var6 >> 18));
            if (var3 >= field_l.length) {
                var3 = -1 + field_l.length;
            }
            for (var1 = 0 <= var2 ? var2 : 0; var1 <= var3; var1++) {
                field_l[var1] = var0;
            }
        }
    }
}
