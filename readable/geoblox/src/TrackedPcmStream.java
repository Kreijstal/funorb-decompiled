/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrackedPcmStream extends IntrusiveNode {
    PcmSampleStream stream;
    int initialVolume;
    static KeyboardInputListener keyboardListener;
    IntrusiveNode lifetimeNode;
    static BufferedRandomAccessFile[] openedCacheIndexFiles;

    final static void updateAchievementSubmissions(byte methodGuard) {
        AchievementSubmission pendingSubmission = null;
        int unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
            if (!SpriteConstructionSupport.achievementMaskReceived && null != MouseWheelInput.achievementStateQuery &&
                MouseWheelInput.achievementStateQuery.completed) {
                SecondaryNodeDeque.receivedAchievementMask = MouseWheelInput.achievementStateQuery.achievementMask;
                SpriteConstructionSupport.achievementMaskReceived = true;
                ScorePopupSupport.newAchievementMask = ScorePopupSupport.newAchievementMask & ~SecondaryNodeDeque.receivedAchievementMask;
                InstrumentPatch.earnedAchievementMask = InstrumentPatch.earnedAchievementMask | SecondaryNodeDeque.receivedAchievementMask;
            }
            if (methodGuard >= -119) {
                keyboardListener = (KeyboardInputListener) null;
            }
            if (!UnderlinedButtonRenderer.isGuestSessionMode(-91)) {
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

    final static ResourceArchive createGameResourceArchive(int archiveId, boolean discardDecodedFilesAfterRead, boolean downloadAllGroups, boolean discardPackedGroups, byte methodGuard) {
        int guardQuotient = 55 / ((methodGuard + 65) / 46);
        return IntKeyLookup.createResourceArchive(-128, archiveId, downloadAllGroups, !discardDecodedFilesAfterRead ? 0 : 1, discardPackedGroups, false);
    }

    final static void navigateToServerListPage(byte methodGuard, java.applet.Applet applet) {
        try {
            java.net.URL serverListUrl = null;
            int guardRemainder = 0;
            RuntimeException navigationFailureBeforeDescription = null;
            StringBuilder navigationMessagePrefix = null;
            String appletDescription = null;
            Throwable caughtNavigationThrowable = null;
            Exception printedNavigationFailure = null;
            RuntimeException navigationFailureForContext = null;
            try {
              try {
                serverListUrl = new java.net.URL(applet.getCodeBase(), "toserverlist.ws");
                applet.getAppletContext().showDocument(SessionGameApplet.applySessionOverridesToUrl(serverListUrl, -84, applet), "_top");
              } catch (java.lang.Exception navigationException) {
                caughtNavigationThrowable = navigationException;
                printedNavigationFailure = (Exception) (Object) caughtNavigationThrowable;
                printedNavigationFailure.printStackTrace();
              }
              guardRemainder = 91 % ((50 - methodGuard) / 49);
              return;
            } catch (java.lang.RuntimeException navigationFailure) {
              caughtNavigationThrowable = navigationFailure;
              navigationFailureForContext = (RuntimeException) (Object) caughtNavigationThrowable;
              navigationFailureBeforeDescription = navigationFailureForContext;
              navigationMessagePrefix = new StringBuilder().append("je.D(").append(methodGuard).append(',');
              if (applet == null) {
                appletDescription = "null";
              } else {
                appletDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) navigationFailureBeforeDescription), ((StringBuilder) (Object) navigationMessagePrefix).append(appletDescription).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedBoundaryFailure) {
            throw uncheckedBoundaryFailure;
        } catch (Throwable checkedBoundaryFailure) {
            throw new RuntimeException(checkedBoundaryFailure);
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        keyboardListener = null;
        if (methodGuard <= 49) {
            TrackedPcmStream.updateAchievementSubmissions((byte) -123);
            openedCacheIndexFiles = null;
            return;
        }
        openedCacheIndexFiles = null;
    }

    TrackedPcmStream(PcmSampleStream stream, IntrusiveNode lifetimeNode) {
        try {
            this.stream = stream;
            this.initialVolume = stream.getTargetVolume();
            this.lifetimeNode = lifetimeNode;
            this.stream.setVolume(this.initialVolume * SocialListEntry.soundEffectVolume / 80);
        } catch (RuntimeException trackedStreamInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) trackedStreamInitializationFailure), "je.<init>(" + (stream != null ? "{...}" : "null") + ',' + (lifetimeNode != null ? "{...}" : "null") + ')');
        }
    }

    static {
        keyboardListener = new KeyboardInputListener();
    }
}
