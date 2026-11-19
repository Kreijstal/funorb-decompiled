/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenFailureKind {
    static int rankingCount;
    static String field_c;
    static Sprite[] field_a;
    static String field_b;

    public static void releaseStatics(byte param0) {
        if (param0 > 89) {
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        }
        field_a = (Sprite[]) null;
        field_a = null;
        field_b = null;
        field_c = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_c = "Names cannot start or end with space or underscore";
        field_b = "Members' Benefits";
    }
}
