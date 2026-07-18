/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wg {
    private mg[] field_g;
    static boolean field_f;
    static String field_b;
    static int field_e;
    static boolean field_c;
    static int[] field_h;
    static volatile boolean field_a;
    static String field_d;

    final static boolean a(int param0, int param1) {
        try {
            if (sh.field_qb.field_l >= param0) {
                return true;
            }
            if (!(null != oj.field_Ub)) {
                return false;
            }
            int var2_int = oj.field_Ub.f(31479);
            if (!(0 >= var2_int)) {
                if (var2_int > -sh.field_qb.field_l + param0) {
                    var2_int = param0 - sh.field_qb.field_l;
                }
                oj.field_Ub.a(var2_int, sh.field_qb.field_g, -1, sh.field_qb.field_l);
                fa.field_l = hc.a(-9986);
                sh.field_qb.field_l = sh.field_qb.field_l + var2_int;
                if (!(sh.field_qb.field_l >= param0)) {
                    return false;
                }
                sh.field_qb.field_l = 0;
                return true;
            }
            {
                if (0 <= var2_int) {
                    if (af.b(-126) <= 30000L) {
                        return false;
                    }
                }
                tn.a(false);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_h = null;
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        tm.a(param0, param4, param2, param3, param1, ((wg) this).field_g);
    }

    wg(mg[] param0) {
        try {
            ((wg) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "wg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, long param3, pd param4, boolean param5, int param6, boolean param7, int param8, int param9, int param10, String param11, int param12, int param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              L0: {
                sh.field_qb = new hg(5000);
                gk.field_g = new hg(5000);
                oj.field_Yb = param10;
                wc.field_m = param0;
                uh.field_b = param12;
                m.field_m = param9;
                fj.field_c = param11;
                qc.field_f = param4;
                if (!param5) {
                  stackOut_2_0 = 0;
                  stackIn_3_0 = stackOut_2_0;
                  break L0;
                } else {
                  stackOut_1_0 = 1;
                  stackIn_3_0 = stackOut_1_0;
                  break L0;
                }
              }
              L1: {
                field_c = stackIn_3_0 != 0;
                vi.field_n = param3;
                cj.field_c = param2;
                if (!param7) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              el.field_k = stackIn_6_0 != 0;
              tn.field_i = param13;
              if (qc.field_f.field_o != null) {
                {
                  L2: {
                    gh.field_Ib = new nh(qc.field_f.field_o, 64, 0);
                    break L2;
                  }
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_12_0 = (RuntimeException) var15_ref;
                stackOut_12_1 = new StringBuilder().append("wg.B(").append(param0).append(',').append(5000).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param4 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L3;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L3;
                }
              }
              L4: {
                stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(64).append(',').append(param7).append(',').append(5000).append(',').append(param9).append(',').append(param10).append(',');
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param11 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L4;
                } else {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L4;
                }
              }
              throw kg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = true;
        field_e = 4;
        field_b = "Join";
        field_d = "Players";
        field_a = false;
    }
}
