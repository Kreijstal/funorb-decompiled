/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vc extends IOException {
    static uf field_a;
    static pb field_b;

    final static wb b(int param0) {
        wb var1 = new wb(p.field_l, gk.field_a, kb.field_c[0], ml.field_b[param0], na.field_q[0], hb.field_a[0], rd.field_k[0], jf.field_i);
        rh.d(-123);
        return var1;
    }

    final static kc[] a(String param0, String param1, int param2, qk param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        kc[] stackIn_2_0 = null;
        kc[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 0) {
              var4_int = param3.a(param2 ^ 18659, param1);
              var5 = param3.a(var4_int, param0, (byte) 7);
              stackIn_4_0 = uh.a(var5, param3, var4_int, (byte) -73);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (kc[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("vc.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param5 == 0) {
          if (param4 <= param1) {
            if (param1 < param4 + param6) {
              if (param3 <= param2) {
                if (param3 - -param0 <= param2) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    vc(String param0) {
        super(param0);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            vc.b(123);
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
    }
}
