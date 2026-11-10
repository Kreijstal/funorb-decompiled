/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerContextMenu {
    ContextMenu field_j;
    String field_f;
    static String field_a;
    private long field_i;
    private int field_h;
    int field_b;
    private String field_d;
    static UiComponent field_c;
    UiComponent field_e;
    private int[] field_g;
    static String field_k;

    final void drawMenu(boolean param0, byte param1) {
        if (param1 >= 38) {
          this.field_j.drawRoot(param0, -1);
          return;
        }
        this.field_f = (String) null;
        this.field_j.drawRoot(param0, -1);
    }

    public static void releaseStatics(int param0) {
        if (param0 != -2) {
          return;
        }
        field_k = null;
        field_a = null;
        field_c = null;
    }

    private final boolean handleSecondaryAction(byte param0, int param1, int param2) {
        int var5;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 98) {
          this.addReportAbuseAction(123);
        }
        if (param1 == 8) {
          HumanView.openPrivateChatTo(this.field_i, this.field_f, -1);
          return true;
        }
        if (param1 == 18) {
          ScoreUpdateEvent.openPrivateChatTo(-16745, this.field_i, this.field_f);
          return true;
        }
        if (11 == param1) {
          MessageMenuScreen.setChatFilter(this.field_h, param2, 0, true);
          return true;
        }
        if (param1 == 12) {
          MessageMenuScreen.setChatFilter(this.field_h, param2, 1, true);
          return true;
        }
        if (param1 == 13) {
          MessageMenuScreen.setChatFilter(this.field_h, param2, 2, true);
          return true;
        }
        if (param1 == 14) {
          ZombieDropView.selectPublicChat(false);
          return true;
        }
        if (param1 == 20) {
          SineTableHelpers.openPublicQuickChat(13151);
          return true;
        }
        if (param1 != 19) {
          return false;
        }
        AlphaChildWidget.beginPrivateQuickChat(this.field_g, (byte) -50, this.field_f, this.field_i, this.field_h);
        return true;
    }

    final void addGameSetupMenuItems(boolean param0, byte param1) {
        LobbyPlayer var4;
        String var5;
        int var6;
        LobbyPlayer var7;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null == this.field_f) {
          if (param1 < -80) {
            return;
          }
          this.addReportAbuseAction(-88);
          return;
        }
        if (this.field_i == ContentTransitionDialog.field_sb) {
          if (param1 < -80) {
            return;
          }
          this.addReportAbuseAction(-88);
          return;
        }
        if (JaggrabDownloader.field_c == null) {
          if (param1 < -80) {
            return;
          }
          this.addReportAbuseAction(-88);
          return;
        }
        if (!LobbyStateHelpers.isLocalPlayerGameHost(0)) {
          if (param1 < -80) {
            return;
          }
          this.addReportAbuseAction(-88);
          return;
        }
        var7 = ChatPanelSetupHelpers.findLobbyPlayer((byte) 50, this.field_i);
        var4 = FullscreenErrorDialog.findLobbyPlayer(this.field_i, (byte) -104);
        var5 = this.getTargetName(-20516);
        if (var4 != null) {
          if (!JaggrabDownloader.field_c.field_Fb) {
            this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(MiasmaParticle.field_I, new String[]{var5}, 2), 1);
          } else {
            if (JaggrabDownloader.field_c.field_Sb >= 0) {
              this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(MiasmaParticle.field_I, new String[]{var5}, 2), 1);
            }
          }
        } else {
          if (var7 != null &&
            JaggrabDownloader.field_c.field_Wb &&
            JaggrabDownloader.field_c.field_cc < JaggrabDownloader.field_c.field_mc) {
            if (var7.field_Pb) {
              this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(ClockAndScreenHelpers.field_f, new String[]{var5}, 2), 1);
            } else {
              if (!param0) {
                this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(SimZombie.field_qb, new String[]{var5}, 2), 0);
              } else {
                if (!var7.field_Ob) {
                  this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(SimZombie.field_qb, new String[]{var5}, 2), 0);
                } else {
                  this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(AchievementsScreen.field_p, new String[]{var5}, 2), 0);
                  this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(MusicPatchLoadHelpers.field_g, new String[]{var5}, 2), 1);
                }
              }
            }
          }
        }
        if (param1 < -80) {
          return;
        }
        this.addReportAbuseAction(-88);
        return;
    }

    private final boolean handlePrimaryAction(int param0, int param1, int param2) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 != 19) {
          return false;
        }
        if (param2 == 0) {
          UnitStateEvent.sendPlayerIdCommand(-21148, this.field_i, param0);
          return true;
        }
        if (param2 == 1) {
          MeltdownPuddleView.requestRemoveOrRejectPlayer(param0, -27404, this.field_i);
          return true;
        }
        if (2 == param2) {
          ArrayWidgetGroup.sendShortSettingRequest(param0, (byte) 111, this.field_b);
          return true;
        }
        if (param2 == 3) {
          SocialListRow.sendPlayerActionRequest(this.field_b, param0, -76);
          return true;
        }
        if (10 == param2) {
          CacheEntry.requestSpectateGame(param1 - 6, this.field_b, param0);
          return true;
        }
        if (param2 == 15) {
          FightEvent.requestGamePreview(this.field_b, param0, -105);
          return true;
        }
        if (param2 != 16) {
          return false;
        }
        FightEvent.requestGamePreview(0, param0, param1 - 107);
        return true;
    }

    final void addLobbyGameActions(byte param0) {
        String var3;
        int var4;
        LobbyGame var5;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (JaggrabDownloader.field_c != null) {
          if (param0 <= -8) {
            return;
          }
          this.field_i = -51L;
          return;
        }
        var5 = ValidatedTextInputWidget.findLobbyGame(false, this.field_b);
        if (var5 == null) {
          if (param0 <= -8) {
            return;
          }
          this.field_i = -51L;
          return;
        }
        var3 = var5.field_Nb;
        if (var5.field_lc) {
          this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(FontPaletteHelpers.field_d, new String[]{var3}, 2), 2);
          this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(ArchiveLoadStep.field_e, new String[]{var3}, 2), 3);
        } else {
          if (var5.field_Ob) {
            this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(FeatureSupportHelpers.field_c, new String[]{var3}, 2), 2);
          } else {
            if (!var5.field_rc &&
              var5.field_Wb) {
              if (!var5.field_Fb) {
                this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(RandomHelpers.field_o, new String[]{var3}, 2), 2);
              } else {
                if (var5.field_Ob) {
                  this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(RandomHelpers.field_o, new String[]{var3}, 2), 2);
                }
              }
            }
          }
          if (var5.field_rc) {
            this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(IdleTickHelpers.field_e, new String[]{var3}, 2), 3);
          }
        }
        if (param0 <= -8) {
          return;
        }
        this.field_i = -51L;
        return;
    }

    final boolean isMenuOpen(boolean param0) {
        String discarded$2 = null;
        if (param0) {
          discarded$2 = this.getTargetName(95);
          if (this.field_j == null) {
            return false;
          }
          if (this.field_j.isWaitingForAction((byte) 90)) {
            return true;
          }
          return false;
        }
        if (this.field_j == null) {
          return false;
        }
        if (this.field_j.isWaitingForAction((byte) 90)) {
          return true;
        }
        return false;
    }

    final boolean handleMenuSelection(int param0, int param1, byte param2, boolean param3, int param4) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        int var6 = this.field_j.updateAndPollAction(param3, param2 ^ 1839469049);
        if (-2 == var6) {
          return false;
        }
        if (param2 == -8) {
          discarded$0 = this.handlePrimaryAction(param0, 19, var6);
          discarded$1 = this.handleSocialAction(param4, var6, (byte) 57);
          discarded$2 = this.handleSecondaryAction((byte) 98, var6, param4);
          discarded$3 = this.openReportAbuse(17, var6, param1);
          return true;
        }
        this.field_b = -116;
        boolean discarded$4 = this.handlePrimaryAction(param0, 19, var6);
        boolean discarded$5 = this.handleSocialAction(param4, var6, (byte) 57);
        boolean discarded$6 = this.handleSecondaryAction((byte) 98, var6, param4);
        boolean discarded$7 = this.openReportAbuse(17, var6, param1);
        return true;
    }

    final void addChatFilterActions(ChatMessage param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_k) {
            return;
          }
          if (param1 != 2) {
            this.field_g = (int[]) null;
          }
          this.field_h = param0.field_l;
          if (param0.field_l == 0) {
            if (0 == DiskArchiveRequest.field_C) {
              this.field_j.addItem((byte) -118, DetonationTarget.field_k, 12);
            }
            this.field_j.addItem((byte) -118, MiasmaPuff.field_g, 13);
          }
          if (param0.field_l == 1) {
            if (0 == GameHud.field_g) {
              this.field_j.addItem((byte) -118, DialWidgetPainter.field_n, 12);
            }
            this.field_j.addItem((byte) -118, UpgradeAccessHelpers.field_c, 13);
          }
          if (param0.field_l != 2) {
            return;
          }
          if (0 == MusicPatchPcmStream.field_q) {
            this.field_j.addItem((byte) -118, EffectResistedEvent.field_i, 12);
          }
          this.field_j.addItem((byte) -118, ArchiveLoadStep.field_n, 13);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("jb.H(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean handleSocialAction(int param0, int param1, byte param2) {
        Object var4;
        int var5;
        String var6;
        String var7;
        String var8;
        String var9;
        String var10;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        String var6Lifetime1;
        String var6Lifetime2;
        String var6Lifetime3;
        var4 = null;
        if (param1 == 4) {
          var7 = TickClock.requestAddFriend(this.field_f, (byte) 116, param0);
          if (var7 != null) {
            var6 = (String) null;
            FullscreenErrorDialog.addChatMessage(this.field_f, 0, (String) null, var7, 2, 0);
          }
          var5 = -84 % ((-56 - param2) / 51);
          return true;
        }
        if (5 == param1) {
          var8 = ButtonWidget.requestRemoveFriend(this.field_f, 113, param0);
          if (var8 != null) {
            var6Lifetime1 = (String) null;
            FullscreenErrorDialog.addChatMessage(this.field_f, 0, (String) null, var8, 2, 0);
          }
          var5Lifetime1 = -84 % ((-56 - param2) / 51);
          return true;
        }
        if (param1 == 6) {
          var9 = SocialRequestHelpers.requestAddIgnoredPlayer(-107, param0, this.field_f);
          if (var9 != null) {
            var6Lifetime2 = (String) null;
            FullscreenErrorDialog.addChatMessage(this.field_f, 0, (String) null, var9, 2, 0);
          }
          var5Lifetime2 = -84 % ((-56 - param2) / 51);
          return true;
        }
        if (7 != param1) {
          return false;
        }
        var10 = ArchiveProvider.removeIgnoredName(this.field_f, this.field_d, -69, param0);
        if (var10 != null) {
          var6Lifetime3 = (String) null;
          FullscreenErrorDialog.addChatMessage(this.field_f, 0, (String) null, var10, 2, 0);
        }
        var5Lifetime3 = -84 % ((-56 - param2) / 51);
        return true;
    }

    private final boolean openReportAbuse(int param0, int param1, int param2) {
        if (param0 != param1) {
          return false;
        }
        DirectByteStorage.field_i = new ReportAbuseDialog(this.field_e.field_w, this.field_e.field_qb, this.field_e.field_zb, this.field_e.field_z, param2, MarkerSliderPainter.field_a, ScreenSizeGlobals.field_c, ReportDialogGlobals.field_a, IntroScreen.field_m, UpgradeAccessHelpers.field_h, LobbyRequestHelpers.field_b, this.field_f, this.field_i);
        return true;
    }

    private final String getTargetName(int param0) {
        String var2 = null;
        String var2Lifetime1;
        if (param0 == -20516) {
          if (null != this.field_d) {
            var2 = this.field_d;
          } else {
            var2 = this.field_f;
          }
          return var2;
        }
        field_k = (String) null;
        if (null != this.field_d) {
          var2Lifetime1 = this.field_d;
        } else {
          var2Lifetime1 = this.field_f;
        }
        return var2Lifetime1;
    }

    final void addReportAbuseAction(int param0) {
        String var3 = null;
        String var2 = null;
        String var2Lifetime1;
        if (param0 < -45) {
          if (null != this.field_f &&
            ~ContentTransitionDialog.field_sb != ~this.field_i) {
            var3 = this.getTargetName(-20516);
            var2 = var3;
            this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(StateIconLabel.field_Jb, new String[]{var3}, 2), 17);
          }
          return;
        }
        field_c = (UiComponent) null;
        if (null != this.field_f &&
          ~ContentTransitionDialog.field_sb != ~this.field_i) {
          var3 = this.getTargetName(-20516);
          var2Lifetime1 = var3;
          this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(StateIconLabel.field_Jb, new String[]{var3}, 2), 17);
        }
    }

    final void buildPlayerMenu(int param0, int[] param1, byte param2) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        SocialListRow var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          if (this.field_f != null && (ContentTransitionDialog.field_sb != this.field_i ||
            2 == param0) && SimZombie.field_zb == 2) {
            var7 = this.getTargetName(-20516);
            var4 = var7;
            var5 = PackedArrayHelpers.findListEntryByName(this.field_f, false);
            var6 = RandomHelpers.isIgnored(this.field_f, param2 ^ 1009) ? 1 : 0;
            if (var5 == null &&
              var6 == 0) {
              this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(IntrusiveDeque.field_e, new String[]{var7}, param2 - 11), 4);
              this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(IndexedSpriteState.field_g, new String[]{var7}, 2), 6);
              if (param1 != null &&
                param0 != 2 &&
                !PendingRankingRequest.field_m) {
                this.field_g = param1;
                this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(TertiaryLinkNode.field_u, new String[]{var7}, 2), 19);
              }
            }
            if (var5 != null) {
              if (!QuitPageHelpers.isPrivateChatTarget(this.field_f, -118) &&
                !PendingRankingRequest.field_m) {
                if (!SimPortal.field_L) {
                  this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(UpgradeAccessHelpers.field_i, new String[]{var7}, 2), 8);
                }
                this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(TextLayout.field_c, new String[]{var7}, 2), 18);
                if (param1 != null) {
                  this.field_g = param1;
                  this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(TertiaryLinkNode.field_u, new String[]{var7}, 2), 19);
                }
              }
              this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(ZombieDetonation.field_j, new String[]{var7}, 2), 5);
            }
            if (var6 != 0) {
              this.field_j.addItem((byte) -118, QueuedListRequest.substituteTemplateArguments(PlayingSound.field_l, new String[]{var7}, 2), 7);
            }
          }
          if (param2 == 13) {
            return;
          }
          field_a = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_31_0 = var4_ref;
          stackIn_31_1 = new StringBuilder().append("jb.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    PlayerContextMenu(UiComponent param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
          this.field_j = new ContextMenu(RasterStackHelpers.field_d);
          this.field_f = param2;
          this.field_d = param3;
          this.field_g = param6;
          this.field_h = param5;
          this.field_b = param4;
          this.field_i = param1;
          this.field_e = param0;
          param0.field_Ab = true;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "jb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Playing";
        field_k = "Passwords must be between 5 and 20 characters long";
    }
}
