/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TutorialCaptionGlobals {
    static int field_h;
    static String field_a;
    static BufferedRandomAccessFile field_e;
    static String field_c;
    static BattleScreen field_g;
    static int[] field_d;
    static String field_b;
    static String field_i;
    static int field_f;
    private static String field_z;

    public static void releaseStatics(boolean param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        field_b = null;
        field_i = null;
        field_c = null;
        if (!param0) {
          field_g = null;
          return;
        }
        TutorialCaptionGlobals.releaseStatics(true);
        field_g = null;
    }

    static {
        field_z = "bm.A(";
        field_c = "Sandbox";
        field_a = "Let's practise using minions. Select the Summon Imps spell below.";
        field_b = "Show chat";
        field_f = 5;
        field_i = "Ask to join <%0>'s game";
    }
}
