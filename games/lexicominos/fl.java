/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static String field_b;
    static db field_c;
    static String field_d;
    static String[] field_a;

    final static mj a(byte[] param0, byte param1) {
        mj var2 = null;
        if (param0 != null) {
          if (param1 != -116) {
            field_b = null;
            var2 = new mj(param0, mg.field_x, rg.field_c, pb.field_h, bd.field_m, ci.field_b, be.field_f);
            gk.a(12428);
            return var2;
          } else {
            var2 = new mj(param0, mg.field_x, rg.field_c, pb.field_h, bd.field_m, ci.field_b, be.field_f);
            gk.a(12428);
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0) {
            fl.a(false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Friends can be added in multiplayer<nbsp>games";
        field_a = new String[]{"All scores", "My scores", "Best each"};
    }
}
