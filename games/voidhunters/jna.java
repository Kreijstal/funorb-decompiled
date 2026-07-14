/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jna extends rqa {
    static llb field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_o = null;
          return new nc((Object) (Object) frb.a(53, 105));
        } else {
          return new nc((Object) (Object) frb.a(53, 105));
        }
    }

    jna(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void b(boolean param0) {
        field_o = null;
        if (!param0) {
            jna.b(true);
        }
    }

    static {
    }
}
