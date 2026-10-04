/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AvatarFeedbackSupport {
    static Sprite grayJagexLogoSprite;
    static String toCustomerSupportText;
    static String receivedRecordDisplayName;

    final static void requestAvatarFeedback(int feedbackRequestId, boolean clearSpriteGuard) {
        int unusedClientControlSnapshot;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        if ((7 == feedbackRequestId) &&
            (MenuScreen.avatarFeedbackFrameBase != 36)) {
          MenuScreen.avatarFeedbackFrameBase = 36;
          LimitedRandomAccessFile.avatarFeedbackHoldTicks = 110;
          TextValidationFailure.avatarFeedbackModeId = 6;
          ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[23]);
        }
        if (LimitedRandomAccessFile.avatarFeedbackHoldTicks > 0) {
          if (feedbackRequestId == 3) {
            WidgetTheme.avatarShockEffectTicks = 50;
            ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[27]);
          }
        } else {
          if (!clearSpriteGuard) {
            if (feedbackRequestId != 0) {
              if (1 == feedbackRequestId) {
                TextValidationFailure.avatarFeedbackModeId = 1;
                MenuScreen.avatarFeedbackFrameBase = 6;
              } else {
                if (feedbackRequestId != 2) {
                  if (3 == feedbackRequestId) {
                    MenuScreen.avatarFeedbackFrameBase = 18;
                    WidgetTheme.avatarShockEffectTicks = 50;
                    LimitedRandomAccessFile.avatarFeedbackHoldTicks = 110;
                    TextValidationFailure.avatarFeedbackModeId = 3;
                    ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[27]);
                  } else {
                    if (feedbackRequestId == 4) {
                      LimitedRandomAccessFile.avatarFeedbackHoldTicks = 110;
                      MenuScreen.avatarFeedbackFrameBase = 24;
                      TextValidationFailure.avatarFeedbackModeId = 4;
                    } else {
                      if (feedbackRequestId == 5) {
                        LimitedRandomAccessFile.avatarFeedbackHoldTicks = 110;
                        TextValidationFailure.avatarFeedbackModeId = 5;
                        MenuScreen.avatarFeedbackFrameBase = 30;
                        ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[24]);
                      }
                    }
                  }
                } else {
                  if ((12 != MenuScreen.avatarFeedbackFrameBase) &&
                      (MenuScreen.avatarFeedbackFrameBase != 24) &&
                      (30 != MenuScreen.avatarFeedbackFrameBase) &&
                      (36 != MenuScreen.avatarFeedbackFrameBase)) {
                    ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[26]);
                  }
                  TextValidationFailure.avatarFeedbackModeId = 2;
                  MenuScreen.avatarFeedbackFrameBase = 12;
                }
              }
            } else {
              if ((MenuScreen.avatarFeedbackFrameBase != 0) &&
                  (24 != MenuScreen.avatarFeedbackFrameBase) &&
                  (MenuScreen.avatarFeedbackFrameBase != 30) &&
                  (MenuScreen.avatarFeedbackFrameBase != 36)) {
                ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[25]);
              }
              MenuScreen.avatarFeedbackFrameBase = 0;
              TextValidationFailure.avatarFeedbackModeId = 0;
            }
          } else {
            grayJagexLogoSprite = (Sprite) null;
            if (feedbackRequestId == 0) {
              if ((MenuScreen.avatarFeedbackFrameBase != 0) &&
                  (24 != MenuScreen.avatarFeedbackFrameBase) &&
                  (MenuScreen.avatarFeedbackFrameBase != 30) &&
                  (MenuScreen.avatarFeedbackFrameBase != 36)) {
                ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[25]);
              }
              MenuScreen.avatarFeedbackFrameBase = 0;
              TextValidationFailure.avatarFeedbackModeId = 0;
            } else {
              if (1 == feedbackRequestId) {
                TextValidationFailure.avatarFeedbackModeId = 1;
                MenuScreen.avatarFeedbackFrameBase = 6;
              } else {
                if (feedbackRequestId != 2) {
                  if (3 == feedbackRequestId) {
                    MenuScreen.avatarFeedbackFrameBase = 18;
                    WidgetTheme.avatarShockEffectTicks = 50;
                    LimitedRandomAccessFile.avatarFeedbackHoldTicks = 110;
                    TextValidationFailure.avatarFeedbackModeId = 3;
                    ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[27]);
                  } else {
                    if (feedbackRequestId == 4) {
                      LimitedRandomAccessFile.avatarFeedbackHoldTicks = 110;
                      MenuScreen.avatarFeedbackFrameBase = 24;
                      TextValidationFailure.avatarFeedbackModeId = 4;
                    } else {
                      if (feedbackRequestId == 5) {
                        LimitedRandomAccessFile.avatarFeedbackHoldTicks = 110;
                        TextValidationFailure.avatarFeedbackModeId = 5;
                        MenuScreen.avatarFeedbackFrameBase = 30;
                        ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[24]);
                      }
                    }
                  }
                } else {
                  if ((12 != MenuScreen.avatarFeedbackFrameBase) &&
                      (MenuScreen.avatarFeedbackFrameBase != 24) &&
                      (30 != MenuScreen.avatarFeedbackFrameBase) &&
                      (36 != MenuScreen.avatarFeedbackFrameBase)) {
                    ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[26]);
                  }
                  TextValidationFailure.avatarFeedbackModeId = 2;
                  MenuScreen.avatarFeedbackFrameBase = 12;
                }
              }
            }
          }
          DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex % 6 + MenuScreen.avatarFeedbackFrameBase;
        }
    }

    final static MeshMaterial[] readMeshMaterials(PacketBuffer input, boolean readEnabled) {
        int materialIndex = 0;
        int formatVersion = 0;
        RuntimeException contextFailure = null;
        int materialCount = 0;
        MeshMaterial[] materials = null;
        MeshMaterial newMaterial = null;
        int referencedMaterialIndex = 0;
        int controlFlagSnapshot = 0;
        MeshMaterial[] disabledResult = null;
        Object unsupportedVersionResult = null;
        MeshMaterial[] decodedMaterialsResult = null;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String inputContextDescription = null;
        RuntimeException caughtFailure = null;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          formatVersion = input.readBits((byte) -17, 8);
          if (!readEnabled) {
            disabledResult = (MeshMaterial[]) null;
            return disabledResult;
          }
          if (0 < formatVersion) {
            unsupportedVersionResult = null;
            return (MeshMaterial[]) (unsupportedVersionResult);
          }
          materialCount = input.readBits((byte) -17, 12);
          materials = new MeshMaterial[materialCount];
          for (materialIndex = 0; materialCount > materialIndex; materialIndex++) {
            if (!TextInputRenderer.readBooleanBit((byte) 71, input)) {
              referencedMaterialIndex = input.readBits((byte) -17, ValidationIconWidget.computePackedValueBitCount(materialIndex - 1, (byte) 66));
              materials[materialIndex] = materials[referencedMaterialIndex];
            } else {
              newMaterial = new MeshMaterial();
              input.readBits((byte) -17, 24);
              input.readBits((byte) -17, 24);
              newMaterial.baseRgb = input.readBits((byte) -17, 24);
              input.readBits((byte) -17, 9);
              input.readBits((byte) -17, 12);
              input.readBits((byte) -17, 12);
              input.readBits((byte) -17, 12);
              materials[materialIndex] = newMaterial;
            }
          }
          decodedMaterialsResult = materials;
          return decodedMaterialsResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          contextFailure = caughtFailure;
          failureContextCause = contextFailure;
          failureContextBuilder = new StringBuilder().append("jc.D(");
          if (input == null) {
            inputContextDescription = "null";
          } else {
            inputContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(inputContextDescription).append(',').append(readEnabled).append(')').toString());
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        receivedRecordDisplayName = null;
        grayJagexLogoSprite = null;
        if (methodGuard > -13) {
            grayJagexLogoSprite = (Sprite) null;
            toCustomerSupportText = null;
            return;
        }
        toCustomerSupportText = null;
    }

    final static int computeAdjustedRemainder(int dividend, int divisor, int methodGuard) {
        int negativeDividendAdjustment = 0;
        if (methodGuard <= -33) {
            negativeDividendAdjustment = dividend >> 31 & divisor - 1;
            return negativeDividendAdjustment + ((dividend >>> 31) + dividend) % divisor;
        }
        return 80;
    }

    static {
        toCustomerSupportText = "To Customer Support";
    }
}
