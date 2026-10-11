/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static fd field_d;
    static hj field_e;
    static e field_a;
    static gh field_c;
    static String field_b;

    final static int a(int param0) {
        if (param0 <= 32) {
          field_e = (hj) null;
          if (va.field_k) {
            return -1;
          }
          if (HoldTheLine.field_A > ol.field_f) {
            return -1;
          }
          if (!(ol.field_f >= HoldTheLine.field_A + lc.field_h)) {
            return a.field_I;
          }
          return -1;
        }
        if (va.field_k) {
          return -1;
        }
        if (HoldTheLine.field_A > ol.field_f) {
          return -1;
        }
        if (ol.field_f < HoldTheLine.field_A + lc.field_h) {
          return a.field_I;
        }
        return -1;
    }

    final static void a(int param0, byte param1) {
        da var2 = da.field_p;
        var2.c((byte) 33, param0);
        var2.f(111, 1);
        if (param1 == -23) {
          var2.f(param1 + 134, 2);
          return;
        }
        hh.b(111);
        var2.f(param1 + 134, 2);
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
        field_d = new fd();
        field_b = "Cancel";
        field_c = null;
        field_a = new e(10, 2, 2, 0);
    }
}
