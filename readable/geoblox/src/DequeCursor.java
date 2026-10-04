/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DequeCursor {
    static ArchiveCatalog archiveCatalog;
    static int logoAnimationTick;
    static int field_c;
    static int field_g;
    private IntrusiveDeque deque;
    private IntrusiveNode pendingNode;
    static int field_e;

    final static boolean b(int param0) {
        boolean stackIn_25_0 = false;
        RuntimeException decompiledCaughtException = null;
        float var1_float = 0.0f;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Geoblox.clientControlFlowFlag;
        try {
          if (MatchingTextValidator.field_j == param0) {
            ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[25]);
          }
          MatchingTextValidator.field_j = MatchingTextValidator.field_j + 1;
          while (UiFontResources.pollKeyboardEvent(93)) {
            if (SessionTextHistorySupport.currentKeyboardEventCode != 13) {
              continue;
            }
            return true;
          }
          if ((0 == MatchingTextValidator.field_j % 40) &&
              (CachedTextLayout.field_h < 11)) {
            UnderlinedButtonRenderer.field_c = MatchingTextValidator.field_j;
            CachedTextLayout.field_h = CachedTextLayout.field_h + 1;
            if (10 == CachedTextLayout.field_h) {
              ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[26]);
            }
          }
          var1_float = -((480.0f - (float)MatchingTextValidator.field_j) / 480.0f) + 1.0f;
          if (11 > CachedTextLayout.field_h) {
            WidgetSkinState.field_j = ((int)(var1_float * MenuScreen.introTintGreenDelta) << 8) + (DiskCacheWorker.avatarTintPalette[0] + ((int)(var1_float * TextLayoutLine.field_b) << 16)) + (int)(SocketArchiveNetworkClient.field_x * var1_float);
          }
          var2 = RasterTargetSnapshot.introFaceFrames[CachedTextLayout.field_h].fullWidth >> 1;
          var3 = MatchingTextValidator.field_j << 2;
          if ((!SharedBufferPools.introFirstGeometrySoundPlayed) &&
              (-var3 + 900 <= 320 + var2)) {
            ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[7]);
            SharedBufferPools.introFirstGeometrySoundPlayed = true;
          }
          if ((!EntityMotionSupport.field_d) &&
              (-var2 + (320 - AccountCreationForm.introGeometryFrames[1].fullWidth) <= -1200 + var3)) {
            ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[8]);
            EntityMotionSupport.field_d = true;
          }
          stackIn_25_0 = !(494 > MatchingTextValidator.field_j);
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "gb.A(" + param0 + ')');
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
        field_g = -4;
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

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Geoblox.clientControlFlowFlag;
        try {
          ClientFlowState.accountDialogLayer.processPointerFrame(true, 127, MatchScoringSupport.field_d, TextConcatenationSupport.field_b);
          ClientFlowState.accountDialogLayer.advanceDialogAnimations(-65);
          while (UiFontResources.pollKeyboardEvent(77)) {
            ClientFlowState.accountDialogLayer.a((byte) 105, GameAudioState.currentKeyboardEventCharacter, SessionTextHistorySupport.currentKeyboardEventCode);
          }
          if (GzipInflater.pendingLoginUiAction != param0) {
            var1_int = GzipInflater.pendingLoginUiAction;
            MidiNote.a(-1, false);
            stackIn_6_0 = var1_int;
            return stackIn_6_0;
          }
          if (MeshPrioritySupport.field_d) {
            stackIn_10_0 = 3;
            return stackIn_10_0;
          }
          if (WidgetSkinState.usernameQueryFlowState == IntrusiveDeque.pendingClientFlowToken) {
            stackIn_14_0 = 1;
            return stackIn_14_0;
          }
          if (!EntityContactSupport.activeEmailAvailabilityQuery.isCompleted(-106)) {
            stackIn_17_0 = 1;
            return stackIn_17_0;
          }
          if (ClientFlowState.accountCreationFlowState != IntrusiveDeque.pendingClientFlowToken) {
            stackIn_22_0 = -1;
            return stackIn_22_0;
          }
          stackIn_20_0 = 2;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "gb.B(" + param0 + ')');
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

    public static void b(byte param0) {
        int var1 = -66 / ((33 - param0) / 32);
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
        field_e = -1;
    }
}
