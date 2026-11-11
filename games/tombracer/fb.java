/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static ValidationOutcome field_c;
    static String field_b;
    static byte[][] field_a;
    private static String field_z;

    public static void releaseStatics(boolean param0) {
        if (param0) {
          field_a = (byte[][]) null;
          field_b = null;
          field_c = null;
          return;
        }
        fb.releaseStatics(true);
        field_a = (byte[][]) null;
        field_b = null;
        field_c = null;
    }

    static {
        field_z = "fb.A(";
        field_c = new ValidationOutcome();
        field_a = new byte[50][];
        field_b = "Who doesn't love mazes? They're staggering and stunning, cunning and confounding, astounding and - oh, what's the word?";
    }
}
