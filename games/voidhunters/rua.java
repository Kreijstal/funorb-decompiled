/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rua extends rqa {
    static int[] field_q;
    static int field_p;
    static int field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          rua.e((byte) -37);
          return new nc((Object) (Object) frb.a(175, 104));
        } else {
          return new nc((Object) (Object) frb.a(175, 104));
        }
    }

    public static void e(byte param0) {
        field_q = null;
        int var1 = 49 % ((param0 - 15) / 63);
    }

    rua(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[128];
        vlb discarded$0 = new vlb();
    }
}
