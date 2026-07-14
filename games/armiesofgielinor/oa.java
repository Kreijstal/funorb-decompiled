/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends dr {
    static me field_F;
    static String field_G;
    static String field_E;
    static ru[] field_H;
    static ij field_I;

    oa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void g(int param0) {
        if (param0 >= -112) {
            return;
        }
        field_I = null;
        field_G = null;
        field_H = null;
        field_E = null;
        field_F = null;
    }

    final static void h(int param0) {
        if (param0 != 2) {
            field_H = null;
            np.a(true, (byte) -113);
            return;
        }
        np.a(true, (byte) -113);
    }

    final static void a(int param0, um param1) {
        int var2 = 0;
        if (param1 != null) {
          hh.a(-16147, 50, param1, true);
          ((wn) (Object) lk.field_e.field_y).a((byte) -111, 1, dk.field_u);
          var2 = 100 / ((-17 - param0) / 33);
          return;
        } else {
          var2 = 100 / ((-17 - param0) / 33);
          return;
        }
    }

    final nd a(int param0, nd[] param1) {
        if (param0 != -24872) {
            oa.g(-45);
            return new nd((Object) (Object) ti.b((byte) -120));
        }
        return new nd((Object) (Object) ti.b((byte) -120));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "No";
        field_F = new me(2, 4, 4, 0);
        field_E = "Remove <%0> from ignore list";
    }
}
