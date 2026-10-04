/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InstrumentEnvelope {
    int vibratoPhaseStep;
    static int[][] menuActionIds;
    static String[] connectingToUpdateServerTextByLanguage;
    int vibratoDepth;
    int decayRate;
    int releaseEnvelopeKeyScaling;
    byte[] releaseEnvelope;
    byte[] volumeEnvelope;
    int vibratoRampTicks;
    int volumeEnvelopeKeyScaling;
    int decayKeyScaling;

    final static ContextualRuntimeException withFailureContext(Throwable cause, String context) {
        ContextualRuntimeException wrappedFailure = null;
        if (cause instanceof ContextualRuntimeException) {
            wrappedFailure = (ContextualRuntimeException) ((Object) cause);
            wrappedFailure.contextPath = wrappedFailure.contextPath + ' ' + context;
        } else {
            wrappedFailure = new ContextualRuntimeException(cause, context);
        }
        return wrappedFailure;
    }

    final static boolean isSessionConnected(int methodGuard) {
        if (methodGuard != 13) {
            connectingToUpdateServerTextByLanguage = (String[]) null;
            if (SpriteCheckboxRenderer.sessionSocket == null) {
                return false;
            }
            if (PacketBuffer.currentProtocolStage == LogoCompositor.connectedSessionStage) {
                return true;
            }
            return false;
        }
        if (SpriteCheckboxRenderer.sessionSocket == null) {
            return false;
        }
        if (PacketBuffer.currentProtocolStage == LogoCompositor.connectedSessionStage) {
            return true;
        }
        return false;
    }

    public static void releaseStaticReferences(int methodGuard) {
        menuActionIds = (int[][]) null;
        connectingToUpdateServerTextByLanguage = null;
        if (methodGuard != 17348) {
            InstrumentEnvelope.isSessionConnected(-123);
        }
    }

    static {
        menuActionIds = new int[9][];
        menuActionIds[7] = new int[]{13, 5};
        menuActionIds[4] = new int[]{13, 14};
        menuActionIds[2] = new int[]{16, 17, 18, 5};
        menuActionIds[3] = new int[]{11, 5, 12, 15};
        menuActionIds[8] = new int[]{13, 5};
        menuActionIds[1] = new int[]{1, 8, 9, 4, 3, 6};
        menuActionIds[5] = new int[]{5};
        menuActionIds[6] = new int[]{2, 5};
        menuActionIds[0] = new int[]{0, 3, 8, 9, 4, 2, 10, 7};
        connectingToUpdateServerTextByLanguage = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
