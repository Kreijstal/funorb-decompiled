/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlayerContextMenu {
    int field_c;
    ContextMenu field_j;
    private int[] field_h;
    static int field_e;
    static String[] field_d;
    static GameSetupPanel field_i;
    private long field_b;
    UiLayoutNode field_g;
    static boolean field_f;
    String field_k;
    private int field_l;
    private String field_a;
    static Sprite field_m;

    private final boolean openFriendPrompt(int param0, int param1, int param2) {
        if (param2 == 17) {
          ck.field_b = new TextPromptDialog(this.field_g.field_F, this.field_g.field_T, this.field_g.field_q, this.field_g.field_mb, param1, ChatMessage.field_e, AccountTermsPanel.field_H, DateInputValidator.field_f, ConsoleEvaluationException.field_e, MatchPhaseView.field_d, ul.field_c, this.field_k, this.field_b);
          return true;
        }
        if (param0 == -8985) {
          return false;
        }
        field_f = false;
        return false;
    }

    final static int b(int param0, int param1, byte param2) {
        if (param2 != 2) {
          field_i = (GameSetupPanel) null;
        }
        if (0 == param1) {
          if (param0 == 0) {
            return 0;
          }
          if (param0 >= 0) {
            return 2048;
          }
          return -2048;
        }
        if (param1 >= 0) {
          if (0 == param0) {
            return 0;
          }
          if (param0 >= 0) {
            return vd.a(param0, 11277, param1);
          }
          return -vd.a(-param0, 11277, param1);
        }
        if (param0 == 0) {
          return 4096;
        }
        if (param0 < 0) {
          return vd.a(-param0, param2 ^ 11279, -param1) - 4096;
        }
        return -vd.a(param0, 11277, -param1) + 4096;
    }

    final static int a(boolean param0, int param1, int param2) {
        if (param0) {
          return PlayerSurnameSortCriterion.b(PlayerContextMenu.b(param1, param2, (byte) 2), -25147);
        }
        field_e = -64;
        return PlayerSurnameSortCriterion.b(PlayerContextMenu.b(param1, param2, (byte) 2), -25147);
    }

    private final String getDisplayName(int param0) {
        String var2 = null;
        if (param0 != -26719) {
          return (String) null;
        }
        if (this.field_a != null) {
          var2 = this.field_a;
        } else {
          var2 = this.field_k;
        }
        return var2;
    }

    final void hideMenu(boolean param0, boolean param1) {
        this.field_j.draw(47, param0);
        if (param1) {
          this.showMenu(97);
        }
    }

    final void a(boolean param0, int param1) {
        LobbyPlayerRow var4;
        String var5;
        int var6;
        LobbyPlayerRow var7;
        var6 = Kickabout.field_G;
        if (null == this.field_k) {
          if (param1 == 0) {
            return;
          }
          field_m = (Sprite) null;
          return;
        }
        if (this.field_b == AnimationPlayer.field_c) {
          if (param1 == 0) {
            return;
          }
          field_m = (Sprite) null;
          return;
        }
        if (field_i == null) {
          if (param1 == 0) {
            return;
          }
          field_m = (Sprite) null;
          return;
        }
        if (!ScrollPane.a(param1 + 123)) {
          if (param1 == 0) {
            return;
          }
          field_m = (Sprite) null;
          return;
        }
        var7 = PasswordValidator.a(this.field_b, false);
        var4 = TexturedPanelPainter.a(param1 ^ 31253, this.field_b);
        var5 = this.getDisplayName(-26719);
        if (var4 != null) {
          if (!field_i.field_Cb) {
            this.field_j.addItem(0, 1, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, VertexNormal.field_e, new String[]{var5}));
          } else {
            if (field_i.field_ac >= 0) {
              this.field_j.addItem(0, 1, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, VertexNormal.field_e, new String[]{var5}));
            }
          }
        } else {
          if (var7 != null &&
            field_i.field_ic &&
            field_i.field_gc < field_i.field_bc) {
            if (var7.field_Gb) {
              this.field_j.addItem(0, 1, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, FullscreenFocusCanvas.field_f, new String[]{var5}));
            } else {
              if (!param0) {
                this.field_j.addItem(0, 0, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, PlayingView.field_F, new String[]{var5}));
              } else {
                if (!var7.field_Fb) {
                  this.field_j.addItem(0, 0, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, PlayingView.field_F, new String[]{var5}));
                } else {
                  this.field_j.addItem(0, 0, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, IconLabel.field_Ab, new String[]{var5}));
                  this.field_j.addItem(0, 1, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, ScrollBar.field_Eb, new String[]{var5}));
                }
              }
            }
          }
        }
        if (param1 == 0) {
          return;
        }
        field_m = (Sprite) null;
        return;
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = -112 % ((param1 - 14) / 60);
        c.a(31, param0, param2, 0);
    }

    final void showMenu(int param0) {
        String var3 = null;
        if (null != this.field_k) {
          if (~AnimationPlayer.field_c == ~this.field_b) {
            if (param0 > -11) {
              this.field_l = -59;
              return;
            }
            return;
          }
          var3 = this.getDisplayName(-26719);
          String var2 = var3;
          this.field_j.addItem(0, 17, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, vp.field_m, new String[]{var3}));
        }
        if (param0 <= -11) {
          return;
        }
        this.field_l = -59;
    }

    private final boolean handlePrimaryAction(int param0, int param1, int param2) {
        int var4;
        int var5;
        var5 = Kickabout.field_G;
        var4 = -30 % ((param1 - 2) / 48);
        if (param0 == 8) {
          ig.a(this.field_b, this.field_k, (byte) 88);
          return true;
        }
        if (param0 == 18) {
          rr.a(this.field_k, (byte) -70, this.field_b);
          return true;
        }
        if (param0 == 11) {
          ListingRowCache.a(-100, 0, this.field_l, param2);
          return true;
        }
        if (param0 == 12) {
          ListingRowCache.a(11, 1, this.field_l, param2);
          return true;
        }
        if (param0 == 13) {
          ListingRowCache.a(63, 2, this.field_l, param2);
          return true;
        }
        if (param0 == 14) {
          uq.a((byte) -122);
          return true;
        }
        if (20 == param0) {
          hp.b(0);
          return true;
        }
        if (param0 != 19) {
          return false;
        }
        mi.a(this.field_b, this.field_k, (byte) 127, this.field_l, this.field_h);
        return true;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, boolean param5, int param6, int param7, PlatformTaskDispatcher param8, int param9, long param10, int param11, int param12, String param13) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          String var16 = null;
          try {
            un.field_e = new CipherPacketBuffer(param7);
            or.field_d = new CipherPacketBuffer(param12);
            AuctionItem.field_g = param9;
            GrowableIntList.field_c = param2;
            RotaryDialWidget.field_E = param1;
            ResizableModalPanel.field_J = param4;
            if (param0 <= 119) {
              var16 = (String) null;
              PlayerContextMenu.a(39, 24, true, 46, 63, true, -76, 49, (PlatformTaskDispatcher) null, 107, -22L, -59, -43, (String) null);
            }
            ParticipantAgent.field_n = param5;
            il.field_g = param6;
            PlayerArchetypeSortCriterion.field_o = param3;
            il.field_f = param10;
            StrongCacheEntry.field_y = param11;
            LoginMethod.field_c = param8;
            IntTripleCommand.field_E = param13;
            if (LoginMethod.field_c.field_q == null) {
              return;
            }
            try {
              LoginForm.field_G = new BufferedCacheFile(LoginMethod.field_c.field_q, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var15_ref;
            stackIn_13_1 = new StringBuilder().append("uv.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            if (param8 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
            if (param13 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        if (param0 != -52) {
          return false;
        }
        if (null == this.field_j) {
          return false;
        }
        if (this.field_j.consumeSelection(-2)) {
          return true;
        }
        return false;
    }

    private final boolean handleSocialAction(int param0, int param1, byte param2) {
        Object var4;
        String var4_ref;
        String var5;
        String var10;
        String var11;
        String var12;
        String var4_refLifetime1;
        var4 = null;
        if (param0 == 4) {
          var12 = BroadcastServerCommand.a(param1, 100, this.field_k);
          if (var12 != null) {
            TextButton.a((String) null, this.field_k, 0, 2, var12, -128);
          }
          if (param2 < -13) {
            return true;
          }
          this.a((byte) 0);
          return true;
        }
        if (param0 == 5) {
          var5 = of.a(param1, (byte) 87, this.field_k);
          var4_ref = var5;
          if (var5 != null) {
            TextButton.a((String) null, this.field_k, 0, 2, var5, -128);
          }
          if (param2 < -13) {
            return true;
          }
          this.a((byte) 0);
          return true;
        }
        if (param0 == 6) {
          var10 = il.a(this.field_k, param1, (byte) 126);
          var4_refLifetime1 = var10;
          if (var10 != null) {
            TextButton.a((String) null, this.field_k, 0, 2, var10, -128);
          }
          if (param2 < -13) {
            return true;
          }
          this.a((byte) 0);
          return true;
        }
        if (7 != param0) {
          return false;
        }
        var11 = VertexNormal.a(this.field_a, 2, param1, this.field_k);
        if (var11 != null) {
          TextButton.a((String) null, this.field_k, 0, 2, var11, -128);
        }
        if (param2 < -13) {
          return true;
        }
        this.a((byte) 0);
        return true;
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        if (param0 <= 103) {
          return;
        }
        field_m = null;
        field_i = null;
    }

    private final boolean handleSecondaryAction(int param0, int param1, int param2) {
        int var5;
        var5 = Kickabout.field_G;
        if (0 != param0) {
          if (1 == param0) {
            MenuSelection.a(80, param1, this.field_b);
          } else {
            if (param0 == 2) {
              AuctionsScreen.sendAuctionAction(this.field_c, param1, (byte) -83);
            } else {
              if (param0 == 3) {
                ContextMenu.a(this.field_c, (byte) -90, param1);
              } else {
                if (10 != param0) {
                  if (15 == param0) {
                    NamedValueEntry.a(this.field_c, param2 ^ 81, param1);
                  } else {
                    if (param0 != 16) {
                      return false;
                    }
                    NamedValueEntry.a(0, -58, param1);
                  }
                } else {
                  GameLoopApplet.b(15848, param1, this.field_c);
                }
              }
            }
          }
        } else {
          IntTripleCommand.a(this.field_b, param1, 122);
        }
        if (param2 == 2) {
          return true;
        }
        this.a(false, -126);
        return true;
    }

    final void buildMenuItems(int param0) {
        String discarded$14 = null;
        String discarded$13 = null;
        String discarded$0 = null;
        String discarded$11 = null;
        String discarded$12 = null;
        String discarded$9 = null;
        String discarded$10 = null;
        String discarded$7 = null;
        String discarded$8 = null;
        String discarded$1 = null;
        String discarded$2 = null;
        String discarded$5 = null;
        String discarded$6 = null;
        String discarded$3 = null;
        String discarded$4 = null;
        String var3;
        int var4;
        GameSetupPanel var5;
        var4 = Kickabout.field_G;
        if (field_i != null) {
          if (param0 == 1) {
            return;
          }
          discarded$14 = this.getDisplayName(126);
          return;
        }
        var5 = RankingsScreen.b(this.field_c, (byte) -52);
        if (var5 == null) {
          if (param0 == 1) {
            return;
          }
          discarded$13 = this.getDisplayName(126);
          return;
        }
        var3 = var5.field_ec;
        if (var5.field_hc) {
          this.field_j.addItem(0, 2, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, SocketArchiveNetworkClient.field_u, new String[]{var3}));
          this.field_j.addItem(param0 ^ 1, 3, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, ReceivedAuctionItem.field_z, new String[]{var3}));
          if (param0 == 1) {
            return;
          }
          discarded$0 = this.getDisplayName(126);
          return;
        }
        if (var5.field_Xb) {
          this.field_j.addItem(param0 ^ 1, 2, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, gs.field_f, new String[]{var3}));
          if (!var5.field_Tb) {
            if (param0 == 1) {
              return;
            }
            discarded$11 = this.getDisplayName(126);
            return;
          }
          this.field_j.addItem(param0 ^ 1, 3, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, QuickChatCommandType.field_c, new String[]{var3}));
          if (param0 == 1) {
            return;
          }
          discarded$12 = this.getDisplayName(126);
          return;
        }
        if (var5.field_Tb) {
          if (!var5.field_Tb) {
            if (param0 == 1) {
              return;
            }
            discarded$9 = this.getDisplayName(126);
            return;
          }
          this.field_j.addItem(param0 ^ 1, 3, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, QuickChatCommandType.field_c, new String[]{var3}));
          if (param0 == 1) {
            return;
          }
          discarded$10 = this.getDisplayName(126);
          return;
        }
        if (!var5.field_ic) {
          if (!var5.field_Tb) {
            if (param0 == 1) {
              return;
            }
            discarded$7 = this.getDisplayName(126);
            return;
          }
          this.field_j.addItem(param0 ^ 1, 3, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, QuickChatCommandType.field_c, new String[]{var3}));
          if (param0 == 1) {
            return;
          }
          discarded$8 = this.getDisplayName(126);
          return;
        }
        if (!var5.field_Cb) {
          this.field_j.addItem(0, 2, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, GameplayHelpScreen.field_H, new String[]{var3}));
          if (!var5.field_Tb) {
            if (param0 == 1) {
              return;
            }
            discarded$1 = this.getDisplayName(126);
            return;
          }
          this.field_j.addItem(param0 ^ 1, 3, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, QuickChatCommandType.field_c, new String[]{var3}));
          if (param0 == 1) {
            return;
          }
          discarded$2 = this.getDisplayName(126);
          return;
        }
        if (!var5.field_Xb) {
          if (!var5.field_Tb) {
            if (param0 == 1) {
              return;
            }
            discarded$5 = this.getDisplayName(126);
            return;
          }
          this.field_j.addItem(param0 ^ 1, 3, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, QuickChatCommandType.field_c, new String[]{var3}));
          if (param0 == 1) {
            return;
          }
          discarded$6 = this.getDisplayName(126);
          return;
        }
        this.field_j.addItem(0, 2, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, GameplayHelpScreen.field_H, new String[]{var3}));
        if (!var5.field_Tb) {
          if (param0 == 1) {
            return;
          }
          discarded$3 = this.getDisplayName(126);
          return;
        }
        this.field_j.addItem(param0 ^ 1, 3, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, QuickChatCommandType.field_c, new String[]{var3}));
        if (param0 == 1) {
          return;
        }
        discarded$4 = this.getDisplayName(126);
        return;
    }

    final static void a(boolean param0) {
        IndexedSpriteState.b(38, 17);
        if (param0) {
          PlayerContextMenu.releaseStatics(-102);
        }
    }

    final void a(int param0, int param1, int[] param2) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        gg var6 = null;
        int var7 = 0;
        try {
          var4_int = -124 % ((param1 + 43) / 36);
          if (null != this.field_k) {
            if (this.field_b == AnimationPlayer.field_c &&
              param0 != 2) {
              return;
            }
            if (ts.field_d == 2) {
              var5 = this.getDisplayName(-26719);
              var6 = ClientUiOverlay.a(this.field_k, (byte) 40);
              var7 = DiskCacheRequest.a(0, this.field_k) ? 1 : 0;
              if (var6 == null &&
                var7 == 0) {
                this.field_j.addItem(0, 4, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, DualLinkNode.field_m, new String[]{var5}));
                this.field_j.addItem(0, 6, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, WeightedCacheEntry.field_r, new String[]{var5}));
                if (param2 != null &&
                  param0 != 2 &&
                  !PacketBuffer.field_l) {
                  this.field_h = param2;
                  this.field_j.addItem(0, 19, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, nj.field_a, new String[]{var5}));
                }
              }
              if (var6 != null) {
                if (!BufferedCacheFile.a(121, this.field_k) &&
                  !PacketBuffer.field_l) {
                  if (!WriteIntegersCommand.field_C) {
                    this.field_j.addItem(0, 8, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, LeaderboardParticipant.field_a, new String[]{var5}));
                  }
                  this.field_j.addItem(0, 18, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, ee.field_c, new String[]{var5}));
                  if (param2 != null) {
                    this.field_h = param2;
                    this.field_j.addItem(0, 19, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, nj.field_a, new String[]{var5}));
                  }
                }
                this.field_j.addItem(0, 5, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, Trinket.field_i, new String[]{var5}));
              }
              if (var7 != 0) {
                this.field_j.addItem(0, 7, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, LeaderboardParticipant.field_i, new String[]{var5}));
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_28_0 = var4;
          stackIn_28_1 = new StringBuilder().append("uv.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final void a(ChatMessage param0, byte param1) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        String var4 = null;
        try {
          if (param0.field_m) {
            return;
          }
          this.field_l = param0.field_c;
          if (param0.field_c == 0) {
            if (ServerTextTemplate.field_a == 0) {
              this.field_j.addItem(param1 - 11, 12, sd.field_c);
            }
            this.field_j.addItem(0, 13, ConsoleParseException.field_a);
          }
          if (param0.field_c == 1) {
            if (0 == ConsoleTokenCursor.field_b) {
              this.field_j.addItem(param1 ^ 11, 12, mg.field_d);
            }
            this.field_j.addItem(param1 - 11, 13, GameModeDefinition.field_a);
          }
          if (param0.field_c == 2) {
            if (0 == fc.field_a) {
              this.field_j.addItem(0, 12, SpriteState.field_u);
            }
            this.field_j.addItem(0, 13, TextWidgetPainter.field_g);
          }
          if (param1 == 11) {
            return;
          }
          var4 = (String) null;
          PlayerContextMenu.a(-113, 85, false, 126, -61, false, -59, 112, (PlatformTaskDispatcher) null, -96, 71L, 73, -56, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("uv.A(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = this.field_j.getSelectedActionId((byte) -126, param0);
        if (param1 == var6) {
          return false;
        }
        boolean discarded$0 = this.handleSecondaryAction(var6, param3, 2);
        boolean discarded$1 = this.handleSocialAction(var6, param4, (byte) -100);
        boolean discarded$2 = this.handlePrimaryAction(var6, param1 + 113, param4);
        boolean discarded$3 = this.openFriendPrompt(param1 - 8983, param2, var6);
        return true;
    }

    PlayerContextMenu(UiLayoutNode param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
          this.field_j = new ContextMenu(su.field_b);
          this.field_k = param2;
          this.field_g = param0;
          this.field_l = param5;
          this.field_a = param3;
          this.field_c = param4;
          param0.field_I = true;
          this.field_b = param1;
          this.field_h = param6;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "uv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new String[]{"Exhibition Mode", "Facebook", "Tournament Mode", "Rewards"};
        field_f = false;
        field_e = 48;
    }
}
