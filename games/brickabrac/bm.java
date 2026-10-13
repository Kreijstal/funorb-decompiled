/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    static String field_b;
    static byte[][][] field_a;
    static int[] field_f;
    static nn field_d;
    static String field_e;
    static int field_c;

    final static void a(boolean param0, int param1, int param2, boolean param3, Mesh3D param4) {
        byte dupTemp$0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        boolean stackIn_41_0 = false;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_32_0Lifetime1;
        int stackIn_32_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = BrickABrac.field_J ? 1 : 0;
        try {
          var5_int = ed.unsignedBitLength(9, 3 * (-param1 + param2));
          var6 = param1 * 3;
          PowerUpWarning.a(0);
          var7 = var5_int - 10;
          if (param4.faceGroupCount > 0 &&
            null != param4.faceGroups) {
            qi.a((byte) 109);
          }
          mc.field_c = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param4.faceCount > var8)))) {
            var9 = param4.faceVertexA[var8];
            var10 = param4.faceVertexB[var8];
            var11 = param4.faceVertexC[var8];
            stackIn_41_0 = param0;
            if (var19 == 0) {
              if (stackIn_41_0) {
                var12 = ArchiveNetworkRequest.field_M[var9];
                var13 = ed.field_e[var9];
                var14 = ArchiveNetworkRequest.field_M[var10] - var12;
                var15 = -var12 + ArchiveNetworkRequest.field_M[var11];
                var16 = ed.field_e[var10] - var13;
                var17 = -var13 + ed.field_e[var11];
              }
              if (!stackIn_41_0 ||
                var14 * var17 - var15 * var16 < 0) {
                var12Lifetime1 = Paddle.field_v[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = Paddle.field_v[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = Paddle.field_v[var11];
                    if (var14 != -2147483648) {
                      var15 = var12Lifetime1 + (var13Lifetime1 + var14 - var6);
                      if (var7 < 0) {
                        stackIn_22_0 = var15 << -var7;
                      } else {
                        stackIn_22_0 = var15 >> var7;
                      }
                      var16 = -stackIn_22_0 + (ArcticBackground.field_w.length - 1);
                      var17 = ArcticBackground.field_w[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_32_0 = -1;
                          stackIn_32_1 = ~var16;
                          if (stackIn_32_0 < stackIn_32_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = ArcticBackground.field_w[var16];
                          continue;
                        }
                        stackIn_32_0Lifetime1 = var16 << 4;
                        stackIn_32_1Lifetime1 = var17;
                        var18 = stackIn_32_0Lifetime1 + stackIn_32_1Lifetime1;
                        ek.field_jb[var18] = var8;
                        ArcticBackground.field_w[var16] = var17 + 1;
                        if (param4.faceGroupCount > 0 &&
                          param4.faceGroups != null) {
                          dupTemp$0 = param4.faceGroups[var8];
                          AppletGameShell.field_m[dupTemp$0] = AppletGameShell.field_m[dupTemp$0] + 1;
                        }
                        mc.field_c = mc.field_c + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_41_0 = param3;
          }
          if (stackIn_41_0) {
            field_e = (String) null;
          }
          if (0 < param4.faceGroupCount &&
            param4.faceGroups != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= AppletGameShell.field_m.length)) {
              var10Lifetime1 = AppletGameShell.field_m[var9Lifetime1];
              AppletGameShell.field_m[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_58_0 = var5;
          stackIn_58_1 = new StringBuilder().append("bm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(')').toString());
        }
    }

    final static void loadLogoMeshes(byte obfuscationGuard, ResourceArchive archive) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        BitPacketBuffer var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        Mesh3D var5 = null;
        int[] var6 = null;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          var2 = new BitPacketBuffer(archive.takeFileByName(-72, "logo.fo3d", ""));
          var3 = var2.readUnsignedByte(obfuscationGuard + 325);
          var2.beginBitRead(obfuscationGuard - 47);
          um.field_o = rk.decodeMeshAttributeRecords(var2, 24);
          gg.logoMeshes = new Mesh3D[var3];
          BoundedFile.logoOriginalCenters = new int[var3][];
          if (obfuscationGuard != -70) {
            return;
          }
          var4 = 0;
          do {
            if (var4 >= var3) {
              var2.finishBitRead((byte) 116);
              break;
            }
            gg.logoMeshes[var4] = hc.decodeMesh(16, var2);
            var4++;
          } while (var7 == 0);
          var4 = 0;
          while (var4 < var3) {
            var5 = gg.logoMeshes[var4];
            var5.scaleVertices(6, 127, 1, 6, 6);
            var5.ensureBounds(obfuscationGuard + 93);
            var6 = new int[]{var5.maxX + var5.minX >> 1, var5.maxY + var5.minY >> 1, var5.maxZ + var5.minZ >> 1};
            BoundedFile.logoOriginalCenters[var4] = var6;
            var5.translateVerticesFrom(-var6[2], obfuscationGuard ^ -70, -var6[0], -var6[1]);
            var4++;
            if (var7 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_20_0 = var2_ref;
          stackIn_20_1 = new StringBuilder().append("bm.E(").append(obfuscationGuard).append(',');
          if (archive == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, PlayerBoard param3, int param4, int param5, String param6, byte param7) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        double var9 = 0.0;
        int var11 = 0;
        try {
          if (param3.maskedTicks < 50) {
            return;
          }
          var8_int = -50 + param3.maskedTicks;
          var9 = 250.0 * Math.abs(Math.cos(0.1 * (double)var8_int)) * Math.exp((double)(-var8_int) / 40.0);
          if (param7 < 69) {
            field_c = -9;
          }
          if (var8_int >= 110) {
            var9 = 0.0;
          }
          var9 = var9 / (double)param5;
          Ball.field_w.drawAt(param0 - 7 / param5, -(7 / param5) + (param1 - (int)var9));
          Ball.field_w.g(-(7 / param5) + param0, (int)var9 - 7 / param5 + (param1 + Ball.field_w.canvasHeight));
          if (var8_int >= 130) {
            var11 = var8_int - 130;
            if (var11 > 100) {
              var11 = 100;
            }
            var11 = var11 * 128 / 50;
            nn.field_g.drawCenteredAlpha(param6, param0 + param4 / (2 * param5), nn.field_g.capHeight + (param2 / (2 * param5) + (param1 - 100 / param5)), 0, -1, var11);
            lo.a(param4, var11, 60, param0, param5, param1, param2, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_18_0 = var8;
          stackIn_18_1 = new StringBuilder().append("bm.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param7).append(')').toString());
        }
    }

    final static void playGameplayAudioEvents(int volume, int activityVolumePerEvent, boolean alternateActivityLoop, int obfuscationGuard, NodeDeque events) {
        int alternateLoopFlag = 0;
        PcmStream selectedLoop = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String eventsSummary = null;
        RuntimeException caughtFailure = null;
        int activityEvents = 0;
        RuntimeException failure = null;
        GameplayAudioEvent event = null;
        PcmStream activityLoop = null;
        Object sound = null;
        int targetVolume = 0;
        PcmSound[] sceneSounds = null;
        int currentVolume = 0;
        int maximumVolumeStep = 0;
        int gameFlag = 0;
        gameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          activityEvents = 0;
          if (obfuscationGuard != -30791) {
            bm.playGameplayAudioEvents(98, -116, false, -50, (NodeDeque) null);
          }
          event = (GameplayAudioEvent) (events.first(-65));
          boolean eventsExhausted = false;
          while (!(eventsExhausted = (event == null))) {
            sound = null;
            alternateLoopFlag = 1;
            if (gameFlag == 0) {
              boolean unusedRemainder = true;
              if (alternateLoopFlag != event.eventCode) {
                if (event.eventCode != 0) {
                  if (event.eventCode == 2) {
                    sound = Mesh3D.field_e[ChocolateBackground.field_w.nextBoundedInt(-37880252, Mesh3D.field_e.length)];
                  } else {
                    if (event.eventCode != 4) {
                      if (event.eventCode == 5) {
                        sound = ta.uiSounds[5];
                      } else {
                        if (6 == event.eventCode) {
                          sound = ta.uiSounds[6];
                        } else {
                          if (event.eventCode == 7) {
                            sound = ta.uiSounds[7];
                          } else {
                            if (3 == event.eventCode) {
                              sound = ef.field_a[event.detailId];
                            } else {
                              if (8 == event.eventCode) {
                                sound = ta.uiSounds[10];
                              } else {
                                if (9 == event.eventCode) {
                                  sound = ta.uiSounds[11];
                                } else {
                                  if (event.eventCode == 10) {
                                    sound = ta.uiSounds[12];
                                  } else {
                                    if (event.eventCode == 11) {
                                      sound = NanoGameClock.field_p[ChocolateBackground.field_w.nextBoundedInt(-37880252, NanoGameClock.field_p.length)];
                                    } else {
                                      if (event.eventCode == 12) {
                                        sound = ta.uiSounds[13];
                                      } else {
                                        if (event.eventCode == 14) {
                                          sound = ta.uiSounds[14];
                                        } else {
                                          if ((event.eventCode == 13)) {
                                            sound = ta.uiSounds[15];
                                          }
                                        }
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
                      activityEvents++;
                    }
                  }
                  unusedRemainder = false;
                }
                else {
                  sound = mh.field_ob[ChocolateBackground.field_w.nextBoundedInt(-37880252, mh.field_ob.length)];
                }
              } else {
                if (oa.currentBackground != null) {
                  sceneSounds = oa.currentBackground.pollSoundEffects(0);
                  if (0 < oa.currentBackground.loadedSoundCount) {
                    sound = sceneSounds[ChocolateBackground.field_w.nextBoundedInt(-37880252, oa.currentBackground.loadedSoundCount)];
                  }
                }
              }
              if (null != sound) {
                PlayerBoard.playGameplaySound((PcmSound) (sound), -56, volume);
              }
              event = (GameplayAudioEvent) (events.next((byte) 116));
              continue;
            }
            break;
          }
          if (eventsExhausted) {
            alternateLoopFlag = alternateActivityLoop ? 1 : 0;
          }
          if (alternateLoopFlag == 0) {
            selectedLoop = to.primaryActivityLoop;
          } else {
            selectedLoop = me.alternateActivityLoop;
          }
          activityLoop = selectedLoop;
          targetVolume = activityEvents * activityVolumePerEvent;
          currentVolume = activityLoop.getVolume();
          maximumVolumeStep = activityEvents + 1 << 2;
          if (currentVolume + maximumVolumeStep < targetVolume) {
            targetVolume = currentVolume + maximumVolumeStep;
          }
          if ((currentVolume - maximumVolumeStep) > targetVolume) {
            targetVolume = currentVolume - maximumVolumeStep;
          }
          activityLoop.setVolume(BackgroundScene.masterSoundGain * targetVolume / 256);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("bm.D(").append(volume).append(',').append(activityVolumePerEvent).append(',').append(alternateActivityLoop).append(',').append(obfuscationGuard).append(',');
          if (events == null) {
            eventsSummary = "null";
          } else {
            eventsSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(eventsSummary).append(')').toString());
        }
    }

    final static void a(ResourceArchive param0, ResourceArchive param1, int param2, ResourceArchive param3, SoundCache param4, ResourceArchive param5, ResourceArchive param6) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          ln.a(param6, param4, param0, param5, param1, param2 ^ -24870, param3);
          BackgroundRegistry.scenes[1] = (BackgroundScene) ((Object) new ArcticBackground(1, "BaB_arctic", "BaB_block_arctic", 6));
          BackgroundRegistry.scenes[2] = (BackgroundScene) ((Object) new ChocolateBackground(2, "BaB_chocolate", "BaB_block_chocolate", 8));
          BackgroundRegistry.scenes[3] = (BackgroundScene) ((Object) new ConstructionBackground(3, "BaB_construction", "BaB_block_construction", 8));
          BackgroundRegistry.scenes[4] = (BackgroundScene) ((Object) new DesertBackground(4, "BaB_desert", "BaB_block_desert", 4));
          BackgroundRegistry.scenes[6] = (BackgroundScene) ((Object) new JungleBackground(6, "BaB_jungle", "BaB_block_jungle", 4));
          BackgroundRegistry.scenes[7] = (BackgroundScene) ((Object) new ParisBackground(7, "BaB_city_paris", "BaB_block_city", 5));
          BackgroundRegistry.scenes[8] = (BackgroundScene) ((Object) new SpaceBackground(8, "BaB_space", "BaB_block_space", 8));
          BackgroundRegistry.scenes[9] = (BackgroundScene) ((Object) new VolcanicBackground(9, "BaB_volcano", "BaB_block_volcano", 6));
          BackgroundRegistry.scenes[10] = (BackgroundScene) ((Object) new UnderwaterBackground(10, "BaB_underthesea", "BaB_block_underwater", 5));
          boolean decompiledSharedTail0 = !(!LevelPackCard.hasFeatureBit(0, param2 ^ -24881));
          if (!decompiledSharedTail0) {
            BackgroundRegistry.scenes[5] = (BackgroundScene) ((Object) new FarmBackground(5, "BaB_farmyard", "BaB_block_farmyard", 7));
            decompiledSharedTail0 = (BrickABrac.field_J);
          }
          if (decompiledSharedTail0) {
            BackgroundRegistry.scenes[5] = (BackgroundScene) ((Object) new HalloweenBackground(5, "BaB_halloween", "BaB_block_halloween", 8));
          }
          if (param2 != 24876) {
            bm.a((byte) 96);
          }
          BackgroundRegistry.scenes[11] = (BackgroundScene) ((Object) new NinjaBackground(11, "BAB_ninja", "BaB_block_ninja", 7));
          sk.pendingMusicLoads = 11;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_14_0 = var7;
          stackIn_14_1 = new StringBuilder().append("bm.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param5 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param6 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        try {
          field_e = null;
          field_d = null;
          field_b = null;
          field_f = null;
          int var1_int = -21 / ((param0 + 44) / 60);
          field_a = (byte[][][]) null;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bm.F(" + param0 + ')');
        }
    }

    static {
        field_b = "Set up new game";
        field_f = new int[]{29, 31, 30, 8};
        field_e = "<%0> cannot join; the game has started.";
        field_c = 200;
    }
}
