/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tl {
    int field_h;
    int field_k;
    int field_c;
    static boolean field_g;
    int field_j;
    static int[] field_d;
    static bi field_b;
    static int[] field_i;
    static e field_e;
    static int field_f;
    static double[][] field_a;

    final static void a(int param0, String param1, int param2, int param3, int param4, boolean param5, df param6, int param7, boolean param8, long param9, int param10, int param11, int param12) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            try {
              L0: {
                if (param4 == 9737) {
                  L1: {
                    e.field_c = new hb(5000);
                    vh.field_a = new hb(5000);
                    kk.field_b = param7;
                    if (!param8) {
                      stackOut_4_0 = 0;
                      stackIn_5_0 = stackOut_4_0;
                      break L1;
                    } else {
                      stackOut_3_0 = 1;
                      stackIn_5_0 = stackOut_3_0;
                      break L1;
                    }
                  }
                  L2: {
                    na.field_W = stackIn_5_0 != 0;
                    if (!param5) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L2;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L2;
                    }
                  }
                  L3: {
                    d.field_d = stackIn_8_0 != 0;
                    ld.field_k = param6;
                    rg.field_M = param12;
                    ac.field_b = param11;
                    mc.field_a = param9;
                    wm.field_db = param0;
                    af.field_ab = param1;
                    nd.field_s = param10;
                    qa.field_c = param3;
                    if (null == ld.field_k.field_n) {
                      break L3;
                    } else {
                      {
                        L4: {
                          bg.field_b = new pf(ld.field_k.field_n, 64, 0);
                          break L4;
                        }
                      }
                      break L3;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) var15_ref;
                stackOut_13_1 = new StringBuilder().append("tl.A(").append(param0).append(',');
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
                  break L5;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L5;
                }
              }
              L6: {
                stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(5000).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param6 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L6;
                }
              }
              throw sd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + 5000 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static kc a(int param0) {
        if (ci.field_b == null) {
            ci.field_b = new kc();
            ci.field_b.a(false, gm.field_cb);
            ci.field_b.field_e = 0;
            ci.field_b.field_c = 14;
            ci.field_b.field_l = 4;
            ci.field_b.field_i = fa.field_Q;
            ci.field_b.field_v = 6;
            ci.field_b.field_p = 2763306;
            ci.field_b.field_s = 5;
            ci.field_b.field_g = 7697781;
        }
        return ci.field_b;
    }

    public static void a() {
        field_a = null;
        field_e = null;
        field_d = null;
        field_b = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_d = new int[256];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_i = new int[16384];
            field_e = new e(2, 4, 4, 0);
            field_a = new double[][]{null, null, null, null, new double[6], new double[3], new double[6], new double[6], null, new double[3], new double[3], new double[3], new double[3]};
            return;
          } else {
            field_d[var0] = 65793 * var0;
            var0++;
            continue L0;
          }
        }
    }
}
