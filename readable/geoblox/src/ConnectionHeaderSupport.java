/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConnectionHeaderSupport {
    static Sprite[][][] entitySpritesByThemeCategoryAndVariant;

    final static void writeConnectionHeader(int languageId, boolean methodGuard, int clientId, int serverNumber, ByteArrayBuffer buffer) {
        try {
            buffer.writeByte((byte) 126, 12);
            buffer.writeShortBE(17, 28695);
            buffer.writeShortBE(clientId, 28695);
            if (!methodGuard) {
                entitySpritesByThemeCategoryAndVariant = (Sprite[][][]) null;
            }
            buffer.writeShortBE(serverNumber, 28695);
            buffer.writeByte((byte) 124, languageId);
        } catch (RuntimeException headerWriteFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) headerWriteFailure), "ke.B(" + languageId + ',' + methodGuard + ',' + clientId + ',' + serverNumber + ',' + (buffer != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearConnectionHeaderSprites(byte methodGuard) {
        if (methodGuard > -72) {
            ConnectionHeaderSupport.clearConnectionHeaderSprites((byte) 94);
            entitySpritesByThemeCategoryAndVariant = (Sprite[][][]) null;
            return;
        }
        entitySpritesByThemeCategoryAndVariant = (Sprite[][][]) null;
    }

    final static void evaluateConnectionHeaderGuard(byte methodGuard) {
        int guardResidue = 0 % ((27 - methodGuard) / 39);
    }

    static {
        entitySpritesByThemeCategoryAndVariant = new Sprite[7][7][7];
    }
}
