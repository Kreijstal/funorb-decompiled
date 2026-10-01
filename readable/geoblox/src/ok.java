/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static Sprite[] field_a;
    static String createEmailConfirmationTooltipText;
    static int field_f;
    static String justPlayText;
    static int[] field_h;
    static String createEmailConfirmationText;
    static int field_g;
    static int field_c;
    static int field_b;
    private static String field_z;

    public static void a(boolean param0) {
        field_a = null;
        createEmailConfirmationTooltipText = null;
        justPlayText = null;
        field_h = null;
        createEmailConfirmationText = null;
        if (!param0) {
            justPlayText = (String) null;
        }
    }

    static {
        field_z = "ok.A(";
        createEmailConfirmationTooltipText = "Type your email address again to make sure it's correct";
        justPlayText = "Just play";
        field_h = new int[8192];
        field_g = 9;
        createEmailConfirmationText = "Confirm Email:";
    }
}
