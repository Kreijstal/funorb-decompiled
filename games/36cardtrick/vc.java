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
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            stackIn_2_0 = (kc[]) null;
            return stackIn_2_0;
          }
          var4_int = param3.a(param2 ^ 18659, param1);
          var5 = param3.a(var4_int, param0, (byte) 7);
          stackIn_4_0 = uh.a(var5, param3, var4_int, (byte) -73);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("vc.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param5 != 0) {
          return true;
        }
        if (param4 > param1) {
          return false;
        }
        if (param1 >= param4 + param6) {
          return false;
        }
        if (param3 > param2) {
          return false;
        }
        if (param3 + param0 > param2) {
          return true;
        }
        return false;
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
