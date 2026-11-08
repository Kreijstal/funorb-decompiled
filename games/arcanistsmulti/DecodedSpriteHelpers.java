/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DecodedSpriteHelpers {
    static String field_f;
    static int[] field_j;
    static String field_d;
    static int field_c;
    static String field_i;
    static String field_a;
    static long field_e;
    static GameOptionType field_b;
    static String field_g;
    static MusicCrossfadeStream field_h;

    public static void releaseStatics(int param0) {
        field_a = null;
        field_h = null;
        field_i = null;
        field_j = null;
        field_b = null;
        if (param0 != 28) {
          field_a = (String) null;
        }
        field_d = null;
        field_g = null;
        field_f = null;
    }

    final static Sprite[] createDecodedSprites(int param0) {
        int var2 = 0;
        int var6_int = 0;
        int var7 = 0;
        Sprite[] var1;
        int var3;
        int[] var6;
        int var8;
        int[] var9;
        int[] var13;
        int[] var16;
        byte[] var20;
        int[] var21;
        byte[] var22;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        var1 = new Sprite[ModalPanelStack.field_J];
        for (var2 = param0; var2 < ModalPanelStack.field_J; var2++) {
          var3 = ServerMessage.field_i[var2] * ChatLine.field_p[var2];
          var20 = AccountRegistrationPanel.field_I[var2];
          if (!SceneScrollPane.field_Ib[var2]) {
            var9 = new int[var3];
            var21 = var9;
            for (var6_int = 0; var3 > var6_int; var6_int++) {
              var9[var6_int] = PriceCaptionGlobals.field_c[NameValidator.bitAnd(255, (int) var20[var6_int])];
            }
            var1[var2] = new Sprite(QueuedResponse.field_g, QuickChatPhraseCache.field_a, BufferedMessage.field_l[var2], SectorCacheStore.field_d[var2], ChatLine.field_p[var2], ServerMessage.field_i[var2], var21);
          } else {
            var22 = FadingModalPanel.field_O[var2];
            var16 = new int[var3];
            var13 = var16;
            var6 = var13;
            for (var7 = 0; var7 < var3; var7++) {
              var6[var7] = BitAndSpriteHelpers.bitOr(PriceCaptionGlobals.field_c[NameValidator.bitAnd(255, (int) var20[var7])], NameValidator.bitAnd(-16777216, var22[var7] << 24));
            }
            var1[var2] = (Sprite) ((Object) new ArgbSprite(QueuedResponse.field_g, QuickChatPhraseCache.field_a, BufferedMessage.field_l[var2], SectorCacheStore.field_d[var2], ChatLine.field_p[var2], ServerMessage.field_i[var2], var16));
          }
        }
        CanvasRasterBuffer.releaseDecodeArrays(-18229);
        return var1;
    }

    static {
        field_j = new int[]{27, 28, 29};
        field_d = "Scamming";
        field_a = "Kick <%0> from this game";
        field_c = 256;
        field_i = "Who can join";
        field_f = "Primary";
        field_b = new GameOptionType(11, 0, 1, 2);
        field_g = "Become a member to buy this spell";
    }
}
