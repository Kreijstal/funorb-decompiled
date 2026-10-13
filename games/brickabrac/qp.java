/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp {
    static String field_a;
    static mh field_f;
    static IndexedSprite[] field_e;
    static int[] field_c;
    static String field_b;
    static String field_d;

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (!param0) {
          field_f = null;
          field_d = null;
          field_e = null;
          return;
        }
        qp.a(-100, -97, (byte) -12);
        field_f = null;
        field_d = null;
        field_e = null;
    }

    final static int a(int param0, int param1, byte param2) {
        if (param2 != -22) {
          return -88;
        }
        if (param0 >= 2) {
          return 2;
        }
        if (param1 < 5) {
          return 0;
        }
        return 1;
    }

    static {
        field_a = "Ask to join <%0>'s game";
        field_b = "This game is full.";
        field_d = "Only show private chat from my friends and opponents";
    }
}
