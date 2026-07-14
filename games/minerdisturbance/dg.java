/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    static boolean field_b;
    static bg field_a;

    final static void a(byte param0) {
        vl.h(-1);
        wi.field_C = true;
        gd.field_B = true;
        if (param0 != 117) {
          field_b = false;
          mb.field_b.n(21974);
          t.a(false, vb.field_a, param0 ^ 117);
          return;
        } else {
          mb.field_b.n(21974);
          t.a(false, vb.field_a, param0 ^ 117);
          return;
        }
    }

    final static gj a(String param0, int param1) {
        String var3 = null;
        String var4 = null;
        gj var5 = null;
        if (param0 == null) {
            return bj.field_h;
        }
        if (param0.length() == 0) {
            return bj.field_h;
        }
        int var2 = param0.indexOf('@');
        if (!(var2 != -1)) {
            return dh.field_d;
        }
        if (param1 > -15) {
            field_a = null;
            var3 = param0.substring(0, var2);
            var4 = param0.substring(1 + var2);
            var5 = ha.a(92, var3);
            if (!(var5 == null)) {
                return var5;
            }
            return hm.a(var4, true);
        }
        var3 = param0.substring(0, var2);
        var4 = param0.substring(1 + var2);
        var5 = ha.a(92, var3);
        if (!(var5 == null)) {
            return var5;
        }
        return hm.a(var4, true);
    }

    public static void b(byte param0) {
        if (param0 < 57) {
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = new bg(14, 0, 4, 1);
    }
}
