/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchTextInputOverlay implements OverlayLayer {
    private int field_i;
    static String field_d;
    static ResourceArchive field_j;
    static String field_n;
    static QuickChatCommandType field_o;
    static int field_f;
    static int field_c;
    static int field_a;
    static int field_h;
    static String field_e;
    static String field_l;
    static String field_b;
    static int field_k;
    static String field_g;
    static String field_p;
    static String field_m;

    final static void setRenderDetail(int param0, int param1) {
        int var5 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        AnimationClip var6 = null;
        AnimationClip var7 = null;
        int var8 = 0;
        int var11 = 0;
        AnimationPlayer var12 = null;
        int var4Lifetime1;
        int var8Lifetime1;
        var11 = Kickabout.field_G;
        try {
          if (param1 == FormationAgent.field_l) {
            return;
          }
          ClientInteractionSupport.field_a = false;
          FormationAgent.field_l = param1;
          var12 = new AnimationPlayer();
          Runtime.getRuntime().freeMemory();
          if (FormationAgent.field_l != 0 &&
            FormationAgent.field_l != 1) {
            BuyPitchDialog.field_K = new byte[5][][][];
            PitchPurchaseSupport.field_b = new byte[5][][];
            var3 = 5;
            for (var4 = 0; var4 < 5; var4++) {
              var3 = var3 + HelpTipDialog.field_I[var4][5].field_e.length / 3;
            }
            var4Lifetime1 = 0;
            if (param0 != -4121) {
              MatchTextInputOverlay.clearSharedMouseHandler(9);
            }
            for (var5 = 0; var5 < 5; var5++) {
              var6 = HelpTipDialog.field_I[var5][5];
              var7 = HelpTipDialog.field_I[var5][3];
              var12.setClip(var7, (byte) -107);
              PitchPurchaseSupport.field_b[var5] = new byte[8][];
              for (var8 = 0; var8 < 8; var8++) {
                CanvasResizePolicy.renderAnimatedModelPreview(var5, var12, var8 << 8, false, 2150);
                PitchPurchaseSupport.field_b[var5][var8] = MatchingTextValidator.encodeSpriteMask(16, BuyPitchDialog.field_F);
              }
              var12.setClip(var6, (byte) -107);
              var8Lifetime1 = (2 + var6.field_e.length) / 3;
              BuyPitchDialog.field_K[var5] = new byte[var8Lifetime1][8][];
              for (var9 = 0; var9 < var8Lifetime1; var9++) {
                var12.setFrame(var9 * 3, -39);
                for (var10 = 0; var10 < 8; var10++) {
                  CanvasResizePolicy.renderAnimatedModelPreview(var5, var12, var10 << 8, false, 2150);
                  BuyPitchDialog.field_K[var5][var9][var10] = MatchingTextValidator.encodeSpriteMask(16, BuyPitchDialog.field_F);
                }
                var4Lifetime1++;
                DelayedServerPacket.updateLoadingProgress(var3, param0 + 13984, var4Lifetime1);
              }
            }
            ClientInteractionSupport.field_a = true;
            return;
          }
          ClientInteractionSupport.field_a = true;
          BuyPitchDialog.field_K = (byte[][][][]) null;
          PitchPurchaseSupport.field_b = (byte[][][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "vp.A(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean isMatchInputActive(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 8) {
          return false;
        }
        boolean decompiledFrameRemainder0 = true;
        if (PlayerValueSortCriterion.field_n && (MainMenuScreen.isScreenShown(-1, param0 - 9) ||
          MainMenuScreen.isScreenShown(-2, param0 - 9))) {
          stackIn_8_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_8_0 = false;
        }
        return stackIn_8_0;
    }

    final static int hitTestPairedControls(int param0, int param1, byte param2) {
        if (null == TrinketCatalog.field_c) {
          return -1;
        }
        if (param1 >= IntDoubleCommand.field_D &&
          IntDoubleCommand.field_D + TrinketCatalog.field_c.field_q > param1 &&
          PasswordFieldPainter.field_w <= param0 &&
          param0 < PasswordFieldPainter.field_w + TrinketCatalog.field_c.field_w) {
          return 0;
        }
        if (WelcomeDialog.field_G <= param1 &&
          WelcomeDialog.field_G + TrinketCatalog.field_c.field_q > param1 &&
          param0 >= FormationView.field_q &&
          param0 < TrinketCatalog.field_c.field_w + FormationView.field_q) {
          return 1;
        }
        if (param2 < 0) {
          field_b = (String) null;
        }
        return -1;
    }

    MatchTextInputOverlay() {
        this.field_i = 0;
    }

    final static void clearSharedMouseHandler(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (null != ProxyAuthenticationRequiredException.field_e) {
          var1 = ProxyAuthenticationRequiredException.field_e;
          synchronized (var1) {
            ProxyAuthenticationRequiredException.field_e = null;
          }
        }
        if (param0 > -103) {
          field_b = (String) null;
        }
    }

    public final void update(int param0, boolean param1) {
        String var4;
        MeshPreviewSupport.b(0);
        var4 = (String) null;
        ReceivedAuctionItem.setChatChannelLabel((String) null, -1);
        if (param0 != -25) {
          field_a = -18;
        }
        if (this.isMatchInputActive(8)) {
          if (SortCriterion.field_l == null) {
            if (MachineTokenStorageSupport.field_e != null &&
              MachineTokenStorageSupport.field_e.isTournamentMatch && (!MachineTokenStorageSupport.field_e.isSpectator(param0 ^ 25) ||
              MachineTokenStorageSupport.field_e.usesTournamentSpectatorControls(-21660))) {
              NetworkArchiveRequest.h(param0 ^ 15419);
              ReceivedAuctionItem.setChatChannelLabel(AccountRegistrationResponse.field_h, param0 ^ 24);
              AuctionTableWidget.a(6356832, (byte) -25);
            }
          } else {
            NetworkArchiveRequest.h(-15396);
            ReceivedAuctionItem.setChatChannelLabel(SessionUrlSupport.field_g, -1);
            AuctionTableWidget.a(6356832, (byte) -25);
          }
          this.field_i = this.field_i + 1;
          TextInputUiSupport.updateTextInput(true, 300, 320, param1);
        }
    }

    public final boolean capturesInput(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 <= 63) {
          MatchTextInputOverlay.releaseStatics((byte) 99);
        }
        stackIn_6_0 = (this.isMatchInputActive(8)) && (TextFieldNode.field_Wb);
        return stackIn_6_0;
    }

    public final boolean handleKeyTyped(int param0, int param1, char param2) {
        boolean stackIn_6_0 = false;
        if (param0 != 11516) {
          return true;
        }
        stackIn_6_0 = (this.isMatchInputActive(param0 ^ 11508)) && (MatchTransitionScreen.a(13, 12, 17860, 15));
        return stackIn_6_0;
    }

    public final void paint(int param0) {
        int var2 = 83 % ((50 - param0) / 45);
        if (this.capturesInput((byte) 87)) {
          RotaryDialPainter.drawContentTransitionAndTooltip((this.field_i & 8) == 0 ? true : false, false);
        }
    }

    public static void releaseStatics(byte param0) {
        field_m = null;
        if (param0 < 77) {
          field_a = 64;
        }
        field_l = null;
        field_e = null;
        field_b = null;
        field_n = null;
        field_p = null;
        field_d = null;
        field_o = null;
        field_g = null;
        field_j = null;
    }

    static {
        field_n = "Play rated game";
        field_d = "tournament lobby";
        field_o = new QuickChatCommandType(8, 0, 4, 1);
        GameKeyHandler.configureCarouselTiming(50, (byte) -110);
        field_l = "Loading animations";
        field_g = "Public chat is unavailable while setting up a rated game.";
        field_b = "Quick Chat Help";
        field_m = "Report <%0> for abuse";
    }
}
