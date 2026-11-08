/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialListPacketHandler {
    static int field_b;
    static Archive field_a;

    final static void handleMenuAction(boolean param0, int param1, boolean param2) {
        int stackIn_47_0 = 0;
        int stackIn_107_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = TetraLink.field_J;
        if (param2) {
          SocialListPacketHandler.handleSocialListPacket((byte) 91);
        }
        boolean decompiledFrameRemainder0 = true;
        var3 = param1;
        if (var3 != 0) {
          if (var3 == 1) {
            DateOfBirthPanel.playSample(IndexedSpriteHelpers.field_c, 573509761);
            if (!LoadingProgressDialog.isKeyboardIdle(34)) {
              var3 = param0 ? 1 : 0;
              var4 = PlayerContextMenu.field_d;
              if (0 == DraggableWidget.field_O ||
                BackgroundSparkle.field_t == 2 ||
                3 == BackgroundSparkle.field_t ||
                DraggableWidget.field_O == 4 ||
                5 == DraggableWidget.field_O) {
                var4 = DraggableWidget.field_O;
              }
              ScreenSwitchHelpers.switchScreen(-4, -117, var3 != 0, var4);
            } else {
              stackIn_47_0 = (LoadingProgressDialog.isKeyboardIdle(102)) ? 0 : 1;
              var3 = stackIn_47_0;
              QuickChatMenuFactory.configureMenuTheme(true, (byte) 33, WhirlpoolHasher.field_l, 240, WhirlpoolHasher.field_l, 2, 320, SocialTabsPanel.field_b, SocialTabsPanel.field_b.field_u, CameraAndChatHelpers.field_a, param0, SocialTabsPanel.field_b.field_u + SocialTabsPanel.field_b.field_K, 8, var3, 8);
            }
          } else {
            if (var3 != 2) {
              if (7 != var3) {
                if (var3 == 3) {
                  DateOfBirthPanel.playSample(IndexedSpriteHelpers.field_c, 573509761);
                  var3 = param0 ? 1 : 0;
                  var4 = PlayerContextMenu.field_d;
                  if (0 == DraggableWidget.field_O ||
                    2 == BackgroundSparkle.field_t ||
                    BackgroundSparkle.field_t == 3 ||
                    4 == DraggableWidget.field_O ||
                    DraggableWidget.field_O == 5) {
                    var4 = DraggableWidget.field_O;
                  }
                  ScreenSwitchHelpers.switchScreen(8, -109, var3 != 0, var4);
                } else {
                  if (var3 != 5) {
                    if (var3 == 8) {
                      DateOfBirthPanel.playSample(IndexedSpriteHelpers.field_c, 573509761);
                      var3 = PlayerContextMenu.field_d;
                      var4 = param0 ? 1 : 0;
                      var5 = PlayerContextMenu.field_d;
                      if (DraggableWidget.field_O == 0 ||
                        BackgroundSparkle.field_t == 2 ||
                        BackgroundSparkle.field_t == 3 ||
                        4 == DraggableWidget.field_O ||
                        DraggableWidget.field_O == 5) {
                        var5 = DraggableWidget.field_O;
                      }
                      ScreenSwitchHelpers.switchScreen(var3, -93, var4 != 0, var5);
                    } else {
                      if (var3 != 4) {
                        if ((var3 != 14 &&
                          var3 != 15) && (var3 != 16 && var3 != 17)) {
                          if (var3 == 6) {
                            if (null != EmailAvailabilityValidator.field_u) {
                              QuickChatCategory.exitFullscreen((byte) 119);
                            } else {
                              var3 = param0 ? 1 : 0;
                              GameBoard.field_f = false;
                              MenuThemeHelpers.initializeMenuTheme(8, WhirlpoolHasher.field_l, (byte) 7, 2, var3 != 0, 240, 8, 320, SocialTabsPanel.field_b.field_K + SocialTabsPanel.field_b.field_u, SocialTabsPanel.field_b.field_u, SocialTabsPanel.field_b, WhirlpoolHasher.field_l);
                            }
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            if (var3 == 9) {
                              DelegatingCanvas.createGameOptions(true, -7869);
                              EditableTextWidget.field_X = false;
                              AnimationSequence.field_g = true;
                              ContextMenu.field_bc.exitToMainMenu(true, param0);
                            } else {
                              if (var3 == 10) {
                                ContextMenu.field_bc.sendDrawOffer(0);
                                var3 = param0 ? 1 : 0;
                                ScreenSwitchHelpers.switchScreen(-1, -117, var3 != 0, 0);
                              } else {
                                if (var3 == 11) {
                                  ContextMenu.field_bc.resign(false);
                                  var3 = param0 ? 1 : 0;
                                  ScreenSwitchHelpers.switchScreen(-1, -72, var3 != 0, 0);
                                } else {
                                  if (18 == var3) {
                                    ContextMenu.field_bc.restartGame(-1);
                                    var3 = param0 ? 1 : 0;
                                    ScreenSwitchHelpers.switchScreen(-1, -121, var3 != 0, 0);
                                  } else {
                                    if (var3 == 19) {
                                      DateOfBirthPanel.playSample(IndexedSpriteHelpers.field_c, 573509761);
                                      stackIn_107_0 = (LoginCredentials.field_a != 0) ? 0 : 1;
                                      JoinStatusTextHelpers.field_h = stackIn_107_0;
                                    } else {
                                      if (12 != var3) {
                                        if (20 == var3) {
                                          RasterBuffer.field_k = 0;
                                        } else {
                                          if (var3 == 21) {
                                            RasterBuffer.field_k = 1;
                                          } else {
                                            if (var3 == 22) {
                                              if (8 == BackgroundSparkle.field_t ||
                                                BackgroundSparkle.field_t == 6) {
                                                EmailAvailabilityValidator.startScreenTransition(NameEntryPopup.field_Mb, BackgroundSparkle.field_t, -308);
                                              }
                                            } else {
                                              if (var3 == 13) {
                                                AnimationPlayer.openQuitPage(ProgressMessageDialog.getHostApplet(13), (byte) 116);
                                              } else {
                                                if (var3 == 23) {
                                                  DateOfBirthPanel.playSample(IndexedSpriteHelpers.field_c, 573509761);
                                                  var3 = param0 ? 1 : 0;
                                                  var4 = PlayerContextMenu.field_d;
                                                  if (DraggableWidget.field_O == 0 ||
                                                    2 == BackgroundSparkle.field_t ||
                                                    BackgroundSparkle.field_t == 3 ||
                                                    DraggableWidget.field_O == 4 ||
                                                    DraggableWidget.field_O == 5) {
                                                    var4 = DraggableWidget.field_O;
                                                  }
                                                  ScreenSwitchHelpers.switchScreen(1, -80, var3 != 0, var4);
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        DelegatingCanvas.createGameOptions(true, -7869);
                                        if (NetworkGameClient.field_s) {
                                          var3 = param0 ? 1 : 0;
                                          var4 = PlayerContextMenu.field_d;
                                          if (DraggableWidget.field_O == 0 ||
                                            BackgroundSparkle.field_t == 2 ||
                                            BackgroundSparkle.field_t == 3 ||
                                            DraggableWidget.field_O == 4 ||
                                            5 == DraggableWidget.field_O) {
                                            var4 = DraggableWidget.field_O;
                                          }
                                          ScreenSwitchHelpers.switchScreen(-5, -98, var3 != 0, var4);
                                        }
                                        if (AccountServerResult.field_a) {
                                          LabelPairWidget.sendByteRequest(3, 0, 11);
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        DateOfBirthPanel.playSample(IndexedSpriteHelpers.field_c, 573509761);
                        var3 = param0 ? 1 : 0;
                        var4 = PlayerContextMenu.field_d;
                        if (DraggableWidget.field_O == 0 ||
                          BackgroundSparkle.field_t == 2 ||
                          3 == BackgroundSparkle.field_t ||
                          DraggableWidget.field_O == 4 ||
                          DraggableWidget.field_O == 5) {
                          var4 = DraggableWidget.field_O;
                        }
                        ScreenSwitchHelpers.switchScreen(6, -90, var3 != 0, var4);
                      }
                    }
                  } else {
                    DateOfBirthPanel.playSample(IndexedSpriteHelpers.field_c, 573509761);
                    JoinStatusTextHelpers.field_h = 0;
                    var3 = param0 ? 1 : 0;
                    var4 = PlayerContextMenu.field_d;
                    if (DraggableWidget.field_O == 0 ||
                      2 == BackgroundSparkle.field_t ||
                      BackgroundSparkle.field_t == 3 ||
                      DraggableWidget.field_O == 4 ||
                      5 == DraggableWidget.field_O) {
                      var4 = DraggableWidget.field_O;
                    }
                    ScreenSwitchHelpers.switchScreen(7, -65, var3 != 0, var4);
                  }
                }
              } else {
                DateOfBirthPanel.playSample(IndexedSpriteHelpers.field_c, 573509761);
                var3 = param0 ? 1 : 0;
                var4 = PlayerContextMenu.field_d;
                if (0 == DraggableWidget.field_O ||
                  BackgroundSparkle.field_t == 2 ||
                  3 == BackgroundSparkle.field_t ||
                  DraggableWidget.field_O == 4 ||
                  DraggableWidget.field_O == 5) {
                  var4 = DraggableWidget.field_O;
                }
                ScreenSwitchHelpers.switchScreen(0, -66, var3 != 0, var4);
              }
            } else {
              DateOfBirthPanel.playSample(LoginProgressHelpers.field_d, 573509761);
              MenuScreen.field_g = 2;
              SoundMixerHelpers.field_e = WidgetTheme.field_s;
              TransitionPhase.field_d = WidgetStyleLayer.field_j;
              DelegatingCanvas.createGameOptions(false, -7869);
              var3 = param0 ? 1 : 0;
              ScreenSwitchHelpers.switchScreen(-1, -73, var3 != 0, 0);
            }
          }
        } else {
          var3 = param0 ? 1 : 0;
          ScreenSwitchHelpers.switchScreen(-3, -96, var3 != 0, 0);
          DelegatingCanvas.createGameOptions(false, -7869);
        }

    }

    final static void handleSocialListPacket(byte param0) {
        int stackIn_12_0 = 0;
        LobbyPlayerEntry stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        LobbyPlayerEntry stackIn_77_0 = null;
        boolean stackIn_78_1 = false;
        RuntimeException decompiledCaughtException = null;
        BitPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3_ref = null;
        long var3_long = 0L;
        int var3 = 0;
        LobbyPlayerEntry var3_ref_gd = null;
        int var4 = 0;
        LobbyGame var4_ref_el = null;
        int var5 = 0;
        LobbyGame var6 = null;
        String var6_ref = null;
        LobbyPlayerEntry var7 = null;
        int var8 = 0;
        LobbyPlayerEntry var8_ref_gd = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        LobbyGame var13 = null;
        LobbyGame var14 = null;
        LobbyGame var15 = null;
        Object var16 = null;
        LobbyGame var16_ref = null;
        LobbyPlayerEntry var17 = null;
        String var18 = null;
        String var19 = null;
        LobbyGame var20 = null;
        LobbyPlayerEntry var21 = null;
        LobbyPlayerEntry var22 = null;
        String var23 = null;
        String var24 = null;
        LobbyPlayerEntry var25 = null;
        Object var26 = null;
        LobbyPlayerEntry var27 = null;
        LobbyGame var28 = null;
        LobbyPlayerEntry var3_ref_gdLifetime1;
        LobbyPlayerEntry var3_ref_gdLifetime2;
        long var3_longLifetime1;
        long var3_longLifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime6;
        long var3_longLifetime2Lifetime1;
        int var5Lifetime1Lifetime1;
        var3_ref = null;
        var16 = null;
        var26 = null;
        var11 = TetraLink.field_J;
        try {
          if (param0 != -7) {
            return;
          }
          var1 = BackgroundSparkle.field_q;
          var2 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -99);
          if (var2 != 0 &&
            var2 != 1 &&
            var2 != 2 &&
            3 != var2 &&
            var2 != 4) {
            if (var2 == 5) {
              var3_long = ((PacketBuffer) ((Object) var1)).readLong(255);
              var18 = ((PacketBuffer) ((Object) var1)).readString((byte) 81);
              var6_ref = ((PacketBuffer) ((Object) var1)).readString((byte) 81);
              var19 = ((PacketBuffer) ((Object) var1)).readString((byte) 81);
              var17 = NameAvailabilityValidator.findSocialEntry(var3_long, -26778);
              var8_ref_gd = var17;
              stackIn_12_0 = (var6_ref.equals("")) ? 0 : 1;
              var9 = stackIn_12_0;
              if (var17 == null) {
                var8_ref_gd = new LobbyPlayerEntry(var18, var19, var3_long);
                QuickChatCommandType.field_a.put(var3_long, var8_ref_gd, param0 ^ -122);
              } else {
                if (var9 != 0) {
                  var17.updateNames(32, var18, var19);
                }
              }
              var8_ref_gd.field_bc = ClockAndTextHelpers.monotonicMillis(param0 ^ -7) - (long)((PacketBuffer) ((Object) var1)).readInt(param0 ^ 112);
              var8_ref_gd.field_Pb = ((PacketBuffer) ((Object) var1)).readUnsignedShort(127);
              var10 = ((PacketBuffer) ((Object) var1)).readVarInt((byte) 120);
              var8_ref_gd.field_Qb = var10 >> 1;
              stackIn_18_0 = var8_ref_gd;
              stackIn_19_1 = ((var10 & 1) != 0);
              stackIn_18_0.field_Tb = stackIn_19_1;
              var8_ref_gd.field_dc = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -99);
              var8_ref_gd.field_Ub = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -99);
              SpriteCheckboxPainter.insertLobbyGameInOrder((byte) -91, var8_ref_gd);
              return;
            }
            if (var2 == 6) {
              var3_longLifetime1 = ((PacketBuffer) ((Object) var1)).readLong(param0 + 262);
              var5 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -99);
              var27 = NameAvailabilityValidator.findSocialEntry(var3_longLifetime1, -26778);
              if (var27 == null) {
                return;
              }
              if (var27.field_Kb) {
                TextureCache.field_g = TextureCache.field_g - 1;
                var27.field_Kb = false;
              }
              if (var5 == 0) {
                var27.unlink(false);
              } else {
                var27.field_Sb = QuickChatPhraseCache.field_a;
                var27.field_Xb = var5;
              }
              var27.unlinkSecondary(0);
              return;
            }
            if (var2 == 7) {
              var3_ref_gd = (LobbyPlayerEntry) (AlternateLongAndTextCredentials.field_p.first(false));
              while (var3_ref_gd != null) {
                var3_ref_gd.unlink(false);
                var3_ref_gd.unlinkSecondary(param0 ^ -7);
                var3_ref_gd = (LobbyPlayerEntry) (AlternateLongAndTextCredentials.field_p.next((byte) -70));
              }
              TextureCache.field_g = 0;
              return;
            }
            if (8 == var2) {
              var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(param0 ^ -122);
              var4_ref_el = (LobbyGame) (QuickChatCommandType.field_e.findByKey((long)var3, param0 ^ -8));
              if (var4_ref_el == null) {
                var4_ref_el = new LobbyGame(GameOptionControls.field_k);
                QuickChatCommandType.field_e.put((long)var3, var4_ref_el, param0 + 129);
              }
              LruTextureCache.readGameEntry(true, true, var4_ref_el, var1);
              ArchiveRequest.insertLobbyGameInOrder(var4_ref_el, -40);
              return;
            }
            if (9 == var2) {
              var3Lifetime4 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(127);
              var4 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -99);
              var28 = (LobbyGame) (QuickChatCommandType.field_e.findByKey((long)var3Lifetime4, 1));
              if (var28 == null) {
                return;
              }
              if (0 != var4) {
                var28.field_Ub = QuickChatPhraseCache.field_a;
                var28.field_gc = var4;
              } else {
                var28.unlink(false);
              }
              var28.unlinkSecondary(0);
              return;
            }
            if (10 == var2) {
              var15 = (LobbyGame) (InputDetachHelpers.field_a.first(false));
              while (var15 != null) {
                var15.unlink(false);
                var15.unlinkSecondary(0);
                var15 = (LobbyGame) (InputDetachHelpers.field_a.next((byte) -70));
              }
              return;
            }
            if (var2 != 11 &&
              var2 != 12) {
              if (var2 == 13) {
                var3Lifetime5 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(127);
                var4Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -99);
                var14 = (LobbyGame) (QuickChatCommandType.field_e.findByKey((long)var3Lifetime5, 1));
                if (var14 != null) {
                  var14.field_Wb = false;
                  var13 = var14;
                  var6 = var13;
                  var13.field_Vb = false;
                  if (var4Lifetime1 != 0) {
                    var14.field_gc = var4Lifetime1;
                    var14.field_Ub = QuickChatPhraseCache.field_a;
                  }
                  ArchiveRequest.insertLobbyGameInOrder(var14, 104);
                }
                return;
              }
              if (var2 != 14 &&
                var2 != 16) {
                if (var2 != 15 &&
                  var2 != 17) {
                  if (var2 == 18) {
                    var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong(255);
                    var23 = ((PacketBuffer) ((Object) var1)).readString((byte) 81);
                    var24 = ((PacketBuffer) ((Object) var1)).readString((byte) 81);
                    var7 = SecondaryNodeDequeIterator.findLobbyPlayer(-18701, var3_longLifetime2);
                    if (var7 == null) {
                      var7 = new LobbyPlayerEntry(var23, var24, var3_longLifetime2);
                      WidgetStyleLayer.field_g.put(var3_longLifetime2, var7, 108);
                      AccountWelcomePanel.field_N.field_jc = AccountWelcomePanel.field_N.field_jc + 1;
                    }
                    var7.field_Pb = ((PacketBuffer) ((Object) var1)).readUnsignedShort(127);
                    var8 = ((PacketBuffer) ((Object) var1)).readVarInt((byte) 120);
                    stackIn_77_0 = var7;
                    stackIn_78_1 = ((1 & var8) != 0);
                    stackIn_77_0.field_Tb = stackIn_78_1;
                    var7.field_Qb = var8 >> 1;
                    var7.field_dc = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -99);
                    var7.field_Ub = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -99);
                    ModelMergeHelpers.field_d.addLast(var7, false);
                    return;
                  }
                  if (19 == var2) {
                    var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong(param0 ^ -250);
                    var5Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -99);
                    var25 = SecondaryNodeDequeIterator.findLobbyPlayer(param0 - 18694, var3_longLifetime2);
                    if (var25 == null) {
                      return;
                    }
                    if (var5Lifetime1 != 0) {
                      var25.field_Xb = var5Lifetime1;
                      var25.field_Sb = QuickChatPhraseCache.field_a;
                    } else {
                      var25.unlink(false);
                    }
                    var25.unlinkSecondary(0);
                    AccountWelcomePanel.field_N.field_jc = AccountWelcomePanel.field_N.field_jc - 1;
                    return;
                  }
                  if (20 == var2) {
                    LruTextureCache.readGameEntry(false, true, AccountWelcomePanel.field_N, var1);
                    return;
                  }
                  if (var2 == 21) {
                    var3Lifetime5 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(param0 ^ -122);
                    if (var3Lifetime5 != 0) {
                      UrlFetchTask.field_f = ClockAndTextHelpers.monotonicMillis(0) + (long)var3Lifetime5;
                      return;
                    }
                    UrlFetchTask.field_f = 0L;
                    return;
                  }
                  if (var2 == 22) {
                    ContextMenu.field_Pb = ((PacketBuffer) ((Object) var1)).readUnsignedShort(127);
                    IntrusiveNode.field_l = ((PacketBuffer) ((Object) var1)).readVarInt((byte) 120);
                    return;
                  }
                  if (var2 == 23) {
                    IsaacCipher.field_c = ((PacketBuffer) ((Object) var1)).readLong(255);
                    return;
                  }
                  HotspotTextWidget.reportClientError(-126, (Throwable) null, "L1: " + PacketDiagnosticsHelpers.describeCurrentPacket(false));
                  SocialTabsPanel.closeGameSocket(false);
                  return;
                }
                var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong(255);
                var5Lifetime1Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -99);
                var22 = NameAvailabilityValidator.findSocialEntry(var3_longLifetime2, -26778);
                if (var22 == null) {
                  return;
                }
                if (15 == var2) {
                  var22.field_cc = false;
                } else {
                  if (var22.field_Kb) {
                    TextureCache.field_g = TextureCache.field_g - 1;
                    var22.field_Kb = false;
                  }
                }
                if (var5Lifetime1Lifetime1 != 0) {
                  var22.field_Sb = QuickChatPhraseCache.field_a;
                  var22.field_Xb = var5Lifetime1Lifetime1;
                }
                SpriteCheckboxPainter.insertLobbyGameInOrder((byte) -128, var22);
                return;
              }
              var3_longLifetime2Lifetime1 = ((PacketBuffer) ((Object) var1)).readLong(255);
              var21 = NameAvailabilityValidator.findSocialEntry(var3_longLifetime2Lifetime1, -26778);
              if (var21 != null) {
                if (var2 == 14) {
                  var21.field_cc = true;
                } else {
                  if (!var21.field_Kb) {
                    var21.field_Kb = true;
                    TextureCache.field_g = TextureCache.field_g + 1;
                  }
                }
                SpriteCheckboxPainter.insertLobbyGameInOrder((byte) 96, var21);
              }
              return;
            }
            var3Lifetime6 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(param0 ^ -122);
            var16_ref = (LobbyGame) (QuickChatCommandType.field_e.findByKey((long)var3Lifetime6, param0 ^ -8));
            var20 = var16_ref;
            if (var20 == null) {
              return;
            }
            if (var2 != 11) {
              var20.field_Wb = true;
            } else {
              var20.field_Vb = true;
            }
            ArchiveRequest.insertLobbyGameInOrder(var20, 107);
            return;
          }
          var3_ref_gdLifetime1 = (LobbyPlayerEntry) (ModelMergeHelpers.field_d.first(false));
          while (var3_ref_gdLifetime1 != null) {
            var3_ref_gdLifetime1.unlink(false);
            var3_ref_gdLifetime1.unlinkSecondary(0);
            var3_ref_gdLifetime1 = (LobbyPlayerEntry) (ModelMergeHelpers.field_d.next((byte) -70));
          }
          var3_ref_gdLifetime2 = (LobbyPlayerEntry) (QuickChatCommandType.field_a.firstInTraversal(108));
          while (var3_ref_gdLifetime2 != null) {
            if (var3_ref_gdLifetime2.field_cc ||
              var3_ref_gdLifetime2.field_Kb) {
              var3_ref_gdLifetime2.field_cc = false;
              if (var3_ref_gdLifetime2.field_Kb) {
                TextureCache.field_g = TextureCache.field_g - 1;
                var3_ref_gdLifetime2.field_Kb = false;
              }
              SpriteCheckboxPainter.insertLobbyGameInOrder((byte) 127, var3_ref_gdLifetime2);
            }
            var3_ref_gdLifetime2 = (LobbyPlayerEntry) (QuickChatCommandType.field_a.nextInTraversal(param0 ^ 6));
          }
          if (var2 == 1 &&
            null != AccountWelcomePanel.field_N) {
            ArchiveRequest.field_t = AccountWelcomePanel.field_N.field_ec;
          }
          if (var2 == 4) {
            var3Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(param0 + 134);
            AccountWelcomePanel.field_N = new LobbyGame(GameOptionControls.field_k);
            AccountWelcomePanel.field_N.setSecondaryKey((long)var3Lifetime1, 17260);
            LruTextureCache.readGameEntry(false, true, AccountWelcomePanel.field_N, var1);
            UrlFetchTask.field_f = 0L;
          } else {
            AccountWelcomePanel.field_N = null;
          }
          if (var2 != 2 &&
            var2 != 3) {
            GameKeyHandler.field_a = null;
          } else {
            if (GameKeyHandler.field_a == null) {
              GameKeyHandler.field_a = new LobbyGame(GameOptionControls.field_k);
            }
          }
          if (3 != var2) {
            FullscreenFocusCanvas.field_a = false;
            return;
          }
          FullscreenFocusCanvas.field_a = true;
          for (var3Lifetime2 = 0; PendingSubmission.field_o.length > var3Lifetime2; var3Lifetime2++) {
            PendingSubmission.field_o[var3Lifetime2] = ((PacketBuffer) ((Object) var1)).readSignedByte(param0 - 1772093430);
          }
          Js5ArchiveManager.field_c = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -99);
          QuickChatCategory.field_A = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -99);
          for (var3Lifetime3 = 0; StringPadHelpers.field_a.length > var3Lifetime3; var3Lifetime3++) {
            StringPadHelpers.field_a[var3Lifetime3] = ((PacketBuffer) ((Object) var1)).readSignedByte(-1772093437);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1_ref), "vf.B(" + param0 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 >= -37) {
          SocialListPacketHandler.handleSocialListPacket((byte) -19);
        }
        field_a = null;
    }

    static {
    }
}
