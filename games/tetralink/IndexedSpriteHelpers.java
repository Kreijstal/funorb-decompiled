/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IndexedSpriteHelpers {
    static String field_a;
    static QuickChatCommandType field_e;
    static String[] field_b;
    static UiComponent field_d;
    static PcmSample field_c;
    static Sprite field_f;

    public static void releaseStatics(byte param0) {
        field_e = null;
        field_b = null;
        field_f = null;
        field_a = null;
        if (param0 <= 70) {
          return;
        }
        field_c = null;
        field_d = null;
    }

    final static void openPopupMenuAt(int param0, byte param1, int param2, Sprite[] param3) {
        if (param1 != -92) {
          return;
        }
        try {
          ReflectionCheck.field_o = new NineSliceFrame(param3);
          MusicPatch.field_D = param0;
          BufferedSocket.field_b = param2;
          SocketConnector.positionPopupMenu(-69);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "e.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static IndexedSprite[] buildIndexedSprites(byte param0) {
        int var2 = 0;
        int var3 = TetraLink.field_J;
        IndexedSprite[] var1 = new IndexedSprite[PendingListRequest.field_n];
        for (var2 = 0; PendingListRequest.field_n > var2; var2++) {
          var1[var2] = new IndexedSprite(ImageProducerRasterBuffer.field_l, PasswordValidator.field_w, QuickChatCategory.field_x[var2], ViewportController.field_t[var2], IntrusiveDeque.field_h[var2], ErrorPrintHelpers.field_e[var2], JoinGameTextGlobals.field_a[var2], LobbyResourceHelpers.field_c);
        }
        if (param0 >= 98) {
          DecodedSpriteBuffers.clearDecodedSpriteData(-125);
          return var1;
        }
        IndexedSpriteHelpers.buildIndexedSprites((byte) 60);
        DecodedSpriteBuffers.clearDecodedSpriteData(-125);
        return var1;
    }

    static {
        field_a = "Lost";
        field_e = new QuickChatCommandType(6, 0, 4, 2);
        field_b = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
