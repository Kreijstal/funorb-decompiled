/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SaveChangesDialog extends MessageDialog {
    static ModelMaterial[] field_H;
    static boolean field_G;
    static Sprite[] field_F;

    final static boolean handleChatShortcut(int param0, int param1, int param2) {
        int var3 = null != ArchiveSource.field_b ? 1 : 0;
        if (FixedQuaternion.field_e == 9 &&
          PitchPurchaseSupport.canSendQuickChat(GameOverView.field_z, DefaultPlayerFactory.field_a, (byte) -64, PlayerShopScreen.field_S, PlayerModelPreview.field_r)) {
          if (GameOverView.field_z != 2 &&
            var3 != 0) {
            return false;
          }
          return ConsoleArgumentSupport.beginPrivateQuickChat(PlayerModelPreview.field_r, DefaultPlayerFactory.field_a, (byte) 124, GameOverView.field_z, PlayerShopScreen.field_S);
        }
        int var4 = 1 % ((59 - param0) / 44);
        if (10 == FixedQuaternion.field_e) {
          if (var3 != 0) {
            return false;
          }
          ChatComposeMode.setComposeMode(0);
          return true;
        }
        if (11 == FixedQuaternion.field_e &&
          CommonGame.field_j) {
          if (PlayerShopScreen.field_K == 2 &&
            !TournamentChampionDialog.canSendPrivateChatTo(false, ArchivePreloadEntry.field_f, SectorCacheStore.field_c)) {
            return false;
          }
          if (2 != PlayerShopScreen.field_K &&
            var3 != 0) {
            return false;
          }
          if (!MusicPatch.tryAcquireChatSendPermit(0)) {
            return true;
          }
          String var5 = (String) null;
          PasswordLoginCredentials.sendChatPacket(PitchDecorationSupport.field_h, 101, PlayerShopScreen.field_K, param2, ArchivePreloadEntry.field_f, (String) null);
          return true;
        }
        return false;
    }

    SaveChangesDialog() {
        super(1);
    }

    final void handleResult(int param0, int param1) {
        int var4 = Kickabout.field_G;
        super.handleResult(127, param1);
        if (0 == param1) {
          TexturedPanelPainter.c((byte) -56);
          DelayedServerPacket.a(13, true, -2);
        } else {
          if (param1 == 1) {
            TeamSelectionView.discardPendingManagerActions(-120);
            DelayedServerPacket.a(13, true, -2);
          } else {
            if (param1 != 2) {
            }
          }
        }
        if (param0 <= 60) {
          field_H = (ModelMaterial[]) null;
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 13) {
          field_H = (ModelMaterial[]) null;
        }
        field_H = null;
        field_F = null;
    }

    static {
    }
}
