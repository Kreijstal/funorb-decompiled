/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class LoginPanel extends WidgetContainer implements TextInputListener, ButtonActivationListener {
    private String messageText;
    static ResourceArchive namedRootResourceArchive;
    private TextInputWidget passwordInput;
    private boolean showCreateAccount;
    private ButtonWidget alternateButton;
    private static ClientProtocolStage awaitingAccountOrLookupReplyOpcodeStage;
    static boolean endingEntityScanClear;
    private boolean allowJustPlay;
    private ButtonWidget createAccountButton;
    private TextInputWidget loginIdentifierInput;
    private ButtonWidget loginOrRetryButton;
    static String js5CrcErrorText;
    private boolean retryMode;

    final static boolean isAsciiLetterOrDigit(int methodGuard, char character) {
        PacketBuffer unusedNullReplyBuffer;
        boolean isAsciiLetterOrDigitResult = false;
        if (methodGuard != -123) {
          unusedNullReplyBuffer = (PacketBuffer) null;
          LoginPanel.writeReflectionCheckReply(-108, (PacketBuffer) null);
        }
        isAsciiLetterOrDigitResult = !((character < 48 ||
              character > 57) &&
            (character < 65 ||
              character > 90) &&
            (character < 97 ||
              character > 122));
        return isAsciiLetterOrDigitResult;
    }

    final static void handleIntRecordReply(int methodGuard) {
        int responseByteIndex = 0;
        RuntimeException caughtIntRecordFailure = null;
        RuntimeException intRecordFailureForContext = null;
        int replyType = 0;
        int byteKey = 0;
        int signedSmartKey = 0;
        IntArrayQuery headIntArrayQuery = null;
        KeyedIntRecordSubmission matchingSubmission = null;
        int payloadBytesToRead = 0;
        int[] responseWordsAlias = null;
        int unusedClientControlSnapshot = 0;
        PacketBuffer replyBuffer = null;
        int[] intermediateResponseWordsAlias = null;
        int[] queryResponseWords = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          intRecordReplyDispatch: {
            replyBuffer = LogoCompositor.sessionPacketBuffer;
            replyType = replyBuffer.readUnsignedByte((byte) 34);
            byteKey = replyBuffer.readUnsignedByte((byte) 34);
            if (0 == replyType) {
              headIntArrayQuery = (IntArrayQuery) ((Object) IntArrayQuery.pendingIntArrayQueries.firstForIteration(0));
              if (headIntArrayQuery == null) {
                Bzip2DecoderState.closeSessionSocket((byte) -116);
                return;
              }
              payloadBytesToRead = -replyBuffer.position + AchievementSubmission.sessionPacketPayloadLength;
              queryResponseWords = headIntArrayQuery.responseWords;
              intermediateResponseWordsAlias = queryResponseWords;
              responseWordsAlias = intermediateResponseWordsAlias;
              if (payloadBytesToRead > queryResponseWords.length << 2) {
                payloadBytesToRead = queryResponseWords.length << 2;
              }
              for (responseByteIndex = 0; payloadBytesToRead > responseByteIndex; responseByteIndex++) {
                responseWordsAlias[responseByteIndex >> 2] = responseWordsAlias[responseByteIndex >> 2] + (replyBuffer.readUnsignedByte((byte) 34) << ProxySocketConnector.andInt(responseByteIndex << 8, 768));
              }
              headIntArrayQuery.unlinkNode(false);
            } else {
              if (replyType == 1) {
                signedSmartKey = replyBuffer.readSignedSmart(76);
                matchingSubmission = (KeyedIntRecordSubmission) ((Object) GrowableIntList.pendingIntRecordSubmissions.firstForIteration(0));
                while (matchingSubmission != null) {
                  if (matchingSubmission.byteKey != byteKey ||
                      matchingSubmission.signedSmartKey != signedSmartKey) {
                    matchingSubmission = (KeyedIntRecordSubmission) ((Object) GrowableIntList.pendingIntRecordSubmissions.nextForIteration(1));
                    continue;
                  }
                  break;
                }
                if (matchingSubmission != null) {
                  matchingSubmission.unlinkNode(false);
                  break intRecordReplyDispatch;
                }
                Bzip2DecoderState.closeSessionSocket((byte) -116);
                return;
              }
              IterableNodeHashTable.reportClientError((Throwable) null, "LR1: " + TextTemplateDefinition.formatSessionPacketDiagnostic(55), (byte) 125);
              Bzip2DecoderState.closeSessionSocket((byte) -123);
            }
          }
          if (methodGuard >= -95) {
            namedRootResourceArchive = (ResourceArchive) null;
          }
          return;
        } catch (java.lang.RuntimeException intRecordReplyFailure) {
          caughtIntRecordFailure = intRecordReplyFailure;
          intRecordFailureForContext = caughtIntRecordFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) intRecordFailureForContext), "pf.K(" + methodGuard + ')');
        }
    }

    public static void releaseLoginPanelSharedResources(byte methodGuard) {
        js5CrcErrorText = null;
        awaitingAccountOrLookupReplyOpcodeStage = null;
        namedRootResourceArchive = null;
        if (methodGuard >= -18) {
            LoginPanel.releaseLoginPanelSharedResources((byte) -108);
        }
    }

    public final void onTextInputSubmitted(TextInputWidget input, int methodGuard) {
        RuntimeException submissionFailureForContext = null;
        StringBuilder submissionContextBuilder = null;
        String inputDescription = null;
        RuntimeException caughtSubmissionFailure = null;
        RuntimeException textSubmissionFailure = null;
        try {
          if (input == this.loginIdentifierInput) {
            this.passwordInput.requestKeyboardFocus((byte) -69, (UiWidget) (this));
          }
          if (this.passwordInput == input) {
            this.submitLoginIfAllowed(methodGuard ^ -18649);
          }
          if (methodGuard != -18649) {
            namedRootResourceArchive = (ResourceArchive) null;
          }
          return;
        } catch (java.lang.RuntimeException submissionFailure) {
          caughtSubmissionFailure = submissionFailure;
          textSubmissionFailure = caughtSubmissionFailure;
          submissionFailureForContext = textSubmissionFailure;
          submissionContextBuilder = new StringBuilder().append("pf.S(");
          if (input == null) {
            inputDescription = "null";
          } else {
            inputDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) submissionFailureForContext), ((StringBuilder) (Object) submissionContextBuilder).append(inputDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final void setLoginIdentifierAndClearPassword(String loginIdentifier, int methodGuard) {
        TextInputWidget targetIdentifierInput = null;
        String identifierTextToSet = null;
        try {
            targetIdentifierInput = this.loginIdentifierInput;
            identifierTextToSet = loginIdentifier;
            targetIdentifierInput.setInputText(methodGuard ^ 2, identifierTextToSet, false);
            if (methodGuard != 0) {
                this.clearLoginInputs(114);
            }
            this.passwordInput.clearInputText((byte) 110);
        } catch (RuntimeException identifierUpdateFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) identifierUpdateFailure), "pf.C(" + (loginIdentifier != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        if (this.messageText != null) {
            DialogLayer.sharedUiFont.drawParagraph(this.messageText, this.widgetX + parentX + 20, 15 + this.widgetY + parentY, -40 + this.widgetWidth, this.widgetHeight, 16777215, -1, 1, 0, DialogLayer.sharedUiFont.maxAscent);
        }
        if (null != this.createAccountButton) {
            SoftwareRasterizer.drawHorizontalLine(10 + parentX, 134 + parentY, -20 + this.widgetWidth, 4210752);
        }
        int guardResidue = 20 / ((methodGuard - 1) / 43);
        super.renderWidget(parentX, parentY, (byte) -48, renderPass);
    }

    public final void onTextInputChanged(TextInputWidget input, byte methodGuard) {
        try {
            if (methodGuard != 74) {
                js5CrcErrorText = (String) null;
            }
        } catch (RuntimeException textChangeFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) textChangeFailure), "pf.J(" + (input != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    final boolean handleKeyInput(int keyCode, int methodGuard, char typedCharacter, UiWidget eventContext) {
        RuntimeException keyFailureForContext = null;
        boolean previousFocusResult = false;
        boolean nextFocusResult = false;
        RuntimeException keyFailureBeforeContext = null;
        StringBuilder keyMessagePrefix = null;
        String eventContextDescription = null;
        RuntimeException caughtKeyFailure = null;
        try {
          if (super.handleKeyInput(keyCode, methodGuard, typedCharacter, eventContext)) {
            return true;
          }
          if (98 == keyCode) {
            previousFocusResult = this.requestPreviousChildFocus(7305, eventContext);
            return previousFocusResult;
          }
          if (keyCode != 99) {
            return false;
          }
          nextFocusResult = this.requestNextChildFocus(eventContext, -109);
          return nextFocusResult;
        } catch (java.lang.RuntimeException keyInputFailure) {
          caughtKeyFailure = keyInputFailure;
          keyFailureForContext = caughtKeyFailure;
          keyFailureBeforeContext = keyFailureForContext;
          keyMessagePrefix = new StringBuilder().append("pf.I(").append(keyCode).append(',').append(methodGuard).append(',').append(typedCharacter).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) keyFailureBeforeContext), ((StringBuilder) (Object) keyMessagePrefix).append(eventContextDescription).append(')').toString());
        }
    }

    final String getLoginIdentifierOrEmpty(int methodGuard) {
        if (null == this.loginIdentifierInput.widgetText) {
            return "";
        }
        if (methodGuard < 62) {
            UiWidget unusedNullKeyEventContext = (UiWidget) null;
            this.handleKeyInput(28, 70, '"', (UiWidget) null);
        }
        return this.loginIdentifierInput.widgetText;
    }

    final static int advanceAccountCreationOrLookupRequest(int affiliateId, int ageYears, LoginTextValue loginIdentifierValue, LoginTextValue emailValue, String passwordText, boolean newsOptIn, int methodGuard) {
        int suggestionIndex = 0;
        int socketNotReadyResult = 0;
        ByteArrayBuffer identifierPayloadBuffer = null;
        String includedIdentifierText = null;
        ByteArrayBuffer emailPayloadBuffer = null;
        String includedEmailText = null;
        int unableResponseBeforeReturn = 0;
        int suggestionResponseBeforeReturn = 0;
        int payloadOpcodeBeforeReturn = 0;
        int retryFailureBeforeReturn = 0;
        int pendingResultBeforeReturn = 0;
        RuntimeException requestFailureBeforeContext = null;
        StringBuilder requestMessagePrefix = null;
        String identifierValueDescription = null;
        StringBuilder requestMessageBeforeEmail = null;
        String emailValueDescription = null;
        StringBuilder requestMessageBeforePassword = null;
        String passwordDescription = null;
        RuntimeException caughtRequestFailure = null;
        RuntimeException requestFailureForContext = null;
        String emailText = null;
        int requestFlagsOrPayloadStart = 0;
        String settingsCookieText = null;
        int creationPayloadStartOrSuggestionPayloadLength = 0;
        String rememberedLoginText = null;
        int suggestionCount = 0;
        String loginIdentifierText = null;
        CharSequence passwordCharacters = null;
        int suggestionPayloadLength;
        int replyOpcode;
        int replyReadLength;
        int previousSessionPort;
        try {
          loginIdentifierText = loginIdentifierValue.getText(16925);
          emailText = emailValue.getText(16925);
          if (SpriteCheckboxRenderer.sessionSocket == null &&
              !SessionSocketSupport.pollSessionSocketOpening(false, 52)) {
            socketNotReadyResult = -1;
            return socketNotReadyResult;
          }
          if (IterableNodeHashTable.requestReadyStage == PacketBuffer.currentProtocolStage) {
            CacheReference.outgoingSessionBuffer.position = 0;
            IntrusiveNodeHashTable.pendingLoginBooleanReply = null;
            if (passwordText != null) {
              requestFlagsOrPayloadStart = 0;
              EndingAnimationSupport.loginPayloadBuffer.position = 0;
              if (newsOptIn) {
                requestFlagsOrPayloadStart = requestFlagsOrPayloadStart | 1;
              }
              EndingAnimationSupport.loginPayloadBuffer.writeIntBE((byte) 95, DelegatingCanvas.sharedClientRandom.nextInt());
              EndingAnimationSupport.loginPayloadBuffer.writeIntBE((byte) 95, DelegatingCanvas.sharedClientRandom.nextInt());
              EndingAnimationSupport.loginPayloadBuffer.writeZeroPrefixedNullTerminatedText(loginIdentifierText, (byte) -126);
              EndingAnimationSupport.loginPayloadBuffer.writeZeroPrefixedNullTerminatedText(emailText, (byte) -126);
              passwordCharacters = (CharSequence) ((Object) passwordText);
              EndingAnimationSupport.loginPayloadBuffer.writeZeroPrefixedNullTerminatedText(UsernameAvailabilityQuery.normalizePasswordForPacket(passwordCharacters, 48), (byte) -126);
              EndingAnimationSupport.loginPayloadBuffer.writeShortBE(affiliateId, 28695);
              EndingAnimationSupport.loginPayloadBuffer.writeByte((byte) -94, ageYears);
              EndingAnimationSupport.loginPayloadBuffer.writeByte((byte) 123, requestFlagsOrPayloadStart);
              CacheReference.outgoingSessionBuffer.writeByte((byte) 127, 18);
              CacheReference.outgoingSessionBuffer.position = CacheReference.outgoingSessionBuffer.position + 2;
              creationPayloadStartOrSuggestionPayloadLength = CacheReference.outgoingSessionBuffer.position;
              rememberedLoginText = Under13TermsPanel.readSettingsCookieOrFallback(-1, NodeHashTableIterator.getActiveApplet(105));
              if (rememberedLoginText == null) {
                rememberedLoginText = "";
              }
              CacheReference.outgoingSessionBuffer.writeNullTerminatedText(rememberedLoginText, 0);
              UiWidget.appendRsaXteaEncryptedBuffer(false, EndingAnimationSupport.loginPayloadBuffer, CacheReference.outgoingSessionBuffer, PlayfieldRules.loginModPowExponent, InstrumentPatch.loginModPowModulus);
              CacheReference.outgoingSessionBuffer.backpatchLengthShortBE(-creationPayloadStartOrSuggestionPayloadLength + CacheReference.outgoingSessionBuffer.position, true);
            } else {
              EndingAnimationSupport.loginPayloadBuffer.position = 0;
              EndingAnimationSupport.loginPayloadBuffer.writeIntBE((byte) 95, DelegatingCanvas.sharedClientRandom.nextInt());
              EndingAnimationSupport.loginPayloadBuffer.writeIntBE((byte) 95, DelegatingCanvas.sharedClientRandom.nextInt());
              identifierPayloadBuffer = EndingAnimationSupport.loginPayloadBuffer;
              if (!loginIdentifierValue.isIncludedInLookupRequest((byte) 97)) {
                includedIdentifierText = "";
              } else {
                includedIdentifierText = loginIdentifierText;
              }
              ((ByteArrayBuffer) (Object) identifierPayloadBuffer).writeZeroPrefixedNullTerminatedText(includedIdentifierText, (byte) -126);
              emailPayloadBuffer = EndingAnimationSupport.loginPayloadBuffer;
              if (!emailValue.isIncludedInLookupRequest((byte) 126)) {
                includedEmailText = "";
              } else {
                includedEmailText = emailText;
              }
              ((ByteArrayBuffer) (Object) emailPayloadBuffer).writeZeroPrefixedNullTerminatedText(includedEmailText, (byte) -126);
              CacheReference.outgoingSessionBuffer.writeByte((byte) 124, 16);
              CacheReference.outgoingSessionBuffer.position = CacheReference.outgoingSessionBuffer.position + 1;
              requestFlagsOrPayloadStart = CacheReference.outgoingSessionBuffer.position;
              UiWidget.appendRsaXteaEncryptedBuffer(false, EndingAnimationSupport.loginPayloadBuffer, CacheReference.outgoingSessionBuffer, PlayfieldRules.loginModPowExponent, InstrumentPatch.loginModPowModulus);
              CacheReference.outgoingSessionBuffer.backpatchLengthByte(11700, CacheReference.outgoingSessionBuffer.position - requestFlagsOrPayloadStart);
            }
            NanoFrameTimer.flushSessionWrites(-1, -1);
            PacketBuffer.currentProtocolStage = awaitingAccountOrLookupReplyOpcodeStage;
          }
          if (awaitingAccountOrLookupReplyOpcodeStage == PacketBuffer.currentProtocolStage &&
              UiWidget.readSessionBytesIfAvailable(30000, 1)) {
            replyOpcode = LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
            LogoCompositor.sessionPacketBuffer.position = 0;
            if (replyOpcode >= 100 &&
                replyOpcode <= 105) {
              PacketBuffer.currentProtocolStage = CanvasResizeController.awaitingUsernameSuggestionsStage;
              WidgetSkinState.pendingUsernameSuggestions = new String[replyOpcode - 100];
            } else {
              if (replyOpcode == 248) {
                GrowableIntList.createClientCookieMarker(NodeHashTableIterator.getActiveApplet(124), (byte) 123);
                AudioService.sessionResponseText = ByteShortQuery.createUnableText;
                Bzip2DecoderState.closeSessionSocket((byte) -124);
                TextTemplateArgumentType.loginRetryAttempted = false;
                unableResponseBeforeReturn = replyOpcode;
                return unableResponseBeforeReturn;
              }
              if (99 != replyOpcode) {
                PacketBuffer.currentProtocolStage = AccountCreationForm.awaitingLoginLookupPayloadStage;
                AchievementSubmission.sessionPacketPayloadLength = -1;
                ScorePopup.currentPacketOpcode = replyOpcode;
              } else {
                UiWidget.readSessionBytesIfAvailable(30000, DualLinkNode.getLoginBooleanReplyLength(112));
                IntrusiveNodeHashTable.pendingLoginBooleanReply = new Boolean(Bzip2DecoderState.readByteEqualsOne(LogoCompositor.sessionPacketBuffer, 0));
                LogoCompositor.sessionPacketBuffer.position = 0;
              }
            }
          }
          if (PacketBuffer.currentProtocolStage == CanvasResizeController.awaitingUsernameSuggestionsStage) {
            replyReadLength = 2;
            if (UiWidget.readSessionBytesIfAvailable(30000, replyReadLength)) {
              suggestionPayloadLength = LogoCompositor.sessionPacketBuffer.readUnsignedShortBE(true);
              LogoCompositor.sessionPacketBuffer.position = 0;
              if (UiWidget.readSessionBytesIfAvailable(30000, suggestionPayloadLength)) {
                suggestionCount = WidgetSkinState.pendingUsernameSuggestions.length;
                for (suggestionIndex = 0; suggestionIndex < suggestionCount; suggestionIndex++) {
                  WidgetSkinState.pendingUsernameSuggestions[suggestionIndex] = LogoCompositor.sessionPacketBuffer.readZeroPrefixedNullTerminatedText(27425);
                }
                Bzip2DecoderState.closeSessionSocket((byte) -114);
                TextTemplateArgumentType.loginRetryAttempted = false;
                suggestionResponseBeforeReturn = suggestionCount + 100;
                return suggestionResponseBeforeReturn;
              }
            }
          }
          if (PacketBuffer.currentProtocolStage == AccountCreationForm.awaitingLoginLookupPayloadStage &&
              TriangleMesh.readSessionPacketPayload(false)) {
            if (ScorePopup.currentPacketOpcode != 255) {
              AudioService.sessionResponseText = LogoCompositor.sessionPacketBuffer.readNullTerminatedText((byte) 98);
            } else {
              settingsCookieText = LogoCompositor.sessionPacketBuffer.readNullableNullTerminatedText((byte) 53);
              if (settingsCookieText != null) {
                SettingsCookieSupport.storeSettingsCookie(-128, settingsCookieText, NodeHashTableIterator.getActiveApplet(106));
              }
            }
            Bzip2DecoderState.closeSessionSocket((byte) -114);
            TextTemplateArgumentType.loginRetryAttempted = false;
            payloadOpcodeBeforeReturn = ScorePopup.currentPacketOpcode;
            return payloadOpcodeBeforeReturn;
          }
          if (methodGuard < 56) {
            awaitingAccountOrLookupReplyOpcodeStage = (ClientProtocolStage) null;
          }
          if (SpriteCheckboxRenderer.sessionSocket == null) {
            if (TextTemplateArgumentType.loginRetryAttempted) {
              if (GameGraphicsResources.elapsedSinceSessionActivity((byte) 12) <= 30000L) {
                AudioService.sessionResponseText = FullscreenFailureReason.loginMessage2Text;
              } else {
                AudioService.sessionResponseText = IntrusiveNode.loginMessage3Text;
              }
              TextTemplateArgumentType.loginRetryAttempted = false;
              retryFailureBeforeReturn = 249;
              return retryFailureBeforeReturn;
            }
            previousSessionPort = NetworkArchiveRequest.sessionServerPort;
            NetworkArchiveRequest.sessionServerPort = TextInputRenderer.alternateSessionServerPort;
            TextTemplateArgumentType.loginRetryAttempted = true;
            TextInputRenderer.alternateSessionServerPort = previousSessionPort;
          }
          pendingResultBeforeReturn = -1;
          return pendingResultBeforeReturn;
        } catch (java.lang.RuntimeException accountOrLookupRequestFailure) {
          caughtRequestFailure = accountOrLookupRequestFailure;
          requestFailureForContext = caughtRequestFailure;
          requestFailureBeforeContext = requestFailureForContext;
          requestMessagePrefix = new StringBuilder().append("pf.N(").append(affiliateId).append(',').append(ageYears).append(',');
          if (loginIdentifierValue == null) {
            identifierValueDescription = "null";
          } else {
            identifierValueDescription = "{...}";
          }
          requestMessageBeforeEmail = ((StringBuilder) (Object) requestMessagePrefix).append(identifierValueDescription).append(',');
          if (emailValue == null) {
            emailValueDescription = "null";
          } else {
            emailValueDescription = "{...}";
          }
          requestMessageBeforePassword = ((StringBuilder) (Object) requestMessageBeforeEmail).append(emailValueDescription).append(',');
          if (passwordText == null) {
            passwordDescription = "null";
          } else {
            passwordDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) requestFailureBeforeContext), ((StringBuilder) (Object) requestMessageBeforePassword).append(passwordDescription).append(',').append(newsOptIn).append(',').append(methodGuard).append(')').toString());
        }
    }

    public final void onButtonActivated(int buttonX, byte methodGuard, int buttonY, int pointerButton, ButtonWidget button) {
        int unusedClientControlSnapshot = 0;
        RuntimeException buttonFailureBeforeContext = null;
        StringBuilder buttonMessagePrefix = null;
        String buttonDescription = null;
        RuntimeException caughtButtonFailure = null;
        RuntimeException buttonFailureForContext = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != -20) {
            this.loginOrRetryButton = (ButtonWidget) null;
          }
          if (this.loginOrRetryButton == button) {
            this.submitLoginIfAllowed(0);
          } else {
            if (this.createAccountButton == button) {
              MultiHandleSliderRenderer.openAccountCreationForm((byte) 108);
            } else {
              if (this.alternateButton == button) {
                if (!this.retryMode) {
                  if (!this.allowJustPlay) {
                    LoginPasswordSupport.requestLoginUiActionFour(methodGuard - 23718);
                  } else {
                    ByteArrayBuffer.openAccountWelcomePanel(0);
                  }
                } else {
                  NetworkArchiveRequest.requestAccountUiActionSeventeen(methodGuard ^ -60);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException buttonActivationFailure) {
          caughtButtonFailure = buttonActivationFailure;
          buttonFailureForContext = caughtButtonFailure;
          buttonFailureBeforeContext = buttonFailureForContext;
          buttonMessagePrefix = new StringBuilder().append("pf.Q(").append(buttonX).append(',').append(methodGuard).append(',').append(buttonY).append(',').append(pointerButton).append(',');
          if (button == null) {
            buttonDescription = "null";
          } else {
            buttonDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) buttonFailureBeforeContext), ((StringBuilder) (Object) buttonMessagePrefix).append(buttonDescription).append(')').toString());
        }
    }

    final static void writeReflectionCheckReply(int methodGuard, PacketBuffer buffer) {
        try {
            int operationIndex = 0;
            int argumentIndex = 0;
            RuntimeException replyFailureBeforeContext = null;
            StringBuilder replyMessagePrefix = null;
            String bufferDescription = null;
            Throwable caughtOperationOrReplyFailure = null;
            RuntimeException replyFailureForContext = null;
            int hasPendingLookupTask = 0;
            int guardResidue = 0;
            int readinessScanIndexOrCrcStart = 0;
            int operationType = 0;
            ClassNotFoundException classNotFoundFailure = null;
            InvalidClassException invalidClassFailure = null;
            StreamCorruptedException corruptedStreamFailure = null;
            OptionalDataException optionalDataFailure = null;
            IllegalAccessException illegalAccessFailure = null;
            IllegalArgumentException illegalArgumentFailure = null;
            java.lang.reflect.InvocationTargetException invocationTargetFailure = null;
            SecurityException securityFailure = null;
            IOException ioFailure = null;
            NullPointerException nullPointerFailure = null;
            Exception otherExceptionFailure = null;
            Throwable otherThrowableFailure = null;
            java.lang.reflect.Field unusedWrittenFieldAlias = null;
            int fieldValueOrMemberModifiers = 0;
            Object[] invocationArguments = null;
            Object invocationResult = null;
            ObjectInputStream argumentInputStream = null;
            ReflectionCheckRequest requestFromQueue = null;
            java.lang.reflect.Field fieldToWrite = null;
            java.lang.reflect.Field fieldToRead = null;
            ReflectionCheckRequest requestAlias = null;
            Object unusedNullReferenceA = null;
            Object unusedNullReferenceB = null;
            Object unusedNullReferenceC = null;
            byte[][] serializedArguments = null;
            java.lang.reflect.Field fieldForModifiers = null;
            java.lang.reflect.Method methodForModifiers = null;
            java.lang.reflect.Method methodToInvoke = null;
            int reflectedMethodModifiers;
            unusedNullReferenceA = null;
            unusedNullReferenceB = null;
            unusedNullReferenceC = null;
            try {
              requestFromQueue = (ReflectionCheckRequest) ((Object) UsernameAvailabilityQuery.reflectionCheckRequests.firstForIteration(0));
              requestAlias = requestFromQueue;
              if (requestAlias == null) {
                return;
              }
              guardResidue = 2 % ((methodGuard + 26) / 62);
              hasPendingLookupTask = 0;
              for (readinessScanIndexOrCrcStart = 0; readinessScanIndexOrCrcStart < requestAlias.operationCount; readinessScanIndexOrCrcStart++) {
                if (requestFromQueue.fieldLookupTasks[readinessScanIndexOrCrcStart] != null) {
                  if (requestFromQueue.fieldLookupTasks[readinessScanIndexOrCrcStart].status == 2) {
                    requestFromQueue.operationErrors[readinessScanIndexOrCrcStart] = -5;
                  }
                  if (requestFromQueue.fieldLookupTasks[readinessScanIndexOrCrcStart].status == 0) {
                    hasPendingLookupTask = 1;
                  }
                }
                if (requestFromQueue.methodLookupTasks[readinessScanIndexOrCrcStart] != null) {
                  if (2 == requestFromQueue.methodLookupTasks[readinessScanIndexOrCrcStart].status) {
                    requestFromQueue.operationErrors[readinessScanIndexOrCrcStart] = -6;
                  }
                  if (requestFromQueue.methodLookupTasks[readinessScanIndexOrCrcStart].status == 0) {
                    hasPendingLookupTask = 1;
                  }
                }
              }
              if (hasPendingLookupTask != 0) {
                return;
              }
              readinessScanIndexOrCrcStart = buffer.position;
              buffer.writeIntBE((byte) 95, requestAlias.requestId);
              for (operationIndex = 0; operationIndex < requestAlias.operationCount; operationIndex++) {
                if (requestFromQueue.operationErrors[operationIndex] != 0) {
                  buffer.writeByte((byte) 6, requestFromQueue.operationErrors[operationIndex]);
                } else {
                  try {
                    operationType = requestFromQueue.operationTypes[operationIndex];
                    if (operationType == 0) {
                      fieldToRead = (java.lang.reflect.Field) (requestFromQueue.fieldLookupTasks[operationIndex].result);
                      fieldValueOrMemberModifiers = fieldToRead.getInt((Object) null);
                      buffer.writeByte((byte) 3, 0);
                      buffer.writeIntBE((byte) 95, fieldValueOrMemberModifiers);
                    } else {
                      if (operationType == 1) {
                        fieldToWrite = (java.lang.reflect.Field) (requestFromQueue.fieldLookupTasks[operationIndex].result);
                        unusedWrittenFieldAlias = fieldToWrite;
                        fieldToWrite.setInt((Object) null, requestFromQueue.integerWriteValues[operationIndex]);
                        buffer.writeByte((byte) 124, 0);
                      } else {
                        if (2 == operationType) {
                          fieldForModifiers = (java.lang.reflect.Field) (requestFromQueue.fieldLookupTasks[operationIndex].result);
                          fieldValueOrMemberModifiers = fieldForModifiers.getModifiers();
                          buffer.writeByte((byte) 126, 0);
                          buffer.writeIntBE((byte) 95, fieldValueOrMemberModifiers);
                        }
                      }
                    }
                    if (operationType == 3) {
                      methodToInvoke = (java.lang.reflect.Method) (requestFromQueue.methodLookupTasks[operationIndex].result);
                      serializedArguments = requestFromQueue.serializedArguments[operationIndex];
                      invocationArguments = new Object[serializedArguments.length];
                      for (argumentIndex = 0; argumentIndex < serializedArguments.length; argumentIndex++) {
                        argumentInputStream = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(serializedArguments[argumentIndex])));
                        invocationArguments[argumentIndex] = argumentInputStream.readObject();
                      }
                      invocationResult = methodToInvoke.invoke((Object) null, invocationArguments);
                      if (invocationResult == null) {
                        buffer.writeByte((byte) -88, 0);
                      } else if (invocationResult instanceof Number) {
                        buffer.writeByte((byte) 126, 1);
                        buffer.writeLongBE((byte) 116, ((Number) (invocationResult)).longValue());
                      } else if (!(invocationResult instanceof String)) {
                        buffer.writeByte((byte) -86, 4);
                      } else {
                        buffer.writeByte((byte) 121, 2);
                        buffer.writeNullTerminatedText((String) (invocationResult), 0);
                      }
                    } else {
                      if (operationType == 4) {
                        methodForModifiers = (java.lang.reflect.Method) (requestFromQueue.methodLookupTasks[operationIndex].result);
                        reflectedMethodModifiers = methodForModifiers.getModifiers();
                        buffer.writeByte((byte) 123, 0);
                        buffer.writeIntBE((byte) 95, reflectedMethodModifiers);
                      }
                    }
                  } catch (java.lang.ClassNotFoundException caughtClassNotFoundFailure) {
                    caughtOperationOrReplyFailure = caughtClassNotFoundFailure;
                    classNotFoundFailure = (ClassNotFoundException) (Object) caughtOperationOrReplyFailure;
                    buffer.writeByte((byte) 122, -10);
                  } catch (java.io.InvalidClassException caughtInvalidClassFailure) {
                    caughtOperationOrReplyFailure = caughtInvalidClassFailure;
                    invalidClassFailure = (InvalidClassException) (Object) caughtOperationOrReplyFailure;
                    buffer.writeByte((byte) -101, -11);
                  } catch (java.io.StreamCorruptedException caughtCorruptedStreamFailure) {
                    caughtOperationOrReplyFailure = caughtCorruptedStreamFailure;
                    corruptedStreamFailure = (StreamCorruptedException) (Object) caughtOperationOrReplyFailure;
                    buffer.writeByte((byte) 124, -12);
                  } catch (java.io.OptionalDataException caughtOptionalDataFailure) {
                    caughtOperationOrReplyFailure = caughtOptionalDataFailure;
                    optionalDataFailure = (OptionalDataException) (Object) caughtOperationOrReplyFailure;
                    buffer.writeByte((byte) -78, -13);
                  } catch (java.lang.IllegalAccessException caughtIllegalAccessFailure) {
                    caughtOperationOrReplyFailure = caughtIllegalAccessFailure;
                    illegalAccessFailure = (IllegalAccessException) (Object) caughtOperationOrReplyFailure;
                    buffer.writeByte((byte) 4, -14);
                  } catch (java.lang.IllegalArgumentException caughtIllegalArgumentFailure) {
                    caughtOperationOrReplyFailure = caughtIllegalArgumentFailure;
                    illegalArgumentFailure = (IllegalArgumentException) (Object) caughtOperationOrReplyFailure;
                    buffer.writeByte((byte) 11, -15);
                  } catch (java.lang.reflect.InvocationTargetException caughtInvocationTargetFailure) {
                    caughtOperationOrReplyFailure = caughtInvocationTargetFailure;
                    invocationTargetFailure = (java.lang.reflect.InvocationTargetException) (Object) caughtOperationOrReplyFailure;
                    buffer.writeByte((byte) -127, -16);
                  } catch (java.lang.SecurityException caughtSecurityFailure) {
                    caughtOperationOrReplyFailure = caughtSecurityFailure;
                    securityFailure = (SecurityException) (Object) caughtOperationOrReplyFailure;
                    buffer.writeByte((byte) 126, -17);
                  } catch (java.io.IOException caughtIoFailure) {
                    caughtOperationOrReplyFailure = caughtIoFailure;
                    ioFailure = (IOException) (Object) caughtOperationOrReplyFailure;
                    buffer.writeByte((byte) 121, -18);
                  } catch (java.lang.NullPointerException caughtNullPointerFailure) {
                    caughtOperationOrReplyFailure = caughtNullPointerFailure;
                    nullPointerFailure = (NullPointerException) (Object) caughtOperationOrReplyFailure;
                    buffer.writeByte((byte) -100, -19);
                  } catch (java.lang.Exception caughtOtherExceptionFailure) {
                    caughtOperationOrReplyFailure = caughtOtherExceptionFailure;
                    otherExceptionFailure = (Exception) (Object) caughtOperationOrReplyFailure;
                    buffer.writeByte((byte) -74, -20);
                  } catch (java.lang.Throwable caughtOtherThrowableFailure) {
                    caughtOperationOrReplyFailure = caughtOtherThrowableFailure;
                    otherThrowableFailure = caughtOperationOrReplyFailure;
                    buffer.writeByte((byte) -37, -21);
                  }
                }
              }
              buffer.appendCrc32(8, readinessScanIndexOrCrcStart);
              requestAlias.unlinkNode(false);
              return;
            } catch (java.lang.RuntimeException caughtReplyFailure) {
              caughtOperationOrReplyFailure = caughtReplyFailure;
              replyFailureForContext = (RuntimeException) (Object) caughtOperationOrReplyFailure;
              replyFailureBeforeContext = replyFailureForContext;
              replyMessagePrefix = new StringBuilder().append("pf.M(").append(methodGuard).append(',');
              if (buffer == null) {
                bufferDescription = "null";
              } else {
                bufferDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) replyFailureBeforeContext), ((StringBuilder) (Object) replyMessagePrefix).append(bufferDescription).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedReplyFailure) {
            throw uncheckedReplyFailure;
        } catch (Throwable checkedReplyFailure) {
            throw new RuntimeException(checkedReplyFailure);
        }
    }

    private final void submitLoginIfAllowed(int methodGuard) {
        if (SpriteState.isReconnectingLoginMode(methodGuard) ||
            !(this.loginIdentifierInput.widgetText.length() <= 0) &&
              !(0 >= this.passwordInput.widgetText.length())) {
          SecondaryNodeDequeIterator.startLogin(this.passwordInput.widgetText, (byte) 66, this.loginIdentifierInput.widgetText);
        }
    }

    LoginPanel(String loginIdentifier, String message, boolean retryMode, boolean showCreateAccount, boolean allowJustPlay) {
        super(0, 0, 310, 190, (WidgetRenderer) null);
        LabeledChildWidget identifierRowForAddition = null;
        LabeledChildWidget passwordRowForAddition = null;
        boolean showCreateAccountValue = false;
        boolean retryModeValue = false;
        boolean allowJustPlayValue = false;
        ButtonWidget unusedNullButtonBeforeAlternateSelectionA = null;
        ButtonWidget unusedNullButtonBeforeAlternateSelectionB = null;
        ButtonWidget unusedNullAlternateBranchButtonA = null;
        ButtonWidget unusedNullAlternateBranchButtonB = null;
        String alternateButtonText = null;
        RuntimeException constructionFailureBeforeContext = null;
        StringBuilder constructionMessagePrefix = null;
        String loginIdentifierDescription = null;
        StringBuilder constructionMessageBeforeMessage = null;
        String messageDescription = null;
        RuntimeException caughtConstructionFailure = null;
        SpriteButtonRenderer sharedButtonRenderer = null;
        RuntimeException constructionFailureForContext = null;
        BitmapFont labelFont = null;
        String identifierLabelText = null;
        LoginMethod rememberedLoginMethod = null;
        LabeledChildWidget identifierRowAlias = null;
        LabeledChildWidget passwordRowAlias = null;
        try {
          showCreateAccountValue = !(!showCreateAccount);
          this.showCreateAccount = showCreateAccountValue;
          this.messageText = message;
          retryModeValue = !(!retryMode);
          this.retryMode = retryModeValue;
          allowJustPlayValue = !(!allowJustPlay);
          this.allowJustPlay = allowJustPlayValue;
          if (this.retryMode && (this.showCreateAccount ||
              this.allowJustPlay)) {
            throw new IllegalStateException();
          }
          this.loginIdentifierInput = (TextInputWidget) ((Object) new ValidatedTextInputWidget(loginIdentifier, (WidgetListener) (this), 100));
          this.passwordInput = (TextInputWidget) ((Object) new ValidatedTextInputWidget("", (WidgetListener) (this), 20));
          if (!this.retryMode) {
            this.loginOrRetryButton = new ButtonWidget(NodeHashTableIterator.loginText, (WidgetListener) null);
            unusedNullButtonBeforeAlternateSelectionA = null;
            unusedNullButtonBeforeAlternateSelectionB = null;
            if (this.allowJustPlay) {
              unusedNullAlternateBranchButtonA = null;
              unusedNullAlternateBranchButtonB = null;
              alternateButtonText = ClientRenderingState.justPlayText;
            } else {
              unusedNullAlternateBranchButtonA = null;
              unusedNullAlternateBranchButtonB = null;
              alternateButtonText = GameGraphicsResources.backText;
            }
            this.alternateButton = new ButtonWidget(alternateButtonText, (WidgetListener) null);
            if (this.showCreateAccount) {
              this.createAccountButton = new ButtonWidget(KeyedIntRecordSubmission.createAnAccountText, (WidgetListener) (this));
            }
          } else {
            this.loginOrRetryButton = new ButtonWidget(BoardEntityState.retryText, (WidgetListener) null);
            this.alternateButton = new ButtonWidget(DisplayModeInfo.quitToWebsiteText, (WidgetListener) null);
            this.loginIdentifierInput.enabled = false;
          }
          this.loginIdentifierInput.renderer = (WidgetRenderer) ((Object) new TextInputRenderer(10000536));
          this.passwordInput.renderer = (WidgetRenderer) ((Object) new PasswordWidgetRenderer(10000536));
          sharedButtonRenderer = new SpriteButtonRenderer();
          this.loginOrRetryButton.renderer = (WidgetRenderer) ((Object) sharedButtonRenderer);
          if (this.alternateButton != null) {
            this.alternateButton.renderer = (WidgetRenderer) ((Object) sharedButtonRenderer);
          }
          if (this.createAccountButton != null) {
            this.createAccountButton.renderer = (WidgetRenderer) ((Object) sharedButtonRenderer);
          }
          this.loginIdentifierInput.hoverText = SocketArchiveNetworkClient.loginUsernameTooltipText;
          if (null != this.createAccountButton) {
            this.createAccountButton.hoverText = SessionBootstrapSupport.loginCreateTooltipText;
          }
          if (this.retryMode) {
            this.alternateButton.hoverText = SocialListEntry.quitWarningText;
          } else {
            if (!this.allowJustPlay) {
              this.alternateButton.renderer = (WidgetRenderer) ((Object) new UnderlinedButtonRenderer());
            } else {
              this.alternateButton.hoverText = CheckboxWidget.loginJustPlayTooltipText;
              this.alternateButton.renderer = (WidgetRenderer) ((Object) new UnderlinedButtonRenderer());
            }
          }
          this.widgetY = 15;
          labelFont = DialogLayer.sharedUiFont;
          if (this.messageText != null) {
            this.widgetY = this.widgetY + (labelFont.measureWrappedHeight(this.messageText, this.widgetWidth - 40, labelFont.maxAscent) + 5);
          }
          identifierLabelText = WeightedObjectCache.loginUsernameEmailText;
          rememberedLoginMethod = AlternateLongAndTextLoginPayload.readRememberedMethod(NodeHashTableIterator.getActiveApplet(120), 200);
          if (rememberedLoginMethod != LoginTextValue.emailLoginMethod) {
            if (rememberedLoginMethod == ProgressDialog.usernameLoginMethod) {
              identifierLabelText = LogoPreparationSupport.loginUsernameText;
            }
          } else {
            identifierLabelText = UsernameAvailabilityQuery.loginEmailText;
          }
          identifierRowForAddition = new LabeledChildWidget(10, this.widgetY, -20 + this.widgetWidth, 25, this.loginIdentifierInput, false, 80, 3, labelFont, 16777215, identifierLabelText);
          identifierRowAlias = identifierRowForAddition;
          this.addChild((byte) -110, identifierRowForAddition);
          this.widgetY = this.widgetY + (((UiWidget) ((Object) identifierRowAlias)).widgetHeight + 5);
          passwordRowForAddition = new LabeledChildWidget(10, this.widgetY, this.widgetWidth - 20, 25, this.passwordInput, false, 80, 3, labelFont, 16777215, LoginPayloadKind.createPasswordText);
          passwordRowAlias = passwordRowForAddition;
          this.addChild((byte) -120, passwordRowForAddition);
          this.loginOrRetryButton.listener = (WidgetListener) (this);
          this.widgetY = this.widgetY + (((UiWidget) ((Object) passwordRowAlias)).widgetHeight + 5);
          if (this.createAccountButton != null) {
            this.createAccountButton.listener = (WidgetListener) (this);
          }
          if (this.alternateButton != null) {
            this.alternateButton.listener = (WidgetListener) (this);
          }
          if (this.createAccountButton != null) {
            this.loginOrRetryButton.setWidgetBounds(30, this.widgetWidth - 95, (byte) -92, this.widgetY, 85);
            this.widgetY = this.widgetY + 60;
          } else {
            this.loginOrRetryButton.setWidgetBounds(30, -10 + this.widgetWidth - 6, (byte) -33, this.widgetY, 8);
            this.widgetY = this.widgetY + 35;
          }
          if (this.createAccountButton != null) {
            this.createAccountButton.setWidgetBounds(30, -10 + this.widgetWidth - 6, (byte) -42, this.widgetY, 8);
            this.widgetY = this.widgetY + 35;
          }
          if (this.alternateButton != null) {
            if (!this.retryMode &&
                !this.allowJustPlay) {
              this.alternateButton.setWidgetBounds(20, 40, (byte) -55, this.widgetY, 8);
              this.widgetY = this.widgetY + 25;
            } else {
              this.alternateButton.setWidgetBounds(30, -10 + (this.widgetWidth - 6), (byte) -64, this.widgetY, 8);
              this.widgetY = this.widgetY + 35;
            }
          }
          this.setWidgetBounds(3 + this.widgetY, this.widgetWidth, (byte) -17, 0, 0);
          this.addChild((byte) -83, this.loginOrRetryButton);
          if (null != this.createAccountButton) {
            this.addChild((byte) -111, this.createAccountButton);
          }
          if (this.alternateButton != null) {
            this.addChild((byte) -127, this.alternateButton);
          }
          return;
        } catch (java.lang.RuntimeException loginPanelConstructionFailure) {
          caughtConstructionFailure = loginPanelConstructionFailure;
          constructionFailureForContext = caughtConstructionFailure;
          constructionFailureBeforeContext = constructionFailureForContext;
          constructionMessagePrefix = new StringBuilder().append("pf.<init>(");
          if (loginIdentifier == null) {
            loginIdentifierDescription = "null";
          } else {
            loginIdentifierDescription = "{...}";
          }
          constructionMessageBeforeMessage = ((StringBuilder) (Object) constructionMessagePrefix).append(loginIdentifierDescription).append(',');
          if (message == null) {
            messageDescription = "null";
          } else {
            messageDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) constructionFailureBeforeContext), ((StringBuilder) (Object) constructionMessageBeforeMessage).append(messageDescription).append(',').append(retryMode).append(',').append(showCreateAccount).append(',').append(allowJustPlay).append(')').toString());
        }
    }

    final static LoginTextValue createActiveEmailLookupValue(byte methodGuard) {
        if (methodGuard != -42) {
            LoginPanel.createActiveEmailLookupValue((byte) -98);
        }
        return new LoginTextValue(UsernameSuggestionsPanel.getActiveEmailOrLoginIdentifier(100), SocketConnector.isEmailAvailabilityPending(7));
    }

    final void clearLoginInputs(int methodGuard) {
        this.loginIdentifierInput.clearInputText((byte) 48);
        this.passwordInput.clearInputText((byte) 116);
        int guardResidue = 40 % ((methodGuard - 17) / 38);
    }

    static {
        endingEntityScanClear = false;
        js5CrcErrorText = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        awaitingAccountOrLookupReplyOpcodeStage = new ClientProtocolStage();
    }
}
