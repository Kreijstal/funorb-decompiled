/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UsernameResponseSupport {
    static int spawnReleaseIntervalTicks;
    static int accountUiViewportWidth;
    static int thirdScoreContextCounter;
    static int[] bzip2TransformTable;

    final static void handleUsernameResponse(int responseCode, int methodGuard, String[] suggestions, String candidateText) {
        RuntimeException responseFailureForContext = null;
        int clientControlFlowGuard = 0;
        String[] unusedNullSuggestionsSnapshot = null;
        String[] unusedSuggestionsAlias = null;
        int acceptedQueryGuard = 0;
        boolean under13Snapshot = false;
        RuntimeException responseFailureBeforeContext = null;
        StringBuilder responseMessagePrefix = null;
        String suggestionsDescription = null;
        StringBuilder responseMessageBeforeCandidate = null;
        String candidateDescription = null;
        RuntimeException caughtResponseFailure = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != 6568) {
            return;
          }
          WidgetSkinState.usernameQueryFlowState = MeshPrioritySupport.completedClientFlowToken;
          if (responseCode != 255) {
            if (responseCode < 100) {
              ScorePopup.pendingUsernameResult = RankedComparisonSupport.createUsernameResponseQuery(candidateText, responseCode, false);
              return;
            }
            if (responseCode > 105) {
              ScorePopup.pendingUsernameResult = RankedComparisonSupport.createUsernameResponseQuery(candidateText, responseCode, false);
              return;
            }
            unusedSuggestionsAlias = suggestions;
            SoundSampleCache.a(unusedSuggestionsAlias, 416577356);
            ScorePopup.pendingUsernameResult = TextInputRenderer.createSuggestedUsernameQuery(methodGuard - 6540, suggestions);
            return;
          }
          acceptedQueryGuard = methodGuard ^ 6648;
          if (StatefulWidgetRenderer.accountCreationAgeYears >= 13) {
            under13Snapshot = false;
          } else {
            under13Snapshot = true;
          }
          ScorePopup.pendingUsernameResult = UiFontResources.createAcceptedUsernameQuery(acceptedQueryGuard, under13Snapshot);
          unusedNullSuggestionsSnapshot = (String[]) null;
          SoundSampleCache.a((String[]) null, 416577356);
          return;
        } catch (java.lang.RuntimeException responseFailure) {
          caughtResponseFailure = responseFailure;
          responseFailureForContext = caughtResponseFailure;
          responseFailureBeforeContext = responseFailureForContext;
          responseMessagePrefix = new StringBuilder().append("kb.D(").append(responseCode).append(',').append(methodGuard).append(',');
          if (suggestions == null) {
            suggestionsDescription = "null";
          } else {
            suggestionsDescription = "{...}";
          }
          responseMessageBeforeCandidate = ((StringBuilder) (Object) responseMessagePrefix).append(suggestionsDescription).append(',');
          if (candidateText == null) {
            candidateDescription = "null";
          } else {
            candidateDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) responseFailureBeforeContext), ((StringBuilder) (Object) responseMessageBeforeCandidate).append(candidateDescription).append(')').toString());
        }
    }

    final static void returnToLoginStage(int methodGuard) {
        if (!ProgressBarWidget.guestSessionMode) {
            throw new IllegalStateException();
        }
        AccountEligibilitySupport.loginReturnAllowed = true;
        TextInputValidator.openAccountLoginPanel((byte) 123, true);
        SpriteConstructionSupport.clientScreenStage = 0;
        if (methodGuard < -90) {
            return;
        }
        UsernameResponseSupport.clearUsernameAndCompressionResources(-89);
    }

    final static void renderDimmedAccountUi(boolean unusedRenderOption, boolean methodGuard) {
        if (methodGuard) {
            return;
        }
        PcmResampler.a(unusedRenderOption, true, (byte) -102);
    }

    final static void settleAccountDialogAnimations(int methodGuard) {
        int guardResidue = 0;
        if (null != ClientFlowState.accountDialogLayer) {
            ClientFlowState.accountDialogLayer.settleDialogAnimations(0);
            if (SecondaryNodeHashTable.accountProgressDialog != null) {
                SecondaryNodeHashTable.accountProgressDialog.stopNormalAnimation(23181);
                LogoCompositor.resetUiInteractionState((byte) -2);
                guardResidue = -121 % ((-38 - methodGuard) / 59);
                return;
            }
            LogoCompositor.resetUiInteractionState((byte) -2);
            guardResidue = -121 % ((-38 - methodGuard) / 59);
            return;
        }
        if (SecondaryNodeHashTable.accountProgressDialog == null) {
            LogoCompositor.resetUiInteractionState((byte) -2);
            guardResidue = -121 % ((-38 - methodGuard) / 59);
            return;
        }
        SecondaryNodeHashTable.accountProgressDialog.stopNormalAnimation(23181);
        LogoCompositor.resetUiInteractionState((byte) -2);
        guardResidue = -121 % ((-38 - methodGuard) / 59);
    }

    public static void clearUsernameAndCompressionResources(int methodGuard) {
        if (methodGuard != 105) {
            spawnReleaseIntervalTicks = 71;
            bzip2TransformTable = null;
            return;
        }
        bzip2TransformTable = null;
    }

    static {
        accountUiViewportWidth = 640;
    }
}
