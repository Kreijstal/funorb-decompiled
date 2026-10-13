/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static UiComponent field_b;
    static String field_a;
    static int keyEventFrameEnd;
    static String field_c;
    private static String field_z;

    public static void a(byte param0) {
        field_c = null;
        if (param0 != 68) {
          fm.a((byte) -53);
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_z = "fm.A(";
        keyEventFrameEnd = 0;
        field_c = "All players have left <%0>'s game.";
        field_a = "<%0>'s game";
    }
}
