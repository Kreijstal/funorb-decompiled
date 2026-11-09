/*
 * Decompiled by CFR-JS 0.4.0.
 */
class MenuScreen {
    private MenuSelectionController field_g;
    private int field_c;
    static int field_f;
    private int screenId;
    private int field_d;
    private int field_e;
    static IntrusiveDeque field_b;
    static ToolkitSprite[] field_a;

    private final void a(boolean param0, int param1, int param2) {
        int stackIn_7_0 = 0;
        Object stackIn_57_0;
        int stackIn_57_1;
        int stackIn_57_2;
        int stackIn_57_3;
        int stackIn_57_4;
        int stackIn_57_5;
        int stackIn_59_6;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_127_6;
        Object stackIn_128_0;
        int stackIn_128_1;
        int stackIn_128_2;
        int stackIn_128_3;
        int stackIn_128_4;
        int stackIn_128_5;
        int stackIn_150_0 = 0;
        int stackIn_150_1 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        boolean[] var10 = null;
        boolean[] var11 = null;
        boolean[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        String var17_ref_String = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        int var20_int = 0;
        int var21 = 0;
        GraphicsToolkit var22 = null;
        String var17_ref_StringLifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var13Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var18Lifetime2;
        int var19Lifetime2;
        int var8Lifetime2Lifetime1;
        int var8Lifetime2Lifetime2;
        int var8Lifetime2Lifetime3;
        int var13Lifetime1Lifetime1;
        int var13Lifetime1Lifetime2;
        int var13Lifetime1Lifetime3;
        var21 = Sumoblitz.field_L ? 1 : 0;
        var22 = MatchingTextValidator.field_h.getToolkit(-106);
        var5 = 16777215 | param2 << 24;
        var6 = 16777215 | param2 << 23;
        var7 = param2 << 24;
        var8 = 53;
        var9 = Js5Client.achievementsText;
        if (param0) {
          var9 = SoftLruCache.achievementsThisGameText;
        }
        var10 = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
        var11 = new boolean[]{false, false, false, true, true, false, false, false, false, true, true, true, false, true, false, true, false, false, false, false, true, true, false, true, true, false, true, false};
        var12 = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false, false, false, false, false, false, false, true, false, false, true};
        DelegatingCanvas.a(up.field_c, 380, -5, param2 << 24, 3, var22, 650, 55, 1, true);
        var8Lifetime1 = 35;
        if (param1 >= -56) {
          return;
        }
        this.a(var9, param2, 29228);
        var13 = 117;
        if (!param0) {
          stackIn_7_0 = kh.field_e;
        } else {
          stackIn_7_0 = OpenGlTransparentWaterEffect.field_e;
        }
        var14 = stackIn_7_0;
        var15 = -1;
        var16 = 0;
        var17 = 0;
        scanLoop1: while (true) {
          boolean decompiledFrameRemainder1 = true;
          if (var17 < 28) {
            stackIn_150_0 = -1;
            stackIn_150_1 = ~var16;
            if (var21 != 0) {
              if (stackIn_150_0 > stackIn_150_1) {
                stackIn_67_0 = ~var16;
                stackIn_67_1 = -1;
                break scanLoop1;
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              if (stackIn_150_0 != stackIn_150_1 &&
                var16 % 9 == 0) {
                var13 += 64;
                var8Lifetime1 = 35;
              }
              if ((var14 & 1 << var17) != 0 ||
                !param0 ||
                var21 != 0) {
                var18 = var8Lifetime1;
                var19 = var13;
                if (var18 <= ko.field_p &&
                  (var18 + 48) >= ko.field_p &&
                  pi.field_e >= var19 &&
                  pi.field_e <= var19 + 48 && (!var12[var17] ||
                  (var14 & 1 << var17) != 0)) {
                  var15 = var17;
                }
                if (~var17 != ~this.field_c) {
                }
                if (!var12[var17] ||
                  0 != (1 << var17 & var14)) {
                  var8Lifetime1 += 65;
                  var16++;
                }
              }
              var17++;
              continue;
            }
          }
          if (decompiledFrameRemainder1) {
            var13 = 117;
            var16 = 0;
            var8Lifetime1 = 35;
            var17 = 0;
            while (28 > var17) {
              stackIn_67_0 = ~var16;
              stackIn_67_1 = -1;
              if (var21 != 0) {
                break scanLoop1;
              }
              if (stackIn_67_0 != stackIn_67_1 &&
                var16 % 9 == 0) {
                var8Lifetime1 = 35;
                var13 += 64;
              }
              boolean decompiledFrameRemainder0 = true;
              var18Lifetime2 = var8Lifetime1;
              var19Lifetime2 = var13;
              var20 = null;
              if ((var14 & 1 << var17) == 0) {
                decompiledFrameRemainder0 = (!(param0) ||
                  var21 != 0);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = !(var12[var17]))) {
                  if (HardwareRidgedWaterNoise.field_x <= 0 &&
                    var10[var17]) {
                    var20 = uj.field_a;
                  } else {
                    var20 = pi.field_d;
                  }
                }
              } else {
                if (qw.field_a.length > var17) {
                  var20 = qw.field_a[var17];
                }
              }
              if (decompiledFrameRemainder0) {
                if (var20 != null) {
                  if (~var17 == ~var15) {
                    ((ToolkitSprite) (var20)).drawScaled(var18Lifetime2, var19Lifetime2, 48, 48, 0, var5, 1);
                  } else {
                    stackIn_57_0 = var20;
                    stackIn_57_1 = var18Lifetime2;
                    stackIn_57_2 = var19Lifetime2;
                    stackIn_57_3 = 48;
                    stackIn_57_4 = 48;
                    stackIn_57_5 = 0;
                    if (var15 == -1 &&
                      this.field_c == -1) {
                      stackIn_59_6 = var5;
                    } else {
                      stackIn_59_6 = var6;
                    }
                    ((ToolkitSprite) stackIn_57_0).drawScaled(stackIn_57_1, stackIn_57_2, stackIn_57_3, stackIn_57_4, stackIn_57_5, stackIn_59_6, 1);
                  }
                }
                if (var12.length > var17 && (!var12[var17] ||
                  (1 << var17 & var14) != 0)) {
                  var16++;
                  var8Lifetime1 += 65;
                }
              }
              var17++;
            }
          }
          stackIn_67_0 = ~this.field_c;
          stackIn_67_1 = -1;
          break;
        }
        if (stackIn_67_0 <= stackIn_67_1) {
          var15 = this.field_c;
        }
        if (var15 == -1) {
          MessageDialog.field_db.a(ActiveCanvasProvider.mouseOverAnIconText, param2 << 24 | 5023231, -1, 348, 320, 0);
          LegacyOpenGlEffect.field_c.a(ActiveCanvasProvider.mouseOverAnIconText, var5, -1, 348, 320, 0);
          if (vs.isGuestSession((byte) 9)) {
            MessageDialog.field_db.a(InstrumentNoteMask.createAFreeAccountText, var5, -1, 64 + (SocketConnector.field_a.field_i * 3 + 200), 320, 0);
            LegacyOpenGlEffect.field_c.a(InstrumentNoteMask.createAFreeAccountText, var5, -1, 32 + (SocketConnector.field_a.field_i * 3 + 200 + 32), 320, 0);
          }
        } else {
          DelegatingCanvas.a(ResizingDialog.field_H, 160, 140, param2 << 24, 3, var22, 360, 160, 1, true);
          var8Lifetime2 = 390;
          var13Lifetime1 = 310;
          var17_ref_String = Integer.toString(LegacyOpenGlClientVertexBuffer.field_c[var15] * 100);
          if (var11[var15] &&
            (1 << var15 & var14) == 0) {
            var17_ref_String = MusicVoice.field_s;
          }
          MessageDialog.field_db.a(NameSuggestionsPanel.orbPointsText + ": " + var17_ref_String, param2 << 24 | 5023231, var7, var13Lifetime1, var8Lifetime2, 0);
          LegacyOpenGlEffect.field_c.a(NameSuggestionsPanel.orbPointsText + ": " + var17_ref_String, var5, var7, var13Lifetime1, var8Lifetime2, 0);
          var13Lifetime1Lifetime1 = 280;
          var8Lifetime2Lifetime1 = 490;
          stackIn_77_0 = ((1 << var15 & var14) == 0) ? 0 : 1;
          var18Lifetime1 = stackIn_77_0;
          var8Lifetime2Lifetime2 = 390;
          var13Lifetime1Lifetime2 = 210;
          if (var18Lifetime1 == 0) {
            MessageDialog.field_db.a(LegacyOpenGlRidgedWaterEffect.notYetAchievedText, param2 << 24 | 5023231, var7, var13Lifetime1Lifetime2, var8Lifetime2Lifetime2, 0);
            LegacyOpenGlEffect.field_c.a(LegacyOpenGlRidgedWaterEffect.notYetAchievedText, 16720452 | param2 << 24, var7, var13Lifetime1Lifetime2, var8Lifetime2Lifetime2, 0);
          }
          if (var18Lifetime1 != 0 ||
            var21 != 0) {
            MessageDialog.field_db.a(NoiseSliceGenerator.achievedText, 5023231 | param2 << 24, var7, var13Lifetime1Lifetime2, var8Lifetime2Lifetime2, 0);
            LegacyOpenGlEffect.field_c.a(NoiseSliceGenerator.achievedText, param2 << 24 | 2293572, var7, var13Lifetime1Lifetime2, var8Lifetime2Lifetime2, 0);
          }
          var13Lifetime1Lifetime2 += 10;
          var8Lifetime2Lifetime2 -= 10;
          var19Lifetime1 = 160;
          var17_ref_StringLifetime1 = DraggableWidget.achievementDescriptions[var15];
          if (var11[var15] &&
            (var14 & 1 << var15) == 0) {
            var17_ref_StringLifetime1 = ContentTransitionPhase.thisIsAHiddenText;
          }
          MessageDialog.field_db.a(480, 5023231 | param2 << 24, 0, var19Lifetime1 + 20, -(var19Lifetime1 / 2) + var8Lifetime2Lifetime2, (int[]) null, (ToolkitSprite[]) null, 8 + var13Lifetime1Lifetime2, var7, 0, SocketConnector.field_a.field_i, -8787, var17_ref_StringLifetime1, (SpriteMask) null, 1, 0);
          LegacyOpenGlEffect.field_c.a(480, var5, 0, 20 + var19Lifetime1, -(var19Lifetime1 / 2) + var8Lifetime2Lifetime2, (int[]) null, (ToolkitSprite[]) null, var13Lifetime1Lifetime2 + 8, var7, 0, SocketConnector.field_a.field_i, -8787, var17_ref_StringLifetime1, (SpriteMask) null, 1, 0);
          var8Lifetime2Lifetime3 = 390;
          var13Lifetime1Lifetime3 = 190;
          QueuedIntArrayRequest.field_k.a(ArchiveProvider.achievementNames[var15], param2 << 24 | 5023231, var7, var13Lifetime1Lifetime3, var8Lifetime2Lifetime3, 0);
          uq.field_a.a(ArchiveProvider.achievementNames[var15], var5, var7, var13Lifetime1Lifetime3, var8Lifetime2Lifetime3, 0);
          var20_int = 200;
          if (var18Lifetime1 != 0) {
            qw.field_a[var15].draw(160, -30 + var20_int, 0, var5, 1);
            if (var21 != 0) {
              if (!(HardwareRidgedWaterNoise.field_x <= 0) ||
                !var10[var15]) {
                pi.field_d.draw(160, -30 + var20_int, 0, var5, 1);
                uj.field_a.draw(160, var20_int - 30, 0, var5, 1);
              } else {
                uj.field_a.draw(160, var20_int - 30, 0, var5, 1);
              }
            }
          } else {
            if (!(HardwareRidgedWaterNoise.field_x <= 0) ||
              !var10[var15]) {
              pi.field_d.draw(160, -30 + var20_int, 0, var5, 1);
              if (var21 != 0) {
                uj.field_a.draw(160, var20_int - 30, 0, var5, 1);
              }
            } else {
              uj.field_a.draw(160, var20_int - 30, 0, var5, 1);
            }
          }
          var20_int = var20_int + SocketConnector.field_a.field_i;
        }
        return;
    }

    private final void a(int param0, boolean param1) {
        boolean stackIn_12_0 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var3 = 53;
        var4 = 130;
        var5 = 0;
        while (true) {
          if (!(var5 < GameInstructions.objectiveHelpLines.length)) {
            var5 = 5;
            stackIn_12_0 = param1;
            break;
          }
          stackIn_12_0 = GameInstructions.objectiveHelpLines[var5].startsWith("<b>");
          if (var6 == 0) {
            if (stackIn_12_0) {
              QueuedIntArrayRequest.field_k.a(var4, var3, 5023231 | param0 << 24, GameInstructions.objectiveHelpLines[var5], (byte) -11, 0);
              uq.field_a.a(var4, var3, 16777215 | param0 << 24, GameInstructions.objectiveHelpLines[var5], (byte) -37, 0);
            } else {
              MessageDialog.field_db.a(100, param0 << 24 | 5023231, 0, 520, var3, (int[]) null, (ToolkitSprite[]) null, var4, -1, 0, 0, -8787, GameInstructions.objectiveHelpLines[var5], (SpriteMask) null, 0, 1);
              LegacyOpenGlEffect.field_c.a(100, 16777215 | param0 << 24, 0, 520, var3, (int[]) null, (ToolkitSprite[]) null, var4, -1, 0, 0, -8787, GameInstructions.objectiveHelpLines[var5], (SpriteMask) null, 0, 1);
            }
            if (var5 >= 1) {
              var4 += 50;
            }
            var5++;
            continue;
          }
          break;
        }
        if (!stackIn_12_0) {
          this.a(28, false);
        }
        while (GameInstructions.controlsHelpLines.length > var5) {
          MessageDialog.field_db.a(100, 5023231 | param0 << 24, 0, 520, var3, (int[]) null, (ToolkitSprite[]) null, var4, -1, 0, 0, -8787, GameInstructions.controlsHelpLines[var5], (SpriteMask) null, 0, 1);
          LegacyOpenGlEffect.field_c.a(100, param0 << 24 | 16777215, 0, 520, var3, (int[]) null, (ToolkitSprite[]) null, var4, -1, 0, 0, -8787, GameInstructions.controlsHelpLines[var5], (SpriteMask) null, 0, 1);
          if (var6 == 0) {
            if (var5 >= 1) {
              var4 += 50;
            }
            var5++;
            continue;
          }
          break;
        }
        return;
    }

    private final void a(boolean param0, int param1, int param2, GraphicsToolkit param3, int param4) {
        int discarded$0 = 0;
        boolean discarded$1 = false;
        String stackIn_30_0 = null;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        ToolkitFont var13_ref = null;
        Object var14 = null;
        ToolkitFont var14_ref = null;
        Object var15 = null;
        FontMetrics var15_ref = null;
        int var16 = 0;
        int var17 = 0;
        String var18_ref_String = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var18_ref_StringLifetime1;
        String var18_ref_StringLifetime2;
        var21 = Sumoblitz.field_L ? 1 : 0;
        try {
          var6_int = this.g(param1, 108);
          var7 = this.b(param1, 50);
          discarded$0 = this.f(-116, param1);
          var8 = kd.field_a[this.screenId][param1];
          var9 = GameClientShell.field_u[var8].toUpperCase();
          if (var9 == null) {
            var9 = "ERROR: missing text";
          }
          if (29 == var8 &&
            ToolkitRasterStateFrame.field_e == -1) {
            param0 = false;
          }
          var10 = this.f(101, param1) - var7;
          var11 = this.c(8, param1);
          if (param0) {
            if (ActiveCanvasProvider.field_c != 1 &&
              !hw.field_b[84]) {
              DelegatingCanvas.a(IntrusiveDeque.field_c, var11 << 1, var7, param4 << 24, 1, param3, var10, var6_int - var11 + 10, 1, true);
              if (var21 != 0) {
                DelegatingCanvas.a(IsaacCipher.field_j, var11 << 1, var7, param4 << 24, 1, param3, var10, -var11 + (var6_int + 10), 1, true);
                DelegatingCanvas.a(SecondaryNodeDequeIterator.field_a, var11 << 1, var7, param4 << 24, 1, param3, var10, 10 + (var6_int - var11), 1, true);
              }
            } else {
              DelegatingCanvas.a(IsaacCipher.field_j, var11 << 1, var7, param4 << 24, 1, param3, var10, -var11 + (var6_int + 10), 1, true);
              if (var21 != 0) {
                DelegatingCanvas.a(SecondaryNodeDequeIterator.field_a, var11 << 1, var7, param4 << 24, 1, param3, var10, 10 + (var6_int - var11), 1, true);
              }
            }
          } else {
            DelegatingCanvas.a(SecondaryNodeDequeIterator.field_a, var11 << 1, var7, param4 << 24, 1, param3, var10, 10 + (var6_int - var11), 1, true);
          }
          var12 = 16777215 | param4 << 24;
          var13 = null;
          var14 = null;
          var15 = null;
          var16 = 0;
          if (this.screenId == 0 &&
            param1 < 2) {
            var14_ref = ForceFieldRingEffect.field_t;
            var15_ref = ma.field_b;
            var13_ref = hc.field_e;
          } else {
            var13_ref = uq.field_a;
            var14_ref = QueuedIntArrayRequest.field_k;
            var15_ref = AccountConnectionPhase.field_a;
            var16 = 11;
          }
          if (param2 >= -85) {
            discarded$1 = this.e(-39, -98);
          }
          var17 = -16;
          if (var8 != 12 &&
            var8 != 13) {
            if (var8 != 25) {
              if (var8 != 27) {
                if (var8 == 33) {
                  if (!MessageDialog.arcadeMode) {
                    stackIn_30_0 = AccountRequestState.levelSelectText;
                  } else {
                    stackIn_30_0 = InteractiveWidget.returnToMainMenuText;
                  }
                  var22 = stackIn_30_0;
                  var18_ref_String = var22;
                  var18_ref_String = var22.toUpperCase();
                  var14_ref.a(var18_ref_String, 5023231 | param4 << 24, -1, var16 + (var6_int + var15_ref.field_i) + var17, -4 + ((var10 >> 1) + var7), 0);
                  var13_ref.a(var18_ref_String, var12, -1, var16 + var17 + (var6_int + var15_ref.field_i), (var10 >> 1) + var7 - 4, 0);
                  if (var21 == 0) {
                    return;
                  }
                }
                if (17 == var8 ||
                  18 == var8) {
                  var9 = var9.toLowerCase();
                }
                var14_ref.a(var9, param4 << 24 | 5023231, -1, var15_ref.field_i + var6_int + (var17 + var16), -4 + (var7 + (var10 >> 1)), 0);
                var13_ref.a(var9, var12, -1, var16 + var6_int - (-var15_ref.field_i - var17), (var10 >> 1) + (var7 - 4), 0);
                if (29 != var8) {
                  return;
                }
                if (ToolkitRasterStateFrame.field_e != -1) {
                  return;
                }
                DelegatingCanvas.a(ResizingDialog.field_H, var11 + 8, 9 + var7, param4, 1, param3, var10 - 18, 22 + var6_int - var11, 1, true);
                if (var21 == 0) {
                  return;
                }
              }
              var23 = FallbackShaderEffect.field_g + BufferedSocket.field_i[DisplaySizeController.field_f];
              var18_ref_StringLifetime2 = var23.toUpperCase();
              var14_ref.a(var18_ref_StringLifetime2, 5023231 | param4 << 24, -1, var6_int - (-var15_ref.field_i - var17) + var16, (var10 >> 1) + (var7 - 4), 0);
              var13_ref.a(var18_ref_StringLifetime2, var12, -1, var16 + (var6_int + var15_ref.field_i) + var17, -4 + (var10 >> 1) + var7, 0);
              if (var21 == 0) {
                return;
              }
            }
            var24 = ea.difficultyText + IntNode.difficultyNames[TextureCombineSource.field_a];
            var18_ref_StringLifetime1 = var24.toUpperCase();
            var14_ref.a(var18_ref_StringLifetime1, param4 << 24 | 5023231, -1, var16 + (var17 + (var15_ref.field_i + var6_int)), (var10 >> 1) + (var7 - 4), 0);
            var13_ref.a(var18_ref_StringLifetime1, var12, -1, var17 + var6_int + (var15_ref.field_i + var16), -4 + (var7 + (var10 >> 1)), 0);
            if (var21 == 0) {
              return;
            }
          }
          var7 -= 8;
          var18 = 9 + SocketJs5Client.field_q + 128;
          var19 = -(SocketJs5Client.field_q >> 2) + ((var10 - var18 >> 1) + var7);
          var14_ref.a(-1, -24 + (var10 >> 1) + var7, var9.toUpperCase(), var16 + (var17 + var15_ref.field_i + var6_int), param4 << 24 | 5023231, 115);
          var13_ref.a(-1, -24 + var7 + (var10 >> 1), var9.toUpperCase(), var6_int + var15_ref.field_i - (-var17 - var16), var12, 127);
          var19 = var19 + (16 + SocketJs5Client.field_q);
          vm.field_a[1].drawRotated((float)(8 + (-2 + var19)), (float)(-2 + (var6_int + 3) + 10), 4096, 0, 1, 0, 2);
          vm.field_a[2].drawRotated((float)(vm.field_a[1].paddedWidth() + (-2 + var19) + 8), (float)(var6_int + 3 - 2 + 10), 4096, 0, 1, 0, 2);
          vm.field_a[2].drawRotated((float)(vm.field_a[1].paddedWidth() * 2 - 2 - 2 + (var19 + 10)), (float)(-2 + (var6_int + 3 + 10)), 4096, 0, 1, 0, 2);
          vm.field_a[2].drawRotated((float)(vm.field_a[1].paddedWidth() * 3 - 2 + var19 - 2 + 10), (float)(10 + (3 + var6_int) - 2), 4096, 0, 1, 0, 2);
          vm.field_a[3].drawRotated((float)(-2 + var19 - 2 + 10 + 4 * vm.field_a[1].paddedWidth()), (float)(3 + var6_int + 8), 4096, 0, 1, 0, 2);
          if (var8 != 12) {
            stackIn_44_0 = TextureGeneratorNode.musicVolume;
          } else {
            stackIn_44_0 = kr.field_c;
          }
          var20 = stackIn_44_0;
          vm.field_a[0].drawRotated((float)(10 + (var19 + (var20 >> 1) - 2) - 2), (float)(10 + (var6_int + 1)), 4096, 0, 1, 0, 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_48_0 = var6;
          stackIn_48_1 = new StringBuilder().append("ak.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param4).append(')').toString());
        }
    }

    private final int g(int param0, int param1) {
        if (this.screenId == 2 &&
          !vs.isGuestSession((byte) 9)) {
          if (param0 >= 5) {
            return -6 + (DualLinkNode.field_k[this.screenId] + MidiNoteMixer.field_s[this.screenId]);
          }
          return -6 + DualLinkNode.field_k[this.screenId];
        }
        if (this.screenId == 2 &&
          vs.isGuestSession((byte) 9)) {
          return DualLinkNode.field_k[this.screenId] - (-(param0 * MidiNoteMixer.field_s[this.screenId]) + 6);
        }
        if (this.screenId != 3 &&
          this.screenId != 4 &&
          this.screenId != 5) {
          if (this.screenId != 9 &&
            this.screenId != 7 &&
            this.screenId != 10 &&
            this.screenId != 11) {
            if (5 == this.screenId) {
              if (kd.field_a[this.screenId].length > 1) {
                return 382;
              }
              return 430 + param0 * MidiNoteMixer.field_s[this.screenId] - 4;
            }
            if (this.screenId != 0) {
              if (param1 <= 79) {
                this.screenId = 83;
              }
              return MidiNoteMixer.field_s[this.screenId] * param0 + DualLinkNode.field_k[this.screenId];
            }
            if (param0 < 2) {
              return param0 * (int)((double)MidiNoteMixer.field_s[this.screenId] * 2.0) + DualLinkNode.field_k[this.screenId] + 28;
            }
            if (param0 > 1 &&
              param0 < 4) {
              return MidiNoteMixer.field_s[this.screenId] * 2 + DualLinkNode.field_k[this.screenId] + 100;
            }
            if (param0 == 6) {
              return (-1 + param0) * MidiNoteMixer.field_s[this.screenId] + DualLinkNode.field_k[this.screenId] + 100;
            }
            if (4 <= param0) {
              return DualLinkNode.field_k[this.screenId] + 100 + MidiNoteMixer.field_s[this.screenId] * (-1 + param0);
            }
            return MidiNoteMixer.field_s[this.screenId] * param0 + DualLinkNode.field_k[this.screenId] + 128;
          }
          return DualLinkNode.field_k[this.screenId];
        }
        return DualLinkNode.field_k[this.screenId] - 32;
    }

    private final void a(byte param0) {
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 < 122) {
          return;
        }
        if (this.screenId == 2 &&
          !vs.isGuestSession((byte) 9)) {
          if (TextureCombineOperation.field_a == 96) {
            if (0 < this.field_g.selectedIndex) {
              if (3 != this.field_g.selectedIndex) {
                this.field_g.setKeyboardSelection(-31865, this.field_g.selectedIndex - 1);
                if (var3 != 0) {
                  this.field_g.setKeyboardSelection(-31865, 2);
                }
              }
            } else {
              this.field_g.setKeyboardSelection(-31865, 2);
            }
          }
          if (TextureCombineOperation.field_a == 97) {
            if (this.field_g.selectedIndex >= 2) {
              if (this.field_g.selectedIndex == 2) {
                this.field_g.setKeyboardSelection(-31865, 0);
                if (var3 != 0) {
                  this.field_g.setKeyboardSelection(-31865, 1 + this.field_g.selectedIndex);
                }
              }
            } else {
              this.field_g.setKeyboardSelection(-31865, 1 + this.field_g.selectedIndex);
            }
          }
          if (TextureCombineOperation.field_a == 99) {
            if (!(this.field_g.selectedIndex >= 0) ||
              !(this.field_g.selectedIndex <= 2)) {
              this.field_g.setKeyboardSelection(-31865, HardwareBufferSet.field_j);
              if (var3 != 0) {
                this.field_g.setKeyboardSelection(-31865, 3);
              }
            } else {
              this.field_g.setKeyboardSelection(-31865, 3);
            }
          }
          if (TextureCombineOperation.field_a == 98) {
            if (this.field_g.selectedIndex == 3) {
              this.field_g.setKeyboardSelection(-31865, HardwareBufferSet.field_j);
              if (var3 != 0) {
                this.field_g.setKeyboardSelection(-31865, 3);
              }
            } else {
              this.field_g.setKeyboardSelection(-31865, 3);
            }
          }
          this.field_g.captureKey(-22);
          return;
        }
        if (this.screenId == 3) {
          this.field_g.handleHorizontalNavigation(-20);
          if (TextureCombineOperation.field_a != 96 &&
            97 != TextureCombineOperation.field_a) {
            return;
          }
          while (!this.e(this.field_g.selectedIndex, 7746)) {
            this.field_g.handleHorizontalNavigation(-125);
            if (var3 == 0) {
              continue;
            }
            break;
          }
          return;
        }
        this.field_g.handleVerticalNavigation((byte) 95);
        if (TextureCombineOperation.field_a == 98 ||
          TextureCombineOperation.field_a == 99) {
          while (!this.e(this.field_g.selectedIndex, 7746)) {
            this.field_g.handleVerticalNavigation((byte) 38);
            if (var3 != 0) {
              break;
            }
          }
        }

    }

    private final int a(int param0, byte param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int stackIn_19_0 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        if (param1 <= 28) {
          this.resetSelection(-8, true);
        }
        var4 = 0;
        while (kd.field_a[this.screenId].length > var4) {
          var5 = this.g(var4, 111);
          var6 = this.c(8, var4);
          stackIn_19_0 = 0;
          if (var7 != 0) {
            return stackIn_19_0;
          }
          if (stackIn_19_0 == this.screenId &&
            2 > var4 ||
            this.screenId == 11) {
            var5 -= 28;
            var6 += 28;
          }
          if (this.e(var4, 7746) &&
            param0 >= this.b(var4, 65) &&
            this.f(-115, var4) > param0 &&
            var5 <= param2 &&
            (var5 + var6) > param2) {
            return var4;
          }
          var4++;
        }
        return -1;
    }

    final void resetSelection(int param0, boolean param1) {
        if (param0 != -8628) {
          return;
        }
        int var3 = 0;
        if (this.screenId == 0 &&
          this.field_g.selectedIndex != -1) {
          var3 = this.field_g.selectedIndex;
        }
        if (this.screenId == 1 && this.field_g.selectedIndex != -1 &&
          RendererPreference.field_b != -1) {
          var3 = this.field_g.selectedIndex;
        }
        if (this.screenId == 3) {
          var3 = 2;
        }
        this.field_g.resetSelection(param1, -123, this.a(ko.field_p, (byte) 41, pi.field_e), var3);
        this.field_c = -1;
    }

    private final void a(boolean param0, int param1) {
        int var3 = 53;
        int var4 = 480;
        int var5 = 130;
        QueuedIntArrayRequest.field_k.a(var5, var3, 5023231 | param1 << 24, GameInstructions.dronesHelpLines[0], (byte) -37, 0);
        uq.field_a.a(var5, var3, 16777215 | param1 << 24, GameInstructions.dronesHelpLines[0], (byte) -8, 0);
        var5 += 30;
        ContentDialog.field_ab[0].drawRotated((float)(var3 + 30), (float)(10 + var5), 4096, 0, 1, 0, 2);
        ContentDialog.field_ab[1].drawRotated((float)(var3 + 30), (float)(10 + var5), 4096, 0, 1, 0, 2);
        MessageDialog.field_db.a(var5, 60 + var3, param1 << 24 | 5023231, GameInstructions.dronesHelpLines[1], (byte) -120, 0);
        LegacyOpenGlEffect.field_c.a(var5, 60 + var3, 5023231 | param1 << 24, GameInstructions.dronesHelpLines[1], (byte) -56, 0);
        MessageDialog.field_db.a(100, 5023231 | param1 << 24, 0, var4, 60 + var3, (int[]) null, (ToolkitSprite[]) null, var5, -1, 0, 0, -8787, GameInstructions.dronesHelpLines[2], (SpriteMask) null, 0, 0);
        LegacyOpenGlEffect.field_c.a(100, 16777215 | param1 << 24, 0, var4, var3 + 60, (int[]) null, (ToolkitSprite[]) null, var5, -1, 0, 0, -8787, GameInstructions.dronesHelpLines[2], (SpriteMask) null, 0, 0);
        var5 += 70;
        TextHotspot.field_n[0].drawRotated((float)(var3 + 30), (float)(10 + var5), 4096, 0, 1, 0, 2);
        TextHotspot.field_n[1].drawRotated((float)(var3 + 30), (float)(10 + var5), 4096, 0, 1, 0, 2);
        MessageDialog.field_db.a(var5, var3 + 60, param1 << 24 | 5023231, GameInstructions.dronesHelpLines[3], (byte) -110, 0);
        LegacyOpenGlEffect.field_c.a(var5, 60 + var3, param1 << 24 | 5023231, GameInstructions.dronesHelpLines[3], (byte) -117, 0);
        MessageDialog.field_db.a(100, param1 << 24 | 5023231, 0, var4, 60 + var3, (int[]) null, (ToolkitSprite[]) null, var5, -1, 0, 0, -8787, GameInstructions.dronesHelpLines[4], (SpriteMask) null, 0, 0);
        LegacyOpenGlEffect.field_c.a(100, param1 << 24 | 16777215, 0, var4, var3 + 60, (int[]) null, (ToolkitSprite[]) null, var5, -1, 0, 0, -8787, GameInstructions.dronesHelpLines[4], (SpriteMask) null, 0, 0);
        var5 += 70;
        ProjectionMode.field_d[0].drawRotated((float)(var3 + 30), (float)(10 + var5), 4096, 0, 1, 0, 2);
        ProjectionMode.field_d[1].drawRotated((float)(var3 + 30), (float)(var5 + 10), 4096, 0, 1, 0, 2);
        if (!param0) {
          this.resetSelection(-98, false);
        }
        MessageDialog.field_db.a(var5, 60 + var3, param1 << 24 | 5023231, GameInstructions.dronesHelpLines[5], (byte) -92, 0);
        LegacyOpenGlEffect.field_c.a(var5, var3 + 60, 5023231 | param1 << 24, GameInstructions.dronesHelpLines[5], (byte) -59, 0);
        MessageDialog.field_db.a(100, 5023231 | param1 << 24, 0, var4, var3 + 60, (int[]) null, (ToolkitSprite[]) null, var5, -1, 0, 0, -8787, GameInstructions.dronesHelpLines[6], (SpriteMask) null, 0, 0);
        LegacyOpenGlEffect.field_c.a(100, 16777215 | param1 << 24, 0, var4, 60 + var3, (int[]) null, (ToolkitSprite[]) null, var5, -1, 0, 0, -8787, GameInstructions.dronesHelpLines[6], (SpriteMask) null, 0, 0);
    }

    private final void a(boolean param0, byte param1, int param2) {
        int stackIn_247_0 = 0;
        int stackIn_248_1 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = Sumoblitz.field_L ? 1 : 0;
        var4 = kd.field_a[this.screenId][param2];
        if (this.field_g.isActivated(-31260)) {
          if (var4 != 5) {
            ArchiveLoadRequirement.playSoundEffect(16, true);
            if (var9 != 0) {
              ArchiveLoadRequirement.playSoundEffect(15, true);
              if (var4 != this.field_d &&
                kd.field_a[this.screenId].length != 1) {
                this.field_d = var4;
                ArchiveLoadRequirement.playSoundEffect(17, true);
              }
            }
          } else {
            ArchiveLoadRequirement.playSoundEffect(15, true);
            if ((var9 != 0) && (var4 != this.field_d &&
              kd.field_a[this.screenId].length != 1)) {
              this.field_d = var4;
              ArchiveLoadRequirement.playSoundEffect(17, true);
            }
          }
        } else {
          if (var4 != this.field_d &&
            kd.field_a[this.screenId].length != 1) {
            this.field_d = var4;
            ArchiveLoadRequirement.playSoundEffect(17, true);
          }
        }
        regionExit1: {
          regionExit2: {
            var6 = var4;
            if (0 == var6 &&
              var9 == 0) {
              if (!(!this.field_g.isActivated(-31260))) {
                StrongCacheReference.switchMenuScreen(-7753, param0, 7);
                AffineTransform3D.field_j = this.screenId;
              }
              break regionExit2;
            } else {
              if (var6 != 22) {
                switch ((var9 == 0
                  || var6 == 1
                  || var6 == 3
                  || var6 == 6
                  || var6 == 7
                  || var6 == 9
                  || var6 == 11
                  || var6 == 15
                  || var6 == 17
                  || var6 == 18
                  || var6 == 19
                  || var6 == 20
                  || var6 == 21
                  || var6 == 25
                  || var6 == 29
                  ) ? var6 : -1) {
                  case 25:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    TextureCombineSource.field_a = TextureCombineSource.field_a + 1;
                    if (TextureCombineSource.field_a <= 1) {
                      break regionExit2;
                    }
                    TextureCombineSource.field_a = 0;
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 27:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    DisplaySizeController.field_f = DisplaySizeController.field_f + 1;
                    if (1 >= DisplaySizeController.field_f) {
                      break regionExit2;
                    }
                    DisplaySizeController.field_f = 0;
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 19:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    StrongCacheReference.switchMenuScreen(-7753, param0, -1);
                    AffineTransform3D.field_j = this.screenId;
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 23:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    LruNodeCache.gameplaySession.startArcadeGame((byte) -120);
                    StrongCacheReference.switchMenuScreen(-7753, param0, -1);
                    AffineTransform3D.field_j = this.screenId;
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 1:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    StrongCacheReference.switchMenuScreen(-7753, param0, -1);
                    LruNodeCache.gameplaySession.closePauseMenu((byte) 112);
                    AffineTransform3D.field_j = 0;
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 28:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    {
                      DroneIntroductionOverlay.a(param0, true, false);
                      StrongCacheReference.switchMenuScreen(-7753, param0, -1);
                      if (MessageDialog.arcadeMode) {
                        LruNodeCache.gameplaySession.startArcadeGame((byte) -120);
                        if (var9 != 0) {
                          LruNodeCache.gameplaySession.startLevel(OpenGlShaderProgram.levelIndex, false, false);
                        }
                      } else {
                        LruNodeCache.gameplaySession.startLevel(OpenGlShaderProgram.levelIndex, false, false);
                      }
                    }
                    DropDownWidget.field_C = OpenGlShaderProgram.levelIndex;
                    IntrusiveNodeHashTable.field_c = 0;
                    LruNodeCache.gameplaySession.closePauseMenu((byte) 112);
                    AffineTransform3D.field_j = 0;
                    UiWidget.d((byte) -60);
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 31:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    ih.restoreBaselineUpgrades(-125);
                    StrongCacheReference.switchMenuScreen(-7753, param0, -1);
                    LegacyTurbulentWaterNoise.advanceToNextLevel(10);
                    ByteArrayCacheNode.initializeGameplaySession((byte) 104);
                    LruNodeCache.gameplaySession.closePauseMenu((byte) 112);
                    UiWidget.d((byte) -117);
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 32:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    {
                      LruNodeCache.gameplaySession.resetSession(70);
                      DroneIntroductionOverlay.a(param0, true, false);
                      if (vs.isGuestSession((byte) 9)) {
                        if (0 < IntrusiveNodeHashTable.field_c) {
                          StrongCacheReference.switchMenuScreen(-7753, param0, 6);
                          if (var9 != 0) {
                            StrongCacheReference.switchMenuScreen(-7753, true, 7);
                          }
                        } else {
                          StrongCacheReference.switchMenuScreen(-7753, true, 7);
                        }
                        AffineTransform3D.field_j = 0;
                        if (var9 != 0) {
                          StrongCacheReference.switchMenuScreen(-7753, true, 7);
                        }
                      } else {
                        StrongCacheReference.switchMenuScreen(-7753, true, 7);
                      }
                    }
                    TextLayout.a(0, 0);
                    AffineTransform3D.field_j = 0;
                    UiWidget.d((byte) -107);
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 33:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    regionExit3: {
                      DroneIntroductionOverlay.a(param0, true, false);
                      if (!vs.isGuestSession((byte) 9)) {
                        if (!MessageDialog.arcadeMode) {
                          StrongCacheReference.switchMenuScreen(-7753, true, 7);
                          if (var9 == 0) {
                            break regionExit3;
                          }
                        }
                        StrongCacheReference.switchMenuScreen(-7753, true, 0);
                        if (var9 == 0) {
                          break regionExit3;
                        }
                      }
                      if (IntrusiveNodeHashTable.field_c > 0) {
                        StrongCacheReference.switchMenuScreen(-7753, param0, 6);
                        if (var9 != 0) {
                          if (!MessageDialog.arcadeMode) {
                            StrongCacheReference.switchMenuScreen(-7753, true, 7);
                            StrongCacheReference.switchMenuScreen(-7753, true, 0);
                          } else {
                            StrongCacheReference.switchMenuScreen(-7753, true, 0);
                          }
                        }
                      } else {
                        if (!MessageDialog.arcadeMode) {
                          StrongCacheReference.switchMenuScreen(-7753, true, 7);
                          if (var9 != 0) {
                            StrongCacheReference.switchMenuScreen(-7753, true, 0);
                          }
                        } else {
                          StrongCacheReference.switchMenuScreen(-7753, true, 0);
                        }
                      }
                      AffineTransform3D.field_j = 0;
                    }
                    AffineTransform3D.field_j = 0;
                    TextLayout.a(0, 0);
                    UiWidget.d((byte) -52);
                    LruNodeCache.gameplaySession.resetSession(111);
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 26:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    GameProgressUpdate.field_o.show(5295);
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 29:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    if (ToolkitRasterStateFrame.field_e <= -1) {
                      break regionExit2;
                    }
                    HardwareTextureSprite.snapshotUpgradeAllocation((byte) -33);
                    StrongCacheReference.switchMenuScreen(-7753, param0, 9);
                    AffineTransform3D.field_j = 7;
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 30:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    UiWidget.d((byte) -32);
                    TextureGeneratorNode.restoreUpgradeAllocation(30692);
                    StrongCacheReference.switchMenuScreen(-7753, param0, AffineTransform3D.field_j);
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 5:
                    var5 = 0;
                    if (~ArenaDefinition.field_a != ~var5) {
                      StatusMessagePanel.a((byte) 100, true, false, 4, 2, TimedSceneEffect.field_m[var5]);
                    }
                    ArenaDefinition.field_a = var5;
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    StrongCacheReference.switchMenuScreen(-7753, param0, 0);
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 16:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    StrongCacheReference.switchMenuScreen(-7753, param0, 0);
                    WhirlpoolTables.a(17534);
                    OpenGlTransparentWaterEffect.field_e = 0;
                    kh.field_e = 0;
                    OpenGlUnderwaterEffect.field_q.clear(115);
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 14:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    StrongCacheReference.switchMenuScreen(-7753, param0, 4);
                    AffineTransform3D.field_j = this.screenId;
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 3:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    StatefulWidgetRenderer.field_n = 0;
                    StrongCacheReference.switchMenuScreen(-7753, param0, 3);
                    AffineTransform3D.field_j = this.screenId;
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 6:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    StrongCacheReference.switchMenuScreen(-7753, param0, AffineTransform3D.field_j);
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 24:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    StrongCacheReference.switchMenuScreen(-7753, param0, 8);
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 2:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    StrongCacheReference.switchMenuScreen(-7753, param0, 2);
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 12:
                    if (this.field_g.isHomePressed(-103)) {
                      lt.c((byte) 53);
                      ArchiveLoadRequirement.playSoundEffect(0, true);
                    }
                    if (this.field_g.isEndPressed(103)) {
                      QuickChatPhraseProvider.b(80);
                      ArchiveLoadRequirement.playSoundEffect(0, true);
                    }
                    if (this.field_g.isLeftPressed(2542)) {
                      HardwareSpecularEffect.e(-124);
                      ArchiveLoadRequirement.playSoundEffect(0, true);
                    }
                    if (this.field_g.isRightPressed(116224)) {
                      AccountCreationForm.h(0);
                      ArchiveLoadRequirement.playSoundEffect(0, true);
                    }
                    if (!this.field_g.isPointerHeld((byte) 52)) {
                      break regionExit2;
                    }
                    {
                      var6 = 9 + (SocketJs5Client.field_q + 128);
                      var7 = (this.b(param2, 49) + (this.f(-113, param2) - var6) >> 1) + (SocketJs5Client.field_q + 8 - (SocketJs5Client.field_q >> 2));
                      var8 = -var7 + ko.field_p << 1;
                      if (0 < var8) {
                        if (var8 < 256) {
                          OpenGlVertexLayout.a(16440, var8);
                          if (var9 != 0) {
                            QuickChatPhraseProvider.b(100);
                            lt.c((byte) 53);
                          }
                        } else {
                          QuickChatPhraseProvider.b(100);
                          if (var9 != 0) {
                            lt.c((byte) 53);
                          }
                        }
                      } else {
                        lt.c((byte) 53);
                      }
                    }
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 13:
                    if (this.field_g.isHomePressed(-103)) {
                      AccountNameSupport.muteMusic(24238);
                    }
                    if (this.field_g.isEndPressed(103)) {
                      NativeLibraryExtractor.restoreMusicVolume(22075);
                    }
                    if (this.field_g.isLeftPressed(2542)) {
                      FullscreenMembershipDialog.l(34168);
                    }
                    if (this.field_g.isRightPressed(116224)) {
                      ArchiveCatalog.a((byte) -6);
                    }
                    if (!this.field_g.isPointerHeld((byte) 52)) {
                      break regionExit2;
                    }
                    {
                      var6 = 9 + (SocketJs5Client.field_q + 128);
                      var7 = 8 + ((-var6 + (this.b(param2, 35) + this.f(90, param2)) >> 1) + (SocketJs5Client.field_q - (SocketJs5Client.field_q >> 2)));
                      var8 = -var7 + ko.field_p << 1;
                      if (var8 <= 0) {
                        lf.setMusicVolume(0, 0);
                        if (var9 != 0) {
                          if (var8 >= 256) {
                            lf.setMusicVolume(0, 256);
                            lf.setMusicVolume(0, var8);
                          } else {
                            lf.setMusicVolume(0, var8);
                          }
                        }
                      } else {
                        if (var8 >= 256) {
                          lf.setMusicVolume(0, 256);
                          if (var9 != 0) {
                            lf.setMusicVolume(0, var8);
                          }
                        } else {
                          lf.setMusicVolume(0, var8);
                        }
                      }
                    }
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 4:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    if (null != CompactMeshGeometry.field_o) {
                      LegacyOpenGlNormalMapGenerator.c((byte) 127);
                      if (var9 == 0) {
                        break regionExit2;
                      }
                    }
                    RotarySelectorWidget.a((byte) 126, param0);
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 7:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    DroneIntroductionOverlay.a(param0, true, false);
                    if (OpenGlTransparentWaterEffect.field_e == 0) {
                      StrongCacheReference.switchMenuScreen(-7753, param0, 2);
                      if (var9 == 0) {
                        break regionExit2;
                      }
                    }
                    StrongCacheReference.switchMenuScreen(-7753, param0, 5);
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 8:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    HardwareBufferSet.field_j = 0;
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 9:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    HardwareBufferSet.field_j = 1;
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 10:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    HardwareBufferSet.field_j = 2;
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 15:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    if (this.screenId != 4 &&
                      this.screenId != 2) {
                      if (this.screenId != 6) {
                        break regionExit2;
                      }
                      stackIn_247_0 = 4025;
                      if (OpenGlTransparentWaterEffect.field_e != 0) {
                        stackIn_248_1 = 5;
                      } else {
                        stackIn_248_1 = 2;
                      }
                      DisplaySizeController.beginScreenTransition(stackIn_247_0, stackIn_248_1, 6);
                      if (var9 == 0) {
                        break regionExit2;
                      }
                    }
                    DisplaySizeController.beginScreenTransition(4025, this.screenId, this.screenId);
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 18:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    if (!this.e(param2, 7746)) {
                      break regionExit2;
                    }
                    if (this.screenId == 3) {
                      StatefulWidgetRenderer.field_n = StatefulWidgetRenderer.field_n - 1;
                    }
                    if (4 != this.screenId &&
                      this.screenId != 5) {
                    }
                    if (this.e(param2, 7746)) {
                      break regionExit2;
                    }
                    this.field_g.selectedIndex = 2;
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 17:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    if (!this.e(param2, 7746)) {
                      break regionExit2;
                    }
                    if (this.screenId == 3) {
                      StatefulWidgetRenderer.field_n = StatefulWidgetRenderer.field_n + 1;
                    }
                    if (this.screenId != 4 &&
                      this.screenId != 5) {
                    }
                    if (this.e(param2, 7746)) {
                      break regionExit2;
                    }
                    this.field_g.selectedIndex = 0;
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 11:
                    if (!this.field_g.isActivated(-31260)) {
                      break regionExit2;
                    }
                    if (CompactMeshGeometry.field_o != null) {
                      LegacyOpenGlNormalMapGenerator.c((byte) 126);
                    }
                    HardwareQuadBatchBuffers.quitToWebsite(LegacyOpenGlUnlitEffect.c(2), false);
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 20:
                    if (!this.field_g.isActivated(-31260)) {
                      var5 = 24 / ((-15 - param1) / 43);
                      break regionExit1;
                    }
                    LegacyOpenGlShader.field_a = 1;
                    HardwareTextureCache.field_f = null;
                    if (var9 == 0) {
                      break regionExit2;
                    }
                  case 21:
                    break;
                  default:
                    break regionExit2;
                }
                if (!(!this.field_g.isActivated(-31260))) {
                  HardwareTextureCache.field_f = null;
                  LegacyOpenGlShader.field_a = 0;
                }
                break regionExit2;
              }
            }
            if (!this.field_g.isActivated(-31260)) {
            }
          }
          var5 = 24 / ((-15 - param1) / 43);
        }
    }

    private final void a(int param0, int param1) {
        int var3 = 53;
        int var4 = 480;
        int var5 = 130;
        QueuedIntArrayRequest.field_k.a(var5, var3, 5023231 | param0 << 24, GameInstructions.dronesHelpLinesPartTwo[0], (byte) -21, 0);
        uq.field_a.a(var5, var3, param0 << 24 | 16777215, GameInstructions.dronesHelpLinesPartTwo[0], (byte) -15, 0);
        var5 += 30;
        field_a[0].drawRotated((float)(var3 + 30), (float)(var5 + 10), 4096, 0, 1, 0, 2);
        field_a[1].drawRotated((float)(var3 + 30), (float)(var5 + 10), 4096, 0, 1, 0, 2);
        MessageDialog.field_db.a(var5, var3 + 60, 5023231 | param0 << 24, GameInstructions.dronesHelpLinesPartTwo[1], (byte) -76, 0);
        LegacyOpenGlEffect.field_c.a(var5, var3 + 60, param0 << 24 | 5023231, GameInstructions.dronesHelpLinesPartTwo[1], (byte) -28, 0);
        MessageDialog.field_db.a(100, param0 << 24 | 5023231, 0, var4, var3 + 60, (int[]) null, (ToolkitSprite[]) null, var5, -1, 0, 0, -8787, GameInstructions.dronesHelpLinesPartTwo[2], (SpriteMask) null, 0, 0);
        LegacyOpenGlEffect.field_c.a(100, 16777215 | param0 << 24, 0, var4, var3 + 60, (int[]) null, (ToolkitSprite[]) null, var5, -1, 0, 0, -8787, GameInstructions.dronesHelpLinesPartTwo[2], (SpriteMask) null, 0, 0);
        var5 += 70;
        HardwareTextureCache.field_e[0].drawRotated((float)(30 + var3), (float)(var5 + 10), 4096, 0, 1, 0, 2);
        HardwareTextureCache.field_e[1].drawRotated((float)(30 + var3), (float)(10 + var5), 4096, 0, 1, 0, 2);
        MessageDialog.field_db.a(var5, var3 + 60, param0 << 24 | 5023231, GameInstructions.dronesHelpLinesPartTwo[3], (byte) -44, 0);
        LegacyOpenGlEffect.field_c.a(var5, 60 + var3, param0 << 24 | 5023231, GameInstructions.dronesHelpLinesPartTwo[3], (byte) -117, 0);
        MessageDialog.field_db.a(100, param0 << 24 | 5023231, 0, var4, 60 + var3, (int[]) null, (ToolkitSprite[]) null, var5, -1, 0, 0, -8787, GameInstructions.dronesHelpLinesPartTwo[4], (SpriteMask) null, 0, 0);
        LegacyOpenGlEffect.field_c.a(100, 16777215 | param0 << 24, 0, var4, var3 + 60, (int[]) null, (ToolkitSprite[]) null, var5, -1, 0, 0, -8787, GameInstructions.dronesHelpLinesPartTwo[4], (SpriteMask) null, 0, 0);
        if (param1 >= -25) {
          this.update(-117);
        }
    }

    void render(int opacity, GraphicsToolkit toolkit, int guard) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        ToolkitFont stackIn_32_0 = null;
        boolean stackIn_32_1 = false;
        boolean stackIn_33_2 = false;
        boolean stackIn_36_3 = false;
        ToolkitFont stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        boolean stackIn_39_2 = false;
        boolean stackIn_41_3;
        boolean stackIn_42_4 = false;
        ToolkitFont stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        boolean stackIn_45_2 = false;
        boolean stackIn_47_3;
        boolean stackIn_48_4 = false;
        ToolkitFont stackIn_50_0 = null;
        boolean stackIn_50_1 = false;
        boolean stackIn_51_2 = false;
        boolean stackIn_54_3 = false;
        ToolkitFont stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        boolean stackIn_57_2 = false;
        boolean stackIn_59_3;
        boolean stackIn_60_4 = false;
        ToolkitFont stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        boolean stackIn_63_2 = false;
        boolean stackIn_65_3;
        boolean stackIn_66_4 = false;
        boolean stackIn_80_1 = false;
        boolean stackIn_83_0 = false;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_90_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var6Lifetime1;
        int var6Lifetime2;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != -2355) {
            this.a((byte) 91);
          }
          stackIn_6_0 = (DisplaySizeController.field_f == 0) ? 3 : 1;
          var4_int = stackIn_6_0;
          stackIn_9_0 = (Bzip2State.field_j < 2) ? 0 : 1;
          var5 = stackIn_9_0;
          if (0 == this.screenId ||
            1 == this.screenId ||
            this.screenId == 8) {
            DelegatingCanvas.a(up.field_c, 490, 320 + (-(MouseWheelInput.field_b.width() / 2) - 20), opacity << 24, var4_int, toolkit, MouseWheelInput.field_b.width() + 40, -5, 1, true);
            if (DisplaySizeController.field_f == 0 &&
              !OpenGlTransparentWaterEffect.field_k) {
              stackIn_18_0 = 3;
            } else {
              stackIn_18_0 = 1;
            }
            var6 = stackIn_18_0;
            MouseWheelInput.field_b.draw(-(MouseWheelInput.field_b.width() / 2) + 320, 20, var6, opacity << 24, 1);
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.screenId != 2) {
            if (3 == this.screenId) {
              this.b((byte) 120, opacity);
              decompiledFrameRemainder0 = (var8 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (this.screenId == 4) {
                this.a(false, guard ^ 2407, opacity);
                decompiledFrameRemainder0 = (var8 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (this.screenId == 5) {
                  this.a(true, -70, opacity);
                  decompiledFrameRemainder0 = (var8 != 0);
                }
                if ((decompiledFrameRemainder0) &&
                  (this.screenId == 6)) {
                  DelegatingCanvas.a(up.field_c, 380, -5, opacity << 24, var4_int, toolkit, 650, 55, 1, true);
                  DualLinkNode.field_k[this.screenId] = 200;
                  var6Lifetime1 = 200 - (-SocketConnector.field_a.field_i + 70);
                  var7 = 4 + SocketConnector.field_a.field_c + SocketConnector.field_a.field_h;
                  QueuedIntArrayRequest.field_k.a(LegacyOpenGlNormalMapGenerator.youAreNotCurrentlyText, 5023231 | opacity << 24, -1, var6Lifetime1, 320, 0);
                  stackIn_32_0 = QueuedIntArrayRequest.field_k;
                  stackIn_32_1 = false;
                  stackIn_33_2 = (0 != IntrusiveNodeHashTable.field_c);
                  stackIn_36_3 = (OpenGlTransparentWaterEffect.field_e != 0);
                  ((ToolkitFont) (Object) stackIn_32_0).a(StatefulWidgetRenderer.storageRequirementPrompt(stackIn_32_1, stackIn_33_2, stackIn_36_3, (byte) 63), 5023231 | opacity << 24, -1, var7 + var6Lifetime1, 320, 0);
                  stackIn_38_0 = QueuedIntArrayRequest.field_k;
                  stackIn_38_1 = 26;
                  stackIn_39_2 = (OpenGlTransparentWaterEffect.field_e != 0);
                  stackIn_41_3 = false;
                  stackIn_42_4 = (0 != IntrusiveNodeHashTable.field_c);
                  ((ToolkitFont) (Object) stackIn_38_0).a(NameSuggestionsPanel.$cfr$intArgs$a$c7de0d339b2a(stackIn_38_1, stackIn_39_2, stackIn_41_3, stackIn_42_4), opacity << 24 | 5023231, -1, 32 + (var7 * 4 + var6Lifetime1), 320, 0);
                  stackIn_44_0 = QueuedIntArrayRequest.field_k;
                  stackIn_44_1 = 0;
                  stackIn_45_2 = (IntrusiveNodeHashTable.field_c != 0);
                  stackIn_47_3 = false;
                  stackIn_48_4 = (0 != OpenGlTransparentWaterEffect.field_e);
                  ((ToolkitFont) (Object) stackIn_44_0).a(SlowBurstParticle.a(stackIn_44_1, stackIn_45_2, stackIn_47_3, stackIn_48_4), opacity << 24 | 5023231, -1, 64 + var7 * 7 + var6Lifetime1, 320, 0);
                  uq.field_a.a(LegacyOpenGlNormalMapGenerator.youAreNotCurrentlyText, opacity << 24 | 16777215, -1, var6Lifetime1, 320, 0);
                  stackIn_50_0 = uq.field_a;
                  stackIn_50_1 = false;
                  stackIn_51_2 = (IntrusiveNodeHashTable.field_c != 0);
                  stackIn_54_3 = (OpenGlTransparentWaterEffect.field_e != 0);
                  ((ToolkitFont) (Object) stackIn_50_0).a(StatefulWidgetRenderer.storageRequirementPrompt(stackIn_50_1, stackIn_51_2, stackIn_54_3, (byte) 63), opacity << 24 | 16777215, -1, var6Lifetime1 + var7, 320, 0);
                  stackIn_56_0 = uq.field_a;
                  stackIn_56_1 = 26;
                  stackIn_57_2 = (OpenGlTransparentWaterEffect.field_e != 0);
                  stackIn_59_3 = false;
                  stackIn_60_4 = (0 != IntrusiveNodeHashTable.field_c);
                  ((ToolkitFont) (Object) stackIn_56_0).a(NameSuggestionsPanel.$cfr$intArgs$a$c7de0d339b2a(stackIn_56_1, stackIn_57_2, stackIn_59_3, stackIn_60_4), opacity << 24 | 16777215, -1, 32 + var7 * 4 + var6Lifetime1, 320, 0);
                  stackIn_62_0 = uq.field_a;
                  stackIn_62_1 = 0;
                  stackIn_63_2 = (IntrusiveNodeHashTable.field_c != 0);
                  stackIn_65_3 = false;
                  stackIn_66_4 = (OpenGlTransparentWaterEffect.field_e != 0);
                  ((ToolkitFont) (Object) stackIn_62_0).a(SlowBurstParticle.a(stackIn_62_1, stackIn_63_2, stackIn_65_3, stackIn_66_4), 16777215 | opacity << 24, -1, 64 + var7 * 7 + var6Lifetime1, 320, 0);
                  if (var8 != 0) {
                    this.h(opacity, 1);
                  }
                }
              }
            }
          } else {
            this.h(opacity, 1);
          }
          boolean decompiledFrameCompleted0 = true;
          if (var5 == 0 ||
            !hw.field_b[70] &&
            !hw.field_b[69]) {
            var6Lifetime2 = 0;
            while (!(var6Lifetime2 >= this.field_g.itemCount)) {
              stackIn_83_0 = this.e(var6Lifetime2, 7746);
              if (var8 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_83_0) {
                stackIn_80_1 = (var6Lifetime2 == this.field_g.selectedIndex);
                this.a(stackIn_80_1, var6Lifetime2, -112, toolkit, opacity);
              }
              var6Lifetime2++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_83_0 = GameProgressUpdate.field_o.isVisible(false);
          }
          if (stackIn_83_0) {
            GameProgressUpdate.field_o.render(toolkit, 22707);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_89_0 = var4;
          stackIn_89_1 = new StringBuilder().append("ak.B(").append(opacity).append(',');
          if (toolkit == null) {
            stackIn_90_2 = "null";
          } else {
            stackIn_90_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_89_0), ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 53;
        int var4 = 520;
        int var5 = 130;
        QueuedIntArrayRequest.field_k.a(var5, var3, 5023231 | param1 << 24, GameInstructions.upgradesHelpLines[0], (byte) -34, 0);
        uq.field_a.a(var5, var3, param1 << 24 | 16777215, GameInstructions.upgradesHelpLines[0], (byte) -40, 0);
        var5 += 30;
        MessageDialog.field_db.a(100, 5023231 | param1 << 24, 0, var4, var3, (int[]) null, (ToolkitSprite[]) null, var5 - 30, -1, 0, 0, -8787, GameInstructions.upgradesHelpLines[1], (SpriteMask) null, 0, 1);
        LegacyOpenGlEffect.field_c.a(100, param1 << 24 | 16777215, 0, var4, var3, (int[]) null, (ToolkitSprite[]) null, -30 + var5, -1, 0, 0, -8787, GameInstructions.upgradesHelpLines[1], (SpriteMask) null, 0, 1);
        var5 += 42;
        MusicCrossfadeStream.field_q[0].drawRotated((float)(30 + var3), (float)(var5 + 20), 2048, 0, 1, 0, 2);
        MessageDialog.field_db.a(100, 5023231 | param1 << 24, 0, var4, 60 + var3, (int[]) null, (ToolkitSprite[]) null, -30 + var5, -1, 0, 0, -8787, GameInstructions.upgradesHelpLines[2], (SpriteMask) null, 0, 1);
        LegacyOpenGlEffect.field_c.a(100, 16777215 | param1 << 24, 0, var4, var3 + 60, (int[]) null, (ToolkitSprite[]) null, -30 + var5, -1, 0, 0, -8787, GameInstructions.upgradesHelpLines[2], (SpriteMask) null, 0, 1);
        var5 += 35;
        MusicCrossfadeStream.field_q[1].drawRotated((float)(var3 + 30), (float)(20 + var5), 2048, 0, 1, 0, 2);
        MessageDialog.field_db.a(100, 5023231 | param1 << 24, 0, var4, 60 + var3, (int[]) null, (ToolkitSprite[]) null, -30 + var5, -1, 0, 0, -8787, GameInstructions.upgradesHelpLines[3], (SpriteMask) null, 0, 1);
        if (param0 > -54) {
          this.screenId = 74;
        }
        LegacyOpenGlEffect.field_c.a(100, param1 << 24 | 16777215, 0, var4, var3 + 60, (int[]) null, (ToolkitSprite[]) null, -30 + var5, -1, 0, 0, -8787, GameInstructions.upgradesHelpLines[3], (SpriteMask) null, 0, 1);
        var5 += 35;
        MusicCrossfadeStream.field_q[2].drawRotated((float)(30 + var3), (float)(var5 + 20), 2048, 0, 1, 0, 2);
        MessageDialog.field_db.a(100, param1 << 24 | 5023231, 0, var4, var3 + 60, (int[]) null, (ToolkitSprite[]) null, var5 - 30, -1, 0, 0, -8787, GameInstructions.upgradesHelpLines[4], (SpriteMask) null, 0, 1);
        LegacyOpenGlEffect.field_c.a(100, 16777215 | param1 << 24, 0, var4, 60 + var3, (int[]) null, (ToolkitSprite[]) null, -30 + var5, -1, 0, 0, -8787, GameInstructions.upgradesHelpLines[4], (SpriteMask) null, 0, 1);
        var5 += 40;
        MessageDialog.field_db.a(100, param1 << 24 | 5023231, 0, var4, var3, (int[]) null, (ToolkitSprite[]) null, var5 - 30, -1, 0, 0, -8787, GameInstructions.upgradesHelpLines[5], (SpriteMask) null, 0, 1);
        LegacyOpenGlEffect.field_c.a(100, param1 << 24 | 16777215, 0, var4, var3, (int[]) null, (ToolkitSprite[]) null, -30 + var5, -1, 0, 0, -8787, GameInstructions.upgradesHelpLines[5], (SpriteMask) null, 0, 1);
    }

    private final void b(byte param0, int param1) {
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int var4;
        int var5;
        int[] var6;
        int var7;
        int var8;
        GraphicsToolkit var9;
        var8 = Sumoblitz.field_L ? 1 : 0;
        var9 = MatchingTextValidator.field_h.getToolkit(-125);
        var4 = param1 << 24 | 16777215;
        var5 = 664;
        DelegatingCanvas.a(up.field_c, 380, -5, param1 << 24, 3, var9, 650, 55, 1, true);
        if (param0 < 114) {
          return;
        }
        this.a(ChatMessage.instructionsText, param1, 29228);
        var6 = new int[50];
        var7 = 0;
        scanLoop1: while (true) {
          regionExit2: {
            regionExit3: {
              regionExit4: {
                boolean decompiledFrameRemainder1 = true;
                boolean decompiledFrameRemainder0 = true;
                if (var7 < 50) {
                  var6[var7] = -24 + var5;
                  stackIn_11_0 = 5;
                  stackIn_11_1 = StatefulWidgetRenderer.field_n;
                  if (var8 == 0) {
                    if (stackIn_11_0 == stackIn_11_1) {
                      var6[var7] = var6[var7] - 64;
                    }
                    var7++;
                    continue;
                  }
                } else {
                  var7 = StatefulWidgetRenderer.field_n;
                  decompiledFrameRemainder0 = (var7 != 0);
                  if (decompiledFrameRemainder0) {
                    stackIn_11_0 = ~var7;
                    stackIn_11_1 = -2;
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder1 = (stackIn_11_0 != stackIn_11_1 ||
                  var8 != 0))) {
                  switch (var7) {
                    case 2:
                      break regionExit4;
                    case 3:
                      break regionExit3;
                    default:
                      break scanLoop1;
                    case 4:
                      if (var8 == 0) {
                        break regionExit2;
                      }
                      break;
                  }
                }
                if (decompiledFrameRemainder1) {
                  this.a(param1, true);
                  if (var8 == 0) {
                    break scanLoop1;
                  }
                }
                this.d(param1, 8);
                if (var8 == 0) {
                  break scanLoop1;
                }
              }
              this.a(true, param1);
              if (var8 == 0) {
                break scanLoop1;
              }
            }
            this.a(param1, -119);
            if (var8 == 0) {
              break scanLoop1;
            }
          }
          this.a((byte) -123, param1);
          break;
        }
        MessageDialog.field_db.a(ArenaDefinition.formatFraction(1 + StatefulWidgetRenderer.field_n, true, GameInstructions.field_e.length), 5023231 | param1 << 24, -1, 380, 555, 0);
        LegacyOpenGlEffect.field_c.a(ArenaDefinition.formatFraction(1 + StatefulWidgetRenderer.field_n, true, GameInstructions.field_e.length), var4, -1, 380, 555, 0);
        return;
    }

    private final String a(int param0, byte param1) {
        int discarded$1 = 0;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String stackIn_11_0 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var3 = "";
        if (param1 >= -28) {
          discarded$1 = this.b(110, 125);
        }
        while (param0 >= 1000) {
          var4 = param0 % 1000;
          stackIn_11_0 = var4 + var3;
          if (var5 != 0) {
            return stackIn_11_0;
          }
          var6 = stackIn_11_0;
          var3 = var6;
          if (var4 >= 10) {
            if (100 > var4) {
              var3 = PrimitiveType.field_a + "0" + var6;
            } else {
              var3 = PrimitiveType.field_a + var3;
            }
          } else {
            var3 = PrimitiveType.field_a + "00" + var3;
          }
          param0 = param0 / 1000;
        }
        return param0 + var3;
    }

    private final boolean e(int param0, int param1) {
        if (this.screenId == 3) {
          if (0 == param0 &&
            StatefulWidgetRenderer.field_n == 0) {
            return false;
          }
          if (param0 == 2 &&
            ~StatefulWidgetRenderer.field_n == ~(-1 + GameInstructions.field_e.length)) {
            return false;
          }
        }
        if (this.screenId != 4 &&
          this.screenId == 5) {
        }
        if (param1 != 7746) {
          return false;
        }
        if (this.screenId != 2) {
          return true;
        }
        if (param0 == 3 &&
          0 == LegacyOpenGlShader.field_a) {
          return false;
        }
        if (param0 == 4 &&
          LegacyOpenGlShader.field_a == 1) {
          return false;
        }
        if (Bzip2State.field_j < 2) {
        }
        return true;
    }

    private final int b(int param0, int param1) {
        int var3;
        if (this.screenId == 2 &&
          !vs.isGuestSession((byte) 9)) {
          if (3 != param0 &&
            4 != param0) {
            if (param0 == 5) {
              return 240;
            }
            return 155 * (param0 % 3) + GraphicsHeap.field_l[this.screenId];
          }
          return 465 + GraphicsHeap.field_l[this.screenId];
        }
        var3 = 27 / ((-40 - param1) / 47);
        if (this.screenId == 3) {
          return 20 + param0 * 200;
        }
        if (this.screenId != 9 &&
          10 != this.screenId) {
          if (this.screenId == 7) {
            return 200 * param0 + 205;
          }
          if (this.screenId == 11) {
            return 40 + 280 * param0;
          }
          if (this.screenId == 4 &&
            !vs.isGuestSession((byte) 9)) {
            return 220;
          }
          if (4 == this.screenId &&
            vs.isGuestSession((byte) 9)) {
            return 20 + 300 * param0;
          }
          if (this.screenId == 0 &&
            1 < param0 &&
            4 > param0) {
            return -14 + (-163 + 163 * param0);
          }
          if (this.screenId == 5 &&
            vs.isGuestSession((byte) 9)) {
            return 300 * param0 + 20;
          }
          if (this.screenId == 5) {
            return 120 + 200 * param0;
          }
          return GraphicsHeap.field_l[this.screenId];
        }
        return 120 + param0 * 200;
    }

    private final int c(int param0, int param1) {
        if (this.screenId != 11 &&
          12 != this.screenId) {
          if (0 == this.screenId &&
            param1 < 2) {
            return 48;
          }
          if (param0 != 8) {
            field_f = -98;
          }
          return 32;
        }
        return 48;
    }

    final static void initializeLogoAudio(ResourceArchive param0, int param1) {
        VorbisSample var2 = null;
        try {
          if (param1 != 100) {
            field_a = (ToolkitSprite[]) null;
          }
          VorbisSample.decodeSetup(param0.fetchNamedFile("", "headers.packvorbis", -1));
          var2 = VorbisSample.load(param0, "jagex logo2.packvorbis", "");
          var2.decodeAll();
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ak.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void update(int param0) {
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (BeveledCheckboxRenderer.hasOpenDialogs(false)) {
          return;
        }
        if (GameProgressUpdate.field_o.isVisible(false)) {
          GameProgressUpdate.field_o.update(15);
          return;
        }
        if (100 > ReflectionCheck.field_q) {
          ReflectionCheck.field_q = ReflectionCheck.field_q + 1;
        }
        if (this.field_e > 0) {
          this.field_e = this.field_e - 1;
        }
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (!EmailCredentials.c(-102)))) {
          if (TextureCombineOperation.field_a == 13) {
            if (this.screenId == 1) {
              StrongCacheReference.switchMenuScreen(-7753, false, -1);
              LruNodeCache.gameplaySession.closePauseMenu((byte) 112);
              AffineTransform3D.field_j = 0;
              ArchiveLoadRequirement.playSoundEffect(15, true);
              if (var3 == 0) {
                continue;
              }
            }
            if (this.screenId == 6) {
              continue;
            }
            if (this.screenId == 10) {
              continue;
            }
            if (11 == this.screenId) {
              continue;
            }
            if (this.screenId == 12) {
              continue;
            }
            StrongCacheReference.switchMenuScreen(-7753, false, AffineTransform3D.field_j);
            ArchiveLoadRequirement.playSoundEffect(15, true);
            if (var3 == 0) {
              continue;
            }
          }
          this.a((byte) 126);
          if (this.field_g.selectedIndex == -1) {
            continue;
          }
          this.a(false, (byte) -75, this.field_g.selectedIndex);
          if (var3 == 0) {
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          this.field_g.updatePointerSelection(true, this.a(LoginCredentialType.field_a, (byte) 97, AgeValidator.field_f), this.a(ko.field_p, (byte) 49, pi.field_e));
        }
        if (-1 != this.field_g.selectedIndex) {
          this.a(true, (byte) 105, this.field_g.selectedIndex);
        }
        if (ActiveCanvasProvider.field_c == 0) {
        }
        if (param0 != -18556) {
          this.field_e = -17;
        }
        return;
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 != -6) {
          MenuScreen.releaseStatics(61);
        }
        field_a = null;
    }

    private final int f(int param0, int param1) {
        int var3;
        var3 = 121 % ((-59 - param0) / 50);
        if (this.screenId == 2 &&
          !vs.isGuestSession((byte) 9)) {
          return 170 + this.b(param1, -92);
        }
        if (3 == this.screenId) {
          return 200 + this.b(param1, -106);
        }
        if (!vs.isGuestSession((byte) 9) && (this.screenId == 4 ||
          this.screenId == 5)) {
          return 200 + this.b(param1, -88);
        }
        if (vs.isGuestSession((byte) 9) && (this.screenId == 4 ||
          5 == this.screenId)) {
          return this.b(param1, 41) + 300;
        }
        if (this.screenId != 9 &&
          this.screenId != 10) {
          if (this.screenId == 7) {
            return this.b(param1, -121) + 165;
          }
          if (this.screenId == 11) {
            return 280 + this.b(param1, -121);
          }
          if (0 == this.screenId &&
            param1 > 1 &&
            param1 < 4) {
            return 179 + this.b(param1, 77);
          }
          return RendererPreference.field_d[this.screenId];
        }
        return 200 + this.b(param1, -108);
    }

    private final void h(int param0, int param1) {
        int var4;
        String var5;
        String var6;
        HiscoreRequest var7_ref_of;
        int var7;
        String[] var8;
        int[] var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        String var17;
        String var18;
        int var19;
        GraphicsToolkit var20;
        int stackIn_34_0 = 0;
        String stackIn_37_0 = null;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        String var6Lifetime1;
        var19 = Sumoblitz.field_L ? 1 : 0;
        var20 = MatchingTextValidator.field_h.getToolkit(-124);
        DelegatingCanvas.a(up.field_c, 424, -5, param0 << 24, 3, var20, 650, 45, param1, true);
        var4 = 0;
        if (EmailValidationError.field_c == 2) {
        }
        if (3 == EmailValidationError.field_c) {
        }
        var5 = wq.allHiscoresText;
        if (1 == HardwareBufferSet.field_j) {
          var5 = SpriteState.myHiscoresText;
        }
        if (2 == HardwareBufferSet.field_j) {
          var5 = jm.bestHiscoresText;
        }
        regionExit1: {
          regionExit2: {
            this.a(var5, param0, param1 + 29227);
            if (vs.isGuestSession((byte) 9)) {
              var6 = HardwareSpecularEffect.noHighscoresText;
              if (var19 == 0) {
                break regionExit2;
              }
            }
            if (HardwareTextureCache.field_f == null) {
              HardwareTextureCache.field_f = HiscoreRequest.requestHiscores(2, 1, LegacyOpenGlShader.field_a, 3, 10);
            }
            var7_ref_of = HardwareTextureCache.field_f;
            if (var7_ref_of.complete) {
              if (var7_ref_of.names == null) {
                var6 = SectorCacheStore.serviceUnavailableText;
                if (var19 == 0) {
                  break regionExit2;
                }
              }
              var6 = HardwareSpecularEffect.noHighscoresText;
              var8 = var7_ref_of.names[HardwareBufferSet.field_j];
              var9 = var7_ref_of.values[HardwareBufferSet.field_j];
              var10 = kp.findSubmittedHiscore(var7_ref_of, param1 - 2, GameKeyHandler.field_a, HardwareBufferSet.field_j);
              SocketConnector.field_a.a("10. ", param1 - 1);
              var11 = AccountConnectionPhase.field_a.field_i + 140;
              var11 -= 20;
              var12 = 128;
              var13 = 512;
              var14 = 28900 - (AccountConnectionPhase.field_a.field_i / 2 - var11 + 240) * (-var11 + (240 + AccountConnectionPhase.field_a.field_i / 2));
              if (var14 > 0) {
                Math.sqrt((double)var14);
              }
              var15 = param0 << 24 | 16777215;
              QueuedIntArrayRequest.field_k.a(var11, var12, 5023231 | param0 << 24, pd.nameText, (byte) -30, -1);
              if (~var10 == ~var4) {
                var15 = -17409;
              }
              uq.field_a.a(var11, var12, var15, pd.nameText, (byte) -71, -1);
              QueuedIntArrayRequest.field_k.a(-1, var13, LoginCredentials.scoreText, var11, 5023231 | param0 << 24, 72);
              uq.field_a.a(-1, var13, LoginCredentials.scoreText, var11, var15, 59);
              var11 += 20;
              var4 = 0;
              while (10 > var4) {
                var12Lifetime1 = 128;
                var13Lifetime1 = 512;
                var14Lifetime1 = 28900 - (240 - var11 + AccountConnectionPhase.field_a.field_i / 2) * (AccountConnectionPhase.field_a.field_i / 2 + (-var11 + 240));
                stackIn_34_0 = var14Lifetime1;
                if (var19 != 0) {
                  break regionExit1;
                }
                if (stackIn_34_0 > 0) {
                  Math.sqrt((double)var14Lifetime1);
                }
                if (var8[var4] != null) {
                  var15Lifetime1 = -1;
                  var16 = var9[var4 * 2];
                  var17 = var8[var4];
                  if (var10 == var4) {
                    var20.fillRectangle((byte) -59, 60 + (var13Lifetime1 - var12Lifetime1), var11 - 12, 16759807 | (param0 & 772132860) << 22, var12Lifetime1 - 30, 16);
                    var15Lifetime1 = -17409;
                  }
                  MessageDialog.field_db.a(0, var12Lifetime1 - 1, 1 + var4 + ". ", var11, param0 << 24 | 5023231, param1 ^ 64);
                  MessageDialog.field_db.a(var11, var12Lifetime1 - 1, 5023231 | param0 << 24, var17, (byte) -54, 0);
                  MessageDialog.field_db.a(0, var12Lifetime1, 1 + var4 + ". ", -1 + var11, param0 << 24 | 5023231, 96);
                  MessageDialog.field_db.a(var11 - 1, var12Lifetime1, 5023231 | param0 << 24, var17, (byte) -41, 0);
                  MessageDialog.field_db.a(-1, var12Lifetime1, var4 + 1 + ". ", var11, param0 << 24 | 5023231, param1 ^ 80);
                  MessageDialog.field_db.a(var11, var12Lifetime1, param0 << 24 | 5023231, var17, (byte) -119, -1);
                  LegacyOpenGlEffect.field_c.a(0, -1 + var12Lifetime1, 1 + var4 + ". ", var11, 0, 80);
                  LegacyOpenGlEffect.field_c.a(var11, var12Lifetime1 - 1, 0, var17, (byte) -110, 0);
                  LegacyOpenGlEffect.field_c.a(0, var12Lifetime1, var4 + 1 + ". ", var11 - 1, 0, 82);
                  LegacyOpenGlEffect.field_c.a(-1 + var11, var12Lifetime1, 0, var17, (byte) -92, 0);
                  LegacyOpenGlEffect.field_c.a(-1, var12Lifetime1, 1 + var4 + ". ", var11, var15Lifetime1, 84);
                  LegacyOpenGlEffect.field_c.a(var11, var12Lifetime1, var15Lifetime1, var17, (byte) -116, -1);
                  var18 = this.a(var16, (byte) -81);
                  MessageDialog.field_db.a(-1, -1 + var13Lifetime1, var18, var11, 5023231 | param0 << 24, 124);
                  MessageDialog.field_db.a(-1, var13Lifetime1, var18, var11 - 1, param0 << 24 | 5023231, 124);
                  MessageDialog.field_db.a(-1, var13Lifetime1, var18, var11, 5023231 | param0 << 24, 43);
                  LegacyOpenGlEffect.field_c.a(-1, var13Lifetime1, var18, var11, param0 << 24 | var15Lifetime1, 116);
                  var6 = "";
                }
                var11 += 20;
                var4++;
              }
              if (var19 != 0) {
                var6 = AccountRequestState.pleaseWaitText;
              }
            } else {
              var6 = AccountRequestState.pleaseWaitText;
            }
          }
          stackIn_34_0 = 100 + (140 + SocketConnector.field_a.field_i);
        }
        var7 = stackIn_34_0;
        MessageDialog.field_db.a(var6, 5023231 | param0 << 24, -1, var7, 320, 0);
        LegacyOpenGlEffect.field_c.a(var6, param0 << 24 | 16777215, -1, var7, 320, param1 - 1);
        if (!vs.isGuestSession((byte) 9)) {
          stackIn_37_0 = LinkWidgetRenderer.friendsCanBeAddedText;
        } else {
          stackIn_37_0 = InstrumentNoteMask.createAFreeAccountText;
        }
        var6Lifetime1 = stackIn_37_0;
        MessageDialog.field_db.a(var6Lifetime1, param0 << 24 | 5023231, -1, SocketConnector.field_a.field_i + 140 + 220, 320, 0);
        LegacyOpenGlEffect.field_c.a(var6Lifetime1, 16777215 | param0 << 24, -1, 140 + SocketConnector.field_a.field_i + 220, 320, 0);
    }

    private final void a(String param0, int param1, int param2) {
        try {
          ma.field_b.a(param0, 0);
          if (param2 != 29228) {
            this.resetSelection(-7, true);
          }
          ForceFieldRingEffect.field_t.a(param0, 5023231 | param1 << 24, -1, 96, 320, 0);
          hc.field_e.a(param0, 16777215 | param1 << 24, -1, 96, 320, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ak.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    MenuScreen(int param0) {
        this.field_c = -1;
        this.screenId = param0;
        this.field_g = new MenuSelectionController(kd.field_a[param0].length);
    }

    private final void d(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var3Lifetime1;
        int var4Lifetime1;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var3 = 53;
        var4 = 520;
        var5 = 140;
        var6 = 0;
        if (param1 != 8) {
          this.b((byte) -41, 2);
        }
        while (var6 < 5) {
          if (var7 == 0) {
            if (var6 != 2) {
              if (var6 != 4) {
                var3Lifetime1 = 53;
                var4Lifetime1 = 540;
              } else {
                var3Lifetime1 = 200;
                var4Lifetime1 = 350;
              }
            } else {
              var3Lifetime1 = 200;
              var4Lifetime1 = 370;
            }
            if (GameInstructions.controlsHelpLines[var6].startsWith("<b>")) {
              QueuedIntArrayRequest.field_k.a(var5, var3Lifetime1, param0 << 24 | 5023231, GameInstructions.controlsHelpLines[var6], (byte) -98, 0);
              uq.field_a.a(var5, var3Lifetime1, param0 << 24 | 16777215, GameInstructions.controlsHelpLines[var6], (byte) -32, 0);
            } else if (var6 != 1) {
              if (3 != var6) {
                MessageDialog.field_db.a(100, 5023231 | param0 << 24, 0, var4Lifetime1, var3Lifetime1, (int[]) null, (ToolkitSprite[]) null, var5, -1, 0, 0, -8787, GameInstructions.controlsHelpLines[var6], (SpriteMask) null, 0, 1);
                LegacyOpenGlEffect.field_c.a(100, 16777215 | param0 << 24, 0, var4Lifetime1, var3Lifetime1, (int[]) null, (ToolkitSprite[]) null, var5, -1, 0, 0, -8787, GameInstructions.controlsHelpLines[var6], (SpriteMask) null, 0, 1);
              } else {
                LegacyCubeMapSource.field_e.draw(var3Lifetime1 + 16, 14 + var5);
              }
            } else {
              HudMessage.field_m.draw(28 + var3Lifetime1, var5 + 20);
            }
            if (var6 == 2) {
              var5 += 80;
            }
            if (var6 == 1) {
              var5 += 20;
            }
            var6++;
            continue;
          }
          break;
        }
    }

    static {
        field_b = new IntrusiveDeque();
    }
}
