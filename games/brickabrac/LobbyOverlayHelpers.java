/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyOverlayHelpers extends IntrusiveNode {
    static RgbSprite[] arcticCentreSprites;
    static int field_i;
    static int incomingPacketLength;
    static boolean[] field_l;

    public LobbyOverlayHelpers() {
    }

    final static void drawLobbyOverlays(boolean param0, int param1) {
        boolean decompiledFrameRemainder0 = true;
        if ((TextLineLayout.field_b <= 0) &&
          (decompiledFrameRemainder0 = (!(IntArrayRequest.field_j <= 0) ||
          !(0 >= TableDataRequest.field_m))) &&
          (decompiledFrameRemainder0 = !(!MeshLobbyUiHelpers.joinRequestsPanelOpen))) {
          Rasterizer2D.darkenRectangle(0, 0, Rasterizer2D.width, DualLinkDeque.field_d.screenY);
          ProxySocketConnector.field_j.drawRoot(true, param0);
          if (param1 >= -106) {
            field_l = (boolean[]) null;
          }
          return;
        }
        if (decompiledFrameRemainder0) {
          if (RasterStackHelpers.field_c) {
            Rasterizer2D.darkenRectangle(0, 0, Rasterizer2D.width, DualLinkDeque.field_d.screenY);
            PlayerBadgeHelpers.field_f.drawRoot(true, param0);
            if ((!(IntArrayRequest.field_j <= 0) ||
              !(0 >= TableDataRequest.field_m)) &&
              MeshLobbyUiHelpers.joinRequestsPanelOpen) {
              Rasterizer2D.darkenRectangle(0, 0, Rasterizer2D.width, DualLinkDeque.field_d.screenY);
              ProxySocketConnector.field_j.drawRoot(true, param0);
            }
          } else {
            if (IntArrayRequest.field_j > 0) {
              if (MeshLobbyUiHelpers.joinRequestsPanelOpen) {
                Rasterizer2D.darkenRectangle(0, 0, Rasterizer2D.width, DualLinkDeque.field_d.screenY);
                ProxySocketConnector.field_j.drawRoot(true, param0);
              }
            } else {
              if (0 < TableDataRequest.field_m &&
                MeshLobbyUiHelpers.joinRequestsPanelOpen) {
                Rasterizer2D.darkenRectangle(0, 0, Rasterizer2D.width, DualLinkDeque.field_d.screenY);
                ProxySocketConnector.field_j.drawRoot(true, param0);
              }
            }
          }
        }
        if (param1 < -106) {
          return;
        }
        field_l = (boolean[]) null;
    }

    final static void decreaseMasterSoundGain(int obfuscationGuard) {
        int var1 = 0;
        int var1Lifetime1;
        int var1Lifetime2;
        if (BackgroundScene.masterSoundGain <= 32) {
          SingleChildWidget.applyMasterSoundGain(13894, 0);
          var1 = -2 % ((-60 - obfuscationGuard) / 34);
          return;
        }
        var1Lifetime1 = BackgroundScene.masterSoundGain % 32;
        if (0 == var1Lifetime1) {
          var1Lifetime1 = 32;
        }
        SingleChildWidget.applyMasterSoundGain(13894, BackgroundScene.masterSoundGain - var1Lifetime1);
        var1Lifetime2 = -2 % ((-60 - obfuscationGuard) / 34);
    }

    final static boolean isEmailAvailabilityPending(int obfuscationGuard) {
        if (obfuscationGuard != 30794) {
          return false;
        }
        return !LabeledWidget.emailAvailabilityRequest.isCompleted(96) ? true : false;
    }

    public static void clearSharedReferences(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          LobbyOverlayHelpers.clearSharedReferences(51);
          field_l = null;
          arcticCentreSprites = null;
          return;
        }
        field_l = null;
        arcticCentreSprites = null;
    }

    static {
    }
}
