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
        if (20 <= ma.field_p) {
          if (wb.b(109)) {
            if (tf.field_n > 0) {
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
    }

    final static void a(gr param0, int param1) {
        sl var3 = null;
        try {
            var3 = js.field_f;
            var3.h(param1, 255);
            var3.c(param0.field_k, (byte) -81);
            var3.c(param0.field_j, (byte) -124);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "uf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + false + ')');
        }
    }

    public static void a() {
        int var1 = 18;
        field_b = null;
    }

    private uf() throws Throwable {
        throw new Error();
    }

    static {
    }
}
