/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QueuedResultSubmission extends IntrusiveNode {
    static SpriteWidget field_n;
    int field_q;
    int field_l;
    static int[] field_g;
    int field_o;
    static Sprite field_h;
    static String field_i;
    int field_p;
    int field_m;
    static double[] field_k;
    int field_j;

    public static void releaseStatics(int param0) {
        field_g = null;
        field_i = null;
        if (param0 != 8355711) {
          field_h = (Sprite) null;
        }
        field_h = null;
        field_n = null;
        field_k = null;
    }

    final static ChatMessage rebuildChatHistoryRows(int param0, int param1, int param2, int param3) {
        boolean stackIn_50_0 = false;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        ChatMessage var8_ref_cj;
        int var9;
        ChatMessage var9_ref_cj;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = Virogrid.field_F ? 1 : 0;
        if (param0 != -1403) {
          QueuedResultSubmission.rebuildChatHistoryRows(100, 27, 28, 13);
        }
        var4 = null;
        StatusAndUrlHelpers.field_c.field_Jb.field_W.clear(false);
        var5 = 0;
        var6 = 0;
        for (var7 = AccountCreationForm.field_K - 1; var7 >= 0; var7--) {
          var8_ref_cj = BufferedSocket.field_s[var7];
          var9 = 0;
          if (!FrameSkin.field_f &&
            var5 < ArchiveRequest.field_s) {
            var10_int = UiTheme.getChatFilterSetting(var8_ref_cj.field_n, (byte) 82);
            if (var8_ref_cj.displayPriority(-6761) >= var10_int && (var8_ref_cj.field_j ||
              !WhirlpoolDigest.isFriend(var8_ref_cj.field_i, -1369854352))) {
              var9 = 1;
            }
          }
          if (var9 == 0) {
            var8_ref_cj.field_t = null;
          } else {
            if (var8_ref_cj.field_t != null &&
              !QuickChatPhraseRegistry.field_l) {
              var5++;
            } else {
              if (var8_ref_cj.field_t == null) {
                QuickChatCategoryCache.field_j = QuickChatCategoryCache.field_j + 1;
              }
              var10 = LongAndTextLoginPayload.formatChatPrefix((byte) -100, var8_ref_cj);
              var11 = var10 + BitmapFont.escapeMarkup(var8_ref_cj.field_h);
              var12 = MusicPatchEnvelope.getChatLineColour(param0 ^ -18302, var8_ref_cj);
              var8_ref_cj.field_t = new SpriteWidget(0L, ByteStorage.field_d, var11);
              var6 = var6 + param3;
              var8_ref_cj.field_t.field_ab = ((ByteStorage.field_d.field_ab & 16711422) >> 1) - (8355711 & var12 >> 1) + var12;
              var8_ref_cj.field_t.field_A = -(var12 >> 1 & 8355711) + var12 + (ByteStorage.field_d.field_A >> 1 & 8355711);
              var8_ref_cj.field_t.field_E = var12;
              var8_ref_cj.field_t.field_C = IconTextComponent.field_Ob;
              var5++;
            }
          }
        }
        var7Lifetime1 = 0;
        for (var8 = 0; var8 < AccountCreationForm.field_K; var8++) {
          var9_ref_cj = BufferedSocket.field_s[var8];
          if (null != var9_ref_cj.field_t) {
            StatusAndUrlHelpers.field_c.field_Jb.addChild(0, var9_ref_cj.field_t);
            var9_ref_cj.field_t.setGeometry(param2, param3, var9_ref_cj.field_t.measureNaturalWidth((byte) 81), (byte) -44, var7Lifetime1);
            var7Lifetime1 = var7Lifetime1 + param3;
            if (var9_ref_cj.field_t.field_nb != 0) {
              var4 = var9_ref_cj;
            }
          }
        }
        var8Lifetime1 = StatusAndUrlHelpers.field_c.field_Jb.field_ub + StatusAndUrlHelpers.field_c.field_Jb.field_kb + var6 - var7Lifetime1;
        StatusAndUrlHelpers.field_c.field_Jb.field_ub = StatusAndUrlHelpers.field_c.field_Jb.field_ub - var8Lifetime1;
        StatusAndUrlHelpers.field_c.field_Jb.field_F = StatusAndUrlHelpers.field_c.field_Jb.field_F + var8Lifetime1;
        if (QuickChatPhraseRegistry.field_l) {
          StatusAndUrlHelpers.field_c.field_Jb.field_ub = var7Lifetime1;
        }
        StatusAndUrlHelpers.field_c.field_Jb.field_kb = -StatusAndUrlHelpers.field_c.field_Jb.field_ub + var7Lifetime1;
        if (QuickChatPhraseRegistry.field_l) {
          StatusAndUrlHelpers.field_c.field_Jb.field_F = StatusAndUrlHelpers.field_c.field_Eb.field_ub - StatusAndUrlHelpers.field_c.field_Jb.field_ub;
          QuickChatPhraseRegistry.field_l = false;
          GameBoard.field_i = true;
          StatusAndUrlHelpers.field_c.field_Jb.field_Cb = 0;
        }
        if (ArchiveLoadSequence.field_h &&
          ArchiveLoadSequence.field_i != null) {
          GameBoard.field_i = true;
        }
        var9Lifetime1 = -StatusAndUrlHelpers.field_c.field_Jb.field_kb - StatusAndUrlHelpers.field_c.field_Jb.field_ub + StatusAndUrlHelpers.field_c.field_Eb.field_ub;
        if (GameBoard.field_i) {
          StatusAndUrlHelpers.field_c.field_Jb.field_Cb = var9Lifetime1 - StatusAndUrlHelpers.field_c.field_Jb.field_F;
        }
        StatusAndUrlHelpers.field_c.updateScroll(-1, param3, true, param1 * (2 * param3));
        stackIn_50_0 = (var9Lifetime1 == StatusAndUrlHelpers.field_c.field_Jb.field_Cb + StatusAndUrlHelpers.field_c.field_Jb.field_F);
        GameBoard.field_i = stackIn_50_0;
        return (ChatMessage) (var4);
    }

    private QueuedResultSubmission() throws Throwable {
        throw new Error();
    }

    static {
        field_g = new int[1024];
        field_i = "Type your age in years";
    }
}
