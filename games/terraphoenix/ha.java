/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha extends di {
    static String field_m;
    static int field_q;
    static int[] field_s;
    static boolean field_o;
    private boolean field_u;
    static o field_n;
    private mg field_r;
    static int field_p;
    private String field_t;

    final im b(String param0, int param1) {
        ec var3 = null;
        if (!(((ha) this).field_r.b(param0, param1) != qf.field_d)) {
            return qf.field_d;
        }
        if (!(param0.equals((Object) (Object) ((ha) this).field_t))) {
            var3 = ei.a(-110, param0);
            if (!(var3.a(-72))) {
                return oh.field_b;
            }
            ((ha) this).field_t = param0;
            ((ha) this).field_u = var3.a(true);
        }
        return ((ha) this).field_u ? dg.field_c : qf.field_d;
    }

    final String a(String param0, int param1) {
        int var3 = 0;
        if (((ha) this).field_r.b(param0, 0) == qf.field_d) {
          return ((ha) this).field_r.a(param0, -85);
        } else {
          if (((ha) this).b(param0, 0) == qf.field_d) {
            return fl.field_a;
          } else {
            var3 = -41 % ((param1 - 26) / 56);
            return vd.field_p;
          }
        }
    }

    final static void a(eg param0, int param1, byte param2) {
        if (param2 <= 50) {
            return;
        }
        ic.field_s.a((uf) (Object) param0, -16611);
        qc.a(param1, param0, (byte) 118);
    }

    final static void a(int param0, uf param1, uf param2) {
        if (null == param2.field_a) {
          if (param0 <= 63) {
            field_p = 107;
            param2.field_a = param1.field_a;
            param2.field_d = param1;
            param2.field_a.field_d = param2;
            param2.field_d.field_a = param2;
            return;
          } else {
            param2.field_a = param1.field_a;
            param2.field_d = param1;
            param2.field_a.field_d = param2;
            param2.field_d.field_a = param2;
            return;
          }
        } else {
          param2.b((byte) 12);
          if (param0 > 63) {
            param2.field_a = param1.field_a;
            param2.field_d = param1;
            param2.field_a.field_d = param2;
            param2.field_d.field_a = param2;
            return;
          } else {
            field_p = 107;
            param2.field_a = param1.field_a;
            param2.field_d = param1;
            param2.field_a.field_d = param2;
            param2.field_d.field_a = param2;
            return;
          }
        }
    }

    ha(ej param0, ej param1) {
        super(param0);
        ((ha) this).field_u = false;
        ((ha) this).field_t = "";
        ((ha) this).field_r = new mg(param0, param1);
    }

    public static void g(int param0) {
        field_n = null;
        field_m = null;
        field_s = null;
        if (param0 != 0) {
            Object var2 = null;
            ha.a((eg) null, -9, (byte) -50);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 0;
        field_m = "Aimed Accuracy: ";
        field_o = false;
        field_n = new o();
    }
}
