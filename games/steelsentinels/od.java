/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends RuntimeException {
    static int field_h;
    Throwable field_l;
    static String field_f;
    static int field_m;
    String field_a;
    static int[] field_k;
    static gh field_g;
    static rf field_d;
    static String field_i;
    static String field_j;
    static String field_b;
    static wk[] field_c;
    static boolean field_e;
    private static String field_z;

    public static void a(boolean param0) {
        field_i = null;
        field_k = null;
        field_c = null;
        field_b = null;
        field_j = null;
        field_d = null;
        if (param0) {
          return;
        } else {
          field_f = null;
          field_g = null;
          return;
        }
    }

    final static c a(int param0, boolean param1) {
        c var2 = null;
        if (!param1) {
          field_m = 46;
          var2 = new c();
          fg.field_Ub.a(3, (ck) (Object) var2);
          tc.a(87, param0);
          return var2;
        } else {
          var2 = new c();
          fg.field_Ub.a(3, (ck) (Object) var2);
          tc.a(87, param0);
          return var2;
        }
    }

    od(Throwable param0, String param1) {
        ((od) this).field_a = param1;
        ((od) this).field_l = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "od.A(";
        field_f = "Shortcut Reference";
        field_k = new int[]{17, 18, 22, -1, -1, 8};
        field_d = new rf();
        field_j = "WASD: Scroll / RMB <img=26>: jump";
        field_b = "Quick Chat Help";
    }
}
