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
        int var4 = 0;
        int var5 = 0;
        if (param2 != 0) {
          return (kc[]) null;
        } else {
          var4 = param3.a(param2 ^ 18659, param1);
          var5 = param3.a(var4, param0, (byte) 7);
          return uh.a(var5, param3, var4, (byte) -73);
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
            wb discarded$0 = vc.b(123);
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
