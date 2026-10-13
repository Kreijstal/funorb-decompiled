/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class InteractiveGameClient extends GameConnectionShell implements vc {
    static boolean field_E;

    public abstract void updateGameLayer(boolean inputEnabled, byte obfuscationGuard);

    private final void dispatchIncomingPackets(boolean obfuscationGuard) {
        int var3;
        boolean stackIn_9_1 = false;
        boolean stackIn_11_0 = false;
        var3 = BrickABrac.field_J ? 1 : 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (!nl.readNextGamePacket(ch.incomingPacketLengths, (byte) 64)))) {
          stackIn_11_0 = this.handleGamePacket(jl.incomingPackets, (byte) 47, IntrusiveHashTable.currentPacketOpcode);
          if (var3 == 0) {
            if (stackIn_11_0) {
              continue;
            }
            stackIn_9_1 = !(obfuscationGuard);
            this.dispatchCommonPacket(stackIn_9_1);
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_11_0 = obfuscationGuard;
        }
        if (!stackIn_11_0) {
          field_E = false;
        }
        return;
    }

    final static int sine8192(int angle, int obfuscationGuard) {
        angle = angle & 8191;
        if (~angle <= obfuscationGuard) {
          return angle >= 6144 ? -um.quarterSineQ16[8192 - angle] : -um.quarterSineQ16[-4096 + angle];
        }
        return angle < 2048 ? um.quarterSineQ16[angle] : um.quarterSineQ16[4096 - angle];
    }

    final static boolean a(int param0, int param1, int param2) {
        boolean stackIn_10_0 = false;
        if (dc.currentKeyCode == 13) {
          th.b(param1 ^ 103);
          return true;
        }
        if (dc.currentKeyCode == param1) {
          hd.field_a.f((byte) 41);
          return true;
        }
        stackIn_10_0 = (hd.field_a != null) && (hd.field_a.a(param2, param0, (byte) -126));
        return stackIn_10_0;
    }

    public abstract void renderGameLayer(int obfuscationGuard);

    abstract void b(int param0, int param1);

    public abstract boolean handleGameKey(int keyCode, char character, int obfuscationGuard);

    private final void i(boolean param0) {
        if (param0) {
          this.updateClient(-67);
        }
    }

    final void renderClient(int obfuscationGuard) {
        java.awt.Canvas var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = gd.a((byte) 0);
        if (r.c((byte) -84)) {
          TableNameEntry.a((byte) 68, var2, LegacyUtf8Decoder.a((byte) -81));
          return;
        }
        if (!un.field_f) {
          kn.a(true, var2);
          return;
        }
        if (!um.field_t &&
          !og.h(-26090)) {
          ParisBackground.a((byte) 24, 100.0f, qm.field_e);
          kn.a(true, var2);
          return;
        }
        IntArrayRequest.field_i = true;
        var3 = kp.field_d.size() - 1;
        do {
          if (var3 < 0) {
            if (obfuscationGuard <= 93) {
              field_E = false;
            }
            break;
          }
          ((vc) (kp.field_d.elementAt(var3))).renderGameLayer(16769381);
          var3--;
        } while (var4 == 0);
        if (IntArrayRequest.field_i) {
          jj.a((byte) -123);
          ck.a(var2, 0, 14209, 0);
          if (var4 == 0) {
            return;
          }
        }
        this.i(false);
        return;
    }

    protected InteractiveGameClient() {
    }

    final void registerUiLifecycle(int obfuscationGuard, GameUiLifecycle lifecycle) {
        try {
          AchievementMaskRequest.uiLifecycle = lifecycle;
          this.configureCommonPackets(8, true);
          this.enablePacketOne(obfuscationGuard ^ 3156);
          this.enableCommonPacket(2);
          this.enablePacketFive(true);
          this.enablePacketFour((byte) -67);
          if (obfuscationGuard != 3160) {
            return;
          }
          try {
            this.enablePacketSix(64);
            this.enablePacketsElevenToThirteen((byte) -19);
            ch.incomingPacketLengths[9] = -1;
            ch.incomingPacketLengths[10] = -1;
            kp.field_d = new Vector();
            KeyboardInput.a((vc) (this), 0);
          } catch (RuntimeException runtimeException) {
            throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "sa.HB(" + obfuscationGuard + ',' + (lifecycle != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract boolean handleGamePacket(BitPacketBuffer packet, byte obfuscationGuard, int opcode);

    final static void a(int param0, PaletteFont param1, String param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        try {
          var7_int = (-param1.capHeight + (param4 + (2 * param0 - param1.xHeight))) / 2;
          int var8 = -69 / ((param6 + 85) / 40);
          nn.field_g.drawCentered(param2, param3, var7_int + nn.field_g.capHeight, param5, -1);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "sa.NB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void r(int param0) {
        boolean stackIn_20_1 = false;
        boolean stackIn_39_0 = false;
        int stackIn_64_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        vc var6 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 != 10) {
          return;
        }
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted0 = true;
        boolean decompiledFrameRemainder0 = true;
        var2 = 0;
        if (!m.a(2)) {
          if (lg.a(9)) {
            if (!me.b(126)) {
              var3 = InstructionsScreen.f((byte) 124);
              switch (var3) {
                case 3:
                  cp.a(true, 21543);
                default:
                  break;
                case 4:
                  he.a(qn.field_k, false, (byte) 61);
                  wi.field_g = true;
                  if (var5 == 0) {
                    break;
                  }
                case 2:
                  LevelPack.b(102);
                  break;
              }
              this.updateGameLayer(false, (byte) 69);
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              nk.a(58);
              decompiledFrameRemainder0 = (var5 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (GameClock.c((byte) -33)) {
              stackIn_20_1 = (ua.field_d != null);
              var3 = this.b(stackIn_20_1, (byte) -118);
              if (1 == var3 ||
                var3 == 2) {
                if (null != ua.field_d) {
                  LevelPack.b(118);
                }
                if (var3 == 2) {
                  nk.a(param0 ^ 2058, uc.e((byte) -85));
                }
              }
              this.updateGameLayer(false, (byte) 81);
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (uc.f(21651)) {
                if (!me.b(param0 ^ -16)) {
                  var3 = vh.h(0);
                  if (1 == var3) {
                    he.a(LevelPackLoader.field_a, true, (byte) 97);
                  }
                  this.updateGameLayer(false, (byte) 7);
                  decompiledFrameRemainder0 = (var5 != 0);
                }
                if (decompiledFrameRemainder0) {
                  nk.a(param0 + 47);
                  decompiledFrameRemainder0 = (var5 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (!me.b(-34)) {
                  var2 = 1;
                  var3 = -1;
                  while (true) {
                    stackIn_39_0 = jl.pollKeyEvent((byte) 5);
                    if (stackIn_39_0) {
                      stackIn_76_0 = dc.currentKeyCode;
                      stackIn_76_1 = -1;
                      if (var5 != 0) {
                        if (stackIn_76_0 < stackIn_76_1) {
                          var6 = (vc) (kp.field_d.elementAt(var3));
                          var6.updateGameLayer(var2 != 0, (byte) -126);
                          decompiledFrameCompleted1 = false;
                          break;
                        }
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_76_0 == stackIn_76_1) {
                        if (-1 == dc.currentKeyCode &&
                          var3 != -1) {
                          dc.currentKeyCode = var3;
                          var3 = -1;
                        }
                      } else {
                        if (uf.b(-102, dc.currentKeyCode)) {
                          var3 = dc.currentKeyCode;
                          continue;
                        }
                      }
                      var4 = 0;
                      while (var4 < kp.field_d.size()) {
                        stackIn_39_0 = ((vc) (kp.field_d.elementAt(var4))).handleGameKey(dc.currentKeyCode, go.currentKeyCharacter, -81);
                        if (!stackIn_39_0) {
                          var4++;
                          continue;
                        }
                        break;
                      }
                      continue;
                    }
                    break;
                  }
                  if ((decompiledFrameCompleted1) &&
                    (decompiledFrameCompleted0) &&
                    (var5 != 0)) {
                    nk.a(114);
                    this.updateGameLayer(false, (byte) 28);
                  }
                } else {
                  nk.a(114);
                  if (var5 != 0) {
                    this.updateGameLayer(false, (byte) 28);
                  }
                }
              }
            }
          }
        } else {
          this.updateGameLayer(false, (byte) 28);
        }
        if ((decompiledFrameCompleted1) &&
          (decompiledFrameCompleted0)) {
          var3 = 0;
          while (!(var3 >= kp.field_d.size())) {
            var6 = (vc) (kp.field_d.elementAt(var3));
            var6.updateGameLayer(var2 != 0, (byte) -126);
            if (var5 != 0) {
              break;
            }
            stackIn_64_0 = var2;
            if (var6.b(59)) {
              stackIn_65_1 = 0;
            } else {
              stackIn_65_1 = 1;
            }
            var2 = stackIn_64_0 & stackIn_65_1;
            var3++;
          }
        }

    }

    final static String a(char param0, int param1, int param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        var6 = new char[param2];
        var3 = var6;
        var4 = 0;
        do {
          if (param2 <= var4) {
            var4 = -55 / ((param1 - 75) / 40);
            break;
          }
          var6[var4] = param0;
          var4++;
        } while (var5 == 0);
        return new String(var6);
    }

    abstract void p(int param0);

    public final boolean b(int param0) {
        if (param0 < 36) {
          return true;
        }
        return true;
    }

    abstract boolean q(int param0);

    final static void drawParallaxLayers(byte obfuscationGuard, RgbSprite nearSprite, int destinationY, int scaleDivisor, RgbSprite midSprite, RgbSprite farSprite, int scroll16, int viewportWidth, int verticalOffset, int destinationX) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        RgbSprite var11 = null;
        try {
          farSprite.drawAt((scroll16 * 5 >> 16) + ((-farSprite.canvasWidth + viewportWidth) / 2 + destinationX), destinationY);
          midSprite.drawTransparent(destinationX + (viewportWidth - midSprite.canvasWidth) / 2 - (-(scroll16 * 10 >> 16) - 10 / scaleDivisor), 480 + (verticalOffset + (destinationY - midSprite.canvasHeight)));
          if (obfuscationGuard <= 79) {
            var11 = (RgbSprite) null;
            InteractiveGameClient.drawParallaxLayers((byte) 75, (RgbSprite) null, -80, -107, (RgbSprite) null, (RgbSprite) null, 10, 97, -30, 44);
          }
          nearSprite.drawTransparent(10 / scaleDivisor + (destinationX - (-((-nearSprite.canvasWidth + viewportWidth) / 2) - (20 * scroll16 >> 16))), 480 + (destinationY + verticalOffset - nearSprite.canvasHeight));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_6_0 = var10;
          stackIn_6_1 = new StringBuilder().append("sa.MB(").append(obfuscationGuard).append(',');
          if (nearSprite == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(destinationY).append(',').append(scaleDivisor).append(',');
          if (midSprite == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (farSprite == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(scroll16).append(',').append(viewportWidth).append(',').append(verticalOffset).append(',').append(destinationX).append(')').toString());
        }
    }

    final void updateClient(int obfuscationGuard) {
        boolean stackIn_7_1 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        AchievementSubmission var5 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (null != ua.field_d &&
          ua.field_d.focusLossPending) {
          LevelPack.b(84);
          MotionWaypoint.c(4);
        }
        stackIn_7_1 = (ua.field_d != null);
        this.updateConnection(stackIn_7_1, 1);
        if (obfuscationGuard >= -34) {
          field_E = false;
        }
        if (lo.field_d) {
          AchievementMaskRequest.uiLifecycle.prepareUiAssets(true);
          lo.field_d = false;
        }
        if (r.c((byte) -87)) {
          this.g(false);
          if (r.c((byte) -113)) {
            return;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        this.dispatchIncomingPackets(true);
        if (!un.field_f) {
          MouseWheelSource.a(GameplayAudioEvent.mouseWheelDelta, (byte) 112);
          decompiledFrameRemainder0 = !(!AchievementMaskRequest.uiLifecycle.pollUiBootstrap((byte) -54));
          if (decompiledFrameRemainder0) {
            AchievementMaskRequest.uiLifecycle.initializeUi(false);
            un.field_f = true;
            decompiledFrameRemainder0 = (var4 != 0);
          }
        }
        if (decompiledFrameRemainder0) {
          boolean decompiledSharedTail0 = (!(um.field_t) &&
            !(og.h(-26090)));
          if (!decompiledSharedTail0) {
            this.r(10);
            decompiledSharedTail0 = (var4 != 0);
          }
          if ((decompiledSharedTail0) &&
            (AchievementMaskRequest.uiLifecycle.pollUiReady(23570))) {
            um.field_t = true;
            this.p(1);
            mc.a((byte) 126);
          }
        }
        if (!og.h(-26090)) {
          do {
            var5 = (AchievementSubmission) (lp.queuedAchievementSubmissions.removeFirst(3));
            if (var5 == null) {
              if (var4 == 0) {
                break;
              }
            } else {
              df.submitAchievement(var5, 4, -161);
            }
          } while (var4 == 0);
        }
        HuffmanCodec.a(14114);
        tm.a((byte) 110, 0);
        if (ui.a(false)) {
          var2 = this.o(-105);
          if (0 == var2 ||
            var2 == 1) {
            this.b(var2, 1);
          }
          var3 = 0;
          if (var2 == 2) {
            var3 = 1;
          }
          if (this.q(73)) {
            var3 = 1;
          }
          if (!ui.a(false)) {
            var3 = 0;
          }
          if (var3 != 0) {
            FarmBackground.g(115);
          }
        }
    }

    static {
    }
}
