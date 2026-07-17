/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class dc extends a {
    static wb field_k;
    static o field_n;
    static String field_l;
    static String field_m;
    static int field_o;
    static String field_p;
    static o field_j;
    static java.awt.Canvas field_q;

    final static void d() {
        if (null != ah.field_e) {
            ah.field_e.f(true);
        }
        sj.field_d = new ga();
        gf.field_cb.c(-3399, (rc) (Object) sj.field_d);
    }

    public static void e() {
        field_j = null;
        field_l = null;
        field_q = null;
        field_k = null;
        field_m = null;
        field_p = null;
        field_n = null;
    }

    final qf a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        qf stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        qf stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              int discarded$10 = -112;
              if (null != wd.a(param0)) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_3_0;
              if (param1 <= -109) {
                break L2;
              } else {
                field_m = null;
                break L2;
              }
            }
            if (var3_int == 0) {
              stackOut_7_0 = rg.field_f;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              return ph.field_g;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("dc.J(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0;
    }

    dc(vg param0) {
        super(param0);
    }

    final static uj[] a(byte param0, dl param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        uj[] var4 = null;
        int var5 = 0;
        uj var6 = null;
        int var7 = 0;
        nj var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        uj[] stackIn_4_0 = null;
        uj[] stackIn_11_0 = null;
        uj[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        uj[] stackOut_3_0 = null;
        uj[] stackOut_10_0 = null;
        uj[] stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (!param1.b((byte) 31)) {
              stackOut_3_0 = new uj[]{};
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var8 = param1.a(7721);
              L1: while (true) {
                if (0 != var8.field_c) {
                  if (var8.field_c == 2) {
                    stackOut_10_0 = new uj[]{};
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  } else {
                    var12 = (int[]) var8.field_e;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = new uj[var12.length >> 2];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4.length) {
                        var5 = 56 / ((57 - param0) / 58);
                        stackOut_15_0 = (uj[]) var4;
                        stackIn_16_0 = stackOut_15_0;
                        break L0;
                      } else {
                        var6 = new uj();
                        var4[var5] = var6;
                        var6.field_c = var3[var5 << 2];
                        var6.field_d = var3[(var5 << 2) - -1];
                        var6.field_e = var3[2 + (var5 << 2)];
                        var6.field_a = var3[3 + (var5 << 2)];
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  i.a((byte) 82, 10L);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("dc.S(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0;
    }

    final static void a(dj param0) {
        jd var3 = id.field_c;
        try {
            var3.e(7, -2147483648);
            var3.c(36, param0.field_i);
            var3.c(108, param0.field_h);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "dc.I(" + (param0 != null ? "{...}" : "null") + 44 + 7 + 44 + 46 + 41);
        }
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var4 = null;
                uj[] discarded$2 = dc.a((byte) -32, (dl) null);
                break L1;
              }
            }
            if (((dc) this).a(param0, (byte) -112) != rg.field_f) {
              stackOut_5_0 = (String) field_l;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = fg.field_e;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("dc.K(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_6_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new wb(3);
        field_l = "Email is valid";
        field_m = "CURRENT<br>SCORE";
        field_p = "Members' Benefits";
    }
}
