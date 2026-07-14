/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends RuntimeException {
    String field_b;
    Throwable field_c;
    static boolean field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        ph.d(-31782);
        if (param0 != 0) {
            return;
        }
        ed.b(param2, param3, param4, param1);
    }

    final static void a(int param0) {
        ic.field_b = null;
        tf.field_b = null;
        mf.field_j = null;
        cg.field_k = null;
        if (param0 != 0) {
          field_a = false;
          ne.field_h = null;
          ph.field_q = null;
          return;
        } else {
          ne.field_h = null;
          ph.field_q = null;
          return;
        }
    }

    eb(Throwable param0, String param1) {
        ((eb) this).field_c = param0;
        ((eb) this).field_b = param1;
    }

    final static db a(db param0, byte param1, int[] param2) {
        db var3 = null;
        var3 = new db(0, 0, 0);
        var3.field_k = param2;
        var3.field_d = param0.field_d;
        var3.field_a = param0.field_a;
        var3.field_h = param0.field_h;
        var3.field_j = param0.field_j;
        if (param1 > -7) {
          return null;
        } else {
          var3.field_l = param0.field_l;
          var3.field_c = param0.field_c;
          var3.field_b = param0.field_b;
          return var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
