/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends id {
    static String field_y;
    static qj field_x;

    di(int param0) {
        this(ql.field_Q, param0);
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_y = null;
        field_x = null;
    }

    final String c(int param0, w param1) {
        if (param0 != 349) {
          di.a(false);
          return nh.a('*', param1.field_u.length(), (byte) 67);
        } else {
          return nh.a('*', param1.field_u.length(), (byte) 67);
        }
    }

    private di(le param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
