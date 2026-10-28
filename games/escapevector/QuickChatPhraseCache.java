/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPhraseCache {
    private ResourceArchive localArchive;
    private WeightedLruCache cache;
    static int field_h;
    private ResourceArchive globalArchive;
    static TerrainMaskSupport field_b;
    static int field_e;
    static boolean field_g;
    static String field_f;
    static String field_a;
    static PcmSample field_i;

    final static void showLoginDialog(String unusedMessage, boolean allowGuest, int guard, boolean showCreateAccount) {
        try {
          if (guard != 64) {
            field_i = (PcmSample) null;
          }
          AccountNoticeKind.resetAccountFlow(3161);
          Checkbox.field_F.closeAllPanels(guard ^ 17479);
          PcmResampler.field_d = new LoginForm(StrongCacheEntry.field_v, (String) null, DialWidget.field_H, showCreateAccount, allowGuest);
          SpaceCompactionSupport.loginDialog = new LoginDialog(Checkbox.field_F, PcmResampler.field_d);
          Checkbox.field_F.pushPanel(SpaceCompactionSupport.loginDialog, 40);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ff.A(" + (unusedMessage != null ? "{...}" : "null") + ',' + allowGuest + ',' + guard + ',' + showCreateAccount + ')');
        }
    }

    public static void releaseStatics(int guard) {
        field_i = null;
        field_b = null;
        field_f = null;
        if (guard != 100) {
          field_a = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final QuickChatPhraseDefinition phrase(int id, byte guard) {
        byte[] var4 = null;
        QuickChatPhraseDefinition var3 = (QuickChatPhraseDefinition) (this.cache.get((long)id, (byte) -54));
        if (var3 != null) {
          return var3;
        }
        if (id >= 32768) {
          var4 = this.globalArchive.getFile(1, (byte) -97, 32767 & id);
        } else {
          var4 = this.localArchive.getFile(1, (byte) -97, id);
        }
        var3 = new QuickChatPhraseDefinition();
        if (var4 != null) {
          var3.decode(new PacketBuffer(var4), 0);
        }
        if (id >= 32768) {
          var3.markGlobalResponses((byte) 88);
        }
        if (guard <= -118) {
          this.cache.put(var3, (long)id, (byte) 100);
          return var3;
        }
        field_e = -127;
        this.cache.put(var3, (long)id, (byte) 100);
        return var3;
    }

    final static void advanceMenuTransition(byte guard) {
        if (guard <= 50) {
          QuickChatPhraseCache.advanceMenuTransition((byte) -15);
        }
        SectorCacheStore.a((byte) 123);
        if (mj.field_d != 0) {
          if (mj.field_d < 1000) {
            mj.field_d = mj.field_d + 1;
            AlternateUsernameCredentials.field_q.update(400);
            SingleChildContainer.field_y = true;
            IntValueNode.field_j = true;
            return;
          }
          AlternateUsernameCredentials.field_q.update(400);
          SingleChildContainer.field_y = true;
          IntValueNode.field_j = true;
          return;
        }
        if (AccountPanelInputSupport.field_c != null) {
          AccountPanelInputSupport.field_c.fadeOut(2048);
        } else {
          AccountPanelInputSupport.field_c = PcmSampleStream.createAtRatePercentQ6(SecondaryNodeHashTable.field_g, 100, 3072 * IterableNodeHashTable.field_c / 64, 8192);
          ObjectSpriteSet.field_e.addSubstream(AccountPanelInputSupport.field_c);
          StringNode.playFrameAppearSound(8192, (byte) 51);
          if (mj.field_d < 1000) {
            mj.field_d = mj.field_d + 1;
            AlternateUsernameCredentials.field_q.update(400);
            SingleChildContainer.field_y = true;
            IntValueNode.field_j = true;
            return;
          }
          AlternateUsernameCredentials.field_q.update(400);
          SingleChildContainer.field_y = true;
          IntValueNode.field_j = true;
          return;
        }
        AccountPanelInputSupport.field_c = PcmSampleStream.createAtRatePercentQ6(SecondaryNodeHashTable.field_g, 100, 3072 * IterableNodeHashTable.field_c / 64, 8192);
        ObjectSpriteSet.field_e.addSubstream(AccountPanelInputSupport.field_c);
        StringNode.playFrameAppearSound(8192, (byte) 51);
        if (mj.field_d < 1000) {
          mj.field_d = mj.field_d + 1;
          AlternateUsernameCredentials.field_q.update(400);
          SingleChildContainer.field_y = true;
          IntValueNode.field_j = true;
          return;
        }
        AlternateUsernameCredentials.field_q.update(400);
        SingleChildContainer.field_y = true;
        IntValueNode.field_j = true;
    }

    private QuickChatPhraseCache() throws Throwable {
        throw new Error();
    }

    static {
        field_b = new TerrainMaskSupport();
        field_a = "Waiting for extra data";
        field_f = "Container is on hill - please land closer";
    }
}
