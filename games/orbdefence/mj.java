/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj extends ca {
    static java.applet.Applet field_j;
    static pe field_i;
    int field_g;
    static String field_k;
    int field_h;
    static df field_l;
    static int field_f;
    static im field_m;

    public static void a(byte param0) {
        field_i = null;
        field_l = null;
        field_k = null;
        if (param0 <= 73) {
          mj.c(-85);
          field_j = null;
          field_m = null;
          return;
        } else {
          field_j = null;
          field_m = null;
          return;
        }
    }

    final static void c(int param0) {
        if (!(vj.a(39))) {
            cc.field_f.b(56);
        }
        if (param0 != -21108) {
            field_i = null;
            return;
        }
    }

    private mj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Cancel";
        field_l = new df("email");
        field_m = new im();
    }
}
