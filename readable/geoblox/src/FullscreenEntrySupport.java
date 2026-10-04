/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenEntrySupport {
    static int sessionLanguageId;
    static int[] thirdVertexTransformedX;
    static int configuredLogoStartDelayMillis;

    final static java.awt.Frame enterFullscreenAndWait(int bitDepth, int methodGuard, int height, int width, PlatformTaskDispatcher taskDispatcher, int refreshRate) {
        int modeIndex = 0;
        Object missingModesBeforeReturn = null;
        Object failedTaskFrameBeforeReturn = null;
        java.awt.Frame fullscreenFrameBeforeReturn = null;
        RuntimeException fullscreenFailureBeforeContext = null;
        StringBuilder fullscreenMessagePrefix = null;
        String dispatcherDescription = null;
        RuntimeException caughtFullscreenFailure = null;
        DisplayModeInfo[] unusedModesAlias = null;
        RuntimeException fullscreenFailureForContext = null;
        int matchingModeFoundInt = 0;
        java.awt.Frame fullscreenFrame = null;
        int clientControlFlowGuard = 0;
        DisplayModeInfo[] displayModes = null;
        PlatformTask fullscreenTask = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (!taskDispatcher.hasFullscreenSupport(-26098)) {
            return null;
          }
          if (methodGuard == ~bitDepth) {
            displayModes = CheckboxWidget.a(methodGuard ^ -112, taskDispatcher);
            unusedModesAlias = displayModes;
            if (unusedModesAlias == null) {
              missingModesBeforeReturn = null;
              return (java.awt.Frame) (missingModesBeforeReturn);
            }
            matchingModeFoundInt = 0;
            for (modeIndex = 0; modeIndex < displayModes.length; modeIndex++) {
              if (width != displayModes[modeIndex].width) {
                continue;
              }
              if (displayModes[modeIndex].height == height) {
                if ((refreshRate != 0) &&
                    (refreshRate != displayModes[modeIndex].refreshRate)) {
                  continue;
                }
                if ((matchingModeFoundInt != 0) &&
                    (bitDepth >= displayModes[modeIndex].bitDepth)) {
                  continue;
                }
                matchingModeFoundInt = 1;
                bitDepth = displayModes[modeIndex].bitDepth;
              }
            }
            if (!(matchingModeFoundInt != 0)) {
              return null;
            }
          }
          fullscreenTask = taskDispatcher.requestEnterFullscreen(height, methodGuard ^ 1743550127, refreshRate, bitDepth, width);
          while (fullscreenTask.status == 0) {
            ByteTextDecodingSupport.sleepMillis(0, 10L);
          }
          fullscreenFrame = (java.awt.Frame) (fullscreenTask.result);
          if (fullscreenFrame == null) {
            return null;
          }
          if (fullscreenTask.status != 2) {
            fullscreenFrameBeforeReturn = fullscreenFrame;
            return fullscreenFrameBeforeReturn;
          }
          FullscreenSupport.exitFullscreenAndDisposeFrame(fullscreenFrame, 10, taskDispatcher);
          failedTaskFrameBeforeReturn = null;
          return (java.awt.Frame) (failedTaskFrameBeforeReturn);
        } catch (java.lang.RuntimeException fullscreenFailure) {
          caughtFullscreenFailure = fullscreenFailure;
          fullscreenFailureForContext = caughtFullscreenFailure;
          fullscreenFailureBeforeContext = fullscreenFailureForContext;
          fullscreenMessagePrefix = new StringBuilder().append("qe.D(").append(bitDepth).append(',').append(methodGuard).append(',').append(height).append(',').append(width).append(',');
          if (taskDispatcher == null) {
            dispatcherDescription = "null";
          } else {
            dispatcherDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) fullscreenFailureBeforeContext), ((StringBuilder) (Object) fullscreenMessagePrefix).append(dispatcherDescription).append(',').append(refreshRate).append(')').toString());
        }
    }

    public static void clearFullscreenEntryResources(int methodGuard) {
        if (methodGuard != -8616) {
            FullscreenEntrySupport.clearFullscreenEntryResources(87);
        }
        thirdVertexTransformedX = null;
    }

    final static void adjustThemeReleaseQuota(int additionalReleases) {
        int clientControlFlowGuard = 0;
        RuntimeException caughtQuotaUpdateFailure = null;
        RuntimeException quotaUpdateFailureForContext = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if ((ArchiveNetworkClient.difficultyStep != 0) &&
              (ArchiveNetworkClient.difficultyStep < 21)) {
            MessageDialogSupport.releasesPerTheme = MessageDialogSupport.releasesPerTheme + 10;
          }
          MessageDialogSupport.releasesPerTheme = MessageDialogSupport.releasesPerTheme + additionalReleases;
          ContextualRuntimeException.releasesPerDifficultyStep = MessageDialogSupport.releasesPerTheme / 3;
          while (MessageDialogSupport.releasesPerTheme > 3 * ContextualRuntimeException.releasesPerDifficultyStep) {
            ContextualRuntimeException.releasesPerDifficultyStep = ContextualRuntimeException.releasesPerDifficultyStep + 1;
          }
          return;
        } catch (java.lang.RuntimeException quotaUpdateFailure) {
          caughtQuotaUpdateFailure = quotaUpdateFailure;
          quotaUpdateFailureForContext = caughtQuotaUpdateFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) quotaUpdateFailureForContext), "qe.B(" + additionalReleases + ')');
        }
    }

    final static void guardArchiveInitializationPlaceholder(ResourceArchive unusedFirstArchive, ResourceArchive unusedSecondArchive, int methodGuard) {
        try {
            if (methodGuard > -66) {
                PlatformTaskDispatcher guardedNullDispatcherSnapshot = (PlatformTaskDispatcher) null;
                FullscreenEntrySupport.enterFullscreenAndWait(91, -118, 58, -45, (PlatformTaskDispatcher) null, -79);
            }
        } catch (RuntimeException placeholderFailureForContext) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) placeholderFailureForContext), "qe.A(" + (unusedFirstArchive != null ? "{...}" : "null") + ',' + (unusedSecondArchive != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    static {
        thirdVertexTransformedX = new int[8192];
    }
}
