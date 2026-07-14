/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm extends di {
    static String field_J;
    static int field_H;
    static boolean field_I;

    final static void a(int param0, int param1) {
        ql.field_d = new int[3];
        kf.field_M = param1;
        pd.field_g = new hl[param1 * 15];
        if (param0 != -3504) {
          field_J = null;
          ic.field_c = 0;
          return;
        } else {
          ic.field_c = 0;
          return;
        }
    }

    private gm(mm param0, int param1) {
        super(param0, param1);
    }

    gm(int param0) {
        this(hh.field_e, param0);
    }

    public static void d(int param0) {
        int var1 = 85 / ((-16 - param0) / 51);
        field_J = null;
    }

    final String b(ce param0, byte param1) {
        int var3 = 61 / ((param1 - 59) / 53);
        return vb.a('*', param0.field_E.length(), -12681);
    }

    final static void b(int param0, int param1) {
        uf var2 = null;
        if (param1 <= 35) {
          field_J = null;
          var2 = we.field_b;
          var2.f(param0, -4);
          var2.a(true, 1);
          var2.a(true, 2);
          return;
        } else {
          var2 = we.field_b;
          var2.f(param0, -4);
          var2.a(true, 1);
          var2.a(true, 2);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "OK";
    }
}
