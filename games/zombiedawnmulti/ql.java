/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    static int field_c;
    static sn field_d;
    static String field_a;
    static String field_e;
    static cj field_b;
    static String field_f;

    final static int a(boolean param0, int param1, byte[] param2) {
        int var3 = 0;
        int var4 = 0;
        var3 = 0;
        var4 = 255;
        var3 = var3 | (var4 & param2[4 * param1]) << 605424824;
        var3 = var3 | (var4 & param2[1 + 4 * param1]) << 736886928;
        var3 = var3 | (param2[4 * param1 - -2] & var4) << 79106056;
        var3 = var3 | var4 & param2[4 * param1 - -3];
        if (!param0) {
          field_a = null;
          return var3;
        } else {
          return var3;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 4) {
          ql.a(-69);
          field_e = null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_e = null;
          field_f = null;
          field_b = null;
          return;
        }
    }

    final static void a(boolean param0) {
        il var1 = (il) (Object) mo.field_Fb.a(param0);
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        oo.a(var1.field_o, var1.field_i, var1.field_f);
        oo.h(var1.field_m, var1.field_h, var1.field_p, var1.field_g);
        var1.field_o = null;
        db.field_a.a((br) (Object) var1, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Invalid password.";
    }
}
