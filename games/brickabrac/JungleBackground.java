/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JungleBackground extends BackgroundScene {
    static RgbSprite[][] field_v;
    static String field_t;
    static IsaacGenerator field_r;
    static NodeDeque field_s;
    static String[] field_u;

    final void drawFullBackground(boolean obfuscationGuard, int scroll16, int destinationY, int colorIndex, int destinationX) {
        RasterCacheSurface var7;
        if (!obfuscationGuard) {
          field_v = (RgbSprite[][]) null;
        }
        if (!this.hasSprites((byte) -99)) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 640, 480, ro.jungleBackgroundColors[colorIndex], 16777215);
          if (BrickABrac.field_J) {
            var7 = PowerUp.a(this.sceneId, colorIndex, -20777);
            if (!var7.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
              ArchiveFetchClient.a(var7, np.jungleFarSprite, colorIndex, 1, 0, true);
              var7.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
            }
            ef.a(var7.sprite, dg.jungleMidSprite, destinationX, false, scroll16, destinationY, 0, colorIndex, 1, 640, ch.jungleNearSprite);
          }
        } else {
          var7 = PowerUp.a(this.sceneId, colorIndex, -20777);
          if (!var7.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            ArchiveFetchClient.a(var7, np.jungleFarSprite, colorIndex, 1, 0, true);
            var7.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          }
          ef.a(var7.sprite, dg.jungleMidSprite, destinationX, false, scroll16, destinationY, 0, colorIndex, 1, 640, ch.jungleNearSprite);
        }
    }

    final RgbSprite[] a(byte param0, int param1) {
        int var3 = -53 / ((65 - param0) / 49);
        return DualLinkNode.jungleCapsSprites[-1 + param1];
    }

    final RgbSprite a(boolean param0, int param1) {
        if (!param0) {
          this.hasSprites((byte) -1);
        }
        return up.jungleCentreSprites[param1 - 1];
    }

    final static void a(int param0, LobbyGame param1, boolean param2, boolean param3) {
        AlignedIconLabel dupTemp$0 = null;
        AlignedIconLabel[] dupTemp$1 = null;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        AlignedIconLabel stackIn_28_0 = null;
        boolean stackIn_29_1 = false;
        AlignedIconLabel stackIn_37_0 = null;
        boolean stackIn_38_1 = false;
        int stackIn_40_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_71_0 = 0;
        AlignedIconLabel stackIn_92_0 = null;
        boolean stackIn_93_1 = false;
        boolean stackIn_98_1 = false;
        AlignedIconLabel stackIn_101_0 = null;
        boolean stackIn_101_1 = false;
        AlignedIconLabel stackIn_102_0 = null;
        boolean stackIn_102_1 = false;
        boolean stackIn_102_2 = false;
        AlignedIconLabel stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        int stackIn_105_3 = 0;
        AlignedIconLabel stackIn_108_0 = null;
        AlignedIconLabel stackIn_109_0 = null;
        boolean stackIn_109_1 = false;
        AlignedIconLabel stackIn_114_0 = null;
        boolean stackIn_115_1 = false;
        int stackIn_117_0 = 0;
        int stackIn_121_0 = 0;
        AlignedIconLabel stackIn_137_0 = null;
        boolean stackIn_138_1 = false;
        AlignedIconLabel stackIn_142_0 = null;
        boolean stackIn_143_1 = false;
        AlignedIconLabel stackIn_148_0 = null;
        boolean stackIn_149_1 = false;
        AlignedIconLabel stackIn_153_0 = null;
        boolean stackIn_154_1 = false;
        int stackIn_157_0 = 0;
        String stackIn_173_0 = null;
        AlignedIconLabel stackIn_178_0 = null;
        boolean stackIn_179_1 = false;
        AlignedIconLabel stackIn_181_0 = null;
        boolean stackIn_182_1 = false;
        int stackIn_184_0 = 0;
        boolean stackIn_187_0 = false;
        int stackIn_191_0 = 0;
        int stackIn_248_0 = 0;
        int stackIn_261_0 = 0;
        boolean stackIn_358_0 = false;
        int stackIn_364_0 = 0;
        AlignedIconLabel stackIn_376_0;
        boolean stackIn_376_1;
        int stackIn_376_2;
        int stackIn_376_3;
        AlignedIconLabel stackIn_377_0 = null;
        int stackIn_377_1 = 0;
        int stackIn_377_2 = 0;
        AlignedIconLabel stackIn_380_0 = null;
        AlignedIconLabel stackIn_381_0 = null;
        boolean stackIn_381_1 = false;
        AlignedIconLabel stackIn_388_0 = null;
        boolean stackIn_388_1 = false;
        AlignedIconLabel stackIn_389_0 = null;
        boolean stackIn_389_1 = false;
        boolean stackIn_389_2 = false;
        AlignedIconLabel stackIn_395_0 = null;
        boolean stackIn_396_1 = false;
        AlignedIconLabel stackIn_401_0 = null;
        boolean stackIn_402_1 = false;
        int stackIn_404_0 = 0;
        int stackIn_406_0 = 0;
        RuntimeException stackIn_415_0 = null;
        StringBuilder stackIn_415_1 = null;
        String stackIn_416_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_97_1;
        boolean stackOut_186_0;
        boolean stackOut_357_0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        AlignedIconLabel[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        AlignedIconLabel var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        int var22_int = 0;
        Object var22 = null;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        AlignedIconLabel[] var27 = null;
        AlignedIconLabel var28 = null;
        AlignedIconLabel var29 = null;
        String var30 = null;
        String var31 = null;
        Object var25Lifetime1;
        Object var25Lifetime2;
        Object var25Lifetime3;
        Object var25Lifetime1Lifetime1;
        int stackIn_364_0Lifetime1;
        int stackIn_404_0Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var8_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var16Lifetime2;
        var26 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param2) {
            stackIn_6_0 = (!fh.pendingGameOptionsReceived) ? 1 : 0;
            var4_int = stackIn_6_0;
          }
          if (!param2 ||
            var26 != 0) {
            if (!hn.b((byte) 7)) {
              stackIn_13_0 = 0;
            } else {
              stackIn_13_0 = (!param1.started) ? 1 : 0;
            }
            var4_int = stackIn_13_0;
          }
          var5 = param3 ? 1 : 0;
          if (!param2) {
            var6 = 0;
            while (true) {
              if (var6 < 5) {
                stackIn_40_0 = var4_int;
                if (var26 == 0) {
                  if (stackIn_40_0 != 0 &&
                    MatchCompleteScreen.field_A[0][1 + var6].pressedButton != 0 &&
                    param1.joinSortPriority != var6) {
                    param1.joinSortPriority = var6;
                    var5 = 1;
                  }
                  stackIn_28_0 = MatchCompleteScreen.field_A[0][var6 + 1];
                  stackIn_29_1 = (var4_int != 0);
                  stackIn_28_0.enabled = stackIn_29_1;
                  if (!vd.field_e &&
                    var6 == 3) {
                    MatchCompleteScreen.field_A[0][var6 + 1].enabled = false;
                  }
                  stackIn_37_0 = MatchCompleteScreen.field_A[0][var6 + 1];
                  stackIn_38_1 = (var6 == param1.joinSortPriority);
                  stackIn_37_0.selected = stackIn_38_1;
                  var6++;
                  continue;
                }
              } else {
                stackIn_40_0 = MatchCompleteScreen.field_A[0][2].hovered ? 1 : 0;
              }
              if (stackIn_40_0 == 0) {
                break;
              }
              if (!hn.b((byte) 7)) {
                ep.field_e = rd.a(ChocolateBackground.field_t, new String[]{o.currentLobbyGame.displayName}, (byte) 103);
                if (var26 == 0) {
                  break;
                }
              }
              ep.field_e = rq.field_d;
              break;
            }
          }
          boolean decompiledFrameCompleted3 = true;
          if (w.field_n.length >= 2) {
            if (param2 &&
              BubbleDistortion.field_z != -1) {
              stackIn_52_0 = 1;
            } else {
              stackIn_52_0 = 0;
            }
            boolean decompiledFrameCompleted4 = true;
            var6Lifetime1 = stackIn_52_0;
            if (var6Lifetime1 != 0) {
              var7 = BubbleDistortion.field_z;
              var8_int = 0;
              while (rh.matchmakingChoiceMask.length > var8_int) {
                rh.matchmakingChoiceMask[var8_int] = (byte) 0;
                var8_int++;
                if (var26 != 0) {
                  decompiledFrameCompleted4 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted4) {
                rh.matchmakingChoiceMask[var7 / 8] = (byte)LevelSelectScreen.d((int) rh.matchmakingChoiceMask[var7 / 8], 1 << var7 % 8);
              }
            }
            stackIn_63_0 = (param2) ? -1 : 0;
            var7 = stackIn_63_0;
            while (!(w.field_n.length <= var7)) {
              stackIn_117_0 = var6Lifetime1;
              if (var26 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
              if (stackIn_117_0 != 0 &&
                var7 != BubbleDistortion.field_z) {
                stackIn_71_0 = 1;
              } else {
                stackIn_71_0 = 0;
              }
              var8_intLifetime1 = stackIn_71_0;
              if (var4_int != 0 &&
                MatchCompleteScreen.field_A[1][1 + var7].pressedButton != 0) {
                if (!param2) {
                  var9 = w.field_n[var7];
                  if (param1.maxPlayers != var9) {
                    var5 = 1;
                    param1.maxPlayers = var9;
                  }
                } else {
                  if (var6Lifetime1 == 0) {
                    if (var7 != -1) {
                      rh.matchmakingChoiceMask[var7 / 8] = (byte)LevelResultSubmission.a((int) rh.matchmakingChoiceMask[var7 / 8], 1 << ik.a(var7, 7));
                    } else {
                      var9 = 0;
                      while (!(var9 >= rh.matchmakingChoiceMask.length)) {
                        rh.matchmakingChoiceMask[var9] = (byte) 0;
                        var9++;
                      }
                    }
                  }
                }
              }
              if (!param2) {
                var9 = w.field_n[var7];
                stackIn_92_0 = MatchCompleteScreen.field_A[1][1 + var7];
                stackIn_93_1 = (var9 == param1.maxPlayers);
                stackIn_92_0.selected = stackIn_93_1;
              } else if (var7 == -1) {
                MatchCompleteScreen.field_A[1][1 + var7].selected = true;
                var9 = 0;
                while (w.field_n.length > var9) {
                  dupTemp$0 = MatchCompleteScreen.field_A[1][var7 + 1];
                  stackIn_105_0 = dupTemp$0;
                  stackOut_97_1 = dupTemp$0.selected;
                  stackIn_105_1 = stackOut_97_1 ? 1 : 0;
                  stackIn_98_1 = stackOut_97_1;
                  stackIn_105_2 = ~(rh.matchmakingChoiceMask[var9 / 8] & 1 << (var9 & 7));
                  stackIn_105_3 = -1;
                  stackIn_101_0 = stackIn_105_0;
                  stackIn_101_1 = stackIn_98_1;
                  if (stackIn_105_2 != stackIn_105_3) {
                    stackIn_102_0 = stackIn_101_0;
                    stackIn_102_1 = stackIn_101_1;
                    stackIn_102_2 = false;
                  } else {
                    stackIn_102_0 = stackIn_105_0;
                    stackIn_102_1 = stackIn_98_1;
                    stackIn_102_2 = true;
                  }
                  stackIn_102_0.selected = stackIn_102_1 & stackIn_102_2;
                  var9++;
                }
              } else {
                stackIn_105_0 = MatchCompleteScreen.field_A[1][1 + var7];
                stackIn_105_1 = 0;
                stackIn_105_2 = rh.matchmakingChoiceMask[var7 / 8];
                stackIn_105_3 = 1 << (var7 & 7);
                stackIn_108_0 = stackIn_105_0;
                if (stackIn_105_1 == (stackIn_105_2 & stackIn_105_3)) {
                  stackIn_109_0 = stackIn_108_0;
                  stackIn_109_1 = false;
                } else {
                  stackIn_109_0 = stackIn_105_0;
                  stackIn_109_1 = true;
                }
                stackIn_109_0.selected = stackIn_109_1;
              }
              stackIn_114_0 = MatchCompleteScreen.field_A[1][var7 + 1];
              stackIn_115_1 = (var4_int != 0) && (var8_intLifetime1 == 0);
              stackIn_114_0.enabled = stackIn_115_1;
              var7++;
            }
          }
          if (decompiledFrameCompleted3) {
            stackIn_117_0 = param2 ? 1 : 0;
          }
          stackIn_121_0 = (stackIn_117_0 == 0) ? 1 : 0;
          var6Lifetime2 = stackIn_121_0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var6Lifetime2 >= 3))) {
            var28 = MatchCompleteScreen.field_A[2][var6Lifetime2];
            stackIn_157_0 = var4_int;
            if (var26 == 0) {
              boolean decompiledFrameRemainder2 = true;
              if (stackIn_157_0 != 0 &&
                0 != var28.pressedButton) {
                if (!param2) {
                  if ((param1.spectatorMode != var6Lifetime2)) {
                    var5 = 1;
                    param1.spectatorMode = var6Lifetime2;
                  }
                  decompiledFrameRemainder2 = false;
                }
                else {
                  if (var6Lifetime2 != 0) {
                    ResourceArchive.matchmakingOptionByteTwo = ResourceArchive.matchmakingOptionByteTwo ^ var6Lifetime2;
                  } else {
                    ResourceArchive.matchmakingOptionByteTwo = 0;
                  }
                }
              }
              stackIn_137_0 = var28;
              stackIn_138_1 = (var4_int != 0);
              stackIn_137_0.enabled = stackIn_138_1;
              if (!param2) {
                stackIn_142_0 = var28;
                stackIn_143_1 = ((param1.spectatorMode & var6Lifetime2) != 0);
                stackIn_142_0.selected = stackIn_143_1;
              } else if (0 == var6Lifetime2) {
                stackIn_148_0 = var28;
                stackIn_149_1 = (ResourceArchive.matchmakingOptionByteTwo == 0);
                stackIn_148_0.selected = stackIn_149_1;
              } else {
                stackIn_153_0 = var28;
                stackIn_154_1 = (0 != (ResourceArchive.matchmakingOptionByteTwo & var6Lifetime2));
                stackIn_153_0.selected = stackIn_154_1;
              }
              var6Lifetime2++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_157_0 = param2 ? 1 : 0;
          }
          boolean decompiledFrameCompleted2 = true;
          if (stackIn_157_0 != 0 &&
            IntArrayRequest.field_t > 1) {
            var6Lifetime2 = 0;
            while (!(var6Lifetime2 >= IntArrayRequest.field_t + 1)) {
              var29 = MatchCompleteScreen.field_A[3][var6Lifetime2];
              stackIn_184_0 = var4_int;
              if (var26 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
              if (stackIn_184_0 != 0 &&
                var29.pressedButton != 0) {
                bb.matchmakingOptionByteOne = var6Lifetime2;
              }
              if (var29.hovered &&
                var6Lifetime2 > 0) {
                if (null != QuickChatParameterType.field_a) {
                  stackIn_173_0 = QuickChatParameterType.field_a[-1 + var6Lifetime2];
                } else {
                  stackIn_173_0 = null;
                }
                var8 = stackIn_173_0;
                if (var8 != null) {
                  ep.field_e = var8;
                }
              }
              stackIn_178_0 = var29;
              stackIn_179_1 = (bb.matchmakingOptionByteOne == var6Lifetime2);
              stackIn_178_0.selected = stackIn_179_1;
              stackIn_181_0 = var29;
              stackIn_182_1 = (var4_int != 0);
              stackIn_181_0.enabled = stackIn_182_1;
              var6Lifetime2++;
            }
          }
          if (decompiledFrameCompleted2) {
            var6Lifetime2 = 0;
            stackIn_184_0 = 0;
          }
          var7 = stackIn_184_0;
          scanLoop1: while (true) {
            if (RankingsRequest.gameSettingCount > var7) {
              dupTemp$1 = MatchCompleteScreen.field_A[var7 + 4];
              var27 = dupTemp$1;
              var8_array = dupTemp$1;
              stackOut_186_0 = param2;
              stackIn_406_0 = stackOut_186_0 ? 1 : 0;
              stackIn_187_0 = stackOut_186_0;
              if (var26 != 0) {
                break scanLoop1;
              }
              stackIn_191_0 = (stackIn_187_0) ? -1 : 0;
              var9 = stackIn_191_0;
              while (var9 < var27.length - 1) {
                var10 = 0;
                var11 = 0;
                var12 = 0;
                var13 = 0;
                var14 = 0;
                var15 = 0;
                stackIn_404_0 = var4_int;
                if (stackIn_404_0 != 0 &&
                  var9 >= 0) {
                  if (null != me.field_e &&
                    me.field_e[var7] != null &&
                    0 < (me.field_e[var7][var9] & ~qn.field_f)) {
                    var15 = r.a((byte) -82, me.field_e[var7][var9] & ~qn.field_f);
                    var14 = 1;
                  }
                  if (null != NodeDeque.field_a &&
                    NodeDeque.field_a[var7] != null &&
                    0 >= go.field_c &&
                    NodeDeque.field_a[var7][var9]) {
                    var10 = 1;
                  }
                  if (null != AchievementsScreen.field_F &&
                    AchievementsScreen.field_F[var7] != null) {
                    var16 = AchievementsScreen.field_F[var7][var9];
                    if (var16 != 0 &&
                      !ea.field_g &&
                      go.field_c <= 0) {
                      var10 = 1;
                    }
                    if (0 < var16 &&
                      var16 > m.field_h) {
                      var12 = 1;
                    }
                  }
                  if (null != MatchResultScreen.field_v &&
                    MatchResultScreen.field_v[var7] != null) {
                    var16Lifetime2 = MatchResultScreen.field_v[var7][var9];
                    if (0 < var16Lifetime2 &&
                      ArchiveIndex.field_s < var16Lifetime2) {
                      var11 = 1;
                    }
                    if (0 != var16Lifetime2 &&
                      !ea.field_g &&
                      0 >= go.field_c) {
                      var10 = 1;
                    }
                  }
                  if (param2 &&
                    MotionWaypoint.field_r != null &&
                    null != MotionWaypoint.field_r[var7] &&
                    MotionWaypoint.field_r[var7][var9]) {
                    stackIn_248_0 = 1;
                  } else {
                    stackIn_248_0 = 0;
                  }
                  var13 = stackIn_248_0;
                }
                if (QuickChatHelpDialog.field_Yb >= 2 &&
                  IntArrayRequest.heldKeys[12]) {
                  var11 = 0;
                  var12 = 0;
                  var10 = 0;
                  var13 = 0;
                  var14 = 0;
                }
                if (var10 == 0 &&
                  var11 == 0 &&
                  var12 == 0 &&
                  var13 == 0 &&
                  var14 == 0) {
                  stackIn_261_0 = 0;
                } else {
                  stackIn_261_0 = 1;
                }
                var16Lifetime1 = stackIn_261_0;
                MeshAttributeRecord.field_g = true;
                if (var16Lifetime1 == 0 &&
                  var9 >= 0 &&
                  ContextMenu.field_bc != null && (!param2 ||
                  !fh.pendingGameOptionsReceived)) {
                  if (qo.field_J == null) {
                    SingleChildWidget.field_D = new boolean[RankingsRequest.gameSettingCount];
                    qo.field_J = new byte[RankingsRequest.gameSettingCount];
                  }
                  MeshAttributeRecord.field_g = false;
                  MusicVoiceMixer.field_s = false;
                  var17_int = 0;
                  while (true) {
                    if (var7 > var17_int) {
                      SingleChildWidget.field_D[var17_int] = false;
                      var17_int++;
                      continue;
                    }
                    ar.a(param2, param1, var9, -1, -1, 0, var7, 0);
                    if (2 <= QuickChatHelpDialog.field_Yb &&
                      IntArrayRequest.heldKeys[12]) {
                      MeshAttributeRecord.field_g = true;
                    }
                    if (MeshAttributeRecord.field_g) {
                      break;
                    }
                    var16Lifetime1 = 1;
                    break;
                  }
                }
                boolean decompiledFrameRemainder1 = true;
                var17 = var27[var9 + 1];
                if (var4_int != 0 &&
                  0 != var17.pressedButton) {
                  if (param2) {
                    if (-1 == var9) {
                      var18 = var6Lifetime2;
                      while (-1 + (var6Lifetime2 + var27.length) > var18) {
                        PowerUpWarning.matchmakingSettingMask[var18 / 8] = (byte)ik.a((int) PowerUpWarning.matchmakingSettingMask[var18 / 8], ~(1 << ik.a(7, var18)));
                        var18++;
                      }
                    } else {
                      PowerUpWarning.matchmakingSettingMask[(var9 + var6Lifetime2) / 8] = (byte)LevelResultSubmission.a((int) PowerUpWarning.matchmakingSettingMask[(var9 + var6Lifetime2) / 8], 1 << ik.a(7, var6Lifetime2 + var9));
                    }
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (var16Lifetime1 == 0 &&
                      param1.settings[var7] != (byte)var9) {
                      var5 = 1;
                      param1.settings[var7] = (byte)var9;
                    }
                  }
                }
                if (param2 &&
                  var16Lifetime1 != 0) {
                  PowerUpWarning.matchmakingSettingMask[(var9 + var6Lifetime2) / 8] = (byte)ik.a((int) PowerUpWarning.matchmakingSettingMask[(var9 + var6Lifetime2) / 8], ~(1 << ik.a(var9 + var6Lifetime2, 7)));
                }
                if (var9 >= 0 &&
                  var17.hovered) {
                  if (null == SecondaryHashTable.field_c) {
                    var18_ref = null;
                  } else {
                    if (null != SecondaryHashTable.field_c[var7]) {
                      var18_ref = SecondaryHashTable.field_c[var7][var9];
                    } else {
                      var18_ref = null;
                    }
                  }
                  if (ff.field_i == null) {
                    var19 = null;
                  } else {
                    if (null == ff.field_i[var7]) {
                      var19 = null;
                    } else {
                      var19 = ff.field_i[var7][var9];
                    }
                  }
                  var20 = null;
                  if (var19 != null &&
                    !((String) (var19)).equals(var18_ref)) {
                    var20 = var19;
                  }
                  var21 = null;
                  if (var13 == 0) {
                    if (var10 == 0) {
                      if (var11 != 0) {
                        var22_int = MatchResultScreen.field_v[var7][var9] - ArchiveIndex.field_s;
                        if (var22_int != 1) {
                          var21 = rd.a(tq.field_e, new String[]{Integer.toString(var22_int)}, (byte) 103);
                        } else {
                          var21 = ta.field_a;
                        }
                      }
                      if (var12 != 0) {
                        var30 = rd.a(QuickChatPhraseDefinition.field_x, new String[]{Integer.toString(m.field_h), Integer.toString(AchievementsScreen.field_F[var7][var9])}, (byte) 103);
                        var21 = var30;
                        var21 = var30;
                        if (null == var21) {
                          var21 = var30;
                        } else {
                          var21 = (String) (var21) + "<br>" + var30;
                        }
                      }
                      if (var14 != 0) {
                        var22 = InstructionsScreen.field_t;
                        if (var15 > 0 &&
                          eb.field_p != null &&
                          eb.field_p.length >= var15 &&
                          null != eb.field_p[var15 - 1]) {
                          var22 = eb.field_p[-1 + var15][0];
                        }
                        if (null == var21) {
                          var21 = var22;
                        } else {
                          var21 = (String) (var21) + "<br>" + (String) (var22);
                          var22 = var21;
                          var25 = var22;
                          var22 = var25;
                          var21 = var22;
                          var25Lifetime2 = var21;
                          var22 = var25Lifetime2;
                          var25Lifetime3 = var22;
                          var22 = var25Lifetime3;
                          var21 = var22;
                          var22 = var25Lifetime3;
                        }
                      }
                    } else {
                      var21 = PacketBuffer.field_m;
                    }
                  } else {
                    var21 = fe.field_ib;
                  }
                  if (var4_int != 0 &&
                    !MeshAttributeRecord.field_g) {
                    var22 = null;
                    var23 = 0;
                    if (MusicVoiceMixer.field_s) {
                      var22 = "</col>" + QuickChatMenu.field_ac + "<col=A00000>";
                      var25Lifetime1 = var22;
                      var22 = var25Lifetime1;
                      var25Lifetime1Lifetime1 = var22;
                      var22 = var25Lifetime1Lifetime1;
                      var21 = var22;
                    }
                    var24 = 0;
                    while (true) {
                      if (var24 < var7) {
                        stackOut_357_0 = SingleChildWidget.field_D[var24];
                        stackIn_364_0 = stackOut_357_0 ? 1 : 0;
                        stackIn_358_0 = stackOut_357_0;
                        if (stackIn_358_0) {
                          var25_ref = "</col>" + QuickChatPhraseRegistry.field_b[var24] + "<col=A00000>";
                          var22 = var25_ref;
                          var22 = var25_ref;
                          if (null == var22) {
                            var22 = var25_ref;
                          } else {
                            var22 = (String) (var22) + ", " + var25_ref;
                            var21 = var22;
                            var21 = var22;
                            var23 = 1;
                          }
                        }
                        var24++;
                        continue;
                      }
                      stackIn_364_0Lifetime1 = var23;
                      if (stackIn_364_0Lifetime1 != 0) {
                        var21 = FileCacheStore.field_e + (String) (var22);
                        break;
                      }
                      var21 = rd.a(fh.field_b, new String[]{(String) (var22)}, (byte) 103);
                      break;
                    }
                  }
                  if (var21 != null) {
                    var21 = "<col=A00000>" + (String) (var21);
                    var31 = tb.a("<br><col=A00000>", (String) (var21), true, "<br>");
                    if (var20 != null) {
                      var20 = (String) (var20) + "<br>" + var31;
                    } else {
                      var20 = var31;
                    }
                  }
                  if (null != var20) {
                    ep.field_e = (String) (var20);
                  }
                }
                boolean decompiledFrameRemainder0 = true;
                boolean decompiledFrameCompleted0 = true;
                if (param2) {
                  boolean decompiledFrameCompleted1 = true;
                  if (-1 == var9) {
                    while (true) {
                      var17.selected = true;
                      var18Lifetime1 = var6Lifetime2;
                      while (var27.length + var6Lifetime2 - 1 > var18Lifetime1) {
                        stackIn_376_0 = var17;
                        stackIn_376_1 = var17.selected;
                        stackIn_376_2 = 0;
                        stackIn_376_3 = PowerUpWarning.matchmakingSettingMask[var18Lifetime1 / 8] & 1 << (7 & var18Lifetime1);
                        stackIn_388_0 = stackIn_376_0;
                        stackIn_388_1 = stackIn_376_1;
                        if (stackIn_376_2 != stackIn_376_3) {
                          stackIn_389_0 = stackIn_388_0;
                          stackIn_389_1 = stackIn_388_1;
                          stackIn_389_2 = false;
                        } else {
                          stackIn_389_0 = stackIn_376_0;
                          stackIn_389_1 = stackIn_376_1;
                          stackIn_389_2 = true;
                        }
                        stackIn_389_0.selected = stackIn_389_1 & stackIn_389_2;
                        var18Lifetime1++;
                      }
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                  }
                  if (decompiledFrameCompleted1) {
                    stackIn_377_0 = var17;
                    stackIn_377_1 = 0;
                    stackIn_377_2 = PowerUpWarning.matchmakingSettingMask[(var9 + var6Lifetime2) / 8] & 1 << (var9 + var6Lifetime2 & 7);
                    while (true) {
                      stackIn_380_0 = stackIn_377_0;
                      if (stackIn_377_1 == stackIn_377_2) {
                        stackIn_381_0 = stackIn_380_0;
                        stackIn_381_1 = false;
                      } else {
                        stackIn_381_0 = stackIn_377_0;
                        stackIn_381_1 = true;
                      }
                      stackIn_381_0.selected = stackIn_381_1;
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                  }
                  decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted0)) {
                  stackIn_395_0 = var17;
                  stackIn_396_1 = (MeshAttributeRecord.field_g) && ((byte)var9 == param1.settings[var7]);
                  stackIn_395_0.selected = stackIn_396_1;
                }
                stackIn_401_0 = var17;
                stackIn_402_1 = (var4_int != 0) && (var16Lifetime1 == 0);
                stackIn_401_0.enabled = stackIn_402_1;
                var9++;
              }
              stackIn_404_0Lifetime1 = var6Lifetime2 + (255 & BufferedFile.gameSettingBitWidths[var7]);
              var6Lifetime2 = stackIn_404_0Lifetime1;
              var7++;
              continue scanLoop1;
            }
            stackIn_406_0 = var5;
            break;
          }
          if (stackIn_406_0 != 0) {
            if (param2) {
              return;
            }
            ea.requestUpdateGameOptions(-11008, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_415_0 = var4;
          stackIn_415_1 = new StringBuilder().append("ip.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_416_2 = "null";
          } else {
            stackIn_416_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_415_0), ((StringBuilder) (Object) stackIn_415_1).append(stackIn_416_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean hasSprites(byte obfuscationGuard) {
        boolean stackIn_13_0 = false;
        LobbyGame var3;
        if (obfuscationGuard >= -91) {
          var3 = (LobbyGame) null;
          JungleBackground.a(81, (LobbyGame) null, true, true);
        }
        stackIn_13_0 = (null != ch.jungleNearSprite) && (null != dg.jungleMidSprite) && (np.jungleFarSprite != null) && (null != Brick.jungleSmallSprite) && (null != ep.jungleCharacterSprite) && (DualLinkNode.jungleCapsSprites != null) && (DualLinkIterator.jungleSegsSprites != null) && (null != up.jungleCentreSprites);
        return stackIn_13_0;
    }

    JungleBackground(int sceneId, String musicName, String soundEffectPrefix, int soundEffectCount) {
        super(sceneId, musicName, soundEffectPrefix, soundEffectCount);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          DualLinkNode.jungleCapsSprites = new RgbSprite[2][];
          up.jungleCentreSprites = new RgbSprite[2];
          DualLinkIterator.jungleSegsSprites = new RgbSprite[2][];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ip.<init>(").append(sceneId).append(',');
          if (musicName == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_0 = stackIn_6_0;
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (soundEffectPrefix == null) {
            stackIn_11_0 = stackIn_10_0;
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = stackIn_6_0;
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(soundEffectCount).append(')').toString());
        }
    }

    final RgbSprite[] a(int param0, boolean param1) {
        if (!param1) {
          field_t = (String) null;
        }
        return DualLinkIterator.jungleSegsSprites[param0 - 1];
    }

    final void drawPreview(byte obfuscationGuard, int colorIndex, int destinationX, int destinationY) {
        int var5;
        if (colorIndex > -1) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, ro.jungleBackgroundColors[colorIndex], 16777215);
        }
        if (colorIndex <= -1 ||
          BrickABrac.field_J) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, 16777215, 11184810);
        }
        if (this.hasSprites((byte) -125)) {
          Brick.jungleSmallSprite.drawTransparent(destinationX, destinationY);
        }
        var5 = 107 / ((obfuscationGuard + 28) / 43);
    }

    final RgbSprite c(byte param0) {
        if (param0 > -74) {
          this.hasSprites((byte) -112);
        }
        return ep.jungleCharacterSprite;
    }

    public static void b(boolean param0) {
        field_t = null;
        field_u = null;
        field_v = (RgbSprite[][]) null;
        field_s = null;
        if (param0) {
          field_v = (RgbSprite[][]) null;
        }
        field_r = null;
    }

    final void drawSplitBackground(int destinationY, byte obfuscationGuard, int destinationX, int colorIndex, int scroll16) {
        RasterCacheSurface var7;
        if (!this.hasSprites((byte) -95)) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 306, 480, ro.jungleBackgroundColors[colorIndex], 16777215);
          if (BrickABrac.field_J) {
            var7 = kd.a(this.sceneId, colorIndex, (byte) -121);
            if (!var7.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
              ArchiveFetchClient.a(var7, WidgetGroup.field_E, colorIndex, 2, -13, true);
              var7.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
            }
            ef.a(var7.sprite, HuffmanCodec.field_e, destinationX, false, scroll16, destinationY, -13, colorIndex, 2, 306, sl.field_D);
          }
        } else {
          var7 = kd.a(this.sceneId, colorIndex, (byte) -121);
          if (!var7.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            ArchiveFetchClient.a(var7, WidgetGroup.field_E, colorIndex, 2, -13, true);
            var7.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          }
          ef.a(var7.sprite, HuffmanCodec.field_e, destinationX, false, scroll16, destinationY, -13, colorIndex, 2, 306, sl.field_D);
        }
        if (obfuscationGuard >= -84) {
          field_t = (String) null;
        }
    }

    final boolean loadSprites(boolean obfuscationGuard) {
        if (!AchievementIcon.field_m.ensureGroupAvailableByName("jungle", -28138)) {
          return false;
        }
        ch.jungleNearSprite = pl.loadRgbSpriteByName("jungle", "jungle_near", (byte) -39, AchievementIcon.field_m);
        dg.jungleMidSprite = pl.loadRgbSpriteByName("jungle", "jungle_mid", (byte) -67, AchievementIcon.field_m);
        np.jungleFarSprite = pl.loadRgbSpriteByName("jungle", "jungle_far", (byte) -46, AchievementIcon.field_m);
        Brick.jungleSmallSprite = pl.loadRgbSpriteByName("jungle", "jungle_small", (byte) -109, AchievementIcon.field_m);
        sl.field_D = jh.a(0, ch.jungleNearSprite);
        HuffmanCodec.field_e = jh.a(0, dg.jungleMidSprite);
        WidgetGroup.field_E = jh.a(0, np.jungleFarSprite);
        ep.jungleCharacterSprite = pl.loadRgbSpriteByName("jungle", "jungle_character", (byte) -119, AchievementIcon.field_m);
        DualLinkNode.jungleCapsSprites[0] = cr.loadRgbSpritesByName("jungle", AchievementIcon.field_m, "jungle_caps", 2);
        DualLinkIterator.jungleSegsSprites[0] = cr.loadRgbSpritesByName("jungle", AchievementIcon.field_m, "jungle_segs", 2);
        up.jungleCentreSprites[0] = pl.loadRgbSpriteByName("jungle", "jungle_centre", (byte) -110, AchievementIcon.field_m);
        DualLinkNode.jungleCapsSprites[1] = ig.a(DualLinkNode.jungleCapsSprites[0], false);
        DualLinkIterator.jungleSegsSprites[1] = ig.a(DualLinkIterator.jungleSegsSprites[0], obfuscationGuard);
        up.jungleCentreSprites[1] = pl.a(-16371, up.jungleCentreSprites[0]);
        return true;
    }

    static {
        field_t = "Accept";
        field_u = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_s = new NodeDeque();
    }
}
