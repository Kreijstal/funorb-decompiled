/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MultiplayerMatch {
    PlayerBoard[] playerBoards;
    static String field_e;
    int playerMaskOne;
    int playerCount;
    static UiComponent field_d;
    boolean resultsReady;
    int[] resultOrder;
    int drawOfferPlayerMask;
    int lastRemainingPlayerId;
    String[] playerNames;
    int playerMaskThree;
    LevelSequence configuration;
    int playerMaskTwo;
    int rematchOfferPlayerMask;

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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(obfuscationGuard).append(')').toString());
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

    final void markResultsReady(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          this.getStateSevenPlayerMask(-32);
        }
        this.resultsReady = true;
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
            7 == this.playerBoards[var3].boardState) {
            var2 = var2 | 1 << var3;
          }
          var3++;
        }
        return var2;
    }

    final void advanceBoard(PlayerBoard board, NodeDeque audioEvents, NodeDeque collectedPowerUps, int obfuscationGuard) {
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
        BallPulseEffect var5 = null;
        RuntimeException var5_ref = null;
        ScorePopup scorePopup = null;
        Paddle paddle = null;
        int var8 = 0;
        NodeDeque[] decodedGroups = null;
        Ball var9 = null;
        int var9_int = 0;
        BrickMotionPath var9_ref = null;
        BubbleDistortion bubble = null;
        Paddle var9_ref3 = null;
        Brick var9_ref4 = null;
        Object var10_ref = null;
        Brick var10_ref_on = null;
        int var10 = 0;
        PowerUp fallingPowerUp = null;
        Ball redirectedBall = null;
        Object var11_ref = null;
        int var11 = 0;
        Brick var11_ref_on = null;
        MotionWaypoint waypoint = null;
        Object var12_ref = null;
        int var12 = 0;
        Brick movingBrick = null;
        Ball contactBall = null;
        Brick contactBrick = null;
        int var15 = 0;
        int var16 = 0;
        int clientBranchFlag = 0;
        NodeDeque decodedPaths = null;
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
        Ball collidingBall;
        Ball queuedBall;
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
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          boolean decompiledSharedTail0 = !(obfuscationGuard < board.messageTicks);
          if (!decompiledSharedTail0) {
            fieldTemp$0 = board.messageTicks - 1;
            board.messageTicks = board.messageTicks - 1;
            decompiledSharedTail0 = (!(fieldTemp$0 > 0));
          }
          if (decompiledSharedTail0) {
            board.displayedMessage = board.pendingMessage;
            if (null != board.displayedMessage) {
              board.messageTicks = 100;
            }
            board.pendingMessage = null;
          }
          if (board.field_M > 0) {
            board.field_M = board.field_M - 1;
          }
          if (board.field_ib > 0) {
            fieldTemp$1 = board.field_ib - 1;
            board.field_ib = board.field_ib - 1;
            if (0 == fieldTemp$1) {
              board.b(16387, 0);
            }
          }
          var5 = (BallPulseEffect) (board.ballPulses.first(-58));
          while (var5 != null) {
            if (!var5.advance((byte) 69)) {
              var5.unlink((byte) 111);
            }
            var5 = (BallPulseEffect) (board.ballPulses.next((byte) 116));
          }
          scorePopup = (ScorePopup) (board.scorePopups.first(-85));
          while (scorePopup != null) {
            if (!scorePopup.advance(false)) {
              scorePopup.unlink((byte) 111);
            }
            scorePopup = (ScorePopup) (board.scorePopups.next((byte) 116));
          }
          paddle = board.paddle;
          if (board.boardState == 2) {
            if (audioEvents != null &&
              0 != (3 & board.controlMask) &&
              3 != board.controlMask) {
              audioEvents.addLast(new GameplayAudioEvent(4), (byte) 3);
            }
            if (0 < paddle.field_w) {
              board.controlMask = board.controlMask ^ 3;
            }
            if ((board.controlMask & 2) != 0) {
              paddle.velocityX256 = 2048;
            }
            if ((board.controlMask & 1) != 0) {
              paddle.velocityX256 = paddle.velocityX256 - 2048;
            }
            if ((board.controlMask & 4) != 0) {
              var8 = 0;
              if (!board.activeBalls.isEmpty(false)) {
                var9 = (Ball) (board.activeBalls.first(-76));
                while (var9 != null) {
                  if (40 <= var9.contactCount) {
                    if (audioEvents != null) {
                      audioEvents.addLast(new GameplayAudioEvent(6), (byte) 3);
                    }
                    var8 = 1;
                    var9.contactCount = 0;
                    board.ballPulses.addLast(new BallPulseEffect(var9.x256, var9.y256), (byte) 3);
                    board.field_l = 0;
                    var20 = new CircleBody(var9.radius256 + var9.x256, var9.radius256 + var9.y256, 0, 0, 15360, 0);
                    var11 = 0;
                    for (var12 = 0; board.brickGroups.length > var12; var12++) {
                      var19 = board.brickGroups[var12];
                      var21 = var19;
                      var22 = var21;
                      var21Lifetime2 = var19;
                      contactBrick = (Brick) (var19.first(-78));
                      while (contactBrick != null) {
                        if (contactBrick.overlapsCircle(var20, false)) {
                          if (contactBrick.typeId <= 0) {
                            if (contactBrick.typeId != 19) {
                              if (contactBrick.typeId != 20) {
                                if (21 != contactBrick.typeId) {
                                  stackIn_132_0 = (contactBrick.typeId == 22) ? 1 : 0;
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
                          if (contactBrick.typeId == 22) {
                            contactBrick.typeId = 23;
                          }
                          if (contactBrick.typeId == 21) {
                            contactBrick.typeId = 22;
                          }
                          if (var15 != 0) {
                            stackIn_142_0 = (contactBrick.pendingTypeId != 0) ? 0 : 1;
                            var16 = stackIn_142_0;
                            contactBrick.pendingTypeId = MonotonicTime.field_b[contactBrick.typeId];
                            contactBrick.transitionCode = rb.field_a[contactBrick.typeId];
                            contactBrick.stateWord = 0;
                            if (19 == contactBrick.typeId ||
                              contactBrick.typeId == 20) {
                              contactBrick.transitionCode = 1;
                              contactBrick.pendingTypeId = 0;
                            }
                            if (1 == this.playerCount &&
                              contactBrick.pendingTypeId == 0 &&
                              var16 == 0) {
                              board.a(2 * var9.destroyedBrickStreak + 10, contactBrick, 2);
                              var11++;
                            }
                          }
                        }
                        contactBrick = (Brick) (var19.next((byte) 116));
                      }
                    }
                    stackIn_155_0 = (PlayerBoard) (board);
                    stackIn_155_1 = 16387;
                    if (var11 > 0) {
                      stackIn_156_2 = 1;
                    } else {
                      stackIn_156_2 = 6;
                    }
                    ((PlayerBoard) (Object) stackIn_155_0).b(stackIn_155_1, stackIn_156_2);
                    stackIn_158_0 = (PlayerBoard) (board);
                    if (var11 > 0) {
                      stackIn_159_1 = TextLineLayout.field_e;
                    } else {
                      stackIn_159_1 = WidgetTheme.field_e;
                    }
                    ((PlayerBoard) (Object) stackIn_158_0).a(stackIn_159_1, (byte) 75);
                  }
                  var9 = (Ball) (board.activeBalls.next((byte) 116));
                }
              }
              if (var8 == 0 &&
                !board.queuedBalls.isEmpty(false)) {
                board.activeBalls.addLast(board.queuedBalls.removeFirst(3), (byte) 3);
              }
              if (var8 != 0) {
                fieldTemp$2 = board.field_A + 1;
                board.field_A = board.field_A + 1;
                if (1 == fieldTemp$2) {
                }
              }
            }
            regionExit1: {
              var8 = 1;
              if (board.field_n == 0) {
                var8 = 0;
              } else {
                if (this.playerCount != 1) {
                  for (var9_int = 0; board.brickGroups.length > var9_int; var9_int++) {
                    var21Lifetime1 = board.brickGroups[var9_int];
                    var22Lifetime1 = var21Lifetime1;
                    var22Lifetime1Lifetime1 = var21Lifetime1;
                    var11_ref_on = (Brick) (var21Lifetime1.first(obfuscationGuard - 91));
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
              var9_ref = (BrickMotionPath) (board.motionPaths.first(-120));
              while (var9_ref != null) {
                var22Lifetime2 = var9_ref.waypoints;
                waypoint = (MotionWaypoint) (var22Lifetime2.first(-125));
                while (waypoint != null) {
                  waypoint.y256 = waypoint.y256 + 256;
                  waypoint = (MotionWaypoint) (var22Lifetime2.next((byte) 116));
                }
                var9_ref = (BrickMotionPath) (board.motionPaths.next((byte) 116));
              }
            }
            for (var9_int = 0; board.brickGroups.length > var9_int; var9_int++) {
              var23 = board.brickGroups[var9_int];
              var11_ref_onLifetime1 = (Brick) (var23.first(obfuscationGuard ^ -42));
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
                        board.countedBricks = board.countedBricks - 1;
                        board.field_m = board.field_m + 1;
                        board.field_Q = board.field_Q + 1;
                      }
                      if (r.field_A) {
                        WidgetLayer.a(var11_ref_onLifetime1.flags, 1, (byte) -95);
                      }
                    } else {
                      if (var11_ref_onLifetime1.typeId == 0) {
                        board.countedBricks = board.countedBricks + 1;
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
            var9Lifetime1 = (Ball) (board.queuedBalls.first(-105));
            while (var9Lifetime1 != null) {
              if (var9Lifetime1.phaseTicks > 0) {
                var9Lifetime1.phaseTicks = var9Lifetime1.phaseTicks - 1;
              }
              if (var9Lifetime1.penetrationTicks > 0) {
                var9Lifetime1.penetrationTicks = var9Lifetime1.penetrationTicks - 1;
              }
              var9Lifetime1 = (Ball) (board.queuedBalls.next((byte) 116));
            }
            var9Lifetime2 = (Ball) (board.activeBalls.first(obfuscationGuard - 13));
            while (var9Lifetime2 != null) {
              var9Lifetime2.centerXHistory256.append(-7255, var9Lifetime2.x256 + var9Lifetime2.radius256);
              var9Lifetime2.centerYHistory256.append(-7255, var9Lifetime2.y256 + var9Lifetime2.radius256);
              if (var9Lifetime2.phaseTicks > 0) {
                var9Lifetime2.phaseTicks = var9Lifetime2.phaseTicks - 1;
              }
              if (var9Lifetime2.penetrationTicks > 0) {
                var9Lifetime2.penetrationTicks = var9Lifetime2.penetrationTicks - 1;
              }
              var9Lifetime2 = (Ball) (board.activeBalls.next((byte) 116));
            }
            if (paddle.field_w > 0) {
              paddle.field_w = paddle.field_w - 1;
            }
            if (paddle.field_H > 0) {
              paddle.field_H = paddle.field_H - 1;
            }
            if (0 < paddle.catchTicks) {
              paddle.catchTicks = paddle.catchTicks - 1;
            }
            if (var8 != 0) {
              fieldTemp$3 = board.field_n - 1;
              board.field_n = board.field_n - 1;
              if (fieldTemp$3 % 16 == 0) {
                stackIn_245_0 = (1 == this.playerCount) ? 13 : 7;
                var9_int = stackIn_245_0;
                var10_ref = null;
                for (var11 = 1; var11 <= var9_int; var11++) {
                  dupTemp$4 = new Brick(34 * var11 << 8, 4096, 0, 0, 0);
                  var10_ref_on = dupTemp$4;
                  board.brickGroups[2].addLast(dupTemp$4, (byte) 3);
                  var10_ref_on.pendingTypeId = 2;
                  var10_ref_on.transitionCode = 10;
                }
                for (var11 = 0; var11 < 3; var11++) {
                  var25 = board.brickGroups[var11];
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
            if (board.bubbleTick >= 0) {
              bubble = (BubbleDistortion) (board.bubbles.first(-118));
              while (bubble != null) {
                bubble.advance(obfuscationGuard - 2081170685);
                bubble = (BubbleDistortion) (board.bubbles.next((byte) 116));
              }
              board.bubbleTick = board.bubbleTick + 1;
            }
            var9_int = 0;
            while (true) {
              if (var9_int >= 8) {
                var9_ref3 = paddle;
                paddle.velocityY256 = 0;
                var9_ref3.velocityX256 = 0;
                for (var10 = 0; var10 < 3; var10++) {
                  var11_ref_onLifetime2 = (Brick) (board.brickGroups[var10].first(-49));
                  while (var11_ref_onLifetime2 != null) {
                    if ((var11_ref_onLifetime2.flags & 4) != 0) {
                      var11_ref_onLifetime2.interpolateMotion((byte) 119, true);
                    }
                    var11_ref_onLifetime2 = (Brick) (board.brickGroups[var10].next((byte) 116));
                  }
                }
                boolean decompiledFrameRemainder0 = true;
                if (board.countedBricks == 0 &&
                  board.field_n == 0) {
                  board.stateTicks = 0;
                  board.field_r = board.field_r + 1;
                  board.field_hb = board.field_hb + 1;
                  board.field_t = board.field_t + 1;
                  if (1 == this.playerCount) {
                    board.addScore(250, false, 65280, paddle.y256 - 12800);
                  }
                  fieldTemp$5 = board.levelIndex + 1;
                  board.levelIndex = board.levelIndex + 1;
                  if (fieldTemp$5 >= this.configuration.getPeriod(obfuscationGuard - 125) &&
                    !this.configuration.repeats) {
                    if (this.playerCount != 1) {
                      board.boardState = 7;
                    } else {
                      board.boardState = 5;
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    board.boardState = 0;
                    board.stateTicks = 0;
                  }
                }
                if (board.pendingMessage != null) {
                  return;
                }
                var10 = 0;
                var11 = 0;
                var12Lifetime1 = 0;
                contactBall = (Ball) (board.activeBalls.first(-26));
                while (contactBall != null) {
                  var12Lifetime1Lifetime1 = contactBall.brickBounceCount;
                  if (contactBall.brickBounceCount > var10) {
                    var10 = var12Lifetime1Lifetime1;
                  }
                  var12Lifetime1Lifetime1 = contactBall.destroyedBrickStreak;
                  if (var11 < contactBall.destroyedBrickStreak) {
                    var11 = var12Lifetime1Lifetime1;
                  }
                  contactBall = (Ball) (board.activeBalls.next((byte) 116));
                }
                if (var10 <= 20 &&
                  15 >= var11) {
                  return;
                }
                board.a(TextLineLayout.field_e, (byte) 75);
                return;
              }
              fallingPowerUp = (PowerUp) (board.fallingPowerUps.first(-119));
              while (fallingPowerUp != null) {
                fallingPowerUp.x256 = fallingPowerUp.x256 + fallingPowerUp.velocityX256 / 8;
                fallingPowerUp.y256 = fallingPowerUp.y256 + fallingPowerUp.velocityY256 / 8;
                if (fallingPowerUp.y256 > 122880) {
                  stackIn_270_0 = (PlayerBoard) (board);
                  stackIn_270_1 = 16387;
                  if (board.nextRandomBoundedInt(100, (byte) 62) > 50) {
                    stackIn_271_2 = 4;
                  } else {
                    stackIn_271_2 = 5;
                  }
                  ((PlayerBoard) (Object) stackIn_270_0).b(stackIn_270_1, stackIn_271_2);
                  if (r.field_A) {
                    WidgetLayer.a(fallingPowerUp.typeId, 4, (byte) -110);
                  }
                  fallingPowerUp.unlink((byte) 111);
                } else {
                  if (paddle.resolveCircleCollision(fallingPowerUp, (byte) 25)) {
                    fallingPowerUp.unlink((byte) 111);
                    stackIn_279_0 = (!fallingPowerUp.isSelfTargeted(false)) ? 0 : 1;
                    var11 = stackIn_279_0;
                    if (collectedPowerUps != null) {
                      collectedPowerUps.addLast(fallingPowerUp, (byte) 3);
                    }
                    if (this.playerCount == 1) {
                      stackIn_284_0 = var11;
                      if (fallingPowerUp.typeId != 13) {
                        stackIn_285_1 = 0;
                      } else {
                        stackIn_285_1 = 1;
                      }
                      var11 = stackIn_284_0 | stackIn_285_1;
                      stackIn_287_0 = (PlayerBoard) (board);
                      if (var11 != 0) {
                        stackIn_288_1 = 100;
                      } else {
                        stackIn_288_1 = 500;
                      }
                      ((PlayerBoard) (Object) stackIn_287_0).a(stackIn_288_1, paddle, obfuscationGuard + 2);
                      if (var11 != 0) {
                        board.field_u = 0;
                        board.field_hb = 0;
                        board.field_N = board.field_N + 1;
                      } else {
                        board.field_u = board.field_u + 1;
                        board.field_N = 0;
                      }
                    }
                    if (r.field_A) {
                      WidgetLayer.a(fallingPowerUp.typeId, 3, (byte) -115);
                    }
                    if (audioEvents != null) {
                      audioEvents.addLast(new GameplayAudioEvent(3, fallingPowerUp.typeId), (byte) 3);
                    }
                    stackIn_300_0 = (PlayerBoard) (board);
                    if (1 >= this.playerCount &&
                      fallingPowerUp.typeId != 13 &&
                      var11 == 0) {
                      stackIn_302_1 = WidgetTheme.field_e;
                    } else {
                      stackIn_302_1 = TextLineLayout.field_e;
                    }
                    ((PlayerBoard) (Object) stackIn_300_0).a(stackIn_302_1, (byte) 75);
                  }
                }
                fallingPowerUp = (PowerUp) (board.fallingPowerUps.next((byte) 116));
              }
              paddle.x256 = paddle.x256 + paddle.velocityX256 / 8;
              if (paddle.controlMode > paddle.x256) {
                paddle.x256 = paddle.controlMode;
              }
              if (-paddle.width256 + paddle.boardSpan256 < paddle.x256) {
                paddle.x256 = -paddle.width256 + paddle.boardSpan256;
              }
              if (paddle.field_H > 0) {
                redirectedBall = (Ball) (board.activeBalls.first(-111));
                while (redirectedBall != null) {
                  if ((redirectedBall.x256 + redirectedBall.radius256) > (paddle.width256 / 2 + paddle.x256)) {
                    if (redirectedBall.velocityX256 > 0) {
                      redirectedBall.velocityX256 = -redirectedBall.velocityX256;
                    }
                  } else {
                    if (0 <= redirectedBall.velocityX256) {
                      redirectedBall = (Ball) (board.activeBalls.next((byte) 116));
                      continue;
                    }
                    redirectedBall.velocityX256 = -redirectedBall.velocityX256;
                  }
                  redirectedBall = (Ball) (board.activeBalls.next((byte) 116));
                }
              }
              for (var10 = 0; board.brickGroups.length > var10; var10++) {
                var26Lifetime1 = board.brickGroups[var10];
                movingBrick = (Brick) (var26Lifetime1.first(-38));
                while (movingBrick != null) {
                  if (0 != (movingBrick.flags & 4) &&
                    1 < movingBrick.waypoints[movingBrick.destinationWaypointIndex].durationTicks) {
                    movingBrick.x256 = movingBrick.x256 + movingBrick.velocityX256 / 8;
                    movingBrick.y256 = movingBrick.y256 + movingBrick.velocityY256 / 8;
                  }
                  movingBrick = (Brick) (var26Lifetime1.next((byte) 116));
                }
              }
              collidingBall = (Ball) (board.activeBalls.first(-122));
              while (collidingBall != null) {
                for (var11 = 0; var11 < 5; var11++) {
                  if (this.a(board, audioEvents, 8, -128, collidingBall)) {
                    continue;
                  }
                  break;
                }
                if (collidingBall.isLinked(0) && (var11 == 5 ||
                  !(collidingBall.x256 >= 0) ||
                  !(0 <= collidingBall.y256) ||
                  !(board.boardWidth << 8 >= collidingBall.x256))) {
                  collidingBall.setVelocityFromAngle(-1024 + board.nextRandomBoundedInt(2048, (byte) 62), 1536, 105);
                  collidingBall.centerXHistory256.latestIndex = -1;
                  collidingBall.destroyedBrickStreak = 0;
                  collidingBall.centerYHistory256.latestIndex = -1;
                  collidingBall.brickBounceCount = 0;
                  collidingBall.contactCount = 0;
                  board.queuedBalls.addLast(collidingBall, (byte) 3);
                }
                if (!board.activeBalls.isEmpty(false)) {
                  collidingBall = (Ball) (board.activeBalls.next((byte) 116));
                  continue;
                }
                break;
              }
              queuedBall = (Ball) (board.queuedBalls.first(-91));
              while (queuedBall != null) {
                queuedBall.positionOnPaddle(paddle, 0);
                queuedBall = (Ball) (board.queuedBalls.next((byte) 116));
              }
              var9_int++;
            }
          } else {
            if (board.boardState == 0) {
              decodedGroups = new NodeDeque[3];
              for (var9_int = 0; 3 > var9_int; var9_int++) {
                decodedGroups[var9_int] = new NodeDeque();
              }
              decodedPaths = new NodeDeque();
              var10 = board.levelState.value;
              this.configuration.decodeLevel(new ga(), board.levelState, decodedPaths, board.levelIndex, (byte) -118, decodedGroups);
              board.installLevelBricks(decodedPaths, obfuscationGuard + 9, decodedGroups);
              board.resetServeWithRandomAngle(26496, false);
              if (this.playerCount == 1 &&
                0 < board.field_r && (board.levelState.value == 0 ||
                var10 != board.levelState.value)) {
                board.field_tb = true;
              }
              if (board.field_r != 0) {
                for (var11 = 0; var11 < 3; var11++) {
                  movingBrick = (Brick) (decodedGroups[var11].first(obfuscationGuard ^ -107));
                  while (movingBrick != null) {
                    movingBrick.stateWord = 0;
                    movingBrick.transitionCode = 5;
                    movingBrick.pendingTypeId = movingBrick.typeId;
                    movingBrick = (Brick) (decodedGroups[var11].next((byte) 116));
                  }
                }
              }
              board.boardState = 1;
              board.stateTicks = 0;
              board.field_A = 0;
              return;
            }
            if (board.boardState == 1) {
              if (board.stateTicks == 0) {
                if (this.playerCount == 1) {
                  board.pendingMessage = null;
                  board.displayedMessage = this.configuration.getLevelNumberLabel((byte) 115, board.levelIndex);
                  board.messageTicks = 100;
                }
                if (audioEvents != null) {
                  audioEvents.addLast(new GameplayAudioEvent(14), (byte) 3);
                }
              }
              if (board.field_r != 0) {
                for (var8 = 0; var8 < 3; var8++) {
                  var9_ref4 = (Brick) (board.brickGroups[var8].first(-30));
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
                    var9_ref4 = (Brick) (board.brickGroups[var8].next((byte) 116));
                  }
                }
              }
              var8 = 0;
              if (this.playerCount == 1) {
                var8 = 125;
              } else {
                var8 = (board.field_r == 0) ? 75 : 40;
              }
              fieldTemp$8 = board.stateTicks + 1;
              board.stateTicks = board.stateTicks + 1;
              if (fieldTemp$8 != var8) {
                return;
              }
              board.stateTicks = 0;
              board.boardState = 4;
              return;
            }
            if (board.boardState == 4) {
              if (board.stateTicks == 0 &&
                audioEvents != null) {
                audioEvents.addLast(new GameplayAudioEvent(13), (byte) 3);
              }
              fieldTemp$11 = board.stateTicks + 1;
              board.stateTicks = board.stateTicks + 1;
              if (fieldTemp$11 != 75) {
                if (this.playerCount != 1) {
                  return;
                }
                if (25 != board.stateTicks) {
                  return;
                }
              }
              board.pendingMessage = SecondaryNodeQueue.field_c;
              stackIn_55_0 = (PlayerBoard) (board);
              if (board.messageTicks > 25) {
                stackIn_56_1 = 25;
              } else {
                stackIn_56_1 = board.messageTicks;
              }
              stackIn_55_0.messageTicks = stackIn_56_1;
              board.boardState = 2;
              board.stateTicks = 0;
              return;
            }
            if (board.boardState == 3) {
              fieldTemp$9 = board.stateTicks + 1;
              board.stateTicks = board.stateTicks + 1;
              if (fieldTemp$9 != 350) {
                return;
              }
              board.stateTicks = 0;
              board.boardState = 8;
              return;
            }
            if (board.boardState != 5) {
              return;
            }
            fieldTemp$10 = board.stateTicks + 1;
            board.stateTicks = board.stateTicks + 1;
            if (fieldTemp$10 == 350) {
              board.stateTicks = 0;
              board.boardState = 9;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_388_0 = var5_ref;
          stackIn_388_1 = new StringBuilder().append("ak.F(");
          if (board == null) {
            stackIn_389_2 = "null";
          } else {
            stackIn_389_2 = "{...}";
          }
          stackIn_391_1 = ((StringBuilder) (Object) stackIn_388_1).append(stackIn_389_2).append(',');
          if (audioEvents == null) {
            stackIn_392_2 = "null";
          } else {
            stackIn_392_2 = "{...}";
          }
          stackIn_394_1 = ((StringBuilder) (Object) stackIn_391_1).append(stackIn_392_2).append(',');
          if (collectedPowerUps == null) {
            stackIn_395_2 = "null";
          } else {
            stackIn_395_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_388_0), ((StringBuilder) (Object) stackIn_394_1).append(stackIn_395_2).append(',').append(obfuscationGuard).append(')').toString());
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
            if (GameClock.field_c != null) {
              break;
            }
          }
          param2.paddle.resolveCircleCollision(param0, (byte) 110);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ak.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
            var5 = this.playerBoards[var4].positionWord + this.playerBoards[var4].boardOffset;
            var6 = 0;
            var7 = (var4 + 1) % this.playerCount;
            while (this.playerCount - 1 > var6) {
              if ((1 << var7 & (this.playerMaskThree | this.playerMaskTwo | this.playerMaskOne)) != 0) {
                var7++;
                var7 = var7 % this.playerCount;
                var6++;
                continue;
              }
              var8 = this.playerBoards[var7].boardOffset + this.playerBoards[var7].positionWord;
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
          this.resultsReady = true;
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
                param0.lives = param0.lives - 1;
              }
              if (param0.lives <= 0) {
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
                  WidgetLayer.a(0, 5, (byte) -124);
                }
                param0.resetServeWithRandomAngle(26496, true);
                param0.stateTicks = 0;
                param0.boardState = 4;
              }
              param0.a(WidgetTheme.field_e, (byte) 75);
              return false;
            }
            param0.b(16387, 2);
            return false;
          }
          this.a(param4, -1, param0);
          if (param3 > -125) {
            return false;
          }
          if (null != GameClock.field_c) {
            if (r.field_A) {
              if (ValidationIconWidget.field_N) {
                if (!cm.field_s &&
                  param4.contactCount == 39) {
                  WidgetLayer.a(0, 6, (byte) -108);
                }
              } else {
                param4.contactCount = 0;
              }
            }
            if (39 == param4.contactCount &&
              param1 != null) {
              param1.addLast(new GameplayAudioEvent(5), (byte) 3);
            }
            if (param0.paddle == GameClock.field_c) {
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
              GameClock.field_c.onCircleContact((byte) 53, param0, param4);
              var9 = (Brick) (GameClock.field_c);
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
                  0 != (1 << var9.typeId & EmailValidator.field_n)) {
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
          if (GameClock.field_c == null) {
            return false;
          }
          if (param4.phaseTicks == 0) {
            return true;
          }
          if (GameClock.field_c == param0.paddle) {
            return true;
          }
          var10 = (Brick) (GameClock.field_c);
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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(')').toString());
        }
    }

    final boolean checkMatchCompletion(int obfuscationGuard) {
        int remainingPlayerMask;
        if (obfuscationGuard < 75) {
          field_e = (String) null;
        }
        remainingPlayerMask = ~(this.playerMaskTwo | this.playerMaskThree | this.playerMaskOne) & -1 + (1 << this.playerCount);
        if (remainingPlayerMask == 0) {
          this.markResultsReady(false);
        } else {
          if (wn.a(remainingPlayerMask, (byte) -6)) {
            this.lastRemainingPlayerId = ed.unsignedBitLength(9, remainingPlayerMask - 1);
            this.playerMaskThree = this.playerMaskThree | 1 << this.lastRemainingPlayerId;
            this.markResultsReady(false);
          }
        }
        return this.resultsReady;
    }

    MultiplayerMatch(String[] playerNames, int localPlayerMask, LevelSequence configuration, int[] randomSeeds, int[] characterOrder) {
        int boardIndex = 0;
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
        int boardWidth = 0;
        RuntimeException failure = null;
        int controlSetIndex = 0;
        try {
          this.playerCount = playerNames.length;
          this.playerNames = playerNames;
          this.configuration = configuration;
          this.playerBoards = new PlayerBoard[this.playerCount];
          stackIn_4_0 = (this.playerCount >= 2) ? 306 : 510;
          boardWidth = stackIn_4_0;
          controlSetIndex = 0;
          for (boardIndex = 0; this.playerCount > boardIndex; boardIndex++) {
            this.playerBoards[boardIndex] = new PlayerBoard(boardWidth, boardIndex * 30, controlSetIndex, randomSeeds[boardIndex], characterOrder[boardIndex]);
            stackIn_8_0 = this.playerBoards[boardIndex].paddle;
            if (1 < this.playerCount) {
              stackIn_9_1 = 102400;
            } else {
              stackIn_9_1 = 114688;
            }
            stackIn_8_0.y256 = stackIn_9_1;
            if ((localPlayerMask & 1 << boardIndex) != 0) {
              controlSetIndex++;
            }
          }
          this.resultOrder = new int[this.playerCount];
          this.lastRemainingPlayerId = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_16_0 = failure;
          stackIn_16_1 = new StringBuilder().append("ak.<init>(");
          if (playerNames == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(localPlayerMask).append(',');
          if (configuration == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (randomSeeds == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (characterOrder == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        field_e = "Create unrated game";
    }
}
