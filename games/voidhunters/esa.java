/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class esa extends rqa {
    static int field_p;
    static String field_o;

    esa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        si.a(96, 62, param0[0].a(50));
        if (param1 >= -119) {
          esa.b(false);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        if (!param0) {
            esa.b(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Remove friend";
    }
}
