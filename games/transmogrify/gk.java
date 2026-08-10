/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gk {
    static tf field_d;
    static int field_f;
    static int field_e;
    static String field_a;
    static ti[] field_c;
    static String field_g;
    static tf field_b;

    final static boolean a(boolean param0, int param1) {
        try {
            long dupTemp$1 = 0L;
            int var2 = 0;
            hj var2_ref_hj = null;
            IOException var2_ref_IOException = null;
            int stackIn_10_0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null != fk.field_F) {
                break L0;
              } else {
                fk.field_F = l.field_b.a(52, ai.field_d, lf.field_c);
                break L0;
              }
            }
            if (-1 == (fk.field_F.field_c ^ -1)) {
              return false;
            } else {
              dupTemp$1 = lk.a(0);
              td.field_b = dupTemp$1;
              wi.field_q = dupTemp$1;
              if (fk.field_F.field_c == 1) {
                try {
                  L1: {
                    L2: {
                      nk.field_b = new gj((java.net.Socket) (fk.field_F.field_g), l.field_b);
                      ff.field_D.field_h = 0;
                      var2_ref_hj = nf.field_l;
                      var2_ref_hj.field_h = 0;
                      if (param0) {
                        stackIn_10_0 = -2;
                        break L2;
                      } else {
                        stackIn_10_0 = -1;
                        break L2;
                      }
                    }
                    bd.field_t = stackIn_10_0;
                    nf.field_k = stackIn_10_0;
                    dg.field_a = stackIn_10_0;
                    lj.field_z = jk.field_y;
                    qb.a(124, pi.field_h, ff.field_D, dh.field_x, ua.field_c);
                    rb.a(-1, -377);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref_IOException = (IOException) (Object) decompiledCaughtException;
                  lj.field_z = ng.field_j;
                  fk.field_F = null;
                  var2 = 100 / ((param1 - 71) / 43);
                  return true;
                }
                fk.field_F = null;
                var2 = 100 / ((param1 - 71) / 43);
                return true;
              } else {
                lj.field_z = ng.field_j;
                fk.field_F = null;
                var2 = 100 / ((param1 - 71) / 43);
                return true;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        field_c = null;
        if (param0 != 9) {
            return;
        }
        field_d = null;
    }

    final static ii a(String param0, int param1, ci param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        ii stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param2.b(118, param0);
              if (param1 == -2479) {
                break L1;
              } else {
                var6 = (String) null;
                gk.a((String) null, 10, (ci) null, (String) null);
                break L1;
              }
            }
            var5 = param2.a(-1, param3, var4_int);
            stackIn_3_0 = ae.a(var4_int, param2, var5, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("gk.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_d = new tf(9, 0, 4, 1);
        field_a = "Waiting for extra data";
        field_g = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_b = new tf(7, 0, 1, 1);
    }
}
