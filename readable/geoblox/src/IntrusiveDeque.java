/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static int field_f;
    IntrusiveNode sentinel;
    static ClientFlowToken pendingClientFlowToken;
    private IntrusiveNode iterationCursor;
    private static int[] field_b;
    static String[] field_e;

    final IntrusiveNode nextForIteration(int param0) {
        if (param0 != 1) {
            return (IntrusiveNode) null;
        }
        IntrusiveNode node = this.iterationCursor;
        if (!(this.sentinel != node)) {
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

    final IntrusiveNode firstForIteration(int param0) {
        IntrusiveNode firstNode = this.sentinel.nextNode;
        if (this.sentinel == firstNode) {
            this.iterationCursor = null;
            return null;
        }
        this.iterationCursor = firstNode.nextNode;
        if (param0 != 0) {
            field_f = -122;
        }
        return firstNode;
    }

    final static void prepareThemeMusic(int methodGuard, int themeId) {
        int selectedThemeId;
        int clientControlSnapshot;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        if ((null != AccountEligibilitySupport.musicScoreArchive) &&
            (!EmailValidator.themeMusicPreparationFlags[themeId])) {
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
            field_f = 13;
          }
          return;
        }
    }

    final static boolean a(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 <= 65) {
          return false;
        }
        stackIn_6_0 = (ClientScreenExitSupport.fullscreenDialogLayer != null) && (ClientScreenExitSupport.fullscreenDialogLayer.getTopVisibleDialog(75) != null);
        return stackIn_6_0;
    }

    public static void f(int param0) {
        field_b = null;
        if (param0 != 51) {
            IntrusiveDeque.buildUnitBorderNineSliceSprites(-67, 123, -7, 36, 22);
        }
        pendingClientFlowToken = null;
        field_e = null;
    }

    final IntrusiveNode previousForIteration(int param0) {
        IntrusiveNode node = this.iterationCursor;
        if (param0 != 0) {
            return (IntrusiveNode) null;
        }
        if (node == this.sentinel) {
            this.iterationCursor = null;
            return null;
        }
        this.iterationCursor = node.previousNode;
        return node;
    }

    final IntrusiveNode removeFirst(byte param0) {
        IntrusiveNode firstNode = this.sentinel.nextNode;
        if (param0 >= -94) {
            this.removeFirst((byte) 113);
        }
        if (this.sentinel == firstNode) {
            return null;
        }
        firstNode.unlinkNode(false);
        return firstNode;
    }

    final void addFirst(IntrusiveNode node, boolean param1) {
        try {
            if (node.previousNode != null) {
                node.unlinkNode(false);
            }
            node.nextNode = this.sentinel.nextNode;
            node.previousNode = this.sentinel;
            node.previousNode.nextNode = node;
            if (param1) {
                field_b = (int[]) null;
            }
            node.nextNode.previousNode = node;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "tf.A(" + (node != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void moveAllTo(IntrusiveDeque destination, byte param1) {
        try {
            this.moveSuffixTo(destination, 2541, this.sentinel.nextNode);
            if (param1 != -70) {
                IntrusiveNode var4 = (IntrusiveNode) null;
                this.addLast(52, (IntrusiveNode) null);
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "tf.I(" + (destination != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int countNodes(int param0) {
        int var5 = Geoblox.clientControlFlowFlag;
        int nodeCount = 0;
        IntrusiveNode node = this.sentinel.nextNode;
        while (this.sentinel != node) {
            node = node.nextNode;
            nodeCount++;
        }
        int var4 = -98 / ((param0 - 2) / 51);
        return nodeCount;
    }

    final IntrusiveNode removeLast(int param0) {
        if (param0 != 1) {
            this.sentinel = (IntrusiveNode) null;
        }
        IntrusiveNode lastNode = this.sentinel.previousNode;
        if (lastNode == this.sentinel) {
            return null;
        }
        lastNode.unlinkNode(false);
        return lastNode;
    }

    final void clearNodes(byte param0) {
        IntrusiveNode removedNode = null;
        int var3 = Geoblox.clientControlFlowFlag;
        while (true) {
            removedNode = this.sentinel.nextNode;
            if (removedNode == this.sentinel) {
                break;
            }
            removedNode.unlinkNode(false);
        }
        this.iterationCursor = null;
        if (param0 >= -64) {
            IntrusiveDeque.f(113);
        }
    }

    final IntrusiveNode lastForIteration(boolean param0) {
        if (param0) {
            return (IntrusiveNode) null;
        }
        IntrusiveNode lastNode = this.sentinel.previousNode;
        if (!(this.sentinel != lastNode)) {
            this.iterationCursor = null;
            return null;
        }
        this.iterationCursor = lastNode.previousNode;
        return lastNode;
    }

    final boolean isEmpty(int param0) {
        if (param0 != 13519) {
            this.iterationCursor = (IntrusiveNode) null;
        }
        return this.sentinel == this.sentinel.nextNode ? true : false;
    }

    private final void moveSuffixTo(IntrusiveDeque destination, int param1, IntrusiveNode firstMovedNode) {
        IntrusiveNode lastMovedNode = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
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
          if (param1 != 2541) {
            this.removeLast(-82);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("tf.J(");
          if (destination == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (firstMovedNode == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.nextNode = this.sentinel;
        this.sentinel.previousNode = this.sentinel;
    }

    final void addLast(int param0, IntrusiveNode node) {
        try {
            if (null != node.previousNode) {
                node.unlinkNode(false);
            }
            node.previousNode = this.sentinel.previousNode;
            if (param0 >= -33) {
                this.sentinel = (IntrusiveNode) null;
            }
            node.nextNode = this.sentinel;
            node.previousNode.nextNode = node;
            node.nextNode.previousNode = node;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "tf.P(" + param0 + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        field_f = 5;
        pendingClientFlowToken = new ClientFlowToken();
        field_e = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_b = new int[5];
        for (var0 = 0; var0 < field_b.length; var0++) {
          if (var0 == 0) {
            field_b[var0] = (1 + var0) * 20 << 8;
          } else {
            field_b[var0] = (1 + var0) * 51 << 8;
          }
          if (var0 <= 2) {
            continue;
          }
          field_b[var0] = SessionInstanceState.orInt(field_b[var0], (-2 + var0) * 22 << 16);
        }
        IntrusiveDeque discarded$0 = new IntrusiveDeque();
    }
}
