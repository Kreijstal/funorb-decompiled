/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedValidator implements TextValidator {
    static String field_e;
    static String textRemovedFromGame;
    static int field_c;
    private long field_b;
    static String field_a;
    static String field_d;

    final static boolean hasInputFocus(byte param0) {
        if (param0 >= -103) {
          textRemovedFromGame = (String) null;
          return FullscreenState.field_b == null ? NameEntryPopup.field_Gb : true;
        }
        return FullscreenState.field_b == null ? NameEntryPopup.field_Gb : true;
    }

    public final String getValidationMessage(int param0) {
        if (this.isEmpty(true)) {
          return null;
        }
        if (ClockAndTextHelpers.monotonicMillis(-9986) < (this.field_b + 350L)) {
          return null;
        }
        if (param0 == 28433) {
          return this.computeMessage(-103);
        }
        field_e = (String) null;
        return this.computeMessage(-103);
    }

    final static void openLoginDialog(String param0, boolean param1, boolean param2, boolean param3) {
        try {
          PasswordLoginCredentials.resetLoginState((byte) -126);
          QueuedListRequest.field_l.hideAllLayers((byte) 76);
          QuickChatHelpHelpers.field_a = new LoginPanel(MouseTrailPoint.field_g, (String) null, ChatPanelSetupHelpers.field_c, param1, param2);
          UiWidget.field_t = new LoginDialog(QueuedListRequest.field_l, QuickChatHelpHelpers.field_a);
          QueuedListRequest.field_l.pushLayer(0, UiWidget.field_t);
          if (!param3) {
            field_c = 59;
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "mi.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void drawLobbyAndChatPanels(boolean param0, int param1) {
        if (DelegatingCanvas.hasBlockingInputPopup(-110)) {
          param0 = false;
        }
        if (param1 != -8241) {
          DebouncedValidator.releaseStatics(-16);
          PendingHighscoreRequest.drawLobbyScreen(-1781, param0);
          if (IconLabelWidget.field_Fb) {
            Rasterizer.darkenRectangle(LobbyGame.field_pc.field_c.field_tb, LobbyGame.field_pc.field_c.field_F, LobbyGame.field_pc.field_c.field_K, LobbyGame.field_pc.field_c.field_ub);
            LobbyGame.field_pc.field_c.drawRoot(param0, 24960);
            QueuedRequest.drawLobbyScreen(param1 ^ 8271, param0);
            return;
          }
          QueuedRequest.drawLobbyScreen(param1 ^ 8271, param0);
          return;
        }
        PendingHighscoreRequest.drawLobbyScreen(-1781, param0);
        if (!IconLabelWidget.field_Fb) {
          QueuedRequest.drawLobbyScreen(param1 ^ 8271, param0);
          return;
        }
        Rasterizer.darkenRectangle(LobbyGame.field_pc.field_c.field_tb, LobbyGame.field_pc.field_c.field_F, LobbyGame.field_pc.field_c.field_K, LobbyGame.field_pc.field_c.field_ub);
        LobbyGame.field_pc.field_c.drawRoot(param0, 24960);
        QueuedRequest.drawLobbyScreen(param1 ^ 8271, param0);
    }

    final static void closeAccountDialogs(int param0) {
        if (null != QueuedListRequest.field_l) {
          QueuedListRequest.field_l.closeDismissedLayers(-115);
        }
        if (null != IntKeyLookup.field_i) {
          IntKeyLookup.field_i.stopProgressAnimation(18);
        }
        int var1 = 7 / ((param0 + 74) / 41);
        MusicPatchEnvelope.resetTooltipState(-44);
    }

    public static void releaseStatics(int param0) {
        textRemovedFromGame = null;
        if (param0 != 12) {
          return;
        }
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final static void resendPendingRequests(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        QueuedRequest var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          var4 = (QueuedRequest) (PasswordLoginCredentials.field_h.first((byte) -58));
          while (var4 != null) {
            CachedArchiveSource.sendListRequest(param0, var4, 97);
            var4 = (QueuedRequest) (PasswordLoginCredentials.field_h.next(16213));
          }
          if (param1 == 12) {
            return;
          }
          field_e = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2), "mi.W(" + param0 + ',' + param1 + ')');
        }
    }

    public final void restartDebounce(boolean param0) {
        if (param0) {
          DebouncedValidator.drawLobbyAndChatPanels(true, 21);
          this.field_b = ClockAndTextHelpers.monotonicMillis(-9986);
          return;
        }
        this.field_b = ClockAndTextHelpers.monotonicMillis(-9986);
    }

    public final AudioSetupHelpers getValidationState(int param0) {
        if (this.isEmpty(true)) {
          return TriangleMesh.field_v;
        }
        if (!(ClockAndTextHelpers.monotonicMillis(param0 + 12257) >= 350L + this.field_b)) {
          return ImageProducerRasterBuffer.field_r;
        }
        if (param0 == -22243) {
          return this.computeState(-843083384);
        }
        this.getValidationState(7);
        return this.computeState(-843083384);
    }

    abstract String computeMessage(int param0);

    final static boolean isValidDisplayName(int param0, boolean param1, CharSequence param2) {
        int var6 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          if (param2 == null) {
            return false;
          }
          if (param0 != 1203) {
            DebouncedValidator.resendPendingRequests(-52, -85);
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            12 >= var3_int) {
            var4 = DisplayNameHelpers.normalizeDisplayName(param2, true);
            if (var4 == null) {
              return false;
            }
            if (var4.length() < 1) {
              return false;
            }
            if (!AccountRequestReply.isNameSeparator(var4.charAt(0), -46) &&
              !AccountRequestReply.isNameSeparator(var4.charAt(-1 + var4.length()), param0 - 1249)) {
              var5 = 0;
              for (var6 = 0; param2.length() > var6; var6++) {
                var7 = param2.charAt(var6);
                if (AccountRequestReply.isNameSeparator((char) var7, -46)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (var5 >= 2 &&
                  !param1) {
                  return false;
                }
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("mi.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    abstract AudioSetupHelpers computeState(int param0);

    static {
        textRemovedFromGame = "Sorry, you were removed from the game you were playing. This happened either because you were disconnected for too long, or because the server was updated.";
        field_e = "Unpacking music";
        field_a = "Hide private chat and appear offline to friends";
    }
}
