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
        float var4_float = 0.0f;
        try {
            var4_float = (float)(this.currentStepIndex + 1) + (float)percentage / 100.0f;
            if (methodGuard > -90) {
                String var5 = (String) null;
                ArchiveLoadSequence.a((java.applet.Applet) null, (byte) 114, (String) null);
            }
            if (percentage == 0) {
                this.statusText = step.waitingText;
            } else {
                this.statusText = step.loadingText + " - " + percentage + "%";
            }
            this.scaledProgress = var4_float * (float)this.progressScale / (float)(1 + this.stepCount);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "eb.E(" + percentage + ',' + (step != null ? "{...}" : "null") + ',' + methodGuard + ')');
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
        int var3;
        String var4;
        ArchiveLoadStep var5;
        var3 = Geoblox.clientControlFlowFlag;
        if (!methodGuard) {
          var4 = (String) null;
          ArchiveLoadSequence.a((java.applet.Applet) null, (byte) -56, (String) null);
        }
        while (this.currentStepIndex < this.stepCount) {
          var5 = this.steps[this.currentStepIndex];
          if (!var5.archive.ensureIndexLoaded(0)) {
            this.updateStepProgress(0, var5, -123);
            return false;
          }
          if ((var5.groupId >= 0) &&
              (!var5.archive.loadGroupIfNeeded((byte) 102, var5.groupId))) {
            this.updateStepProgress(var5.archive.getGroupProgress((byte) 36, var5.groupId), var5, -119);
            return false;
          }
          if ((null != var5.groupName) &&
              (!var5.archive.loadGroupByName(var5.groupName, (byte) -126))) {
            this.updateStepProgress(var5.archive.getGroupProgressByName(0, var5.groupName), var5, -123);
            return false;
          }
          if ((var5.groupId < 0) &&
              (var5.groupName == null) &&
              (null != var5.loadingText) &&
              (!var5.archive.loadAllGroups(true))) {
            this.updateStepProgress(var5.archive.getLoadProgress((byte) 106), var5, -108);
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
            if (!(replyCode != 51)) {
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

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_9_2 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                if (param1 <= 109) {
                  fetchingHighscoresText = (String) null;
                }
                var3 = new java.net.URL(param0.getCodeBase(), param2);
                var3 = SessionGameApplet.applySessionOverridesToUrl(var3, 59, param0);
                LimitedRandomAccessFile.openUrlInNewWindow(var3.toString(), (byte) 64, true, param0);
                return;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3_ref = (Exception) (Object) decompiledCaughtException;
                var3_ref.printStackTrace();
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_8_0 = var3_ref2;
              stackIn_8_1 = new StringBuilder().append("eb.C(");
              if (param0 == null) {
                stackIn_9_2 = "null";
              } else {
                stackIn_9_2 = "{...}";
              }
              stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
              if (param2 == null) {
                stackIn_12_2 = "null";
              } else {
                stackIn_12_2 = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
