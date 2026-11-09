/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NextLevelChoiceLabels {
    static QuickChatCommand field_b;
    static String[] choices;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        choices = null;
        int var1 = 62 / ((param0 + 37) / 46);
        field_b = null;
    }

    static {
        field_z = "vd.A(";
        choices = new String[]{"Yes", "Return to level select"};
        field_b = new QuickChatCommand(10, 2, 2, 0);
    }
}
