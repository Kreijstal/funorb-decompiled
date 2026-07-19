/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static String field_d;
    static String field_a;
    static String field_f;
    static int field_c;
    static Boolean field_e;
    static String field_b;

    final static void a(int param0) {
        if (param0 != 21744) {
            field_d = (String) null;
            ee.a(4, (byte) 30);
            return;
        }
        ee.a(4, (byte) 30);
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (!param0) {
          field_c = -19;
          field_e = null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_e = null;
          field_f = null;
          field_b = null;
          return;
        }
    }

    static {
        field_d = "In this sandbox you get to play with the spells that your Arcanist will have available in multiplayer games. Select spells for yourself on the 'Character Creation' screen, then try them out here.";
        field_a = "You must play 1 more rated game before playing with the current options.";
        field_f = "Just one target left; well done!";
        field_b = "Powering up familiar.";
    }
}
