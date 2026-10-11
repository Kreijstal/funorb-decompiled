/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SessionTextState {
    static PrefixCodeDecoder compressedTextDecoder;
    static int[] receivedTextTemplateReferences;
    static Sprite[] bangFrames;
    private static String unusedDiagnosticPrefix;

    public static void releaseSessionTextResources(int methodGuard) {
        int sentinelRemainder = 86 % ((51 - methodGuard) / 45);
        receivedTextTemplateReferences = null;
        bangFrames = null;
        compressedTextDecoder = null;
    }

    static {
        unusedDiagnosticPrefix = "vj.A(";
    }
}
