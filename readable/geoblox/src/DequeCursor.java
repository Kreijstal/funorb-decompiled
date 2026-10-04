/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DequeCursor {
    static ArchiveCatalog archiveCatalog;
    static int logoAnimationTick;
    static int difficultyAdvancesInCurrentTheme;
    static int fourthScoreContextCounter;
    private IntrusiveDeque deque;
    private IntrusiveNode pendingNode;
    static int pendingTooltipAnchorY;

    final static boolean updateIntroAnimation(int openingSoundTick) {
        boolean introCompletedBeforeReturn = false;
        RuntimeException caughtIntroFailure = null;
        float introTintProgress = 0.0f;
        RuntimeException introFailureForContext = null;
        int faceHalfWidth = 0;
        int geometryTravelDistance = 0;
        int unusedClientControlSnapshot = 0;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (MatchingTextValidator.introAnimationTick == openingSoundTick) {
            ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[25]);
          }
          MatchingTextValidator.introAnimationTick = MatchingTextValidator.introAnimationTick + 1;
          while (UiFontResources.pollKeyboardEvent(93)) {
            if (SessionTextHistorySupport.currentKeyboardEventCode != 13) {
              continue;
            }
            return true;
          }
          if ((0 == MatchingTextValidator.introAnimationTick % 40) &&
              (CachedTextLayout.introFaceFrameIndex < 11)) {
            UnderlinedButtonRenderer.introFaceFrameStartTick = MatchingTextValidator.introAnimationTick;
            CachedTextLayout.introFaceFrameIndex = CachedTextLayout.introFaceFrameIndex + 1;
            if (10 == CachedTextLayout.introFaceFrameIndex) {
              ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[26]);
            }
          }
          introTintProgress = -((480.0f - (float)MatchingTextValidator.introAnimationTick) / 480.0f) + 1.0f;
          if (11 > CachedTextLayout.introFaceFrameIndex) {
            WidgetSkinState.introFaceModulationRgb = ((int)(introTintProgress * MenuScreen.introTintGreenDelta) << 8) + (DiskCacheWorker.avatarTintPalette[0] + ((int)(introTintProgress * TextLayoutLine.introTintRedDelta) << 16)) + (int)(SocketArchiveNetworkClient.introTintBlueDelta * introTintProgress);
          }
          faceHalfWidth = RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].fullWidth >> 1;
          geometryTravelDistance = MatchingTextValidator.introAnimationTick << 2;
          if ((!SharedBufferPools.introFirstGeometrySoundPlayed) &&
              (-geometryTravelDistance + 900 <= 320 + faceHalfWidth)) {
            ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[7]);
            SharedBufferPools.introFirstGeometrySoundPlayed = true;
          }
          if ((!EntityMotionSupport.introSecondGeometrySoundPlayed) &&
              (-faceHalfWidth + (320 - AccountCreationForm.introGeometryFrames[1].fullWidth) <= -1200 + geometryTravelDistance)) {
            ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[8]);
            EntityMotionSupport.introSecondGeometrySoundPlayed = true;
          }
          introCompletedBeforeReturn = !(494 > MatchingTextValidator.introAnimationTick);
          return introCompletedBeforeReturn;
        } catch (java.lang.RuntimeException introFailure) {
          caughtIntroFailure = introFailure;
          introFailureForContext = caughtIntroFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) introFailureForContext), "gb.A(" + openingSoundTick + ')');
        }
    }

    final IntrusiveNode beginForward(byte methodGuard) {
        IntrusiveNode firstNode = this.deque.sentinel.nextNode;
        if (firstNode == this.deque.sentinel) {
            this.pendingNode = null;
            return null;
        }
        if (methodGuard == 88) {
            this.pendingNode = firstNode.nextNode;
            return firstNode;
        }
        fourthScoreContextCounter = -4;
        this.pendingNode = firstNode.nextNode;
        return firstNode;
    }

    final IntrusiveNode beginReverse(int methodGuard) {
        IntrusiveNode lastNode = this.deque.sentinel.previousNode;
        if (!(this.deque.sentinel != lastNode)) {
            this.pendingNode = null;
            return null;
        }
        if (methodGuard == 1) {
            this.pendingNode = lastNode.previousNode;
            return lastNode;
        }
        this.nextForward((byte) 55);
        this.pendingNode = lastNode.previousNode;
        return lastNode;
    }

    final IntrusiveNode nextReverse(int methodGuard) {
        IntrusiveNode node = this.pendingNode;
        if (node == this.deque.sentinel) {
            this.pendingNode = null;
            return null;
        }
        this.pendingNode = node.previousNode;
        if (methodGuard == 26) {
            return node;
        }
        return (IntrusiveNode) null;
    }

    final static int pollAccountDialogAction(int noPendingActionCode) {
        int pendingAction = 0;
        RuntimeException actionFailureForContext = null;
        int clientControlFlowGuard = 0;
        int pendingActionBeforeReturn = 0;
        int loginActionBeforeReturn = 0;
        int usernameActionBeforeReturn = 0;
        int emailActionBeforeReturn = 0;
        int createAccountActionBeforeReturn = 0;
        int noActionBeforeReturn = 0;
        RuntimeException caughtActionFailure = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          ClientFlowState.accountDialogLayer.processPointerFrame(true, 127, MatchScoringSupport.accountDialogPointerOriginX, TextConcatenationSupport.accountDialogPointerOriginY);
          ClientFlowState.accountDialogLayer.advanceDialogAnimations(-65);
          while (UiFontResources.pollKeyboardEvent(77)) {
            ClientFlowState.accountDialogLayer.dispatchKeyInputOrRequestFocus((byte) 105, GameAudioState.currentKeyboardEventCharacter, SessionTextHistorySupport.currentKeyboardEventCode);
          }
          if (GzipInflater.pendingLoginUiAction != noPendingActionCode) {
            pendingAction = GzipInflater.pendingLoginUiAction;
            MidiNote.setPendingLoginUiAction(-1, false);
            pendingActionBeforeReturn = pendingAction;
            return pendingActionBeforeReturn;
          }
          if (MeshPrioritySupport.messageDialogUiFlowActive) {
            loginActionBeforeReturn = 3;
            return loginActionBeforeReturn;
          }
          if (WidgetSkinState.usernameQueryFlowState == IntrusiveDeque.pendingClientFlowToken) {
            usernameActionBeforeReturn = 1;
            return usernameActionBeforeReturn;
          }
          if (!EntityContactSupport.activeEmailAvailabilityQuery.isCompleted(-106)) {
            emailActionBeforeReturn = 1;
            return emailActionBeforeReturn;
          }
          if (ClientFlowState.accountCreationFlowState != IntrusiveDeque.pendingClientFlowToken) {
            noActionBeforeReturn = -1;
            return noActionBeforeReturn;
          }
          createAccountActionBeforeReturn = 2;
          return createAccountActionBeforeReturn;
        } catch (java.lang.RuntimeException actionFailure) {
          caughtActionFailure = actionFailure;
          actionFailureForContext = caughtActionFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) actionFailureForContext), "gb.B(" + noPendingActionCode + ')');
        }
    }

    final IntrusiveNode beginReverseAt(IntrusiveNode node, byte methodGuard) {
        IntrusiveNode startNode = null;
        RuntimeException reverseCursorFailure = null;
        int guardResidue = 0;
        Object emptyResult = null;
        IntrusiveNode returnedNode = null;
        RuntimeException reverseFailureBeforeContext = null;
        StringBuilder reverseFailureContextBuilder = null;
        String nodeContextDescription = null;
        RuntimeException caughtReverseCursorException = null;
        try {
          if (node == null) {
            startNode = this.deque.sentinel.previousNode;
          } else {
            startNode = node;
          }
          if (this.deque.sentinel == startNode) {
            this.pendingNode = null;
            emptyResult = null;
            return (IntrusiveNode) (emptyResult);
          }
          guardResidue = 59 / ((methodGuard - 85) / 38);
          this.pendingNode = startNode.previousNode;
          returnedNode = startNode;
          return returnedNode;
        } catch (java.lang.RuntimeException caughtReverseCursorFailure) {
          caughtReverseCursorException = caughtReverseCursorFailure;
          reverseCursorFailure = caughtReverseCursorException;
          reverseFailureBeforeContext = reverseCursorFailure;
          reverseFailureContextBuilder = new StringBuilder().append("gb.F(");
          if (node == null) {
            nodeContextDescription = "null";
          } else {
            nodeContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) reverseFailureBeforeContext), ((StringBuilder) (Object) reverseFailureContextBuilder).append(nodeContextDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        int guardQuotient = -66 / ((33 - methodGuard) / 32);
        archiveCatalog = null;
    }

    final static void a(String param0, byte param1) {
        int var2 = -10 / ((58 - param1) / 41);
        System.out.println("Error: " + TextTemplateDefinition.a(param0, "\n", true, "%0a"));
    }

    DequeCursor(IntrusiveDeque deque) {
        try {
            this.deque = deque;
        } catch (RuntimeException cursorConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) cursorConstructionFailure), "gb.<init>(" + (deque != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode nextForward(byte methodGuard) {
        IntrusiveNode node = this.pendingNode;
        if (methodGuard <= 105) {
            return (IntrusiveNode) null;
        }
        if (!(node != this.deque.sentinel)) {
            this.pendingNode = null;
            return null;
        }
        this.pendingNode = node.nextNode;
        return node;
    }

    final IntrusiveNode beginForwardAt(byte methodGuard, IntrusiveNode node) {
        IntrusiveNode startNode = null;
        RuntimeException forwardCursorFailure = null;
        Object emptyResult = null;
        IntrusiveNode returnedNode = null;
        RuntimeException forwardFailureBeforeContext = null;
        StringBuilder forwardFailureContextBuilder = null;
        String nodeContextDescription = null;
        RuntimeException caughtForwardCursorException = null;
        try {
          if (node != null) {
            startNode = node;
          } else {
            startNode = this.deque.sentinel.nextNode;
          }
          if (methodGuard != 56) {
            this.beginReverse(-60);
          }
          if (this.deque.sentinel == startNode) {
            this.pendingNode = null;
            emptyResult = null;
            return (IntrusiveNode) (emptyResult);
          }
          this.pendingNode = startNode.nextNode;
          returnedNode = startNode;
          return returnedNode;
        } catch (java.lang.RuntimeException caughtForwardCursorFailure) {
          caughtForwardCursorException = caughtForwardCursorFailure;
          forwardCursorFailure = caughtForwardCursorException;
          forwardFailureBeforeContext = forwardCursorFailure;
          forwardFailureContextBuilder = new StringBuilder().append("gb.J(").append(methodGuard).append(',');
          if (node == null) {
            nodeContextDescription = "null";
          } else {
            nodeContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) forwardFailureBeforeContext), ((StringBuilder) (Object) forwardFailureContextBuilder).append(nodeContextDescription).append(')').toString());
        }
    }

    static {
        pendingTooltipAnchorY = -1;
    }
}
