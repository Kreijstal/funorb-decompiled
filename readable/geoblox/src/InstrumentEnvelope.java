/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InstrumentEnvelope {
    int vibratoPhaseStep;
    static int[][] menuActionIds;
    static String[] field_k;
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
            wrappedFailure.field_d = wrappedFailure.field_d + ' ' + context;
        } else {
            wrappedFailure = new ContextualRuntimeException(cause, context);
        }
        return wrappedFailure;
    }

    final static boolean b(int param0) {
        if (param0 != 13) {
            field_k = (String[]) null;
            if (oc.field_e == null) {
                return false;
            }
            if (PacketBuffer.field_l == eh.field_b) {
                return true;
            }
            return false;
        }
        if (oc.field_e == null) {
            return false;
        }
        if (PacketBuffer.field_l == eh.field_b) {
            return true;
        }
        return false;
    }

    public static void a(int param0) {
        menuActionIds = (int[][]) null;
        field_k = null;
        if (param0 != 17348) {
            InstrumentEnvelope.b(-123);
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
        field_k = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
