/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static boolean field_b;
    static int field_a;

    final static fn a(int param0, int param1) {
        if (dj.field_d == null) {
            return null;
        }
        if (!(0 != param0)) {
            return dj.field_d[0];
        }
        if (param0 == param1) {
            return dj.field_d[1];
        }
        if (-32769 == (param0 ^ -1)) {
            return dj.field_d[2];
        }
        if (-49153 != (param0 ^ -1)) {
            return null;
        }
        return dj.field_d[3];
    }

    final static void a(fd param0, int param1, int param2, int param3, fd param4, int param5) {
        hn.field_s = param2;
        gf.field_e = param4;
        fe.field_k = param5;
        en.field_k = param1;
        if (param3 != 3) {
            return;
        }
        of.field_g = param0;
    }

    final static te a(int param0, te param1, int[] param2) {
        te var3 = null;
        var3 = new te(0, 0, 0);
        if (param0 > -15) {
          field_a = 60;
          var3.field_a = param1.field_a;
          var3.field_k = param1.field_k;
          var3.field_g = param1.field_g;
          var3.field_i = param1.field_i;
          var3.field_l = param2;
          var3.field_h = param1.field_h;
          var3.field_f = param1.field_f;
          var3.field_d = param1.field_d;
          return var3;
        } else {
          var3.field_a = param1.field_a;
          var3.field_k = param1.field_k;
          var3.field_g = param1.field_g;
          var3.field_i = param1.field_i;
          var3.field_l = param2;
          var3.field_h = param1.field_h;
          var3.field_f = param1.field_f;
          var3.field_d = param1.field_d;
          return var3;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_a = -1;
    }
}
