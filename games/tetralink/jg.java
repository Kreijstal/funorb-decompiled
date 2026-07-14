/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg {
    static byte[][] field_i;
    static mh field_h;
    static double field_f;
    static int field_a;
    static String field_g;
    static java.math.BigInteger field_c;
    static String field_d;
    static int[] field_e;
    static String field_b;
    private static String field_z;

    public static void a(boolean param0) {
        field_h = null;
        field_d = null;
        if (!param0) {
          return;
        } else {
          field_c = null;
          field_b = null;
          field_e = null;
          field_g = null;
          field_i = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "jg.A(";
        field_f = 0.0;
        field_g = "If you do nothing the game will revert to normal view in <%0> second.";
        field_h = new mh();
        field_e = new int[8192];
        field_d = "<%0> has left the lobby.";
        field_c = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_b = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
