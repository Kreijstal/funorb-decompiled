/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class ArcanistsMulti extends GameApplet {
    static String field_H;
    static String field_F;
    public static boolean field_G;

    final static boolean isOfflineOrNotLoaded(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -45) {
            field_H = (String) null;
          }
          stackIn_10_0 = (MenuScreen.getSessionFlag((byte) 112)) || !(AccountFlowHelpers.field_c > 0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var1), "ArcanistsMulti.PA(" + param0 + ')');
        }
    }

    final void shutdownClient(byte obfuscationGuard) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 115 / ((obfuscationGuard + 83) / 41);
          AudioShutdownHelpers.shutdownAudioOutputs(8000);
          if (null != ProxySocketConnector.field_m) {
            HuffmanCodec.restoreWindowedMode(6);
          }
          FrameClock.reattachInput(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ArcanistsMulti.G(" + obfuscationGuard + ')');
        }
    }

    private final void openArchives(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != GradientPanelPainter.field_c) {
            TextTableInitializer.initializeTextTable(GradientPanelPainter.field_c, (byte) 22);
            GradientPanelPainter.field_c = null;
            Checkbox.resetTimers(2);
          }
          SceneListPanel.field_Fb = BufferedRandomAccessFile.openArchive(6, (byte) 62);
          BattleStartHelpers.field_d = BufferedRandomAccessFile.openArchive(1, (byte) 23);
          MenuInputState.field_k = BufferedRandomAccessFile.openArchive(7, (byte) 11);
          MeshModel.field_l = BufferedRandomAccessFile.openArchive(2, (byte) 55);
          DateInputWidget.field_E = BufferedRandomAccessFile.openArchive(3, (byte) 36);
          if (!param0) {
            this.loadResources(-126);
          }
          EmailValidator.field_s = BufferedRandomAccessFile.openArchive(4, (byte) 123);
          PasswordFieldPainter.field_x = BufferedRandomAccessFile.openArchive(5, (byte) 121);
          MusicVolumeHelpers.field_b = BufferedRandomAccessFile.openArchive(10, (byte) 6);
          PaletteSpriteHelpers.field_l = BufferedRandomAccessFile.openArchive(12, (byte) 49);
          GridContainer.field_K = BufferedRandomAccessFile.openArchive(13, (byte) 27);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ArcanistsMulti.LA(" + param0 + ')');
        }
    }

    final static void readUsernameParameter(java.applet.Applet param0, int param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param0.getParameter("username");
          if (null != var2 &&
            SectorCacheStore.encodeBase37((CharSequence) ((Object) var2), false) != 0L) {
            if (param1 != -1) {
              field_F = (String) null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("ArcanistsMulti.VA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final void releaseClientStatics(byte obfuscationGuard) {
        boolean discarded$0 = false;
        boolean stackIn_10_1 = false;
        boolean stackIn_11_2 = false;
        boolean stackIn_59_0 = false;
        boolean stackIn_99_0 = false;
        int stackIn_137_0 = 0;
        int stackIn_137_1 = 0;
        int stackIn_173_0 = 0;
        int stackIn_177_0 = 0;
        int[] stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        int stackIn_183_2 = 0;
        int stackIn_183_3 = 0;
        int stackIn_192_2 = 0;
        boolean[] stackIn_196_0 = null;
        int stackIn_196_1 = 0;
        boolean stackIn_197_2 = false;
        int stackIn_209_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_233_0 = 0;
        int stackIn_263_0 = 0;
        int stackIn_263_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        Object var2 = null;
        int[] var3_ref_int__ = null;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        int var8 = 0;
        int[][] var9 = null;
        int[][] var10 = null;
        int[] var11 = null;
        boolean[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        BattleScreen var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[] stackIn_183_0Lifetime1;
        int stackIn_183_1Lifetime1;
        int stackIn_183_2Lifetime1;
        int stackIn_183_3Lifetime1;
        int stackIn_209_0Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var8Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var4Lifetime2;
        var27 = field_G ? 1 : 0;
        try {
          SectorCacheStore.getTickCount(1497225488);
          MusicPatchPcmStream.field_o = LobbyLayoutHelpers.getFrameCounter(true);
          IntrusiveNodeHashTable.serviceAudio(200);
          if (null != ProxySocketConnector.field_m &&
            ProxySocketConnector.field_m.field_e) {
            HuffmanCodec.restoreWindowedMode(6);
          }
          stackIn_10_1 = true;
          stackIn_11_2 = (null != ProxySocketConnector.field_m);
          this.updateJs5Connection(stackIn_10_1, stackIn_11_2);
          EmailLoginCredentials.field_j = GameSelectionHelpers.field_m.field_m;
          EmailLoginCredentials.field_f = GameSelectionHelpers.field_m.field_e;
          ValidatedTextWidget.field_I = (EmailLoginCredentials.field_f - 640) / 2;
          QuickChatHelpers.field_a = (-480 + EmailLoginCredentials.field_j) / 2;
          if (ConfirmedNameValidator.field_y) {
            this.openArchives(true);
            ConfirmedNameValidator.field_y = false;
          }
          SpriteState.field_v = SpriteState.field_v + 1;
          if (IntrusiveDequeCursor.canShowAdvert(-15576)) {
            this.updateConnection(-107);
            if (IntrusiveDequeCursor.canShowAdvert(-15576)) {
              if (BattleStartHelpers.isReadyForLobby(123)) {
                discarded$0 = this.loadThemeAssets(123, false);
              }
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (BattleStartHelpers.field_e) {
            if (JaggrabDownloader.isLoginReady((byte) -52)) {
              if (!LoadingTracker.canSubmitDate(-1)) {
                if (SessionCookieHelpers.isPaused((byte) -5)) {
                  if (~IconHighlightPainter.field_c == ~IconHighlightPainter.field_a) {
                    var2_int = KeepAliveHelpers.processKeyEvents(-3);
                    if (1 == var2_int) {
                      if (CheckboxPainter.field_g == 0) {
                        RequestQueueHelpers.field_c = true;
                      }
                      Bzip2State.setLobbyMode(GameApplet.field_o, (byte) -98, 0);
                    }
                    this.processGameTick((byte) -89, true);
                    decompiledFrameRemainder0 = (var27 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    this.processGameTick((byte) -89, false);
                    decompiledFrameRemainder0 = (var27 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  this.processGameTick((byte) -89, false);
                  decompiledFrameRemainder0 = (var27 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_59_0 = (ProxySocketConnector.field_m != null);
                var2_intLifetime2 = ProxySocketConnector.pollLogin(stackIn_59_0, (byte) 22, (GameApplet) (this));
                if (2364824 != var2_intLifetime2) {
                  if (1 == var2_intLifetime2 ||
                    2 == var2_intLifetime2) {
                    if (ProxySocketConnector.field_m != null) {
                      HuffmanCodec.restoreWindowedMode(6);
                    }
                    if (2 == var2_intLifetime2) {
                      UsernameCredentials.openQuitPage((byte) 75, IconButtonPainter.getApplet(123));
                      if (var27 != 0) {
                        LobbyLayoutHelpers.noOperation(5623);
                      }
                    }
                  }
                } else {
                  LobbyLayoutHelpers.noOperation(5623);
                }
                this.processGameTick((byte) -89, true);
                if (var27 != 0) {
                  EditableTextWidget.pollOrbCoinData(0);
                  if (var27 != 0) {
                    RootInputHelpers.updateRootInputWrapper(-14296, SingleChildContainer.field_y);
                    if (this.loadThemeAssets(-109, true)) {
                      BattleStartHelpers.field_e = true;
                    }
                  }
                }
              }
            } else {
              EditableTextWidget.pollOrbCoinData(0);
              if (var27 != 0) {
                RootInputHelpers.updateRootInputWrapper(-14296, SingleChildContainer.field_y);
                if (this.loadThemeAssets(-109, true)) {
                  BattleStartHelpers.field_e = true;
                }
              }
            }
          } else {
            RootInputHelpers.updateRootInputWrapper(-14296, SingleChildContainer.field_y);
            if (this.loadThemeAssets(-109, true)) {
              BattleStartHelpers.field_e = true;
            }
          }
          if (!MenuScreen.getSessionFlag((byte) 112)) {
            do {
              var2 = (StatsRecord) (PaletteSpriteHelpers.field_h.removeFirst(true));
              if (null == var2) {
                if (var27 == 0) {
                  break;
                }
              } else {
                AlternateUsernameCredentials.queueStatsReport((StatsRecord) (var2), 118, 4);
              }
            } while (var27 == 0);
          }
          while (true) {
            stackIn_99_0 = ConnectionState.processLoginPackets((byte) 26, NodeHashTable.field_n);
            if (stackIn_99_0) {
              stackIn_263_0 = ~LoginMessageTable.field_g;
              stackIn_263_1 = -78;
              if (var27 == 0) {
                if (stackIn_263_0 == stackIn_263_1) {
                  NameValidator.field_s = true;
                  continue;
                }
                if (79 == LoginMessageTable.field_g) {
                  OptionToggleHelpers.field_b = UiContainer.field_z.readUnsignedByte((byte) 100);
                  EffectVolumeHelpers.field_a = UiContainer.field_z.readUnsignedByte((byte) 50);
                  continue;
                }
                if (LoginMessageTable.field_g == 9) {
                  ScreenTransitionHelpers.switchToRequestedScreen((byte) 80);
                  TextLayout.field_b = false;
                  MatchingFieldValidator.field_r = 9;
                  TextWidgetPainter.field_b = UiContainer.field_z.readString(-1);
                  continue;
                }
                if (LoginMessageTable.field_g == 14) {
                  ScreenTransitionHelpers.switchToRequestedScreen((byte) 80);
                  LobbyStateHelpers.initializeLobbyState(150, SceneScrollPane.getGameListContent((byte) -112), -13173, LoginMethod.getValidatorContent(1), NameSuggestionsPanel.field_E, PacketBuffer.getStatusContent((byte) -125), 1024, PaletteSpriteHelpers.nextPowerOfTwo(1000, 678231216), PaletteSpriteHelpers.nextPowerOfTwo(6, 678231216), ArchiveIndex.field_a.length);
                  DateHelpers.linkScenes(ViewportController.getListContent((byte) 115), 64, DiskCacheWorker.getContextScrollContent((byte) -122));
                  MatchingFieldValidator.field_r = -2;
                  PlayerInfoPanel.field_Ob = true;
                  TextLayout.field_b = false;
                  continue;
                }
                if (15 == LoginMessageTable.field_g) {
                  if (PlayerInfoPanel.field_Ob) {
                    ScreenTransitionHelpers.switchToRequestedScreen((byte) 80);
                    ServerMessage.closeOverlays(0);
                    BirthDateEntryPanel.clearChatHistory(true);
                    ViewControllerHelpers.field_a = false;
                    PlayerInfoPanel.field_Ob = false;
                    StatefulTextPainter.field_w = false;
                    DecimalCheckHelpers.field_h = true;
                    PlayerInfoPanel.field_Kb = true;
                    MusicCrossfadeStream.field_A = false;
                    MatchingFieldValidator.field_r = 0;
                    OptionToggleHelpers.resetChatFilter((byte) -50);
                  }
                  TextLayout.field_b = false;
                  IntrusiveDequeCursor.field_g = false;
                  continue;
                }
                if (LoginMessageTable.field_g == 10 &&
                  PlayerInfoPanel.field_Ob) {
                  HuffmanCodec.handleSocialListPacket((byte) -108);
                  continue;
                }
                if (73 == LoginMessageTable.field_g) {
                  var2_intLifetime1 = UiContainer.field_z.readUnsignedByte((byte) -122);
                  var3_ref_int__ = new int[var2_intLifetime1];
                  var4 = 0;
                  scanLoop1: while (true) {
                    stackIn_137_0 = var2_intLifetime1;
                    stackIn_137_1 = var4;
                    if (stackIn_137_0 > stackIn_137_1) {
                      var3_ref_int__[var4] = UiContainer.field_z.readInt(-10674);
                      var3_ref_int__[var4] = NameValidator.bitAnd(var3_ref_int__[var4], ~SpellbookCaptionGlobals.field_f[var4]);
                      stackIn_99_0 = ContextActionMenu.field_Jb;
                      if (stackIn_99_0) {
                        var5 = 0;
                        while (var5 < 32) {
                          var6 = 1 << var5;
                          stackIn_137_0 = -96;
                          stackIn_137_1 = ~(var5 + 32 * var4);
                          if (stackIn_137_0 < stackIn_137_1 &&
                            (var6 & var3_ref_int__[var4]) != 0) {
                            ThrowableFormatHelpers.field_a.addLast(new NoticeHelpers(32 * var4 + var5), -1);
                          }
                          var5++;
                        }
                      }
                      SpellbookCaptionGlobals.field_f[var4] = BitAndSpriteHelpers.bitOr(SpellbookCaptionGlobals.field_f[var4], var3_ref_int__[var4]);
                      var4++;
                      continue scanLoop1;
                    }
                    break;
                  }
                  continue;
                }
                if (LoginMessageTable.field_g == 74) {
                  if (!ThreeButtonPanel.hasMembership(true)) {
                    NodeHashTableIterator.field_j = UiContainer.field_z.readUnsignedShort(-98);
                    GameListSortHelpers.field_e = UiContainer.field_z.readLong(-943038560);
                    SpellbookCaptionGlobals.field_d = UiContainer.field_z.readUnsignedByte((byte) -100);
                  } else {
                    var2_intLifetime1 = UiContainer.field_z.readUnsignedShort(-98);
                    var3_long = UiContainer.field_z.readLong(-943038560);
                    SpellbookCaptionGlobals.field_d = UiContainer.field_z.readUnsignedByte((byte) 62);
                    if (var2_intLifetime1 > NodeHashTableIterator.field_j) {
                      NodeHashTableIterator.field_j = var2_intLifetime1;
                    }
                    GameListSortHelpers.field_e = GameListSortHelpers.field_e | var3_long;
                  }
                  GridContainer.field_P = FlagSumHelpers.sumFlaggedValues(false, GameListSortHelpers.field_e);
                  UrlHelpers.field_h = -1;
                  ScreenClearHelpers.field_a = true;
                  continue;
                }
                if (LoginMessageTable.field_g == 57 ||
                  LoginMessageTable.field_g == 58) {
                  ScreenTransitionHelpers.switchToRequestedScreen((byte) 80);
                  var2_intLifetime1 = UiContainer.field_z.readUnsignedByte((byte) -124);
                  var3 = UiContainer.field_z.readUnsignedByte((byte) -101);
                  stackIn_173_0 = (0 == UiContainer.field_z.readUnsignedByte((byte) 106)) ? 0 : 1;
                  var4Lifetime2 = stackIn_173_0;
                  stackIn_177_0 = (UiContainer.field_z.readUnsignedByte((byte) 111) == 0) ? 0 : 1;
                  var5Lifetime1 = stackIn_177_0;
                  var6Lifetime1 = UiContainer.field_z.readUnsignedShort(-98);
                  var7 = new String[UiContainer.field_z.readUnsignedByte((byte) 115)];
                  var8 = -2;
                  var8Lifetime1 = UiContainer.field_z.readByte(6);
                  var9 = new int[var7.length][18];
                  var10 = new int[var7.length][16];
                  var11 = new int[var7.length];
                  var12 = new boolean[var7.length];
                  var13 = 0;
                  var14 = 0;
                  while (var7.length > var14) {
                    var7[var14] = UiContainer.field_z.readVersionedString(-32461);
                    stackIn_209_0 = 0;
                    var15 = stackIn_209_0;
                    scanLoop2: while (true) {
                      if (var15 >= 18) {
                        while (true) {
                          var15 = 0;
                          while (var15 < 16) {
                            var16 = UiContainer.field_z.readUnsignedByte((byte) 109) & 255;
                            stackIn_183_0 = var10[var14];
                            stackIn_183_1 = var15;
                            stackIn_183_2 = -256;
                            stackIn_183_3 = ~var16;
                            if (stackIn_183_2 == stackIn_183_3) {
                              stackIn_192_2 = -1;
                            } else {
                              stackIn_192_2 = var16;
                            }
                            stackIn_183_0[stackIn_183_1] = stackIn_192_2;
                            var15++;
                          }
                          break scanLoop2;
                        }
                      }
                      stackIn_183_0Lifetime1 = var9[var14];
                      stackIn_183_1Lifetime1 = var15;
                      stackIn_183_2Lifetime1 = UiContainer.field_z.readUnsignedByte((byte) -88);
                      stackIn_183_3Lifetime1 = 255;
                      while (true) {
                        stackIn_183_0Lifetime1[stackIn_183_1Lifetime1] = NameValidator.bitAnd(stackIn_183_2Lifetime1, stackIn_183_3Lifetime1);
                        var15++;
                        continue scanLoop2;
                      }

                    }
                    var11[var14] = UiContainer.field_z.readUnsignedByte((byte) 76);
                    stackIn_196_0 = var12;
                    stackIn_196_1 = var14;
                    stackIn_197_2 = (UiContainer.field_z.readUnsignedByte((byte) 123) == 1);
                    stackIn_196_0[stackIn_196_1] = stackIn_197_2;
                    if (var12[var14] &&
                      0 == var10[var14][0] &&
                      var10[var14][11] == 11) {
                      var9[var14][12] = 28;
                      var9[var14][13] = 0;
                      var9[var14][14] = 29;
                      var9[var14][15] = 33;
                      var9[var14][16] = 47;
                      var9[var14][17] = 50;
                      var9[var14][0] = 204;
                      var9[var14][1] = 170;
                      var9[var14][2] = 238;
                      var9[var14][3] = 255;
                      var9[var14][4] = 192;
                      var9[var14][5] = 255;
                      var9[var14][6] = 32;
                      var9[var14][7] = 32;
                      var9[var14][8] = 32;
                      var9[var14][9] = 128;
                      var9[var14][10] = 64;
                      var9[var14][11] = 128;
                      var13 = 1;
                    }
                    var14++;
                  }
                  var14Lifetime1 = UiContainer.field_z.readInt(-10674);
                  stackIn_209_0Lifetime1 = UiContainer.field_z.readUnsignedByte((byte) -118);
                  var15Lifetime1 = stackIn_209_0Lifetime1;
                  stackIn_213_0 = ((var15Lifetime1 & 128) == 0) ? 0 : 1;
                  var16Lifetime1 = stackIn_213_0;
                  OverlayHelpers.field_b = null;
                  var15Lifetime1 = var15Lifetime1 & 127;
                  SpriteState.field_z = null;
                  System.gc();
                  var17 = new BattleScreen(true, var2_intLifetime1, var3, var4Lifetime2 != 0, var7, var8Lifetime1, var9, var10, var11, var14Lifetime1, var15Lifetime1, var5Lifetime1 != 0, var6Lifetime1, var12);
                  SpellProjectile.playMusic(DelegatingCanvas.field_c[var17.field_V.getArenaTheme(-31497) + 1], 3);
                  var17.renderBackgroundImage(413355681);
                  if (var13 != 0) {
                    var18 = SceneTabbedPanel.field_Tb.field_A.length;
                    var19 = 0;
                    while (var19 < var18) {
                      var20 = SceneTabbedPanel.field_Tb.field_A[var19];
                      var21 = (var20 & 16711680) >> 16;
                      var22 = var20 >> 8 & 255;
                      var23 = 255 & var20;
                      var24 = (var21 + var22) / 2;
                      var25 = (var23 + var21) / 2;
                      var26 = (var22 + var23) / 2;
                      SceneTabbedPanel.field_Tb.field_A[var19] = (var25 << 8) + ((var24 << 16) + var26);
                      var19++;
                    }
                  }
                  if (LoginMessageTable.field_g != 57) {
                    OverlayHelpers.field_b = var17;
                    StatefulTextPainter.field_w = true;
                  } else {
                    SpriteState.field_z = var17;
                    ViewControllerHelpers.field_a = true;
                    ChatLine.updateTurnCaptions(-3);
                    ArchiveIndex.updatePlayerCaptions((byte) 121);
                    ValidationHelpWidget.openDropTargetsTwice((byte) -53);
                  }
                  stackIn_233_0 = (var16Lifetime1 == 0) ? 5 : -1;
                  MatchingFieldValidator.field_r = stackIn_233_0;
                  MusicCrossfadeStream.field_A = true;
                  IntrusiveDequeCursor.field_g = false;
                  continue;
                }
                if (LoginMessageTable.field_g == 59) {
                  if (ViewControllerHelpers.field_a ||
                    StatefulTextPainter.field_w) {
                    ScreenTransitionHelpers.switchToRequestedScreen((byte) 80);
                    if (ViewControllerHelpers.field_a &&
                      SpriteState.field_z != null) {
                      SpriteState.field_z.returnToLobby(-112, false);
                    }
                    DecimalCheckHelpers.field_h = true;
                    ViewControllerHelpers.field_a = false;
                    StatefulTextPainter.field_w = false;
                    MusicCrossfadeStream.field_A = false;
                    MatchingFieldValidator.field_r = -2;
                    LobbyLayoutHelpers.field_d = true;
                    UiTheme.field_t = 0;
                    OptionToggleHelpers.resetChatFilter((byte) -50);
                  }
                  IntrusiveDequeCursor.field_g = false;
                  continue;
                }
                var2 = null;
                if (!ViewControllerHelpers.field_a) {
                  if (StatefulTextPainter.field_w) {
                    var2 = OverlayHelpers.field_b;
                  }
                } else {
                  var2 = SpriteState.field_z;
                }
                if (null != var2 &&
                  ((BattleScreen) (var2)).handleCurrentMessage((byte) -78)) {
                  continue;
                }
                this.dispatchServerMessage(-24);
                continue;
              }
            } else {
              stackIn_263_0 = -27;
              stackIn_263_1 = (0 - obfuscationGuard) / 36;
            }
            var2_intLifetime1 = stackIn_263_0 % stackIn_263_1;
            KeepAliveHelpers.sendKeepAlive(0, (byte) 121);
            if (-2 == CheckboxPainter.field_g) {
              LobbyLayoutHelpers.field_d = true;
            }
            if (LobbyLayoutHelpers.field_d) {
              UiTheme.field_t = 0;
            }
            if (ProxySocketConnector.canStartGame((byte) -44)) {
              var3Lifetime1 = this.attemptReconnect(118);
              if (var3Lifetime1 == 0 ||
                var3Lifetime1 == 1) {
                StatsSendHelpers.sendQueuedStats((byte) 127, 4);
                LobbyStateHelpers.refreshRequests((byte) -64, 6);
                GradientBarPainter.sendAllListRequests(7, 16);
                LoadingTask.field_b = false;
                if (UrlHelpers.field_h != -1) {
                  ByteStorage.sendOptionSelection(2, UrlHelpers.field_h);
                }
                RequestQueueHelpers.resetRequestQueue(true);
                if (var3Lifetime1 == 1) {
                  TextLayout.field_b = true;
                  IntrusiveDequeCursor.field_g = true;
                }
                if (var3Lifetime1 != 1 ||
                  var27 != 0) {
                  if (PlayerInfoPanel.field_Ob) {
                    MusicCrossfadeStream.field_A = false;
                    DecimalCheckHelpers.field_h = true;
                    PlayerInfoPanel.field_Kb = true;
                    if (ViewControllerHelpers.field_a) {
                      TextWidgetPainter.field_b = KeepAliveHelpers.field_e;
                      ScreenSwitchHelpers.switchScreen(false, true, 9, MatchingFieldValidator.field_r);
                      if (var27 != 0) {
                        ScreenSwitchHelpers.switchScreen(false, true, 0, MatchingFieldValidator.field_r);
                      }
                    } else {
                      ScreenSwitchHelpers.switchScreen(false, true, 0, MatchingFieldValidator.field_r);
                    }
                    ScreenTransitionHelpers.switchToRequestedScreen((byte) 80);
                    ArchiveProvider.field_f[CheckboxPainter.field_g].activateItem(false, 0, (byte) -123);
                    StatefulTextPainter.field_w = false;
                    PlayerInfoPanel.field_Ob = false;
                    ViewControllerHelpers.field_a = false;
                    OptionToggleHelpers.resetChatFilter((byte) -50);
                  }
                  IntrusiveDequeCursor.field_g = false;
                  TextLayout.field_b = false;
                }}
              var4Lifetime1 = 0;
              if (var3Lifetime1 == 2) {
                var4Lifetime1 = 1;
              }
              if (PlayerInfoPanel.field_Ob ||
                TextLayout.field_b ||
                IntrusiveDequeCursor.field_g) {
                var4Lifetime1 = 1;
              }
              if (!ProxySocketConnector.canStartGame((byte) -44)) {
                var4Lifetime1 = 0;
              }
              if (var4Lifetime1 != 0 &&
                null != CachedArchiveProvider.field_t) {
                AccountFlowHelpers.beginAccountFlow(ArchiveRequest.field_t, CachedArchiveProvider.field_t.field_o, 8, 8, ResizableViewResizeListener.field_h, CachedArchiveProvider.field_t, EmailLoginCredentials.field_f / 2, EmailLoginCredentials.field_j / 2, 2, CachedArchiveProvider.field_t.field_m + CachedArchiveProvider.field_t.field_o, -97);
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) (var2), "ArcanistsMulti.A(" + obfuscationGuard + ')');
        }
    }

    private final void registerSample(int param0, int param1, PcmSample param2, int[] param3, boolean param4, PcmSample[] param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param4) {
            field_H = (String) null;
          }
          param5[param1] = param2;
          param3[param1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("ArcanistsMulti.NA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final boolean loadThemeAssets(int param0, boolean param1) {
        int stackIn_188_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        IndexedSprite[] var4 = null;
        Sprite[][] var5 = null;
        Sprite[][] var6 = null;
        Sprite var7 = null;
        IndexedSprite[] var8 = null;
        int var9 = 0;
        Sprite var7Lifetime1;
        int var3_intLifetime1;
        var9 = field_G ? 1 : 0;
        try {
          if (SpriteFrame.field_c == null) {
            DropdownItemList.field_bb = (int)(Math.random() * 8.0);
            var3_int = DropdownItemList.field_bb;
            if (var3_int == 0) {
              SpriteFrame.field_c = "flame";
            }
            if (var3_int == 1) {
              SpriteFrame.field_c = "frost";
            }
            if (var3_int == 2) {
              SpriteFrame.field_c = "rock";
            }
            if (var3_int == 3) {
              SpriteFrame.field_c = "overlight";
            }
            if (var3_int == 4) {
              SpriteFrame.field_c = "storm";
            }
            if (var3_int == 5) {
              SpriteFrame.field_c = "underdark";
            }
            if (var3_int == 6) {
              SpriteFrame.field_c = "nature";
            }
            if (7 == var3_int) {
              SpriteFrame.field_c = "water";
            }
            if (var3_int == 8) {
              SpriteFrame.field_c = "clockwork";
            }
          }
          DropdownList.initializeCaptionTable((byte) -90);
          if (null != MeshModel.field_l) {
            if (LoadingTracker.field_a.ensureIndex(-10923) &&
              LoadingTracker.field_a.isGroupAvailableByName("basic", -24417)) {
              if (LoadingTracker.field_a.ensureIndex(-10923) &&
                LoadingTracker.field_a.isGroupAvailableByName("roman20", -24417)) {
                if (GameApplet.field_D.ensureIndex(-10923) &&
                  GameApplet.field_D.isGroupAvailableByName("roman20", -24417)) {
                  if (LoadingTracker.field_a.ensureIndex(-10923) &&
                    LoadingTracker.field_a.isGroupAvailableByName("lobby", -24417)) {
                    if (GameApplet.field_D.ensureIndex(-10923) &&
                      GameApplet.field_D.isGroupAvailableByName("lobby", -24417)) {
                      if (MeshModel.field_l.ensureIndex(-10923) &&
                        MeshModel.field_l.areAllGroupsAvailable(106)) {
                        if (DateInputWidget.field_E.ensureIndex(-10923) &&
                          DateInputWidget.field_E.areAllGroupsAvailable(-15)) {
                          if (EmailValidator.field_s.ensureIndex(-10923) &&
                            EmailValidator.field_s.areAllGroupsAvailable(125)) {
                            if (PasswordFieldPainter.field_x.ensureIndex(-10923) &&
                              PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_titlescreen", "") &&
                              PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_grassland", "")) {
                              if (BattleStartHelpers.field_d.ensureIndex(-10923) &&
                                BattleStartHelpers.field_d.isGroupAvailableByName("", -24417)) {
                                if (!BattleStartHelpers.field_d.isGroupAvailableByName(SpriteFrame.field_c, -24417)) {
                                  TimedMessage.setCaptionAndScale(UrlHelpers.formatArchiveProgress(17153, LoadingProgressDialog.field_nb, BattleStartHelpers.field_d, ValidationHelpWidget.field_Z, SpriteFrame.field_c), false, 40.0f);
                                  return false;
                                }
                                if (MenuInputState.field_k.ensureIndex(-10923) &&
                                  MenuInputState.field_k.areAllGroupsAvailable(109)) {
                                  if (SceneListPanel.field_Fb.ensureIndex(-10923) &&
                                    SceneListPanel.field_Fb.areAllGroupsAvailable(-33)) {
                                    if (GridContainer.field_K.ensureIndex(-10923) &&
                                      GridContainer.field_K.areAllGroupsAvailable(-121)) {
                                      PaddedContainer.finishLoadingDialog(0);
                                      TimedMessage.setCaptionAndScale(DisplayNameForm.field_N, false, 60.0f);
                                      this.updateClient((byte) -89);
                                      if (!param1) {
                                        return false;
                                      }
                                      AgeValidator.field_w = new SoundCache(MeshModel.field_l, DateInputWidget.field_E);
                                      MeshModel.field_l = null;
                                      DateInputWidget.field_E = null;
                                      Checkbox.resetTimers(2);
                                      return false;
                                    }
                                    TimedMessage.setCaptionAndScale(QueuedPacket.formatLoadingProgress(MenuButtonPainter.field_t, 74, GridContainer.field_K, NodeHashTable.field_c), false, 55.0f);
                                    return false;
                                  }
                                  TimedMessage.setCaptionAndScale(QueuedPacket.formatLoadingProgress(MenuButtonPainter.field_t, 115, SceneListPanel.field_Fb, NodeHashTable.field_c), false, 50.0f);
                                  return false;
                                }
                                TimedMessage.setCaptionAndScale(QueuedPacket.formatLoadingProgress(LoadingProgressDialog.field_nb, 113, MenuInputState.field_k, ValidationHelpWidget.field_Z), false, 45.0f);
                                return false;
                              }
                              TimedMessage.setCaptionAndScale(UrlHelpers.formatArchiveProgress(17153, LoadingProgressDialog.field_nb, BattleStartHelpers.field_d, ValidationHelpWidget.field_Z, ""), false, 35.0f);
                              return false;
                            }
                            TimedMessage.setCaptionAndScale(QueuedPacket.formatLoadingProgress(IconHighlightPainter.field_e, 96, PasswordFieldPainter.field_x, TextLayout.field_e), false, 32.0f);
                            return false;
                          }
                          TimedMessage.setCaptionAndScale(QueuedPacket.formatLoadingProgress(IconHighlightPainter.field_e, 76, EmailValidator.field_s, TextLayout.field_e), false, 29.0f);
                          return false;
                        }
                        TimedMessage.setCaptionAndScale(QueuedPacket.formatLoadingProgress(StatefulTextPainter.field_v, 76, DateInputWidget.field_E, GameListHelpers.field_a), false, 23.0f);
                        return false;
                      }
                      TimedMessage.setCaptionAndScale(QueuedPacket.formatLoadingProgress(StatefulTextPainter.field_v, 122, MeshModel.field_l, GameListHelpers.field_a), false, 20.0f);
                      return false;
                    }
                    TimedMessage.setCaptionAndScale(UrlHelpers.formatArchiveProgress(17153, DateHelpers.field_d, GameApplet.field_D, PaletteSpriteHelpers.field_a, "lobby"), false, 17.0f);
                    return false;
                  }
                  TimedMessage.setCaptionAndScale(UrlHelpers.formatArchiveProgress(17153, LoadingProgressDialog.field_nb, LoadingTracker.field_a, ValidationHelpWidget.field_Z, "lobby"), false, 14.0f);
                  return false;
                }
                TimedMessage.setCaptionAndScale(UrlHelpers.formatArchiveProgress(17153, DateHelpers.field_d, GameApplet.field_D, PaletteSpriteHelpers.field_a, "roman20"), false, 11.0f);
                return false;
              }
              TimedMessage.setCaptionAndScale(UrlHelpers.formatArchiveProgress(17153, LoadingProgressDialog.field_nb, LoadingTracker.field_a, ValidationHelpWidget.field_Z, "roman20"), false, 8.0f);
              return false;
            }
            TimedMessage.setCaptionAndScale(UrlHelpers.formatArchiveProgress(17153, LoadingProgressDialog.field_nb, LoadingTracker.field_a, ValidationHelpWidget.field_Z, "basic"), false, 5.0f);
            return false;
          }
          if (PasswordFieldPainter.field_x != null &&
            DelegatingCanvas.field_c == null) {
            TimedMessage.setCaptionAndScale(FadingModalPanel.field_J, false, 85.0f);
            this.updateClient((byte) -89);
            DelegatingCanvas.field_c = new MusicTrack[10];
            Checkbox.resetTimers(2);
            return false;
          }
          var3_intLifetime1 = -84 / ((14 - param0) / 56);
          if (null != MenuInputState.field_k) {
            if (MembershipOfferScreen.field_o == null) {
              TimedMessage.setCaptionAndScale(ViewControllerHelpers.field_c, false, 90.0f);
              this.updateClient((byte) -89);
              MembershipOfferScreen.field_o = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "funorblogo");
              IntrusiveDeque.field_b = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "newlogo");
              SupportPageHelpers.field_a = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "newlogostars");
              AudioAndCookieHelpers.field_d = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "newlogostars2");
              FadingModalPanel.field_I = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "arrowbuttonsmall");
              SceneWidgetNode.field_q = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "arrowbutton");
              NameCheckRequest.field_e = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "border_corner");
              PacketBuffer.field_l = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "border_bar_h");
              MusicPatchPcmStream.field_k = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "border_bar_v");
              QuickChatInputHelpers.field_a = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "charactericons", "", 55);
              TimedMessage.field_o = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "bonushats", "", 63);
              Checkbox.resetTimers(2);
              return false;
            }
            if (LoginPanel.field_M == null) {
              TimedMessage.setCaptionAndScale(ViewControllerHelpers.field_c, false, 91.0f);
              this.updateClient((byte) -89);
              PaddedContainer.field_H = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "menu_overlays", "", 41);
              LoginPanel.field_M = new IndexedSprite[9];
              QuickChatCategory.field_t = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "logo_arcanists");
              PaddedContainer.field_H[13].makeRasterTarget();
              IntrusiveDeque.field_b.field_x = -(IntrusiveDeque.field_b.field_n / 2) + 320;
              IntrusiveDeque.field_b.field_o = 16;
              GradientBarButton.drawCursor(491697968);
              SharedCaptionGlobals.field_b = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "frame2", "", 83);
              ScreenDisplayMode.field_f = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "gamespell");
              PendingTask.field_g = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "gamebars");
              EmailValidationHelpers.field_a = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "cldgame");
              TextTableInitializer.field_a = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "cldtr");
              MusicPatchNode.field_F = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "cldbl");
              ContextActionMenu.field_Ib = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "cldtl");
              BevelBoxPainter.field_a = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "cldbr");
              LoadingProgressDialog.field_mb = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "cldflat");
              PendingTask.field_o = BitAndSpriteHelpers.loadSprite("", -22612, BattleStartHelpers.field_d, "spell_book");
              Checkbox.resetTimers(2);
              return false;
            }
            if (null == DiskCacheRequest.field_E) {
              TimedMessage.setCaptionAndScale(ViewControllerHelpers.field_c, false, 92.0f);
              this.updateClient((byte) -89);
              DiskCacheRequest.field_E = new Sprite[15];
              var4_int = 0;
              do {
                if (var4_int >= 15) {
                  var4_int = 0;
                  break;
                }
                DiskCacheRequest.field_E[var4_int] = PaddedContainer.field_H[var4_int].copy();
                var4_int++;
              } while (var9 == 0);
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (15 <= var4_int))) {
                NanoFrameClock.renderThemeBackground(true, var4_int);
                stackIn_188_0 = 0;
                if (var9 == 0) {
                  if (stackIn_188_0 < var4_int &&
                    var4_int < 13) {
                    PaddedContainer.field_H[var4_int] = null;
                  }
                  var4_int++;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                DiskCacheRequest.field_E[0] = null;
                IntrusiveDeque.field_b = null;
                GameSelectionHelpers.field_m.makeRasterTarget(true);
                SceneTextInput.loadSceneSprites(BattleStartHelpers.field_d, (byte) -66);
                CachedArchiveProvider.field_t = LoadingTracker.loadBinaryFont(MenuInputState.field_k, -24755, "", "font", BattleStartHelpers.field_d);
                SpellProjectile.field_B = LoadingTracker.loadBinaryFont(MenuInputState.field_k, -24755, "", "smallfont", BattleStartHelpers.field_d);
                Checkbox.resetTimers(2);
                stackIn_188_0 = 0;
              }
              return stackIn_188_0 != 0;
            }
            if (DropdownItemList.field_ab == null) {
              TimedMessage.setCaptionAndScale(ViewControllerHelpers.field_c, false, 93.0f);
              this.updateClient((byte) -89);
              DropdownItemList.field_ab = IterableNodeHashTable.loadIndexedSpritesByName("", 0, "spellclasses", BattleStartHelpers.field_d);
              TextLine.field_b = BitAndSpriteHelpers.loadSprite("basic", -22612, LoadingTracker.field_a, "unachieved");
              IconHighlightPainter.field_d = BitAndSpriteHelpers.loadSprite("basic", -22612, LoadingTracker.field_a, "locked");
              NodeHashTable.field_d = BitAndSpriteHelpers.loadSprite("basic", -22612, LoadingTracker.field_a, "orbcoin");
              SceneWidget.field_kb = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "heads", "", 95);
              IsaacRandom.field_j = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "bodies", "", 67);
              DiskCacheRequest.field_u = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "phands", "", 58);
              QueuedPacket.field_i = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "mhands", "", 57);
              JaggrabDownloader.field_d = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "beards", "", 106);
              CachedArchiveProvider.field_A = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "hats", "", 124);
              NameErrorHelpers.field_a = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "mouths", "", 42);
              ModalPanelStack.field_I = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "pfeet", "", 58);
              GameListHelpers.field_b = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "mfeet", "", 113);
              Checkbox.resetTimers(2);
              return false;
            }
            if (null == SceneTabbedPanel.field_Pb) {
              TimedMessage.setCaptionAndScale(ViewControllerHelpers.field_c, false, 94.0f);
              this.updateClient((byte) -89);
              SceneTabbedPanel.field_Pb = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "conductororb", "", 60);
              SpriteDecodeHelpers.field_e = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "phylactery", "", 92);
              DualLinkNode.field_j = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "stonemonster", "", 64);
              MessageCaptionGlobals.field_g = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "frostsprite", "", 56);
              LoadingTracker.field_k = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "fungus", "", 102);
              ScreenTransitionHelpers.field_c = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "flamesprite", "", 69);
              PackedShortHelpers.field_a = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "watersprite", "", 58);
              KeyboardInputHandler.field_h = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "gaurdianangel", "", 69);
              LobbyRequestHelpers.field_a = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "clockwork", "", 93);
              ValueListWidget.field_J = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "aura", "", 124);
              ArrayWidgetContainer.field_E = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "clockworkaura", "", 75);
              ChatLine.field_c = IterableNodeHashTable.loadIndexedSpritesByName("", 0, "runes", BattleStartHelpers.field_d);
              WhirlpoolHasher.field_o = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "spellbooks", "", 93);
              Checkbox.resetTimers(2);
              return false;
            }
            if (null == UrlHelpers.field_i) {
              TimedMessage.setCaptionAndScale(ViewControllerHelpers.field_c, false, 95.0f);
              this.updateClient((byte) -89);
              LoginLoadingHelpers.field_g = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "spellicons", "", 75);
              UrlHelpers.field_i = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "frame", "", 51);
              UrlHelpers.field_i[1].field_n = UrlHelpers.field_i[1].field_q;
              UrlHelpers.field_i[4] = null;
              UrlHelpers.field_i[3].field_w = UrlHelpers.field_i[3].field_y;
              UrlHelpers.field_i[7].field_n = UrlHelpers.field_i[7].field_q;
              UrlHelpers.field_i[5].field_w = UrlHelpers.field_i[5].field_y;
              ResizableViewResizeListener.field_h = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "button_frame", "", 69);
              Checkbox.resetTimers(2);
              return false;
            }
            if (null == ArchiveRequest.field_t) {
              TimedMessage.setCaptionAndScale(ViewControllerHelpers.field_c, false, 96.0f);
              this.updateClient((byte) -89);
              ArchiveRequest.field_t = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "button_frame_r", "", 94);
              QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "button_frame_d", "", 44);
              IntrusiveNodeHashTable.field_a = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "achievements_large", "", 98);
              var4_int = 95;
              do {
                if (!(var4_int < IntrusiveNodeHashTable.field_a.length)) {
                  PointerOriginHelpers.field_e = new Sprite(32, 32);
                  PointerOriginHelpers.field_e.makeRasterTarget();
                  NodeHashTable.field_d.drawScaledAveraged(0, 0, 32, 32);
                  GameSelectionHelpers.field_m.makeRasterTarget(true);
                  Checkbox.resetTimers(2);
                  break;
                }
                IntrusiveNodeHashTable.field_a[var4_int] = null;
                var4_int++;
              } while (var9 == 0);
              return false;
            }
            if (MenuInputState.field_k != null) {
              TimedMessage.setCaptionAndScale(ViewControllerHelpers.field_c, false, 97.0f);
              this.updateClient((byte) -89);
              LoadingTracker.field_a.field_f = 0;
              GameApplet.field_D.field_f = 0;
              SingleChildContainer.setDefaultFont((byte) 111, LoadingTracker.loadBinaryFont(GameApplet.field_D, -24755, "lobby", "chatfont", LoadingTracker.field_a));
              LoadingTracker.field_a.field_f = 1;
              GameApplet.field_D.field_f = 1;
              var4 = IterableNodeHashTable.loadIndexedSpritesByName("", 0, "minibonushats", BattleStartHelpers.field_d);
              var5 = new Sprite[3][];
              var6 = new Sprite[3][];
              var5[0] = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "turntime_icons", "", 76);
              var5[1] = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "levelstyle_iconssmall", "", 56);
              var5[2] = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "team_iconssmall", "", 76);
              var6[0] = null;
              var6[1] = QueuedPacket.loadSpriteSheet(BattleStartHelpers.field_d, "levelstyle_icons", "", 121);
              var6[2] = null;
              var7 = var5[1][3];
              var5[1][3] = var5[1][2];
              var5[1][2] = var5[1][1];
              var5[1][1] = var5[1][0];
              var5[1][0] = var7;
              var7Lifetime1 = var6[1][3];
              var6[1][3] = var6[1][2];
              var6[1][2] = var6[1][1];
              var6[1][1] = var6[1][0];
              var6[1][0] = var7Lifetime1;
              TimedMessage.initializeGameAssetsFromBytes(NameSuggestionsPanel.field_E, GridContainer.field_K, var4, var5, true, DelegatingCanvas.field_d, WhirlpoolHasher.field_l, 6, GameApplet.field_D, (int[]) null, var6, BirthDateEntryPanel.field_O, (byte) -67, ArchiveIndex.field_a, 3, GameOptionType.field_a, LoadingTracker.field_a);
              GameListHelpers.resetChatHistory(200, (byte) -106);
              SessionCookieHelpers.field_a = MembershipGlobals.field_c;
              LinkButtonPainter.field_c = false;
              SceneTextInput.field_Hb = BattleResetHelpers.field_a;
              MessageDialog.setSoundArchives(-24539, LoadingTracker.field_a, GameApplet.field_D);
              GameApplet.field_D = null;
              MenuInputState.field_k = null;
              if (MenuScreen.getSessionFlag((byte) 112) ||
                !(0 < AccountFlowHelpers.field_c)) {
                var8 = IterableNodeHashTable.loadIndexedSpritesByName("", 0, "expansion_screens", BattleStartHelpers.field_d);
                SceneWidgetNode.field_s = new MembershipOfferScreen((java.applet.Applet) (this), SectorCacheStore.field_i, var8, SceneTextInput.field_Kb);
              }
              Checkbox.resetTimers(2);
              return false;
            }
          }
          if (SceneListPanel.field_Fb == null) {
            PacketBuffer.initializeScreens((byte) -98);
            return true;
          }
          MidiPcmStream.setHuffmanCodec(-92, new HuffmanCodec(SceneListPanel.field_Fb.getNamedFile("huffman", "", -1)));
          SceneListPanel.field_Fb = null;
          Checkbox.resetTimers(2);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "ArcanistsMulti.TA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void updateNoticeText(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = field_G ? 1 : 0;
        try {
          HuffmanCodec.field_k = false;
          if (param0 != 48) {
            ArcanistsMulti.releaseStatics((byte) -33);
          }
          MusicPatch.field_o = null;
          if (!MusicPatchPcmStream.field_s) {
            var1_int = PasswordCheckHelpers.field_j;
            if (var1_int > 0) {
              if (var1_int == 1) {
                MusicPatch.field_o = WrappedTextLayout.field_k;
              }
              if (var1_int != 1 ||
                var2 != 0) {
                MusicPatch.field_o = CachedArchiveProvider.formatTemplate(param0 ^ -80, new String[]{Integer.toString(var1_int)}, TooltipHelpers.field_g);
              }
              MusicPatch.field_o = GridContainer.joinText(new CharSequence[]{(CharSequence) ((Object) MusicPatch.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) IconTextSceneWidget.field_Hb)}, -93);
            }
            RawDataNode.field_k.dismiss(77);
            PatchEnvelopeSet.showLoadingDialog(0);
            if (var2 == 0) {
              return;
            }
          }
          RawDataNode.field_k.openMenu(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var1), "ArcanistsMulti.UA(" + param0 + ')');
        }
    }

    final static void openInfoPanel(int param0, int[] param1, SceneScrollPane param2, String param3, long param4, int param5, int param6, String param7, SceneWidget param8) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          PasswordCheckHelpers.field_h = param2;
          PackedShortHelpers.field_c = new PlayerActionMenu(param8, param4, param3, param7, param6, param5, param1);
          if (param0 != -26335) {
            ArcanistsMulti.isOfflineOrNotLoaded((byte) 116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ArcanistsMulti.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param8 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void releaseGameStatics(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ArcanistsMulti.releaseStatics((byte) -91);
          GameListHelpers.releaseStatics((byte) -60);
          NoticeHelpers.releaseStatics((byte) 92);
          IntrusiveDeque.releaseStatics(true);
          GameListSortHelpers.releaseStatics((byte) 44);
          LobbyBuilderHelpers.releaseStatics(0);
          ChatPanelHelpers.releaseStatics(30);
          SceneWidgetNode.releaseStatics(false);
          SceneWidget.releaseStatics(-21224);
          KeyboardInputHandler.releaseStatics(-733);
          QuickChatCaptionGlobals.releaseStatics(-97);
          OptionToggleHelpers.releaseStatics(1);
          ModalStackHelpers.releaseStatics(0);
          LobbyInputHelpers.releaseStatics((byte) -81);
          GameApplet.releaseStatics(true);
          ClientException.releaseStatics((byte) -46);
          GameAppletShell.releaseStatics(false);
          JaggrabDownloader.releaseStatics(66);
          MouseInputHandler.releaseStatics(-10338);
          MouseWheelHandler.releaseStatics(1);
          SoftwareRasterizer.releaseStatics();
          ResourceArchive.releaseStatics(false);
          BitmapFont.releaseStatics();
          TextTableInitializer.releaseStatics(35);
          PacketBuffer.releaseStatics(true);
          TimeAndInputHelpers.releaseStatics(-13019);
          DateHelpers.releaseStatics(64);
          LoginMethodHelpers.releaseStatics(1);
          QuickChatHelpers.releaseStatics((byte) -58);
          MusicVolumeHelpers.releaseStatics((byte) 85);
          Cp1252Helpers.releaseStatics(124);
          StatsSendHelpers.releaseStatics(-70);
          SessionCookieHelpers.releaseStatics(0);
          SpellbookCaptionGlobals.releaseStatics(96);
          ChatLine.releaseStatics(-25776);
          EffectVolumeHelpers.releaseStatics(-1);
          FlagSumHelpers.releaseStatics((byte) 115);
          FrameClock.releaseStatics((byte) -105);
          CanvasRasterBuffer.releaseStatics(false);
          LoadingTracker.releaseStatics(-1);
          FullscreenFocusCanvas.releaseStatics(115);
          ViewportController.releaseStatics(-18033);
          SoundCache.releaseStatics((byte) 59);
          MenuScreen.releaseStatics(true);
          BattleScreen.releaseStatics((byte) 95);
          EmailValidationHelpers.releaseStatics(0);
          SharedCaptionGlobals.releaseStatics((byte) -121);
          MembershipOfferScreen.releaseStatics(false);
          Js5Transport.releaseStatics(11959);
          DiskCacheWorker.releaseStatics(32336);
          Js5ArchiveManager.releaseStatics((byte) -90);
          BufferedRandomAccessFile.releaseStatics(-1);
          BufferedSocket.releaseStatics(11138);
          Battle.releaseStatics(0);
          IntrusiveNode.releaseStatics((byte) -115);
          LoginStackHelpers.releaseStatics((byte) 122);
          AngleHelpers.releaseStatics((byte) 107);
          MenuInputState.releaseStatics(param0);
          MidiPcmStream.releaseStatics((byte) 115);
          NodeHashTable.releaseStatics(13);
          MusicPatchNode.releaseStatics(true);
          MidiFileReader.releaseMessageTable();
          MusicPatchPcmStream.releaseStatics(!param0);
          AudioOutput.releaseStatics();
          MusicCrossfadeStream.releaseStatics(118);
          MessageCaptionGlobals.releaseStatics(0);
          SpriteFrame.releaseStatics(0);
          PendingMessageHelpers.releaseStatics(true);
          ScreenTransitionHelpers.releaseStatics(-15);
          ArchiveIndex.releaseStatics(0);
          GzipDecoder.releaseStatics(-79);
          ArchiveProvider.releaseStatics((byte) -51);
          BattleUnit.releaseStatics(false);
          ViewportSetupHelpers.releaseStatics(54);
          DualLinkNode.releaseStatics(49);
          SpellProjectile.releaseStatics(2);
          IntrusiveDequeCursor.releaseStatics(false);
          ViewControllerHelpers.releaseStatics((byte) 60);
          IsaacRandom.releaseStatics((byte) -109);
          VorbisSample.releaseStatics();
          VorbisFloor.releaseStatics();
          SynthInstrument.releaseStatics();
          AccountFlowHelpers.releaseStatics(false);
          OverlayHelpers.releaseStatics(8);
          GuardHelpers.releaseStatics(103);
          FadingModalPanel.releaseStatics((byte) 62);
          ModalPanelStack.releaseStatics(1);
          StatusDialog.releaseStatics((byte) 25);
          LoadingProgressDialog.releaseStatics(103);
          SocialDialog.releaseStatics((byte) -11);
          MainMenuDialog.releaseStatics(-29222);
          AccountRegistrationPanel.releaseStatics(10);
          ThreeButtonPanel.releaseStatics((byte) 115);
          LoginPanel.releaseStatics(-1);
          DisplayNameForm.releaseStatics((byte) 127);
          ConditionalTextValue.releaseStatics((byte) -60);
          UiTheme.releaseStatics(-60);
          StringReplaceHelpers.releaseStatics(!param0);
          TexturedSpriteHelpers.releaseStatics(false);
          PasswordCheckHelpers.releaseStatics(-5451);
          BattleStartHelpers.releaseStatics((byte) 62);
          SupportPageHelpers.releaseStatics(30586);
          IntensityTableHelpers.releaseStatics(-79);
          CredentialParseHelpers.releaseStatics((byte) 83);
          IconTextSceneWidget.releaseStatics(-10765);
          SceneScrollPane.releaseStatics(1);
          PairedSceneWidget.releaseStatics(93);
          SceneScrollbar.releaseStatics((byte) -120);
          ContextActionMenu.releaseStatics(0);
          SceneListPanel.releaseStatics(0);
          PlayerActionMenu.releaseStatics(-14);
          ChatInputWidget.releaseStatics((byte) 126);
          SocialListEntry.releaseStatics(param0);
          ChatPanel.releaseStatics((byte) 6);
          LobbyGameEntry.releaseStatics((byte) 120);
          SpriteState.releaseStatics(122);
          KeepAliveHelpers.releaseStatics(120);
          ColourBucketTable.releaseStatics(0);
          IntrusiveNodeHashTable.releaseStatics(0);
          DualLinkDeque.releaseStatics(-92);
          QuickChatInputHelpers.releaseStatics(73);
          LobbyLayoutHelpers.releaseStatics(0);
          AudioShutdownHelpers.releaseStatics(-1);
          IndexedSpriteState.releaseStatics((byte) -109);
          TutorialCaptionGlobals.releaseStatics(false);
          SpriteDecodeHelpers.releaseStatics((byte) -71);
          UrlHelpers.releaseStatics(-1);
          PriceCaptionGlobals.releaseStatics((byte) -42);
          DecimalCheckHelpers.releaseStatics((byte) 5);
          ScreenSwitchHelpers.releaseStatics(false);
          CredentialKind.releaseStatics(false);
          LoginCredentials.releaseStatics(0);
          CipherPacketBuffer.releaseStatics(21657);
          MusicAndClipHelpers.releaseStatics(-121);
          HuffmanCodec.releaseStatics(1);
          MouseStateHelpers.releaseStatics((byte) -75);
          IsaacCipher.releaseStatics(109);
          SpriteTrimHelpers.releaseStatics(0);
          BattleAction.releaseStatics(-117);
          BirthDateEntryPanel.releaseStatics((byte) 112);
          MessageDialog.releaseStatics(1);
          AccountCreationHelpers.releaseStatics(param0);
          ConfirmScene.releaseStatics(26820);
          LobbyStateHelpers.releaseStatics((byte) -99);
          AudioService.releaseStatics((byte) -94);
          ReflectionCheckRequest.releaseStatics(-791);
          BoundedRandomAccessFile.releaseStatics(255);
          FrameAndQuickChatHelpers.releaseStatics((byte) 46);
          CheckboxPainter.releaseStatics((byte) 36);
          StatefulTextPainter.releaseStatics((byte) -95);
          GradientBarPainter.releaseStatics(-56);
          ValueListPainter.releaseStatics(2);
          TextWidgetPainter.releaseStatics(63);
          UiComponent.releaseStatics((byte) -17);
          SingleChildContainer.releaseStatics(23123);
          TextLayout.releaseStatics(6481);
          OptionsDialog.releaseStatics(3);
          ScreenDisplayMode.releaseStatics(true);
          NameHelpers.releaseStatics(6);
          ResizableModalPanel.releaseStatics(false);
          DropdownList.releaseStatics(0);
          TextButton.releaseStatics(-125);
          GridContainer.releaseStatics(-1);
          UiContainer.releaseStatics(true);
          ArrayWidgetContainer.releaseStatics((byte) -90);
          LobbyRequestHelpers.releaseStatics((byte) -125);
          MembershipGlobals.releaseStatics((byte) 92);
          SocketJs5Transport.releaseStatics(-1);
          Js5NetworkRequest.releaseStatics((byte) 20);
          SectorCacheStore.releaseStatics((byte) -60);
          DiskCacheRequest.releaseStatics((byte) 78);
          CachedArchiveProvider.releaseStatics(107);
          BitHelpers.releaseStatics(0);
          ArchiveRequest.releaseStatics(2039583);
          ThrowableFormatHelpers.releaseStatics(67);
          MeshRasterState.releaseStatics();
          NineSliceHelpers.releaseStatics((byte) 15);
          MeshModel.releaseStatics(40);
          NameErrorHelpers.releaseStatics(120);
          StatusMessageHelpers.releaseStatics(-31399);
          LoginResultHelpers.releaseStatics((byte) 98);
          ResizableViewResizeListener.releaseStatics(0);
          FixedViewResizeListener.releaseStatics(0);
          GameDetailsRenderer.releaseStatics(-888);
          RequestQueueHelpers.releaseStatics((byte) -68);
          DelegatingCanvas.releaseStatics((byte) 87);
          PackedShortHelpers.releaseStatics(-14449);
          IntKeyLookup.releaseStatics(8577);
          ByteStorage.releaseStatics((byte) -79);
          Bzip2Decoder.releaseSharedState();
          Bzip2State.releaseStatics(4);
          LoginLoadingHelpers.releaseStatics((byte) -127);
          FinalFrameHelpers.releaseStatics(true);
          PaletteSpriteHelpers.releaseStatics((byte) -118);
          TooltipHelpers.releaseStatics(121);
          ScreenClearHelpers.releaseStatics((byte) 49);
          NameTextHelpers.releaseStatics((byte) 107);
          SceneTabbedPanel.releaseStatics(12);
          QuickChatCategoryCache.releaseStatics(0);
          QuickChatPhraseCache.releaseStatics((byte) -122);
          QuickChatCategory.releaseStatics(31908);
          QuickChatPhrase.releaseStatics(-1016755547);
          WeightedLruCache.releaseStatics(0);
          SocketConnector.releaseStatics(false);
          ClientIOException.releaseStatics((byte) 111);
          NanoFrameClock.releaseStatics(-80);
          ImageProducerRasterBuffer.releaseStatics((byte) -109);
          RawDataNode.releaseStatics(27494);
          RootInputHelpers.releaseStatics(!param0);
          TimedMessage.releaseStatics(37);
          CalendarHelpers.releaseStatics(120);
          WhirlpoolHasher.releaseStatics(-6566);
          MusicPatch.releaseStatics(param0);
          PatchEnvelopeSet.releaseStatics((byte) 94);
          AudioFilter.releaseStatics();
          LabeledField.releaseStatics(2);
          ValidatedTextWidget.releaseStatics(0);
          EditableTextWidget.releaseStatics(1);
          ContentTransitionDialog.releaseStatics(0);
          CapsuleBar.releaseStatics((byte) -127);
          NameSuggestionsPanel.releaseStatics(1313);
          TextHotspotWidget.releaseStatics(20445);
          ValidationStatusIcon.releaseStatics((byte) -125);
          ValidationHelpWidget.releaseStatics(15428);
          Checkbox.releaseStatics(0);
          TextFieldValidator.releaseStatics((byte) -114);
          DecodedSpriteHelpers.releaseStatics(28);
          TermsNoticePanel.releaseStatics(40);
          GradientBarButton.releaseStatics(-116);
          ValueListWidget.releaseStatics(param0);
          SceneTabStrip.releaseStatics((byte) -97);
          SceneTextInput.releaseStatics((byte) 77);
          CookieHelpers.releaseStatics(-1);
          DateOfBirthValidator.releaseStatics((byte) -79);
          NumericDateInputWidget.releaseStatics(0);
          NameCheckHelpers.releaseStatics((byte) -72);
          DateInputWidget.releaseStatics(42);
          ScrollContainer.releaseStatics(123);
          GrowableIntList.releaseStatics(-125);
          WrappedTextLayout.releaseStatics(0);
          DraggableWidget.releaseStatics(-114);
          DropTargetWidget.releaseStatics(-1764031359);
          ButtonMenuDialog.releaseStatics((byte) -46);
          DisplayNameChangedDialog.releaseStatics((byte) -108);
          PaddedContainer.releaseStatics(-5903);
          Scrollbar.releaseStatics((byte) 54);
          DirectByteStorage.releaseStatics(92);
          IterableNodeHashTable.releaseStatics(-14987);
          SecondaryNodeDeque.releaseStatics((byte) 33);
          CacheEntry.releaseStatics(63);
          GameOptionType.releaseStatics(20028);
          StrongCacheEntry.releaseStatics((byte) -102);
          ProxySocketConnector.releaseStatics(-1);
          AudioAndCookieHelpers.releaseStatics(false);
          NodeHashTableIterator.releaseStatics((byte) -120);
          SecondaryNodeDequeIterator.releaseStatics((byte) 88);
          SoundEffectVoice.releaseStatics(-1333592895);
          ListRequest.releaseStatics(30025);
          GameSelectionHelpers.releaseStatics(false);
          MenuButtonPainter.releaseStatics(2188450);
          LinkButtonPainter.releaseStatics(-9922);
          BevelTextPainter.releaseStatics(true);
          PasswordFieldPainter.releaseStatics((byte) 25);
          IconHighlightPainter.releaseStatics((byte) 106);
          AlphaContainer.releaseStatics(true);
          IconButtonPainter.releaseStatics((byte) 99);
          HighscoreEntry.releaseStatics(85);
          BitAndSpriteHelpers.releaseStatics(90);
          LoginMessageTable.releaseStatics(3);
          PlayerInfoPanel.releaseStatics((byte) -121);
          LoadingTask.releaseStatics(5);
          CameraFollowTarget.releaseStatics(-23971);
          BufferedMessage.releaseStatics(-1513388336);
          PendingTask.releaseStatics(32369);
          StatsRecord.releaseStatics(49);
          QueuedResponse.releaseStatics((byte) 126);
          PendingRequest.releaseStatics(-1);
          ClientRuntimeException.releaseStatics(83);
          BattleResetHelpers.releaseStatics(-62);
          ServerMessage.releaseStatics(0);
          NameCheckRequest.releaseStatics(400);
          ConnectionState.releaseStatics(false);
          QueuedPacket.releaseStatics(-100);
          MenuButtonPanel.releaseStatics((byte) 115);
          ClipState.releaseStatics(-69);
          NameRecord.releaseStatics(0);
          NameTable.releaseStatics((byte) -113);
          LoginMethod.releaseStatics((byte) -107);
          UsernameCredentials.releaseStatics((byte) -14);
          AlternateUsernameCredentials.releaseStatics((byte) 13);
          EmailLoginCredentials.releaseStatics((byte) -104);
          PointerOriginHelpers.releaseStatics((byte) 48);
          WidgetStyleLayer.releaseStatics(202);
          TextLine.releaseStatics(0);
          GradientPanelPainter.releaseStatics(121);
          EmptyPainter.releaseStatics((byte) 49);
          BevelBoxPainter.releaseStatics((byte) -122);
          CompoundButton.releaseStatics((byte) 114);
          DropdownItemList.releaseStatics(122);
          CommonUiHelpers.releaseStatics(false);
          ListEntryMenuHelpers.releaseStatics(32);
          NameValidator.releaseStatics(-1);
          PasswordValidator.releaseStatics(70);
          EmailValidator.releaseStatics((byte) 90);
          ConfirmedNameValidator.releaseStatics(0);
          AgeValidator.releaseStatics(15672);
          MatchingFieldValidator.releaseStatics((byte) -119);
          Crc32Helpers.releaseStatics(255);
          HotspotRegion.releaseStatics((byte) -76);
          ValidationState.releaseStatics((byte) 121);
          DebouncedValidator.releaseStatics(true);
          RasterSetupHelpers.releaseStatics((byte) 76);
          this.field_q = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ArcanistsMulti.N(" + param0 + ')');
        }
    }

    private final void processGameTick(byte param0, boolean param1) {
        int fieldTemp$0 = 0;
        boolean[] array$1 = null;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        boolean stackIn_152_0 = false;
        boolean[] stackIn_179_0 = null;
        boolean[] stackIn_179_1 = null;
        int stackIn_179_2 = 0;
        boolean stackIn_180_3;
        int stackIn_195_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_235_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        BattleScreen var5 = null;
        int var5_int = 0;
        int[][] var5_array = null;
        int var6_int = 0;
        int[][] var6 = null;
        int var7_int = 0;
        int[] var7 = null;
        boolean[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_195_0Lifetime1;
        int var5_intLifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        var13 = field_G ? 1 : 0;
        try {
          if (ButtonMenuDialog.hasActivePanel(false)) {
            param1 = true;
          }
          if (ThrowableFormatHelpers.field_a.first(12623) != null) {
            fieldTemp$0 = DirectByteStorage.field_h + 1;
            DirectByteStorage.field_h = DirectByteStorage.field_h + 1;
            if (fieldTemp$0 == 335) {
              DirectByteStorage.field_h = 0;
              ThrowableFormatHelpers.field_a.removeFirst(true);
            }
          }
          boolean decompiledFrameRemainder2 = true;
          if (~IconHighlightPainter.field_c != ~IconHighlightPainter.field_a) {
            if (StatusDialog.field_Vb != IconHighlightPainter.field_a) {
              if (IconHighlightPainter.field_a != ScrollContainer.field_I) {
                HuffmanCodec.field_i = HuffmanCodec.field_i - 1;
                decompiledFrameRemainder2 = (HuffmanCodec.field_i == 0);
                if (decompiledFrameRemainder2) {
                  IconHighlightPainter.field_a = IconHighlightPainter.field_c;
                  decompiledFrameRemainder2 = (var13 != 0);
                }
              }
              if (decompiledFrameRemainder2) {
                if (!MenuScreen.getSessionFlag((byte) 112)) {
                  MatchingFieldValidator.field_r = AccountCreationHelpers.field_b;
                  Js5NetworkRequest.setPaused(false);
                  if (ChatInputWidget.field_Cb) {
                    ChatInputWidget.field_Cb = false;
                    NameCheckRequest.drawFramedText(1, 10, 240, 16, SpellProjectile.field_B, 320, (byte) 40, SpellProjectile.field_B.field_o, false, ResizableViewResizeListener.field_h, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_o, ArchiveRequest.field_t);
                  }
                  if (RequestQueueHelpers.field_c) {
                    RequestQueueHelpers.field_c = false;
                    ScreenSwitchHelpers.switchScreen(false, true, -4, MatchingFieldValidator.field_r);
                  }
                  if (SceneTabbedPanel.isNonNegative(MatchingFieldValidator.field_r, 10)) {
                    ScreenTransitionHelpers.switchToRequestedScreen((byte) 80);
                  }
                }
                IconHighlightPainter.field_a = StatsSendHelpers.field_h;
                decompiledFrameRemainder2 = (var13 != 0);
              }
            }
            if (decompiledFrameRemainder2) {
              HuffmanCodec.field_i = HuffmanCodec.field_i + 1;
              decompiledFrameRemainder2 = (HuffmanCodec.field_i == 16);
              if (decompiledFrameRemainder2) {
                if (!ChatInputWidget.field_Cb) {
                  IntrusiveDeque.startReconnect((byte) 4);
                  if (var13 != 0) {
                    ConnectionState.startReconnect(3020);
                  }
                } else {
                  ConnectionState.startReconnect(3020);
                }
                IconHighlightPainter.field_a = ScrollContainer.field_I;
                decompiledFrameRemainder2 = (var13 != 0);
              }
            }
          }
          if (decompiledFrameRemainder2) {
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder1 = true;
            var3_int = 0;
            var4 = 0;
            if (!param1) {
              if (~CheckboxPainter.field_g != ~MatchingFieldValidator.field_r) {
                NameCheckRequest.field_c = NameCheckRequest.field_c + 1;
                decompiledFrameRemainder1 = (NameCheckRequest.field_c == 32);
                if (decompiledFrameRemainder1) {
                  ScreenTransitionHelpers.switchToRequestedScreen((byte) 80);
                  decompiledFrameRemainder1 = (var13 != 0);
                }
              }
              if (decompiledFrameRemainder1) {
                var5 = SpriteState.field_z;
                if (null == var5) {
                  var5 = OverlayHelpers.field_b;
                }
                if (-1 != CheckboxPainter.field_g) {
                  if (14 != CheckboxPainter.field_g &&
                    CheckboxPainter.field_g != 2 &&
                    CheckboxPainter.field_g != 4) {
                    if ((CheckboxPainter.field_g != -2) &&
                      (decompiledFrameRemainder1 = !(!SceneTabbedPanel.isNonNegative(CheckboxPainter.field_g, param0 ^ -83)))) {
                      ArchiveProvider.field_f[CheckboxPainter.field_g].update(91);
                      decompiledFrameRemainder1 = (var13 != 0);
                    }
                    if (decompiledFrameRemainder1) {
                      var3_int = 1;
                      decompiledFrameRemainder1 = (var13 != 0);
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    if (!var5.field_ab) {
                      var5.updateCamera(true, false);
                    }
                    ArchiveProvider.field_f[CheckboxPainter.field_g].update(param0 ^ -2);
                    decompiledFrameRemainder1 = (var13 != 0);
                  }
                }
                if (decompiledFrameRemainder1) {
                  if (PlayerInfoPanel.field_Ob) {
                    var4 = 1;
                    var3_int = 1;
                    decompiledFrameRemainder1 = (var13 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    if (!var5.field_ab) {
                      var5.updateCamera(true, true);
                    }
                    while (BevelTextPainter.pollKeyEvent(false)) {
                      var5.handleKeyboardShortcuts(1);
                      if (var13 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                    }
                  }
                }
              }
            }
            if ((decompiledFrameCompleted0) && (PlayerInfoPanel.field_Ob &&
              !TextLayout.field_b &&
              !IntrusiveDequeCursor.field_g)) {
              var5_int = var4;
              if (ViewControllerHelpers.field_a &&
                SocketJs5Transport.field_r) {
                var3_int = 0;
                var4 = 0;
              }
              LobbyRequestHelpers.updateLobbyRequests(var3_int != 0, 13);
              if (StatefulTextPainter.field_w) {
                OverlayHelpers.field_b.updateCamera(true, var4 != 0);
              }
              if (ViewControllerHelpers.field_a &&
                null != SpriteState.field_z) {
                StrongCacheEntry.measureLineTags((byte) -66, 320, 180, var5_int != 0);
                SpriteState.field_z.updateCamera(true, var4 != 0);
              }
              while (true) {
                if (BevelTextPainter.pollKeyEvent(false)) {
                  stackIn_152_0 = LobbyLayoutHelpers.field_d;
                  if (var13 == 0) {
                    boolean decompiledFrameRemainder0 = true;
                    if (stackIn_152_0) {
                      if ((ViewControllerHelpers.field_a) &&
                        (decompiledFrameRemainder0 = !(!DualLinkDeque.isMaskSet(12, 27, 15, 13)))) {
                        SpriteState.field_z.field_O = true;
                        continue;
                      }
                      if (decompiledFrameRemainder0) {
                        ContextActionMenu.handleEscapeForOverlays(15, 12, (byte) 32, 13);
                      }
                    }
                    if (StatefulTextPainter.field_w) {
                      OverlayHelpers.field_b.handleKeyboardShortcuts(1);
                    }
                    if (!ViewControllerHelpers.field_a) {
                      continue;
                    }
                    SpriteState.field_z.handleKeyboardShortcuts(param0 ^ -90);
                    continue;
                  }
                } else {
                  stackIn_152_0 = LobbyLayoutHelpers.field_d;
                }
                if (stackIn_152_0) {
                  break;
                }
                SocketJs5Transport.field_r = false;
                break;
              }
            }
            if (!PlayerInfoPanel.field_Ob) {
              ScreenTransitionHelpers.updateScrollAndTransition(-4);
            }
            if (!LobbyLayoutHelpers.field_d) {
              if (!(FixedViewResizeListener.field_b <= 0)) {
                FixedViewResizeListener.field_b = FixedViewResizeListener.field_b - 1;
                if ((var13 != 0) &&
                  (FixedViewResizeListener.field_b < DiskCacheRequest.field_F)) {
                  FixedViewResizeListener.field_b = FixedViewResizeListener.field_b + 1;
                }
              }
            } else {
              if (FixedViewResizeListener.field_b < DiskCacheRequest.field_F) {
                FixedViewResizeListener.field_b = FixedViewResizeListener.field_b + 1;
              }
            }
            var5_intLifetime1 = DiskCacheRequest.field_F * DiskCacheRequest.field_F;
            var6_int = -(FixedViewResizeListener.field_b * FixedViewResizeListener.field_b) + var5_intLifetime1;
            var7_int = EmailLoginCredentials.field_j - 120 + 120 * var6_int / var5_intLifetime1;
            LoadingTracker.setScrollTarget(var7_int, -30218);
          }
          if (MatchingFieldValidator.field_r == -3) {
            var3 = AccountFlowHelpers.field_b;
            if (var3 == null) {
              var3 = BufferedSocket.field_p;
            }
            var4_ref_String__ = new String[]{var3, ImageProducerRasterBuffer.field_n, HighscoreEntry.field_l, TextTableInitializer.field_c};
            var5_array = new int[6][18];
            var6 = new int[6][16];
            var7 = new int[]{SpellbookCaptionGlobals.field_d, 0, 0, 0, 0, 0};
            array$1 = new boolean[6];
            stackIn_179_0 = array$1;
            stackIn_179_1 = array$1;
            stackIn_179_2 = 0;
            stackIn_180_3 = !(MembershipGlobals.field_d < 2);
            stackIn_179_1[stackIn_179_2] = stackIn_180_3;
            stackIn_179_0[1] = false;
            stackIn_179_0[2] = false;
            stackIn_179_0[3] = false;
            stackIn_179_0[4] = false;
            stackIn_179_0[5] = false;
            var8 = stackIn_179_0;
            var9 = 0;
            scanLoop1: while (true) {
              if (var9 < 6) {
                var10 = 0;
                stackIn_212_0 = 0;
                if (var13 != 0) {
                  break scanLoop1;
                }
                var11 = stackIn_212_0;
                while (var11 < 4) {
                  stackIn_195_0 = 0;
                  var12 = stackIn_195_0;
                  while (var12 < 3) {
                    incrementValue$2 = var10;
                    var10++;
                    var5_array[var9][incrementValue$2] = QuickChatCategoryCache.field_d[var11][var12];
                    var12++;
                  }
                  var11++;
                }
                stackIn_195_0Lifetime1 = 0;
                var11Lifetime1 = stackIn_195_0Lifetime1;
                while (var11Lifetime1 < 6) {
                  incrementValue$3 = var10;
                  var10++;
                  var5_array[var9][incrementValue$3] = MenuInputState.field_c[var11Lifetime1];
                  var11Lifetime1++;
                }
                var11Lifetime2 = 0;
                while (var11Lifetime2 < 16) {
                  var6[var9][var11Lifetime2] = ThrowableFormatHelpers.field_f[var11Lifetime2];
                  var11Lifetime2++;
                }
                var9++;
                continue;
              }
              SpriteState.field_z = new BattleScreen(false, 0, 3, false, var4_ref_String__, 0, var5_array, var6, var7, 0, 0, false, 0, var8);
              ScreenSwitchHelpers.switchScreen(LoadingTask.field_d, true, 14, -1);
              stackIn_212_0 = 1;
              break;
            }
            MusicCrossfadeStream.field_A = stackIn_212_0 != 0;
          }
          if (param0 != -89) {
            ArcanistsMulti.releaseStatics((byte) 78);
          }
          if (-4 == MatchingFieldValidator.field_r) {
            if (DelegatingCanvas.field_c[0] == PendingRequest.field_g) {
              SpellProjectile.playMusic(DelegatingCanvas.field_c[0], param0 + 92);
            }
            StatusMessageHelpers.field_e.writeOpcode((byte) -59, 64);
            var3_int = 0;
            scanLoop2: while (true) {
              if (var3_int < 4) {
                stackIn_235_0 = 0;
                if (var13 != 0) {
                  break scanLoop2;
                }
                var4 = stackIn_235_0;
                while (var4 < 3) {
                  StatusMessageHelpers.field_e.writeByte(QuickChatCategoryCache.field_d[var3_int][var4], (byte) -60);
                  var4++;
                }
                var3_int++;
                continue;
              }
              stackIn_235_0 = 0;
              break;
            }
            var3_int = stackIn_235_0;
            do {
              if (var3_int >= 6) {
                var3_int = 0;
                break;
              }
              StatusMessageHelpers.field_e.writeByte(MenuInputState.field_c[var3_int], (byte) -81);
              var3_int++;
            } while (var13 == 0);
            do {
              if (var3_int >= 16) {
                StatusMessageHelpers.field_e.writeOpcode((byte) -127, 9);
                MatchingFieldValidator.field_r = CheckboxPainter.field_g;
                break;
              }
              StatusMessageHelpers.field_e.writeByte(ThrowableFormatHelpers.field_f[var3_int], (byte) -47);
              var3_int++;
            } while (var13 == 0);
            TextLayout.field_b = true;
          }
          if (MatchingFieldValidator.field_r == -5) {
            ViewportSetupHelpers.sendShortRequest(false, DirectByteStorage.field_f.getSortKey((byte) 72), 11);
            IntrusiveDequeCursor.field_g = true;
            MatchingFieldValidator.field_r = CheckboxPainter.field_g;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3_ref), "ArcanistsMulti.RA(" + param0 + ',' + param1 + ')');
        }
    }

    final void initializeClient(byte obfuscationGuard) {
        RuntimeException runtimeException = null;
        MidiPcmStream var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = field_G ? 1 : 0;
        try {
          this.initializeWindow(true, 14, 19, 0, 5000, 9, 11, 8);
          RasterSetupHelpers.field_f = false;
          SecondaryNodeDeque.defineMenuScreens((byte) -9);
          ScreenClearHelpers.field_a = false;
          UrlHelpers.field_h = -1;
          NodeHashTableIterator.field_j = 0;
          GridContainer.field_P = 0;
          QuickChatCategoryCache.field_a = false;
          GameListSortHelpers.field_e = 0L;
          LoadingTask.field_b = false;
          var2 = new MidiPcmStream();
          var2.selectChannelBank(128, 68, 9);
          UsernameCredentials.initializeAudioOutputs(22050, var2, DecimalCheckHelpers.field_d, (java.awt.Component) ((Object) LoginMessageTable.field_c), -22836, true);
          LoginStackHelpers.field_d = 16728128;
          PaddedContainer.field_I = 16777215;
          LoginMethod.field_a = 0;
          this.enableMessageGroups(false, true, false, true, true, (byte) -128, false);
          NodeHashTable.field_n[69] = 1;
          NodeHashTable.field_n[63] = 16;
          NodeHashTable.field_n[60] = 1;
          NodeHashTable.field_n[61] = 0;
          QuickChatCategoryCache.field_d[0] = AlternateUsernameCredentials.field_n[0];
          NodeHashTable.field_n[62] = 2;
          NodeHashTable.field_n[57] = -2;
          NodeHashTable.field_n[70] = 1;
          NodeHashTable.field_n[79] = 2;
          NodeHashTable.field_n[66] = 4;
          NodeHashTable.field_n[77] = 0;
          NodeHashTable.field_n[64] = 0;
          NodeHashTable.field_n[65] = 1;
          NodeHashTable.field_n[68] = 1;
          NodeHashTable.field_n[71] = 1;
          NodeHashTable.field_n[73] = -1;
          NodeHashTable.field_n[78] = 4;
          NodeHashTable.field_n[67] = 2;
          NodeHashTable.field_n[74] = 11;
          NodeHashTable.field_n[58] = -2;
          StatusMessageHelpers.field_a = new int[256];
          AccountCreationHelpers.field_g = new int[256];
          QuickChatCategoryCache.field_d[3] = ViewControllerHelpers.field_b[0];
          QuickChatCategoryCache.field_d[2] = IsaacCipher.field_d[0];
          var3 = -120 % ((-68 - obfuscationGuard) / 33);
          QuickChatCategoryCache.field_d[1] = GameApplet.field_z[0];
          var4 = 0;
          while (256 > var4) {
            StatusMessageHelpers.field_a[var4] = (var4 << 16) + var4;
            AccountCreationHelpers.field_g[var4] = (var4 << 16) - (-(var4 / 2 << 8) - var4 / 4);
            var4++;
            if (var5 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ArcanistsMulti.E(" + obfuscationGuard + ')');
        }
    }

    public final void init() {
        try {
          this.initializeGameApplet(EmailLoginCredentials.field_f, "arcanistsmulti", EmailLoginCredentials.field_j, (byte) -92, 15);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ArcanistsMulti.init()");
        }
    }

    final void updateClient(byte obfuscationGuard) {
        Object stackIn_5_0 = null;
        int stackIn_67_0 = 0;
        boolean stackIn_125_0 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        NoticeHelpers var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Sprite var15 = null;
        SceneWidget var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var12Lifetime1;
        int var4Lifetime3;
        int var5Lifetime2;
        var20 = field_G ? 1 : 0;
        try {
          if (null == ProxySocketConnector.field_m) {
            stackIn_5_0 = LoginMessageTable.field_c;
          } else {
            stackIn_5_0 = ProxySocketConnector.field_m;
          }
          var2 = stackIn_5_0;
          GameSelectionHelpers.field_m.makeRasterTarget(true);
          if (obfuscationGuard != -89) {
            ArcanistsMulti.openInfoPanel(66, (int[]) null, (SceneScrollPane) null, (String) null, 78L, -15, 110, (String) null, (SceneWidget) null);
          }
          if (IntrusiveDequeCursor.canShowAdvert(-15576)) {
            TextLayout.drawLoadingFrame((byte) 14, (java.awt.Canvas) (var2), MusicPatchPcmStream.isMusicAllowed(0));
            return;
          }
          if (!BattleStartHelpers.field_e) {
            ResourceArchive.presentFrame((java.awt.Canvas) (var2), (byte) -29);
            return;
          }
          if (!JaggrabDownloader.isLoginReady((byte) 87)) {
            TimedMessage.setCaptionAndScale(MenuButtonPainter.field_t, false, 100.0f);
            ResourceArchive.presentFrame((java.awt.Canvas) (var2), (byte) -62);
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          this.loadResources(obfuscationGuard + 15522);
          if (MatchingFieldValidator.field_r != CheckboxPainter.field_g) {
            if (-2 != CheckboxPainter.field_g &&
              MatchingFieldValidator.field_r != -2) {
              if (16 > NameCheckRequest.field_c) {
                KeyboardInputHandler.drawScreenBorder(-2, false, CheckboxPainter.field_g, GameListSortHelpers.field_b);
                SceneTabStrip.field_Fb = 256 * NameCheckRequest.field_c / 16;
                SoftwareRasterizer.fillRectangleAlpha(0, 0, EmailLoginCredentials.field_f, EmailLoginCredentials.field_j, 0, SceneTabStrip.field_Fb / 2);
                QuickChatPhraseCache.fillCircleMasked(256, (byte) 108, SceneTabStrip.field_Fb / 2, 0, EmailValidationHelpers.field_c);
                QuickChatPhraseCache.fillCircleMasked(256, (byte) 97, SceneTabStrip.field_Fb / 2, EmailLoginCredentials.field_f, EmailLoginCredentials.field_j - EmailValidationHelpers.field_c);
                decompiledFrameRemainder0 = (var20 != 0);
              }
              if (decompiledFrameRemainder0) {
                KeyboardInputHandler.drawScreenBorder(-2, false, MatchingFieldValidator.field_r, MusicCrossfadeStream.field_A);
                SceneTabStrip.field_Fb = (-(NameCheckRequest.field_c * 256) + 8192) / 16;
                QuickChatPhraseCache.fillCircleMasked(256, (byte) 86, SceneTabStrip.field_Fb, 0, EmailValidationHelpers.field_c);
                QuickChatPhraseCache.fillCircleMasked(256, (byte) 78, SceneTabStrip.field_Fb, EmailLoginCredentials.field_f, EmailLoginCredentials.field_j - EmailValidationHelpers.field_c);
                QuickChatPhraseCache.fillCircleMasked(256, (byte) 97, SceneTabStrip.field_Fb, EmailLoginCredentials.field_f / 2, EmailLoginCredentials.field_j / 2);
                decompiledFrameRemainder0 = (var20 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              if (16 <= NameCheckRequest.field_c) {
                KeyboardInputHandler.drawScreenBorder(-2, false, MatchingFieldValidator.field_r, MusicCrossfadeStream.field_A);
                SceneTabStrip.field_Fb = (8192 - 256 * NameCheckRequest.field_c) / 16;
                SoftwareRasterizer.fillRectangleAlpha(0, 0, EmailLoginCredentials.field_f, EmailLoginCredentials.field_j, 0, SceneTabStrip.field_Fb);
                if (var20 != 0) {
                  KeyboardInputHandler.drawScreenBorder(-2, false, CheckboxPainter.field_g, GameListSortHelpers.field_b);
                  SceneTabStrip.field_Fb = NameCheckRequest.field_c * 256 / 16;
                  SoftwareRasterizer.fillRectangleAlpha(0, 0, EmailLoginCredentials.field_f, EmailLoginCredentials.field_j, 0, SceneTabStrip.field_Fb);
                  KeyboardInputHandler.drawScreenBorder(-2, true, CheckboxPainter.field_g, GameListSortHelpers.field_b);
                }
              } else {
                KeyboardInputHandler.drawScreenBorder(-2, false, CheckboxPainter.field_g, GameListSortHelpers.field_b);
                SceneTabStrip.field_Fb = NameCheckRequest.field_c * 256 / 16;
                SoftwareRasterizer.fillRectangleAlpha(0, 0, EmailLoginCredentials.field_f, EmailLoginCredentials.field_j, 0, SceneTabStrip.field_Fb);
                if (var20 != 0) {
                  KeyboardInputHandler.drawScreenBorder(-2, true, CheckboxPainter.field_g, GameListSortHelpers.field_b);
                }
              }
            }
          } else {
            KeyboardInputHandler.drawScreenBorder(-2, true, CheckboxPainter.field_g, GameListSortHelpers.field_b);
          }
          if (-2 != CheckboxPainter.field_g &&
            -2 != MatchingFieldValidator.field_r) {
            NameSuggestionsPanel.drawFrameDecorations((byte) 99);
          }
          if (!GameListSortHelpers.field_b ||
            !MusicCrossfadeStream.field_A) {
            var3_int = DiskCacheRequest.field_F * DiskCacheRequest.field_F;
            var4 = -(FixedViewResizeListener.field_b * FixedViewResizeListener.field_b) + var3_int;
            var5 = -120 + (EmailLoginCredentials.field_j + 120 * var4 / var3_int);
            LoadingTracker.setScrollTarget(var5, -30218);
            SceneWidgetNode.drawLetterboxedLobby(ScreenSwitchHelpers.isAudioEnabled(29372), (byte) 119);
            if (CheckboxPainter.field_g == -2) {
              var3_intLifetime1 = (int)(Math.sin((double)SpriteState.field_v * 0.2) * 8.0);
              var4Lifetime3 = -(int)(Math.cos((double)SpriteState.field_v * 0.2) * 5.0);
              if (var4Lifetime3 > 0) {
                var4Lifetime3 = 0;
              }
              var5Lifetime2 = -var3_intLifetime1;
              var6 = (int)(Math.cos(0.2 * (double)SpriteState.field_v) * 5.0);
              if (var6 > 0) {
                var6 = 0;
              }
              var7 = (int)(Math.sin((double)SpriteState.field_v * 0.1) * 8.0) + 16;
              var8 = 0;
              var9 = -(int)(8.0 * Math.sin(-0.1 + (double)SpriteState.field_v * 0.1)) - 16;
              var10 = 0;
              var11 = (SpriteState.field_v >> 9) % 24;
              var12 = 32;
              var13 = 160;
              stackIn_67_0 = (MenuInputState.field_c[5] + MenuInputState.field_c[2] + (MenuInputState.field_c[0] + MenuInputState.field_c[1]) - (-MenuInputState.field_c[3] - MenuInputState.field_c[4]) != 0) ? 0 : 1;
              boolean decompiledFrameRemainder1 = true;
              var14 = stackIn_67_0;
              if (((SpriteState.field_v & 1024) > 0) &&
                (decompiledFrameRemainder1 = !((1023 & -SpriteState.field_v + 1024) < 512)) &&
                (decompiledFrameRemainder1 = (var14 != 0))) {
                var10 = 0;
                var6 = 0;
                var11 = (SpriteState.field_v >> 3) % 2;
                var3_intLifetime1 = 0;
                var5Lifetime2 = 0;
                var8 = 0;
                var9 = -16;
                var4Lifetime3 = 0;
                var7 = 16;
                decompiledFrameRemainder1 = (var20 != 0);
              }
              if ((decompiledFrameRemainder1) && ((1023 & SpriteState.field_v) >= 512 &&
                var14 != 0)) {
                var3_intLifetime1 = 0;
                var10 = 0;
                var9 = -16;
                var5Lifetime2 = 0;
                var11 = (SpriteState.field_v >> 3) % 2;
                var4Lifetime3 = 0;
                var7 = 16;
                var6 = 0;
                var8 = 0;
              }
              var15 = new Sprite(128, 256);
              var15.makeRasterTarget();
              TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var8 + var13, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 116, QuickChatCategoryCache.field_d[1], QueuedPacket.field_i[MenuInputState.field_c[3]], var12 + var7);
              TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var13 + var4Lifetime3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -87, QuickChatCategoryCache.field_d[1], GameListHelpers.field_b[0], var3_intLifetime1 + var12);
              TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var13, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 80, QuickChatCategoryCache.field_d[1], IsaacRandom.field_j[MenuInputState.field_c[0]], var12);
              var13 -= 8;
              var13 -= 16;
              TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var13, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -87, QuickChatCategoryCache.field_d[1], SceneWidget.field_kb[MenuInputState.field_c[1]], var12);
              var13 += 16;
              TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var13, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -90, QuickChatCategoryCache.field_d[1], JaggrabDownloader.field_d[MenuInputState.field_c[5]], var12);
              TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var13, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -117, QuickChatCategoryCache.field_d[1], NameErrorHelpers.field_a[var11], var12);
              var13 -= 16;
              TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var13, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -127, QuickChatCategoryCache.field_d[1], CachedArchiveProvider.field_A[MenuInputState.field_c[4]], var12);
              var13 += 8;
              var13 += 16;
              TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var6 + var13, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -113, QuickChatCategoryCache.field_d[1], ModalPanelStack.field_I[0], var12 + var5Lifetime2);
              TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var10 + var13, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 122, QuickChatCategoryCache.field_d[1], DiskCacheRequest.field_u[MenuInputState.field_c[2]], var9 + var12);
              GameSelectionHelpers.field_m.makeRasterTarget(true);
              var16 = Crc32Helpers.getActiveOverlayWidget(false);
              if (null != var16) {
                var17 = var16.field_V - 202;
                SoftwareRasterizer.setClip(4 + var16.field_V, var16.field_nb + 4, -4 + (var16.field_x + var16.field_V), var16.field_nb + (var16.field_I - 4));
                var18 = -480 + EmailLoginCredentials.field_j;
                if (MembershipGlobals.field_d < 2) {
                  var19 = var18 + 87;
                  if (0 >= (1024 & SpriteState.field_v)) {
                    var12Lifetime1 = 1023 & SpriteState.field_v;
                    if (512 > var12Lifetime1 ||
                      var14 == 0) {
                      var15.drawTransparent(var12Lifetime1 + var17, var19);
                    }
                    if (!(512 > var12Lifetime1) &&
                      var14 != 0 || var20 != 0) {
                      var12Lifetime1 = 512;
                      SoftwareRasterizer.fillRectangleAlpha(-4 + (-300 + var12Lifetime1) + var17, 78 + var13 + var18, 308, 64, 0, 192);
                      SpellProjectile.field_B.drawParagraph(MusicCrossfadeStream.field_x, var17 + (-300 + var12Lifetime1), var13 + (80 + var18), 300, 64, 16777215, -1, 1, 1, SpellProjectile.field_B.field_C);
                      var15.drawHorizontalFlip(var12Lifetime1 + var17, var19);
                      if (var20 != 0) {
                        var12Lifetime1 = -(1023 & SpriteState.field_v) + 1024;
                        if (var12Lifetime1 >= 512 &&
                          var14 != 0) {
                          var12Lifetime1 = 512;
                          SoftwareRasterizer.fillRectangleAlpha(var17 + var12Lifetime1 - 300 - 4, var18 + 78 + var13, 308, 64, 0, 192);
                          SpellProjectile.field_B.drawParagraph(MusicCrossfadeStream.field_x, var17 + var12Lifetime1 - 300, var18 + (var13 + 80), 300, 64, 16777215, -1, 1, 1, SpellProjectile.field_B.field_C);
                        }
                        var15.drawHorizontalFlip(var17 + var12Lifetime1, var19);
                      }
                    }} else {
                    var12Lifetime1 = -(1023 & SpriteState.field_v) + 1024;
                    if (var12Lifetime1 >= 512 &&
                      var14 != 0) {
                      var12Lifetime1 = 512;
                      SoftwareRasterizer.fillRectangleAlpha(var17 + var12Lifetime1 - 300 - 4, var18 + 78 + var13, 308, 64, 0, 192);
                      SpellProjectile.field_B.drawParagraph(MusicCrossfadeStream.field_x, var17 + var12Lifetime1 - 300, var18 + (var13 + 80), 300, 64, 16777215, -1, 1, 1, SpellProjectile.field_B.field_C);
                    }
                    var15.drawHorizontalFlip(var17 + var12Lifetime1, var19);
                  }
                  if (var20 != 0) {
                    var12Lifetime1 = 512;
                    SoftwareRasterizer.fillRectangleAlpha(var12Lifetime1 - (300 - var17), 78 + var13 + 20 + var18, 424, 64, 0, 128);
                    var19 = 16737792;
                    if ((SpriteState.field_v & 64) > 0) {
                      var19 = 16777215;
                    }
                    SpellProjectile.field_B.drawParagraph("If you are playing with super mod powers, remember that the 'Mark of Fame' achievement is meant to be a CHALLENGE. Do not create games of over 3 players if you are not competent at the game. Never play with more than 4 players as you CANNOT win! Kill Seas and Nature players at ALL costs. Most of all, good luck!", -300 + var12Lifetime1 + var17, 91 + var13 + var18, 424, 64, var19, -1, 1, 1, -2 + SpellProjectile.field_B.field_C);
                  }
                } else {
                  var12Lifetime1 = 512;
                  SoftwareRasterizer.fillRectangleAlpha(var12Lifetime1 - (300 - var17), 78 + var13 + 20 + var18, 424, 64, 0, 128);
                  var19 = 16737792;
                  if ((SpriteState.field_v & 64) > 0) {
                    var19 = 16777215;
                  }
                  SpellProjectile.field_B.drawParagraph("If you are playing with super mod powers, remember that the 'Mark of Fame' achievement is meant to be a CHALLENGE. Do not create games of over 3 players if you are not competent at the game. Never play with more than 4 players as you CANNOT win! Kill Seas and Nature players at ALL costs. Most of all, good luck!", -300 + var12Lifetime1 + var17, 91 + var13 + var18, 424, 64, var19, -1, 1, 1, -2 + SpellProjectile.field_B.field_C);
                }
              }
              SoftwareRasterizer.resetClip();
            }
            ClipState.drawDimmedScene(ScreenSwitchHelpers.isAudioEnabled(29372), 115);
            BattleScreen.drawOverlays(1, ScreenSwitchHelpers.isAudioEnabled(29372));
          }
          var3 = (NoticeHelpers) (ThrowableFormatHelpers.field_a.first(12623));
          if (var3 != null) {
            var5Lifetime1 = DirectByteStorage.field_h;
            if (80 <= var5Lifetime1) {
              if (230 <= var5Lifetime1) {
                var4Lifetime1 = -(var5Lifetime1 / 2) + 123;
                if (var20 != 0) {
                  var4Lifetime1 = 8;
                  var4Lifetime1 = -32 + var5Lifetime1 / 2;
                }
              } else {
                var4Lifetime1 = 8;
                if (var20 != 0) {
                  var4Lifetime1 = -32 + var5Lifetime1 / 2;
                }
              }
            } else {
              var4Lifetime1 = -32 + var5Lifetime1 / 2;
            }
            SoftwareRasterizer.drawRectangle(4, -4 + var4Lifetime1, CachedArchiveProvider.field_t.textWidth(TimedMessage.field_n[var3.field_n]) + 56, 40, 0);
            SoftwareRasterizer.drawRectangle(5, var4Lifetime1 - 3, 54 + CachedArchiveProvider.field_t.textWidth(TimedMessage.field_n[var3.field_n]), 38, 16741888);
            SoftwareRasterizer.drawRectangle(6, var4Lifetime1 - 2, CachedArchiveProvider.field_t.textWidth(TimedMessage.field_n[var3.field_n]) + 52, 36, 0);
            IntrusiveNodeHashTable.field_a[var3.field_n].drawScaled(8, var4Lifetime1, 32, 32);
            CachedArchiveProvider.field_t.drawText(TimedMessage.field_n[var3.field_n], 47, CachedArchiveProvider.field_t.field_C + var4Lifetime1, 0, 0);
            CachedArchiveProvider.field_t.drawText(TimedMessage.field_n[var3.field_n], 48, -1 + (var4Lifetime1 + CachedArchiveProvider.field_t.field_C), 0, 0);
            CachedArchiveProvider.field_t.drawText(TimedMessage.field_n[var3.field_n], 48, CachedArchiveProvider.field_t.field_C + var4Lifetime1, 16746496, -1);
          }
          boolean decompiledSharedTail0 = !(LoadingTracker.canSubmitDate(obfuscationGuard ^ 88));
          if (!decompiledSharedTail0) {
            if (null != ProxySocketConnector.field_m) {
              stackIn_125_0 = true;
            } else {
              stackIn_125_0 = StatusDialog.field_Pb;
            }
            LabeledField.clearOrDimScreen(stackIn_125_0, 4474111);
            decompiledSharedTail0 = (var20 != 0);
          }
          if ((decompiledSharedTail0) &&
            (SessionCookieHelpers.isPaused((byte) -5))) {
            SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.field_e, SoftwareRasterizer.field_j);
            EmptyPainter.setFrameSprites(SharedCaptionGlobals.field_b, SharedCaptionGlobals.field_b[0].field_y, -117, SharedCaptionGlobals.field_b[0].field_q);
          }
          if (IconHighlightPainter.field_c != IconHighlightPainter.field_a) {
            var4Lifetime2 = HuffmanCodec.field_i * 256 / 16;
            if (var4Lifetime2 > 0) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_e, SoftwareRasterizer.field_j, 0, var4Lifetime2);
            }
          }
          Scrollbar.drawLoadingOverlay(91);
          OptionsDialog.paintCanvasNow((java.awt.Canvas) (var2), (byte) -126, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2_ref), "ArcanistsMulti.L(" + obfuscationGuard + ')');
        }
    }

    final static void loadLogoModels(ResourceArchive param0, byte param1) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        MeshModel var5 = null;
        int[] var6 = null;
        int var7 = 0;
        var7 = field_G ? 1 : 0;
        try {
          var2 = new CipherPacketBuffer(param0.getNamedFile("", "logo.fo3d", -1));
          var3 = var2.readUnsignedByte((byte) -121);
          var2.beginBitAccess(param1 + 166);
          PriceCaptionGlobals.field_e = Scrollbar.readPackedEntries((byte) -101, var2);
          QuickChatPhraseCache.field_g = new int[var3][];
          QuickChatCategory.field_u = new MeshModel[var3];
          var4 = 0;
          do {
            if (var3 <= var4) {
              var2.endBitAccess(param1 + 80);
              break;
            }
            QuickChatCategory.field_u[var4] = EditableTextWidget.decodeMeshModel(true, var2);
            var4++;
          } while (var7 == 0);
          var4 = 0;
          while (var3 > var4) {
            var5 = QuickChatCategory.field_u[var4];
            var5.scale(6, 0, 1, 6, 6);
            var5.computeBounds((byte) 62);
            var6 = new int[]{var5.field_k + var5.field_i >> 1, var5.field_v + var5.field_R >> 1, var5.field_N + var5.field_P >> 1};
            QuickChatPhraseCache.field_g[var4] = var6;
            var5.translate(-var6[1], (byte) -124, -var6[2], -var6[0]);
            var4++;
            if (var7 != 0) {
              return;
            }
          }
          if (param1 != -80) {
            field_H = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("ArcanistsMulti.WA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    public ArcanistsMulti() {
    }

    final static void drawScreenFrame(int param0, byte param1) {
        try {
          int var2_int = 84 % ((param1 - 57) / 54);
          NineSliceHelpers.drawNineSliceFrame(28 + ValidationHelpWidget.field_U[param0] * NumericDateInputWidget.field_L[param0].length, -8 + GameDetailsRenderer.field_e[param0], -27327, 14 - (-PackedShortHelpers.field_b[param0] + GameDetailsRenderer.field_e[param0]), SharedCaptionGlobals.field_b, DualLinkDeque.field_f[param0] - 16);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ArcanistsMulti.OA(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        try {
          field_H = null;
          field_F = null;
          if (param0 != -91) {
            ArcanistsMulti.updateNoticeText((byte) 24);
          }
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ArcanistsMulti.MA(" + param0 + ')');
        }
    }

    private final void loadResources(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = field_G ? 1 : 0;
        try {
          if (param0 != 15433) {
            field_F = (String) null;
          }
          if (0 == BitHelpers.field_c) {
            RequestQueueHelpers.field_e = DebouncedValidator.field_a;
            if (null == DelegatingCanvas.field_c[0] &&
              PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_titlescreen", "")) {
              DelegatingCanvas.field_c[0] = MusicTrack.loadNamed(PasswordFieldPainter.field_x, "", "arcanists_titlescreen");
              BitHelpers.field_c = 1;
              GrowableIntList.field_h.prepareTrack(0, AgeValidator.field_w, EmailValidator.field_s, DelegatingCanvas.field_c[0], -123);
              SpellProjectile.playMusic(DelegatingCanvas.field_c[0], 3);
            }
            return;
          }
          if (SingleChildContainer.field_C < 52) {
            if (SingleChildContainer.field_C != 0 ||
              !BattleStartHelpers.field_d.isNamedFileAvailable(true, "imp", "streamed")) {
              if (SingleChildContainer.field_C == 1 &&
                BattleStartHelpers.field_d.isNamedFileAvailable(true, "arcaneexplosion", "streamed")) {
                BirthDateEntryPanel.field_N = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 ^ 15433, "arcaneexplosion", BattleStartHelpers.field_d);
                SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                if (var3 == 0) {
                  return;
                }
              }
              if (SingleChildContainer.field_C == 2 &&
                BattleStartHelpers.field_d.isNamedFileAvailable(true, "flameexplosion", "streamed")) {
                DisplayNameForm.field_E = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "flameexplosion", BattleStartHelpers.field_d);
                SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                if (var3 == 0) {
                  return;
                }
              }
              if (SingleChildContainer.field_C != 3 ||
                !BattleStartHelpers.field_d.isNamedFileAvailable(true, "smokeexplosion", "streamed")) {
                if (SingleChildContainer.field_C == 4 &&
                  BattleStartHelpers.field_d.isNamedFileAvailable(true, "flamepuff", "streamed")) {
                  DebouncedValidator.field_b = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 - 15433, "flamepuff", BattleStartHelpers.field_d);
                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                  if (var3 == 0) {
                    return;
                  }
                }
                if (SingleChildContainer.field_C == 5 &&
                  BattleStartHelpers.field_d.isNamedFileAvailable(true, "smokepuff", "streamed")) {
                  FadingModalPanel.field_M = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "smokepuff", BattleStartHelpers.field_d);
                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                  if (var3 == 0) {
                    return;
                  }
                }
                if (SingleChildContainer.field_C != 6 ||
                  !BattleStartHelpers.field_d.isNamedFileAvailable(true, "stormpuff", "streamed")) {
                  if (SingleChildContainer.field_C == 7 &&
                    BattleStartHelpers.field_d.isNamedFileAvailable(true, "stormexplosion", "streamed")) {
                    HuffmanCodec.field_j = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 - 15433, "stormexplosion", BattleStartHelpers.field_d);
                    SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                    if (var3 == 0) {
                      return;
                    }
                  }
                  if (SingleChildContainer.field_C == 8 &&
                    BattleStartHelpers.field_d.isNamedFileAvailable(true, "cyclopstest", "streamed")) {
                    SecondaryNodeDeque.field_c = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "cyclopstest", BattleStartHelpers.field_d);
                    SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                    if (var3 == 0) {
                      return;
                    }
                  }
                  if (SingleChildContainer.field_C != 9 ||
                    !BattleStartHelpers.field_d.isNamedFileAvailable(true, "sylph", "streamed")) {
                    if (SingleChildContainer.field_C == 10 &&
                      BattleStartHelpers.field_d.isNamedFileAvailable(true, "frostgiant", "streamed")) {
                      DiskCacheRequest.field_v = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "frostgiant", BattleStartHelpers.field_d);
                      SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                      RequestQueueHelpers.field_e = MouseStateHelpers.field_f;
                      if (var3 == 0) {
                        return;
                      }
                    }
                    if (SingleChildContainer.field_C != 11 ||
                      !BattleStartHelpers.field_d.isNamedFileAvailable(true, "dwarf", "streamed")) {
                      if (12 != SingleChildContainer.field_C ||
                        !BattleStartHelpers.field_d.isNamedFileAvailable(true, "clockworkrecallsoldier", "streamed")) {
                        if (SingleChildContainer.field_C != 13 ||
                          !BattleStartHelpers.field_d.isNamedFileAvailable(true, "golem", "streamed")) {
                          if (SingleChildContainer.field_C != 14 ||
                            !BattleStartHelpers.field_d.isNamedFileAvailable(true, "flamedragon", "streamed")) {
                            if (15 != SingleChildContainer.field_C ||
                              !BattleStartHelpers.field_d.isNamedFileAvailable(true, "frostdragon", "streamed")) {
                              if (SingleChildContainer.field_C == 16 &&
                                BattleStartHelpers.field_d.isNamedFileAvailable(true, "stormdragon", "streamed")) {
                                ArchiveIndex.field_m = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "stormdragon", BattleStartHelpers.field_d);
                                SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                if (var3 == 0) {
                                  return;
                                }
                              }
                              if (SingleChildContainer.field_C != 17 ||
                                !BattleStartHelpers.field_d.isNamedFileAvailable(true, "zombiedragon", "streamed")) {
                                if (SingleChildContainer.field_C == 18 &&
                                  BattleStartHelpers.field_d.isNamedFileAvailable(true, "clockworkdragon", "streamed")) {
                                  StatsSendHelpers.field_e = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "clockworkdragon", BattleStartHelpers.field_d);
                                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                if (SingleChildContainer.field_C != 19 ||
                                  !BattleStartHelpers.field_d.isNamedFileAvailable(true, "brinegoblin", "streamed")) {
                                  if (20 != SingleChildContainer.field_C ||
                                    !BattleStartHelpers.field_d.isNamedFileAvailable(true, "ent", "streamed")) {
                                    if (SingleChildContainer.field_C != 21 ||
                                      !BattleStartHelpers.field_d.isNamedFileAvailable(true, "elf", "streamed")) {
                                      if (SingleChildContainer.field_C != 22 ||
                                        !BattleStartHelpers.field_d.isNamedFileAvailable(true, "monkey", "streamed")) {
                                        if (SingleChildContainer.field_C != 23 ||
                                          !BattleStartHelpers.field_d.isNamedFileAvailable(true, "darkknight", "streamed")) {
                                          if (SingleChildContainer.field_C == 24 &&
                                            BattleStartHelpers.field_d.isNamedFileAvailable(true, "wraith", "streamed")) {
                                            EmailValidationHelpers.field_d = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "wraith", BattleStartHelpers.field_d);
                                            SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                            if (var3 == 0) {
                                              return;
                                            }
                                          }
                                          if (SingleChildContainer.field_C != 25 ||
                                            !BattleStartHelpers.field_d.isNamedFileAvailable(true, "swarm", "streamed")) {
                                            if (26 != SingleChildContainer.field_C ||
                                              !BattleStartHelpers.field_d.isNamedFileAvailable(true, "pixies", "streamed")) {
                                              if (27 == SingleChildContainer.field_C &&
                                                BattleStartHelpers.field_d.isNamedFileAvailable(true, "paladin", "streamed")) {
                                                TimeAndInputHelpers.field_d = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "paladin", BattleStartHelpers.field_d);
                                                SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                if (var3 == 0) {
                                                  return;
                                                }
                                              }
                                              if (SingleChildContainer.field_C != 28 ||
                                                !BattleStartHelpers.field_d.isNamedFileAvailable(true, "pegasus", "streamed")) {
                                                if (29 == SingleChildContainer.field_C &&
                                                  BattleStartHelpers.field_d.isNamedFileAvailable(true, "phoenix", "streamed")) {
                                                  SoundCache.field_m = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 - 15433, "phoenix", BattleStartHelpers.field_d);
                                                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                  if (var3 == 0) {
                                                    return;
                                                  }
                                                }
                                                if (SingleChildContainer.field_C != 30 ||
                                                  !BattleStartHelpers.field_d.isNamedFileAvailable(true, "watertroll", "streamed")) {
                                                  if (SingleChildContainer.field_C == 31 &&
                                                    BattleStartHelpers.field_d.isNamedFileAvailable(true, "freshwatertroll", "streamed")) {
                                                    ChatPanelHelpers.field_a = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "freshwatertroll", BattleStartHelpers.field_d);
                                                    SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                    if (var3 == 0) {
                                                      return;
                                                    }
                                                  }
                                                  if (SingleChildContainer.field_C == 32 &&
                                                    BattleStartHelpers.field_d.isNamedFileAvailable(true, "hardwatertroll", "streamed")) {
                                                    MouseStateHelpers.field_g = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "hardwatertroll", BattleStartHelpers.field_d);
                                                    SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                    if (var3 == 0) {
                                                      return;
                                                    }
                                                  }
                                                  if (SingleChildContainer.field_C != 33 ||
                                                    !BattleStartHelpers.field_d.isNamedFileAvailable(true, "waterlord", "streamed")) {
                                                    if (SingleChildContainer.field_C != 34 ||
                                                      !BattleStartHelpers.field_d.isNamedFileAvailable(true, "flameshield", "streamed")) {
                                                      if (SingleChildContainer.field_C != 35 ||
                                                        !BattleStartHelpers.field_d.isNamedFileAvailable(true, "clockworkexplosion", "streamed")) {
                                                        if (SingleChildContainer.field_C == 36 &&
                                                          BattleStartHelpers.field_d.isNamedFileAvailable(true, "clockworkpuff", "streamed")) {
                                                          PaletteSpriteHelpers.field_k = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 ^ 15433, "clockworkpuff", BattleStartHelpers.field_d);
                                                          SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                          if (var3 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        if (SingleChildContainer.field_C == 37 &&
                                                          BattleStartHelpers.field_d.isNamedFileAvailable(true, "windshield", "streamed")) {
                                                          IterableNodeHashTable.field_a = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "windshield", BattleStartHelpers.field_d);
                                                          SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                          if (var3 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        if (SingleChildContainer.field_C == 38 &&
                                                          BattleStartHelpers.field_d.isNamedFileAvailable(true, "stormshield", "streamed")) {
                                                          ChatPanel.field_a = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "stormshield", BattleStartHelpers.field_d);
                                                          SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                          if (var3 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        if (SingleChildContainer.field_C == 39 &&
                                                          BattleStartHelpers.field_d.isNamedFileAvailable(true, "flamewall", "streamed")) {
                                                          AccountCreationHelpers.field_f = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 - 15433, "flamewall", BattleStartHelpers.field_d);
                                                          SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                          if (var3 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        if (40 == SingleChildContainer.field_C &&
                                                          BattleStartHelpers.field_d.isNamedFileAvailable(true, "stonepuff", "streamed")) {
                                                          UrlHelpers.field_c = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "stonepuff", BattleStartHelpers.field_d);
                                                          SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                          if (var3 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        if (41 != SingleChildContainer.field_C ||
                                                          !BattleStartHelpers.field_d.isNamedFileAvailable(true, "frostpuff", "streamed")) {
                                                          if (SingleChildContainer.field_C != 42 ||
                                                            !BattleStartHelpers.field_d.isNamedFileAvailable(true, "underexplosion", "streamed")) {
                                                            if (43 == SingleChildContainer.field_C &&
                                                              BattleStartHelpers.field_d.isNamedFileAvailable(true, "skullexplosion", "streamed")) {
                                                              MusicPatchNode.field_E = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "skullexplosion", BattleStartHelpers.field_d);
                                                              SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                              if (var3 == 0) {
                                                                return;
                                                              }
                                                            }
                                                            if (SingleChildContainer.field_C == 44 &&
                                                              BattleStartHelpers.field_d.isNamedFileAvailable(true, "thornexplosion", "streamed")) {
                                                              CheckboxPainter.field_p = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "thornexplosion", BattleStartHelpers.field_d);
                                                              SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                              if (var3 == 0) {
                                                                return;
                                                              }
                                                            }
                                                            if (SingleChildContainer.field_C != 45 ||
                                                              !BattleStartHelpers.field_d.isNamedFileAvailable(true, "vineexplosion", "streamed")) {
                                                              if (SingleChildContainer.field_C == 46 &&
                                                                BattleStartHelpers.field_d.isNamedFileAvailable(true, "vinepuff", "streamed")) {
                                                                HotspotRegion.field_i = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 ^ 15433, "vinepuff", BattleStartHelpers.field_d);
                                                                SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                                if (var3 == 0) {
                                                                  return;
                                                                }
                                                              }
                                                              if (47 != SingleChildContainer.field_C ||
                                                                !BattleStartHelpers.field_d.isNamedFileAvailable(true, "waterexplosion", "streamed")) {
                                                                if (48 == SingleChildContainer.field_C &&
                                                                  BattleStartHelpers.field_d.isNamedFileAvailable(true, "brineexplosion", "streamed")) {
                                                                  DiskCacheRequest.field_H = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "brineexplosion", BattleStartHelpers.field_d);
                                                                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                                  if (var3 == 0) {
                                                                    return;
                                                                  }
                                                                }
                                                                if (49 == SingleChildContainer.field_C &&
                                                                  BattleStartHelpers.field_d.isNamedFileAvailable(true, "stoneexplosion", "streamed")) {
                                                                  StatusDialog.field_Tb = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "stoneexplosion", BattleStartHelpers.field_d);
                                                                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                                  if (var3 == 0) {
                                                                    return;
                                                                  }
                                                                }
                                                                if (SingleChildContainer.field_C != 50 ||
                                                                  !BattleStartHelpers.field_d.isNamedFileAvailable(true, "frostexplosion", "streamed")) {
                                                                  if (SingleChildContainer.field_C != 51) {
                                                                    return;
                                                                  }
                                                                  if (!BattleStartHelpers.field_d.isNamedFileAvailable(true, "watersplash", "streamed")) {
                                                                    return;
                                                                  }
                                                                  ResizableModalPanel.field_db = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "watersplash", BattleStartHelpers.field_d);
                                                                  RequestQueueHelpers.field_e = FadingModalPanel.field_Q;
                                                                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                                  if (var3 == 0) {
                                                                    return;
                                                                  }
                                                                }
                                                                ScreenTransitionHelpers.field_e = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "frostexplosion", BattleStartHelpers.field_d);
                                                                SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                                if (var3 == 0) {
                                                                  return;
                                                                }
                                                              }
                                                              DropdownItemList.field_cb = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 - 15433, "waterexplosion", BattleStartHelpers.field_d);
                                                              SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                              if (var3 == 0) {
                                                                return;
                                                              }
                                                            }
                                                            HighscoreEntry.field_j = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 - 15433, "vineexplosion", BattleStartHelpers.field_d);
                                                            SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                            if (var3 == 0) {
                                                              return;
                                                            }
                                                          }
                                                          ChatLine.field_l = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "underexplosion", BattleStartHelpers.field_d);
                                                          SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                          if (var3 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        ArrayWidgetContainer.field_G = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "frostpuff", BattleStartHelpers.field_d);
                                                        SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                        if (var3 == 0) {
                                                          return;
                                                        }
                                                      }
                                                      MouseInputHandler.field_a = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "clockworkexplosion", BattleStartHelpers.field_d);
                                                      SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                      if (var3 == 0) {
                                                        return;
                                                      }
                                                    }
                                                    BirthDateEntryPanel.field_S = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 ^ 15433, "flameshield", BattleStartHelpers.field_d);
                                                    SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                    if (var3 == 0) {
                                                      return;
                                                    }
                                                  }
                                                  NameCheckHelpers.field_k = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 - 15433, "waterlord", BattleStartHelpers.field_d);
                                                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                  if (var3 == 0) {
                                                    return;
                                                  }
                                                }
                                                SupportPageHelpers.field_f = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 ^ 15433, "watertroll", BattleStartHelpers.field_d);
                                                SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                                if (var3 == 0) {
                                                  return;
                                                }
                                              }
                                              DateHelpers.field_c = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "pegasus", BattleStartHelpers.field_d);
                                              SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                              if (var3 == 0) {
                                                return;
                                              }
                                            }
                                            CalendarHelpers.field_d = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "pixies", BattleStartHelpers.field_d);
                                            SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                            if (var3 == 0) {
                                              return;
                                            }
                                          }
                                          NumericDateInputWidget.field_U = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "swarm", BattleStartHelpers.field_d);
                                          SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                          if (var3 == 0) {
                                            return;
                                          }
                                        }
                                        DateHelpers.field_j = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 - 15433, "darkknight", BattleStartHelpers.field_d);
                                        SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                        if (var3 == 0) {
                                          return;
                                        }
                                      }
                                      LoginPanel.field_I = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "monkey", BattleStartHelpers.field_d);
                                      SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                      if (var3 == 0) {
                                        return;
                                      }
                                    }
                                    ArchiveIndex.field_n = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "elf", BattleStartHelpers.field_d);
                                    SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                    if (var3 == 0) {
                                      return;
                                    }
                                  }
                                  Js5NetworkRequest.field_w = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "ent", BattleStartHelpers.field_d);
                                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                BattleUnit.field_v = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "brinegoblin", BattleStartHelpers.field_d);
                                SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                                if (var3 == 0) {
                                  return;
                                }
                              }
                              FrameAndQuickChatHelpers.field_b = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "zombiedragon", BattleStartHelpers.field_d);
                              SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                              if (var3 == 0) {
                                return;
                              }
                            }
                            Checkbox.field_L = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 ^ 15433, "frostdragon", BattleStartHelpers.field_d);
                            SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                            if (var3 == 0) {
                              return;
                            }
                          }
                          LoadingTracker.field_d = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "flamedragon", BattleStartHelpers.field_d);
                          SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                          if (var3 == 0) {
                            return;
                          }
                        }
                        ChatPanel.field_g = IterableNodeHashTable.loadIndexedSpritesByName("streamed", param0 ^ 15433, "golem", BattleStartHelpers.field_d);
                        SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                        if (var3 == 0) {
                          return;
                        }
                      }
                      PendingTask.field_h = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "clockworkrecallsoldier", BattleStartHelpers.field_d);
                      SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                      if (var3 == 0) {
                        return;
                      }
                    }
                    SceneTextInput.field_Jb = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "dwarf", BattleStartHelpers.field_d);
                    SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                    if (var3 == 0) {
                      return;
                    }
                  }
                  ButtonMenuDialog.field_ob = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "sylph", BattleStartHelpers.field_d);
                  SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                  if (var3 == 0) {
                    return;
                  }
                }
                CookieHelpers.field_j = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "stormpuff", BattleStartHelpers.field_d);
                SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
                if (var3 == 0) {
                  return;
                }
              }
              DiskCacheWorker.field_a = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "smokeexplosion", BattleStartHelpers.field_d);
              SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
              if (var3 == 0) {
                return;
              }
            }
            StringReplaceHelpers.field_a = IterableNodeHashTable.loadIndexedSpritesByName("streamed", 0, "imp", BattleStartHelpers.field_d);
            SingleChildContainer.field_C = SingleChildContainer.field_C + 1;
            return;
          }
          if (SectorCacheStore.field_f >= 56) {
            if (BitHelpers.field_c >= 19) {
              return;
            }
            if (DelegatingCanvas.field_c[4] == null &&
              PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_grassland", "")) {
              DelegatingCanvas.field_c[4] = MusicTrack.loadNamed(PasswordFieldPainter.field_x, "", "arcanists_grassland");
              BitHelpers.field_c = 2;
              if (var3 == 0) {
                return;
              }
            }
            if (BitHelpers.field_c == 2) {
              GrowableIntList.field_h.prepareTrack(0, AgeValidator.field_w, EmailValidator.field_s, DelegatingCanvas.field_c[4], -105);
              BitHelpers.field_c = 3;
              if (var3 == 0) {
                return;
              }
            }
            if (null == DelegatingCanvas.field_c[1] &&
              PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_giant_mountains", "")) {
              DelegatingCanvas.field_c[1] = MusicTrack.loadNamed(PasswordFieldPainter.field_x, "", "arcanists_giant_mountains");
              BitHelpers.field_c = 4;
              if (var3 == 0) {
                return;
              }
            }
            if (BitHelpers.field_c != 4) {
              if (null == DelegatingCanvas.field_c[2] &&
                PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_elven", "")) {
                DelegatingCanvas.field_c[2] = MusicTrack.loadNamed(PasswordFieldPainter.field_x, "", "arcanists_elven");
                BitHelpers.field_c = 6;
                if (var3 == 0) {
                  return;
                }
              }
              if (BitHelpers.field_c != 6) {
                if (DelegatingCanvas.field_c[3] != null ||
                  !PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_goblin_caves", "")) {
                  if (BitHelpers.field_c != 8) {
                    if (null != DelegatingCanvas.field_c[5] ||
                      !PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_swamp", "")) {
                      if (BitHelpers.field_c != 10) {
                        if (null != DelegatingCanvas.field_c[6] ||
                          !PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_graveyard", "")) {
                          if (BitHelpers.field_c == 12) {
                            BitHelpers.field_c = 13;
                            GrowableIntList.field_h.prepareTrack(0, AgeValidator.field_w, EmailValidator.field_s, DelegatingCanvas.field_c[6], param0 ^ -15414);
                            if (var3 == 0) {
                              return;
                            }
                          }
                          if (DelegatingCanvas.field_c[7] != null ||
                            !PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_skycastles", "")) {
                            if (BitHelpers.field_c != 14) {
                              if (null != DelegatingCanvas.field_c[8] ||
                                !PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_beach_cove", "")) {
                                if (BitHelpers.field_c == 16) {
                                  BitHelpers.field_c = 17;
                                  GrowableIntList.field_h.prepareTrack(0, AgeValidator.field_w, EmailValidator.field_s, DelegatingCanvas.field_c[8], 50);
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                if (null != DelegatingCanvas.field_c[9] ||
                                  !PasswordFieldPainter.field_x.isNamedFileAvailable(true, "arcanists_arcane_crystal_cavern", "")) {
                                  if (BitHelpers.field_c != 18) {
                                    return;
                                  }
                                  BitHelpers.field_c = 19;
                                  GrowableIntList.field_h.prepareTrack(0, AgeValidator.field_w, EmailValidator.field_s, DelegatingCanvas.field_c[9], param0 - 15554);
                                  GrowableIntList.field_h.releasePatchSamples(125);
                                  EmailValidator.field_s = null;
                                  PasswordFieldPainter.field_x = null;
                                  AgeValidator.field_w = null;
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                DelegatingCanvas.field_c[9] = MusicTrack.loadNamed(PasswordFieldPainter.field_x, "", "arcanists_arcane_crystal_cavern");
                                BitHelpers.field_c = 18;
                                if (var3 == 0) {
                                  return;
                                }
                              }
                              DelegatingCanvas.field_c[8] = MusicTrack.loadNamed(PasswordFieldPainter.field_x, "", "arcanists_beach_cove");
                              BitHelpers.field_c = 16;
                              if (var3 == 0) {
                                return;
                              }
                            }
                            BitHelpers.field_c = 15;
                            GrowableIntList.field_h.prepareTrack(0, AgeValidator.field_w, EmailValidator.field_s, DelegatingCanvas.field_c[7], -116);
                            if (var3 == 0) {
                              return;
                            }
                          }
                          DelegatingCanvas.field_c[7] = MusicTrack.loadNamed(PasswordFieldPainter.field_x, "", "arcanists_skycastles");
                          BitHelpers.field_c = 14;
                          if (var3 == 0) {
                            return;
                          }
                        }
                        DelegatingCanvas.field_c[6] = MusicTrack.loadNamed(PasswordFieldPainter.field_x, "", "arcanists_graveyard");
                        BitHelpers.field_c = 12;
                        if (var3 == 0) {
                          return;
                        }
                      }
                      BitHelpers.field_c = 11;
                      GrowableIntList.field_h.prepareTrack(0, AgeValidator.field_w, EmailValidator.field_s, DelegatingCanvas.field_c[5], -109);
                      if (var3 == 0) {
                        return;
                      }
                    }
                    DelegatingCanvas.field_c[5] = MusicTrack.loadNamed(PasswordFieldPainter.field_x, "", "arcanists_swamp");
                    BitHelpers.field_c = 10;
                    if (var3 == 0) {
                      return;
                    }
                  }
                  BitHelpers.field_c = 9;
                  GrowableIntList.field_h.prepareTrack(0, AgeValidator.field_w, EmailValidator.field_s, DelegatingCanvas.field_c[3], 52);
                  if (var3 == 0) {
                    return;
                  }
                }
                DelegatingCanvas.field_c[3] = MusicTrack.loadNamed(PasswordFieldPainter.field_x, "", "arcanists_goblin_caves");
                BitHelpers.field_c = 8;
                if (var3 == 0) {
                  return;
                }
              }
              BitHelpers.field_c = 7;
              GrowableIntList.field_h.prepareTrack(0, AgeValidator.field_w, EmailValidator.field_s, DelegatingCanvas.field_c[2], -115);
              if (var3 == 0) {
                return;
              }
            }
            BitHelpers.field_c = 5;
            GrowableIntList.field_h.prepareTrack(0, AgeValidator.field_w, EmailValidator.field_s, DelegatingCanvas.field_c[1], param0 - 15553);
            return;
          }
          if (!MusicVolumeHelpers.field_b.ensureIndex(-10923)) {
            return;
          }
          if (!PaletteSpriteHelpers.field_l.ensureIndex(-10923)) {
            return;
          }
          if (null != MusicVolumeHelpers.field_b) {
            if (SectorCacheStore.field_f < 18) {
              if (SectorCacheStore.field_f == 0 && (!MusicVolumeHelpers.field_b.isGroupAvailableByName("spell_select", -24417) ||
                !PaletteSpriteHelpers.field_l.isGroupAvailableByName("spell_select", -24417))) {
                return;
              }
              RequestQueueHelpers.field_e = FadingModalPanel.field_Q;
              if (0 != SectorCacheStore.field_f) {
                if (1 != SectorCacheStore.field_f) {
                  if (SectorCacheStore.field_f != 2) {
                    if (SectorCacheStore.field_f != 3) {
                      if (SectorCacheStore.field_f == 4) {
                        SectorCacheStore.field_f = 5;
                        this.registerSample(92, NameTable.field_g[5], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_select", "arcanists_select_spell_overlight").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                        if (var3 == 0) {
                          return;
                        }
                      }
                      if (SectorCacheStore.field_f != 5) {
                        if (SectorCacheStore.field_f == 6) {
                          SectorCacheStore.field_f = 7;
                          this.registerSample(255, NameTable.field_g[7], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_select", "arcanists_select_spell_sea").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        if (SectorCacheStore.field_f == 7) {
                          SectorCacheStore.field_f = 8;
                          this.registerSample(255, NameTable.field_g[6], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_select", "arcanists_select_spell_nature").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        if (SectorCacheStore.field_f != 8) {
                          if (9 != SectorCacheStore.field_f) {
                            if (SectorCacheStore.field_f != 10) {
                              if (11 == SectorCacheStore.field_f) {
                                SectorCacheStore.field_f = 12;
                                this.registerSample(89, NameHelpers.field_a[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_select", "arcanists_select_spellbook_storm").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                                if (var3 == 0) {
                                  return;
                                }
                              }
                              if (SectorCacheStore.field_f != 12) {
                                if (SectorCacheStore.field_f != 13) {
                                  if (SectorCacheStore.field_f == 14) {
                                    SectorCacheStore.field_f = 15;
                                    this.registerSample(59, NameHelpers.field_a[4], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_select", "arcanists_select_spellbook_underdark").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                                    if (var3 == 0) {
                                      return;
                                    }
                                  }
                                  if (SectorCacheStore.field_f != 15) {
                                    if (SectorCacheStore.field_f == 16) {
                                      SectorCacheStore.field_f = 17;
                                      this.registerSample(255, NameHelpers.field_a[6], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_select", "arcanists_select_spellbook_nature").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                                      if (var3 == 0) {
                                        return;
                                      }
                                    }
                                    if (SectorCacheStore.field_f != 17) {
                                      return;
                                    }
                                    SectorCacheStore.field_f = 18;
                                    this.registerSample(255, NameHelpers.field_a[8], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_select", "arcanists_select_spellbook_cog").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                                    if (var3 == 0) {
                                      return;
                                    }
                                  }
                                  SectorCacheStore.field_f = 16;
                                  this.registerSample(255, NameHelpers.field_a[7], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_select", "arcanists_select_spellbook_sea").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                SectorCacheStore.field_f = 14;
                                this.registerSample(95, NameHelpers.field_a[5], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_select", "arcanists_select_spellbook_overlight").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                                if (var3 == 0) {
                                  return;
                                }
                              }
                              SectorCacheStore.field_f = 13;
                              this.registerSample(103, NameHelpers.field_a[1], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_select", "arcanists_select_spellbook_rock").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                              if (var3 == 0) {
                                return;
                              }
                            }
                            SectorCacheStore.field_f = 11;
                            this.registerSample(98, NameHelpers.field_a[3], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_select", "arcanists_select_spellbook_frost").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                            if (var3 == 0) {
                              return;
                            }
                          }
                          SectorCacheStore.field_f = 10;
                          this.registerSample(87, NameHelpers.field_a[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_select", "arcanists_select_spellbook_flame").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        SectorCacheStore.field_f = 9;
                        this.registerSample(255, NameTable.field_g[8], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_select", "arcanists_select_spell_cog").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                        if (var3 == 0) {
                          return;
                        }
                      }
                      SectorCacheStore.field_f = 6;
                      this.registerSample(75, NameTable.field_g[4], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_select", "arcanists_select_spell_underdark").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                      if (var3 == 0) {
                        return;
                      }
                    }
                    SectorCacheStore.field_f = 4;
                    this.registerSample(105, NameTable.field_g[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_select", "arcanists_select_spell_rock").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                    if (var3 == 0) {
                      return;
                    }
                  }
                  SectorCacheStore.field_f = 3;
                  this.registerSample(125, NameTable.field_g[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_select", "arcanists_select_spell_storm").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                  if (var3 == 0) {
                    return;
                  }
                }
                SectorCacheStore.field_f = 2;
                this.registerSample(182, NameTable.field_g[3], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_select", "arcanists_select_spell_frost").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                if (var3 == 0) {
                  return;
                }
              }
              SectorCacheStore.field_f = 1;
              this.registerSample(54, NameTable.field_g[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_select", "arcanists_select_spell_flame").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              return;
            }
            if (SectorCacheStore.field_f < 44) {
              if (18 == SectorCacheStore.field_f && (!MusicVolumeHelpers.field_b.isGroupAvailableByName("spell_impact", -24417) ||
                !PaletteSpriteHelpers.field_l.isGroupAvailableByName("spell_impact", param0 - 39850))) {
                return;
              }
              RequestQueueHelpers.field_e = DebouncedValidator.field_a;
              if (SectorCacheStore.field_f != 18) {
                if (SectorCacheStore.field_f == 19) {
                  SectorCacheStore.field_f = 20;
                  this.registerSample(148, CacheEntry.field_n[0][1], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_spellbook_flame_impact_2").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                  if (var3 == 0) {
                    return;
                  }
                }
                if (SectorCacheStore.field_f == 20) {
                  SectorCacheStore.field_f = 21;
                  this.registerSample(55, CacheEntry.field_n[0][2], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_spellbook_flame_impact_3").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                  if (var3 == 0) {
                    return;
                  }
                }
                if (SectorCacheStore.field_f != 21) {
                  if (SectorCacheStore.field_f != 22) {
                    if (SectorCacheStore.field_f == 23) {
                      SectorCacheStore.field_f = 24;
                      this.registerSample(232, CacheEntry.field_n[3][2], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_spellbook_frost_impact_3").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                      if (var3 == 0) {
                        return;
                      }
                    }
                    if (SectorCacheStore.field_f != 24) {
                      if (SectorCacheStore.field_f != 25) {
                        if (SectorCacheStore.field_f == 26) {
                          SectorCacheStore.field_f = 27;
                          this.registerSample(166, CacheEntry.field_n[2][2], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_spellbook_storm_impact_3").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        if (SectorCacheStore.field_f == 27) {
                          SectorCacheStore.field_f = 28;
                          this.registerSample(67, CacheEntry.field_n[1][0], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_spellbook_rock_impact_1").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        if (SectorCacheStore.field_f == 28) {
                          SectorCacheStore.field_f = 29;
                          this.registerSample(83, CacheEntry.field_n[1][1], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_spellbook_rock_impact_2").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        if (29 == SectorCacheStore.field_f) {
                          SectorCacheStore.field_f = 30;
                          this.registerSample(85, CacheEntry.field_n[1][2], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_spellbook_rock_impact_3").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        if (30 != SectorCacheStore.field_f) {
                          if (SectorCacheStore.field_f != 31) {
                            if (SectorCacheStore.field_f == 32) {
                              SectorCacheStore.field_f = 33;
                              this.registerSample(136, CacheEntry.field_n[5][2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_impact", "arcanists_spellbook_overlight_impact_3").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                              if (var3 == 0) {
                                return;
                              }
                            }
                            if (SectorCacheStore.field_f == 33) {
                              SectorCacheStore.field_f = 34;
                              this.registerSample(59, CacheEntry.field_n[4][0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_impact", "arcanists_spellbook_underdark_impact_1").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                              if (var3 == 0) {
                                return;
                              }
                            }
                            if (SectorCacheStore.field_f != 34) {
                              if (SectorCacheStore.field_f != 35) {
                                if (SectorCacheStore.field_f == 36) {
                                  SectorCacheStore.field_f = 37;
                                  this.registerSample(255, CacheEntry.field_n[7][2], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_clam_impact_individual").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                if (SectorCacheStore.field_f != 37) {
                                  if (SectorCacheStore.field_f != 38) {
                                    if (SectorCacheStore.field_f != 39) {
                                      if (40 == SectorCacheStore.field_f) {
                                        SectorCacheStore.field_f = 41;
                                        this.registerSample(255, CacheEntry.field_n[6][1], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_impact_nature_vinebomb").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                                        if (var3 == 0) {
                                          return;
                                        }
                                      }
                                      if (SectorCacheStore.field_f == 41) {
                                        SectorCacheStore.field_f = 42;
                                        this.registerSample(255, CacheEntry.field_n[6][0], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_spellbook_nature_impact_flurry_of_arrows").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                                        if (var3 == 0) {
                                          return;
                                        }
                                      }
                                      if (SectorCacheStore.field_f != 42) {
                                        if (SectorCacheStore.field_f != 43) {
                                          return;
                                        }
                                        SectorCacheStore.field_f = 44;
                                        this.registerSample(255, CacheEntry.field_n[8][0], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_cog_calling_bell_hit").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                                        if (var3 == 0) {
                                          return;
                                        }
                                      }
                                      SectorCacheStore.field_f = 43;
                                      this.registerSample(255, CacheEntry.field_n[8][2], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_cog_calling_bell_does_nothing").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                                      if (var3 == 0) {
                                        return;
                                      }
                                    }
                                    SectorCacheStore.field_f = 40;
                                    this.registerSample(255, CacheEntry.field_n[6][2], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_spellbook_nature_impact_thornball").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                                    if (var3 == 0) {
                                      return;
                                    }
                                  }
                                  SectorCacheStore.field_f = 39;
                                  this.registerSample(255, CacheEntry.field_n[7][0], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_brine_bomb_explode").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                                  if (var3 == 0) {
                                    return;
                                  }
                                }
                                SectorCacheStore.field_f = 38;
                                this.registerSample(255, CacheEntry.field_n[7][1], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_waterball_pop").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                                if (var3 == 0) {
                                  return;
                                }
                              }
                              SectorCacheStore.field_f = 36;
                              this.registerSample(104, CacheEntry.field_n[4][2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_impact", "arcanists_spellbook_underdark_impact_3").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                              if (var3 == 0) {
                                return;
                              }
                            }
                            SectorCacheStore.field_f = 35;
                            this.registerSample(136, CacheEntry.field_n[4][1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_impact", "arcanists_spellbook_underdark_impact_2").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                            if (var3 == 0) {
                              return;
                            }
                          }
                          SectorCacheStore.field_f = 32;
                          this.registerSample(65, CacheEntry.field_n[5][1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_impact", "arcanists_spellbook_overlight_impact_2").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                          if (var3 == 0) {
                            return;
                          }
                        }
                        SectorCacheStore.field_f = 31;
                        this.registerSample(80, CacheEntry.field_n[5][0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_impact", "arcanists_spellbook_overlight_impact_1").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                        if (var3 == 0) {
                          return;
                        }
                      }
                      SectorCacheStore.field_f = 26;
                      this.registerSample(90, CacheEntry.field_n[2][1], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_spellbook_storm_impact_2").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                      if (var3 == 0) {
                        return;
                      }
                    }
                    SectorCacheStore.field_f = 25;
                    this.registerSample(107, CacheEntry.field_n[2][0], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_spellbook_storm_impact_1").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                    if (var3 == 0) {
                      return;
                    }
                  }
                  SectorCacheStore.field_f = 23;
                  this.registerSample(130, CacheEntry.field_n[3][1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_impact", "arcanists_spellbook_frost_impact_2").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                  if (var3 == 0) {
                    return;
                  }
                }
                SectorCacheStore.field_f = 22;
                this.registerSample(76, CacheEntry.field_n[3][0], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_spellbook_frost_impact_1").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                if (var3 == 0) {
                  return;
                }
              }
              SectorCacheStore.field_f = 19;
              this.registerSample(61, CacheEntry.field_n[0][0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_impact", "arcanists_spellbook_flame_impact_1").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              return;
            }
            if (44 == SectorCacheStore.field_f &&
              MusicVolumeHelpers.field_b.isGroupAvailableByName("spell_charge", -24417) &&
              PaletteSpriteHelpers.field_l.isGroupAvailableByName("spell_charge", param0 ^ -25386)) {
              SectorCacheStore.field_f = 45;
              RequestQueueHelpers.field_e = MouseStateHelpers.field_f;
              this.registerSample(98, PaletteSpriteHelpers.field_i[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_charge", "arcanists_chargeup_flame").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(148, AccountFlowHelpers.field_f[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_charge", "arcanists_discharge_flame").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(115, PaletteSpriteHelpers.field_i[3], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_charge", "arcanists_chargeup_frost").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(172, AccountFlowHelpers.field_f[3], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_charge", "arcanists_discharge_frost").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(111, PaletteSpriteHelpers.field_i[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_charge", "arcanists_chargeup_storm").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(128, AccountFlowHelpers.field_f[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_charge", "arcanists_discharge_storm").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(73, PaletteSpriteHelpers.field_i[1], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_charge", "arcanists_chargeup_rock").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(131, AccountFlowHelpers.field_f[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_charge", "arcanists_discharge_rock").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(101, PaletteSpriteHelpers.field_i[5], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_charge", "arcanists_chargeup_overlight").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(161, AccountFlowHelpers.field_f[5], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_charge", "arcanists_discharge_overlight").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(118, PaletteSpriteHelpers.field_i[4], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_charge", "arcanists_chargeup_underdark").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(118, AccountFlowHelpers.field_f[4], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_charge", "arcanists_discharge_underdark").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, PaletteSpriteHelpers.field_i[7], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_charge", "arcanists_chargeup_sea").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, AccountFlowHelpers.field_f[7], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_charge", "arcanists_discharge_sea").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, PaletteSpriteHelpers.field_i[8], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_charge", "arcanists_chargeup_cog").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, AccountFlowHelpers.field_f[8], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_charge", "arcanists_discharge_cog").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              CredentialParseHelpers.field_h[PaletteSpriteHelpers.field_i[6]] = CredentialParseHelpers.field_h[NameHelpers.field_a[6]];
              SceneWidgetNode.field_r[PaletteSpriteHelpers.field_i[6]] = SceneWidgetNode.field_r[NameHelpers.field_a[6]];
              CredentialParseHelpers.field_h[AccountFlowHelpers.field_f[6]] = CredentialParseHelpers.field_h[NameHelpers.field_a[6]];
              SceneWidgetNode.field_r[AccountFlowHelpers.field_f[6]] = SceneWidgetNode.field_r[NameHelpers.field_a[6]];
              return;
            }
            if (SectorCacheStore.field_f == 45 &&
              MusicVolumeHelpers.field_b.isGroupAvailableByName("spell_cast_universal", -24417) &&
              PaletteSpriteHelpers.field_l.isGroupAvailableByName("spell_cast_universal", -24417)) {
              RequestQueueHelpers.field_e = SocketConnector.field_h;
              SectorCacheStore.field_f = 46;
              this.registerSample(120, 64, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_universal", "arcanists_cast_01_arcane_arrow").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(110, 72, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_universal", "arcanists_cast_06_arcane_glyph").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(119, 66, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_universal", "arcanists_cast_02_arcane_tower").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(141, 68, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_universal", "arcanists_cast_03_arcane_gate").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(111, 74, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_universal", "arcanists_cast_05_arcane_flash").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(111, 69, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_universal", "arcanists_cast_arcane_bomb").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(111, 65, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_universal", "arcanists_cast_arcane_portal").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(111, 71, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_universal", "arcanists_imp_destruction").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(111, 67, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_universal", "arcanists_cast_arcane_armour").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(111, 73, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_universal", "arcanists_cast_arcane_sigil").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              return;
            }
            if (46 == SectorCacheStore.field_f &&
              MusicVolumeHelpers.field_b.isGroupAvailableByName("spell_cast_flame", -24417) &&
              PaletteSpriteHelpers.field_l.isGroupAvailableByName("spell_cast_flame", -24417)) {
              RequestQueueHelpers.field_e = PatchEnvelopeSet.field_b;
              SectorCacheStore.field_f = 47;
              this.registerSample(73, 76, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_flame", "arcanists_cast_07_fire_ball").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(118, 77, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_flame", "arcanists_cast_08_fire_arrow").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(129, 78, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_flame", "arcanists_cast_09_lava_bomb").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(113, 79, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_flame", "arcanists_cast_10_magma_bomb").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(104, 80, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_flame", "arcanists_cast_11_flame_shield").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(120, 81, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_flame", "arcanists_cast_12_flame_wall").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(107, 82, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_flame", "arcanists_cast_13_napalm").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(96, 83, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_flame", "arcanists_cast_14_napalm_bomb").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(75, 84, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_flame", "arcanists_cast_15_rain_of_fire").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(117, 85, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_flame", "arcanists_cast_16_fire_of_arrows").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(122, 86, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_flame", "arcanists_cast_17_volcano").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(117, 87, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_flame", "arcanists_cast_18_flame_dragon").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              return;
            }
            if (SectorCacheStore.field_f == 47 &&
              MusicVolumeHelpers.field_b.isGroupAvailableByName("spell_cast_frost", -24417)) {
              RequestQueueHelpers.field_e = PaletteSpriteHelpers.field_j;
              SectorCacheStore.field_f = 48;
              this.registerSample(63, 112, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_frost", "arcanists_cast_43_ice_ball").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(94, 113, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_frost", "arcanists_cast_44_ice_bomb").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(102, 114, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_frost", "arcanists_cast_45_shards").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(111, 115, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_frost", "arcanists_cast_46_frost_arrow").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(117, 116, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_frost", "arcanists_cast_47_snow_ball").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(95, 117, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_frost", "arcanists_cast_48_blizzard").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(128, 118, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_frost", "arcanists_cast_49_ice_shield").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(100, 119, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_frost", "arcanists_cast_50_ice_castle").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(89, 120, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_frost", "arcanists_cast_51_sylph").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(108, 121, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_frost", "arcanists_cast_52_frost_giant").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(177, 122, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_frost", "arcanists_cast_53_comet").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(184, 123, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_frost", "arcanists_cast_54_frost_dragon").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              return;
            }
            if (SectorCacheStore.field_f == 48 &&
              MusicVolumeHelpers.field_b.isGroupAvailableByName("spell_cast_rock", -24417) &&
              PaletteSpriteHelpers.field_l.isGroupAvailableByName("spell_cast_rock", -24417)) {
              RequestQueueHelpers.field_e = PendingTask.field_m;
              SectorCacheStore.field_f = 49;
              this.registerSample(134, 88, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_rock", "arcanists_cast_19_pebble_shot").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(58, 89, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_rock", "arcanists_cast_20_scatter_rock").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(110, 90, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_rock", "arcanists_cast_21_quake").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(196, 91, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_rock", "arcanists_cast_22_disruption").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(151, 92, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_rock", "arcanists_cast_23_mud_bomb").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(110, 93, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_rock", "arcanists_cast_24_mega_boulder").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(85, 94, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_rock", "arcanists_cast_25_rock_slab").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(116, 95, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_rock", "arcanists_cast_26_fortress").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(120, 96, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_rock", "arcanists_cast_27_dwarves").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(125, 97, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_rock", "arcanists_cast_28_rock_golem").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(104, 98, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_rock", "arcanists_cast_29_meteor").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(65, 99, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_rock", "arcanists_cast_30_fissure").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              return;
            }
            if (49 == SectorCacheStore.field_f &&
              MusicVolumeHelpers.field_b.isGroupAvailableByName("spell_cast_storm", -24417) &&
              PaletteSpriteHelpers.field_l.isGroupAvailableByName("spell_cast_storm", -24417)) {
              RequestQueueHelpers.field_e = AlternateUsernameCredentials.field_j;
              SectorCacheStore.field_f = 50;
              this.registerSample(107, 100, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_storm", "arcanists_cast_31_thunder_shock").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(136, 101, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_storm", "arcanists_cast_32_chain_lightning").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(256, 102, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_storm", "arcanists_cast_33_wind_shield").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(129, 103, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_storm", "arcanists_cast_34_hurricane").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(103, 104, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_storm", "arcanists_cast_35_shock_bomb").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(161, 105, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_storm", "arcanists_cast_36_storm_shield").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(127, 106, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_storm", "arcanists_cast_37_cyclops").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(123, 107, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_storm", "arcanists_cast_38_conductor_rod").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(92, 108, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_storm", "arcanists_cast_39_thrust").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(108, 109, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_storm", "arcanists_cast_40_flight").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(139, 110, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_storm", "arcanists_cast_41_storm").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(184, 111, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_storm", "arcanists_cast_42_storm_dragon").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              return;
            }
            if (SectorCacheStore.field_f == 50 &&
              MusicVolumeHelpers.field_b.isGroupAvailableByName("spell_cast_overlight", param0 - 39850) &&
              PaletteSpriteHelpers.field_l.isGroupAvailableByName("spell_cast_overlight", -24417)) {
              SectorCacheStore.field_f = 51;
              RequestQueueHelpers.field_e = FinalFrameHelpers.field_c;
              this.registerSample(123, 145, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_overlight", "arcanists_cast_67_castle_of_light").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(110, 137, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_overlight", "arcanists_cast_68_sky_ray").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(139, 138, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_overlight", "arcanists_cast_69_shining_bolt").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(107, 139, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_overlight", "arcanists_cast_70_rising_star").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(109, 140, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_overlight", "arcanists_cast_71_pegasus").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(131, 141, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_overlight", "arcanists_cast_72_paladin").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(140, 142, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_overlight", "arcanists_cast_73_forest_seed").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(113, 143, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_overlight", "arcanists_cast_74_pixies").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(125, 144, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_overlight", "arcanists_cast_75_sphere_of_healing").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(87, 136, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_overlight", "arcanists_cast_76_protection_shield").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(123, 146, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_overlight", "arcanists_cast_77_invulnerability_shield").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(128, 147, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_overlight", "arcanists_cast_78_shining_power").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              return;
            }
            if (SectorCacheStore.field_f == 51 &&
              MusicVolumeHelpers.field_b.isGroupAvailableByName("spell_cast_underdark", -24417)) {
              RequestQueueHelpers.field_e = MatchingFieldValidator.field_v;
              SectorCacheStore.field_f = 52;
              this.registerSample(156, 124, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_underdark", "arcanists_cast_55_den_of_darkness").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(154, 125, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_underdark", "arcanists_cast_56_rain_of_chaos").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(256, 126, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_underdark", "arcanists_cast_57_drain_bolt").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(177, 127, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_underdark", "arcanists_cast_58_death_bomb").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(145, 128, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_underdark", "arcanists_cast_59_swarm").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(136, 129, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_underdark", "arcanists_cast_60_dark_knight").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(142, 130, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_underdark", "arcanists_cast_61_raise_dead").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(135, 131, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_underdark", "arcanists_cast_62_wraith_minion").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(104, 132, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_underdark", "arcanists_cast_63_aura_of_decay").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(122, 133, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_underdark", "arcanists_cast_64_dark_defences").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(160, 134, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_underdark", "arcanists_cast_65_swallowing_pit").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(159, 135, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_underdark", "arcanists_cast_66_lichdom").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              return;
            }
            if (52 == SectorCacheStore.field_f &&
              PaletteSpriteHelpers.field_l.isGroupAvailableByName("spell_cast_ocean", -24417)) {
              SectorCacheStore.field_f = 53;
              RequestQueueHelpers.field_e = AgeValidator.field_s;
              this.registerSample(255, 160, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_ocean", "arcanists_cast_waterball").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 161, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_ocean", "arcanists_cast_maelstrom").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(256, 162, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_ocean", "arcanists_summon_minions").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 164, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_ocean", "arcanists_cast_deluge").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 165, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_ocean", "arcanists_cast_english_summer").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 166, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_ocean", "arcanists_cast_brine_bolt_individual").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 167, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_ocean", "arcanists_cast_brine_bomb").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 169, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_ocean", "arcanists_cast_rain_of_clams").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 170, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_ocean", "arcanists_cast_tsunami").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              return;
            }
            if (SectorCacheStore.field_f == 53 &&
              PaletteSpriteHelpers.field_l.isGroupAvailableByName("spell_cast_nature", -24417)) {
              RequestQueueHelpers.field_e = ArchiveProvider.field_g;
              SectorCacheStore.field_f = 54;
              this.registerSample(255, 148, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_nature", "arcanists_cast_79_thornball").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 149, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_nature", "arcanists_cast_80_thornbomb").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 150, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_nature", "arcanists_cast_nature_whip").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 151, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_nature", "arcanists_cast_nature_vinebridge2").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 152, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_nature", "arcanists_cast_nature_vinebomb").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 153, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_nature", "arcanists_cast_nature_entangle").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 155, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_nature", "arcanists_cast_86_sanctuary").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 157, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_nature", "arcanists_cast_88_flurry_of_arrows").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 158, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_nature", "arcanists_cast_nature_natureswrath").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 159, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_nature", "arcanists_impact_nature_vinebloom_build").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              return;
            }
            if (54 == SectorCacheStore.field_f &&
              MusicVolumeHelpers.field_b.isGroupAvailableByName("spell_cast_cogs", -24417) &&
              PaletteSpriteHelpers.field_l.isGroupAvailableByName("spell_cast_cogs", -24417)) {
              SectorCacheStore.field_f = 55;
              RequestQueueHelpers.field_e = Scrollbar.field_I;
              this.registerSample(255, 172, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_cogs", "arcanists_cog_static_ball_shield_cast").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 173, CredentialParseHelpers.field_h[172], SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 174, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_cogs", "arcanists_cog_mech_arrow_cast").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 175, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_cogs", "arcanists_cog_fall_cast").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 176, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_cogs", "arcanists_cog_recall_device_cast").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 177, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_cogs", "arcanists_cog_calling_bell_cast").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 178, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_cogs", "arcanists_cog_clock_tower_cast").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 179, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_cogs", "arcanists_cog_cuckoo_clock_cast").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 180, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_cogs", "arcanists_cog_blast_from_past_cast").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 181, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_cogs", "arcanists_cog_clockwork_bomb_loop_cast").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 182, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_cogs", "arcanists_cog_steam_dragon_cast").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              this.registerSample(255, 183, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "spell_cast_cogs", "arcanists_cog_redo_cast").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
              CredentialParseHelpers.field_h[218] = CredentialParseHelpers.field_h[CacheEntry.field_n[8][0]];
              SceneWidgetNode.field_r[218] = SceneWidgetNode.field_r[CacheEntry.field_n[8][0]];
              return;
            }
            if (SectorCacheStore.field_f == 55) {
              RequestQueueHelpers.field_e = FlagSumHelpers.field_d;
              if (MusicVolumeHelpers.field_b.areAllGroupsAvailable(117) &&
                PaletteSpriteHelpers.field_l.areAllGroupsAvailable(113)) {
                SectorCacheStore.field_f = 56;
                this.registerSample(255, 154, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "plant_minion", "arcanists_plant_minion_summon").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(255, 156, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "elves", "arcanists_elf_summon").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(125, 70, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "footmen", "arcanists_imp_for_the_arcanist").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(159, 171, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "default", "arcanists_water_lord_summon").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(104, 168, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "default", "arcanists_brine_goblin_summon").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(255, 163, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_impact", "arcanists_hydration_impact").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(255, 220, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "trajectile", "natural_trajectile_loop").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(255, 226, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "trajectile", "unnatural_trajectile_loop").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(64, 227, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "trajectile", "bounce").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(198, 221, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "other_buttons", "arcanists_menu_transition").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(256, 222, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "other_buttons", "arcanists_units_click_on_map").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(256, 223, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "other_buttons", "arcanists_units_drag_unit").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(256, 224, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "other_buttons", "arcanists_units_select_next_unit").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(256, 225, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "other_buttons", "arcanists_units_zoom_in").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(256, 48, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "player", "arcanists_pl_01_footsteps").toPcmSample(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(171, 49, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "player", "arcanists_pl_02_jump_fowards").toPcmSample(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(173, 50, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "player", "arcanists_pl_03_jump_upwards").toPcmSample(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(255, 51, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "player", "arcanists_pl_04_landing").toPcmSample(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(158, 52, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "player", "arcanists_pl_05_damage").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(153, 53, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "player", "arcanists_pl_06_death").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(155, 54, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "player", "arcanists_pl_07_splash").toPcmSample(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(190, AlphaContainer.field_G[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "cyclops", "arcanists_cyclops_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(191, AlphaContainer.field_G[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "cyclops", "arcanists_cyclops_hit").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(178, AlphaContainer.field_G[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "cyclops", "arcanists_cyclops_death").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(165, ViewControllerHelpers.field_f[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "dark_knight", "arcanists_dark_knight_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(203, ViewControllerHelpers.field_f[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "dark_knight", "arcanists_dark_knight_hit").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(152, ViewControllerHelpers.field_f[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "dark_knight", "arcanists_dark_knight_death").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(149, 194, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "dark_knight", "arcanists_dark_knight_charge_attack").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(151, StringReplaceHelpers.field_b[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "dwarf", "arcanists_dwarf_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(142, StringReplaceHelpers.field_b[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "dwarf", "arcanists_dwarf_hit").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(153, StringReplaceHelpers.field_b[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "dwarf", "arcanists_dwarf_death").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(173, 188, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "dwarf", "arcanists_dwarf_mining").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(103, 189, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "dwarf", "arcanists_dwarf_self_destruct").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(118, MainMenuDialog.field_Ib[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "paladin", "arcanists_paladin_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(79, MainMenuDialog.field_Ib[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "paladin", "arcanists_paladin_hit").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(84, MainMenuDialog.field_Ib[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "paladin", "arcanists_paladin_death").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(91, 202, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "paladin", "arcanists_paladin_smash").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(147, PasswordFieldPainter.field_B[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "rock_golem", "arcanists_rock_golem_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(128, PasswordFieldPainter.field_B[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "rock_golem", "arcanists_rock_golem_hit").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(148, PasswordFieldPainter.field_B[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "rock_golem", "arcanists_rock_golem_death").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(125, SceneScrollbar.field_Fb[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "slyph", "arcanists_slyph_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(159, SceneScrollbar.field_Fb[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "slyph", "arcanists_slyph_hit").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(181, SceneScrollbar.field_Fb[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "slyph", "arcanists_slyph_death").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(161, 185, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "slyph", "arcanists_slyph_arrow_attack").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(138, IndexedSpriteState.field_i[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "wraith", "arcanists_wraith_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(178, IndexedSpriteState.field_i[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "wraith", "arcanists_wraith_hit").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(166, IndexedSpriteState.field_i[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "wraith", "arcanists_wraith_death").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(255, 219, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "steam_dragon", "arcanists_cog_steam_dragon_attack").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(79, NanoFrameClock.field_g[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "footmen", "arcanists_imp_yes_master").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                FullscreenFocusCanvas.field_g[NanoFrameClock.field_g[2]] = null;
                this.registerSample(115, 184, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "footmen", "arcanists_imp_im_gonna_go_boom").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(167, DropdownItemList.field_U[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "frost_giant", "arcanists_frost_giant_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(149, DropdownItemList.field_U[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "frost_giant", "arcanists_frost_giant_hit").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(167, DropdownItemList.field_U[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "frost_giant", "arcanists_frost_giant_death").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(109, 187, SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "frost_giant", "arcanists_frost_giant_smash_attack").toPcmSample(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                CredentialParseHelpers.field_h[197] = CredentialParseHelpers.field_h[102];
                SceneWidgetNode.field_r[198] = SceneWidgetNode.field_r[105];
                SceneWidgetNode.field_r[197] = SceneWidgetNode.field_r[102];
                CredentialParseHelpers.field_h[198] = CredentialParseHelpers.field_h[105];
                SceneWidgetNode.field_r[103] = SceneWidgetNode.field_r[103];
                SceneWidgetNode.field_r[199] = SceneWidgetNode.field_r[136];
                CredentialParseHelpers.field_h[199] = CredentialParseHelpers.field_h[136];
                SceneWidgetNode.field_r[201] = SceneWidgetNode.field_r[187];
                CredentialParseHelpers.field_h[201] = CredentialParseHelpers.field_h[187];
                CredentialParseHelpers.field_h[103] = CredentialParseHelpers.field_h[103];
                this.registerSample(176, NanoFrameClock.field_n[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "storm_dragon", "arcanists_storm_dragon_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(182, NanoFrameClock.field_n[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "storm_dragon", "arcanists_storm_dragon_hit").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(202, NanoFrameClock.field_n[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "storm_dragon", "arcanists_storm_dragon_death").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(154, 193, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "storm_dragon", "arcanists_storm_dragon_breath").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(190, LoadingProgressDialog.field_pb[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "frost_dragon", "arcanists_frost_dragon_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(256, LoadingProgressDialog.field_pb[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "frost_dragon", "arcanists_frost_dragon_hit").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(148, LoadingProgressDialog.field_pb[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "frost_dragon", "arcanists_frost_dragon_death").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(167, 192, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "frost_dragon", "arcanists_frost_dragon_breath").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(181, DecimalCheckHelpers.field_c[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "flame_dragon", "arcanists_flame_dragon_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(108, DecimalCheckHelpers.field_c[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "flame_dragon", "arcanists_flame_dragon_hit").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(172, DecimalCheckHelpers.field_c[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "flame_dragon", "arcanists_flame_dragon_death").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(167, 191, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "flame_dragon", "arcanists_flame_dragon_breath").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(158, AccountCreationHelpers.field_a[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "pegasus", "arcanists_pegasus_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(229, AccountCreationHelpers.field_a[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "pegasus", "arcanists_pegasus_hit").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(183, AccountCreationHelpers.field_a[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "pegasus", "arcanists_pegasus_death").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(256, MeshModel.field_c[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "swarm", "arcanists_swarm_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(256, MeshModel.field_c[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "swarm", "arcanists_swarm_hit").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(256, MeshModel.field_c[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "swarm", "arcanists_swarm_death").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(256, ScreenDisplayMode.field_c[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "cyclops", "arcanists_storm_spirit_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(85, DecodedSpriteHelpers.field_j[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "pixie", "arcanists_pixie_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(83, DecodedSpriteHelpers.field_j[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "pixie", "arcanists_pixie_hit").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(85, DecodedSpriteHelpers.field_j[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "pixie", "arcanists_pixie_death").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(235, 196, VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "pixie", "arcanists_pixie_fairyring").decodeAllToPcm(), SceneWidgetNode.field_r, false, CredentialParseHelpers.field_h);
                this.registerSample(85, CredentialParseHelpers.field_a[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "default", "arcanists_brine_goblin_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(83, CredentialParseHelpers.field_a[2], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "default", "arcanists_brine_goblin_hit").toPcmSample(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(85, CredentialParseHelpers.field_a[1], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "default", "arcanists_brine_goblin_death").toPcmSample(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(85, SoundEffectVoice.field_h[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "elves", "arcanists_elf_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(83, SoundEffectVoice.field_h[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "elves", "arcanists_elf_hit").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(85, SoundEffectVoice.field_h[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "elves", "arcanists_elf_death").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(85, LobbyStateHelpers.field_a[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "plant_minion", "arcanists_plant_minion_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(83, LobbyStateHelpers.field_a[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "plant_minion", "arcanists_plant_minion_hit").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(85, LobbyStateHelpers.field_a[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "plant_minion", "arcanists_plant_minion_death").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(85, IconButtonPainter.field_p[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "default", "arcanists_water_troll_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(83, IconButtonPainter.field_p[2], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "default", "arcanists_sea_watertroll_hit").toPcmSample(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(85, IconButtonPainter.field_p[1], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "default", "arcanists_sea_watertroll_death").toPcmSample(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(85, CookieHelpers.field_h[0], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "spell_cast_ocean", "arcanists_summon_sea_minion").toPcmSample(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(83, CookieHelpers.field_h[2], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "default", "arcanists_water_lord_hit").toPcmSample(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(85, CookieHelpers.field_h[1], SoundEffect.loadNamed(PaletteSpriteHelpers.field_l, "default", "arcanists_water_lord_death").toPcmSample(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(255, CapsuleBar.field_B[0], CredentialParseHelpers.field_h[176], IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(255, CapsuleBar.field_B[2], CredentialParseHelpers.field_h[176], IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(255, CapsuleBar.field_B[1], CredentialParseHelpers.field_h[176], IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(255, HuffmanCodec.field_h[0], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "steam_dragon", "arcanists_cog_steam_dragon_select").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(255, HuffmanCodec.field_h[2], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "steam_dragon", "arcanists_cog_steam_dragon_hit").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                this.registerSample(255, HuffmanCodec.field_h[1], VorbisSample.loadNamed(MusicVolumeHelpers.field_b, "steam_dragon", "arcanists_cog_steam_dragon_death").decodeAllToPcm(), IntensityTableHelpers.field_a, false, FullscreenFocusCanvas.field_g);
                MusicVolumeHelpers.field_b = null;
                PaletteSpriteHelpers.field_l = null;
                return;
              }
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ArcanistsMulti.QA(" + param0 + ')');
        }
    }

    static {
        field_H = "Log in / Create account";
        field_F = "Add <%0> to friend list";
    }
}
