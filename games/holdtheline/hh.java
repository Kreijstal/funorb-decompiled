/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static fd field_d;
    static hj field_e;
    static e field_a;
    static gh field_c;
    static String field_b;

    final static int a() {
        if (!va.field_k) {
          if (HoldTheLine.field_A <= ol.field_f) {
            if (ol.field_f >= HoldTheLine.field_A - -lc.field_h) {
              return -1;
            } else {
              return a.field_I;
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final static void a(int param0, byte param1) {
        da var2 = da.field_p;
        var2.c((byte) 33, 4);
        var2.f(111, 1);
        var2.f(111, 2);
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 != 10) {
            return;
        }
        field_e = null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new fd();
        field_b = "Cancel";
        field_c = null;
        field_a = new e(10, 2, 2, 0);
    }
}
