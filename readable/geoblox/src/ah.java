/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static int field_a;
    static volatile int livePointerPressX;
    static ResourceArchive field_c;
    static int field_d;
    static String connectionLostReconnectingText;

    public static void a(int param0) {
        field_c = null;
        int var1 = -79 % ((param0 + 15) / 50);
        connectionLostReconnectingText = null;
    }

    final static String a(int param0, char param1, int param2) {
        int var4 = 0;
        int var5 = Geoblox.clientControlFlowFlag;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        for (var4 = param0; var4 < param2; var4++) {
            var6[var4] = param1;
        }
        return new String(var6);
    }

    final static TextWidgetRenderer a(byte param0) {
        if (TextInputRenderer.field_t == null) {
            TextInputRenderer.field_t = new TextWidgetRenderer(UiFontResources.commonUiSmallFont, 20, 0, 0, 0, 11579568, -1, 0, 0, UiFontResources.commonUiSmallFont.maxAscent, -1, 2147483647, true);
        }
        if (param0 >= -39) {
            ah.a(-8);
        }
        return TextInputRenderer.field_t;
    }

    static {
        livePointerPressX = 0;
        field_d = 0;
        connectionLostReconnectingText = "Connection lost - attempting to reconnect";
    }
}
