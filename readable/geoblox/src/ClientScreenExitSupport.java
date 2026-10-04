/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientScreenExitSupport {
    static AudioOutput gameSoundOutput;
    static String unpackingGraphicsText;
    static DialogLayer fullscreenDialogLayer;

    final static void handleSessionExitServiceResult(int unusedCenterX, int unusedCenterY, BitmapFont unusedFont, int unusedLineSpacing, int methodGuard, int unusedLineHeight) {
        try {
            ClientFlowState.requestSessionExit((byte) 107);
            int guardResidue = 72 % ((methodGuard + 78) / 44);
        } catch (RuntimeException exitFailureForContext) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) exitFailureForContext), "oh.B(" + unusedCenterX + ',' + unusedCenterY + ',' + (unusedFont != null ? "{...}" : "null") + ',' + unusedLineSpacing + ',' + methodGuard + ',' + unusedLineHeight + ')');
        }
    }

    public static void clearScreenExitResources(byte methodGuard) {
        unpackingGraphicsText = null;
        fullscreenDialogLayer = null;
        gameSoundOutput = null;
        if (methodGuard > -73) {
            fullscreenDialogLayer = (DialogLayer) null;
        }
    }

    static {
        unpackingGraphicsText = "Unpacking graphics";
    }
}
