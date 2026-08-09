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

    final static void a(int param0, String param1, int param2, int param3, int param4, boolean param5, df param6, int param7, boolean param8, long param9, int param10, int param11, int param12, int param13) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                if (param4 == 9737) {
                  L1: {
                    e.field_c = new hb(param2);
                    vh.field_a = new hb(param13);
                    kk.field_b = param7;
                    if (!param8) {
                      stackIn_5_0 = 0;
                      break L1;
                    } else {
                      stackIn_5_0 = 1;
                      break L1;
                    }
                  }
                  L2: {
                    na.field_W = stackIn_5_0 != 0;
                    if (!param5) {
                      stackIn_8_0 = 0;
                      break L2;
                    } else {
                      stackIn_8_0 = 1;
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
                      try {
                        L4: {
                          bg.field_b = new pf(ld.field_k.field_n, 64, 0);
                          break L4;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var15 = (IOException) (Object) decompiledCaughtException;
                        throw new RuntimeException(var15.toString());
                      }
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var15_ref);

                stackIn_15_1 = new StringBuilder().append("tl.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

                if (param6 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L6;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L6;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
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
        if (param0 != 4314) {
            field_i = (int[]) null;
        }
        return ci.field_b;
    }

    public static void a(byte param0) {
        field_a = (double[][]) null;
        field_e = null;
        field_d = null;
        if (param0 < 102) {
            field_e = (e) null;
        }
        field_b = null;
        field_i = null;
    }

    static {
        int var0 = 0;
        field_d = new int[256];
        for (var0 = 0; var0 < 256; var0++) {
            field_d[var0] = 65793 * var0;
        }
        field_i = new int[16384];
        field_e = new e(2, 4, 4, 0);
        field_a = new double[][]{null, null, null, null, new double[]{-472.0, -288.0, 576.0, 472.0, -288.0, 576.0}, new double[]{0.0, 628.0, -392.0}, new double[]{-160.0, -32.0, -372.0, 160.0, -32.0, -372.0}, new double[]{-400.0, 0.0, 64.0, 400.0, 0.0, 64.0}, null, new double[]{0.0, 0.0, 140.0}, new double[]{0.0, -34.0, 214.0}, new double[]{0.0, 0.0, 140.0}, new double[]{0.0, 0.0, -120.0}};
    }
}
