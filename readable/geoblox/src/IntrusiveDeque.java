/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static int sharedAchievementId;
    IntrusiveNode sentinel;
    static ClientFlowToken pendingClientFlowToken;
    private IntrusiveNode iterationCursor;
    private static int[] preparedColorRamp;
    static String[] waitingForTextByLanguage;

    final IntrusiveNode nextForIteration(int methodGuard) {
        if (methodGuard != 1) {
            return (IntrusiveNode) null;
        }
        IntrusiveNode node = this.iterationCursor;
        if (this.sentinel == node) {
            this.iterationCursor = null;
            return null;
        }
        this.iterationCursor = node.nextNode;
        return node;
    }

    final static Sprite[] buildUnitBorderNineSliceSprites(int bottomRightBorderColor, int fillColor, int guard, int topLeftBorderColor, int innerAccentColor) {
        if (guard <= 90) {
            pendingClientFlowToken = (ClientFlowToken) null;
        }
        return MatchingTextValidator.buildNineSliceSprites(innerAccentColor, 1, topLeftBorderColor, 3, (byte) 1, fillColor, bottomRightBorderColor, 1, 1);
    }

    final IntrusiveNode firstForIteration(int methodGuard) {
        IntrusiveNode firstNode = this.sentinel.nextNode;
        if (this.sentinel == firstNode) {
            this.iterationCursor = null;
            return null;
        }
        this.iterationCursor = firstNode.nextNode;
        if (methodGuard != 0) {
            sharedAchievementId = -122;
        }
        return firstNode;
    }

    final static void prepareThemeMusic(int methodGuard, int themeId) {
        int selectedThemeId;
        int clientControlSnapshot;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        if (null != AccountEligibilitySupport.musicScoreArchive &&
            !EmailValidator.themeMusicPreparationFlags[themeId]) {
          selectedThemeId = themeId;
          if (selectedThemeId != 4) {
            if (3 != selectedThemeId) {
              if (selectedThemeId != 0) {
                if (6 != selectedThemeId) {
                  if (5 == selectedThemeId) {
                    NodeHashTableIterator.sportMusicTrack = MusicScore.loadNamedScore(AccountEligibilitySupport.musicScoreArchive, "", "sport");
                    PasswordWidgetRenderer.gameMusicStream.prepareScoreInstruments(GameAudioState.gameSoundSampleCache, 0, -1, NodeHashTableIterator.sportMusicTrack, UsernameAvailabilityQuery.instrumentPatchArchive);
                  } else {
                    if (2 == selectedThemeId) {
                      SocialListEntry.sweetsMusicTrack = MusicScore.loadNamedScore(AccountEligibilitySupport.musicScoreArchive, "", "sweets");
                      PasswordWidgetRenderer.gameMusicStream.prepareScoreInstruments(GameAudioState.gameSoundSampleCache, 0, -1, SocialListEntry.sweetsMusicTrack, UsernameAvailabilityQuery.instrumentPatchArchive);
                    }
                  }
                } else {
                  SessionGameApplet.spaceMusicTrack = MusicScore.loadNamedScore(AccountEligibilitySupport.musicScoreArchive, "", "space");
                  PasswordWidgetRenderer.gameMusicStream.prepareScoreInstruments(GameAudioState.gameSoundSampleCache, 0, -1, SessionGameApplet.spaceMusicTrack, UsernameAvailabilityQuery.instrumentPatchArchive);
                }
              } else {
                RatingPresentationResources.jewelleryMusicTrack = MusicScore.loadNamedScore(AccountEligibilitySupport.musicScoreArchive, "", "jewellery");
                PasswordWidgetRenderer.gameMusicStream.prepareScoreInstruments(GameAudioState.gameSoundSampleCache, 0, -1, RatingPresentationResources.jewelleryMusicTrack, UsernameAvailabilityQuery.instrumentPatchArchive);
              }
            } else {
              GameAudioState.germsMusicTrack = MusicScore.loadNamedScore(AccountEligibilitySupport.musicScoreArchive, "", "germs");
              PasswordWidgetRenderer.gameMusicStream.prepareScoreInstruments(GameAudioState.gameSoundSampleCache, 0, -1, GameAudioState.germsMusicTrack, UsernameAvailabilityQuery.instrumentPatchArchive);
            }
          } else {
            DialWidget.bakingMusicTrack = MusicScore.loadNamedScore(AccountEligibilitySupport.musicScoreArchive, "", "baking");
            PasswordWidgetRenderer.gameMusicStream.prepareScoreInstruments(GameAudioState.gameSoundSampleCache, 0, -1, DialWidget.bakingMusicTrack, UsernameAvailabilityQuery.instrumentPatchArchive);
          }
          EmailValidator.themeMusicPreparationFlags[themeId] = true;
          if (methodGuard <= 110) {
            sharedAchievementId = 13;
          }
          return;
        }
    }

    final static boolean hasVisibleFullscreenDialog(byte methodGuard) {
        boolean visibleDialogResult = false;
        if (methodGuard <= 65) {
          return false;
        }
        visibleDialogResult = (ClientScreenExitSupport.fullscreenDialogLayer != null) && (ClientScreenExitSupport.fullscreenDialogLayer.getTopVisibleDialog(75) != null);
        return visibleDialogResult;
    }

    public static void releaseSharedResources(int methodGuard) {
        preparedColorRamp = null;
        if (methodGuard != 51) {
            IntrusiveDeque.buildUnitBorderNineSliceSprites(-67, 123, -7, 36, 22);
        }
        pendingClientFlowToken = null;
        waitingForTextByLanguage = null;
    }

    final IntrusiveNode previousForIteration(int methodGuard) {
        IntrusiveNode node = this.iterationCursor;
        if (methodGuard != 0) {
            return (IntrusiveNode) null;
        }
        if (node == this.sentinel) {
            this.iterationCursor = null;
            return null;
        }
        this.iterationCursor = node.previousNode;
        return node;
    }

    final IntrusiveNode removeFirst(byte methodGuard) {
        IntrusiveNode firstNode = this.sentinel.nextNode;
        if (methodGuard >= -94) {
            this.removeFirst((byte) 113);
        }
        if (this.sentinel == firstNode) {
            return null;
        }
        firstNode.unlinkNode(false);
        return firstNode;
    }

    final void addFirst(IntrusiveNode node, boolean methodGuard) {
        try {
            if (node.previousNode != null) {
                node.unlinkNode(false);
            }
            node.nextNode = this.sentinel.nextNode;
            node.previousNode = this.sentinel;
            node.previousNode.nextNode = node;
            if (methodGuard) {
                preparedColorRamp = (int[]) null;
            }
            node.nextNode.previousNode = node;
        } catch (RuntimeException prependFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) prependFailure), "tf.A(" + (node != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    final void moveAllTo(IntrusiveDeque destination, byte methodGuard) {
        try {
            this.moveSuffixTo(destination, 2541, this.sentinel.nextNode);
            if (methodGuard != -70) {
                IntrusiveNode discardedNullNode = (IntrusiveNode) null;
                this.addLast(52, (IntrusiveNode) null);
            }
        } catch (RuntimeException transferFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) transferFailure), "tf.I(" + (destination != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    final int countNodes(int methodGuard) {
        int clientControlSnapshot = Geoblox.clientControlFlowFlag;
        int nodeCount = 0;
        IntrusiveNode node = this.sentinel.nextNode;
        while (this.sentinel != node) {
            node = node.nextNode;
            nodeCount++;
        }
        int guardResidue = -98 / ((methodGuard - 2) / 51);
        return nodeCount;
    }

    final IntrusiveNode removeLast(int methodGuard) {
        if (methodGuard != 1) {
            this.sentinel = (IntrusiveNode) null;
        }
        IntrusiveNode lastNode = this.sentinel.previousNode;
        if (lastNode == this.sentinel) {
            return null;
        }
        lastNode.unlinkNode(false);
        return lastNode;
    }

    final void clearNodes(byte methodGuard) {
        IntrusiveNode removedNode = null;
        int clientControlSnapshot = Geoblox.clientControlFlowFlag;
        while (true) {
            removedNode = this.sentinel.nextNode;
            if (removedNode == this.sentinel) {
                break;
            }
            removedNode.unlinkNode(false);
        }
        this.iterationCursor = null;
        if (methodGuard >= -64) {
            IntrusiveDeque.releaseSharedResources(113);
        }
    }

    final IntrusiveNode lastForIteration(boolean methodGuard) {
        if (methodGuard) {
            return (IntrusiveNode) null;
        }
        IntrusiveNode lastNode = this.sentinel.previousNode;
        if (this.sentinel == lastNode) {
            this.iterationCursor = null;
            return null;
        }
        this.iterationCursor = lastNode.previousNode;
        return lastNode;
    }

    final boolean isEmpty(int methodGuard) {
        if (methodGuard != 13519) {
            this.iterationCursor = (IntrusiveNode) null;
        }
        return this.sentinel == this.sentinel.nextNode ? true : false;
    }

    private final void moveSuffixTo(IntrusiveDeque destination, int methodGuard, IntrusiveNode firstMovedNode) {
        IntrusiveNode lastMovedNode = null;
        RuntimeException transferFailureForContext = null;
        StringBuilder transferMessagePrefix = null;
        String destinationDescription = null;
        StringBuilder transferMessageAfterDestination = null;
        String firstMovedNodeDescription = null;
        RuntimeException caughtTransferFailure = null;
        RuntimeException transferFailure = null;
        try {
          lastMovedNode = this.sentinel.previousNode;
          this.sentinel.previousNode = firstMovedNode.previousNode;
          firstMovedNode.previousNode.nextNode = this.sentinel;
          if (this.sentinel != firstMovedNode) {
            firstMovedNode.previousNode = destination.sentinel.previousNode;
            firstMovedNode.previousNode.nextNode = firstMovedNode;
            destination.sentinel.previousNode = lastMovedNode;
            lastMovedNode.nextNode = destination.sentinel;
          }
          if (methodGuard != 2541) {
            this.removeLast(-82);
          }
          return;
        } catch (java.lang.RuntimeException transferFailureAtCatch) {
          caughtTransferFailure = transferFailureAtCatch;
          transferFailure = caughtTransferFailure;
          transferFailureForContext = transferFailure;
          transferMessagePrefix = new StringBuilder().append("tf.J(");
          if (destination == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          transferMessageAfterDestination = ((StringBuilder) (Object) transferMessagePrefix).append(destinationDescription).append(',').append(methodGuard).append(',');
          if (firstMovedNode == null) {
            firstMovedNodeDescription = "null";
          } else {
            firstMovedNodeDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) transferFailureForContext), ((StringBuilder) (Object) transferMessageAfterDestination).append(firstMovedNodeDescription).append(')').toString());
        }
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.nextNode = this.sentinel;
        this.sentinel.previousNode = this.sentinel;
    }

    final void addLast(int methodGuard, IntrusiveNode node) {
        try {
            if (null != node.previousNode) {
                node.unlinkNode(false);
            }
            node.previousNode = this.sentinel.previousNode;
            if (methodGuard >= -33) {
                this.sentinel = (IntrusiveNode) null;
            }
            node.nextNode = this.sentinel;
            node.previousNode.nextNode = node;
            node.nextNode.previousNode = node;
        } catch (RuntimeException appendFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) appendFailure), "tf.P(" + methodGuard + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int colorRampIndex = 0;
        sharedAchievementId = 5;
        pendingClientFlowToken = new ClientFlowToken();
        waitingForTextByLanguage = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        preparedColorRamp = new int[5];
        for (colorRampIndex = 0; colorRampIndex < preparedColorRamp.length; colorRampIndex++) {
          if (colorRampIndex == 0) {
            preparedColorRamp[colorRampIndex] = (1 + colorRampIndex) * 20 << 8;
          } else {
            preparedColorRamp[colorRampIndex] = (1 + colorRampIndex) * 51 << 8;
          }
          if (colorRampIndex <= 2) {
            continue;
          }
          preparedColorRamp[colorRampIndex] = SessionInstanceState.orInt(preparedColorRamp[colorRampIndex], (-2 + colorRampIndex) * 22 << 16);
        }
        IntrusiveDeque discardedDequeAllocation = new IntrusiveDeque();
    }
}
