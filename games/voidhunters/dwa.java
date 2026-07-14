/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dwa extends rqa {
    static String field_o;

    public static void a(int param0) {
        if (param0 != 69) {
            boolean discarded$0 = dwa.a(-33, 96, true);
            field_o = null;
            return;
        }
        field_o = null;
    }

    dwa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0, int param1, boolean param2) {
        if (param2) {
            return false;
        }
        return 0 != (2048 & param0) ? true : false;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          dwa.a(55);
          return new nc((Object) (Object) frb.a(69, 96));
        } else {
          return new nc((Object) (Object) frb.a(69, 96));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Add condition (Ship on team)";
    }
}
