/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextPromptState {
    static UiLayoutNode field_c;
    static String field_e;
    static int field_d;
    static TextPromptDialog field_b;
    static int field_a;
    private static String field_z;

    public static void releaseStatics(boolean param0) {
        field_b = null;
        field_c = null;
        field_e = null;
        if (param0) {
          TextPromptState.releaseStatics(false);
        }
    }

    static {
        field_z = "ck.A(";
    }
}
