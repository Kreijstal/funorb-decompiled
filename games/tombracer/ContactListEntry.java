/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContactListEntry extends UiComponent {
    String field_yb;
    static String field_wb;
    UiComponent field_Ab;
    String field_vb;
    static float field_ub;
    UiComponent field_zb;
    String field_tb;
    String field_Cb;
    static String field_Bb;
    int field_Db;
    UiComponent field_xb;
    private static String field_Eb;

    ContactListEntry() {
        super(0L, (UiComponent) null);
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 101) {
          field_Bb = (String) null;
          field_wb = null;
          field_Bb = null;
          return;
        }
        field_wb = null;
        field_Bb = null;
    }

    static {
        field_Eb = "mu.A(";
        field_wb = "+10 Coins";
        field_Bb = "You have been removed from <%0>'s game.";
    }
}
