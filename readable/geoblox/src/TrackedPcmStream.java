/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrackedPcmStream extends IntrusiveNode {
    PcmSampleStream stream;
    int initialVolume;
    static KeyboardInputListener keyboardListener;
    IntrusiveNode lifetimeNode;
    static BufferedRandomAccessFile[] field_h;

    final static void updateAchievementSubmissions(byte methodGuard) {
        AchievementSubmission pendingSubmission = null;
        int unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
            if ((!SpriteConstructionSupport.achievementMaskReceived && null != MouseWheelInput.achievementStateQuery) &&
                (!(!MouseWheelInput.achievementStateQuery.completed))) {
                SecondaryNodeDeque.receivedAchievementMask = MouseWheelInput.achievementStateQuery.achievementMask;
                SpriteConstructionSupport.achievementMaskReceived = true;
                ScorePopupSupport.newAchievementMask = ScorePopupSupport.newAchievementMask & ~SecondaryNodeDeque.receivedAchievementMask;
                InstrumentPatch.earnedAchievementMask = InstrumentPatch.earnedAchievementMask | SecondaryNodeDeque.receivedAchievementMask;
            }
            if (methodGuard >= -119) {
                keyboardListener = (KeyboardInputListener) null;
            }
            if (!UnderlinedButtonRenderer.c(-91)) {
                while (true) {
                    pendingSubmission = (AchievementSubmission) ((Object) GameplayEntity.pendingAchievementSubmissions.removeFirst((byte) -118));
                    if (pendingSubmission == null) {
                        break;
                    }
                    GrowableIntList.submitAchievementRecord(pendingSubmission, -56, 4);
                }
            }
        } catch (RuntimeException achievementSubmissionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) achievementSubmissionFailure), "je.C(" + methodGuard + ')');
        }
    }

    final static ResourceArchive a(int param0, boolean param1, boolean param2, boolean param3, byte param4) {
        int var5 = 55 / ((param4 + 65) / 46);
        return IntKeyLookup.createResourceArchive(-128, param0, param2, !param1 ? 0 : 1, param3, false);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            int var2_int = 0;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              try {
                var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                param1.getAppletContext().showDocument(SessionGameApplet.applySessionOverridesToUrl(var2, -84, param1), "_top");
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
              }
              var2_int = 91 % ((50 - param0) / 49);
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_7_0 = var2_ref2;
              stackIn_7_1 = new StringBuilder().append("je.D(").append(param0).append(',');
              if (param1 == null) {
                stackIn_8_2 = "null";
              } else {
                stackIn_8_2 = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        keyboardListener = null;
        if (param0 <= 49) {
            TrackedPcmStream.updateAchievementSubmissions((byte) -123);
            field_h = null;
            return;
        }
        field_h = null;
    }

    TrackedPcmStream(PcmSampleStream stream, IntrusiveNode lifetimeNode) {
        try {
            this.stream = stream;
            this.initialVolume = stream.getTargetVolume();
            this.lifetimeNode = lifetimeNode;
            this.stream.setVolume(this.initialVolume * SocialListEntry.soundEffectVolume / 80);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "je.<init>(" + (stream != null ? "{...}" : "null") + ',' + (lifetimeNode != null ? "{...}" : "null") + ')');
        }
    }

    static {
        keyboardListener = new KeyboardInputListener();
    }
}
