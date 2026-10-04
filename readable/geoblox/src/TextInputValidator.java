/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextInputValidator extends DebouncedValidationProvider implements TextInputListener {
    static FullscreenFailureReason fullscreenUnavailableFailureReason;
    static double dialReferenceAngleRadians;
    private TextInputWidget validatedInput;

    final static void openAccountLoginPanel(byte methodGuard, boolean showCreateAccount) {
        if (methodGuard < 102) {
            return;
        }
        TextTemplateLookupSupport.openLoginPanel(false, showCreateAccount, false);
    }

    final ValidationState currentValidationState(int guard) {
        if (guard != 32) {
            return (ValidationState) null;
        }
        return this.validationStateForText(-257, this.validatedInput.widgetText);
    }

    public final boolean isInputEmpty(int methodGuard) {
        if (methodGuard != -26556) {
            String unusedNullValidationText = (String) null;
            this.validationMessageForText(-33, (String) null);
            if (this.validatedInput.widgetText != null) {
                return this.validatedInput.widgetText.length() == 0 ? true : false;
            }
            return true;
        }
        if (this.validatedInput.widgetText == null) {
            return true;
        }
        if (this.validatedInput.widgetText.length() != 0) {
            return false;
        }
        return true;
    }

    public final void onTextInputSubmitted(TextInputWidget input, int methodGuard) {
        try {
            if (methodGuard != -18649) {
                this.validatedInput = (TextInputWidget) null;
            }
        } catch (RuntimeException submissionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) submissionFailure), "q.S(" + (input != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    abstract String validationMessageForText(int guard, String candidateText);

    final static boolean isAllowedAccountNameCharacter(char character, byte methodGuard) {
        if (!(!Character.isISOControl(character))) {
            return false;
        }
        if (LoginPanel.isAsciiLetterOrDigit(-123, character)) {
            return true;
        }
        if (character == 45) {
            return true;
        }
        if (character == 160) {
            return true;
        }
        if (32 == character) {
            return true;
        }
        if (character == 95) {
            return true;
        }
        if (methodGuard > 88) {
            return false;
        }
        return false;
    }

    final static void initializeArchiveServices(int clientId, int languageId, int primaryPort, int serverNumber, int methodGuard, PlatformTaskDispatcher taskDispatcher, String archiveHost, int gameCrc, int alternatePort) {
        try {
            EmailValidator.archiveGameCrc = gameCrc;
            ArchiveIndex.archiveServerNumber = serverNumber;
            GameplaySession.archiveHost = archiveHost;
            ValidatedTextInputWidget.archiveClientId = clientId;
            MidiNote.archiveLanguageId = languageId;
            SecondaryNodeHashTable.archivePort = primaryPort;
            ByteShortQuery.archiveTaskDispatcher = taskDispatcher;
            if (methodGuard != -23949) {
                dialReferenceAngleRadians = -0.8279321027589008;
            }
            FullscreenErrorDialog.alternateArchivePort = alternatePort;
            AsyncResourceDownloader.archiveNetworkClient = (ArchiveNetworkClient) ((Object) new SocketArchiveNetworkClient());
            UsernameQuerySupport.archiveDiskWorker = new DiskCacheWorker(taskDispatcher);
            DequeCursor.archiveCatalog = new ArchiveCatalog(AsyncResourceDownloader.archiveNetworkClient, UsernameQuerySupport.archiveDiskWorker);
        } catch (RuntimeException initializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) initializationFailure), "q.N(" + clientId + ',' + languageId + ',' + primaryPort + ',' + serverNumber + ',' + methodGuard + ',' + (taskDispatcher != null ? "{...}" : "null") + ',' + (archiveHost != null ? "{...}" : "null") + ',' + gameCrc + ',' + alternatePort + ')');
        }
    }

    public final void onTextInputChanged(TextInputWidget input, byte methodGuard) {
        RuntimeException changeFailureForContext = null;
        StringBuilder changeContextBuilder = null;
        String inputDescription = null;
        RuntimeException caughtChangeFailure = null;
        RuntimeException textChangeFailure = null;
        try {
          if (methodGuard != 74) {
            this.isInputEmpty(-117);
            this.resetValidationDelay(-28133);
          } else {
            this.resetValidationDelay(-28133);
          }
          return;
        } catch (java.lang.RuntimeException changeFailure) {
          caughtChangeFailure = changeFailure;
          textChangeFailure = caughtChangeFailure;
          changeFailureForContext = textChangeFailure;
          changeContextBuilder = new StringBuilder().append("q.J(");
          if (input == null) {
            inputDescription = "null";
          } else {
            inputDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) changeFailureForContext), ((StringBuilder) (Object) changeContextBuilder).append(inputDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static void handleLoginUiResponse(byte methodGuard, int responseCode, String responseText) {
        int displayResponseContent = 0;
        RuntimeException responseHandlingFailure = null;
        String unusedArchiveHost = null;
        RuntimeException responseFailureForContext = null;
        StringBuilder responseContextBuilder = null;
        String responseDescription = null;
        RuntimeException caughtResponseFailure = null;
        try {
          MeshPrioritySupport.messageDialogUiFlowActive = false;
          ArchiveLoadStep.connectionLostMessagePending = false;
          if ((null != Geoblox.activeMessageDialog) &&
              (Geoblox.activeMessageDialog.dialogVisible)) {
            if (8 == responseCode) {
              responseCode = 2;
              if (!AgeValidator.reconnectingLoginMode) {
                responseText = VisualPropertyOverrides.invalidUserOrPasswordText;
              } else {
                responseText = DualLinkNode.invalidPasswordText;
              }
              SpriteButtonRenderer.activeLoginPanel.setLoginIdentifierAndClearPassword(TextTemplateLookupSupport.currentLoginIdentifier, 0);
            }
            displayResponseContent = 1;
            if (responseCode == 10) {
              MatchingTextValidator.openDisplayNamePanel((byte) -4);
              displayResponseContent = 0;
            }
            if (displayResponseContent != 0) {
              if (ArchiveLoadStep.connectionLostMessagePending) {
                responseText = OpacityWidget.replaceIndexedTextMarkers(VisualPropertyOverrides.connectionLostWithReasonText, new String[]{responseText}, (byte) -25);
              }
              if (VisualPropertyOverrides.showLoginOnMessageDismiss) {
                responseText = AccountEligibilitySupport.pleaseTryAgainText;
              }
              Geoblox.activeMessageDialog.installErrorContent(responseCode, methodGuard + 19686, responseText);
            }
            if ((responseCode != 256) &&
                (responseCode != 10) &&
                (!AgeValidator.reconnectingLoginMode)) {
              SpriteButtonRenderer.activeLoginPanel.clearLoginInputs(-119);
            }
          }
          if (methodGuard == 124) {
            return;
          }
          unusedArchiveHost = (String) null;
          TextInputValidator.initializeArchiveServices(-94, -21, 56, -5, 62, (PlatformTaskDispatcher) null, (String) null, -54, -101);
          return;
        } catch (java.lang.RuntimeException responseFailure) {
          caughtResponseFailure = responseFailure;
          responseHandlingFailure = caughtResponseFailure;
          responseFailureForContext = responseHandlingFailure;
          responseContextBuilder = new StringBuilder().append("q.O(").append(methodGuard).append(',').append(responseCode).append(',');
          if (responseText == null) {
            responseDescription = "null";
          } else {
            responseDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) responseFailureForContext), ((StringBuilder) (Object) responseContextBuilder).append(responseDescription).append(')').toString());
        }
    }

    final static CoverageBitmapFont loadCoverageFont(ResourceArchive fontMetricsArchive, int methodGuard, String resourceName, String groupName, ResourceArchive glyphGraphicsArchive) {
        int archiveGroupId = 0;
        RuntimeException fontFailureForContext = null;
        int archiveFileId = 0;
        String unusedNullTextSnapshot = null;
        CoverageBitmapFont fontBeforeReturn = null;
        RuntimeException fontFailureBeforeDescriptions = null;
        StringBuilder fontMessagePrefix = null;
        String metricsArchiveDescription = null;
        StringBuilder fontMessageBeforeResourceName = null;
        String resourceNameDescription = null;
        StringBuilder fontMessageBeforeGroupName = null;
        String groupNameDescription = null;
        StringBuilder fontMessageBeforeGlyphArchive = null;
        String glyphArchiveDescription = null;
        RuntimeException caughtFontFailure = null;
        try {
          if (methodGuard != 1) {
            unusedNullTextSnapshot = (String) null;
            TextInputValidator.handleLoginUiResponse((byte) 108, 111, (String) null);
          }
          archiveGroupId = glyphGraphicsArchive.findGroupId((byte) 126, groupName);
          archiveFileId = glyphGraphicsArchive.findFileId(resourceName, methodGuard - 69, archiveGroupId);
          fontBeforeReturn = IntArrayQuery.loadCoverageFontById(glyphGraphicsArchive, (byte) -127, fontMetricsArchive, archiveFileId, archiveGroupId);
          return fontBeforeReturn;
        } catch (java.lang.RuntimeException fontFailure) {
          caughtFontFailure = fontFailure;
          fontFailureForContext = caughtFontFailure;
          fontFailureBeforeDescriptions = fontFailureForContext;
          fontMessagePrefix = new StringBuilder().append("q.R(");
          if (fontMetricsArchive == null) {
            metricsArchiveDescription = "null";
          } else {
            metricsArchiveDescription = "{...}";
          }
          fontMessageBeforeResourceName = ((StringBuilder) (Object) fontMessagePrefix).append(metricsArchiveDescription).append(',').append(methodGuard).append(',');
          if (resourceName == null) {
            resourceNameDescription = "null";
          } else {
            resourceNameDescription = "{...}";
          }
          fontMessageBeforeGroupName = ((StringBuilder) (Object) fontMessageBeforeResourceName).append(resourceNameDescription).append(',');
          if (groupName == null) {
            groupNameDescription = "null";
          } else {
            groupNameDescription = "{...}";
          }
          fontMessageBeforeGlyphArchive = ((StringBuilder) (Object) fontMessageBeforeGroupName).append(groupNameDescription).append(',');
          if (glyphGraphicsArchive == null) {
            glyphArchiveDescription = "null";
          } else {
            glyphArchiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) fontFailureBeforeDescriptions), ((StringBuilder) (Object) fontMessageBeforeGlyphArchive).append(glyphArchiveDescription).append(')').toString());
        }
    }

    abstract ValidationState validationStateForText(int guard, String candidateText);

    final String currentValidationMessage(byte guard) {
        if (guard == -103) {
            return this.validationMessageForText(422, this.validatedInput.widgetText);
        }
        this.validatedInput = (TextInputWidget) null;
        return this.validationMessageForText(422, this.validatedInput.widgetText);
    }

    public static void releaseStaticReferences(int methodGuard) {
        fullscreenUnavailableFailureReason = null;
        if (methodGuard != 1) {
            fullscreenUnavailableFailureReason = (FullscreenFailureReason) null;
        }
    }

    TextInputValidator(TextInputWidget validatedInput) {
        try {
            this.validatedInput = validatedInput;
        } catch (RuntimeException validatorConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) validatorConstructionFailure), "q.<init>(" + (validatedInput != null ? "{...}" : "null") + ')');
        }
    }

    static {
        fullscreenUnavailableFailureReason = new FullscreenFailureReason();
        dialReferenceAngleRadians = Math.atan2(1.0, 0.0);
    }
}
