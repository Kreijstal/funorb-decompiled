/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LoginPayload {
    static String endGameText;
    static IndexedSprite spaceBackgroundSprite;

    abstract LoginPayloadKind payloadKind(byte methodGuard);

    abstract void writePayload(int methodGuard, ByteArrayBuffer buffer);

    final static void detachPointerInputListeners(boolean clearSpaceBackgroundSprite, java.awt.Component component) {
        try {
            component.removeMouseListener(GameplaySetupSupport.pointerListener);
            component.removeMouseMotionListener(GameplaySetupSupport.pointerListener);
            if (clearSpaceBackgroundSprite) {
                spaceBackgroundSprite = (IndexedSprite) null;
            }
            component.removeFocusListener(GameplaySetupSupport.pointerListener);
            Under13TermsPanel.liveHeldPointerButton = 0;
        } catch (RuntimeException detachFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) detachFailure), "df.F(" + clearSpaceBackgroundSprite + ',' + (component != null ? "{...}" : "null") + ')');
        }
    }

    final static PcmStreamMixer getSharedPcmMixer(byte methodGuard) {
        if (methodGuard <= 11) {
            LoginPayload.getSharedPcmMixer((byte) 74);
            return DiskCacheWorker.sharedPcmMixerReference;
        }
        return DiskCacheWorker.sharedPcmMixerReference;
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard != 0) {
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
