/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleSyntaxException extends Exception {
    int sourceOffset;
    private static String field_z;

    ConsoleSyntaxException(int param0) {
        this.sourceOffset = param0;
    }

    static {
        field_z = "ojb.<init>(";
    }
}
