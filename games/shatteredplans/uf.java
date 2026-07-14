/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static java.awt.Frame field_b;
    String field_f;
    bc field_a;
    String field_c;
    String field_d;
    int field_e;

    final static boolean a(boolean param0) {
        if (!param0) {
          if (20 <= ma.field_p) {
            if (wb.b(109)) {
              if (-1 > (tf.field_n ^ -1)) {
                if (dh.a(-12165)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static void a(gr param0, int param1, boolean param2) {
        sl var3 = null;
        if (param2) {
          return;
        } else {
          var3 = js.field_f;
          var3.h(param1, 255);
          var3.c(param0.field_k, (byte) -81);
          var3.c(param0.field_j, (byte) -124);
          return;
        }
    }

    public static void a(byte param0) {
        int var1 = -18 / ((-32 - param0) / 52);
        field_b = null;
    }

    private uf() throws Throwable {
        throw new Error();
    }

    static {
    }
}
