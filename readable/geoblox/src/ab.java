/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static ck field_c;
    static boolean boardContactStateDirty;
    static boolean field_d;
    static String createSuggestionsText;
    static int field_b;
    static volatile boolean field_a;

    final static void a(int param0, rh param1) {
        MusicDecoder var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          MusicDecoder.a(param1.a(0, "", "headers.packvorbis"));
          var2 = MusicDecoder.a(param1, "jagex logo2.packvorbis", "");
          var2.decodePcm();
          if (param0 < 29) {
            boardContactStateDirty = true;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_5_0 = (RuntimeException) (var2_ref);

          stackIn_5_1 = new StringBuilder().append("ab.F(").append(param0).append(',');

          if (param1 == null) {
            stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
            stackIn_6_2 = "null";
          } else {
            stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Geoblox.field_C;
        try {
          L0: {
            if (param2 == null) {
              stackIn_4_0 = gg.createNameLengthAlertText;
              decompiledRegionSelector0 = 0;
            } else {
              var3_int = param2.length();
              if ((var3_int ^ -1) <= -2) {
                if ((var3_int ^ -1) >= -13) {
                  var4 = oe.a(param2, 12);
                  if (param1 != 2) {
                    ab.a((byte) 112);
                  }
                  if (var4 != null) {
                    if ((var4.length() ^ -1) <= -2) {
                      if (!gg.a((byte) -32, var4.charAt(0))) {
                        if (!gg.a((byte) -75, var4.charAt(-1 + var4.length()))) {
                          var5 = 0;
                          for (var6 = 0; var6 < param2.length(); var6++) {
                            var7 = param2.charAt(var6);
                            if (gg.a((byte) -96, (char) var7)) {
                              var5++;
                            } else {
                              var5 = 0;
                            }
                            if (2 <= var5) {
                              if (!param0) {
                                stackIn_31_0 = fa.createDoubleSpaceAlertText;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                          if (-1 > (var5 ^ -1)) {
                            stackIn_36_0 = GameScreen.createNameLeadingSpaceAlertText;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            return null;
                          }
                        }
                      }
                      stackIn_21_0 = GameScreen.createNameLeadingSpaceAlertText;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                  stackIn_16_0 = gg.createNameLengthAlertText;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
              stackIn_9_0 = gg.createNameLengthAlertText;
              decompiledRegionSelector0 = 1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = (RuntimeException) (var3);

          stackIn_39_1 = new StringBuilder().append("ab.A(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
            stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
            stackIn_40_2 = "null";
          } else {
            stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
            stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
            stackIn_40_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0;
                } else {
                  return stackIn_36_0;
                }
              }
            }
          }
        }
    }

    final static IndexedSprite a(int param0) {
        IndexedSprite var1 = new IndexedSprite(pg.field_b, dd.field_C, GameplaySession.field_m[0], md.field_e[0], DualLinkNode.field_j[0], hl.field_K[0], mj.field_a[0], cm.field_j);
        int var2 = -128 / ((param0 - 52) / 49);
        kj.c(true);
        return var1;
    }

    final static int a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        CharSequence var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            if (param0 <= 42) {
              var5 = (CharSequence) null;
              ab.a(-120, (CharSequence) null);
            }
            for (var4 = 0; var4 < var2_int; var4++) {
              var3 = -var3 + (var3 << -357128155) + qc.a(param1.charAt(var4), true);
            }
            stackIn_6_0 = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = (RuntimeException) (var2);

          stackIn_9_1 = new StringBuilder().append("ab.B(").append(param0).append(',');

          if (param1 == null) {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "null";
          } else {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(')').toString());
        }
        return stackIn_6_0;
    }

    final static void moveEntitiesAndCollectContacts(int param0, float boardAngleRadians) {
        int stackIn_17_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException decompiledCaughtException = null;
        GameplayEntity var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        float var3_float = 0.0f;
        GameplayEntity var4 = null;
        float var4_float = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        int var12 = 0;
        int var13 = 0;
        float var14 = 0.0f;
        int var15 = 0;
        Object var16 = null;
        GameplayEntity var17 = null;
        var16 = null;
        var15 = Geoblox.field_C;
        try {
          L0: {
            boardContactStateDirty = false;
            wb.field_b = 0;
            sh.field_y.a(255);
            var2 = (GameplayEntity) ((Object) ji.movingEntities.firstForIteration(0));
            L1: while (var2 != null) {
              L3: {
                if (a.attachedEntities != var2.entityQueue) {
                  if (!el.gameplaySession.tutorialPromptActive) {
                    var2.integrateEntityVelocity((byte) -59);
                    var2.advanceEntityAnimation(true);
                  }
                  gf.a(var2, -1232328029, boardAngleRadians);
                  if (!uj.a(var2, boardAngleRadians, 0)) {
                    if (ma.a(true, boardAngleRadians, var2)) {
                      var3 = wd.contactProbeRaster.pixels[aa.field_a + wd.contactProbeRaster.field_s * aa.field_b] + -1;
                      var4 = tl.entitiesById[var3];
                      if (a.attachedEntities != var4.entityQueue) {
                        var5 = 0.5f * (var4.velocityX + var2.velocityX);
                        var6 = (var4.velocityY + var2.velocityY) * 0.5f;
                        var7 = var6 * var6 + var5 * var5;
                        var7 = og.entityMotionSpeed / (float)Math.sqrt((double)var7);
                        var6 = var6 * var7;
                        var5 = var5 * var7;
                        var8 = -var4.positionX + 320.0f;
                        var9 = 240.0f - var4.positionY;
                        var10 = -var5 - var4.positionX + 320.0f;
                        var11 = 240.0f - (var4.positionY + var6);
                        var10 = var10 * var10;
                        var11 = var11 * var11;
                        if (var10 + var11 <= var9 * var9 + var8 * var8) {
                          stackIn_36_0 = 0;
                        } else {
                          stackIn_36_0 = 1;
                        }
                        var12 = stackIn_36_0;
                        var8 = 320.0f - var2.positionX;
                        var11 = 240.0f - (var6 + var2.positionY);
                        var10 = -var2.positionX - var5 + 320.0f;
                        var9 = -var2.positionY + 240.0f;
                        var10 = var10 * var10;
                        var11 = var11 * var11;
                        if (var9 * var9 + var8 * var8 >= var11 + var10) {
                          stackIn_39_0 = 0;
                        } else {
                          stackIn_39_0 = 1;
                        }
                        var13 = stackIn_39_0;
                        if (var12 != 0) {
                          if (var13 != 0) {
                            var8 = -((var2.positionX + var4.positionX) * 0.5f) + 320.0f;
                            var9 = 240.0f - 0.5f * (var4.positionY + var2.positionY);
                            var14 = og.entityMotionSpeed / (float)Math.sqrt((double)(var8 * var8 + var9 * var9));
                            var5 = var8 * var14;
                            var6 = var14 * var9;
                          }
                        }
                        var2.velocityY = var2.velocityY * -1.0f;
                        var2.velocityX = var2.velocityX * -1.0f;
                        var2.integrateEntityVelocity((byte) -59);
                        var4.velocityX = var5;
                        var2.velocityX = var5;
                        var4.velocityY = var6;
                        var2.velocityY = var6;
                      } else {
                        break L3;
                      }
                    } else {
                      var3_float = 320.0f - var2.positionX;
                      var4_float = 240.0f - var2.positionY;
                      var5 = -(var4_float * var2.positionX) + var2.positionY * var3_float;
                      if (-1 == (var2.relatedEntityCount ^ -1)) {
                        if (var5 * var5 > 0.30000001192092896f) {
                          var2.velocityX = var3_float;
                          var2.velocityY = var4_float;
                          var6 = og.entityMotionSpeed / (float)Math.sqrt((double)(var2.velocityX * var2.velocityX + var2.velocityY * var2.velocityY));
                          var2.velocityX = var2.velocityX * var6;
                          var2.velocityY = var2.velocityY * var6;
                        }
                      }
                    }
                    var2.drawEntityIdOnPointerMask((byte) 51);
                  } else {
                    vf.spriteScratchRaster.g(1);
                    if (var2.matchCooldownTicks <= 0) {
                      al.a(9666, GameScreen.selectedThemeId);
                    }
                    boardContactStateDirty = true;
                    var2.entityQueue = null;
                    for (var3 = 0; var3 < var2.relatedEntityCount; var3++) {
                      var2.relatedEntities[var3].removeRelatedEntity(var2, 0);
                    }
                    var2.relatedEntityCount = 0;
                    if ((var2.entitySpriteKindId ^ -1) != -3) {
                      stackIn_17_0 = 0;
                    } else {
                      stackIn_17_0 = 1;
                    }
                    L12: {
                      var3 = stackIn_17_0;
                      ih.linkEntityAtMaskContacts(-1, td.field_E, var2, ng.field_G);
                      if (var3 != 0) {
                        if (var2.entitySpriteKindId != 2) {
                          break L12;
                        }
                      }
                      if ((var2.entitySpriteKindId ^ -1) != -3) {
                        var2.spriteAngleRadians = var2.spriteAngleRadians - boardAngleRadians;
                      }
                      var2.positionY = (float)td.field_E;
                      var2.entityQueue = a.attachedEntities;
                      var2.positionX = (float)ng.field_G;
                    }
                    if (!var2.detachedFromBoard) {
                      wb.field_b = wb.field_b + 1;
                      break L3;
                    } else {
                      var2 = (GameplayEntity) ((Object) ji.movingEntities.nextForIteration(1));
                      continue L1;
                    }
                  }
                }
              }
              var2 = (GameplayEntity) ((Object) ji.movingEntities.nextForIteration(1));
            }
            var3 = -125 % ((param0 - 35) / 49);
            var17 = (GameplayEntity) ((Object) ji.movingEntities.firstForIteration(0));
            L2: while (var17 != null) {
              var17.eraseEntityTrail(30383);
              var17 = (GameplayEntity) ((Object) ji.movingEntities.nextForIteration(1));
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "ab.C(" + param0 + ',' + boardAngleRadians + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -58 % ((param0 - 0) / 38);
        createSuggestionsText = null;
        field_c = null;
    }

    static {
        field_c = new ck(2, 4, 4, 0);
        createSuggestionsText = "Suggested names: ";
        field_a = false;
        field_b = 0;
    }
}
