/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LoginPayload {
    static String endGameText;
    static IndexedSprite spaceBackgroundSprite;

    abstract LoginPayloadKind payloadKind(byte methodGuard);

    abstract void writePayload(int methodGuard, ByteArrayBuffer buffer);

    final static void a(boolean param0, java.awt.Component param1) {
        try {
            param1.removeMouseListener(GameplaySetupSupport.pointerListener);
            param1.removeMouseMotionListener(GameplaySetupSupport.pointerListener);
            if (param0) {
                spaceBackgroundSprite = (IndexedSprite) null;
            }
            param1.removeFocusListener(GameplaySetupSupport.pointerListener);
            Under13TermsPanel.liveHeldPointerButton = 0;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "df.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static PcmStreamMixer b(byte param0) {
        if (param0 <= 11) {
            LoginPayload.b((byte) 74);
            return DiskCacheWorker.field_e;
        }
        return DiskCacheWorker.field_e;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            endGameText = (String) null;
            spaceBackgroundSprite = null;
            endGameText = null;
            return;
        }
        spaceBackgroundSprite = null;
        endGameText = null;
    }

    static {
        endGameText = "End Game";
    }
}
