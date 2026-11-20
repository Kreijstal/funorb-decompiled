/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextureCombineSource {
    static int field_a;
    static String field_b;

    public static void clearSharedReferences(byte param0) {
        if (param0 != 13) {
          return;
        }
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = 4;
        field_b = "Hold shift to expand the special order menu";
    }
}
