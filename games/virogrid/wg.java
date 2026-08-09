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
            if (!(param1 >= var2_int)) {
                if (var2_int > -sh.field_qb.field_l + param0) {
                    var2_int = param0 - sh.field_qb.field_l;
                }
                oj.field_Ub.a(var2_int, sh.field_qb.field_g, param1 + -1, sh.field_qb.field_l);
                fa.field_l = hc.a(-9986);
                sh.field_qb.field_l = sh.field_qb.field_l + var2_int;
                if (!(sh.field_qb.field_l >= param0)) {
                    return false;
                }
                sh.field_qb.field_l = 0;
                return true;
            }
            try {
                if (false) throw (IOException) null;
                if (0 <= var2_int && af.b(-126) <= 30000L) {
                    return false;
                }
                tn.a(false);
            } catch (IOException iOException) {
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
        if (param0 != 0) {
            field_c = true;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        tm.a(param0, param4, param2, param3, param1, this.field_g);
    }

    wg(mg[] param0) {
        try {
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "wg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, long param3, pd param4, boolean param5, int param6, boolean param7, int param8, int param9, int param10, String param11, int param12, int param13) {
        try {
            int stackIn_3_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            StringBuilder stackIn_19_1 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                sh.field_qb = new hg(param1);
                gk.field_g = new hg(param8);
                oj.field_Yb = param10;
                wc.field_m = param0;
                uh.field_b = param12;
                m.field_m = param9;
                fj.field_c = param11;
                qc.field_f = param4;
                if (!param5) {
                  stackIn_3_0 = 0;
                  break L0;
                } else {
                  stackIn_3_0 = 1;
                  break L0;
                }
              }
              L1: {
                field_c = stackIn_3_0 != 0;
                if (param6 == 64) {
                  break L1;
                } else {
                  field_c = true;
                  break L1;
                }
              }
              L2: {
                vi.field_n = param3;
                cj.field_c = param2;
                if (!param7) {
                  stackIn_8_0 = 0;
                  break L2;
                } else {
                  stackIn_8_0 = 1;
                  break L2;
                }
              }
              el.field_k = stackIn_8_0 != 0;
              tn.field_i = param13;
              if (qc.field_f.field_o != null) {
                try {
                  L3: {
                    gh.field_Ib = new nh(qc.field_f.field_o, 64, 0);
                    break L3;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var15 = (IOException) (Object) decompiledCaughtException;
                  throw new RuntimeException(var15.toString());
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var15_ref);

                stackIn_16_1 = new StringBuilder().append("wg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L4;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');

                if (param11 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L5;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L5;
                }
              }
              throw kg.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = true;
        field_e = 4;
        field_b = "Join";
        field_d = "Players";
        field_a = false;
    }
}
