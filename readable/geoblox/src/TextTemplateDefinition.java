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
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        TextTemplateArgumentType var7 = null;
        int var9 = 0;
        ByteArrayBuffer var10 = null;
        var9 = Geoblox.clientControlFlowFlag;
        try {
          if (1 == opcode) {
            this.literalSegments = FullscreenFailureReason.splitAtCharacter('<', true, buffer.readNullTerminatedText((byte) 116));
          } else {
            if (2 == opcode) {
              var4_int = buffer.readUnsignedByte((byte) 34);
              this.referencedTemplateIds = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.referencedTemplateIds[var5] = buffer.readUnsignedShortBE(true);
              }
            } else {
              if (3 == opcode) {
                var4_int = buffer.readUnsignedByte((byte) 34);
                this.argumentValues = new int[var4_int][];
                this.argumentTypeIds = new int[var4_int];
                for (var5 = 0; var4_int > var5; var5++) {
                  var6 = buffer.readUnsignedShortBE(true);
                  var7 = TextTemplateLookupSupport.findTextTemplateArgumentType(false, var6);
                  if (var7 != null) {
                    this.argumentTypeIds[var5] = var6;
                    array$0 = new int[var7.valueCount];
                    this.argumentValues[var5] = array$0;
                    for (var8 = 0; var7.valueCount > var8; var8++) {
                      this.argumentValues[var5][var8] = buffer.readUnsignedShortBE(true);
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
            var10 = (ByteArrayBuffer) null;
            this.decode(-112, (ByteArrayBuffer) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("og.H(").append(opcode).append(',');
          if (buffer == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(methodGuard).append(')').toString());
        }
    }

    final void markAlternateReferences(byte methodGuard) {
        int var2 = 0;
        int var3 = Geoblox.clientControlFlowFlag;
        if (methodGuard != 119) {
            entityMotionSpeed = 0.380857914686203f;
        }
        if ((this.referencedTemplateIds != null)) {
            for (var2 = 0; this.referencedTemplateIds.length > var2; var2++) {
                this.referencedTemplateIds[var2] = SessionInstanceState.orInt(this.referencedTemplateIds[var2], 32768);
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
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = Geoblox.clientControlFlowFlag;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (methodGuard > -7) {
            TextTemplateDefinition.releaseStaticReferences(41);
        }
        if (null == this.literalSegments) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(this.literalSegments[0]);
        for (var3 = 1; this.literalSegments.length > var3; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var5.append(this.literalSegments[var3]);
        }
        return var2.toString();
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
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != 0) {
            return;
          }
          while (true) {
            var3_int = buffer.readUnsignedByte((byte) 34);
            if (0 == var3_int) {
              return;
            }
            this.decodeOpcode(var3_int, buffer, -26093);
            continue;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("og.B(").append(methodGuard).append(',');
          if (buffer == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
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
