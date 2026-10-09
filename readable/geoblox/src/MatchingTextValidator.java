/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchingTextValidator extends TextInputValidator {
    private TextInputWidget referenceInput;
    static ReceivedTextRecord[] retainedTextRecords;
    static IntrusiveDeque rasterTargetStack;
    static int introAnimationTick;

    MatchingTextValidator(TextInputWidget validatedInput, TextInputWidget referenceInput) {
        super(validatedInput);
        try {
            this.referenceInput = referenceInput;
        } catch (RuntimeException validatorInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) validatorInitializationFailure), "n.<init>(" + (validatedInput != null ? "{...}" : "null") + ',' + (referenceInput != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(int guard) {
        rasterTargetStack = null;
        retainedTextRecords = null;
        if (guard != 0) {
            MatchingTextValidator.openDisplayNamePanel((byte) 89);
        }
    }

    final static Sprite[] buildNineSliceSprites(int innerAccentColor, int innerAccentWidth, int topLeftBorderColor, int edgeLength, byte referenceRetentionGuard, int fillColor, int bottomRightBorderColor, int borderGap, int outerBorderWidth) {
        int fillPixelStartSnapshot = 0;
        int bottomRightScanStartSnapshot = 0;
        int borderIndexOrCornerDiagonalSnapshot = 0;
        int outerBorderWidthOrDiagonalScanSnapshot = 0;
        int topLeftScanStartSnapshot = 0;
        int edgeScanStartSnapshot = 0;
        int accentScanStartOrRetentionGuardSnapshot = 0;
        int cornerSize = 0;
        Sprite[] slices = null;
        Sprite[] slicesToFill = null;
        int borderIndex = 0;
        int scanIndex = 0;
        Sprite sliceToFill = null;
        int fillPixelIndex = 0;
        int controlFlowGuard = 0;
        int borderIndexLiteralPhase1;
        int scanIndexLiteralPhase1;
        int scanIndexLiteralPhase2;
        controlFlowGuard = Geoblox.clientControlFlowFlag;
        cornerSize = innerAccentWidth + borderGap + outerBorderWidth;
        slices = new Sprite[]{new Sprite(cornerSize, cornerSize), new Sprite(edgeLength, cornerSize), new Sprite(cornerSize, cornerSize), new Sprite(cornerSize, edgeLength), new Sprite(64, 64), new Sprite(cornerSize, edgeLength), new Sprite(cornerSize, cornerSize), new Sprite(edgeLength, cornerSize), new Sprite(cornerSize, cornerSize)};
        slicesToFill = slices;
        scanIndex = 0;
        sliceFillLoop: while (true) {
          if (scanIndex < slicesToFill.length) {
            sliceToFill = slicesToFill[scanIndex];
            fillPixelStartSnapshot = 0;
            if (controlFlowGuard != 0) {
              break sliceFillLoop;
            }
            fillPixelIndex = fillPixelStartSnapshot;
            while (sliceToFill.pixels.length > fillPixelIndex) {
              sliceToFill.pixels[fillPixelIndex] = fillColor;
              fillPixelIndex++;
            }
            scanIndex++;
            continue sliceFillLoop;
          }
          fillPixelStartSnapshot = 0;
          break;
        }
        borderIndex = fillPixelStartSnapshot;
        bottomRightBorderLoop: while (true) {
          if (borderIndex < outerBorderWidth) {
            bottomRightScanStartSnapshot = 0;
            if (controlFlowGuard != 0) {
              break bottomRightBorderLoop;
            }
            scanIndexLiteralPhase1 = bottomRightScanStartSnapshot;
            while (cornerSize > scanIndexLiteralPhase1) {
              slices[6].pixels[scanIndexLiteralPhase1 + (cornerSize - borderIndex - 1) * cornerSize] = bottomRightBorderColor;
              slices[8].pixels[scanIndexLiteralPhase1 + (-1 - borderIndex + cornerSize) * cornerSize] = bottomRightBorderColor;
              slices[2].pixels[scanIndexLiteralPhase1 * cornerSize - borderIndex + cornerSize - 1] = bottomRightBorderColor;
              slices[8].pixels[-borderIndex - 1 - (-cornerSize - cornerSize * scanIndexLiteralPhase1)] = bottomRightBorderColor;
              scanIndexLiteralPhase1++;
            }
            borderIndex++;
            continue bottomRightBorderLoop;
          }
          bottomRightScanStartSnapshot = 0;
          break;
        }
        borderIndexLiteralPhase1 = bottomRightScanStartSnapshot;
        while (true) {
          borderIndexOrCornerDiagonalSnapshot = borderIndexLiteralPhase1;
          outerBorderWidthOrDiagonalScanSnapshot = outerBorderWidth;
          if (borderIndexOrCornerDiagonalSnapshot < outerBorderWidthOrDiagonalScanSnapshot) {
            topLeftScanStartSnapshot = 0;
            if (controlFlowGuard == 0) {
              scanIndexLiteralPhase2 = topLeftScanStartSnapshot;
              while (cornerSize > scanIndexLiteralPhase2) {
                slices[0].pixels[scanIndexLiteralPhase2 + borderIndexLiteralPhase1 * cornerSize] = topLeftBorderColor;
                slices[0].pixels[borderIndexLiteralPhase1 + scanIndexLiteralPhase2 * cornerSize] = topLeftBorderColor;
                borderIndexOrCornerDiagonalSnapshot = ~(-borderIndexLiteralPhase1 + cornerSize);
                outerBorderWidthOrDiagonalScanSnapshot = ~scanIndexLiteralPhase2;
                if (borderIndexOrCornerDiagonalSnapshot < outerBorderWidthOrDiagonalScanSnapshot) {
                  slices[2].pixels[cornerSize * borderIndexLiteralPhase1 + scanIndexLiteralPhase2] = topLeftBorderColor;
                  slices[6].pixels[borderIndexLiteralPhase1 + scanIndexLiteralPhase2 * cornerSize] = topLeftBorderColor;
                }
                scanIndexLiteralPhase2++;
              }
              borderIndexLiteralPhase1++;
              continue;
            }
          } else {
            topLeftScanStartSnapshot = 0;
          }
          borderIndexLiteralPhase1 = topLeftScanStartSnapshot;
          edgeBorderLoop: while (true) {
            if (borderIndexLiteralPhase1 < edgeLength) {
              edgeScanStartSnapshot = 0;
              if (controlFlowGuard != 0) {
                break edgeBorderLoop;
              }
              scanIndexLiteralPhase2 = edgeScanStartSnapshot;
              while (outerBorderWidth > scanIndexLiteralPhase2) {
                slices[7].pixels[edgeLength * (cornerSize - scanIndexLiteralPhase2 - 1) + borderIndexLiteralPhase1] = bottomRightBorderColor;
                slices[5].pixels[-1 + (cornerSize - scanIndexLiteralPhase2 + borderIndexLiteralPhase1 * cornerSize)] = bottomRightBorderColor;
                slices[1].pixels[edgeLength * scanIndexLiteralPhase2 + borderIndexLiteralPhase1] = topLeftBorderColor;
                slices[3].pixels[scanIndexLiteralPhase2 + cornerSize * borderIndexLiteralPhase1] = topLeftBorderColor;
                scanIndexLiteralPhase2++;
              }
              borderIndexLiteralPhase1++;
              continue edgeBorderLoop;
            }
            edgeScanStartSnapshot = 0;
            break;
          }
          borderIndexLiteralPhase1 = edgeScanStartSnapshot;
          innerAccentLoop: while (true) {
            if (borderIndexLiteralPhase1 < edgeLength >> 1) {
              accentScanStartOrRetentionGuardSnapshot = 0;
              if (controlFlowGuard != 0) {
                break innerAccentLoop;
              }
              scanIndexLiteralPhase2 = accentScanStartOrRetentionGuardSnapshot;
              while (innerAccentWidth > scanIndexLiteralPhase2) {
                slices[1].pixels[edgeLength * (-1 + (-scanIndexLiteralPhase2 + cornerSize)) + borderIndexLiteralPhase1] = innerAccentColor;
                slices[3].pixels[-1 + cornerSize + (-scanIndexLiteralPhase2 + cornerSize * borderIndexLiteralPhase1)] = innerAccentColor;
                slices[7].pixels[borderIndexLiteralPhase1 + edgeLength * scanIndexLiteralPhase2] = innerAccentColor;
                slices[5].pixels[cornerSize * borderIndexLiteralPhase1 + scanIndexLiteralPhase2] = innerAccentColor;
                scanIndexLiteralPhase2++;
              }
              borderIndexLiteralPhase1++;
              continue innerAccentLoop;
            }
            accentScanStartOrRetentionGuardSnapshot = referenceRetentionGuard;
            break;
          }
          if (accentScanStartOrRetentionGuardSnapshot != 1) {
            MatchingTextValidator.clearStaticReferences(5);
          }
          return slices;
        }
    }

    final static void openDisplayNamePanel(byte methodGuard) {
        if (Geoblox.activeMessageDialog != null) {
            Geoblox.activeMessageDialog.dismissDialog((byte) -104);
        }
        MouseWheelInput.activeDisplayNamePanel = new DisplayNamePanel();
        int guardQuotient = 32 / ((methodGuard - 43) / 47);
        ButtonWidget.accountContentDialog.replaceContent(MouseWheelInput.activeDisplayNamePanel, -106);
    }

    final ValidationState validationStateForText(int guard, String candidateText) {
        ValidationProvider referenceValidation = null;
        RuntimeException stateLookupFailureForContext = null;
        ValidationState invalidGuardNullState = null;
        ValidationState invalidReferenceState = null;
        ValidationState textComparisonState = null;
        RuntimeException stateLookupFailureBeforeDescription = null;
        StringBuilder stateLookupMessagePrefix = null;
        String candidateTextDescription = null;
        RuntimeException stateLookupFailure = null;
        try {
          if (guard != -257) {
            invalidGuardNullState = (ValidationState) null;
            return invalidGuardNullState;
          }
          if (this.referenceInput instanceof ValidationProviderSource) {
            referenceValidation = ((ValidationProviderSource) ((Object) this.referenceInput)).getValidationProvider((byte) -106);
            if (referenceValidation != null &&
                referenceValidation.getDebouncedValidationState((byte) -105) != SocketArchiveNetworkClient.validInputValidationState) {
              invalidReferenceState = WidgetSkinState.invalidInputValidationState;
              return invalidReferenceState;
            }
          }
          if (!candidateText.equals(this.referenceInput.widgetText)) {
            textComparisonState = WidgetSkinState.invalidInputValidationState;
          } else {
            textComparisonState = SocketArchiveNetworkClient.validInputValidationState;
          }
          return textComparisonState;
        } catch (java.lang.RuntimeException caughtStateLookupFailure) {
          stateLookupFailure = caughtStateLookupFailure;
          stateLookupFailureForContext = stateLookupFailure;
          stateLookupFailureBeforeDescription = stateLookupFailureForContext;
          stateLookupMessagePrefix = new StringBuilder().append("n.D(").append(guard).append(',');
          if (candidateText == null) {
            candidateTextDescription = "null";
          } else {
            candidateTextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stateLookupFailureBeforeDescription), ((StringBuilder) (Object) stateLookupMessagePrefix).append(candidateTextDescription).append(')').toString());
        }
    }

    final String validationMessageForText(int guard, String candidateText) {
        ValidationProvider referenceValidation = null;
        RuntimeException messageLookupFailureForContext = null;
        String validReferenceMismatchMessage = null;
        String referenceValidationMessage = null;
        String plainReferenceMismatchMessage = null;
        RuntimeException messageLookupFailureBeforeDescription = null;
        StringBuilder messageLookupMessagePrefix = null;
        String candidateTextDescription = null;
        RuntimeException messageLookupFailure = null;
        try {
          if (guard != 422) {
            rasterTargetStack = (IntrusiveDeque) null;
          }
          if (this.referenceInput instanceof ValidationProviderSource) {
            referenceValidation = ((ValidationProviderSource) ((Object) this.referenceInput)).getValidationProvider((byte) -118);
            if (referenceValidation != null) {
              if (referenceValidation.getDebouncedValidationState((byte) -105) == SocketArchiveNetworkClient.validInputValidationState &&
                  !candidateText.equals(this.referenceInput.widgetText)) {
                validReferenceMismatchMessage = GrowableIntList.createMismatchAlertText;
                return validReferenceMismatchMessage;
              }
              referenceValidationMessage = referenceValidation.getDebouncedValidationMessage(-21666);
              return referenceValidationMessage;
            }
          }
          if (candidateText.equals(this.referenceInput.widgetText)) {
            return null;
          }
          plainReferenceMismatchMessage = GrowableIntList.createMismatchAlertText;
          return plainReferenceMismatchMessage;
        } catch (java.lang.RuntimeException caughtMessageLookupFailure) {
          messageLookupFailure = caughtMessageLookupFailure;
          messageLookupFailureForContext = messageLookupFailure;
          messageLookupFailureBeforeDescription = messageLookupFailureForContext;
          messageLookupMessagePrefix = new StringBuilder().append("n.A(").append(guard).append(',');
          if (candidateText == null) {
            candidateTextDescription = "null";
          } else {
            candidateTextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) messageLookupFailureBeforeDescription), ((StringBuilder) (Object) messageLookupMessagePrefix).append(candidateTextDescription).append(')').toString());
        }
    }

    final static UsernameAvailabilityQuery pollAccountCreationUsernameResult(byte methodGuard) {
        if (DiskCacheWorker.idleClientFlowToken == ClientFlowState.accountCreationFlowState) {
            throw new IllegalStateException();
        }
        int guardRemainder = 28 % ((-79 - methodGuard) / 44);
        if (MeshPrioritySupport.completedClientFlowToken == ClientFlowState.accountCreationFlowState) {
            ClientFlowState.accountCreationFlowState = DiskCacheWorker.idleClientFlowToken;
            return UsernameQueryState.pendingAccountUsernameResult;
        }
        return null;
    }

    static {
        rasterTargetStack = new IntrusiveDeque();
    }
}
