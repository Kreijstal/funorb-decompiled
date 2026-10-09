/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveLoadSequence {
    float scaledProgress;
    static Sprite[] mouseBoxFrames;
    private int progressScale;
    private ArchiveLoadStep[] steps;
    String statusText;
    static String fetchingHighscoresText;
    private int stepCount;
    static long archiveHandshakeDeadlineMillis;
    static int emptyBoardResultAchievementId;
    private int currentStepIndex;

    private final void updateStepProgress(int percentage, ArchiveLoadStep step, int methodGuard) {
        float completedStepFraction = 0.0f;
        try {
            completedStepFraction = (float)(this.currentStepIndex + 1) + (float)percentage / 100.0f;
            if (methodGuard > -90) {
                String unusedNullUrlForInvalidGuard = (String) null;
                ArchiveLoadSequence.openRelativeUrlInNewWindow((java.applet.Applet) null, (byte) 114, (String) null);
            }
            if (percentage == 0) {
                this.statusText = step.waitingText;
            } else {
                this.statusText = step.loadingText + " - " + percentage + "%";
            }
            this.scaledProgress = completedStepFraction * (float)this.progressScale / (float)(1 + this.stepCount);
        } catch (RuntimeException progressUpdateFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) progressUpdateFailure), "eb.E(" + percentage + ',' + (step != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        fetchingHighscoresText = null;
        mouseBoxFrames = null;
        if (methodGuard <= -68) {
            return;
        }
        ArchiveLoadSequence.handleArchiveHandshakeFailure(-101, -31);
    }

    final boolean pollLoaded(boolean methodGuard) {
        int clientControlFlowSnapshot;
        String unusedNullUrlForInvalidGuard;
        ArchiveLoadStep currentLoadStep;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        if (!methodGuard) {
          unusedNullUrlForInvalidGuard = (String) null;
          ArchiveLoadSequence.openRelativeUrlInNewWindow((java.applet.Applet) null, (byte) -56, (String) null);
        }
        while (this.currentStepIndex < this.stepCount) {
          currentLoadStep = this.steps[this.currentStepIndex];
          if (!currentLoadStep.archive.ensureIndexLoaded(0)) {
            this.updateStepProgress(0, currentLoadStep, -123);
            return false;
          }
          if (currentLoadStep.groupId >= 0 &&
              !currentLoadStep.archive.loadGroupIfNeeded((byte) 102, currentLoadStep.groupId)) {
            this.updateStepProgress(currentLoadStep.archive.getGroupProgress((byte) 36, currentLoadStep.groupId), currentLoadStep, -119);
            return false;
          }
          if (null != currentLoadStep.groupName &&
              !currentLoadStep.archive.loadGroupByName(currentLoadStep.groupName, (byte) -126)) {
            this.updateStepProgress(currentLoadStep.archive.getGroupProgressByName(0, currentLoadStep.groupName), currentLoadStep, -123);
            return false;
          }
          if (currentLoadStep.groupId < 0 &&
              currentLoadStep.groupName == null &&
              null != currentLoadStep.loadingText &&
              !currentLoadStep.archive.loadAllGroups(true)) {
            this.updateStepProgress(currentLoadStep.archive.getLoadProgress((byte) 106), currentLoadStep, -108);
            return false;
          }
          this.currentStepIndex = this.currentStepIndex + 1;
        }
        return true;
    }

    final static int handleArchiveHandshakeFailure(int replyCode, int methodGuard) {
        int unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        StrongCacheReference.archiveConnectTask = null;
        AccountCreationForm.archiveHandshakeStage = 0;
        ArchiveHandshakeState.archiveHandshakeSocket = null;
        int previousArchivePort = SecondaryNodeHashTable.archivePort;
        SecondaryNodeHashTable.archivePort = FullscreenErrorDialog.alternateArchivePort;
        FullscreenErrorDialog.alternateArchivePort = previousArchivePort;
        if (replyCode == 51) {
            AsyncResourceDownloader.archiveNetworkClient.failureCode = 2;
            AsyncResourceDownloader.archiveNetworkClient.failureCount = AsyncResourceDownloader.archiveNetworkClient.failureCount + 1;
            if (AsyncResourceDownloader.archiveNetworkClient.failureCount < 2) {
                if (AsyncResourceDownloader.archiveNetworkClient.failureCount >= 2 && 50 == replyCode) {
                    return 5;
                }
                if (methodGuard != 28625) {
                    emptyBoardResultAchievementId = -67;
                    if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                        return 1;
                    }
                    return -1;
                }
                if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                    return 1;
                }
                return -1;
            }
            if (replyCode == 51) {
                return 2;
            }
            if (AsyncResourceDownloader.archiveNetworkClient.failureCount < 2) {
                if (methodGuard != 28625) {
                    emptyBoardResultAchievementId = -67;
                    if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                        return 1;
                    }
                    return -1;
                }
                if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                    return 1;
                }
                return -1;
            }
            if (50 == replyCode) {
                return 5;
            }
            if (methodGuard != 28625) {
                emptyBoardResultAchievementId = -67;
                if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                    return 1;
                }
                return -1;
            }
            if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                return 1;
            }
            return -1;
        }
        if (50 != replyCode) {
            AsyncResourceDownloader.archiveNetworkClient.failureCode = 1;
            AsyncResourceDownloader.archiveNetworkClient.failureCount = AsyncResourceDownloader.archiveNetworkClient.failureCount + 1;
            if (AsyncResourceDownloader.archiveNetworkClient.failureCount >= 2) {
                if (replyCode == 51) {
                    return 2;
                }
                if (AsyncResourceDownloader.archiveNetworkClient.failureCount >= 2 && 50 == replyCode) {
                    return 5;
                }
                if (methodGuard != 28625) {
                    emptyBoardResultAchievementId = -67;
                    if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                        return 1;
                    }
                    return -1;
                }
                if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                    return 1;
                }
                return -1;
            }
            if (AsyncResourceDownloader.archiveNetworkClient.failureCount >= 2 && 50 == replyCode) {
                return 5;
            }
            if (methodGuard != 28625) {
                emptyBoardResultAchievementId = -67;
                if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                    return 1;
                }
                return -1;
            }
            if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                return 1;
            }
            return -1;
        }
        AsyncResourceDownloader.archiveNetworkClient.failureCode = 5;
        AsyncResourceDownloader.archiveNetworkClient.failureCount = AsyncResourceDownloader.archiveNetworkClient.failureCount + 1;
        if (AsyncResourceDownloader.archiveNetworkClient.failureCount >= 2) {
            if (replyCode == 51) {
                return 2;
            }
            if (AsyncResourceDownloader.archiveNetworkClient.failureCount < 2) {
                if (methodGuard != 28625) {
                    emptyBoardResultAchievementId = -67;
                    if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                        return 1;
                    }
                    return -1;
                }
                if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                    return 1;
                }
                return -1;
            }
            if (50 == replyCode) {
                return 5;
            }
            if (methodGuard != 28625) {
                emptyBoardResultAchievementId = -67;
                if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                    return 1;
                }
                return -1;
            }
            if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                return 1;
            }
            return -1;
        }
        if (AsyncResourceDownloader.archiveNetworkClient.failureCount >= 2 && 50 == replyCode) {
            return 5;
        }
        if (methodGuard != 28625) {
            emptyBoardResultAchievementId = -67;
            if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
                return 1;
            }
            return -1;
        }
        if (!(AsyncResourceDownloader.archiveNetworkClient.failureCount < 4)) {
            return 1;
        }
        return -1;
    }

    final static void openRelativeUrlInNewWindow(java.applet.Applet applet, byte methodGuard, String relativeUrl) {
        try {
            java.net.URL targetUrl = null;
            Exception printedNavigationFailure = null;
            RuntimeException navigationFailureForContext = null;
            RuntimeException navigationFailureBeforeDescription = null;
            StringBuilder navigationMessagePrefix = null;
            String appletDescription = null;
            StringBuilder messageBeforeUrl = null;
            String urlDescription = null;
            Throwable caughtNavigationThrowable = null;
            try {
              try {
                if (methodGuard <= 109) {
                  fetchingHighscoresText = (String) null;
                }
                targetUrl = new java.net.URL(applet.getCodeBase(), relativeUrl);
                targetUrl = SessionGameApplet.applySessionOverridesToUrl(targetUrl, 59, applet);
                LimitedRandomAccessFile.openUrlInNewWindow(targetUrl.toString(), (byte) 64, true, applet);
                return;
              } catch (java.lang.Exception navigationException) {
                caughtNavigationThrowable = navigationException;
                printedNavigationFailure = (Exception) (Object) caughtNavigationThrowable;
                printedNavigationFailure.printStackTrace();
                return;
              }
            } catch (java.lang.RuntimeException navigationFailure) {
              caughtNavigationThrowable = navigationFailure;
              navigationFailureForContext = (RuntimeException) (Object) caughtNavigationThrowable;
              navigationFailureBeforeDescription = navigationFailureForContext;
              navigationMessagePrefix = new StringBuilder().append("eb.C(");
              if (applet == null) {
                appletDescription = "null";
              } else {
                appletDescription = "{...}";
              }
              messageBeforeUrl = ((StringBuilder) (Object) navigationMessagePrefix).append(appletDescription).append(',').append(methodGuard).append(',');
              if (relativeUrl == null) {
                urlDescription = "null";
              } else {
                urlDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) navigationFailureBeforeDescription), ((StringBuilder) (Object) messageBeforeUrl).append(urlDescription).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedBoundaryFailure) {
            throw uncheckedBoundaryFailure;
        } catch (Throwable checkedBoundaryFailure) {
            throw new RuntimeException(checkedBoundaryFailure);
        }
    }

    private ArchiveLoadSequence() throws Throwable {
        throw new Error();
    }

    static {
        fetchingHighscoresText = "Fetching highscores.";
        emptyBoardResultAchievementId = 2;
    }
}
