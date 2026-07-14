/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn {
    static ja field_a;
    static int field_e;
    static int field_h;
    static th field_f;
    static ri[] field_c;
    static cj field_g;
    static int field_b;
    static char field_d;
    static String field_i;

    public static void a(int param0) {
        if (param0 != 31) {
            return;
        }
        field_g = null;
        field_i = null;
        field_f = null;
        field_c = null;
        field_a = null;
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var1 = hl.field_e[0];
        var2 = 1;
        if (param0 != 8) {
          field_e = -57;
          L0: while (true) {
            if (hl.field_e.length > var2) {
              var3 = hl.field_e[var2];
              d.a(ah.field_f, var2 << 1685179428, ah.field_f, var1, var3);
              var1 = var1 + var3;
              var2++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (hl.field_e.length > var2) {
              var3 = hl.field_e[var2];
              d.a(ah.field_f, var2 << 1685179428, ah.field_f, var1, var3);
              var1 = var1 + var3;
              var2++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final static boolean a(int param0, go param1) {
        if (param0 != -9) {
            field_g = null;
            return param1.a(-53);
        }
        return param1.a(-53);
    }

    final static void a(byte param0) {
        nh.field_m = false;
        sh.field_L = s.field_e.g(31365) == 0 ? true : false;
        if (param0 > 51) {
            return;
        }
        pn.a(74);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_f = new th();
        field_i = "Connection lost - attempting to reconnect";
    }
}
