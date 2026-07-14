/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ipa extends rqa {
    static String field_p;
    static String field_q;
    static String field_o;

    ipa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        field_p = null;
        if (param0 != 176) {
            return;
        }
        field_q = null;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_p = null;
          return new nc((Object) (Object) frb.a(176, 74));
        } else {
          return new nc((Object) (Object) frb.a(176, 74));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Destroy the base with blueprint ships. No respawns.";
        field_o = "Passwords can only contain letters and numbers";
        field_p = "Loading textures";
    }
}
