/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GuestPlayText {
    static AccountRequestResult field_b;
    static String justPlayText;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        justPlayText = null;
        if (param0 != 0) {
          GuestPlayText.clearSharedReferences(28);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_z = "cjb.A(";
        justPlayText = "Just play";
    }
}
