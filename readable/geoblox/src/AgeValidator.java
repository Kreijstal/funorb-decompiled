/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AgeValidator extends TextInputValidator {
    static boolean gameArchiveRequestPending;
    static String restartTutorialText;
    static boolean reconnectingLoginMode;

    final static void markAccountIneligibleAndMaybeRequestGameArchives(int methodGuard) {
        GrowableIntList.a(NodeHashTableIterator.getActiveApplet(108), (byte) 110);
        if (methodGuard >= -24) {
            gameArchiveRequestPending = true;
        }
    }

    final ValidationState validationStateForText(int guard, String candidateText) {
        int parsedAge = 0;
        RuntimeException ageFailureForContext = null;
        CharSequence candidateForSyntaxCheck = null;
        CharSequence candidateForParsing = null;
        ValidationState invalidSyntaxState = null;
        ValidationState invalidRangeState = null;
        ValidationState validAgeState = null;
        RuntimeException ageFailureBeforeContext = null;
        StringBuilder ageMessagePrefix = null;
        String candidateDescription = null;
        RuntimeException caughtAgeFailure = null;
        try {
          if (guard != -257) {
            gameArchiveRequestPending = false;
          }
          candidateForSyntaxCheck = (CharSequence) ((Object) candidateText);
          if (!MessageDialog.isSignedDecimalInt((byte) -123, candidateForSyntaxCheck)) {
            invalidSyntaxState = WidgetSkinState.invalidInputValidationState;
            return invalidSyntaxState;
          }
          candidateForParsing = (CharSequence) ((Object) candidateText);
          parsedAge = MultiHandleSliderWidget.parseSignedDecimalInt(false, candidateForParsing);
          if ((parsedAge > 0) &&
              (130 >= parsedAge)) {
            validAgeState = SocketArchiveNetworkClient.validInputValidationState;
            return validAgeState;
          }
          invalidRangeState = WidgetSkinState.invalidInputValidationState;
          return invalidRangeState;
        } catch (java.lang.RuntimeException ageValidationFailure) {
          caughtAgeFailure = ageValidationFailure;
          ageFailureForContext = caughtAgeFailure;
          ageFailureBeforeContext = ageFailureForContext;
          ageMessagePrefix = new StringBuilder().append("cf.D(").append(guard).append(',');
          if (candidateText == null) {
            candidateDescription = "null";
          } else {
            candidateDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) ageFailureBeforeContext), ((StringBuilder) (Object) ageMessagePrefix).append(candidateDescription).append(')').toString());
        }
    }

    public static void releaseRestartTutorialText(int methodGuard) {
        restartTutorialText = null;
        if (methodGuard > -11) {
            restartTutorialText = (String) null;
        }
    }

    final String validationMessageForText(int guard, String candidateText) {
        RuntimeException messageFailureForContext = null;
        String invalidAgeMessage = null;
        String guardedNullMessage = null;
        RuntimeException messageFailureBeforeContext = null;
        StringBuilder messagePrefix = null;
        String candidateDescription = null;
        RuntimeException caughtMessageFailure = null;
        try {
          if (this.validationStateForText(-257, candidateText) == WidgetSkinState.invalidInputValidationState) {
            invalidAgeMessage = UsernameAvailabilityQuery.createInvalidAgeAlertText;
            return invalidAgeMessage;
          }
          if (guard == 422) {
            return null;
          }
          guardedNullMessage = (String) null;
          return guardedNullMessage;
        } catch (java.lang.RuntimeException ageMessageFailure) {
          caughtMessageFailure = ageMessageFailure;
          messageFailureForContext = caughtMessageFailure;
          messageFailureBeforeContext = messageFailureForContext;
          messagePrefix = new StringBuilder().append("cf.A(").append(guard).append(',');
          if (candidateText == null) {
            candidateDescription = "null";
          } else {
            candidateDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) messageFailureBeforeContext), ((StringBuilder) (Object) messagePrefix).append(candidateDescription).append(')').toString());
        }
    }

    final static AchievementQuery requestAchievementState(int packetOpcode, int methodGuard) {
        AchievementQuery query = new AchievementQuery();
        NodeHashTableIterator.pendingAchievementQueries.addLast(-49, query);
        int guardDivision = -104 / ((-51 - methodGuard) / 44);
        RankedListQuery.writeAchievementStateRequest(-78, packetOpcode);
        return query;
    }

    final static void advanceScorePopups(byte methodGuard) {
        ScorePopup popup = null;
        int controlFlowGuard = 0;
        RuntimeException caughtPopupFailure = null;
        RuntimeException popupFailureForContext = null;
        controlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard < 8) {
            AgeValidator.isFirstReflectionCheckReady((byte) 121);
          }
          popup = (ScorePopup) ((Object) GmtTimestampSupport.activeScorePopups.firstForIteration(0));
          while (popup != null) {
            if (!(popup.progress >= 1.0f)) {
              popup.progress = popup.progress + (0.03999999910593033f * popup.progress + 0.00004999999873689376f);
            } else {
              if (popup.chainMultiplier != 1) {
                UiWidget.gameplaySession.addPopupPoints(popup.points, -73);
                PcmResampler.availableScorePopups.addLast(-35, popup);
              } else {
                UiWidget.gameplaySession.addScore((byte) 127, popup.points);
                PcmResampler.availableScorePopups.addLast(-35, popup);
              }
            }
            popup = (ScorePopup) ((Object) GmtTimestampSupport.activeScorePopups.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException popupAdvanceFailure) {
          caughtPopupFailure = popupAdvanceFailure;
          popupFailureForContext = caughtPopupFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) popupFailureForContext), "cf.F(" + methodGuard + ')');
        }
    }

    final static boolean isFirstReflectionCheckReady(byte methodGuard) {
        int operationIndex = 0;
        ReflectionCheckRequest requestAlias = null;
        RuntimeException readinessFailureForContext = null;
        int unusedClientControlSnapshot = 0;
        ReflectionCheckRequest requestFromQueue = null;
        RuntimeException caughtReadinessFailure = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != -114) {
            return true;
          }
          requestFromQueue = (ReflectionCheckRequest) ((Object) UsernameAvailabilityQuery.reflectionCheckRequests.firstForIteration(0));
          requestAlias = requestFromQueue;
          if (requestAlias == null) {
            return false;
          }
          for (operationIndex = 0; requestAlias.operationCount > operationIndex; operationIndex++) {
            if ((null != requestFromQueue.fieldLookupTasks[operationIndex]) &&
                (requestFromQueue.fieldLookupTasks[operationIndex].status == 0)) {
              return false;
            }
            if ((requestFromQueue.methodLookupTasks[operationIndex] != null) &&
                (requestFromQueue.methodLookupTasks[operationIndex].status == 0)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException reflectionReadinessFailure) {
          caughtReadinessFailure = reflectionReadinessFailure;
          readinessFailureForContext = caughtReadinessFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) readinessFailureForContext), "cf.C(" + methodGuard + ')');
        }
    }

    AgeValidator(TextInputWidget input) {
        super(input);
    }

    static {
        restartTutorialText = "Restart tutorial";
    }
}
