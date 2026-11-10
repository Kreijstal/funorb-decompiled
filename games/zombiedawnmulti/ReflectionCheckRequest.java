/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReflectionCheckRequest extends IntrusiveNode {
    int[] field_i;
    static AudioStartupHelpers field_s;
    int field_n;
    static byte[][] field_f;
    int[] field_g;
    int[] field_q;
    byte[][][] field_o;
    PlatformTask[] field_m;
    PlatformTask[] field_l;
    int field_r;
    static PcmSampleStream field_k;
    static String field_h;
    static boolean field_p;
    static int field_j;

    final static void showDefaultQuickChatMenu(byte param0) {
        TextHotspot.showQuickChatMenu((byte) 4, QuickChatPhraseDefinition.field_t);
        if (param0 < 35) {
          field_p = false;
        }
    }

    public static void releaseStatics(int param0) {
        field_k = null;
        field_f = (byte[][]) null;
        field_s = null;
        field_h = null;
        if (param0 > -76) {
          field_k = (PcmSampleStream) null;
        }
    }

    final static void updateQuickChatMenu(byte param0, int param1, boolean param2, int param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        if (param0 == -45) {
          if (!LobbyScreenHelpers.field_b) {
            return;
          }
          PlayerProfile.field_l.updateRoot(-11838, param2);
          var4 = ScrollBar.field_Ib.hasPressedItem(-26899) ? 1 : 0;
          if (0 != StringHashHelpers.field_b &&
            var4 == 0) {
            param2 = false;
            LoginDialog.closeChatInputIfOpen(33423425);
          }
          if (param2) {
            ScrollBar.field_Ib.processPressedItems(param3, 255, param1);
          }
          if (var4 != 0) {
            PlayerProfile.field_l.updateRoot(-11838, param2);
          }
          var5 = ScrollBar.field_Ib.getOpenChainWidth(param0 ^ 29767) + ScrollBar.field_Ib.field_w;
          if (var5 > 640) {
            UnitView.field_Y = UnitView.field_Y + 5;
            return;
          }
          if (var5 < 635 &&
            UnitView.field_Y > 0) {
            UnitView.field_Y = UnitView.field_Y - 5;
            return;
          }
          return;
        }
        field_j = -28;
        if (!LobbyScreenHelpers.field_b) {
          return;
        }
        PlayerProfile.field_l.updateRoot(-11838, param2);
        var4Lifetime1 = ScrollBar.field_Ib.hasPressedItem(-26899) ? 1 : 0;
        if (0 != StringHashHelpers.field_b &&
          var4Lifetime1 == 0) {
          param2 = false;
          LoginDialog.closeChatInputIfOpen(33423425);
        }
        if (param2) {
          ScrollBar.field_Ib.processPressedItems(param3, 255, param1);
          if (var4Lifetime1 != 0) {
            PlayerProfile.field_l.updateRoot(-11838, param2);
          }
          var5Lifetime1 = ScrollBar.field_Ib.getOpenChainWidth(param0 ^ 29767) + ScrollBar.field_Ib.field_w;
          if (var5Lifetime1 > 640) {
            UnitView.field_Y = UnitView.field_Y + 5;
            return;
          }
          if (var5Lifetime1 >= 635) {
            return;
          }
          if (UnitView.field_Y <= 0) {
            return;
          }
          UnitView.field_Y = UnitView.field_Y - 5;
          return;
        }
        if (var4Lifetime1 == 0) {
          var5Lifetime2 = ScrollBar.field_Ib.getOpenChainWidth(param0 ^ 29767) + ScrollBar.field_Ib.field_w;
          if (var5Lifetime2 > 640) {
            UnitView.field_Y = UnitView.field_Y + 5;
            return;
          }
          if (var5Lifetime2 < 635 &&
            UnitView.field_Y > 0) {
            UnitView.field_Y = UnitView.field_Y - 5;
            return;
          }
          return;
        }
        PlayerProfile.field_l.updateRoot(-11838, param2);
        var5Lifetime3 = ScrollBar.field_Ib.getOpenChainWidth(param0 ^ 29767) + ScrollBar.field_Ib.field_w;
        if (var5Lifetime3 > 640) {
          UnitView.field_Y = UnitView.field_Y + 5;
        } else {
          if (var5Lifetime3 < 635 &&
            UnitView.field_Y > 0) {
            UnitView.field_Y = UnitView.field_Y - 5;
          }
        }
    }

    final static void toggleFullscreen(byte param0, boolean param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 < -27) {
          if (QueuedListRequest.field_h <= 0) {
            if (!ScorePopup.isGuestSession(100)) {
              var2 = 1;
            } else {
              var2 = 0;
            }
            if (ArchiveProvider.field_g == null &&
              PowerupProgressCard.field_o) {
              PopupMenuBuilder.buildPopupMenu(false, param1, var2);
              return;
            }
            return;
          }
          if (ArchiveProvider.field_g != null) {
            FullscreenSupport.field_f = ArchiveProvider.field_g.enterFullscreen(0);
            ResizableDialog.notifyBrowserResize(true, 2);
            if (null == FullscreenSupport.field_f) {
              var2 = 3;
            } else {
              var2 = 2;
              LoginPacketHelpers.attachCanvasInput(100, FullscreenSupport.field_f);
            }
            if (ArchiveProvider.field_g == null &&
              PowerupProgressCard.field_o) {
              PopupMenuBuilder.buildPopupMenu(false, param1, var2);
            }
            return;
          }
        } else {
          ReflectionCheckRequest.toggleFullscreen((byte) -56, false);
          if (QueuedListRequest.field_h <= 0) {
            if (!ScorePopup.isGuestSession(100)) {
              var2 = 1;
              if (ArchiveProvider.field_g == null &&
                PowerupProgressCard.field_o) {
                PopupMenuBuilder.buildPopupMenu(false, param1, var2);
                return;
              }
              return;
            }
            var2 = 0;
            if (ArchiveProvider.field_g == null &&
              PowerupProgressCard.field_o) {
              PopupMenuBuilder.buildPopupMenu(false, param1, var2);
              return;
            }
            return;
          }
          if (ArchiveProvider.field_g != null) {
            FullscreenSupport.field_f = ArchiveProvider.field_g.enterFullscreen(0);
            ResizableDialog.notifyBrowserResize(true, 2);
            if (null == FullscreenSupport.field_f) {
              var2 = 3;
            } else {
              var2 = 2;
              LoginPacketHelpers.attachCanvasInput(100, FullscreenSupport.field_f);
            }
            if (ArchiveProvider.field_g == null &&
              PowerupProgressCard.field_o) {
              PopupMenuBuilder.buildPopupMenu(false, param1, var2);
              return;
            }
            return;
          }
        }
        FullscreenSupport.field_f = PendingIntArrayRequest.openFullscreenWindow(10386, ArrayWidgetGroup.field_J, 480, 0, 0, 640);
        if (null == FullscreenSupport.field_f) {
          var2Lifetime1 = 3;
        } else {
          var2Lifetime1 = 2;
          LoginPacketHelpers.attachCanvasInput(100, FullscreenSupport.field_f);
        }
        if (ArchiveProvider.field_g != null) {
          return;
        }
        if (!PowerupProgressCard.field_o) {
          return;
        }
        PopupMenuBuilder.buildPopupMenu(false, param1, var2Lifetime1);
    }

    final static void initializeChatHistory(int param0, int param1) {
        MoveOrderMarker.field_g = 0;
        ValidationIconWidget.field_M = new ChatMessage[param0 * 15];
        InfectionEvent.field_m = param0;
        LoginDialog.field_ub = new int[3];
        if (param1 > -11) {
          field_f = (byte[][]) null;
        }
    }

    ReflectionCheckRequest() {
    }

    static {
        field_f = new byte[1000][];
        field_s = new AudioStartupHelpers();
        field_h = "You have been removed from <%0>'s game.";
        field_j = 0;
    }
}
