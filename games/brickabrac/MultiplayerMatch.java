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
        int routingPlayerCount = 0;
        int singlePlayerCount = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String attacksSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        int unusedGameFlag = 0;
        PowerUp powerUp = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard > -39) {
            this.getStateSevenPlayerMask(86);
          }
          powerUp = (PowerUp) (attacks.first(-44));
          while (powerUp != null) {
            routingPlayerCount = this.playerCount;
            singlePlayerCount = 1;
            if (routingPlayerCount != singlePlayerCount &&
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
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("ak.I(").append(playerId).append(',').append(tickOffset).append(',');
          if (attacks == null) {
            attacksSummary = "null";
          } else {
            attacksSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(attacksSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final int getExpiredPositionTimerMask(byte obfuscationGuard) {
        boolean unusedSubstepResult = false;
        int playerIndex = 0;
        int expiredMask;
        int unusedGameFlag;
        Ball unusedBall;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        expiredMask = 0;
        if (obfuscationGuard != -92) {
          unusedBall = (Ball) null;
          unusedSubstepResult = this.advanceBallSubstep((PlayerBoard) null, (NodeDeque) null, -18, 53, (Ball) null);
        }
        for (playerIndex = 0; playerIndex < this.playerCount; playerIndex++) {
          if (((this.playerMaskOne | (this.playerMaskThree | this.playerMaskTwo)) & 1 << playerIndex) == 0 &&
            this.playerBoards[playerIndex].positionOrderTicks == 0) {
            expiredMask = expiredMask | 1 << playerIndex;
          }
        }
        return expiredMask;
    }

    final void markResultsReady(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          this.getStateSevenPlayerMask(-32);
        }
        this.resultsReady = true;
    }

    final int getStateSevenPlayerMask(int obfuscationGuard) {
        int stateSevenMask;
        int playerIndex;
        int unusedGameFlag;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        stateSevenMask = 0;
        playerIndex = 0;
        if (obfuscationGuard != -17566) {
          return -12;
        }
        while (playerIndex < this.playerCount) {
          if ((1 << playerIndex & this.playerMaskThree) == 0 &&
            7 == this.playerBoards[playerIndex].boardState) {
            stateSevenMask = stateSevenMask | 1 << playerIndex;
          }
          playerIndex++;
        }
        return stateSevenMask;
    }

    final void advanceBoard(PlayerBoard board, NodeDeque audioEvents, NodeDeque collectedPowerUps, int obfuscationGuard) {
        int remainingMessageTicks = 0;
        int remainingEyeTicks = 0;
        int nextChargedActivationCount = 0;
        int nextTransitionTicks = 0;
        int remainingBuildTicks = 0;
        Brick newRowBrick = null;
        int nextLevelIndex = 0;
        int nextIntroTransitionTicks = 0;
        int nextIntroTicks = 0;
        int nextServeDelayTicks = 0;
        int nextDefeatTicks = 0;
        int nextVictoryTicks = 0;
        PlayerBoard messageBoard = null;
        int clippedMessageTicks = 0;
        int chargeHitEligibility = 0;
        int pendingRemovalValue = 0;
        PlayerBoard chargeExpressionBoard = null;
        int chargeExpressionGuard = 0;
        int chargeExpression = 0;
        PlayerBoard chargeMessageBoard = null;
        String[] chargeMessages = null;
        int buildRowColumns = 0;
        PlayerBoard missedPowerUpBoard = null;
        int missedPowerUpExpressionGuard = 0;
        int missedPowerUpExpression = 0;
        int selfTargetedValue = 0;
        int beneficialBaseValue = 0;
        int slowDownValue = 0;
        PlayerBoard pickupScoreBoard = null;
        int pickupPoints = 0;
        PlayerBoard pickupMessageBoard = null;
        String[] pickupMessages = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String boardSummary = null;
        StringBuilder audioContextBuilder = null;
        String audioSummary = null;
        StringBuilder collectedContextBuilder = null;
        String collectedSummary = null;
        RuntimeException caughtFailure = null;
        BallPulseEffect pulse = null;
        RuntimeException failure = null;
        ScorePopup scorePopup = null;
        Paddle paddle = null;
        int var8 = 0;
        NodeDeque[] decodedGroups = null;
        Ball chargeCandidate = null;
        int var9_int = 0;
        BrickMotionPath shiftedPath = null;
        BubbleDistortion bubble = null;
        Paddle stoppedPaddle = null;
        Brick introBrick = null;
        Object unusedBuildReference = null;
        Brick builtBrick = null;
        int var10 = 0;
        PowerUp fallingPowerUp = null;
        Ball redirectedBall = null;
        Object unusedReferenceOne = null;
        int var11 = 0;
        Brick clearanceBrick = null;
        MotionWaypoint waypoint = null;
        Object unusedReferenceTwo = null;
        int chargeGroupIndex = 0;
        Brick movingBrick = null;
        Ball contactBall = null;
        Brick contactBrick = null;
        int chargeHitEligible = 0;
        int wasPendingRemoval = 0;
        int clientBranchFlag = 0;
        NodeDeque decodedPaths = null;
        NodeDeque chargeGroup = null;
        CircleBody chargeArea = null;
        NodeDeque unusedChargeGroupAlias = null;
        NodeDeque unusedChargeGroupReference = null;
        NodeDeque transitionGroup = null;
        MotionWaypoint destinationWaypoint = null;
        NodeDeque overflowGroup = null;
        NodeDeque unusedOverflowGroupAlias = null;
        Ball queuedEffectBall;
        Ball activeEffectBall;
        Brick overflowBrick;
        Ball collidingBall;
        Ball queuedBall;
        Brick transitionBrick;
        Brick interpolatedBrick;
        NodeDeque clearanceGroup;
        NodeDeque unusedClearanceGroupAlias;
        NodeDeque pathWaypoints;
        NodeDeque movingGroup;
        NodeDeque unusedChargeGroupLifetimeAlias;
        NodeDeque unusedOverflowGroupReference;
        NodeDeque unusedClearanceGroupReference;
        int unusedStatisticValue;
        int ballStatistic;
        unusedReferenceTwo = null;
        unusedReferenceOne = null;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          boolean promotePendingMessage = !(obfuscationGuard < board.messageTicks);
          if (!promotePendingMessage) {
            remainingMessageTicks = board.messageTicks - 1;
            board.messageTicks = board.messageTicks - 1;
            promotePendingMessage = (!(remainingMessageTicks > 0));
          }
          if (promotePendingMessage) {
            board.displayedMessage = board.pendingMessage;
            if (null != board.displayedMessage) {
              board.messageTicks = 100;
            }
            board.pendingMessage = null;
          }
          if (board.positionOrderTicks > 0) {
            board.positionOrderTicks = board.positionOrderTicks - 1;
          }
          if (board.eyeExpressionTicks > 0) {
            remainingEyeTicks = board.eyeExpressionTicks - 1;
            board.eyeExpressionTicks = board.eyeExpressionTicks - 1;
            if (0 == remainingEyeTicks) {
              board.setBriefEyeExpression(16387, 0);
            }
          }
          pulse = (BallPulseEffect) (board.ballPulses.first(-58));
          while (pulse != null) {
            if (!pulse.advance((byte) 69)) {
              pulse.unlink((byte) 111);
            }
            pulse = (BallPulseEffect) (board.ballPulses.next((byte) 116));
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
            if (0 < paddle.reversedControlTicks) {
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
                chargeCandidate = (Ball) (board.activeBalls.first(-76));
                while (chargeCandidate != null) {
                  if (40 <= chargeCandidate.contactCount) {
                    if (audioEvents != null) {
                      audioEvents.addLast(new GameplayAudioEvent(6), (byte) 3);
                    }
                    var8 = 1;
                    chargeCandidate.contactCount = 0;
                    board.ballPulses.addLast(new BallPulseEffect(chargeCandidate.x256, chargeCandidate.y256), (byte) 3);
                    board.brickSequenceStep = 0;
                    chargeArea = new CircleBody(chargeCandidate.radius256 + chargeCandidate.x256, chargeCandidate.radius256 + chargeCandidate.y256, 0, 0, 15360, 0);
                    var11 = 0;
                    for (chargeGroupIndex = 0; board.brickGroups.length > chargeGroupIndex; chargeGroupIndex++) {
                      chargeGroup = board.brickGroups[chargeGroupIndex];
                      unusedChargeGroupAlias = chargeGroup;
                      unusedChargeGroupReference = unusedChargeGroupAlias;
                      unusedChargeGroupLifetimeAlias = chargeGroup;
                      contactBrick = (Brick) (chargeGroup.first(-78));
                      while (contactBrick != null) {
                        if (contactBrick.overlapsCircle(chargeArea, false)) {
                          if (contactBrick.typeId <= 0) {
                            if (contactBrick.typeId != 19) {
                              if (contactBrick.typeId != 20) {
                                if (21 != contactBrick.typeId) {
                                  chargeHitEligibility = (contactBrick.typeId == 22) ? 1 : 0;
                                } else {
                                  chargeHitEligibility = 1;
                                }
                              } else {
                                chargeHitEligibility = 1;
                              }
                            } else {
                              chargeHitEligibility = 1;
                            }
                          } else {
                            chargeHitEligibility = 1;
                          }
                          chargeHitEligible = chargeHitEligibility;
                          if (contactBrick.typeId == 22) {
                            contactBrick.typeId = 23;
                          }
                          if (contactBrick.typeId == 21) {
                            contactBrick.typeId = 22;
                          }
                          if (chargeHitEligible != 0) {
                            pendingRemovalValue = (contactBrick.pendingTypeId != 0) ? 0 : 1;
                            wasPendingRemoval = pendingRemovalValue;
                            contactBrick.pendingTypeId = MonotonicTime.brickHitPendingTypes[contactBrick.typeId];
                            contactBrick.transitionCode = BrickHitTransitionTable.codesByBrickType[contactBrick.typeId];
                            contactBrick.stateWord = 0;
                            if (19 == contactBrick.typeId ||
                              contactBrick.typeId == 20) {
                              contactBrick.transitionCode = 1;
                              contactBrick.pendingTypeId = 0;
                            }
                            if (1 == this.playerCount &&
                              contactBrick.pendingTypeId == 0 &&
                              wasPendingRemoval == 0) {
                              board.addBrickScore(2 * chargeCandidate.destroyedBrickStreak + 10, contactBrick, 2);
                              var11++;
                            }
                          }
                        }
                        contactBrick = (Brick) (chargeGroup.next((byte) 116));
                      }
                    }
                    chargeExpressionBoard = (PlayerBoard) (board);
                    chargeExpressionGuard = 16387;
                    if (var11 > 0) {
                      chargeExpression = 1;
                    } else {
                      chargeExpression = 6;
                    }
                    ((PlayerBoard) (Object) chargeExpressionBoard).setBriefEyeExpression(chargeExpressionGuard, chargeExpression);
                    chargeMessageBoard = (PlayerBoard) (board);
                    if (var11 > 0) {
                      chargeMessages = TextLineLayout.field_e;
                    } else {
                      chargeMessages = WidgetTheme.lostBallMessages;
                    }
                    ((PlayerBoard) (Object) chargeMessageBoard).choosePendingMessage(chargeMessages, (byte) 75);
                  }
                  chargeCandidate = (Ball) (board.activeBalls.next((byte) 116));
                }
              }
              if (var8 == 0 &&
                !board.queuedBalls.isEmpty(false)) {
                board.activeBalls.addLast(board.queuedBalls.removeFirst(3), (byte) 3);
              }
              if (var8 != 0) {
                nextChargedActivationCount = board.chargedActivationCount + 1;
                board.chargedActivationCount = board.chargedActivationCount + 1;
                if (1 == nextChargedActivationCount) {
                }
              }
            }
            regionExit1: {
              var8 = 1;
              if (board.buildTicks == 0) {
                var8 = 0;
              } else {
                if (this.playerCount != 1) {
                  for (var9_int = 0; board.brickGroups.length > var9_int; var9_int++) {
                    clearanceGroup = board.brickGroups[var9_int];
                    unusedClearanceGroupAlias = clearanceGroup;
                    unusedClearanceGroupReference = clearanceGroup;
                    clearanceBrick = (Brick) (clearanceGroup.first(obfuscationGuard - 91));
                    while (clearanceBrick != null) {
                      if ((1 << clearanceBrick.typeId & IntHistoryBuffer.field_m) != 0 &&
                        81920 <= clearanceBrick.y256) {
                        var8 = 0;
                        break regionExit1;
                      }
                      clearanceBrick = (Brick) (clearanceGroup.next((byte) 116));
                    }
                  }
                  break regionExit1;
                }
                var8 = 1;
              }
            }
            if (var8 != 0) {
              shiftedPath = (BrickMotionPath) (board.motionPaths.first(-120));
              while (shiftedPath != null) {
                pathWaypoints = shiftedPath.waypoints;
                waypoint = (MotionWaypoint) (pathWaypoints.first(-125));
                while (waypoint != null) {
                  waypoint.y256 = waypoint.y256 + 256;
                  waypoint = (MotionWaypoint) (pathWaypoints.next((byte) 116));
                }
                shiftedPath = (BrickMotionPath) (board.motionPaths.next((byte) 116));
              }
            }
            for (var9_int = 0; board.brickGroups.length > var9_int; var9_int++) {
              transitionGroup = board.brickGroups[var9_int];
              transitionBrick = (Brick) (transitionGroup.first(obfuscationGuard ^ -42));
              while (transitionBrick != null) {
                if (var8 != 0 &&
                  (5 & transitionBrick.flags) == 0) {
                  transitionBrick.y256 = transitionBrick.y256 + 256;
                }
                if (0 <= transitionBrick.pendingTypeId) {
                  nextTransitionTicks = transitionBrick.stateWord + 1;
                  transitionBrick.stateWord = transitionBrick.stateWord + 1;
                  if (nextTransitionTicks == 16) {
                    transitionBrick.transitionCode = 0;
                    transitionBrick.stateWord = 0;
                    if (0 == transitionBrick.pendingTypeId) {
                      transitionBrick.unlink((byte) 111);
                      if ((1 << transitionBrick.typeId & IntHistoryBuffer.field_m) != 0) {
                        board.countedBricks = board.countedBricks - 1;
                        board.lifeBrickClears = board.lifeBrickClears + 1;
                        board.progressBrickClears = board.progressBrickClears + 1;
                      }
                      if (TextFieldRenderer.field_A) {
                        WidgetLayer.a(transitionBrick.flags, 1, (byte) -95);
                      }
                    } else {
                      if (transitionBrick.typeId == 0) {
                        board.countedBricks = board.countedBricks + 1;
                      }
                      transitionBrick.typeId = transitionBrick.pendingTypeId;
                      transitionBrick.pendingTypeId = -1;
                    }
                  }
                }
                if ((4 & transitionBrick.flags) != 0) {
                  transitionBrick.interpolateMotion((byte) 58, true);
                  transitionBrick.segmentElapsedTicks = transitionBrick.segmentElapsedTicks + 1;
                  transitionBrick.motionElapsedTicks = transitionBrick.motionElapsedTicks + 1;
                  destinationWaypoint = transitionBrick.waypoints[transitionBrick.destinationWaypointIndex];
                  if (destinationWaypoint.durationTicks == transitionBrick.segmentElapsedTicks) {
                    transitionBrick.advanceMotionSegment(105);
                  }
                }
                transitionBrick = (Brick) (transitionGroup.next((byte) 116));
              }
            }
            queuedEffectBall = (Ball) (board.queuedBalls.first(-105));
            while (queuedEffectBall != null) {
              if (queuedEffectBall.phaseTicks > 0) {
                queuedEffectBall.phaseTicks = queuedEffectBall.phaseTicks - 1;
              }
              if (queuedEffectBall.penetrationTicks > 0) {
                queuedEffectBall.penetrationTicks = queuedEffectBall.penetrationTicks - 1;
              }
              queuedEffectBall = (Ball) (board.queuedBalls.next((byte) 116));
            }
            activeEffectBall = (Ball) (board.activeBalls.first(obfuscationGuard - 13));
            while (activeEffectBall != null) {
              activeEffectBall.centerXHistory256.append(-7255, activeEffectBall.x256 + activeEffectBall.radius256);
              activeEffectBall.centerYHistory256.append(-7255, activeEffectBall.y256 + activeEffectBall.radius256);
              if (activeEffectBall.phaseTicks > 0) {
                activeEffectBall.phaseTicks = activeEffectBall.phaseTicks - 1;
              }
              if (activeEffectBall.penetrationTicks > 0) {
                activeEffectBall.penetrationTicks = activeEffectBall.penetrationTicks - 1;
              }
              activeEffectBall = (Ball) (board.activeBalls.next((byte) 116));
            }
            if (paddle.reversedControlTicks > 0) {
              paddle.reversedControlTicks = paddle.reversedControlTicks - 1;
            }
            if (paddle.aftertouchTicks > 0) {
              paddle.aftertouchTicks = paddle.aftertouchTicks - 1;
            }
            if (0 < paddle.catchTicks) {
              paddle.catchTicks = paddle.catchTicks - 1;
            }
            if (var8 != 0) {
              remainingBuildTicks = board.buildTicks - 1;
              board.buildTicks = board.buildTicks - 1;
              if (remainingBuildTicks % 16 == 0) {
                buildRowColumns = (1 == this.playerCount) ? 13 : 7;
                var9_int = buildRowColumns;
                unusedBuildReference = null;
                for (var11 = 1; var11 <= var9_int; var11++) {
                  newRowBrick = new Brick(34 * var11 << 8, 4096, 0, 0, 0);
                  builtBrick = newRowBrick;
                  board.brickGroups[2].addLast(newRowBrick, (byte) 3);
                  builtBrick.pendingTypeId = 2;
                  builtBrick.transitionCode = 10;
                }
                for (var11 = 0; var11 < 3; var11++) {
                  overflowGroup = board.brickGroups[var11];
                  unusedOverflowGroupAlias = overflowGroup;
                  unusedOverflowGroupReference = overflowGroup;
                  overflowBrick = (Brick) (overflowGroup.first(-44));
                  while (overflowBrick != null) {
                    if ((1 & overflowBrick.flags) == 0 &&
                      81920 < overflowBrick.y256) {
                      overflowBrick.transitionCode = 7;
                      overflowBrick.pendingTypeId = 0;
                      overflowBrick.stateWord = 0;
                    }
                    overflowBrick = (Brick) (overflowGroup.next((byte) 116));
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
                stoppedPaddle = paddle;
                paddle.velocityY256 = 0;
                stoppedPaddle.velocityX256 = 0;
                for (var10 = 0; var10 < 3; var10++) {
                  interpolatedBrick = (Brick) (board.brickGroups[var10].first(-49));
                  while (interpolatedBrick != null) {
                    if ((interpolatedBrick.flags & 4) != 0) {
                      interpolatedBrick.interpolateMotion((byte) 119, true);
                    }
                    interpolatedBrick = (Brick) (board.brickGroups[var10].next((byte) 116));
                  }
                }
                boolean unusedLevelCompletionFlag = true;
                if (board.countedBricks == 0 &&
                  board.buildTicks == 0) {
                  board.stateTicks = 0;
                  board.levelsCleared = board.levelsCleared + 1;
                  board.levelsSinceBeneficialPickup = board.levelsSinceBeneficialPickup + 1;
                  board.lifeLevelClears = board.lifeLevelClears + 1;
                  if (1 == this.playerCount) {
                    board.addScore(250, false, 65280, paddle.y256 - 12800);
                  }
                  nextLevelIndex = board.levelIndex + 1;
                  board.levelIndex = board.levelIndex + 1;
                  if (nextLevelIndex >= this.configuration.getPeriod(obfuscationGuard - 125) &&
                    !this.configuration.repeats) {
                    if (this.playerCount != 1) {
                      board.boardState = 7;
                    } else {
                      board.boardState = 5;
                    }
                    unusedLevelCompletionFlag = false;
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
                unusedStatisticValue = 0;
                contactBall = (Ball) (board.activeBalls.first(-26));
                while (contactBall != null) {
                  ballStatistic = contactBall.brickBounceCount;
                  if (contactBall.brickBounceCount > var10) {
                    var10 = ballStatistic;
                  }
                  ballStatistic = contactBall.destroyedBrickStreak;
                  if (var11 < contactBall.destroyedBrickStreak) {
                    var11 = ballStatistic;
                  }
                  contactBall = (Ball) (board.activeBalls.next((byte) 116));
                }
                if (var10 <= 20 &&
                  15 >= var11) {
                  return;
                }
                board.choosePendingMessage(TextLineLayout.field_e, (byte) 75);
                return;
              }
              fallingPowerUp = (PowerUp) (board.fallingPowerUps.first(-119));
              while (fallingPowerUp != null) {
                fallingPowerUp.x256 = fallingPowerUp.x256 + fallingPowerUp.velocityX256 / 8;
                fallingPowerUp.y256 = fallingPowerUp.y256 + fallingPowerUp.velocityY256 / 8;
                if (fallingPowerUp.y256 > 122880) {
                  missedPowerUpBoard = (PlayerBoard) (board);
                  missedPowerUpExpressionGuard = 16387;
                  if (board.nextRandomBoundedInt(100, (byte) 62) > 50) {
                    missedPowerUpExpression = 4;
                  } else {
                    missedPowerUpExpression = 5;
                  }
                  ((PlayerBoard) (Object) missedPowerUpBoard).setBriefEyeExpression(missedPowerUpExpressionGuard, missedPowerUpExpression);
                  if (TextFieldRenderer.field_A) {
                    WidgetLayer.a(fallingPowerUp.typeId, 4, (byte) -110);
                  }
                  fallingPowerUp.unlink((byte) 111);
                } else {
                  if (paddle.resolveCircleCollision(fallingPowerUp, (byte) 25)) {
                    fallingPowerUp.unlink((byte) 111);
                    selfTargetedValue = (!fallingPowerUp.isSelfTargeted(false)) ? 0 : 1;
                    var11 = selfTargetedValue;
                    if (collectedPowerUps != null) {
                      collectedPowerUps.addLast(fallingPowerUp, (byte) 3);
                    }
                    if (this.playerCount == 1) {
                      beneficialBaseValue = var11;
                      if (fallingPowerUp.typeId != 13) {
                        slowDownValue = 0;
                      } else {
                        slowDownValue = 1;
                      }
                      var11 = beneficialBaseValue | slowDownValue;
                      pickupScoreBoard = (PlayerBoard) (board);
                      if (var11 != 0) {
                        pickupPoints = 100;
                      } else {
                        pickupPoints = 500;
                      }
                      ((PlayerBoard) (Object) pickupScoreBoard).addPaddleScore(pickupPoints, paddle, obfuscationGuard + 2);
                      if (var11 != 0) {
                        board.harmfulPowerUpStreak = 0;
                        board.levelsSinceBeneficialPickup = 0;
                        board.beneficialPowerUpStreak = board.beneficialPowerUpStreak + 1;
                      } else {
                        board.harmfulPowerUpStreak = board.harmfulPowerUpStreak + 1;
                        board.beneficialPowerUpStreak = 0;
                      }
                    }
                    if (TextFieldRenderer.field_A) {
                      WidgetLayer.a(fallingPowerUp.typeId, 3, (byte) -115);
                    }
                    if (audioEvents != null) {
                      audioEvents.addLast(new GameplayAudioEvent(3, fallingPowerUp.typeId), (byte) 3);
                    }
                    pickupMessageBoard = (PlayerBoard) (board);
                    if (1 >= this.playerCount &&
                      fallingPowerUp.typeId != 13 &&
                      var11 == 0) {
                      pickupMessages = WidgetTheme.lostBallMessages;
                    } else {
                      pickupMessages = TextLineLayout.field_e;
                    }
                    ((PlayerBoard) (Object) pickupMessageBoard).choosePendingMessage(pickupMessages, (byte) 75);
                  }
                }
                fallingPowerUp = (PowerUp) (board.fallingPowerUps.next((byte) 116));
              }
              paddle.x256 = paddle.x256 + paddle.velocityX256 / 8;
              if (paddle.leftBound256 > paddle.x256) {
                paddle.x256 = paddle.leftBound256;
              }
              if (-paddle.width256 + paddle.rightBound256 < paddle.x256) {
                paddle.x256 = -paddle.width256 + paddle.rightBound256;
              }
              if (paddle.aftertouchTicks > 0) {
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
                movingGroup = board.brickGroups[var10];
                movingBrick = (Brick) (movingGroup.first(-38));
                while (movingBrick != null) {
                  if (0 != (movingBrick.flags & 4) &&
                    1 < movingBrick.waypoints[movingBrick.destinationWaypointIndex].durationTicks) {
                    movingBrick.x256 = movingBrick.x256 + movingBrick.velocityX256 / 8;
                    movingBrick.y256 = movingBrick.y256 + movingBrick.velocityY256 / 8;
                  }
                  movingBrick = (Brick) (movingGroup.next((byte) 116));
                }
              }
              collidingBall = (Ball) (board.activeBalls.first(-122));
              while (collidingBall != null) {
                for (var11 = 0; var11 < 5; var11++) {
                  if (this.advanceBallSubstep(board, audioEvents, 8, -128, collidingBall)) {
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
              this.configuration.decodeLevel(new LobbyOverlayHelpers(), board.levelState, decodedPaths, board.levelIndex, (byte) -118, decodedGroups);
              board.installLevelBricks(decodedPaths, obfuscationGuard + 9, decodedGroups);
              board.resetServeWithRandomAngle(26496, false);
              if (this.playerCount == 1 &&
                0 < board.levelsCleared && (board.levelState.value == 0 ||
                var10 != board.levelState.value)) {
                board.backgroundChangePending = true;
              }
              if (board.levelsCleared != 0) {
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
              board.chargedActivationCount = 0;
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
              if (board.levelsCleared != 0) {
                for (var8 = 0; var8 < 3; var8++) {
                  introBrick = (Brick) (board.brickGroups[var8].first(-30));
                  while (introBrick != null) {
                    if (introBrick.pendingTypeId >= 0) {
                      nextIntroTransitionTicks = introBrick.stateWord + 1;
                      introBrick.stateWord = introBrick.stateWord + 1;
                      if (nextIntroTransitionTicks == 16) {
                        introBrick.transitionCode = 0;
                        introBrick.stateWord = 0;
                        introBrick.pendingTypeId = -1;
                      }
                    }
                    introBrick = (Brick) (board.brickGroups[var8].next((byte) 116));
                  }
                }
              }
              var8 = 0;
              if (this.playerCount == 1) {
                var8 = 125;
              } else {
                var8 = (board.levelsCleared == 0) ? 75 : 40;
              }
              nextIntroTicks = board.stateTicks + 1;
              board.stateTicks = board.stateTicks + 1;
              if (nextIntroTicks != var8) {
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
              nextServeDelayTicks = board.stateTicks + 1;
              board.stateTicks = board.stateTicks + 1;
              if (nextServeDelayTicks != 75) {
                if (this.playerCount != 1) {
                  return;
                }
                if (25 != board.stateTicks) {
                  return;
                }
              }
              board.pendingMessage = SecondaryNodeQueue.field_c;
              messageBoard = (PlayerBoard) (board);
              if (board.messageTicks > 25) {
                clippedMessageTicks = 25;
              } else {
                clippedMessageTicks = board.messageTicks;
              }
              messageBoard.messageTicks = clippedMessageTicks;
              board.boardState = 2;
              board.stateTicks = 0;
              return;
            }
            if (board.boardState == 3) {
              nextDefeatTicks = board.stateTicks + 1;
              board.stateTicks = board.stateTicks + 1;
              if (nextDefeatTicks != 350) {
                return;
              }
              board.stateTicks = 0;
              board.boardState = 8;
              return;
            }
            if (board.boardState != 5) {
              return;
            }
            nextVictoryTicks = board.stateTicks + 1;
            board.stateTicks = board.stateTicks + 1;
            if (nextVictoryTicks == 350) {
              board.stateTicks = 0;
              board.boardState = 9;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("ak.F(");
          if (board == null) {
            boardSummary = "null";
          } else {
            boardSummary = "{...}";
          }
          audioContextBuilder = ((StringBuilder) (Object) contextBuilder).append(boardSummary).append(',');
          if (audioEvents == null) {
            audioSummary = "null";
          } else {
            audioSummary = "{...}";
          }
          collectedContextBuilder = ((StringBuilder) (Object) audioContextBuilder).append(audioSummary).append(',');
          if (collectedPowerUps == null) {
            collectedSummary = "null";
          } else {
            collectedSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) collectedContextBuilder).append(collectedSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != -19537) {
          field_e = (String) null;
        }
    }

    private final void scanBallCollisions(Ball ball, int obfuscationGuard, PlayerBoard board) {
        int groupIndex = 0;
        NodeDeque bricks = null;
        Brick brick = null;
        int unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          DisplayModeInfo.resetCollisionSelection(obfuscationGuard);
          for (groupIndex = -1 + board.brickGroups.length; groupIndex > -1; groupIndex--) {
            bricks = board.brickGroups[groupIndex];
            brick = (Brick) (bricks.last(~obfuscationGuard));
            while (brick != null) {
              brick.resolveCircleCollision(ball, (byte) 119);
              brick = (Brick) (bricks.previous(-126));
            }
            if (GameClock.collisionBody != null) {
              break;
            }
          }
          board.paddle.resolveCircleCollision(ball, (byte) 110);
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "ak.J(" + (ball != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + (board != null ? "{...}" : "null") + ')');
        }
    }

    final int getWrappedPositionInversionMask(int obfuscationGuard) {
        int playerIndex = 0;
        int inversionMask;
        int wrapSpan;
        int position;
        int neighborsVisited;
        int nextPlayer;
        int nextPosition;
        int unusedGameFlag;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        inversionMask = 0;
        wrapSpan = 30 * this.playerCount;
        if (obfuscationGuard <= 120) {
          return -109;
        }
        for (playerIndex = 0; playerIndex < this.playerCount; playerIndex++) {
          if (((this.playerMaskOne | (this.playerMaskThree | this.playerMaskTwo)) & 1 << playerIndex) == 0) {
            position = this.playerBoards[playerIndex].positionWord + this.playerBoards[playerIndex].boardOffset;
            neighborsVisited = 0;
            nextPlayer = (playerIndex + 1) % this.playerCount;
            while (this.playerCount - 1 > neighborsVisited) {
              if ((1 << nextPlayer & (this.playerMaskThree | this.playerMaskTwo | this.playerMaskOne)) != 0) {
                nextPlayer++;
                nextPlayer = nextPlayer % this.playerCount;
                neighborsVisited++;
                continue;
              }
              nextPosition = this.playerBoards[nextPlayer].boardOffset + this.playerBoards[nextPlayer].positionWord;
              if (nextPlayer < playerIndex) {
                nextPosition = nextPosition + wrapSpan;
              }
              if (nextPosition >= position) {
                break;
              }
              inversionMask = inversionMask | 1 << nextPlayer;
              break;
            }
          }
        }
        return inversionMask;
    }

    final void applyPendingPowerUps(byte obfuscationGuard, int playerId) {
        PlayerBoard board;
        PowerUp powerUp;
        int unusedGameFlag;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
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

    private final boolean advanceBallSubstep(PlayerBoard board, NodeDeque audioEvents, int substepDivisor, int obfuscationGuard, Ball ball) {
        boolean remainingFlagOneContact = false;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String boardSummary = null;
        StringBuilder audioContextBuilder = null;
        String audioSummary = null;
        StringBuilder ballContextBuilder = null;
        String ballSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        int soundCode = 0;
        int unusedGameFlag = 0;
        Brick contactBrick = null;
        Brick remainingBrick = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          ball.x256 = ball.x256 + ball.velocityX256 / substepDivisor;
          ball.y256 = ball.y256 + ball.velocityY256 / substepDivisor;
          if (122880 < ball.y256) {
            ball.unlink((byte) 111);
            if (audioEvents != null) {
              audioEvents.addLast(new GameplayAudioEvent(7), (byte) 3);
            }
            if (board.activeBalls.isEmpty(false) &&
              board.queuedBalls.isEmpty(false)) {
              if (1 == this.playerCount && (!TextFieldRenderer.field_A ||
                0 != this.configuration.pack.packId ||
                !(0 >= board.levelIndex))) {
                board.lives = board.lives - 1;
              }
              if (board.lives <= 0) {
                board.setBriefEyeExpression(16387, 3);
                board.beginDefeatTransition((byte) 22);
              } else {
                if (3 != board.eyeExpression) {
                  if (board.eyeExpression == 6) {
                    board.setEyeExpression(7, true, 150);
                  } else {
                    board.setEyeExpression(3, true, 150);
                  }
                } else {
                  board.setEyeExpression(6, true, 150);
                }
                if (TextFieldRenderer.field_A) {
                  WidgetLayer.a(0, 5, (byte) -124);
                }
                board.resetServeWithRandomAngle(26496, true);
                board.stateTicks = 0;
                board.boardState = 4;
              }
              board.choosePendingMessage(WidgetTheme.lostBallMessages, (byte) 75);
              return false;
            }
            board.setBriefEyeExpression(16387, 2);
            return false;
          }
          this.scanBallCollisions(ball, -1, board);
          if (obfuscationGuard > -125) {
            return false;
          }
          if (null != GameClock.collisionBody) {
            if (TextFieldRenderer.field_A) {
              if (ValidationIconWidget.field_N) {
                if (!AlternateNumericLoginCredentials.field_s &&
                  ball.contactCount == 39) {
                  WidgetLayer.a(0, 6, (byte) -108);
                }
              } else {
                ball.contactCount = 0;
              }
            }
            if (39 == ball.contactCount &&
              audioEvents != null) {
              audioEvents.addLast(new GameplayAudioEvent(5), (byte) 3);
            }
            if (board.paddle == GameClock.collisionBody) {
              if (board.paddle.catchTicks > 0) {
                if (audioEvents != null) {
                  audioEvents.addLast(new GameplayAudioEvent(10), (byte) 3);
                }
                board.paddle.onCircleContact((byte) 53, board, ball);
                ball.centerXHistory256.latestIndex = -1;
                ball.contactCount = 0;
                ball.centerYHistory256.latestIndex = -1;
                board.queuedBalls.addLast(ball, (byte) 3);
                return false;
              }
              if (audioEvents != null) {
                audioEvents.addLast(new GameplayAudioEvent(0), (byte) 3);
              }
              board.paddle.onCircleContact((byte) 53, board, ball);
              ball.destroyedBrickStreak = 0;
            } else {
              GameClock.collisionBody.onCircleContact((byte) 53, board, ball);
              contactBrick = (Brick) (GameClock.collisionBody);
              if (audioEvents != null) {
                boolean unusedSoundBranchRemainder = true;
                soundCode = 1;
                if ((contactBrick.flags & 1) == 0) {
                  if (contactBrick.typeId != 28) {
                    if (contactBrick.typeId != 25) {
                      if (contactBrick.typeId != 1 &&
                        contactBrick.typeId != 21 &&
                        22 != contactBrick.typeId) {
                        if (26 == contactBrick.typeId &&
                          contactBrick.pendingTypeId != 27) {
                          soundCode = 11;
                        } else {
                          if (19 == contactBrick.typeId &&
                            IntegerValidationHelpers.collisionFace != 1) {
                            soundCode = 11;
                          } else {
                            if (contactBrick.typeId == 20 &&
                              IntegerValidationHelpers.collisionFace != 2) {
                              soundCode = 11;
                            } else {
                              if (((contactBrick.typeId == 27)) &&
                                ((contactBrick.pendingTypeId != 26))) {
                                soundCode = 12;
                              }
                            }
                          }
                        }
                        unusedSoundBranchRemainder = false;
                      }
                      else {
                        soundCode = 11;
                      }
                    } else {
                      soundCode = 9;
                    }
                  } else {
                    soundCode = 8;
                  }
                } else {
                  soundCode = 2;
                }
                if (0 == ball.phaseTicks ||
                  0 != (1 << contactBrick.typeId & EmailValidator.alwaysSolidBrickTypeMask)) {
                  audioEvents.addLast(new GameplayAudioEvent(soundCode), (byte) 3);
                }
              }
              if (ball.phaseTicks == 0 &&
                contactBrick.pendingTypeId == 0) {
                if (1 == this.playerCount) {
                  board.addBrickScore(10 + ball.destroyedBrickStreak, contactBrick, 2);
                }
                ball.destroyedBrickStreak = ball.destroyedBrickStreak + 1;
              }
            }
          }
          this.scanBallCollisions(ball, -1, board);
          if (GameClock.collisionBody == null) {
            return false;
          }
          if (ball.phaseTicks == 0) {
            return true;
          }
          if (GameClock.collisionBody == board.paddle) {
            return true;
          }
          remainingBrick = (Brick) (GameClock.collisionBody);
          remainingFlagOneContact = ((1 & remainingBrick.flags) != 0);
          return remainingFlagOneContact;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("ak.B(");
          if (board == null) {
            boardSummary = "null";
          } else {
            boardSummary = "{...}";
          }
          audioContextBuilder = ((StringBuilder) (Object) contextBuilder).append(boardSummary).append(',');
          if (audioEvents == null) {
            audioSummary = "null";
          } else {
            audioSummary = "{...}";
          }
          ballContextBuilder = ((StringBuilder) (Object) audioContextBuilder).append(audioSummary).append(',').append(substepDivisor).append(',').append(obfuscationGuard).append(',');
          if (ball == null) {
            ballSummary = "null";
          } else {
            ballSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) ballContextBuilder).append(ballSummary).append(')').toString());
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
          if (FriendListUi.a(remainingPlayerMask, (byte) -6)) {
            this.lastRemainingPlayerId = IntegerBitLengthHelpers.unsignedBitLength(9, remainingPlayerMask - 1);
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
