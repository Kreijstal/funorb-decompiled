/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientContextMenu {
    static String field_c;
    static String field_n;
    static String field_g;
    private long field_l;
    SceneWidget field_o;
    ContextActionMenu field_b;
    String field_h;
    private String field_i;
    int field_m;
    static PcmStreamMixer field_d;
    static IntrusiveDeque field_a;
    static String field_e;
    private int field_k;
    private int[] field_j;
    static int[] field_f;

    public static void releaseStatics(byte param0) {
        if (param0 > 52) {
          field_e = null;
          field_f = null;
          field_n = null;
          field_a = null;
          field_c = null;
          field_g = null;
          field_d = null;
          return;
        }
    }

    private final String getTargetDisplayName(byte param0) {
        String var2 = null;
        if (this.field_i != null) {
          var2 = this.field_i;
        } else {
          var2 = this.field_h;
        }
        if (param0 <= 7) {
          return (String) null;
        }
        return var2;
    }

    final void addPlayerSocialActions(int param0, int[] param1, int param2) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        SocialListEntry var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          if (param2 != -3) {
            return;
          }
          if (this.field_h != null) {
            if (DebouncedValidator.field_f == this.field_l &&
              2 != param0) {
              return;
            }
            if (2 != ValidatedTextWidget.field_db) {
              return;
            }
            var7 = this.getTargetDisplayName((byte) 114);
            var4 = var7;
            var5 = LoadingStepTracker.findFriend(this.field_h, -1);
            var6 = ImageProducerRasterBuffer.isFriend(-640, this.field_h) ? 1 : 0;
            if (var5 == null &&
              var6 == 0) {
              this.field_b.addAction(AlphaContainer.formatTemplate(ji.field_d, 52, new String[]{var7}), (byte) -106, 4);
              this.field_b.addAction(AlphaContainer.formatTemplate(ff.field_e, 18, new String[]{var7}), (byte) -53, 6);
              if (param1 != null &&
                param0 != 2 &&
                !SoundVoice.field_q) {
                this.field_j = param1;
                this.field_b.addAction(AlphaContainer.formatTemplate(NodeHashTable.field_d, 61, new String[]{var7}), (byte) -80, 19);
              }
            }
            if (var5 != null) {
              if (!TimerBar.isPrivateChatTarget(57, this.field_h) &&
                !SoundVoice.field_q) {
                if (!IsaacRandom.field_g) {
                  this.field_b.addAction(AlphaContainer.formatTemplate(nf.field_e, 105, new String[]{var7}), (byte) -119, 8);
                }
                this.field_b.addAction(AlphaContainer.formatTemplate(TextTableInitializer.field_f, 83, new String[]{var7}), (byte) -33, 18);
                if (param1 != null) {
                  this.field_j = param1;
                  this.field_b.addAction(AlphaContainer.formatTemplate(NodeHashTable.field_d, 22, new String[]{var7}), (byte) -95, 19);
                }
              }
              this.field_b.addAction(AlphaContainer.formatTemplate(ni.field_p, 18, new String[]{var7}), (byte) -33, 5);
            }
            if (var6 != 0) {
              this.field_b.addAction(AlphaContainer.formatTemplate(DelegatingCanvas.field_a, param2 + 72, new String[]{var7}), (byte) -77, 7);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_28_0 = var4_ref;
          stackIn_28_1 = new StringBuilder().append("wi.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void refreshOpenLegacyMenu(byte param0) {
        if (!hf.b((byte) 100)) {
          return;
        }
        bq.buildLegacyMenu(false, (byte) -110, 4);
        if (param0 != -53) {
          field_d = (PcmStreamMixer) null;
        }
    }

    private final boolean handleGameMembershipAction(int param0, int param1, int param2) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        int var5;
        var5 = Pixelate.field_H ? 1 : 0;
        if (param0 == 0) {
          StatusBar.sendNameRequest(this.field_l, param1, param2 ^ -31541);
          if (param2 == 7490) {
            return true;
          }
          discarded$0 = this.handleReportAbuseAction(67, true, 49);
          return true;
        }
        if (param0 == 1) {
          pe.sendPlayerAction(7, param1, this.field_l);
          if (param2 == 7490) {
            return true;
          }
          discarded$1 = this.handleReportAbuseAction(67, true, 49);
          return true;
        }
        if (param0 == 2) {
          ClientContextMenu.sendLobbyGameRequest(param1, param2 ^ -7903, this.field_m);
          if (param2 == 7490) {
            return true;
          }
          discarded$2 = this.handleReportAbuseAction(67, true, 49);
          return true;
        }
        if (param0 == 3) {
          qg.a(this.field_m, param1, false);
          if (param2 == 7490) {
            return true;
          }
          discarded$3 = this.handleReportAbuseAction(67, true, 49);
          return true;
        }
        if (param0 == 10) {
          qj.sendGameJoinRequest(false, this.field_m, param1);
          if (param2 == 7490) {
            return true;
          }
          discarded$4 = this.handleReportAbuseAction(67, true, 49);
          return true;
        }
        if (param0 == 15) {
          StatsRequest.a(param2 ^ 7489, this.field_m, param1);
          if (param2 == 7490) {
            return true;
          }
          discarded$5 = this.handleReportAbuseAction(67, true, 49);
          return true;
        }
        if (param0 != 16) {
          return false;
        }
        StatsRequest.a(3, 0, param1);
        if (param2 == 7490) {
          return true;
        }
        discarded$6 = this.handleReportAbuseAction(67, true, 49);
        return true;
    }

    final void setMenuFlag(boolean param0, byte param1) {
        if (param1 != 20) {
          field_n = (String) null;
          this.field_b.drawFullScreen(param0, 0);
          return;
        }
        this.field_b.drawFullScreen(param0, 0);
    }

    final void addGameMemberActions(boolean param0, byte param1) {
        boolean discarded$13 = false;
        boolean discarded$12 = false;
        boolean discarded$11 = false;
        boolean discarded$10 = false;
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        boolean discarded$9 = false;
        boolean discarded$8 = false;
        boolean discarded$7 = false;
        boolean discarded$3 = false;
        boolean discarded$4 = false;
        boolean discarded$6 = false;
        boolean discarded$5 = false;
        LobbyPlayer var4;
        String var5;
        int var6;
        LobbyPlayer var7;
        var6 = Pixelate.field_H ? 1 : 0;
        if (this.field_h == null) {
          if (param1 == -98) {
            return;
          }
          discarded$13 = this.handleGameMembershipAction(48, 58, -125);
          return;
        }
        if (this.field_l == DebouncedValidator.field_f) {
          if (param1 == -98) {
            return;
          }
          discarded$12 = this.handleGameMembershipAction(48, 58, -125);
          return;
        }
        if (null == LoginMethod.field_c) {
          if (param1 == -98) {
            return;
          }
          discarded$11 = this.handleGameMembershipAction(48, 58, -125);
          return;
        }
        if (!AccountRegistrationPanel.isLocalPlayerGameHost(param1 + 197)) {
          if (param1 == -98) {
            return;
          }
          discarded$10 = this.handleGameMembershipAction(48, 58, -125);
          return;
        }
        var7 = ScrollContainer.findLobbyPlayer(param1 + 100, this.field_l);
        var4 = JaggrabDownloader.findGamePlayer(this.field_l, param1 + 14526);
        var5 = this.getTargetDisplayName((byte) 27);
        if (var4 != null) {
          if (!LoginMethod.field_c.field_dc) {
            this.field_b.addAction(AlphaContainer.formatTemplate(vf.field_b, 123, new String[]{var5}), (byte) -112, 1);
            if (param1 == -98) {
              return;
            }
            discarded$0 = this.handleGameMembershipAction(48, 58, -125);
            return;
          }
          if (LoginMethod.field_c.field_nc < 0) {
            if (param1 == -98) {
              return;
            }
            discarded$1 = this.handleGameMembershipAction(48, 58, -125);
            return;
          }
          this.field_b.addAction(AlphaContainer.formatTemplate(vf.field_b, 123, new String[]{var5}), (byte) -112, 1);
          if (param1 == -98) {
            return;
          }
          discarded$2 = this.handleGameMembershipAction(48, 58, -125);
          return;
        }
        if (var7 == null) {
          if (param1 == -98) {
            return;
          }
          discarded$9 = this.handleGameMembershipAction(48, 58, -125);
          return;
        }
        if (!LoginMethod.field_c.field_Mb) {
          if (param1 == -98) {
            return;
          }
          discarded$8 = this.handleGameMembershipAction(48, 58, -125);
          return;
        }
        if (LoginMethod.field_c.field_mc >= LoginMethod.field_c.field_ec) {
          if (param1 == -98) {
            return;
          }
          discarded$7 = this.handleGameMembershipAction(48, 58, -125);
          return;
        }
        if (var7.field_Vb) {
          this.field_b.addAction(AlphaContainer.formatTemplate(ResourceArchive.field_j, param1 + 180, new String[]{var5}), (byte) -111, 1);
          if (param1 == -98) {
            return;
          }
          discarded$3 = this.handleGameMembershipAction(48, 58, -125);
          return;
        }
        if (!param0) {
          this.field_b.addAction(AlphaContainer.formatTemplate(ImageProducerRasterBuffer.field_m, 67, new String[]{var5}), (byte) -83, 0);
          if (param1 == -98) {
            return;
          }
          discarded$4 = this.handleGameMembershipAction(48, 58, -125);
          return;
        }
        if (!var7.field_Jb) {
          this.field_b.addAction(AlphaContainer.formatTemplate(ImageProducerRasterBuffer.field_m, 67, new String[]{var5}), (byte) -83, 0);
          if (param1 == -98) {
            return;
          }
          discarded$6 = this.handleGameMembershipAction(48, 58, -125);
          return;
        }
        this.field_b.addAction(AlphaContainer.formatTemplate(ValidationHelpWidget.field_V, 59, new String[]{var5}), (byte) -70, 0);
        this.field_b.addAction(AlphaContainer.formatTemplate(SoundCache.field_f, 101, new String[]{var5}), (byte) -41, 1);
        if (param1 == -98) {
          return;
        }
        discarded$5 = this.handleGameMembershipAction(48, 58, -125);
        return;
    }

    final static void sendLobbyGameRequest(int param0, int param1, int param2) {
        CipherPacketBuffer var3 = null;
        CipherPacketBuffer var3Lifetime1;
        if (param1 == -925) {
          var3 = ChatMessage.field_f;
          var3.writeOpcode(param0, 15514);
          var3.writeByte(160, 3);
          var3.writeByte(160, 8);
          var3.writeShort(1276387944, param2);
          return;
        }
        field_e = (String) null;
        var3Lifetime1 = ChatMessage.field_f;
        var3Lifetime1.writeOpcode(param0, 15514);
        var3Lifetime1.writeByte(160, 3);
        var3Lifetime1.writeByte(160, 8);
        var3Lifetime1.writeShort(1276387944, param2);
    }

    private final boolean handleSocialAction(int param0, byte param1, int param2) {
        Object var4;
        String var5;
        String var6;
        String var7;
        String var8;
        var4 = null;
        if (param2 == 4) {
          var5 = jf.requestAddFriend(this.field_h, param0, (byte) 79);
          if (var5 != null) {
            MidiPcmStream.appendChatMessage(0, (String) null, this.field_h, (byte) -50, 2, var5);
          }
          if (param1 >= -123) {
          }
          return true;
        }
        if (param2 == 5) {
          var6 = ff.requestRemoveFriend(param0, this.field_h, (byte) -106);
          if (var6 != null) {
            MidiPcmStream.appendChatMessage(0, (String) null, this.field_h, (byte) -50, 2, var6);
          }
          if (param1 >= -123) {
          }
          return true;
        }
        if (param2 == 6) {
          var7 = ScoreMarkerDemo.requestAddIgnore(85, this.field_h, param0);
          if (var7 != null) {
            MidiPcmStream.appendChatMessage(0, (String) null, this.field_h, (byte) -50, 2, var7);
          }
          if (param1 >= -123) {
          }
          return true;
        }
        if (7 != param2) {
          return false;
        }
        var8 = aq.requestRemoveIgnore(this.field_h, param0, this.field_i, -20867);
        if (var8 == null) {
          if (param1 < -123) {
          }
        } else {
          MidiPcmStream.appendChatMessage(0, (String) null, this.field_h, (byte) -50, 2, var8);
          if (param1 >= -123) {
          }
        }
        return true;
    }

    final boolean isMenuOpen(int param0) {
        if (param0 >= -94) {
          return true;
        }
        if (null == this.field_b) {
          return false;
        }
        if (this.field_b.isOpenHandlingEscape(-52)) {
          return true;
        }
        return false;
    }

    final void addChatFilterActions(byte param0, ChatMessage param1) {
        if (param0 <= 66) {
          this.field_l = 31L;
        }
        if (param1.field_a) {
          return;
        }
        try {
          this.field_k = param1.field_j;
          if (param1.field_j == 0) {
            if (LoginMethod.field_e == 0) {
              this.field_b.addAction(gd.field_j, (byte) -31, 12);
            }
            this.field_b.addAction(BufferedRandomAccessFile.field_d, (byte) -127, 13);
          }
          if (1 == param1.field_j) {
            if (0 == GradientOutlineTextPainter.field_v) {
              this.field_b.addAction(ListRequest.field_l, (byte) -97, 12);
            }
            this.field_b.addAction(NameAvailabilityValidator.field_n, (byte) -106, 13);
          }
          if (2 == param1.field_j) {
            if (0 == ib.field_e) {
              this.field_b.addAction(ByteStorage.field_d, (byte) -78, 12);
            }
            this.field_b.addAction(sf.field_a, (byte) -62, 13);
          }
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "wi.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean updateAndRunSelectedAction(int param0, int param1, boolean param2, int param3, boolean param4) {
        int var6 = this.field_b.updateAndPollAction(-12487, param4);
        if (param2) {
          return true;
        }
        if (-2 == var6) {
          return false;
        }
        boolean discarded$0 = this.handleGameMembershipAction(var6, param1, 7490);
        boolean discarded$1 = this.handleSocialAction(param0, (byte) -128, var6);
        boolean discarded$2 = this.handlePlayerUtilityAction(var6, (byte) 10, param0);
        boolean discarded$3 = this.handleReportAbuseAction(var6, param2, param3);
        return true;
    }

    private final boolean handlePlayerUtilityAction(int param0, byte param1, int param2) {
        int var5;
        var5 = Pixelate.field_H ? 1 : 0;
        if (param0 == 8) {
          Match.openPrivateChatTo((byte) 85, this.field_h, this.field_l);
        } else {
          if (param0 == 18) {
            qj.openPrivateChat(this.field_h, this.field_l, (byte) 8);
          } else {
            if (param0 == 11) {
              Js5ArchiveManager.setChatFilterMode(0, -26931, this.field_k, param2);
            } else {
              if (param0 == 12) {
                Js5ArchiveManager.setChatFilterMode(1, -26931, this.field_k, param2);
              } else {
                if (param0 == 13) {
                  Js5ArchiveManager.setChatFilterMode(2, -26931, this.field_k, param2);
                } else {
                  if (param0 == 14) {
                    IterableNodeHashTable.closePrivateChatInput(7500);
                  } else {
                    if (20 == param0) {
                      SceneWidget.c(true);
                    } else {
                      if (param0 != 19) {
                        return false;
                      }
                      UiTheme.openQuickChatForRecipient(this.field_h, this.field_l, this.field_k, -2, this.field_j);
                    }
                  }
                }
              }
            }
          }
        }
        if (param1 == 10) {
          return true;
        }
        ClientContextMenu.refreshOpenLegacyMenu((byte) -113);
        return true;
    }

    private final boolean handleReportAbuseAction(int param0, boolean param1, int param2) {
        if (param0 == 17) {
          AccountTermsPanel.field_M = new ReportAbuseDialog(this.field_o.field_tb, this.field_o.screenY, this.field_o.field_K, this.field_o.height, param2, cm.field_o, ScorePopup.field_i, Vector3.field_f, TextFieldValidator.field_h, um.field_q, dn.field_c, this.field_h, this.field_l);
          return true;
        }
        if (!param1) {
          return false;
        }
        boolean discarded$0 = this.handleReportAbuseAction(-50, false, 11);
        return false;
    }

    final void addLobbyGameActions(int param0) {
        int var2;
        LobbyGame var3;
        String var4;
        int var5;
        var5 = Pixelate.field_H ? 1 : 0;
        var2 = -90 % ((42 - param0) / 62);
        if (LoginMethod.field_c != null) {
          return;
        }
        var3 = vm.findLobbyGame(this.field_m, (byte) -107);
        if (var3 == null) {
          return;
        }
        var4 = var3.field_pc;
        if (var3.field_cc) {
          this.field_b.addAction(AlphaContainer.formatTemplate(fp.field_b, 97, new String[]{var4}), (byte) -105, 2);
          this.field_b.addAction(AlphaContainer.formatTemplate(oi.field_a, 52, new String[]{var4}), (byte) -118, 3);
          return;
        }
        if (var3.field_hc) {
          this.field_b.addAction(AlphaContainer.formatTemplate(SecondaryNodeHashTable.field_f, 53, new String[]{var4}), (byte) -106, 2);
        } else {
          if (!var3.field_Ob &&
            var3.field_Mb) {
            if (!var3.field_dc) {
              this.field_b.addAction(AlphaContainer.formatTemplate(PlayerBoard.field_o, 87, new String[]{var4}), (byte) -32, 2);
            } else {
              if (var3.field_hc) {
                this.field_b.addAction(AlphaContainer.formatTemplate(PlayerBoard.field_o, 87, new String[]{var4}), (byte) -32, 2);
              }
            }
          }
        }
        if (!var3.field_Ob) {
          return;
        }
        this.field_b.addAction(AlphaContainer.formatTemplate(AccountNamePrompt.field_Jb, 46, new String[]{var4}), (byte) -96, 3);
    }

    ClientContextMenu(SceneWidget param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
          this.field_b = new ContextActionMenu(NameSuggestionsPanel.field_O);
          param0.field_U = true;
          this.field_o = param0;
          this.field_k = param5;
          this.field_h = param2;
          this.field_l = param1;
          this.field_j = param6;
          this.field_i = param3;
          this.field_m = param4;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "wi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void addReportAbuseAction(int param0) {
        boolean discarded$0 = false;
        String var3 = null;
        if (null != this.field_h) {
          if (~this.field_l == ~DebouncedValidator.field_f) {
            if (param0 != 8893) {
              discarded$0 = this.handleGameMembershipAction(-105, 67, -5);
              return;
            }
            return;
          }
          var3 = this.getTargetDisplayName((byte) 43);
          String var2 = var3;
          this.field_b.addAction(AlphaContainer.formatTemplate(IndexedSpriteState.field_j, param0 - 8830, new String[]{var3}), (byte) -72, 17);
        }
        if (param0 == 8893) {
          return;
        }
        boolean discarded$1 = this.handleGameMembershipAction(-105, 67, -5);
    }

    static {
        field_c = "Suggest muting this player";
        field_g = "This is your RuneScape clan if you have one.";
        field_n = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_e = "<%0> cannot join; the game has started.";
        field_f = new int[4];
    }
}
