/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MonochromeRowCacheEntry extends IntrusiveNode {
    int field_d;
    int field_f;
    static boolean currentStateOnlyMode;
    private static String field_z;

    MonochromeRowCacheEntry(int param0, int param1) {
        this.field_f = param1;
        this.field_d = param0;
    }

    static {
        field_z = "osa.<init>(";
        currentStateOnlyMode = false;
    }
}
