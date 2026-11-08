/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SpriteState extends DualLinkNode {
    int field_n;
    int field_v;
    static Sprite[] field_p;
    static String[] field_x;
    int field_o;
    static String field_t;
    static String field_r;
    int field_s;
    int field_q;
    static String field_u;
    int field_w;

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = FootballerAiOverlaySupport.field_d;
        var2.b(param1, (byte) 108);
        var2.field_n = var2.field_n + 1;
        int var3 = var2.field_n;
        if (param0 != 6773) {
          return;
        }
        var2.writeByte(param0 - 6660, 5);
        var2.writeByte(123, PlayerContextMenu.field_i.field_bc);
        int var4 = (PlayerContextMenu.field_i.field_Mb << 6) + PlayerContextMenu.field_i.field_Wb;
        var2.writeByte(106, var4);
        var2.writeBytes(0, PlayerContextMenu.field_i.field_Eb.length, param0 ^ 1991213509, PlayerContextMenu.field_i.field_Eb);
        var2.backpatchByteLength(62, var2.field_n - var3);
    }

    abstract void rotateNearest(int param0, int param1, int param2, int param3, int param4, int param5);

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        UiLayoutNode stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        int stackIn_37_0 = 0;
        UiLayoutNode stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        boolean stackIn_157_2 = false;
        UiLayoutNode stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        boolean stackIn_162_2 = false;
        UiLayoutNode stackIn_166_0 = null;
        int stackIn_166_1 = 0;
        boolean stackIn_167_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        UiLayoutNode var6 = null;
        UiLayoutNode var7 = null;
        UiLayoutNode var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int var13_int = 0;
        String var13_ref = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        IntrusiveDeque var17 = null;
        Object var18 = null;
        LobbyPlayerRow var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        UiLayoutNode var21 = null;
        int[] var22 = null;
        String var24 = null;
        int[] var25 = null;
        UiLayoutNode var26 = null;
        int var11_intLifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13_intLifetime1;
        int var14_intLifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17_intLifetime1;
        int var18_intLifetime1;
        int var11_intLifetime2;
        int var16Lifetime1Lifetime1;
        var18 = null;
        var19 = Kickabout.field_G;
        try {
          ConsoleEvaluationException.a(7, GameMediaSupport.field_b);
          if (PlayerContextMenu.field_i != null) {
            boolean decompiledFrameRemainder0 = true;
            TrinketUnlockNotice.field_b.field_lb = true;
            DualLinkHashTable.field_d.field_mb = 0;
            var21 = DualLinkHashTable.field_d;
            var26 = var21;
            var26.field_q = 0;
            GoalStateAgent.field_k.field_mb = 0;
            var6 = GoalStateAgent.field_k;
            var6.field_q = 0;
            MarkerSliderWidget.field_F.field_mb = 0;
            var7 = MarkerSliderWidget.field_F;
            var7.field_q = 0;
            if (!ScrollPane.a(113)) {
              var9_ref_String = PlayerContextMenu.field_i.field_ec;
              IterableDualLinkDeque.field_h.field_E = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, AccountNameAvailabilityValidator.field_m, new String[]{var9_ref_String}).toUpperCase();
              MarkerSliderWidget.field_F.setBounds(true, AuctionItem.field_p.field_q, 0, AuctionItem.field_p.field_mb - 40, 40);
              MarkerSliderWidget.field_F.field_E = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, SpriteResourceSupport.field_c, new String[]{var9_ref_String});
              var8 = MarkerSliderWidget.field_F;
            } else {
              IterableDualLinkDeque.field_h.field_E = TabStrip.field_zb.toUpperCase();
              var9 = (AuctionItem.field_p.field_q + 2) / 2;
              DualLinkHashTable.field_d.setBounds(true, var9 - 2, 0, -40 + AuctionItem.field_p.field_mb, 40);
              if (PlayerContextMenu.field_i.field_bc <= PlayerContextMenu.field_i.field_gc) {
                DualLinkHashTable.field_d.field_E = LeagueWinnerDialog.field_I.toUpperCase();
                DualLinkHashTable.field_d.field_lb = false;
              } else {
                DualLinkHashTable.field_d.field_E = SocialRowOrderSupport.field_b.toUpperCase();
                DualLinkHashTable.field_d.field_lb = true;
              }
              DualLinkHashTable.field_d.field_R = TextFieldNode.field_Qb.field_R;
              if (SharedSpriteTables.field_b > 0) {
                if (SharedSpriteTables.field_b == 1) {
                  var10_ref_String = LobbyGameRecord.field_i;
                } else {
                  var10_ref_String = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, PopupDialog.field_f, new String[]{Integer.toString(SharedSpriteTables.field_b)});
                }
                DualLinkHashTable.field_d.field_E = DualLinkHashTable.field_d.field_E + "<br>" + var10_ref_String;
                if ((16 & GameKeyHandler.field_c) == 0 &&
                  !TrinketCatalog.field_b) {
                  DualLinkHashTable.field_d.field_R = TextFieldNode.field_Qb.field_S;
                }
              }
              GoalStateAgent.field_k.setBounds(true, AuctionItem.field_p.field_q - var9, var9, -40 + AuctionItem.field_p.field_mb, 40);
              GoalStateAgent.field_k.field_E = BlankScreen.field_g.toUpperCase();
              stackIn_18_0 = GoalStateAgent.field_k;
              stackIn_19_1 = (param3) && (0L == TextFieldNode.field_Ib);
              stackIn_18_0.field_lb = stackIn_19_1;
              var8 = GoalStateAgent.field_k;
              var10 = 2;
              if (PlayArea.field_k != null) {
                if (SumIntegersCommand.field_G == null) {
                  WhirlpoolHasher.field_f = new boolean[UiKeyRoutingSupport.field_j];
                  SumIntegersCommand.field_G = new byte[UiKeyRoutingSupport.field_j];
                }
                for (var11_int = 0; UiKeyRoutingSupport.field_j > var11_int; var11_int++) {
                  WhirlpoolHasher.field_f[var11_int] = false;
                }
                var10 = 0;
                scanLoop1: while (true) {
                  if (var10 < 2) {
                    var11_intLifetime2 = 0;
                    var12 = 0;
                    while (true) {
                      if (var12 >= PlayArea.field_k.length) {
                        if (var11_intLifetime2 != 0) {
                          break scanLoop1;
                        }
                        var10++;
                        continue scanLoop1;
                      }
                      var25 = PlayArea.field_k[var12];
                      var22 = var25;
                      var13 = var22;
                      var14_int = 0;
                      scanLoop2: while (true) {
                        if (var14_int >= var25.length) {
                          var11_intLifetime2 = 1;
                          var14_int = -1;
                          for (var15 = 0; var25.length > var15; var15 += 2) {
                            var16 = var25[var15];
                            if (var14_int < var16) {
                              var14_int = var16;
                            }
                          }
                          WhirlpoolHasher.field_f[var14_int] = true;
                        } else {
                          var15 = var25[var14_int];
                          var16 = var13[var14_int + 1];
                          if (var15 != -1) {
                            if ((PlayerContextMenu.field_i.field_Eb[var15] & 255) != var16) {
                              break scanLoop2;
                            }
                          } else {
                            if (0 == var10) {
                              stackIn_37_0 = PlayerContextMenu.field_i.field_bc;
                            } else {
                              stackIn_37_0 = PlayerContextMenu.field_i.field_gc;
                            }
                            var17_int = stackIn_37_0;
                            if (var17_int != var16) {
                              break scanLoop2;
                            }
                          }
                          var14_int += 2;
                          continue;
                        }
                        break;
                      }
                      var12++;
                    }
                  }
                  break;
                }
                if (!(2 > ScrollContainer.field_Ib) &&
                  GameplayHelpScreen.field_G[12]) {
                  var10 = 2;
                }
              }
              if (var10 >= 2) {
                if ((null != ModelMaterialDecoder.field_h ||
                  null != BroadcastServerCommand.field_E ||
                  null != AppletContextSupport.field_f ||
                  null != SumIntegersCommand.field_D)) {
                  var11_intLifetime1 = 0;
                  var12Lifetime1 = 0;
                  var13_int = 0;
                  var14_intLifetime1 = 0;
                  var15Lifetime1 = 0;
                  for (var16Lifetime1 = 0; var16Lifetime1 < UiKeyRoutingSupport.field_j; var16Lifetime1++) {
                    var17_intLifetime1 = 255 & PlayerContextMenu.field_i.field_Eb[var16Lifetime1];
                    if (null != ModelMaterialDecoder.field_h &&
                      ModelMaterialDecoder.field_h[var16Lifetime1] != null &&
                      ModelMaterialDecoder.field_h[var16Lifetime1][var17_intLifetime1]) {
                      var11_intLifetime1 = 1;
                    }
                    if (BroadcastServerCommand.field_E != null &&
                      BroadcastServerCommand.field_E[var16Lifetime1] != null) {
                      var18_int = BroadcastServerCommand.field_E[var16Lifetime1][var17_intLifetime1];
                      if (var18_int != 0 &&
                        !TooltipOverlay.field_d) {
                        var11_intLifetime1 = 1;
                      }
                      if (var18_int > var13_int) {
                        var13_int = var18_int;
                      }
                    }
                    regionExit3: {
                      if (null != AppletContextSupport.field_f) {
                        if (AppletContextSupport.field_f[var16Lifetime1] == null) {
                          if (((null != SumIntegersCommand.field_D)) &&
                            ((null != SumIntegersCommand.field_D[var16Lifetime1]))) {
                            var15Lifetime1 = var15Lifetime1 | SumIntegersCommand.field_D[var16Lifetime1][var17_intLifetime1];
                          }
                          break regionExit3;
                        }
                        var18_intLifetime1 = AppletContextSupport.field_f[var16Lifetime1][var17_intLifetime1];
                        if (var18_intLifetime1 > var14_intLifetime1) {
                          var14_intLifetime1 = var18_intLifetime1;
                        }
                        if (var18_intLifetime1 != 0 &&
                          !TooltipOverlay.field_d) {
                          var11_intLifetime1 = 1;
                        }
                      }
                      if (null != SumIntegersCommand.field_D &&
                        null != SumIntegersCommand.field_D[var16Lifetime1]) {
                        var15Lifetime1 = var15Lifetime1 | SumIntegersCommand.field_D[var16Lifetime1][var17_intLifetime1];
                      }
                    }
                  }
                  var16Lifetime1Lifetime1 = 0;
                  var17 = ClientException.field_c.field_Ab.field_jb;
                  var18_ref = (LobbyPlayerRow) (var17.g(24009));
                  scanLoop4: while (true) {
                    if (var18_ref != null) {
                      if (!var18_ref.h(-13356)) {
                        if (var11_intLifetime1 != 0 &&
                          !var18_ref.field_Cb) {
                          var16Lifetime1Lifetime1 = 1;
                          break scanLoop4;
                        }
                        if (var18_ref.field_Qb < var13_int) {
                          var16Lifetime1Lifetime1 = 1;
                          break scanLoop4;
                        }
                        if (var14_intLifetime1 > var18_ref.field_Db) {
                          var16Lifetime1Lifetime1 = 1;
                          break scanLoop4;
                        }
                        if ((var15Lifetime1 & ~var18_ref.field_Pb) > 0) {
                          var16Lifetime1Lifetime1 = 1;
                          break scanLoop4;
                        }
                        if (var12Lifetime1 != 0) {
                          var16Lifetime1Lifetime1 = 1;
                          break scanLoop4;
                        }
                      }
                      var18_ref = (LobbyPlayerRow) (var17.c(param2 ^ -33));
                      continue;
                    }
                    break;
                  }
                  if (ScrollContainer.field_Ib >= 2 &&
                    GameplayHelpScreen.field_G[12]) {
                    var16Lifetime1Lifetime1 = 0;
                  }
                  if ((var16Lifetime1Lifetime1 != 0)) {
                    GoalStateAgent.field_k.field_lb = false;
                    if (!(!GoalStateAgent.field_k.field_Q)) {
                      if (HighScoreQuery.field_l.tabs.field_Db != 0) {
                        UrlRequest.field_e = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, TrinketSlot.field_Fb, new String[]{ClientPacketFlushSupport.field_d});
                      } else {
                        UrlRequest.field_e = MusicPatchPcmStream.field_m;
                      }
                    }
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                GoalStateAgent.field_k.field_lb = false;
                if (GoalStateAgent.field_k.field_Q) {
                  var11 = null;
                  var12Lifetime2 = 0;
                  for (var13_intLifetime1 = 0; UiKeyRoutingSupport.field_j > var13_intLifetime1; var13_intLifetime1++) {
                    if (WhirlpoolHasher.field_f[var13_intLifetime1]) {
                      var24 = "<col=A00000>" + Cp1252EncodingSupport.field_b[var13_intLifetime1] + "</col>";
                      if (var11 == null) {
                        var11 = var24;
                      } else {
                        var12Lifetime2 = 1;
                        var11 = (String) (var11) + ", " + var24;
                      }
                    }
                  }
                  if (var10 != 0) {
                    var13_ref = Bzip2State.field_w;
                    if (var12Lifetime2 == 0) {
                      var14 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, ColumnTableWidget.field_yb, new String[]{(String) (var11)});
                    } else {
                      var14 = IntValueNode.field_k + (String) (var11);
                    }
                  } else {
                    var13_ref = StringCursor.field_g;
                    if (var12Lifetime2 != 0) {
                      var14 = RenderedFootballer.field_S + (String) (var11);
                    } else {
                      var14 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, WriteIntegersCommand.field_D, new String[]{(String) (var11)});
                    }
                  }
                  UrlRequest.field_e = "<col=A00000>" + var13_ref + "<br>" + var14;
                }
              }
            }
            if (TextFieldNode.field_Ib != 0L) {
              var9 = (int)(-MonotonicClock.monotonicMillis(22) + TextFieldNode.field_Ib);
              var9 = (var9 + 999) / 1000;
              if (var9 < 1) {
                var9 = 1;
              }
              var8.field_E = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, ModelMaterial.field_h, new String[]{Integer.toString(var9)});
            }
            GameQuickChatResolver.field_c.field_E = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, DateOfBirthPanel.field_F, new String[]{Integer.toString(PlayerContextMenu.field_i.field_gc), Integer.toString(PlayerContextMenu.field_i.field_bc)});
          }
          stackIn_156_0 = TrinketIcon.field_Cb;
          stackIn_156_1 = param2 ^ param2;
          stackIn_157_2 = (param0) && (!param4) && (!TrinketCatalog.field_b);
          ((UiLayoutNode) (Object) stackIn_156_0).updateInput(stackIn_156_1, stackIn_157_2);
          stackIn_161_0 = AuctionItem.field_p;
          stackIn_161_1 = 0;
          stackIn_162_2 = (param0) && (!param4) && (!TrinketCatalog.field_b);
          ((UiLayoutNode) (Object) stackIn_161_0).updateInput(stackIn_161_1, stackIn_162_2);
          stackIn_166_0 = SocialUiState.field_f;
          stackIn_166_1 = 0;
          stackIn_167_2 = (param0) && (!param4) && (TrinketCatalog.field_b);
          ((UiLayoutNode) (Object) stackIn_166_0).updateInput(stackIn_166_1, stackIn_167_2);
          HighScoreQuery.field_l.tabs.processTabClicks((byte) 71);
          if (null != PlayerContextMenu.field_i) {
            if (TrinketUnlockNotice.field_b.field_sb != 0) {
              ContextMenu.a(PlayerContextMenu.field_i.h((byte) 73), (byte) -108, param1);
            }
            if (GoalStateAgent.field_k.field_sb != 0) {
              SelectionMarkerSupport.field_e = true;
            }
            if (DualLinkHashTable.field_d.field_sb != 0) {
              TrinketCatalog.field_b = true;
            }
            if (BlackFadeScreen.field_i.field_sb != 0) {
              TrinketCatalog.field_b = false;
            }
            NetworkGameClient.a(param1, (byte) -57, PlayerContextMenu.field_i, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var5), "lu.DB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = this.field_o << 3;
        param3 = (15 & var6) + (param3 << 4);
        int var7 = this.field_v << 3;
        param0 = (param0 << 4) + (var7 & 15);
        this.rotateNearest(var6, var7, param3, param0, param2, param4);
        if (param1 != 24407) {
          SpriteState.a(false, 46, 70, true, false);
        }
    }

    final static int a(BitmapFont param0, String param1, int param2, String[] param3, int param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = Kickabout.field_G;
        try {
          var5_int = param0.stringWidth(param1);
          if (param4 >= var5_int &&
            param1.indexOf("<br>") == -1) {
            param3[0] = param1;
            stackIn_4_0 = 1;
            return stackIn_4_0;
          }
          var6 = (param4 + var5_int - 1) / param4;
          param4 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param1.length();
          if (param2 != -46) {
            stackIn_7_0 = 59;
            return stackIn_7_0;
          }
          for (var9 = 0; var8 > var9; var9++) {
            var10 = param1.charAt(var9);
            if (var10 == 32 ||
              var10 == 45) {
              var11 = param1.substring(var7, 1 + var9).trim();
              var12 = param0.stringWidth(var11);
              if (var12 >= param4) {
                var7 = 1 + var9;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param3[incrementValue$1] = var11;
              }
            }
            if (var10 == 62 &&
              param1.regionMatches(-3 + var9, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param3[incrementValue$2] = param1.substring(var7, -3 + var9).trim();
              var7 = 1 + var9;
            }
          }
          if (var8 > var7) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param3[incrementValue$0] = param1.substring(var7, var8).trim();
          }
          stackIn_26_0 = var6Lifetime1;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("lu.FB(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -28) {
          SpriteState.a(47, -58);
        }
        field_p = null;
        field_t = null;
        field_r = null;
        field_u = null;
        field_x = null;
    }

    SpriteState() {
    }

    static {
        field_x = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_r = "Type your age in years";
        field_u = "Only show private chat from my friends and opponents";
    }
}
