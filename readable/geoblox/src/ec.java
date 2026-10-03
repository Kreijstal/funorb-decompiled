/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static int field_b;
    static String okText;
    static Sprite selectedThemeForeground;
    static String[] field_e;
    static int field_d;

    final static void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        ai var5 = null;
        mg var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Geoblox.clientControlFlowFlag;
        try {
          var3 = 57 % ((param0 - 57) / 46);
          var5 = (ai) ((Object) TriangleMesh.field_j.firstForIteration(0));
          while (var5 != null) {
            ArchiveIndex.a(var5, param1, -127);
            var5 = (ai) ((Object) TriangleMesh.field_j.nextForIteration(1));
          }
          var6 = (mg) ((Object) ResourceArchive.field_d.firstForIteration(0));
          while (var6 != null) {
            DebouncedValidationProvider.a(param1, 5, var6);
            var6 = (mg) ((Object) ResourceArchive.field_d.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2), "ec.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean processMatchCandidates(int methodGuard) {
        RuntimeException decompiledCaughtException = null;
        int sortInsertionIndex = 0;
        RuntimeException var1 = null;
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
        controlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if ((0 == h.matchCandidateCount) &&
              (0 < wb.newAttachmentCount)) {
            if (w.avatarShockPending) {
              return false;
            }
            gf.matchChainLength = 0;
            if (UiWidget.gameplaySession.pointsPanelX == 463) {
              UiWidget.gameplaySession.pointsPanelSlideDirection = 1;
              UiWidget.gameplaySession.emitPointsPopup(false);
            }
            return false;
          }
          if (h.matchCandidateCount == 0) {
            return false;
          }
          if (gf.matchChainLength >= 5) {
            SecondaryNodeDeque.recordAchievement(jf.field_g ^ 255, -99, jf.field_g);
          }
          if (gf.matchChainLength >= 6) {
            SecondaryNodeDeque.recordAchievement(LoginPayloadKind.field_d ^ 255, -57, LoginPayloadKind.field_d);
          }
          if (gf.matchChainLength >= 7) {
            SecondaryNodeDeque.recordAchievement(255 ^ IntrusiveDeque.field_f, -97, IntrusiveDeque.field_f);
          }
          for (sortInsertionIndex = 1; sortInsertionIndex < h.matchCandidateCount; sortInsertionIndex++) {
            sortCursorThenFirstEntityId = sortInsertionIndex - 1;
            packedCandidateThenSecondEntityId = nk.packedMatchCandidates[sortInsertionIndex];
            while (sortCursorThenFirstEntityId >= 0) {
              if (~nk.packedMatchCandidates[sortCursorThenFirstEntityId] < ~packedCandidateThenSecondEntityId) {
                nk.packedMatchCandidates[1 + sortCursorThenFirstEntityId] = nk.packedMatchCandidates[sortCursorThenFirstEntityId];
                sortCursorThenFirstEntityId--;
                continue;
              }
              break;
            }
            nk.packedMatchCandidates[1 + sortCursorThenFirstEntityId] = packedCandidateThenSecondEntityId;
          }
          if (methodGuard != -18913) {
            ec.processMatchCandidates(-33);
          }
          candidateIndex = 0;
          sortInsertionIndex = candidateIndex;
          while (candidateIndex < h.matchCandidateCount) {
            if ((-1 + h.matchCandidateCount > candidateIndex) &&
                (nk.packedMatchCandidates[candidateIndex] == nk.packedMatchCandidates[candidateIndex + 1])) {
              nk.packedMatchCandidates[candidateIndex] = 0;
            } else {
              sortCursorThenFirstEntityId = (nk.packedMatchCandidates[candidateIndex] & 1072693248) >> 20;
              packedCandidateThenSecondEntityId = nk.packedMatchCandidates[candidateIndex] >> 10 & 1023;
              thirdEntityId = 1023 & nk.packedMatchCandidates[candidateIndex];
              firstMatchedEntity = tl.entitiesById[sortCursorThenFirstEntityId];
              secondMatchedEntity = tl.entitiesById[packedCandidateThenSecondEntityId];
              thirdMatchedEntity = tl.entitiesById[thirdEntityId];
              if ((firstMatchedEntity.matchCooldownTicks <= 0) &&
                  (secondMatchedEntity.matchCooldownTicks <= 0) &&
                  (thirdMatchedEntity.matchCooldownTicks <= 0)) {
                td.playPcmSample(-348, fl.field_c[31]);
                gf.matchChainLength = gf.matchChainLength + 1;
                if (gf.matchChainLength > 1) {
                  UiWidget.gameplaySession.pointsPanelSlideDirection = -1;
                }
                if (-1073741824 == (-1073741824 & nk.packedMatchCandidates[candidateIndex])) {
                  awardedPoints = 90 * gf.matchChainLength;
                  SecondaryNodeDeque.recordAchievement(fa.field_e ^ 255, -100, fa.field_e);
                } else {
                  awardedPoints = 30 * gf.matchChainLength;
                }
                popupX = 0;
                popupX = (int)firstMatchedEntity.positionX;
                popupY = 0;
                popupY = (int)firstMatchedEntity.positionY;
                ug.spawnScorePopup(awardedPoints, true, popupY, gf.matchChainLength, popupX);
                nk.packedMatchCandidates[candidateIndex] = 0;
              } else {
                firstBlockedEntity = firstMatchedEntity;
                secondBlockedEntity = secondMatchedEntity;
                thirdMatchedEntity.entityQueue = null;
                secondBlockedEntity.entityQueue = null;
                firstBlockedEntity.entityQueue = null;
                nk.packedMatchCandidates[candidateIndex] = 0;
              }
            }
            candidateIndex++;
          }
          h.matchCandidateCount = 0;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "ec.A(" + methodGuard + ')');
        }
    }

    final static void a(int param0) {
        ph var1 = (ph) ((Object) UiWidget.field_p.firstForIteration(param0 ^ param0));
        if (!(var1 != null)) {
            Bzip2DecoderState.closeSessionSocket((byte) -122);
            return;
        }
        PacketBuffer var2 = eh.field_d;
        var2.readIntBE((byte) -102);
        var2.readIntBE((byte) -108);
        var2.readIntBE((byte) -71);
        var2.readIntBE((byte) -83);
        var1.unlinkNode(false);
    }

    public static void a(boolean param0) {
        if (!param0) {
            okText = (String) null;
        }
        selectedThemeForeground = null;
        okText = null;
        field_e = null;
    }

    static {
        field_b = 0;
        okText = "OK";
        field_e = new String[]{"At any point in the game, you can press the <img=4> key on the top-left of your keyboard to pause the game and bring up the menu from which you can access these instructions.<br><br><br><br>Press the <img=0> and <img=1> arrow keys to rotate the game area anticlockwise and clockwise. You can reverse the directions by pressing <img=7> at any point during the game. If you want to make the next geoblox fall faster, press and hold the <img=6> arrow key.", "Connect falling geoblox into threes, by colour, shape, or colour and shape to score points. Geoblox are considered to be connected when there is no black line between them. If there is a black line, your geoblox are not close enough.<br><br>The geoblox plummet towards your avatar from the outside of the play area. They will stick to the first thing they hit. By getting three of a kind, by colour, shape, or colour and shape, they will disappear and earn you points. Special geoblox, which behave differently, appear later in the game.<br>Once the stacked geoblox reach the edge of the play area, you lose.", "The sequence bonus is awarded for clearing more than one set of geoblox in a row. For clearing two sets of geoblox in a row, the points awarded will be doubled; for clearing three sets in a row, the points awarded will be tripled, and so on. The bonus only applies to an uninterrupted sequence.<br><br>There's a bonus for clearing the avatar of geoblox. Once you reach the end of a stage (the countdown is in the bottom-right of the screen), a bonus bubble will appear. It shrinks from the outer edge of the game area until it touches a geoblox. The longer it takes to reach a geoblox, the higher your reward!", "Special geoblox only crop up in the latter parts of the game, so don't worry about them early on.<br><br><shad=AAAAAA>The amorphous geoblox:</shad> This blob in a jar has a fixed colour, but will assume the shape of the first geoblox it hits. These will only disappear when you connect them to two others of the same colour.<br><br><shad=AAAAAA>The chromatic geoblox:</shad> This has a shape, but no colour. It will assume the colour of the first normal geoblox it hits. These will only disappear when you connect them to two others of the same shape.", "<shad=AAAAAA>The black orb:</shad> Malignant and lazy, this geoblox does nothing but get in your way. Destroy them by using a silver star for a whopping 100 points each! There are no points for stacking them, as they will not react.<br><br><shad=AAAAAA>The silver star:</shad> This star reacts if it comes into contact with your avatar. It unleashes an electric shock that destroys all geoblox touching the avatar, including black orbs. Until then, it's a bit useless! Don't try stacking them as they will just sit there."};
    }
}
