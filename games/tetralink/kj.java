/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static String field_a;
    static String field_c;
    static int[] field_d;
    static boolean field_b;
    static String field_e;

    final static void a(int param0, ah param1) {
        oh var2 = new oh(param1.a("final_frame.jpg", "", true), (java.awt.Component) (Object) uh.field_b);
        int var3 = var2.field_u;
        int var4 = var2.field_E;
        nm.b((byte) 45);
        a.field_c = new oh(var3, var4 * param0 / 4);
        a.field_c.c();
        var2.b(0, 0);
        h.field_c = new oh(var3, var4 - a.field_c.field_E);
        h.field_c.c();
        var2.b(0, -a.field_c.field_E);
        h.field_c.field_D = a.field_c.field_E;
        dh.a(-581);
    }

    final static String a(byte param0, CharSequence[] param1) {
        int var2 = 2 / ((param0 - 55) / 54);
        return gh.a(param1, 0, param1.length, -2);
    }

    final static void a(byte param0) {
        pm.field_g = k.a(0);
        if (param0 != 45) {
            return;
        }
        ib.field_b = 0;
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_b = true;
          field_d = null;
          field_c = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_e = null;
          field_a = null;
          return;
        }
    }

    final static void a(byte param0, int param1, int param2) {
        sj.field_e = param1;
        if (param0 != -77) {
            Object var4 = null;
            kj.a(43, (ah) null);
            hl.field_cb = param2;
            return;
        }
        hl.field_cb = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "End Game";
        field_c = "You appear to be telling someone your password - please don't!";
        field_e = "This option cannot be combined with the current settings for:  ";
        field_b = true;
    }
}
