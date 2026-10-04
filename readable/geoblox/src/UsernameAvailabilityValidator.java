/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UsernameAvailabilityValidator extends TextInputValidator {
    static int[] cameraMeshVertexY;
    private boolean field_n;
    static float avatarTintBlueDelta;
    static int receivedRecordIdLow24;
    static String field_p;
    static Sprite orbCoinSprite;
    static String[] monthNames;
    private String field_k;

    final void c(byte param0) {
        this.field_k = null;
        if (param0 > -78) {
            avatarTintBlueDelta = -0.8683637976646423f;
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = CharacterReplacementSupport.replaceCharacter(param1, "", '_', (byte) 119);
          var3 = CachedArchiveSource.reverseTextCodeUnits(105, param2);
          if (param0 != 8) {
            cameraMeshVertexY = (int[]) null;
          }
          stackIn_7_0 = !(param1.indexOf(param2) == -1) || !(param1.indexOf(var3) == -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("uk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static String tutorialMessageForStep(int tutorialStepId, int param1) {
        int var2 = 0;
        int var3 = Geoblox.clientControlFlowFlag;
        if (param1 != 24146) {
            orbCoinSprite = (Sprite) null;
            var2 = tutorialStepId;
            if (var2 == 0) {
                return UsernameSuggestionsPanel.tutorialRotationMessage;
            }
            if (var2 == 1) {
                return ByteArrayPoolSupport.tutorialColourMatchMessage;
            }
            if (!(var2 == 2)) {
                if (var2 == 3) {
                    return ArchiveHandshakeState.tutorialCompleteMessage;
                }
                if (var2 == 5) {
                    return AccountCreationForm.tutorialFailedMessage;
                }
                return null;
            }
            return ReceivedTextRecord.tutorialShapeMatchMessage;
        }
        var2 = tutorialStepId;
        if (var2 == 0) {
            return UsernameSuggestionsPanel.tutorialRotationMessage;
        }
        if (var2 == 1) {
            return ByteArrayPoolSupport.tutorialColourMatchMessage;
        }
        if (!(var2 == 2)) {
            if (var2 == 3) {
                return ArchiveHandshakeState.tutorialCompleteMessage;
            }
            if (var2 == 5) {
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

    final static void a(int param0, int param1, boolean param2, LoginPayload param3, boolean param4) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
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
          EndingAnimationSupport.loginPayloadBuffer.writeShortBE(param1, 28695);
          param3.writePayload(124, EndingAnimationSupport.loginPayloadBuffer);
          CacheReference.outgoingSessionBuffer.position = 0;
          if (param2) {
            CacheReference.outgoingSessionBuffer.writeByte((byte) 121, 18);
          } else {
            CacheReference.outgoingSessionBuffer.writeByte((byte) -116, 16);
          }
          CacheReference.outgoingSessionBuffer.position = CacheReference.outgoingSessionBuffer.position + 2;
          var5_int = CacheReference.outgoingSessionBuffer.position;
          CacheReference.outgoingSessionBuffer.writeIntBE((byte) 95, MessageDialog.loginHeaderInt);
          CacheReference.outgoingSessionBuffer.writeLongBE((byte) 116, SessionInstanceState.clientInstanceId);
          var6 = 0;
          if (param0 <= 20) {
            return;
          }
          if (FontLoadingSupport.memberAccountMode) {
            var6 = var6 | 1;
          }
          if (GameGraphicsResources.loginResponseExtensionEnabled) {
            var6 = var6 | 4;
          }
          if (param4) {
            var6 = var6 | 8;
          }
          if (null != GameSoundResources.optionalLoginText) {
            var6 = var6 | 16;
          }
          CacheReference.outgoingSessionBuffer.writeByte((byte) 127, var6);
          var7 = Under13TermsPanel.a(-1, NodeHashTableIterator.getActiveApplet(111));
          if (var7 == null) {
            var7 = "";
          }
          CacheReference.outgoingSessionBuffer.writeNullTerminatedText(var7, 0);
          if (null != GameSoundResources.optionalLoginText) {
            CacheReference.outgoingSessionBuffer.writeZeroPrefixedNullTerminatedText(GameSoundResources.optionalLoginText, (byte) -126);
          }
          UiWidget.appendRsaXteaEncryptedBuffer(false, EndingAnimationSupport.loginPayloadBuffer, CacheReference.outgoingSessionBuffer, PlayfieldRules.loginModPowExponent, InstrumentPatch.field_l);
          CacheReference.outgoingSessionBuffer.backpatchLengthShortBE(-var5_int + CacheReference.outgoingSessionBuffer.position, true);
          NanoFrameTimer.flushSessionWrites(-1, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("uk.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(')').toString());
        }
    }

    final String validationMessageForText(int guard, String candidateText) {
        String var3 = null;
        RuntimeException var3_ref = null;
        UsernameAvailabilityQuery var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) candidateText);
          var3 = ResizableDialog.getAccountNameValidationError((byte) 44, var5);
          if (var3 != null) {
            stackIn_2_0 = var3;
            return stackIn_2_0;
          }
          if (!candidateText.equals(this.field_k)) {
            var4 = UsernameQuerySupport.requestOrReuseUsernameQuery((byte) 94, candidateText);
            if (var4 == null) {
              return null;
            }
            if (null != var4.field_e) {
              stackIn_8_0 = null;
              return (String) (stackIn_8_0);
            }
            this.field_k = candidateText;
            this.field_n = var4.field_g;
          }
          if (guard != 422) {
            avatarTintBlueDelta = -0.46423107385635376f;
          }
          if (this.field_n) {
            stackIn_16_0 = ByteShortQuery.createUsernameAvailableText;
            return stackIn_16_0;
          }
          stackIn_14_0 = ResourceArchive.createUsernameUnavailableText;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("uk.A(").append(guard).append(',');
          if (candidateText == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    UsernameAvailabilityValidator(TextInputWidget param0) {
        super(param0);
        this.field_n = false;
    }

    final ValidationState validationStateForText(int guard, String candidateText) {
        UsernameAvailabilityQuery var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        ValidationState stackIn_4_0 = null;
        ValidationState stackIn_10_0 = null;
        ValidationState stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -257) {
            var4 = (String) null;
            UsernameAvailabilityValidator.a(false, (String) null);
          }
          var5 = (CharSequence) ((Object) candidateText);
          if (!ValidatedTextInputWidget.isValidAccountName((byte) 82, var5)) {
            stackIn_4_0 = WidgetSkinState.invalidInputValidationState;
            return stackIn_4_0;
          }
          if (!candidateText.equals(this.field_k)) {
            var3 = UsernameQuerySupport.requestOrReuseUsernameQuery((byte) 108, candidateText);
            if ((var3 != null) &&
                (var3.field_e == null)) {
              this.field_n = var3.field_g;
              this.field_k = candidateText;
            } else {
              stackIn_10_0 = WidgetSkinState.pendingQueryValidationState;
              return stackIn_10_0;
            }
          }
          if (this.field_n) {
            stackIn_15_0 = SocketArchiveNetworkClient.validInputValidationState;
          } else {
            stackIn_15_0 = WidgetSkinState.invalidInputValidationState;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("uk.D(").append(guard).append(',');
          if (candidateText == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static boolean g(int param0) {
        if (param0 < 29) {
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

    final static void a(boolean param0, String param1) {
        try {
            if (param0) {
                UsernameAvailabilityValidator.d((byte) 81);
            }
            CanvasResizeController.field_e = param1;
            MidiNote.setPendingLoginUiAction(12, param0);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "uk.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 >= 70) {
            orbCoinSprite = null;
            field_p = null;
            cameraMeshVertexY = null;
            monthNames = null;
            return;
        }
        orbCoinSprite = (Sprite) null;
        orbCoinSprite = null;
        field_p = null;
        cameraMeshVertexY = null;
        monthNames = null;
    }

    static {
        cameraMeshVertexY = new int[8192];
        monthNames = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
