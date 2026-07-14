/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq extends rqa {
    static String field_o;

    gq(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        pcb.field_o = param0[0].a(false);
        if (param1 >= -119) {
          gq.b(true);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        if (param0) {
            field_o = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Options";
    }
}
