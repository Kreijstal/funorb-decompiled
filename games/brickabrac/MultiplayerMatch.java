/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MultiplayerMatch {
    PlayerBoard[] playerBoards;
    static String field_e;
    int playerMaskOne;
    int playerCount;
    static mh field_d;
    boolean field_c;
    int[] field_m;
    int field_n;
    int field_h;
    String[] playerNames;
    int playerMaskThree;
    LevelSequence configuration;
    int playerMaskTwo;
    int field_j;

    final void distributeQueuedAttacks(int playerId, int tickOffset, NodeDeque attacks, byte obfuscationGuard) {
        int recipientIndex = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var7 = 0;
        PowerUp powerUp = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard > -39) {
            this.getStateSevenPlayerMask(86);
          }
          powerUp = (PowerUp) (attacks.first(-44));
          while (powerUp != null) {
            stackIn_6_0 = this.playerCount;
            stackIn_6_1 = 1;
            if (stackIn_6_0 != stackIn_6_1 &&
              !powerUp.isSelfTargeted(false)) {
              for (recipientIndex = 0; recipientIndex < this.playerCount; recipientIndex++) {
                if (recipientIndex != playerId &&
                  (1 << recipientIndex & (this.playerMaskTwo | this.playerMaskOne | this.playerMaskThree)) == 0) {
                  this.playerBoards[recipientIndex].powerUpHistory.append(new PowerUp(powerUp, tickOffset + this.playerBoards[recipientIndex].simulationTick), (byte) -39);
                }
              }
            } else {
              this.playerBoards[playerId].powerUpHistory.append(new PowerUp(powerUp, tickOffset + this.playerBoards[playerId].simulationTick), (byte) -39);
            }
            powerUp = (PowerUp) (attacks.next((byte) 116));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("ak.I(").append(playerId).append(',').append(tickOffset).append(',');
          if (attacks == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final int getStateZeroPlayerMask(byte obfuscationGuard) {
        boolean discarded$1 = false;
        int var3 = 0;
        int var2;
        int var4;
        Ball var5;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        if (obfuscationGuard != -92) {
          var5 = (Ball) null;
          discarded$1 = this.a((PlayerBoard) null, (NodeDeque) null, -18, 53, (Ball) null);
        }
        for (var3 = 0; var3 < this.playerCount; var3++) {
          if (((this.playerMaskOne | (this.playerMaskThree | this.playerMaskTwo)) & 1 << var3) == 0 &&
            this.playerBoards[var3].field_M == 0) {
            var2 = var2 | 1 << var3;
          }
        }
        return var2;
    }

    final void a(boolean param0) {
        if (param0) {
          this.getStateSevenPlayerMask(-32);
        }
        this.field_c = true;
    }

    final int getStateSevenPlayerMask(int obfuscationGuard) {
        int var2;
        int var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var3 = 0;
        if (obfuscationGuard != -17566) {
          return -12;
        }
        while (var3 < this.playerCount) {
          if ((1 << var3 & this.playerMaskThree) == 0 &&
            7 == this.playerBoards[var3].field_Z) {
            var2 = var2 | 1 << var3;
          }
          var3++;
        }
        return var2;
    }

    final void a(PlayerBoard param0, NodeDeque param1, NodeDeque param2, int param3) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$3 = 0;
        Brick dupTemp$4 = null;
        int fieldTemp$5 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        PlayerBoard stackIn_55_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_132_0 = 0;
        int stackIn_142_0 = 0;
        PlayerBoard stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        int stackIn_156_2 = 0;
        PlayerBoard stackIn_158_0 = null;
        String[] stackIn_159_1 = null;
        int stackIn_245_0 = 0;
        PlayerBoard stackIn_270_0 = null;
        int stackIn_270_1 = 0;
        int stackIn_271_2 = 0;
        int stackIn_279_0 = 0;
        int stackIn_284_0 = 0;
        int stackIn_285_1 = 0;
        PlayerBoard stackIn_287_0 = null;
        int stackIn_288_1 = 0;
        PlayerBoard stackIn_300_0 = null;
        String[] stackIn_302_1 = null;
        RuntimeException stackIn_388_0 = null;
        StringBuilder stackIn_388_1 = null;
        String stackIn_389_2 = null;
        StringBuilder stackIn_391_1 = null;
        String stackIn_392_2 = null;
        StringBuilder stackIn_394_1 = null;
        String stackIn_395_2 = null;
        RuntimeException decompiledCaughtException = null;
        kc var5 = null;
        RuntimeException var5_ref = null;
        ScorePopup var6 = null;
        Paddle var7 = null;
        int var8 = 0;
        NodeDeque[] var8_ref_vl__ = null;
        Ball var9 = null;
        int var9_int = 0;
        BrickMotionPath var9_ref = null;
        il var9_ref2 = null;
        Paddle var9_ref3 = null;
        Brick var9_ref4 = null;
        Object var10_ref = null;
        Brick var10_ref_on = null;
        int var10 = 0;
        PowerUp var10_ref_ge = null;
        Ball var10_ref_vn = null;
        Object var11_ref = null;
        int var11 = 0;
        Brick var11_ref_on = null;
        MotionWaypoint var11_ref_ee = null;
        Object var12_ref = null;
        int var12 = 0;
        Brick var12_ref_on = null;
        Ball var13 = null;
        Brick var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        NodeDeque var18 = null;
        NodeDeque var19 = null;
        CircleBody var20 = null;
        NodeDeque var21 = null;
        NodeDeque var22 = null;
        NodeDeque var23 = null;
        MotionWaypoint var24 = null;
        NodeDeque var25 = null;
        NodeDeque var26 = null;
        Ball var9Lifetime1;
        Ball var9Lifetime2;
        Brick var10_ref_onLifetime1;
        Ball var10_ref_vnLifetime1;
        Ball var10_ref_vnLifetime2;
        Brick var11_ref_onLifetime1;
        Brick var11_ref_onLifetime2;
        NodeDeque var21Lifetime1;
        NodeDeque var22Lifetime1;
        NodeDeque var22Lifetime2;
        NodeDeque var26Lifetime1;
        NodeDeque var21Lifetime2;
        NodeDeque var26Lifetime2;
        NodeDeque var22Lifetime1Lifetime1;
        int var12Lifetime1;
        int var12Lifetime1Lifetime1;
        var12_ref = null;
        var11_ref = null;
        var17 = BrickABrac.field_J ? 1 : 0;
        try {
          boolean decompiledSharedTail0 = !(param3 < param0.field_i);
          if (!decompiledSharedTail0) {
            fieldTemp$0 = param0.field_i - 1;
            param0.field_i = param0.field_i - 1;
            decompiledSharedTail0 = (!(fieldTemp$0 > 0));
          }
          if (decompiledSharedTail0) {
            param0.field_fb = param0.field_lb;
            if (null != param0.field_fb) {
              param0.field_i = 100;
            }
            param0.field_lb = null;
          }
          if (param0.field_M > 0) {
            param0.field_M = param0.field_M - 1;
          }
          if (param0.field_ib > 0) {
            fieldTemp$1 = param0.field_ib - 1;
            param0.field_ib = param0.field_ib - 1;
            if (0 == fieldTemp$1) {
              param0.b(16387, 0);
            }
          }
          var5 = (kc) (param0.field_x.first(-58));
          while (var5 != null) {
            if (!var5.c((byte) 69)) {
              var5.unlink((byte) 111);
            }
            var5 = (kc) (param0.field_x.next((byte) 116));
          }
          var6 = (ScorePopup) (param0.scorePopups.first(-85));
          while (var6 != null) {
            if (!var6.advance(false)) {
              var6.unlink((byte) 111);
            }
            var6 = (ScorePopup) (param0.scorePopups.next((byte) 116));
          }
          var7 = param0.paddle;
          if (param0.field_Z == 2) {
            if (param1 != null &&
              0 != (3 & param0.field_db) &&
              3 != param0.field_db) {
              param1.addLast(new GameplayAudioEvent(4), (byte) 3);
            }
            if (0 < var7.field_w) {
              param0.field_db = param0.field_db ^ 3;
            }
            if ((param0.field_db & 2) != 0) {
              var7.velocityX256 = 2048;
            }
            if ((param0.field_db & 1) != 0) {
              var7.velocityX256 = var7.velocityX256 - 2048;
            }
            if ((param0.field_db & 4) != 0) {
              var8 = 0;
              if (!param0.activeBalls.isEmpty(false)) {
                var9 = (Ball) (param0.activeBalls.first(-76));
                while (var9 != null) {
                  if (40 <= var9.contactCount) {
                    if (param1 != null) {
                      param1.addLast(new GameplayAudioEvent(6), (byte) 3);
                    }
                    var8 = 1;
                    var9.contactCount = 0;
                    param0.field_x.addLast(new kc(var9.x256, var9.y256), (byte) 3);
                    param0.field_l = 0;
                    var20 = new CircleBody(var9.radius256 + var9.x256, var9.radius256 + var9.y256, 0, 0, 15360, 0);
                    var11 = 0;
                    for (var12 = 0; param0.brickGroups.length > var12; var12++) {
                      var19 = param0.brickGroups[var12];
                      var21 = var19;
                      var22 = var21;
                      var21Lifetime2 = var19;
                      var14 = (Brick) (var19.first(-78));
                      while (var14 != null) {
                        if (var14.overlapsCircle(var20, false)) {
                          if (var14.typeId <= 0) {
                            if (var14.typeId != 19) {
                              if (var14.typeId != 20) {
                                if (21 != var14.typeId) {
                                  stackIn_132_0 = (var14.typeId == 22) ? 1 : 0;
                                } else {
                                  stackIn_132_0 = 1;
                                }
                              } else {
                                stackIn_132_0 = 1;
                              }
                            } else {
                              stackIn_132_0 = 1;
                            }
                          } else {
                            stackIn_132_0 = 1;
                          }
                          var15 = stackIn_132_0;
                          if (var14.typeId == 22) {
                            var14.typeId = 23;
                          }
                          if (var14.typeId == 21) {
                            var14.typeId = 22;
                          }
                          if (var15 != 0) {
                            stackIn_142_0 = (var14.pendingTypeId != 0) ? 0 : 1;
                            var16 = stackIn_142_0;
                            var14.pendingTypeId = ue.field_b[var14.typeId];
                            var14.transitionCode = rb.field_a[var14.typeId];
                            var14.stateWord = 0;
                            if (19 == var14.typeId ||
                              var14.typeId == 20) {
                              var14.transitionCode = 1;
                              var14.pendingTypeId = 0;
                            }
                            if (1 == this.playerCount &&
                              var14.pendingTypeId == 0 &&
                              var16 == 0) {
                              param0.a(2 * var9.destroyedBrickStreak + 10, var14, 2);
                              var11++;
                            }
                          }
                        }
                        var14 = (Brick) (var19.next((byte) 116));
                      }
                    }
                    stackIn_155_0 = (PlayerBoard) (param0);
                    stackIn_155_1 = 16387;
                    if (var11 > 0) {
                      stackIn_156_2 = 1;
                    } else {
                      stackIn_156_2 = 6;
                    }
                    ((PlayerBoard) (Object) stackIn_155_0).b(stackIn_155_1, stackIn_156_2);
                    stackIn_158_0 = (PlayerBoard) (param0);
                    if (var11 > 0) {
                      stackIn_159_1 = ml.field_e;
                    } else {
                      stackIn_159_1 = eh.field_e;
                    }
                    ((PlayerBoard) (Object) stackIn_158_0).a(stackIn_159_1, (byte) 75);
                  }
                  var9 = (Ball) (param0.activeBalls.next((byte) 116));
                }
              }
              if (var8 == 0 &&
                !param0.queuedBalls.isEmpty(false)) {
                param0.activeBalls.addLast(param0.queuedBalls.removeFirst(3), (byte) 3);
              }
              if (var8 != 0) {
                fieldTemp$2 = param0.field_A + 1;
                param0.field_A = param0.field_A + 1;
                if (1 == fieldTemp$2) {
                }
              }
            }
            regionExit1: {
              var8 = 1;
              if (param0.field_n == 0) {
                var8 = 0;
              } else {
                if (this.playerCount != 1) {
                  for (var9_int = 0; param0.brickGroups.length > var9_int; var9_int++) {
                    var21Lifetime1 = param0.brickGroups[var9_int];
                    var22Lifetime1 = var21Lifetime1;
                    var22Lifetime1Lifetime1 = var21Lifetime1;
                    var11_ref_on = (Brick) (var21Lifetime1.first(param3 - 91));
                    while (var11_ref_on != null) {
                      if ((1 << var11_ref_on.typeId & IntHistoryBuffer.field_m) != 0 &&
                        81920 <= var11_ref_on.y256) {
                        var8 = 0;
                        break regionExit1;
                      }
                      var11_ref_on = (Brick) (var21Lifetime1.next((byte) 116));
                    }
                  }
                  break regionExit1;
                }
                var8 = 1;
              }
            }
            if (var8 != 0) {
              var9_ref = (BrickMotionPath) (param0.motionPaths.first(-120));
              while (var9_ref != null) {
                var22Lifetime2 = var9_ref.waypoints;
                var11_ref_ee = (MotionWaypoint) (var22Lifetime2.first(-125));
                while (var11_ref_ee != null) {
                  var11_ref_ee.y256 = var11_ref_ee.y256 + 256;
                  var11_ref_ee = (MotionWaypoint) (var22Lifetime2.next((byte) 116));
                }
                var9_ref = (BrickMotionPath) (param0.motionPaths.next((byte) 116));
              }
            }
            for (var9_int = 0; param0.brickGroups.length > var9_int; var9_int++) {
              var23 = param0.brickGroups[var9_int];
              var11_ref_onLifetime1 = (Brick) (var23.first(param3 ^ -42));
              while (var11_ref_onLifetime1 != null) {
                if (var8 != 0 &&
                  (5 & var11_ref_onLifetime1.flags) == 0) {
                  var11_ref_onLifetime1.y256 = var11_ref_onLifetime1.y256 + 256;
                }
                if (0 <= var11_ref_onLifetime1.pendingTypeId) {
                  fieldTemp$6 = var11_ref_onLifetime1.stateWord + 1;
                  var11_ref_onLifetime1.stateWord = var11_ref_onLifetime1.stateWord + 1;
                  if (fieldTemp$6 == 16) {
                    var11_ref_onLifetime1.transitionCode = 0;
                    var11_ref_onLifetime1.stateWord = 0;
                    if (0 == var11_ref_onLifetime1.pendingTypeId) {
                      var11_ref_onLifetime1.unlink((byte) 111);
                      if ((1 << var11_ref_onLifetime1.typeId & IntHistoryBuffer.field_m) != 0) {
                        param0.field_L = param0.field_L - 1;
                        param0.field_m = param0.field_m + 1;
                        param0.field_Q = param0.field_Q + 1;
                      }
                      if (r.field_A) {
                        jc.a(var11_ref_onLifetime1.flags, 1, (byte) -95);
                      }
                    } else {
                      if (var11_ref_onLifetime1.typeId == 0) {
                        param0.field_L = param0.field_L + 1;
                      }
                      var11_ref_onLifetime1.typeId = var11_ref_onLifetime1.pendingTypeId;
                      var11_ref_onLifetime1.pendingTypeId = -1;
                    }
                  }
                }
                if ((4 & var11_ref_onLifetime1.flags) != 0) {
                  var11_ref_onLifetime1.interpolateMotion((byte) 58, true);
                  var11_ref_onLifetime1.segmentElapsedTicks = var11_ref_onLifetime1.segmentElapsedTicks + 1;
                  var11_ref_onLifetime1.motionElapsedTicks = var11_ref_onLifetime1.motionElapsedTicks + 1;
                  var24 = var11_ref_onLifetime1.waypoints[var11_ref_onLifetime1.destinationWaypointIndex];
                  if (var24.durationTicks == var11_ref_onLifetime1.segmentElapsedTicks) {
                    var11_ref_onLifetime1.advanceMotionSegment(105);
                  }
                }
                var11_ref_onLifetime1 = (Brick) (var23.next((byte) 116));
              }
            }
            var9Lifetime1 = (Ball) (param0.queuedBalls.first(-105));
            while (var9Lifetime1 != null) {
              if (var9Lifetime1.phaseTicks > 0) {
                var9Lifetime1.phaseTicks = var9Lifetime1.phaseTicks - 1;
              }
              if (var9Lifetime1.penetrationTicks > 0) {
                var9Lifetime1.penetrationTicks = var9Lifetime1.penetrationTicks - 1;
              }
              var9Lifetime1 = (Ball) (param0.queuedBalls.next((byte) 116));
            }
            var9Lifetime2 = (Ball) (param0.activeBalls.first(param3 - 13));
            while (var9Lifetime2 != null) {
              var9Lifetime2.centerXHistory256.append(-7255, var9Lifetime2.x256 + var9Lifetime2.radius256);
              var9Lifetime2.centerYHistory256.append(-7255, var9Lifetime2.y256 + var9Lifetime2.radius256);
              if (var9Lifetime2.phaseTicks > 0) {
                var9Lifetime2.phaseTicks = var9Lifetime2.phaseTicks - 1;
              }
              if (var9Lifetime2.penetrationTicks > 0) {
                var9Lifetime2.penetrationTicks = var9Lifetime2.penetrationTicks - 1;
              }
              var9Lifetime2 = (Ball) (param0.activeBalls.next((byte) 116));
            }
            if (var7.field_w > 0) {
              var7.field_w = var7.field_w - 1;
            }
            if (var7.field_H > 0) {
              var7.field_H = var7.field_H - 1;
            }
            if (0 < var7.catchTicks) {
              var7.catchTicks = var7.catchTicks - 1;
            }
            if (var8 != 0) {
              fieldTemp$3 = param0.field_n - 1;
              param0.field_n = param0.field_n - 1;
              if (fieldTemp$3 % 16 == 0) {
                stackIn_245_0 = (1 == this.playerCount) ? 13 : 7;
                var9_int = stackIn_245_0;
                var10_ref = null;
                for (var11 = 1; var11 <= var9_int; var11++) {
                  dupTemp$4 = new Brick(34 * var11 << 8, 4096, 0, 0, 0);
                  var10_ref_on = dupTemp$4;
                  param0.brickGroups[2].addLast(dupTemp$4, (byte) 3);
                  var10_ref_on.pendingTypeId = 2;
                  var10_ref_on.transitionCode = 10;
                }
                for (var11 = 0; var11 < 3; var11++) {
                  var25 = param0.brickGroups[var11];
                  var26 = var25;
                  var26Lifetime2 = var25;
                  var10_ref_onLifetime1 = (Brick) (var25.first(-44));
                  while (var10_ref_onLifetime1 != null) {
                    if ((1 & var10_ref_onLifetime1.flags) == 0 &&
                      81920 < var10_ref_onLifetime1.y256) {
                      var10_ref_onLifetime1.transitionCode = 7;
                      var10_ref_onLifetime1.pendingTypeId = 0;
                      var10_ref_onLifetime1.stateWord = 0;
                    }
                    var10_ref_onLifetime1 = (Brick) (var25.next((byte) 116));
                  }
                }
              }
            }
            if (param0.field_k >= 0) {
              var9_ref2 = (il) (param0.field_C.first(-118));
              while (var9_ref2 != null) {
                var9_ref2.d(param3 - 2081170685);
                var9_ref2 = (il) (param0.field_C.next((byte) 116));
              }
              param0.field_k = param0.field_k + 1;
            }
            var9_int = 0;
            while (true) {
              if (var9_int >= 8) {
                var9_ref3 = var7;
                var7.velocityY256 = 0;
                var9_ref3.velocityX256 = 0;
                for (var10 = 0; var10 < 3; var10++) {
                  var11_ref_onLifetime2 = (Brick) (param0.brickGroups[var10].first(-49));
                  while (var11_ref_onLifetime2 != null) {
                    if ((var11_ref_onLifetime2.flags & 4) != 0) {
                      var11_ref_onLifetime2.interpolateMotion((byte) 119, true);
                    }
                    var11_ref_onLifetime2 = (Brick) (param0.brickGroups[var10].next((byte) 116));
                  }
                }
                boolean decompiledFrameRemainder0 = true;
                if (param0.field_L == 0 &&
                  param0.field_n == 0) {
                  param0.field_P = 0;
                  param0.field_r = param0.field_r + 1;
                  param0.field_hb = param0.field_hb + 1;
                  param0.field_t = param0.field_t + 1;
                  if (1 == this.playerCount) {
                    param0.addScore(250, false, 65280, var7.y256 - 12800);
                  }
                  fieldTemp$5 = param0.levelIndex + 1;
                  param0.levelIndex = param0.levelIndex + 1;
                  if (fieldTemp$5 >= this.configuration.getPeriod(param3 - 125) &&
                    !this.configuration.repeats) {
                    if (this.playerCount != 1) {
                      param0.field_Z = 7;
                    } else {
                      param0.field_Z = 5;
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    param0.field_Z = 0;
                    param0.field_P = 0;
                  }
                }
                if (param0.field_lb != null) {
                  return;
                }
                var10 = 0;
                var11 = 0;
                var12Lifetime1 = 0;
                var13 = (Ball) (param0.activeBalls.first(-26));
                while (var13 != null) {
                  var12Lifetime1Lifetime1 = var13.brickBounceCount;
                  if (var13.brickBounceCount > var10) {
                    var10 = var12Lifetime1Lifetime1;
                  }
                  var12Lifetime1Lifetime1 = var13.destroyedBrickStreak;
                  if (var11 < var13.destroyedBrickStreak) {
                    var11 = var12Lifetime1Lifetime1;
                  }
                  var13 = (Ball) (param0.activeBalls.next((byte) 116));
                }
                if (var10 <= 20 &&
                  15 >= var11) {
                  return;
                }
                param0.a(ml.field_e, (byte) 75);
                return;
              }
              var10_ref_ge = (PowerUp) (param0.fallingPowerUps.first(-119));
              while (var10_ref_ge != null) {
                var10_ref_ge.x256 = var10_ref_ge.x256 + var10_ref_ge.velocityX256 / 8;
                var10_ref_ge.y256 = var10_ref_ge.y256 + var10_ref_ge.velocityY256 / 8;
                if (var10_ref_ge.y256 > 122880) {
                  stackIn_270_0 = (PlayerBoard) (param0);
                  stackIn_270_1 = 16387;
                  if (param0.nextRandomBoundedInt(100, (byte) 62) > 50) {
                    stackIn_271_2 = 4;
                  } else {
                    stackIn_271_2 = 5;
                  }
                  ((PlayerBoard) (Object) stackIn_270_0).b(stackIn_270_1, stackIn_271_2);
                  if (r.field_A) {
                    jc.a(var10_ref_ge.typeId, 4, (byte) -110);
                  }
                  var10_ref_ge.unlink((byte) 111);
                } else {
                  if (var7.resolveCircleCollision(var10_ref_ge, (byte) 25)) {
                    var10_ref_ge.unlink((byte) 111);
                    stackIn_279_0 = (!var10_ref_ge.isSelfTargeted(false)) ? 0 : 1;
                    var11 = stackIn_279_0;
                    if (param2 != null) {
                      param2.addLast(var10_ref_ge, (byte) 3);
                    }
                    if (this.playerCount == 1) {
                      stackIn_284_0 = var11;
                      if (var10_ref_ge.typeId != 13) {
                        stackIn_285_1 = 0;
                      } else {
                        stackIn_285_1 = 1;
                      }
                      var11 = stackIn_284_0 | stackIn_285_1;
                      stackIn_287_0 = (PlayerBoard) (param0);
                      if (var11 != 0) {
                        stackIn_288_1 = 100;
                      } else {
                        stackIn_288_1 = 500;
                      }
                      ((PlayerBoard) (Object) stackIn_287_0).a(stackIn_288_1, var7, param3 + 2);
                      if (var11 != 0) {
                        param0.field_u = 0;
                        param0.field_hb = 0;
                        param0.field_N = param0.field_N + 1;
                      } else {
                        param0.field_u = param0.field_u + 1;
                        param0.field_N = 0;
                      }
                    }
                    if (r.field_A) {
                      jc.a(var10_ref_ge.typeId, 3, (byte) -115);
                    }
                    if (param1 != null) {
                      param1.addLast(new GameplayAudioEvent(3, var10_ref_ge.typeId), (byte) 3);
                    }
                    stackIn_300_0 = (PlayerBoard) (param0);
                    if (1 >= this.playerCount &&
                      var10_ref_ge.typeId != 13 &&
                      var11 == 0) {
                      stackIn_302_1 = eh.field_e;
                    } else {
                      stackIn_302_1 = ml.field_e;
                    }
                    ((PlayerBoard) (Object) stackIn_300_0).a(stackIn_302_1, (byte) 75);
                  }
                }
                var10_ref_ge = (PowerUp) (param0.fallingPowerUps.next((byte) 116));
              }
              var7.x256 = var7.x256 + var7.velocityX256 / 8;
              if (var7.controlMode > var7.x256) {
                var7.x256 = var7.controlMode;
              }
              if (-var7.width256 + var7.boardSpan256 < var7.x256) {
                var7.x256 = -var7.width256 + var7.boardSpan256;
              }
              if (var7.field_H > 0) {
                var10_ref_vn = (Ball) (param0.activeBalls.first(-111));
                while (var10_ref_vn != null) {
                  if ((var10_ref_vn.x256 + var10_ref_vn.radius256) > (var7.width256 / 2 + var7.x256)) {
                    if (var10_ref_vn.velocityX256 > 0) {
                      var10_ref_vn.velocityX256 = -var10_ref_vn.velocityX256;
                    }
                  } else {
                    if (0 <= var10_ref_vn.velocityX256) {
                      var10_ref_vn = (Ball) (param0.activeBalls.next((byte) 116));
                      continue;
                    }
                    var10_ref_vn.velocityX256 = -var10_ref_vn.velocityX256;
                  }
                  var10_ref_vn = (Ball) (param0.activeBalls.next((byte) 116));
                }
              }
              for (var10 = 0; param0.brickGroups.length > var10; var10++) {
                var26Lifetime1 = param0.brickGroups[var10];
                var12_ref_on = (Brick) (var26Lifetime1.first(-38));
                while (var12_ref_on != null) {
                  if (0 != (var12_ref_on.flags & 4) &&
                    1 < var12_ref_on.waypoints[var12_ref_on.destinationWaypointIndex].durationTicks) {
                    var12_ref_on.x256 = var12_ref_on.x256 + var12_ref_on.velocityX256 / 8;
                    var12_ref_on.y256 = var12_ref_on.y256 + var12_ref_on.velocityY256 / 8;
                  }
                  var12_ref_on = (Brick) (var26Lifetime1.next((byte) 116));
                }
              }
              var10_ref_vnLifetime1 = (Ball) (param0.activeBalls.first(-122));
              while (var10_ref_vnLifetime1 != null) {
                for (var11 = 0; var11 < 5; var11++) {
                  if (this.a(param0, param1, 8, -128, var10_ref_vnLifetime1)) {
                    continue;
                  }
                  break;
                }
                if (var10_ref_vnLifetime1.isLinked(0) && (var11 == 5 ||
                  !(var10_ref_vnLifetime1.x256 >= 0) ||
                  !(0 <= var10_ref_vnLifetime1.y256) ||
                  !(param0.boardWidth << 8 >= var10_ref_vnLifetime1.x256))) {
                  var10_ref_vnLifetime1.setVelocityFromAngle(-1024 + param0.nextRandomBoundedInt(2048, (byte) 62), 1536, 105);
                  var10_ref_vnLifetime1.centerXHistory256.latestIndex = -1;
                  var10_ref_vnLifetime1.destroyedBrickStreak = 0;
                  var10_ref_vnLifetime1.centerYHistory256.latestIndex = -1;
                  var10_ref_vnLifetime1.brickBounceCount = 0;
                  var10_ref_vnLifetime1.contactCount = 0;
                  param0.queuedBalls.addLast(var10_ref_vnLifetime1, (byte) 3);
                }
                if (!param0.activeBalls.isEmpty(false)) {
                  var10_ref_vnLifetime1 = (Ball) (param0.activeBalls.next((byte) 116));
                  continue;
                }
                break;
              }
              var10_ref_vnLifetime2 = (Ball) (param0.queuedBalls.first(-91));
              while (var10_ref_vnLifetime2 != null) {
                var10_ref_vnLifetime2.positionOnPaddle(var7, 0);
                var10_ref_vnLifetime2 = (Ball) (param0.queuedBalls.next((byte) 116));
              }
              var9_int++;
            }
          } else {
            if (param0.field_Z == 0) {
              var8_ref_vl__ = new NodeDeque[3];
              for (var9_int = 0; 3 > var9_int; var9_int++) {
                var8_ref_vl__[var9_int] = new NodeDeque();
              }
              var18 = new NodeDeque();
              var10 = param0.levelState.value;
              this.configuration.decodeLevel(new ga(), param0.levelState, var18, param0.levelIndex, (byte) -118, var8_ref_vl__);
              param0.a(var18, param3 + 9, var8_ref_vl__);
              param0.a(26496, false);
              if (this.playerCount == 1 &&
                0 < param0.field_r && (param0.levelState.value == 0 ||
                var10 != param0.levelState.value)) {
                param0.field_tb = true;
              }
              if (param0.field_r != 0) {
                for (var11 = 0; var11 < 3; var11++) {
                  var12_ref_on = (Brick) (var8_ref_vl__[var11].first(param3 ^ -107));
                  while (var12_ref_on != null) {
                    var12_ref_on.stateWord = 0;
                    var12_ref_on.transitionCode = 5;
                    var12_ref_on.pendingTypeId = var12_ref_on.typeId;
                    var12_ref_on = (Brick) (var8_ref_vl__[var11].next((byte) 116));
                  }
                }
              }
              param0.field_Z = 1;
              param0.field_P = 0;
              param0.field_A = 0;
              return;
            }
            if (param0.field_Z == 1) {
              if (param0.field_P == 0) {
                if (this.playerCount == 1) {
                  param0.field_lb = null;
                  param0.field_fb = this.configuration.getLevelNumberLabel((byte) 115, param0.levelIndex);
                  param0.field_i = 100;
                }
                if (param1 != null) {
                  param1.addLast(new GameplayAudioEvent(14), (byte) 3);
                }
              }
              if (param0.field_r != 0) {
                for (var8 = 0; var8 < 3; var8++) {
                  var9_ref4 = (Brick) (param0.brickGroups[var8].first(-30));
                  while (var9_ref4 != null) {
                    if (var9_ref4.pendingTypeId >= 0) {
                      fieldTemp$7 = var9_ref4.stateWord + 1;
                      var9_ref4.stateWord = var9_ref4.stateWord + 1;
                      if (fieldTemp$7 == 16) {
                        var9_ref4.transitionCode = 0;
                        var9_ref4.stateWord = 0;
                        var9_ref4.pendingTypeId = -1;
                      }
                    }
                    var9_ref4 = (Brick) (param0.brickGroups[var8].next((byte) 116));
                  }
                }
              }
              var8 = 0;
              if (this.playerCount == 1) {
                var8 = 125;
              } else {
                var8 = (param0.field_r == 0) ? 75 : 40;
              }
              fieldTemp$8 = param0.field_P + 1;
              param0.field_P = param0.field_P + 1;
              if (fieldTemp$8 != var8) {
                return;
              }
              param0.field_P = 0;
              param0.field_Z = 4;
              return;
            }
            if (param0.field_Z == 4) {
              if (param0.field_P == 0 &&
                param1 != null) {
                param1.addLast(new GameplayAudioEvent(13), (byte) 3);
              }
              fieldTemp$11 = param0.field_P + 1;
              param0.field_P = param0.field_P + 1;
              if (fieldTemp$11 != 75) {
                if (this.playerCount != 1) {
                  return;
                }
                if (25 != param0.field_P) {
                  return;
                }
              }
              param0.field_lb = lq.field_c;
              stackIn_55_0 = (PlayerBoard) (param0);
              if (param0.field_i > 25) {
                stackIn_56_1 = 25;
              } else {
                stackIn_56_1 = param0.field_i;
              }
              stackIn_55_0.field_i = stackIn_56_1;
              param0.field_Z = 2;
              param0.field_P = 0;
              return;
            }
            if (param0.field_Z == 3) {
              fieldTemp$9 = param0.field_P + 1;
              param0.field_P = param0.field_P + 1;
              if (fieldTemp$9 != 350) {
                return;
              }
              param0.field_P = 0;
              param0.field_Z = 8;
              return;
            }
            if (param0.field_Z != 5) {
              return;
            }
            fieldTemp$10 = param0.field_P + 1;
            param0.field_P = param0.field_P + 1;
            if (fieldTemp$10 == 350) {
              param0.field_P = 0;
              param0.field_Z = 9;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_388_0 = var5_ref;
          stackIn_388_1 = new StringBuilder().append("ak.F(");
          if (param0 == null) {
            stackIn_389_2 = "null";
          } else {
            stackIn_389_2 = "{...}";
          }
          stackIn_391_1 = ((StringBuilder) (Object) stackIn_388_1).append(stackIn_389_2).append(',');
          if (param1 == null) {
            stackIn_392_2 = "null";
          } else {
            stackIn_392_2 = "{...}";
          }
          stackIn_394_1 = ((StringBuilder) (Object) stackIn_391_1).append(stackIn_392_2).append(',');
          if (param2 == null) {
            stackIn_395_2 = "null";
          } else {
            stackIn_395_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_388_0), ((StringBuilder) (Object) stackIn_394_1).append(stackIn_395_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != -19537) {
          field_e = (String) null;
        }
    }

    private final void a(Ball param0, int param1, PlayerBoard param2) {
        int var4_int = 0;
        NodeDeque var5 = null;
        Brick var6 = null;
        int var7 = BrickABrac.field_J ? 1 : 0;
        try {
          hg.a(param1);
          for (var4_int = -1 + param2.brickGroups.length; var4_int > -1; var4_int--) {
            var5 = param2.brickGroups[var4_int];
            var6 = (Brick) (var5.last(~param1));
            while (var6 != null) {
              var6.resolveCircleCollision(param0, (byte) 119);
              var6 = (Brick) (var5.previous(-126));
            }
            if (dj.field_c != null) {
              break;
            }
          }
          param2.paddle.resolveCircleCollision(param0, (byte) 110);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "ak.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0) {
        int var4 = 0;
        int var2;
        int var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var3 = 30 * this.playerCount;
        if (param0 <= 120) {
          return -109;
        }
        for (var4 = 0; var4 < this.playerCount; var4++) {
          if (((this.playerMaskOne | (this.playerMaskThree | this.playerMaskTwo)) & 1 << var4) == 0) {
            var5 = this.playerBoards[var4].field_p + this.playerBoards[var4].boardOffset;
            var6 = 0;
            var7 = (var4 + 1) % this.playerCount;
            while (this.playerCount - 1 > var6) {
              if ((1 << var7 & (this.playerMaskThree | this.playerMaskTwo | this.playerMaskOne)) != 0) {
                var7++;
                var7 = var7 % this.playerCount;
                var6++;
                continue;
              }
              var8 = this.playerBoards[var7].boardOffset + this.playerBoards[var7].field_p;
              if (var7 < var4) {
                var8 = var8 + var3;
              }
              if (var8 >= var5) {
                break;
              }
              var2 = var2 | 1 << var7;
              break;
            }
          }
        }
        return var2;
    }

    final void applyPendingPowerUps(byte obfuscationGuard, int playerId) {
        PlayerBoard board;
        PowerUp powerUp;
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard < 81) {
          this.field_c = true;
        }
        board = this.playerBoards[playerId];
        while (board.nextPowerUpIndex <= board.powerUpHistory.latestIndex) {
          powerUp = (PowerUp) (board.powerUpHistory.get(board.nextPowerUpIndex, 67));
          if (powerUp.activationTick <= board.simulationTick) {
            powerUp.applyToBoard(board, (byte) 99);
            board.nextPowerUpIndex = board.nextPowerUpIndex + 1;
            continue;
          }
          break;
        }
    }

    private final boolean a(PlayerBoard param0, NodeDeque param1, int param2, int param3, Ball param4) {
        boolean stackIn_99_0 = false;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_108_2 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_111_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        Brick var9 = null;
        Brick var10 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          param4.x256 = param4.x256 + param4.velocityX256 / param2;
          param4.y256 = param4.y256 + param4.velocityY256 / param2;
          if (122880 < param4.y256) {
            param4.unlink((byte) 111);
            if (param1 != null) {
              param1.addLast(new GameplayAudioEvent(7), (byte) 3);
            }
            if (param0.activeBalls.isEmpty(false) &&
              param0.queuedBalls.isEmpty(false)) {
              if (1 == this.playerCount && (!r.field_A ||
                0 != this.configuration.pack.packId ||
                !(0 >= param0.levelIndex))) {
                param0.field_rb = param0.field_rb - 1;
              }
              if (param0.field_rb <= 0) {
                param0.b(16387, 3);
                param0.a((byte) 22);
              } else {
                if (3 != param0.field_y) {
                  if (param0.field_y == 6) {
                    param0.a(7, true, 150);
                  } else {
                    param0.a(3, true, 150);
                  }
                } else {
                  param0.a(6, true, 150);
                }
                if (r.field_A) {
                  jc.a(0, 5, (byte) -124);
                }
                param0.a(26496, true);
                param0.field_P = 0;
                param0.field_Z = 4;
              }
              param0.a(eh.field_e, (byte) 75);
              return false;
            }
            param0.b(16387, 2);
            return false;
          }
          this.a(param4, -1, param0);
          if (param3 > -125) {
            return false;
          }
          if (null != dj.field_c) {
            if (r.field_A) {
              if (wl.field_N) {
                if (!cm.field_s &&
                  param4.contactCount == 39) {
                  jc.a(0, 6, (byte) -108);
                }
              } else {
                param4.contactCount = 0;
              }
            }
            if (39 == param4.contactCount &&
              param1 != null) {
              param1.addLast(new GameplayAudioEvent(5), (byte) 3);
            }
            if (param0.paddle == dj.field_c) {
              if (param0.paddle.catchTicks > 0) {
                if (param1 != null) {
                  param1.addLast(new GameplayAudioEvent(10), (byte) 3);
                }
                param0.paddle.onCircleContact((byte) 53, param0, param4);
                param4.centerXHistory256.latestIndex = -1;
                param4.contactCount = 0;
                param4.centerYHistory256.latestIndex = -1;
                param0.queuedBalls.addLast(param4, (byte) 3);
                return false;
              }
              if (param1 != null) {
                param1.addLast(new GameplayAudioEvent(0), (byte) 3);
              }
              param0.paddle.onCircleContact((byte) 53, param0, param4);
              param4.destroyedBrickStreak = 0;
            } else {
              dj.field_c.onCircleContact((byte) 53, param0, param4);
              var9 = (Brick) (dj.field_c);
              if (param1 != null) {
                boolean decompiledFrameRemainder0 = true;
                var7 = 1;
                if ((var9.flags & 1) == 0) {
                  if (var9.typeId != 28) {
                    if (var9.typeId != 25) {
                      if (var9.typeId != 1 &&
                        var9.typeId != 21 &&
                        22 != var9.typeId) {
                        if (26 == var9.typeId &&
                          var9.pendingTypeId != 27) {
                          var7 = 11;
                        } else {
                          if (19 == var9.typeId &&
                            sh.field_a != 1) {
                            var7 = 11;
                          } else {
                            if (var9.typeId == 20 &&
                              sh.field_a != 2) {
                              var7 = 11;
                            } else {
                              if (((var9.typeId == 27)) &&
                                ((var9.pendingTypeId != 26))) {
                                var7 = 12;
                              }
                            }
                          }
                        }
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        var7 = 11;
                      }
                    } else {
                      var7 = 9;
                    }
                  } else {
                    var7 = 8;
                  }
                } else {
                  var7 = 2;
                }
                if (0 == param4.phaseTicks ||
                  0 != (1 << var9.typeId & sg.field_n)) {
                  param1.addLast(new GameplayAudioEvent(var7), (byte) 3);
                }
              }
              if (param4.phaseTicks == 0 &&
                var9.pendingTypeId == 0) {
                if (1 == this.playerCount) {
                  param0.a(10 + param4.destroyedBrickStreak, var9, 2);
                }
                param4.destroyedBrickStreak = param4.destroyedBrickStreak + 1;
              }
            }
          }
          this.a(param4, -1, param0);
          if (dj.field_c == null) {
            return false;
          }
          if (param4.phaseTicks == 0) {
            return true;
          }
          if (dj.field_c == param0.paddle) {
            return true;
          }
          var10 = (Brick) (dj.field_c);
          stackIn_99_0 = ((1 & var10.flags) != 0);
          return stackIn_99_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_104_0 = var6;
          stackIn_104_1 = new StringBuilder().append("ak.B(");
          if (param0 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          stackIn_107_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',');
          if (param1 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          stackIn_110_1 = ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_111_2 = "null";
          } else {
            stackIn_111_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(')').toString());
        }
    }

    final boolean b(int param0) {
        int var2;
        if (param0 < 75) {
          field_e = (String) null;
        }
        var2 = ~(this.playerMaskTwo | this.playerMaskThree | this.playerMaskOne) & -1 + (1 << this.playerCount);
        if (var2 == 0) {
          this.a(false);
        } else {
          if (wn.a(var2, (byte) -6)) {
            this.field_h = ed.b(9, var2 - 1);
            this.playerMaskThree = this.playerMaskThree | 1 << this.field_h;
            this.a(false);
          }
        }
        return this.field_c;
    }

    MultiplayerMatch(String[] param0, int param1, LevelSequence param2, int[] param3, int[] param4) {
        int var8 = 0;
        int stackIn_4_0 = 0;
        Paddle stackIn_8_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        try {
          this.playerCount = param0.length;
          this.playerNames = param0;
          this.configuration = param2;
          this.playerBoards = new PlayerBoard[this.playerCount];
          stackIn_4_0 = (this.playerCount >= 2) ? 306 : 510;
          var6_int = stackIn_4_0;
          var7 = 0;
          for (var8 = 0; this.playerCount > var8; var8++) {
            this.playerBoards[var8] = new PlayerBoard(var6_int, var8 * 30, var7, param3[var8], param4[var8]);
            stackIn_8_0 = this.playerBoards[var8].paddle;
            if (1 < this.playerCount) {
              stackIn_9_1 = 102400;
            } else {
              stackIn_9_1 = 114688;
            }
            stackIn_8_0.y256 = stackIn_9_1;
            if ((param1 & 1 << var8) != 0) {
              var7++;
            }
          }
          this.field_m = new int[this.playerCount];
          this.field_h = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ak.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        field_e = "Create unrated game";
    }
}
