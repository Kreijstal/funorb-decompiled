/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UsernameAvailabilityValidator extends TextInputValidator {
    static int[] cameraMeshVertexY;
    private boolean cachedUsernameAvailable;
    static float avatarTintBlueDelta;
    static int receivedRecordIdLow24;
    static String errorReportUserIdentityText;
    static Sprite orbCoinSprite;
    static String[] monthNames;
    private String cachedUsernameCandidate;

    final void invalidateCachedUsernameAvailability(byte methodGuard) {
        this.cachedUsernameCandidate = null;
        if (methodGuard > -78) {
            avatarTintBlueDelta = -0.8683637976646423f;
        }
    }

    final static boolean usernameContainsPasswordOrReverse(int methodGuard, String usernameText, String passwordText) {
        String reversedPasswordText = null;
        boolean containsPasswordOrReverseResult = false;
        RuntimeException comparisonFailureBeforeContext = null;
        StringBuilder comparisonMessagePrefix = null;
        String usernameDescription = null;
        StringBuilder comparisonMessageBeforePassword = null;
        String passwordDescription = null;
        RuntimeException caughtComparisonFailure = null;
        RuntimeException comparisonFailureForContext = null;
        try {
          usernameText = CharacterReplacementSupport.replaceCharacter(usernameText, "", '_', (byte) 119);
          reversedPasswordText = CachedArchiveSource.reverseTextCodeUnits(105, passwordText);
          if (methodGuard != 8) {
            cameraMeshVertexY = (int[]) null;
          }
          containsPasswordOrReverseResult = !(usernameText.indexOf(passwordText) == -1) || !(usernameText.indexOf(reversedPasswordText) == -1);
          return containsPasswordOrReverseResult;
        } catch (java.lang.RuntimeException usernamePasswordComparisonFailure) {
          caughtComparisonFailure = usernamePasswordComparisonFailure;
          comparisonFailureForContext = caughtComparisonFailure;
          comparisonFailureBeforeContext = comparisonFailureForContext;
          comparisonMessagePrefix = new StringBuilder().append("uk.E(").append(methodGuard).append(',');
          if (usernameText == null) {
            usernameDescription = "null";
          } else {
            usernameDescription = "{...}";
          }
          comparisonMessageBeforePassword = ((StringBuilder) (Object) comparisonMessagePrefix).append(usernameDescription).append(',');
          if (passwordText == null) {
            passwordDescription = "null";
          } else {
            passwordDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) comparisonFailureBeforeContext), ((StringBuilder) (Object) comparisonMessageBeforePassword).append(passwordDescription).append(')').toString());
        }
    }

    final static String tutorialMessageForStep(int tutorialStepId, int methodGuard) {
        int stepIdForSelection = 0;
        int unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        if (methodGuard != 24146) {
            orbCoinSprite = (Sprite) null;
            stepIdForSelection = tutorialStepId;
            if (stepIdForSelection == 0) {
                return UsernameSuggestionsPanel.tutorialRotationMessage;
            }
            if (stepIdForSelection == 1) {
                return ByteArrayPoolSupport.tutorialColourMatchMessage;
            }
            if (!(stepIdForSelection == 2)) {
                if (stepIdForSelection == 3) {
                    return ArchiveHandshakeState.tutorialCompleteMessage;
                }
                if (stepIdForSelection == 5) {
                    return AccountCreationForm.tutorialFailedMessage;
                }
                return null;
            }
            return ReceivedTextRecord.tutorialShapeMatchMessage;
        }
        stepIdForSelection = tutorialStepId;
        if (stepIdForSelection == 0) {
            return UsernameSuggestionsPanel.tutorialRotationMessage;
        }
        if (stepIdForSelection == 1) {
            return ByteArrayPoolSupport.tutorialColourMatchMessage;
        }
        if (!(stepIdForSelection == 2)) {
            if (stepIdForSelection == 3) {
                return ArchiveHandshakeState.tutorialCompleteMessage;
            }
            if (stepIdForSelection == 5) {
                return AccountCreationForm.tutorialFailedMessage;
            }
            return null;
        }
        return ReceivedTextRecord.tutorialShapeMatchMessage;
    }

    final static byte[] extractByteStorageBytes(boolean copyArray, int extractionGuard, Object storedBytes) {
        int unusedGuardRemainder = 0;
        RuntimeException extractionFailure = null;
        byte[] arrayBytes = null;
        ByteStorage byteStorage = null;
        Object nullStorageResult = null;
        byte[] copiedArrayResult = null;
        byte[] aliasedArrayResult = null;
        byte[] storageCopyResult = null;
        RuntimeException extractionFailureForDiagnostic = null;
        StringBuilder extractionFailureDiagnostic = null;
        String storageDiagnostic = null;
        RuntimeException caughtExtractionFailure = null;
        try {
          if (storedBytes == null) {
            nullStorageResult = null;
            return (byte[]) (nullStorageResult);
          }
          unusedGuardRemainder = -35 % ((44 - extractionGuard) / 57);
          if (!(storedBytes instanceof byte[])) {
            if (!(storedBytes instanceof ByteStorage)) {
              throw new IllegalArgumentException();
            }
            byteStorage = (ByteStorage) (storedBytes);
            storageCopyResult = byteStorage.copyToByteArray((byte) 65);
            return storageCopyResult;
          }
          arrayBytes = (byte[]) (storedBytes);
          if (!copyArray) {
            aliasedArrayResult = arrayBytes;
            return aliasedArrayResult;
          }
          copiedArrayResult = TextPairLoginPayload.copyBytesWithDestinationOffset(arrayBytes, 0);
          return copiedArrayResult;
        } catch (java.lang.RuntimeException byteExtractionFailure) {
          caughtExtractionFailure = byteExtractionFailure;
          extractionFailure = caughtExtractionFailure;
          extractionFailureForDiagnostic = extractionFailure;
          extractionFailureDiagnostic = new StringBuilder().append("uk.G(").append(copyArray).append(',').append(extractionGuard).append(',');
          if (storedBytes == null) {
            storageDiagnostic = "null";
          } else {
            storageDiagnostic = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) extractionFailureForDiagnostic), ((StringBuilder) (Object) extractionFailureDiagnostic).append(storageDiagnostic).append(')').toString());
        }
    }

    final static void writeEncryptedLoginRequest(int methodGuard, int affiliateId, boolean useLongLoginPayload, LoginPayload loginPayload, boolean enableLoginFlagBitEight) {
        RuntimeException loginFailureBeforeContext = null;
        StringBuilder loginMessagePrefix = null;
        String loginPayloadDescription = null;
        RuntimeException caughtLoginFailure = null;
        int encryptedPayloadStart = 0;
        RuntimeException loginFailureForContext = null;
        int loginFlags = 0;
        String rememberedLoginText = null;
        try {
          ProgressBarWidget.field_D[0] = DelegatingCanvas.sharedClientRandom.nextInt();
          ProgressBarWidget.field_D[1] = DelegatingCanvas.sharedClientRandom.nextInt();
          ProgressBarWidget.field_D[2] = (int)(TextValidationSupport.field_a >> 32);
          ProgressBarWidget.field_D[3] = (int)TextValidationSupport.field_a;
          EndingAnimationSupport.loginPayloadBuffer.position = 0;
          EndingAnimationSupport.loginPayloadBuffer.writeIntBE((byte) 95, ProgressBarWidget.field_D[0]);
          EndingAnimationSupport.loginPayloadBuffer.writeIntBE((byte) 95, ProgressBarWidget.field_D[1]);
          EndingAnimationSupport.loginPayloadBuffer.writeIntBE((byte) 95, ProgressBarWidget.field_D[2]);
          EndingAnimationSupport.loginPayloadBuffer.writeIntBE((byte) 95, ProgressBarWidget.field_D[3]);
          SpriteState.a(EndingAnimationSupport.loginPayloadBuffer, true);
          EndingAnimationSupport.loginPayloadBuffer.writeShortBE(affiliateId, 28695);
          loginPayload.writePayload(124, EndingAnimationSupport.loginPayloadBuffer);
          CacheReference.outgoingSessionBuffer.position = 0;
          if (useLongLoginPayload) {
            CacheReference.outgoingSessionBuffer.writeByte((byte) 121, 18);
          } else {
            CacheReference.outgoingSessionBuffer.writeByte((byte) -116, 16);
          }
          CacheReference.outgoingSessionBuffer.position = CacheReference.outgoingSessionBuffer.position + 2;
          encryptedPayloadStart = CacheReference.outgoingSessionBuffer.position;
          CacheReference.outgoingSessionBuffer.writeIntBE((byte) 95, MessageDialog.loginHeaderInt);
          CacheReference.outgoingSessionBuffer.writeLongBE((byte) 116, SessionInstanceState.clientInstanceId);
          loginFlags = 0;
          if (methodGuard <= 20) {
            return;
          }
          if (FontLoadingSupport.memberAccountMode) {
            loginFlags = loginFlags | 1;
          }
          if (GameGraphicsResources.loginResponseExtensionEnabled) {
            loginFlags = loginFlags | 4;
          }
          if (enableLoginFlagBitEight) {
            loginFlags = loginFlags | 8;
          }
          if (null != GameSoundResources.optionalLoginText) {
            loginFlags = loginFlags | 16;
          }
          CacheReference.outgoingSessionBuffer.writeByte((byte) 127, loginFlags);
          rememberedLoginText = Under13TermsPanel.a(-1, NodeHashTableIterator.getActiveApplet(111));
          if (rememberedLoginText == null) {
            rememberedLoginText = "";
          }
          CacheReference.outgoingSessionBuffer.writeNullTerminatedText(rememberedLoginText, 0);
          if (null != GameSoundResources.optionalLoginText) {
            CacheReference.outgoingSessionBuffer.writeZeroPrefixedNullTerminatedText(GameSoundResources.optionalLoginText, (byte) -126);
          }
          UiWidget.appendRsaXteaEncryptedBuffer(false, EndingAnimationSupport.loginPayloadBuffer, CacheReference.outgoingSessionBuffer, PlayfieldRules.loginModPowExponent, InstrumentPatch.loginModPowModulus);
          CacheReference.outgoingSessionBuffer.backpatchLengthShortBE(-encryptedPayloadStart + CacheReference.outgoingSessionBuffer.position, true);
          NanoFrameTimer.flushSessionWrites(-1, -1);
          return;
        } catch (java.lang.RuntimeException encryptedLoginWriteFailure) {
          caughtLoginFailure = encryptedLoginWriteFailure;
          loginFailureForContext = caughtLoginFailure;
          loginFailureBeforeContext = loginFailureForContext;
          loginMessagePrefix = new StringBuilder().append("uk.I(").append(methodGuard).append(',').append(affiliateId).append(',').append(useLongLoginPayload).append(',');
          if (loginPayload == null) {
            loginPayloadDescription = "null";
          } else {
            loginPayloadDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) loginFailureBeforeContext), ((StringBuilder) (Object) loginMessagePrefix).append(loginPayloadDescription).append(',').append(enableLoginFlagBitEight).append(')').toString());
        }
    }

    final String validationMessageForText(int guard, String candidateText) {
        String localNameError = null;
        RuntimeException messageFailureForContext = null;
        UsernameAvailabilityQuery availabilityQuery = null;
        CharSequence candidateCharacters = null;
        String localNameErrorBeforeReturn = null;
        Object pendingQueryNullMessage = null;
        String unavailableUsernameMessage = null;
        String availableUsernameMessage = null;
        RuntimeException messageFailureBeforeContext = null;
        StringBuilder messagePrefix = null;
        String candidateDescription = null;
        RuntimeException caughtMessageFailure = null;
        try {
          candidateCharacters = (CharSequence) ((Object) candidateText);
          localNameError = ResizableDialog.getAccountNameValidationError((byte) 44, candidateCharacters);
          if (localNameError != null) {
            localNameErrorBeforeReturn = localNameError;
            return localNameErrorBeforeReturn;
          }
          if (!candidateText.equals(this.cachedUsernameCandidate)) {
            availabilityQuery = UsernameQuerySupport.requestOrReuseUsernameQuery((byte) 94, candidateText);
            if (availabilityQuery == null) {
              return null;
            }
            if (null != availabilityQuery.candidateOrFailureText) {
              pendingQueryNullMessage = null;
              return (String) (pendingQueryNullMessage);
            }
            this.cachedUsernameCandidate = candidateText;
            this.cachedUsernameAvailable = availabilityQuery.accepted;
          }
          if (guard != 422) {
            avatarTintBlueDelta = -0.46423107385635376f;
          }
          if (this.cachedUsernameAvailable) {
            availableUsernameMessage = ByteShortQuery.createUsernameAvailableText;
            return availableUsernameMessage;
          }
          unavailableUsernameMessage = ResourceArchive.createUsernameUnavailableText;
          return unavailableUsernameMessage;
        } catch (java.lang.RuntimeException usernameMessageFailure) {
          caughtMessageFailure = usernameMessageFailure;
          messageFailureForContext = caughtMessageFailure;
          messageFailureBeforeContext = messageFailureForContext;
          messagePrefix = new StringBuilder().append("uk.A(").append(guard).append(',');
          if (candidateText == null) {
            candidateDescription = "null";
          } else {
            candidateDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) messageFailureBeforeContext), ((StringBuilder) (Object) messagePrefix).append(candidateDescription).append(')').toString());
        }
    }

    UsernameAvailabilityValidator(TextInputWidget input) {
        super(input);
        this.cachedUsernameAvailable = false;
    }

    final ValidationState validationStateForText(int guard, String candidateText) {
        UsernameAvailabilityQuery availabilityQuery = null;
        RuntimeException stateFailureForContext = null;
        String unusedNullNavigationTarget = null;
        CharSequence candidateCharacters = null;
        ValidationState invalidNameState = null;
        ValidationState pendingUsernameState = null;
        ValidationState availabilityState = null;
        RuntimeException stateFailureBeforeContext = null;
        StringBuilder stateMessagePrefix = null;
        String candidateDescription = null;
        RuntimeException caughtStateFailure = null;
        try {
          if (guard != -257) {
            unusedNullNavigationTarget = (String) null;
            UsernameAvailabilityValidator.requestNavigationToSharedTarget(false, (String) null);
          }
          candidateCharacters = (CharSequence) ((Object) candidateText);
          if (!ValidatedTextInputWidget.isValidAccountName((byte) 82, candidateCharacters)) {
            invalidNameState = WidgetSkinState.invalidInputValidationState;
            return invalidNameState;
          }
          if (!candidateText.equals(this.cachedUsernameCandidate)) {
            availabilityQuery = UsernameQuerySupport.requestOrReuseUsernameQuery((byte) 108, candidateText);
            if ((availabilityQuery != null) &&
                (availabilityQuery.candidateOrFailureText == null)) {
              this.cachedUsernameAvailable = availabilityQuery.accepted;
              this.cachedUsernameCandidate = candidateText;
            } else {
              pendingUsernameState = WidgetSkinState.pendingQueryValidationState;
              return pendingUsernameState;
            }
          }
          if (this.cachedUsernameAvailable) {
            availabilityState = SocketArchiveNetworkClient.validInputValidationState;
          } else {
            availabilityState = WidgetSkinState.invalidInputValidationState;
          }
          return availabilityState;
        } catch (java.lang.RuntimeException usernameStateFailure) {
          caughtStateFailure = usernameStateFailure;
          stateFailureForContext = caughtStateFailure;
          stateFailureBeforeContext = stateFailureForContext;
          stateMessagePrefix = new StringBuilder().append("uk.D(").append(guard).append(',');
          if (candidateText == null) {
            candidateDescription = "null";
          } else {
            candidateDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stateFailureBeforeContext), ((StringBuilder) (Object) stateMessagePrefix).append(candidateDescription).append(')').toString());
        }
    }

    final static boolean ensureAndCheckAchievementStateGate(int methodGuard) {
        if (methodGuard < 29) {
            orbCoinSprite = (Sprite) null;
            LoginPayloadKind.ensureAchievementStateRequested(9313);
            if (!UnderlinedButtonRenderer.c(-117)) {
                return SpriteConstructionSupport.achievementMaskReceived ? true : false;
            }
            return true;
        }
        LoginPayloadKind.ensureAchievementStateRequested(9313);
        if (UnderlinedButtonRenderer.c(-117)) {
            return true;
        }
        if (!SpriteConstructionSupport.achievementMaskReceived) {
            return false;
        }
        return true;
    }

    final static void requestNavigationToSharedTarget(boolean cleanupGuard, String navigationTarget) {
        try {
            if (cleanupGuard) {
                UsernameAvailabilityValidator.releaseUsernameValidatorSharedResources((byte) 81);
            }
            CanvasResizeController.field_e = navigationTarget;
            MidiNote.setPendingLoginUiAction(12, cleanupGuard);
        } catch (RuntimeException navigationRequestFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) navigationRequestFailure), "uk.H(" + cleanupGuard + ',' + (navigationTarget != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseUsernameValidatorSharedResources(byte methodGuard) {
        if (methodGuard >= 70) {
            orbCoinSprite = null;
            errorReportUserIdentityText = null;
            cameraMeshVertexY = null;
            monthNames = null;
            return;
        }
        orbCoinSprite = (Sprite) null;
        orbCoinSprite = null;
        errorReportUserIdentityText = null;
        cameraMeshVertexY = null;
        monthNames = null;
    }

    static {
        cameraMeshVertexY = new int[8192];
        monthNames = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
