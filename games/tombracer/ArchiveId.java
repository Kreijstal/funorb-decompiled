/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveId {
    static TextWidgetPainter field_a;
    int field_c;
    static String field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    ArchiveId(int param0) {
        this.field_c = param0;
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 != -17614) {
          return;
        }
        field_a = null;
    }

    static {
        field_b = "Mute this player for 48 hours";
    }
}
