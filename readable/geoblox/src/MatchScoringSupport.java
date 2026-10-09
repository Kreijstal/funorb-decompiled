/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchScoringSupport {
    static int frameLoopRateEstimate;
    static String okText;
    static Sprite selectedThemeForeground;
    static String[] instructionParagraphs;
    static int accountDialogPointerOriginX;

    final static void resendScoreAndHighscoreRequests(int methodGuard, int packetOpcode) {
        int guardResidue = 0;
        int unusedClientControlSnapshot = 0;
        ScoreSubmission pendingScoreSubmission = null;
        HighscoreQuery pendingHighscoreQuery = null;
        RuntimeException caughtResendFailure = null;
        RuntimeException resendFailureForContext = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          guardResidue = 57 % ((methodGuard - 57) / 46);
          pendingScoreSubmission = (ScoreSubmission) ((Object) TriangleMesh.pendingScoreSubmissions.firstForIteration(0));
          while (pendingScoreSubmission != null) {
            ArchiveIndex.writeScoreSubmission(pendingScoreSubmission, packetOpcode, -127);
            pendingScoreSubmission = (ScoreSubmission) ((Object) TriangleMesh.pendingScoreSubmissions.nextForIteration(1));
          }
          pendingHighscoreQuery = (HighscoreQuery) ((Object) ResourceArchive.pendingHighscoreQueries.firstForIteration(0));
          while (pendingHighscoreQuery != null) {
            DebouncedValidationProvider.writeHighscoreRequest(packetOpcode, 5, pendingHighscoreQuery);
            pendingHighscoreQuery = (HighscoreQuery) ((Object) ResourceArchive.pendingHighscoreQueries.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException resendFailure) {
          caughtResendFailure = resendFailure;
          resendFailureForContext = caughtResendFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) resendFailureForContext), "ec.C(" + methodGuard + ',' + packetOpcode + ')');
        }
    }

    final static boolean processMatchCandidates(int methodGuard) {
        RuntimeException caughtMatchFailure = null;
        int sortInsertionIndex = 0;
        RuntimeException matchFailureForContext = null;
        int sortCursorThenFirstEntityId = 0;
        int packedCandidateThenSecondEntityId = 0;
        int thirdEntityId = 0;
        GameplayEntity firstMatchedEntity = null;
        GameplayEntity secondMatchedEntity = null;
        GameplayEntity thirdMatchedEntity = null;
        int awardedPoints = 0;
        GameplayEntity firstBlockedEntity = null;
        int popupX = 0;
        GameplayEntity secondBlockedEntity = null;
        int popupY = 0;
        int controlFlowGuard = 0;
        int candidateIndex = 0;
        int sortInsertionIndexLiteralPhase1;
        int sortCursorThenFirstEntityIdLiteralPhase1;
        int packedCandidateThenSecondEntityIdLiteralPhase1;
        int popupXLiteralPhase1;
        int popupYLiteralPhase1;
        controlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (0 == EmailAvailabilityQuery.matchCandidateCount &&
              0 < AttachmentPointerState.newAttachmentCount) {
            if (SessionSocketSupport.avatarShockPending) {
              return false;
            }
            EntityCollisionSupport.matchChainLength = 0;
            if (UiWidget.gameplaySession.pointsPanelX == 463) {
              UiWidget.gameplaySession.pointsPanelSlideDirection = 1;
              UiWidget.gameplaySession.emitPointsPopup(false);
            }
            return false;
          }
          if (EmailAvailabilityQuery.matchCandidateCount == 0) {
            return false;
          }
          if (EntityCollisionSupport.matchChainLength >= 5) {
            SecondaryNodeDeque.recordAchievement(MultiHandleSliderRenderer.fiveMatchChainAchievementId ^ 255, -99, MultiHandleSliderRenderer.fiveMatchChainAchievementId);
          }
          if (EntityCollisionSupport.matchChainLength >= 6) {
            SecondaryNodeDeque.recordAchievement(LoginPayloadKind.sixMatchChainAchievementId ^ 255, -57, LoginPayloadKind.sixMatchChainAchievementId);
          }
          if (EntityCollisionSupport.matchChainLength >= 7) {
            SecondaryNodeDeque.recordAchievement(255 ^ IntrusiveDeque.sharedAchievementId, -97, IntrusiveDeque.sharedAchievementId);
          }
          for (sortInsertionIndex = 1; sortInsertionIndex < EmailAvailabilityQuery.matchCandidateCount; sortInsertionIndex++) {
            sortCursorThenFirstEntityId = sortInsertionIndex - 1;
            packedCandidateThenSecondEntityId = TextPairLoginPayload.packedMatchCandidates[sortInsertionIndex];
            while (sortCursorThenFirstEntityId >= 0) {
              if (TextPairLoginPayload.packedMatchCandidates[sortCursorThenFirstEntityId] > packedCandidateThenSecondEntityId) {
                TextPairLoginPayload.packedMatchCandidates[1 + sortCursorThenFirstEntityId] = TextPairLoginPayload.packedMatchCandidates[sortCursorThenFirstEntityId];
                sortCursorThenFirstEntityId--;
                continue;
              }
              break;
            }
            TextPairLoginPayload.packedMatchCandidates[1 + sortCursorThenFirstEntityId] = packedCandidateThenSecondEntityId;
          }
          if (methodGuard != -18913) {
            MatchScoringSupport.processMatchCandidates(-33);
          }
          candidateIndex = 0;
          sortInsertionIndexLiteralPhase1 = candidateIndex;
          while (candidateIndex < EmailAvailabilityQuery.matchCandidateCount) {
            if (-1 + EmailAvailabilityQuery.matchCandidateCount > candidateIndex &&
                TextPairLoginPayload.packedMatchCandidates[candidateIndex] == TextPairLoginPayload.packedMatchCandidates[candidateIndex + 1]) {
              TextPairLoginPayload.packedMatchCandidates[candidateIndex] = 0;
            } else {
              sortCursorThenFirstEntityIdLiteralPhase1 = (TextPairLoginPayload.packedMatchCandidates[candidateIndex] & 1072693248) >> 20;
              packedCandidateThenSecondEntityIdLiteralPhase1 = TextPairLoginPayload.packedMatchCandidates[candidateIndex] >> 10 & 1023;
              thirdEntityId = 1023 & TextPairLoginPayload.packedMatchCandidates[candidateIndex];
              firstMatchedEntity = RasterTargetSnapshot.entitiesById[sortCursorThenFirstEntityIdLiteralPhase1];
              secondMatchedEntity = RasterTargetSnapshot.entitiesById[packedCandidateThenSecondEntityIdLiteralPhase1];
              thirdMatchedEntity = RasterTargetSnapshot.entitiesById[thirdEntityId];
              if (firstMatchedEntity.matchCooldownTicks <= 0 &&
                  secondMatchedEntity.matchCooldownTicks <= 0 &&
                  thirdMatchedEntity.matchCooldownTicks <= 0) {
                ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[31]);
                EntityCollisionSupport.matchChainLength = EntityCollisionSupport.matchChainLength + 1;
                if (EntityCollisionSupport.matchChainLength > 1) {
                  UiWidget.gameplaySession.pointsPanelSlideDirection = -1;
                }
                if (-1073741824 == (-1073741824 & TextPairLoginPayload.packedMatchCandidates[candidateIndex])) {
                  awardedPoints = 90 * EntityCollisionSupport.matchChainLength;
                  SecondaryNodeDeque.recordAchievement(MessageDialogSupport.specialMatchAchievementId ^ 255, -100, MessageDialogSupport.specialMatchAchievementId);
                } else {
                  awardedPoints = 30 * EntityCollisionSupport.matchChainLength;
                }
                popupX = 0;
                popupXLiteralPhase1 = (int)firstMatchedEntity.positionX;
                popupY = 0;
                popupYLiteralPhase1 = (int)firstMatchedEntity.positionY;
                ScorePopupSupport.spawnScorePopup(awardedPoints, true, popupYLiteralPhase1, EntityCollisionSupport.matchChainLength, popupXLiteralPhase1);
                TextPairLoginPayload.packedMatchCandidates[candidateIndex] = 0;
              } else {
                firstBlockedEntity = firstMatchedEntity;
                secondBlockedEntity = secondMatchedEntity;
                thirdMatchedEntity.entityQueue = null;
                secondBlockedEntity.entityQueue = null;
                firstBlockedEntity.entityQueue = null;
                TextPairLoginPayload.packedMatchCandidates[candidateIndex] = 0;
              }
            }
            candidateIndex++;
          }
          EmailAvailabilityQuery.matchCandidateCount = 0;
          return true;
        } catch (java.lang.RuntimeException matchFailure) {
          caughtMatchFailure = matchFailure;
          matchFailureForContext = caughtMatchFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) matchFailureForContext), "ec.A(" + methodGuard + ')');
        }
    }

    final static void handleByteShortReply(int methodGuard) {
        ByteShortQuery pendingByteShortQuery = (ByteShortQuery) ((Object) UiWidget.pendingByteShortQueries.firstForIteration(methodGuard ^ methodGuard));
        if (pendingByteShortQuery == null) {
            Bzip2DecoderState.closeSessionSocket((byte) -122);
            return;
        }
        PacketBuffer incomingPacket = LogoCompositor.sessionPacketBuffer;
        incomingPacket.readIntBE((byte) -102);
        incomingPacket.readIntBE((byte) -108);
        incomingPacket.readIntBE((byte) -71);
        incomingPacket.readIntBE((byte) -83);
        pendingByteShortQuery.unlinkNode(false);
    }

    public static void releaseStaticReferences(boolean preserveInitialOkTextGuard) {
        if (!preserveInitialOkTextGuard) {
            okText = (String) null;
        }
        selectedThemeForeground = null;
        okText = null;
        instructionParagraphs = null;
    }

    static {
        frameLoopRateEstimate = 0;
        okText = "OK";
        instructionParagraphs = new String[]{"At any point in the game, you can press the <img=4> key on the top-left of your keyboard to pause the game and bring up the menu from which you can access these instructions.<br><br><br><br>Press the <img=0> and <img=1> arrow keys to rotate the game area anticlockwise and clockwise. You can reverse the directions by pressing <img=7> at any point during the game. If you want to make the next geoblox fall faster, press and hold the <img=6> arrow key.", "Connect falling geoblox into threes, by colour, shape, or colour and shape to score points. Geoblox are considered to be connected when there is no black line between them. If there is a black line, your geoblox are not close enough.<br><br>The geoblox plummet towards your avatar from the outside of the play area. They will stick to the first thing they hit. By getting three of a kind, by colour, shape, or colour and shape, they will disappear and earn you points. Special geoblox, which behave differently, appear later in the game.<br>Once the stacked geoblox reach the edge of the play area, you lose.", "The sequence bonus is awarded for clearing more than one set of geoblox in a row. For clearing two sets of geoblox in a row, the points awarded will be doubled; for clearing three sets in a row, the points awarded will be tripled, and so on. The bonus only applies to an uninterrupted sequence.<br><br>There's a bonus for clearing the avatar of geoblox. Once you reach the end of a stage (the countdown is in the bottom-right of the screen), a bonus bubble will appear. It shrinks from the outer edge of the game area until it touches a geoblox. The longer it takes to reach a geoblox, the higher your reward!", "Special geoblox only crop up in the latter parts of the game, so don't worry about them early on.<br><br><shad=AAAAAA>The amorphous geoblox:</shad> This blob in a jar has a fixed colour, but will assume the shape of the first geoblox it hits. These will only disappear when you connect them to two others of the same colour.<br><br><shad=AAAAAA>The chromatic geoblox:</shad> This has a shape, but no colour. It will assume the colour of the first normal geoblox it hits. These will only disappear when you connect them to two others of the same shape.", "<shad=AAAAAA>The black orb:</shad> Malignant and lazy, this geoblox does nothing but get in your way. Destroy them by using a silver star for a whopping 100 points each! There are no points for stacking them, as they will not react.<br><br><shad=AAAAAA>The silver star:</shad> This star reacts if it comes into contact with your avatar. It unleashes an electric shock that destroys all geoblox touching the avatar, including black orbs. Until then, it's a bit useless! Don't try stacking them as they will just sit there."};
    }
}
