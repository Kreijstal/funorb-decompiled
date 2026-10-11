/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi {
    static String field_b;
    static String field_a;
    static int field_c;

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        if (param0) {
          hi.a((byte) 43);
        }
    }

    final static boolean a(byte param0) {
        if (param0 > -99) {
          return false;
        }
        if (10 > mh.field_U) {
          return false;
        }
        if (sa.field_k >= 13) {
          return true;
        }
        return false;
    }

    static {
        field_a = "Names cannot start or end with space or underscore";
        field_b = "Main Menu";
    }
}
