/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextWidgetSupport {
    static int gameTextArchiveId;
    static volatile int livePointerPressX;
    static ResourceArchive field_c;
    static int byteArrayPool5000Count;
    static String connectionLostReconnectingText;

    public static void clearTextWidgetResources(int methodGuard) {
        field_c = null;
        int guardResidue = -79 % ((methodGuard + 15) / 50);
        connectionLostReconnectingText = null;
    }

    final static String buildRepeatedCharacterRange(int startIndex, char character, int length) {
        int characterIndex = 0;
        int clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        char[] characters = new char[length];
        char[] unusedCharactersAlias = characters;
        for (characterIndex = startIndex; characterIndex < length; characterIndex++) {
            characters[characterIndex] = character;
        }
        return new String(characters);
    }

    final static TextWidgetRenderer getDefaultTextWidgetRenderer(byte methodGuard) {
        if (TextInputRenderer.sharedDefaultTextWidgetRenderer == null) {
            TextInputRenderer.sharedDefaultTextWidgetRenderer = new TextWidgetRenderer(UiFontResources.commonUiSmallFont, 20, 0, 0, 0, 11579568, -1, 0, 0, UiFontResources.commonUiSmallFont.maxAscent, -1, 2147483647, true);
        }
        if (methodGuard >= -39) {
            TextWidgetSupport.clearTextWidgetResources(-8);
        }
        return TextInputRenderer.sharedDefaultTextWidgetRenderer;
    }

    static {
        livePointerPressX = 0;
        byteArrayPool5000Count = 0;
        connectionLostReconnectingText = "Connection lost - attempting to reconnect";
    }
}
