/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class DialogLayer extends SingleChildWidget {
    private IntrusiveDeque dialogs;
    static String multiconstFriends;
    static SceneNode field_R;
    static int[] field_T;
    static String timerMinutesSeconds;
    static Sprite field_Q;
    static String connectionlostWithreason;
    static String playerListLast;
    static int field_V;
    static int field_W;

    final static boolean pollPacketBytes(byte obfuscationGuard, int requiredBytes) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          if (requiredBytes <= PlayerContextMenu.field_e.position) {
            return true;
          }
          if (null == Atan2Support.field_c) {
            return false;
          }
          try {
            var2_int = Atan2Support.field_c.availableBytes(107);
            if (obfuscationGuard < 27) {
              connectionlostWithreason = (String) null;
            }
            if (0 < var2_int) {
              if (var2_int > requiredBytes - PlayerContextMenu.field_e.position) {
                var2_int = requiredBytes - PlayerContextMenu.field_e.position;
              }
              Atan2Support.field_c.readFully(var2_int, 0, PlayerContextMenu.field_e.position, PlayerContextMenu.field_e.payload);
              MenuScreen.field_v = MonotonicClock.monotonicTimeMillis((byte) -97);
              PlayerContextMenu.field_e.position = PlayerContextMenu.field_e.position + var2_int;
              if (requiredBytes > PlayerContextMenu.field_e.position) {
                return false;
              }
              PlayerContextMenu.field_e.position = 0;
              return true;
            }
            if (var2_int < 0) {
              ShotEvent.closeClientSocket(64);
            } else {
              if (CushionSegment.millisSinceNetworkActivity((byte) 127) <= 30000L) {
                return false;
              }
              ShotEvent.closeClientSocket(64);
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            ShotEvent.closeClientSocket(43);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public DialogLayer() {
        super(0, 0, TranslatedUiText.field_j, RenderingInitializationSupport.field_b, (WidgetPainter) null, (WidgetListener) null);
        this.dialogs = new IntrusiveDeque();
    }

    final void hideAllDialogs(int param0) {
        int var4 = Pool.field_O;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.dialogs);
        if (param0 != -22216) {
          return;
        }
        FadingDialog var3 = (FadingDialog) (var2.last((byte) -92));
        while (var3 != null) {
          var3.dialogOpen = false;
          var3 = (FadingDialog) (var2.previous(param0 ^ 22169));
        }
        this.child = null;
    }

    final static void updateBottomChatPanel(int param0, boolean param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        UiComponent var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        ChatMessage var9 = null;
        var7 = Pool.field_O;
        try {
          if (OpacityWidget.field_P.height != AwtEventQueueSupport.field_g) {
            StrongCacheEntry.field_J = StrongCacheEntry.field_J + (OpacityWidget.field_P.height - AwtEventQueueSupport.field_g);
            AwtEventQueueSupport.field_g = OpacityWidget.field_P.height;
          }
          if (BufferedFile.field_h > HighscoresScreen.field_P) {
            HighscoresScreen.field_P = HighscoresScreen.field_P + 1;
          }
          if (HighscoresScreen.field_P <= 0) {
            return;
          }
          ProgressDialog.layoutBottomChatPanel(23323);
          IntLookupQuery.field_q.updateRoot(param1, false);
          if (null != ThemeSelectScreen.field_J) {
            if (!RankingsRequest.field_z) {
              ThemeSelectScreen.field_J = null;
            } else {
              ThemeSelectScreen.field_J.processPointerFrame(-125, IntLookupQuery.field_q.screenX, param1, IntLookupQuery.field_q.screenY);
            }
          }
          for (var4_int = 0; 5 > var4_int; var4_int++) {
            var5 = BeveledFrameSpriteFactory.field_g[var4_int];
            if (var5 != null) {
              if (var5.pressedButton != 0) {
                NodeHashTableIterator.openChatFilterMenu(27937, var5, var4_int);
              }
              var6 = LobbyPanelLayoutSupport.getChatFilterMode(param2 ^ 5, var4_int);
              AlignedIconLabel.field_Mb[var4_int].sprite = ThemeSelectScreen.field_M[var6];
              GradientPaletteSupport.field_b[var4_int].text = TranslatedUiText.field_i[var6];
            }
          }
          if (param2 != MeshBoundsSupport.field_e.pressedButton) {
            AccountMenuText.field_b = new ReportAbuseDialog(MeshBoundsSupport.field_e.screenX, MeshBoundsSupport.field_e.screenY, MeshBoundsSupport.field_e.width, MeshBoundsSupport.field_e.height, param3, AccountStateQuery.field_m, DiskArchiveRequest.field_J, VertexTransformSupport.field_f, AlignedIconLabel.field_Lb, ChoiceButtonSupport.field_e, UiWidget.field_A, (String) null, 0L);
          }
          var9 = IntrusiveNodeHashTable.updateChatHistoryAndPollMessage(param0, (byte) -126, ArchiveIndex.field_x, CueAim.field_j);
          if (var9 != null) {
            IntegerSyntaxSupport.openChatMessageContextMenu(var9, 122);
          }
          var8 = GlowParticle.updateChatHeader(1);
          if (var8 != null) {
            CacheEntry.field_B = var8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var4), "lq.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void renderWidget(int param0, byte param1, int param2, int param3) {
        int var8 = Pool.field_O;
        int var6 = 22 / ((param1 + 42) / 53);
        if (this.renderer != null) {
          this.renderer.paintWidget(true, param2, (byte) -63, param3, (UiWidget) (this));
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.dialogs);
        UiWidget var7 = (UiWidget) (var5.first(0));
        while (var7 != null) {
          var7.renderWidget(param0, (byte) 28, this.widgetX + param2, this.widgetY + param3);
          var7 = (UiWidget) (var5.next((byte) -71));
        }
    }

    final static boolean isFriendName(String name, int obfuscationGuard) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -1) {
            DialogLayer.hideQuickChatOverlay(82);
          }
          stackIn_5_0 = (UsernameSuggestionSupport.findSocialEntryByName(obfuscationGuard ^ 88, name) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("lq.T(");
          if (name == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final UiWidget findFocusTarget(int param0) {
        int var4 = Pool.field_O;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.dialogs);
        FadingDialog var3 = (FadingDialog) (var2.last((byte) -92));
        while (var3 != null) {
          if (var3.dialogOpen) {
            return var3.findFocusTarget((byte) 127);
          }
          var3 = (FadingDialog) (var2.previous(-84));
        }
        if (param0 == -1) {
          return null;
        }
        DialogLayer.hideQuickChatOverlay(65);
        return null;
    }

    final void settleDialogAnimations(int param0) {
        int var4 = Pool.field_O;
        if (param0 != 11741) {
          return;
        }
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.dialogs);
        FadingDialog var3 = (FadingDialog) (var2.last((byte) -92));
        while (var3 != null) {
          if (var3.settleDialogAnimation(false)) {
            var3.unlink((byte) -117);
          }
          var3 = (FadingDialog) (var2.previous(-86));
        }
    }

    final void advanceDialogAnimations(byte param0) {
        if (param0 <= 121) {
          return;
        }
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.dialogs);
        FadingDialog var3 = (FadingDialog) (var2.last((byte) -92));
        while (var3 != null) {
          if (var3.advanceDialogAnimation((byte) -20)) {
            var3.unlink((byte) -117);
          }
          var3 = (FadingDialog) (var2.previous(-112));
        }
        this.child = (UiWidget) ((Object) this.getTopOpenDialog(110));
    }

    final static void closeInputOverlays(boolean obfuscationGuard) {
        ProgressDialog.closePlayerContextMenu(8421504);
        TranslatedUiText.hideSocialNamePopup(-31384);
        AccountMenuText.field_b = null;
        if (!obfuscationGuard) {
          DialogLayer.hideQuickChatOverlay(114);
        }
        DialogLayer.hideQuickChatOverlay(15975);
    }

    public static void releaseStatics(byte param0) {
        connectionlostWithreason = null;
        playerListLast = null;
        field_T = null;
        multiconstFriends = null;
        timerMinutesSeconds = null;
        if (param0 != -47) {
          return;
        }
        field_R = null;
        field_Q = null;
    }

    final static void hideQuickChatOverlay(int obfuscationGuard) {
        ArrayWidgetGroup.field_H = false;
        if (obfuscationGuard != 15975) {
          connectionlostWithreason = (String) null;
        }
        if (null != LobbyPlayer.field_Ub) {
          LobbyPlayer.field_Ub.resetSelection(17517);
        }
        if (0 != CookieDateSupport.field_b) {
          ProjectedLineSupport.resetChatComposition(obfuscationGuard ^ 1124);
        }
        ProgressBarWidget.field_G = 0;
    }

    final FadingDialog getTopOpenDialog(int param0) {
        IntrusiveDequeCursor var2;
        FadingDialog var3;
        if (param0 < 101) {
          timerMinutesSeconds = (String) null;
        }
        var2 = new IntrusiveDequeCursor(this.dialogs);
        var3 = (FadingDialog) (var2.last((byte) -92));
        while (var3 != null) {
          if (var3.dialogOpen) {
            return var3;
          }
          var3 = (FadingDialog) (var2.previous(-128));
        }
        return null;
    }

    final static void clearSocialLists(int obfuscationGuard) {
        DualLinkNode var2 = null;
        int var3 = Pool.field_O;
        DualLinkNode var2Lifetime1;
        try {
          TextHotspotRegion.field_t = 0;
          int var1_int = 83 % ((17 - obfuscationGuard) / 34);
          LocalGameSetupScreen.field_J = null;
          AccountWelcomePanel.field_S = 0;
          SoundCache.field_k.clear((byte) 69);
          QuickChatNavigationSupport.field_c.clear((byte) 48);
          var2 = AimTarget.field_b.firstForIteration((byte) -125);
          while (var2 != null) {
            var2.unlinkNode(false);
            var2 = AimTarget.field_b.nextForIteration(83);
          }
          var2Lifetime1 = LoginTextSupport.field_c.firstForIteration((byte) -125);
          while (var2Lifetime1 != null) {
            var2Lifetime1.unlinkNode(false);
            var2Lifetime1 = LoginTextSupport.field_c.nextForIteration(68);
          }
          ChatInputSupport.field_a = 0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "lq.GA(" + obfuscationGuard + ')');
        }
    }

    final void showDialog(UiWidget param0, int param1) {
        FadingDialog var3 = null;
        try {
          if (!(param0 instanceof FadingDialog)) {
            throw new IllegalArgumentException();
          }
          var3 = (FadingDialog) (param0);
          if (param1 != 30000) {
            field_W = 61;
          }
          this.dialogs.addLast((byte) -84, var3);
          var3.dialogOpen = true;
          var3.requestKeyboardFocus((UiWidget) (this), (byte) 66);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "lq.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_T = new int[1024];
        multiconstFriends = "Friends";
        connectionlostWithreason = "Connection lost. <%0>";
        timerMinutesSeconds = "mm:ss";
        field_W = 0;
        playerListLast = " and <%0>";
    }
}
