/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static boolean field_e;
    static RgbSprite waterFarSprite;
    static boolean field_d;
    static String field_b;
    static String field_a;

    final static void appendChatHistory(int firstOutputIndex, ChatMessage message) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            BubbleDistortion.chatHistoryCategoryCounts[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; ScrollPane.chatHistorySize > var2_intLifetime1; var2_intLifetime1++) {
            if (message.channel == UnderwaterBackground.chatHistory[var2_intLifetime1].channel) {
              dupTemp$3 = UnderwaterBackground.chatHistory[var2_intLifetime1].getRetentionCategory(true);
              BubbleDistortion.chatHistoryCategoryCounts[dupTemp$3] = BubbleDistortion.chatHistoryCategoryCounts[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = message.getRetentionCategory(true);
          BubbleDistortion.chatHistoryCategoryCounts[dupTemp$0] = BubbleDistortion.chatHistoryCategoryCounts[dupTemp$0] + 1;
          var2_intLifetime2 = firstOutputIndex;
          for (var3 = 0; ScrollPane.chatHistorySize > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (message.channel == UnderwaterBackground.chatHistory[var3].channel) {
              var4 = UnderwaterBackground.chatHistory[var3].getRetentionCategory(true);
              if (WidgetTheme.chatHistoryCategoryLimit < BubbleDistortion.chatHistoryCategoryCounts[var4]) {
                BubbleDistortion.chatHistoryCategoryCounts[var4] = BubbleDistortion.chatHistoryCategoryCounts[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              UnderwaterBackground.chatHistory[incrementValue$2] = UnderwaterBackground.chatHistory[var3];
            }
          }
          ScrollPane.chatHistorySize = var2_intLifetime2;
          fieldTemp$1 = ScrollPane.chatHistorySize;
          ScrollPane.chatHistorySize = ScrollPane.chatHistorySize + 1;
          UnderwaterBackground.chatHistory[fieldTemp$1] = message;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("n.C(").append(firstOutputIndex).append(',');
          if (message == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        try {
          if (go.field_a != null) {
            try {
              go.field_a.seek(0, 0L);
              go.field_a.write(jl.incomingPackets.data, jl.incomingPackets.position, 24, -1);
            } catch (Exception exception) {
            }
          }
          if (param0 != -1) {
            field_a = (String) null;
          }
          jl.incomingPackets.position = jl.incomingPackets.position + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static RgbSprite buildRgbSprite(byte obfuscationGuard) {
        int var4_int = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        int var1 = jh.decodedSpriteWidths[0] * TextHotspotRegion.decodedSpriteHeights[0];
        if (obfuscationGuard != 21) {
          n.b(-24);
        }
        byte[] var2 = cn.decodedSpriteIndices[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
          var3[var4_int] = qp.decodedSpritePalette[ik.a(255, (int) var2[var4_int])];
        }
        RgbSprite var4 = new RgbSprite(cf.decodedCanvasWidth, ek.decodedCanvasHeight, ArrayWidgetGroup.decodedSpriteOffsetX[0], dl.decodedSpriteOffsetY[0], jh.decodedSpriteWidths[0], TextHotspotRegion.decodedSpriteHeights[0], var3);
        MotionWaypoint.clearDecodedSpriteData((byte) 96);
        return var4;
    }

    final boolean c(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != -26774) {
          return true;
        }
        stackIn_8_0 = (this == rq.field_c) || (this == IsaacGenerator.field_g) || (this == MenuButton.field_i);
        return stackIn_8_0;
    }

    public static void b(int param0) {
        field_a = null;
        waterFarSprite = null;
        if (param0 != -2) {
          return;
        }
        field_b = null;
    }

    final static void a(int param0, boolean param1, boolean param2, byte param3) {
        int stackIn_13_0 = 0;
        UiComponent stackIn_28_0 = null;
        String stackIn_29_1 = null;
        UiComponent stackIn_31_0 = null;
        String stackIn_32_1 = null;
        String stackIn_61_0 = null;
        UiComponent stackIn_73_0 = null;
        boolean stackIn_74_1 = false;
        UiComponent stackIn_78_0 = null;
        boolean stackIn_79_1 = false;
        UiComponent stackIn_83_0 = null;
        boolean stackIn_84_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        UiComponent var5 = null;
        UiComponent var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        UiComponent var15 = null;
        String var16 = null;
        UiComponent var17 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param3 != -76) {
            return;
          }
          co.a(IntArrayRequest.field_j, false);
          if (nl.pendingLobbyGame != null) {
            var15 = pf.field_h;
            var17 = var15;
            pf.field_h.height = 0;
            var17.width = 0;
            var5 = DraggableWidget.field_K;
            DraggableWidget.field_K.height = 0;
            var5.width = 0;
            var6 = AppletGameShell.field_e;
            AppletGameShell.field_e.height = 0;
            var6.width = 0;
            ba.field_v.text = DelayedPacket.field_n.toUpperCase();
            var7 = (MultiplayerMatch.field_d.width + 2) / 2;
            AppletGameShell.field_e.setBounds(40, -40 + MultiplayerMatch.field_d.height, 0, var7 - 2, (byte) 64);
            DraggableWidget.field_K.setBounds(40, MultiplayerMatch.field_d.height - 40, var7, MultiplayerMatch.field_d.width - var7, (byte) 64);
            if (1 == w.field_n.length &&
              w.field_n[0] == 2) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (var10 < w.field_n.length) {
                  stackIn_13_0 = ((rh.matchmakingChoiceMask[var10 / 8] & 1 << (7 & var10)) == 0) ? 0 : 1;
                  var11_int = stackIn_13_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    w.field_n[var10] != 2) {
                    var8 = 1;
                  } else {
                    var10++;
                    continue;
                  }
                }
                if (var9_int != 0) {
                  break;
                }
                var8 = 1;
                break;
              }
            }
            DraggableWidget.field_K.enabled = true;
            if (fh.pendingGameOptionsReceived) {
              GameUiController.field_e.enabled = false;
              t.field_f.text = gh.field_a;
              if (var8 != 0) {
                stackIn_61_0 = nj.field_F;
              } else {
                stackIn_61_0 = MatchingTextValidator.field_l;
              }
              var16 = stackIn_61_0;
              var9 = var16;
              var9 = var16;
              var9 = var16;
              var10Lifetime1 = AppletGameShell.field_e.font.measureText(var16) + AppletGameShell.field_e.font.getAdvance('.') * 3;
              AppletGameShell.field_e.horizontalAlignment = 0;
              if (16 == (BirthDateValidator.field_h & 48)) {
                var9 = var16 + ".";
              }
              AppletGameShell.field_e.textInset = (-var10Lifetime1 + AppletGameShell.field_e.width) / 2;
              if ((48 & BirthDateValidator.field_h) == 32) {
                var9 = (String) (var9) + "..";
              }
              if ((BirthDateValidator.field_h & 48) == 48) {
                var9 = (String) (var9) + "...";
              }
              AppletGameShell.field_e.text = (String) (var9);
              DraggableWidget.field_K.text = ValidationIconWidget.field_L.toUpperCase();
            } else {
              stackIn_28_0 = DraggableWidget.field_K;
              if (var8 == 0) {
                stackIn_29_1 = NewAchievementsScreen.field_F;
              } else {
                stackIn_29_1 = ArrayWidgetGroup.field_J;
              }
              stackIn_28_0.text = ((String) (Object) stackIn_29_1).toUpperCase();
              stackIn_31_0 = t.field_f;
              if (var8 == 0) {
                stackIn_32_1 = go.field_f;
              } else {
                stackIn_32_1 = LabeledWidget.field_G;
              }
              stackIn_31_0.text = rd.a(stackIn_32_1, new String[]{DraggableWidget.field_K.text}, (byte) 103);
              MeshAttributeRecord.field_g = true;
              AppletGameShell.field_e.text = SocialListEntry.field_Pb;
              GameUiController.field_e.enabled = true;
              if (ContextMenu.field_bc != null) {
                if (null == PlayerNameChooserPanel.field_J) {
                  PlayerNameChooserPanel.field_J = new byte[RankingsRequest.gameSettingCount];
                  SingleChildWidget.field_D = new boolean[RankingsRequest.gameSettingCount];
                }
                MusicVoiceMixer.field_s = false;
                MeshAttributeRecord.field_g = false;
                var13 = 0;
                var9_intLifetime1 = var13;
                while (RankingsRequest.gameSettingCount > var13) {
                  SingleChildWidget.field_D[var13] = false;
                  var13++;
                }
                ar.a(true, nl.pendingLobbyGame, -1, -1, -1, 0, RankingsRequest.gameSettingCount, 0);
                if (!(QuickChatHelpDialog.field_Yb < 2) &&
                  IntArrayRequest.heldKeys[12]) {
                  MeshAttributeRecord.field_g = true;
                }
              }
              if (!MeshAttributeRecord.field_g) {
                DraggableWidget.field_K.enabled = false;
                if (DraggableWidget.field_K.hovered) {
                  var9 = null;
                  if (MusicVoiceMixer.field_s) {
                    var9 = "<col=A00000>" + QuickChatMenu.field_ac + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; var10Lifetime1 < RankingsRequest.gameSettingCount; var10Lifetime1++) {
                    if (SingleChildWidget.field_D[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + QuickChatPhraseRegistry.field_b[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 == null) {
                        var9 = var11_ref;
                      } else {
                        var9 = (String) (var9) + ", " + var11_ref;
                      }
                    }
                  }
                  WidgetTextLayout.field_e = "<col=A00000>" + pf.field_a + "<br>" + AchievementsScreen.field_G + (String) (var9);
                }
              }
            }
          }
          stackIn_73_0 = NinjaBackground.field_w;
          stackIn_74_1 = (param1) && (!param2) && (!hc.field_c);
          ((UiComponent) (Object) stackIn_73_0).updateRoot(stackIn_74_1, -15211);
          stackIn_78_0 = MultiplayerMatch.field_d;
          stackIn_79_1 = (param1) && (!param2) && (!hc.field_c);
          ((UiComponent) (Object) stackIn_78_0).updateRoot(stackIn_79_1, -15211);
          stackIn_83_0 = wi.field_j;
          stackIn_84_1 = (param1) && (!param2) && (hc.field_c);
          ((UiComponent) (Object) stackIn_83_0).updateRoot(stackIn_84_1, -15211);
          sb.field_c.field_d.processTabPresses(0);
          if (nl.pendingLobbyGame != null) {
            if (GameUiController.field_e.pressedButton != 0) {
              ef.requestReturnToLobby(-22809, param0);
            }
            if (DraggableWidget.field_K.pressedButton != 0) {
              if (!fh.pendingGameOptionsReceived) {
                UnderwaterBackground.requestFindOpponents(param0, (byte) 98);
              } else {
                TextWidgetRenderer.requestCancelOpponentSearch(param3 + 276, param0);
              }
            }
            JungleBackground.a(param0, nl.pendingLobbyGame, true, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var4), "n.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_b = "You have entered another game.";
        field_a = "Name";
    }
}
