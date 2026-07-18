/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends gn {
    static boolean field_k;
    static sl field_m;
    static ut field_j;
    static hd field_f;
    static ff field_l;
    static int field_g;
    static String field_e;
    static int field_i;
    static String field_h;

    final static void a(boolean param0, int param1) {
        np.field_Jb.a((gn) (Object) new hg(param1), 3);
    }

    final static int b(int param0) {
        if (vk.field_b) {
          return -1;
        } else {
          if (!bo.field_Cb.a(false, "street")) {
            return bo.field_Cb.a("street", -16248);
          } else {
            vk.field_b = true;
            oo.field_b = ng.a("cars", "street", 2, bo.field_Cb);
            so.field_d = ng.a("signs", "street", 2, bo.field_Cb);
            iw.field_h = ng.a("cracks", "street", 2, bo.field_Cb);
            return -1;
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_e = null;
        field_l = null;
        field_h = null;
        field_m = null;
        field_j = null;
    }

    private k() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Played";
        field_l = new ff(15, 0, 1, 0);
        field_i = 0;
        field_h = "LINE-UP";
    }
}
