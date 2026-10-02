/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
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
            throw t.a((Throwable) ((Object) headerWriteFailure), "ke.B(" + languageId + ',' + methodGuard + ',' + clientId + ',' + serverNumber + ',' + (buffer != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 > -72) {
            ke.a((byte) 94);
            entitySpritesByThemeCategoryAndVariant = (Sprite[][][]) null;
            return;
        }
        entitySpritesByThemeCategoryAndVariant = (Sprite[][][]) null;
    }

    final static void b(byte param0) {
        int var1 = 0 % ((27 - param0) / 39);
    }

    static {
        entitySpritesByThemeCategoryAndVariant = new Sprite[7][7][7];
    }
}
