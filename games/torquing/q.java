/*
 * Decompiled by CFR-JS 0.4.0.
 */
class q {
    q field_h;
    static String field_i;
    long field_f;
    static ce field_c;
    static int field_g;
    q field_e;
    static int field_d;
    static int[] field_b;
    static cd field_a;

    final static void a(int param0, int param1, int param2, fj param3, int param4) {
        param3.b(90, 12);
        param3.a(17, 124);
        param3.a(param2, 120);
        param3.a(param4, 71);
        param3.b(90, param0);
        if (param1 <= 94) {
            Object var6 = null;
            q.a(-127, 58, -29, (fj) null, -68);
        }
    }

    final void f(int param0) {
        if (null != ((q) this).field_h) {
          if (param0 != 0) {
            ((q) this).field_e = null;
            ((q) this).field_h.field_e = ((q) this).field_e;
            ((q) this).field_e.field_h = ((q) this).field_h;
            ((q) this).field_h = null;
            ((q) this).field_e = null;
            return;
          } else {
            ((q) this).field_h.field_e = ((q) this).field_e;
            ((q) this).field_e.field_h = ((q) this).field_h;
            ((q) this).field_h = null;
            ((q) this).field_e = null;
            return;
          }
        } else {
          return;
        }
    }

    final boolean e(int param0) {
        if (((q) this).field_h == null) {
            return false;
        }
        if (param0 != 17) {
            return true;
        }
        return true;
    }

    public static void b(byte param0) {
        field_b = null;
        field_i = null;
        field_c = null;
        field_a = null;
        if (param0 != 92) {
            Object var2 = null;
            q.a(81, 94, -8, (fj) null, -107);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "<col=2>No animals were harmed in the making of this game.</col>";
        field_g = 0;
        field_d = 0;
        field_c = new ce();
        field_a = new cd();
    }
}
