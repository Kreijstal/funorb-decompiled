/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static int keyStateWriteIndexOrResetSentinel;
    static boolean field_e;
    rh field_i;
    static boolean field_a;
    static nd field_h;
    static String highscoresText;
    static int[] field_d;
    String field_f;
    String field_g;
    int field_l;
    String field_m;
    static rh fontMetricsArchive;
    static String createPasswordValidText;

    public static void a(int param0) {
        if (param0 >= 121) {
            field_h = null;
            fontMetricsArchive = null;
            createPasswordValidText = null;
            field_d = null;
            highscoresText = null;
            return;
        }
        highscoresText = (String) null;
        field_h = null;
        fontMetricsArchive = null;
        createPasswordValidText = null;
        field_d = null;
        highscoresText = null;
    }

    private ii() throws Throwable {
        throw new Error();
    }

    static {
        keyStateWriteIndexOrResetSentinel = 0;
        field_d = new int[8192];
        highscoresText = "Highscores";
        field_h = new nd();
        createPasswordValidText = "Password is valid";
    }
}
