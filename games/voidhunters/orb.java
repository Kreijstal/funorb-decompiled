/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class orb extends rqa {
    static String field_o;

    orb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != -982) {
            orb.a(123);
            field_o = null;
            return;
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        si.a(151, 62, param0[0].a(36));
        if (param1 >= -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Destroy the drones and scavenge the debris";
    }
}
