/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    static boolean field_e;
    static String field_i;
    static String field_c;
    static w field_d;
    static w field_g;
    static ck[] field_a;
    static String field_f;
    static ud field_k;
    static String field_b;
    static String field_j;
    static boolean field_h;

    final static void a(int param0, byte param1, ud param2) {
        ai.a(103, 0, param2, 128, param0);
        if (param1 != -89) {
            field_e = true;
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_g = null;
        if (param0 != 25988) {
          fj.a(-61);
          field_f = null;
          field_a = null;
          field_i = null;
          field_c = null;
          field_k = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_f = null;
          field_a = null;
          field_i = null;
          field_c = null;
          field_k = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        dk.field_h.e(param0, param3, param1);
        jh.field_d.e(param0 + 35, param3, param1);
        sk.field_g.e(param0 + 605, param3, param1);
        fl.field_f.e(param0, param3 + 35, param1);
        wm.field_n.e(param0 + 605, param3 - -35, param1);
        if (param2 > -7) {
          return;
        } else {
          vg.field_x.e(param0, 445 + param3, param1);
          pg.field_f.e(param0 - -35, param3 + 445, param1);
          wc.field_r.e(param0 + 605, param3 + 445, param1);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Withdraw request to join <%0>'s game";
        field_e = false;
        field_f = "Music: ";
        field_b = "Enter name of friend to delete from list";
        field_c = "Try again";
        field_i = "The '<%0>' setting needs to be changed.";
    }
}
