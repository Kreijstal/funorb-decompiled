/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AttachmentPointerState {
    static int newAttachmentCount;
    static String soundLabelText;
    static boolean pointerActivitySnapshot;
    private static String unusedDiagnosticPrefix;

    public static void releaseAttachmentPointerText(byte methodGuard) {
        soundLabelText = null;
        int sentinelRemainder = 123 % ((-66 - methodGuard) / 59);
    }

    static {
        unusedDiagnosticPrefix = "wb.A(";
        newAttachmentCount = 0;
        soundLabelText = "Sound: ";
        pointerActivitySnapshot = false;
    }
}
