/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextTemplateDefinition extends DualLinkNode {
    static GameScreen[] screens;
    static float entityMotionSpeed;
    static int loginMembershipGateValue;
    int[] referencedTemplateIds;
    private int[] argumentTypeIds;
    private String[] literalSegments;
    private int[][] argumentValues;

    final static String formatSessionPacketDiagnostic(int methodGuard) {
        int payloadByteIndex = 0;
        String diagnosticText;
        int byteValueThenLowHexCharacter;
        int highHexCharacter;
        int unusedClientControlSnapshot;
        String opcodeHistoryText;
        String textBeforeHexByte;
        String textBeforeLowHexCharacter;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        opcodeHistoryText = "(" + MidiNoteMixer.thirdPreviousPacketOpcode + " " + AttachedEntityRenderer.secondPreviousPacketOpcode + " " + VisualPropertyNode.previousPacketOpcode + ") " + ScorePopup.currentPacketOpcode;
        diagnosticText = opcodeHistoryText;
        if (0 < AchievementSubmission.sessionPacketPayloadLength) {
          diagnosticText = opcodeHistoryText + ":";
          for (payloadByteIndex = 0; payloadByteIndex < AchievementSubmission.sessionPacketPayloadLength; payloadByteIndex++) {
            textBeforeHexByte = diagnosticText + ' ';
            diagnosticText = textBeforeHexByte;
            byteValueThenLowHexCharacter = 255 & LogoCompositor.sessionPacketBuffer.bytes[payloadByteIndex];
            highHexCharacter = byteValueThenLowHexCharacter >> 4;
            byteValueThenLowHexCharacter = byteValueThenLowHexCharacter & 15;
            if (highHexCharacter >= 10) {
              highHexCharacter += 55;
            } else {
              highHexCharacter += 48;
            }
            if (byteValueThenLowHexCharacter < 10) {
              byteValueThenLowHexCharacter += 48;
            } else {
              byteValueThenLowHexCharacter += 55;
            }
            textBeforeLowHexCharacter = textBeforeHexByte + (char)highHexCharacter;
            diagnosticText = textBeforeLowHexCharacter + (char)byteValueThenLowHexCharacter;
          }
        }
        if (methodGuard == 55) {
          return diagnosticText;
        }
        return (String) null;
    }

    private final void decodeOpcode(int opcode, ByteArrayBuffer buffer, int methodGuard) {
        int[] allocatedArgumentValues = null;
        int argumentValueIndex = 0;
        RuntimeException opcodeFailureBeforeDescription = null;
        StringBuilder opcodeMessagePrefix = null;
        String bufferDescription = null;
        RuntimeException opcodeFailure = null;
        int entryCount = 0;
        RuntimeException opcodeFailureForContext = null;
        int entryIndex = 0;
        int argumentTypeId = 0;
        TextTemplateArgumentType argumentType = null;
        int clientControlFlowSnapshot = 0;
        ByteArrayBuffer unusedNullBufferForInvalidGuard = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (1 == opcode) {
            this.literalSegments = FullscreenFailureReason.splitAtCharacter('<', true, buffer.readNullTerminatedText((byte) 116));
          } else {
            if (2 == opcode) {
              entryCount = buffer.readUnsignedByte((byte) 34);
              this.referencedTemplateIds = new int[entryCount];
              for (entryIndex = 0; entryIndex < entryCount; entryIndex++) {
                this.referencedTemplateIds[entryIndex] = buffer.readUnsignedShortBE(true);
              }
            } else {
              if (3 == opcode) {
                entryCount = buffer.readUnsignedByte((byte) 34);
                this.argumentValues = new int[entryCount][];
                this.argumentTypeIds = new int[entryCount];
                for (entryIndex = 0; entryCount > entryIndex; entryIndex++) {
                  argumentTypeId = buffer.readUnsignedShortBE(true);
                  argumentType = TextTemplateLookupSupport.findTextTemplateArgumentType(false, argumentTypeId);
                  if (argumentType != null) {
                    this.argumentTypeIds[entryIndex] = argumentTypeId;
                    allocatedArgumentValues = new int[argumentType.valueCount];
                    this.argumentValues[entryIndex] = allocatedArgumentValues;
                    for (argumentValueIndex = 0; argumentType.valueCount > argumentValueIndex; argumentValueIndex++) {
                      this.argumentValues[entryIndex][argumentValueIndex] = buffer.readUnsignedShortBE(true);
                    }
                  }
                }
              } else {
                if (opcode != 4) {
                }
              }
            }
          }
          if (methodGuard != -26093) {
            unusedNullBufferForInvalidGuard = (ByteArrayBuffer) null;
            this.decode(-112, (ByteArrayBuffer) null);
          }
          return;
        } catch (java.lang.RuntimeException caughtOpcodeFailure) {
          opcodeFailure = caughtOpcodeFailure;
          opcodeFailureForContext = opcodeFailure;
          opcodeFailureBeforeDescription = opcodeFailureForContext;
          opcodeMessagePrefix = new StringBuilder().append("og.H(").append(opcode).append(',');
          if (buffer == null) {
            bufferDescription = "null";
          } else {
            bufferDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) opcodeFailureBeforeDescription), ((StringBuilder) (Object) opcodeMessagePrefix).append(bufferDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final void markAlternateReferences(byte methodGuard) {
        int referencedTemplateIndex = 0;
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        if (methodGuard != 119) {
            entityMotionSpeed = 0.380857914686203f;
        }
        if (this.referencedTemplateIds != null) {
            for (referencedTemplateIndex = 0; this.referencedTemplateIds.length > referencedTemplateIndex; referencedTemplateIndex++) {
                this.referencedTemplateIds[referencedTemplateIndex] = SessionInstanceState.orInt(this.referencedTemplateIds[referencedTemplateIndex], 32768);
            }
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard < 71) {
            TextTemplateDefinition.formatSessionPacketDiagnostic(41);
        }
        screens = null;
    }

    final String summarizeLiteralSegments(byte methodGuard) {
        int literalSegmentIndex = 0;
        StringBuilder ignoredEllipsisAppendResult = null;
        StringBuilder ignoredSegmentAppendResult = null;
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        StringBuilder literalSummaryBuilder = new StringBuilder(80);
        StringBuilder literalSummaryBuilderAlias = literalSummaryBuilder;
        if (methodGuard > -7) {
            TextTemplateDefinition.releaseStaticReferences(41);
        }
        if (null == this.literalSegments) {
            return "";
        }
        StringBuilder ignoredInitialAppendResult = literalSummaryBuilder.append(this.literalSegments[0]);
        for (literalSegmentIndex = 1; this.literalSegments.length > literalSegmentIndex; literalSegmentIndex++) {
            ignoredEllipsisAppendResult = literalSummaryBuilderAlias.append("...");
            ignoredSegmentAppendResult = literalSummaryBuilder.append(this.literalSegments[literalSegmentIndex]);
        }
        return literalSummaryBuilderAlias.toString();
    }

    TextTemplateDefinition() {
    }

    final static void showAccountLoginPanel(int methodGuard, String messageForFailureContext, boolean showCreateAccount, boolean allowJustPlay) {
        UnderlinedButtonRenderer.resetAccountUiFlow(-6011);
        ClientFlowState.accountDialogLayer.hideAllDialogs(10936);
        if (methodGuard != 2274) {
            return;
        }
        try {
            SpriteButtonRenderer.activeLoginPanel = new LoginPanel(TextTemplateLookupSupport.currentLoginIdentifier, (String) null, AgeValidator.reconnectingLoginMode, showCreateAccount, allowJustPlay);
            ButtonWidget.accountContentDialog = new AccountContentDialog(ClientFlowState.accountDialogLayer, SpriteButtonRenderer.activeLoginPanel);
            ClientFlowState.accountDialogLayer.showDialog(false, ButtonWidget.accountContentDialog);
        } catch (RuntimeException panelFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) panelFailure), "og.C(" + methodGuard + ',' + (messageForFailureContext != null ? "{...}" : "null") + ',' + showCreateAccount + ',' + allowJustPlay + ')');
        }
    }

    final void decode(int methodGuard, ByteArrayBuffer buffer) {
        int opcode = 0;
        int clientControlFlowSnapshot = 0;
        RuntimeException decodeFailureBeforeDescription = null;
        StringBuilder decodeMessagePrefix = null;
        String bufferDescription = null;
        RuntimeException decodeFailure = null;
        RuntimeException decodeFailureForContext = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != 0) {
            return;
          }
          while (true) {
            opcode = buffer.readUnsignedByte((byte) 34);
            if (0 == opcode) {
              return;
            }
            this.decodeOpcode(opcode, buffer, -26093);
          }
        } catch (java.lang.RuntimeException caughtDecodeFailure) {
          decodeFailure = caughtDecodeFailure;
          decodeFailureForContext = decodeFailure;
          decodeFailureBeforeDescription = decodeFailureForContext;
          decodeMessagePrefix = new StringBuilder().append("og.B(").append(methodGuard).append(',');
          if (buffer == null) {
            bufferDescription = "null";
          } else {
            bufferDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) decodeFailureBeforeDescription), ((StringBuilder) (Object) decodeMessagePrefix).append(bufferDescription).append(')').toString());
        }
    }

    final static String replaceLiteralOccurrences(String textThenReplacedText, String replacementText, boolean methodGuard, String targetText) {
        if (!methodGuard) {
            String unusedNullTextSnapshot = (String) null;
            TextTemplateDefinition.replaceLiteralOccurrences((String) null, (String) null, true, (String) null);
        }
        int matchIndex = textThenReplacedText.indexOf(targetText);
        while (matchIndex != -1) {
            textThenReplacedText = textThenReplacedText.substring(0, matchIndex) + replacementText + textThenReplacedText.substring(targetText.length() + matchIndex);
            matchIndex = textThenReplacedText.indexOf(targetText, replacementText.length() + matchIndex);
        }
        return textThenReplacedText;
    }

    static {
        screens = new GameScreen[9];
    }
}
