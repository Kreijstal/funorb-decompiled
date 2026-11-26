/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollPane extends AnimatedPanel {
    AnimatedPanel field_xb;
    static String[][] field_Db;
    static String field_Bb;
    static SoundEffectDefinition field_yb;
    ScrollBar field_Ab;
    AnimatedPanel field_zb;
    static String field_Cb;
    static String field_Eb;

    private final void applyScrollInput(int param0, boolean param1, int param2, byte param3, int param4) {
        if (this.field_Ab.pollScrollBackward(param3 - 125)) {
          this.field_xb.field_w = this.field_xb.field_w + param2;
        }
        if (this.field_Ab.pollScrollForward(false)) {
          this.field_xb.field_w = this.field_xb.field_w - param2;
        }
        if (this.field_Ab.pollPageBackward(param3 ^ 113)) {
          this.field_xb.field_w = this.field_xb.field_w + param4;
        }
        if (this.field_Ab.pollPageForward((byte) 104)) {
          this.field_xb.field_w = this.field_xb.field_w - param4;
        }
        if (this.field_L) {
          this.field_xb.field_w = this.field_xb.field_w - param0;
        }
        if (param1) {
          if (0 > -(this.field_xb.field_w + this.field_xb.field_db)) {
            this.field_xb.field_w = -this.field_xb.field_db;
          }
          if (-this.field_zb.field_mb + (this.field_xb.field_gb + this.field_xb.field_mb) < -(this.field_xb.field_db + this.field_xb.field_w)) {
            this.field_xb.field_w = -(this.field_xb.field_mb + this.field_xb.field_gb - this.field_zb.field_mb) - this.field_xb.field_db;
          }
        } else {
          if (-(this.field_xb.field_w + this.field_xb.field_db) > this.field_xb.field_mb + this.field_xb.field_gb - this.field_zb.field_mb) {
            this.field_xb.field_w = -this.field_xb.field_db - (-this.field_zb.field_mb + this.field_xb.field_gb + this.field_xb.field_mb);
          }
          if (-(this.field_xb.field_db + this.field_xb.field_w) < 0) {
            this.field_xb.field_w = -this.field_xb.field_db;
          }
        }
        if (this.field_Ab.isThumbDragging(-20641)) {
          this.field_xb.field_db = -this.field_Ab.getThumbScrollOffset(-5639, this.field_xb.field_mb, this.field_zb.field_mb, param1);
          this.field_xb.field_w = 0;
        }
        if (param3 != 10) {
          return;
        }
        this.field_Ab.layoutScrollControls(this.field_zb.field_mb, 20, this.field_xb.field_mb, -this.field_xb.field_db);
    }

    final void processScrollInput(int param0, boolean param1, byte param2, int param3) {
        if (param2 <= -109) {
          this.applyScrollInput(param0, param1, param3, (byte) 10, this.field_zb.field_mb);
          return;
        }
        field_Cb = (String) null;
        this.applyScrollInput(param0, param1, param3, (byte) 10, this.field_zb.field_mb);
    }

    final void layoutScrollPane(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_hb = param2;
        this.field_K = param0;
        this.field_db = param1;
        this.field_mb = param5;
        if (param4 < -121) {
          this.layoutScrollPaneChildren(param6, param3, false);
          return;
        }
    }

    final boolean updateScrollLayout(int param0, int param1, boolean param2, int param3, boolean param4, int param5) {
        if (param3 > -71) {
          return true;
        }
        return this.updateScrollLayoutInternal(param5, param1, param2, -116, param0, this.field_zb.field_mb, param4);
    }

    private final boolean updateScrollLayoutInternal(int param0, int param1, boolean param2, int param3, int param4, int param5, boolean param6) {
        int var8;
        int var8Lifetime1;
        if (param2) {
          var8 = 1;
          this.field_xb.layoutChildren(this.field_zb.field_mb, true, var8 != 0, param0);
          this.applyScrollInput(param4, false, param1, (byte) 10, param5);
          if (param3 > -113) {
            return false;
          }
          return var8 != 0;
        }
        if (!this.field_L) {
          var8Lifetime1 = 0;
        } else {
          if (!param6) {
            var8Lifetime1 = 1;
          } else {
            var8Lifetime1 = 0;
          }
        }
        this.field_xb.layoutChildren(this.field_zb.field_mb, true, var8Lifetime1 != 0, param0);
        this.applyScrollInput(param4, false, param1, (byte) 10, param5);
        if (param3 > -113) {
          return false;
        }
        return var8Lifetime1 != 0;
    }

    private final void layoutScrollPaneChildren(int param0, int param1, boolean param2) {
        this.field_zb.field_mb = this.field_mb;
        this.field_zb.field_K = -param1 + (this.field_K - param0);
        this.field_xb.field_hb = 0;
        if (!param2) {
          this.field_xb.field_K = this.field_K - param0 - param1;
          this.field_Ab.setBoundsAndScrollRange(0, -param0 + this.field_K, param0, (byte) -77, -this.field_xb.field_db, this.field_zb.field_mb, this.field_xb.field_mb, this.field_mb);
          return;
        }
    }

    final static void configureSharedMenuStyle(int param0, BitmapFont param1, TiledNineSlicePainter param2, int param3, int param4, int param5, BitmapFont param6, int param7, int param8, int param9, int param10, TiledNineSlicePainter param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, TiledNineSlicePainter param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          MusicEnvelope.field_g = param1;
          FourIntSubmissionRequest.field_k = param6;
          PointsVictoryChecker.configureMenuTextMetrics(param10, param3, param0, param12, 2);
          FleetVisual.setMenuPainterAndMetrics(param17, param9 + 20, param18, param2);
          RasterSpanFactory.configureMenuRowFrames(param5, (byte) 67, param19, param7, param11, param15);
          if (param9 != 0) {
            field_Cb = (String) null;
          }
          Player.setMenuAnchor(param16, param4, false);
          RasterTargetSupport.setMenuHighlightColors(param13, param8, param14, (byte) 102);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("ub.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static AccountRequestResult createAccountSuccessResult(byte param0, boolean param1) {
        AccountRequestResult var2 = null;
        AccountRequestResult var2Lifetime1;
        if (param0 == 93) {
          var2 = new AccountRequestResult(true);
          var2.field_b = param1 ? true : false;
          return var2;
        }
        field_Db = (String[][]) null;
        var2Lifetime1 = new AccountRequestResult(true);
        var2Lifetime1.field_b = param1 ? true : false;
        return var2Lifetime1;
    }

    ScrollPane(long param0, AnimatedPanel param1, AnimatedPanel param2, ScrollBar param3) {
        super(param0, (AnimatedPanel) null);
        try {
          this.field_zb = new AnimatedPanel(0L, param2);
          this.field_Ab = new ScrollBar(0L, param3);
          this.addChild(4, this.field_zb);
          this.addChild(4, this.field_Ab);
          this.field_xb = param1;
          this.field_zb.addChild(4, param1);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ub.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStatics(int param0) {
        field_Bb = null;
        field_Db = (String[][]) null;
        field_yb = null;
        field_Cb = null;
        field_Eb = null;
        if (param0 == 0) {
          return;
        }
        field_Eb = (String) null;
    }

    final static void tickIntroSequence(byte param0) {
        int fieldTemp$0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_88_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!EmailValidator.field_r) {
            if (DerelictVictoryChecker.field_n.ensureGroupLoadedByName("intro", param0 ^ 52)) {
              EmailValidator.field_r = true;
            }
          } else {
            if (!MapGenerationException.field_a) {
              DiskCacheWorker.loadIntroSprites((byte) 50);
            }
          }
          if (param0 != 93) {
            ScrollPane.tickIntroSequence((byte) -67);
          }
          while (PasswordValidator.pollKeyEventFullInts(55)) {
            if (TextReplacementEntry.field_j == 13) {
              ArchiveRequest.requestIntroScene(-1, (byte) 125);
              continue;
            }
            if (TextReplacementEntry.field_j != 83) {
              continue;
            }
            if (CachedArchiveSource.field_n) {
              continue;
            }
            if (!MapGenerationException.field_a) {
              continue;
            }
            if (NameSuggestionsPanel.field_L <= 0) {
              continue;
            }
            ListContent.removePendingIntroTextLines(param0 ^ 93);
            if (SolVictoryChecker.field_m >= 5) {
              stackIn_21_0 = -1;
            } else {
              stackIn_21_0 = SolVictoryChecker.field_m + 1;
            }
            ArchiveRequest.requestIntroScene(stackIn_21_0, (byte) 125);
          }
          if (50 + ValidationState.field_a < RasterStateFrame.field_n) {
            ValidationState.field_a = RasterStateFrame.field_n + ClientRandomSupport.randomBelow((byte) -39, 50);
          }
          var1_int = RasterStateFrame.field_n - ValidationState.field_a;
          if (0 > var1_int) {
            QuickChatPhraseDefinition.field_r = 0;
          } else {
            if (var1_int < 10) {
              QuickChatPhraseDefinition.field_r = var1_int * 25;
            } else {
              if (var1_int >= 15) {
                if (20 > var1_int) {
                  QuickChatPhraseDefinition.field_r = -150 + 25 * var1_int;
                } else {
                  if (var1_int < 25) {
                    QuickChatPhraseDefinition.field_r = 750 - var1_int * 25;
                  } else {
                    if (var1_int >= 30) {
                      if (var1_int < 40) {
                        QuickChatPhraseDefinition.field_r = 1000 - var1_int * 25;
                      } else {
                        QuickChatPhraseDefinition.field_r = 0;
                      }
                    } else {
                      QuickChatPhraseDefinition.field_r = 25 * var1_int - 400;
                    }
                  }
                }
              } else {
                QuickChatPhraseDefinition.field_r = 500 - 25 * var1_int;
              }
            }
          }
          if (!CachedArchiveSource.field_n) {
            if (NameSuggestionsPanel.field_L < 50) {
              NameSuggestionsPanel.field_L = NameSuggestionsPanel.field_L + 1;
            }
          } else {
            fieldTemp$0 = NameSuggestionsPanel.field_L - 1;
            NameSuggestionsPanel.field_L = NameSuggestionsPanel.field_L - 1;
            if (fieldTemp$0 <= 0) {
              CachedArchiveSource.field_n = false;
              SolVictoryChecker.field_m = MusicEnvelope.field_i;
              NameSuggestionsPanel.field_L = 0;
              if (SolVictoryChecker.field_m == -1) {
                HorizontalGradientComponent.field_v = 50;
                MenuTransitionSupport.beginMenuTransition(0, 0, (byte) 96, false);
                DiskCacheWorker.commitMenuTransition(param0 + 1048483);
                BattleContribution.clearIntroSprites(true);
              }
              if (SolVictoryChecker.field_m == 2) {
                QuickChatParameterType.resetIntroParticlesAndText(param0 + 29);
              }
              if (SolVictoryChecker.field_m != 4) {
                FleetTrailPoint.field_m = 0;
              } else {
                IsaacRandom.initializeIntroGlowTrail(param0 + 1674225223);
                FleetTrailPoint.field_m = 0;
              }
            }
          }
          BufferedCacheFile.tickIntroTextLines(-128);
          if (SolVictoryChecker.field_m != 0) {
            if (1 == SolVictoryChecker.field_m) {
              MapView.tickIntroGlowScene((byte) 119);
            } else {
              if (2 != SolVictoryChecker.field_m) {
                if (SolVictoryChecker.field_m == 3) {
                  DiskArchiveRequest.tickIntroColonizationScene((byte) 118);
                } else {
                  if (SolVictoryChecker.field_m == 4) {
                    ByteArrayReadRequest.advanceClosingIntroText(0);
                  } else {
                    if (SolVictoryChecker.field_m == 5) {
                      DisplayModeInfo.advanceIntroFinalScene((byte) -72);
                    }
                  }
                }
              } else {
                PlayerStats.tickIntroGlowParticles(-63);
              }
            }
          } else {
            VerticalMenuSlider.tickIntroLoadingScene((byte) 44);
          }
          if (TertiaryListSequence.field_k < 540) {
            ArchiveIndex.field_o = false;
          } else {
            if (TertiaryListSequence.field_k >= 620) {
              ArchiveIndex.field_o = false;
            } else {
              if (440 > LobbyRoomControlsSupport.field_b) {
                ArchiveIndex.field_o = false;
              } else {
                if (LobbyRoomControlsSupport.field_b >= 460) {
                  ArchiveIndex.field_o = false;
                } else {
                  ArchiveIndex.field_o = true;
                }
              }
            }
          }
          if (LobbyCommandSupport.field_d != 0) {
            if (540 <= PointsVictoryChecker.field_p &&
              PointsVictoryChecker.field_p < 620 &&
              440 <= SliderWidget.field_P &&
              SliderWidget.field_P < 460) {
              ArchiveRequest.requestIntroScene(-1, (byte) 122);
              return;
            }
            if (!CachedArchiveSource.field_n &&
              MapGenerationException.field_a) {
              if (NameSuggestionsPanel.field_L <= 0) {
                return;
              }
              ListContent.removePendingIntroTextLines(0);
              if (5 > SolVictoryChecker.field_m) {
                stackIn_88_0 = 1 + SolVictoryChecker.field_m;
              } else {
                stackIn_88_0 = -1;
              }
              ArchiveRequest.requestIntroScene(stackIn_88_0, (byte) -55);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var1), "ub.I(" + param0 + ')');
        }
    }

    static {
        field_Cb = "<%highlight>STATISTICS SCREEN</col> - Pressing <%key>'SPACE'</col> will display a page showing statistics from the active colonies. Pressing <%key>'SPACE'</col> again will close it.";
        field_Bb = "Select source star system to issue fleet orders.";
        field_Eb = "You have not yet unlocked this option for use.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static AccountRequestResult createAccountSuccessResultFullInts(int param0, boolean param1) {
        AccountRequestResult var2 = null;
        AccountRequestResult var2Lifetime1;
        if (param0 == 93) {
          var2 = new AccountRequestResult(true);
          var2.field_b = param1 ? true : false;
          return var2;
        }
        field_Db = (String[][]) null;
        var2Lifetime1 = new AccountRequestResult(true);
        var2Lifetime1.field_b = param1 ? true : false;
        return var2Lifetime1;
    }
}
