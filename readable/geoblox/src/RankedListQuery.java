/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RankedListQuery extends IntrusiveNode {
    static String field_f;
    int entryLimit;
    static Sprite widgetSprite;
    static ResourceArchive field_i;
    static boolean connectivityDirty;
    int queryId;

    public static void b(int param0) {
        if (param0 != 127) {
            return;
        }
        field_f = null;
        widgetSprite = null;
        field_i = null;
    }

    final static void writeAchievementStateRequest(int methodGuard, int packetOpcode) {
        PacketBuffer packet = CacheReference.field_q;
        packet.writeCipherByte(packetOpcode, (byte) -66);
        packet.writeByte((byte) 124, 1);
        packet.writeByte((byte) 127, 2);
        if (methodGuard >= -65) {
            RankedListQuery.writeAchievementStateRequest(116, -127);
        }
    }

    final static void updateKeyboardStateForFrame(boolean methodGuard) {
        Object keyboardMonitor = null;
        int keyStateChangeOrResetIndex = 0;
        int clientControlFlowGuard = 0;
        Throwable caughtKeyboardFrameFailure = null;
        RuntimeException keyboardFrameFailureForContext = null;
        int resetKeyIndex = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          keyboardMonitor = TrackedPcmStream.keyboardListener;
          synchronized (keyboardMonitor) {
            if (!methodGuard) {
              field_f = (String) null;
            }
            ClientSessionSnapshot.keyboardEventReadIndex = MidiNote.keyboardEventFrameEndIndex;
            TextPairLoginPayload.keyboardIdleTicks = TextPairLoginPayload.keyboardIdleTicks + 1;
            if (ArchiveLoadStep.keyStateWriteIndexOrResetSentinel < 0) {
              resetKeyIndex = 0;
              keyStateChangeOrResetIndex = resetKeyIndex;
              while (resetKeyIndex < 112) {
                MidiPcmStream.heldInternalKeys[resetKeyIndex] = false;
                resetKeyIndex++;
              }
              ArchiveLoadStep.keyStateWriteIndexOrResetSentinel = ClientProtocolStage.keyStateReadIndex;
            } else {
              while (ClientProtocolStage.keyStateReadIndex != ArchiveLoadStep.keyStateWriteIndexOrResetSentinel) {
                keyStateChangeOrResetIndex = gf.queuedKeyStateChanges[ClientProtocolStage.keyStateReadIndex];
                ClientProtocolStage.keyStateReadIndex = 1 + ClientProtocolStage.keyStateReadIndex & 127;
                if (keyStateChangeOrResetIndex < 0) {
                  MidiPcmStream.heldInternalKeys[~keyStateChangeOrResetIndex] = false;
                  continue;
                }
                MidiPcmStream.heldInternalKeys[keyStateChangeOrResetIndex] = true;
              }
            }
            MidiNote.keyboardEventFrameEndIndex = BufferedSocket.keyEventWriteIndex;
          }
          return;
        } catch (java.lang.RuntimeException keyboardFrameFailure) {
          caughtKeyboardFrameFailure = keyboardFrameFailure;
          keyboardFrameFailureForContext = (RuntimeException) (Object) caughtKeyboardFrameFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) keyboardFrameFailureForContext), "re.C(" + methodGuard + ')');
        }
    }

    private RankedListQuery() throws Throwable {
        throw new Error();
    }

    static {
    }
}
