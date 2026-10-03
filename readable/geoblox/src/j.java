/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j extends mi {
    String field_mb;
    String field_hb;
    static int field_gb;
    int field_kb;
    static String field_lb;
    static MusicScore field_ib;
    static String quitWarningText;

    final static void e(int param0) {
        wg.archiveNetworkClient.failureCount = 0;
        wg.archiveNetworkClient.failureCode = 0;
        if (param0 != -21754) {
            field_lb = (String) null;
        }
    }

    j() {
        super(0L, (mi) null);
    }

    public static void f(byte param0) {
        field_lb = null;
        quitWarningText = null;
        if (param0 != -128) {
            j.f((byte) 1);
            field_ib = null;
            return;
        }
        field_ib = null;
    }

    static {
        field_gb = 80;
        quitWarningText = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
