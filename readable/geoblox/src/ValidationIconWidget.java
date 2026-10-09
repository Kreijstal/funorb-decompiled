/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationIconWidget extends ButtonWidget {
    private ValidationProvider validationProvider;
    static LoginMethod emptyNameLoginMethod;
    private int animationTicks;
    static boolean clientCookieMarkerCreated;
    static int rotatedEntityScreenY;

    final static int computePackedValueBitCount(int valueThenShiftedRemainder, byte methodGuard) {
        int bitCount;
        if (valueThenShiftedRemainder == 0) {
          return 0;
        }
        if (valueThenShiftedRemainder > 0) {
          bitCount = 1;
          if (valueThenShiftedRemainder > 65535) {
            valueThenShiftedRemainder = valueThenShiftedRemainder >> 16;
            bitCount += 16;
          }
          if (valueThenShiftedRemainder > 255) {
            bitCount += 8;
            valueThenShiftedRemainder = valueThenShiftedRemainder >> 8;
          }
          if (valueThenShiftedRemainder > 15) {
            bitCount += 4;
            valueThenShiftedRemainder = valueThenShiftedRemainder >> 4;
          }
          if (valueThenShiftedRemainder > 3) {
            bitCount += 2;
            valueThenShiftedRemainder = valueThenShiftedRemainder >> 2;
          }
          if (valueThenShiftedRemainder > 1) {
            valueThenShiftedRemainder = valueThenShiftedRemainder >> 1;
            bitCount++;
          }
          return bitCount;
        }
        bitCount = 2;
        if (valueThenShiftedRemainder < -65536) {
          bitCount += 16;
          valueThenShiftedRemainder = valueThenShiftedRemainder >> 16;
        }
        if (valueThenShiftedRemainder < -256) {
          valueThenShiftedRemainder = valueThenShiftedRemainder >> 8;
          bitCount += 8;
        }
        if (methodGuard != 66) {
          clientCookieMarkerCreated = true;
        }
        if (-16 > valueThenShiftedRemainder) {
          valueThenShiftedRemainder = valueThenShiftedRemainder >> 4;
          bitCount += 4;
        }
        if (valueThenShiftedRemainder < -4) {
          valueThenShiftedRemainder = valueThenShiftedRemainder >> 2;
          bitCount += 2;
        }
        if (-2 > valueThenShiftedRemainder) {
          bitCount++;
          valueThenShiftedRemainder = valueThenShiftedRemainder >> 1;
        }
        return bitCount;
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard > -114) {
            StringBuilder unusedNullBuilderSnapshot = (StringBuilder) null;
            ValidationIconWidget.writeTextAtOffset((CharSequence) null, (StringBuilder) null, -1, -77);
        }
        emptyNameLoginMethod = null;
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int iconCenterX;
        int iconCenterY;
        int renderGuardRemainder;
        ValidationState validationState;
        int requiredScratchWidth;
        int requiredScratchHeight;
        int clientControlFlowSnapshot;
        Sprite waitingIconSprite;
        Sprite invalidIconSprite;
        Sprite validIconSprite;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        super.renderWidget(parentX, parentY, (byte) -86, renderPass);
        if (0 != renderPass) {
          return;
        }
        iconCenterX = (this.widgetWidth >> 1) + (this.widgetX + parentX);
        renderGuardRemainder = -74 % ((methodGuard - 1) / 43);
        iconCenterY = parentY - (-this.widgetY - (this.widgetHeight >> 1));
        validationState = this.validationProvider.getDebouncedValidationState((byte) -105);
        if (validationState != ImageProducerRasterBuffer.debouncingValidationState &&
            WidgetSkinState.pendingQueryValidationState != validationState) {
          if (WidgetSkinState.invalidInputValidationState == validationState) {
            invalidIconSprite = ClientClockSupport.validationStateSprites[2];
            invalidIconSprite.drawAdditive(-(invalidIconSprite.width >> 1) + iconCenterX, iconCenterY - (invalidIconSprite.height >> 1), 256);
          } else if (validationState == SocketArchiveNetworkClient.validInputValidationState) {
            validIconSprite = ClientClockSupport.validationStateSprites[1];
            validIconSprite.drawAdditive(-(validIconSprite.width >> 1) + iconCenterX, iconCenterY - (validIconSprite.height >> 1), 256);
          }
        } else {
          waitingIconSprite = ClientClockSupport.validationStateSprites[0];
          requiredScratchWidth = waitingIconSprite.fullWidth << 1;
          requiredScratchHeight = waitingIconSprite.fullHeight << 1;
          if (null != ClientOptionSupport.validationIconScratchSprite &&
              requiredScratchWidth <= ClientOptionSupport.validationIconScratchSprite.width &&
              requiredScratchHeight <= ClientOptionSupport.validationIconScratchSprite.height) {
            Geoblox.setRasterTarget(1, ClientOptionSupport.validationIconScratchSprite);
            SoftwareRasterizer.clearFramebuffer();
          } else {
            ClientOptionSupport.validationIconScratchSprite = new Sprite(requiredScratchWidth, requiredScratchHeight);
            Geoblox.setRasterTarget(1, ClientOptionSupport.validationIconScratchSprite);
          }
          waitingIconSprite.rotateSmooth(112, 144, waitingIconSprite.fullWidth << 4, waitingIconSprite.fullHeight << 4, -this.animationTicks << 10, 4096);
          RasterTargetRestoreSupport.restoreRasterTarget(true);
          ClientOptionSupport.validationIconScratchSprite.drawAdditive(-waitingIconSprite.fullWidth + iconCenterX, iconCenterY - waitingIconSprite.fullHeight, 256);
        }
    }

    final static void playPcmSample(int methodGuard, PcmSample sample) {
        try {
            if (methodGuard != -348) {
                PcmSample unusedNullSampleForInvalidGuard = (PcmSample) null;
                ValidationIconWidget.playPcmSample(-67, (PcmSample) null);
            }
            GameplayEntity.registerAudioStream(false, PcmSampleStream.createForPlaybackRate(sample, 100, 96));
        } catch (RuntimeException samplePlaybackFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) samplePlaybackFailure), "td.G(" + methodGuard + ',' + (sample != null ? "{...}" : "null") + ')');
        }
    }

    final static StringBuilder writeTextAtOffset(CharSequence sourceText, StringBuilder destination, int writeOffset, int methodGuard) {
        int sourceCharacterIndex = 0;
        int characterWriteOffset = 0;
        int originalLength = 0;
        RuntimeException textWriteFailureForContext = null;
        int sourceLength = 0;
        int writeEndOffset = 0;
        int controlFlowGuard = 0;
        PcmSample unusedNullSampleForInvalidGuard = null;
        StringBuilder emptyWriteDestinationBeforeReturn = null;
        StringBuilder writtenDestinationBeforeReturn = null;
        RuntimeException textWriteFailureBeforeDescriptions = null;
        StringBuilder textWriteMessagePrefix = null;
        String sourceTextDescription = null;
        StringBuilder textWriteMessageBeforeDestination = null;
        String destinationDescription = null;
        RuntimeException textWriteFailure = null;
        controlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard <= 23) {
            unusedNullSampleForInvalidGuard = (PcmSample) null;
            ValidationIconWidget.playPcmSample(-80, (PcmSample) null);
          }
          originalLength = destination.length();
          if (writeOffset >= 0 &&
              originalLength >= writeOffset) {
            sourceLength = sourceText.length();
            if (sourceLength == 0) {
              emptyWriteDestinationBeforeReturn = (StringBuilder) (destination);
              return emptyWriteDestinationBeforeReturn;
            }
            writeEndOffset = writeOffset + sourceLength;
            if (originalLength < writeEndOffset) {
              destination.setLength(writeEndOffset);
            }
            for (sourceCharacterIndex = 0; sourceCharacterIndex < sourceLength; sourceCharacterIndex++) {
              characterWriteOffset = writeOffset;
              writeOffset++;
              destination.setCharAt(characterWriteOffset, sourceText.charAt(sourceCharacterIndex));
            }
            writtenDestinationBeforeReturn = (StringBuilder) (destination);
            return writtenDestinationBeforeReturn;
          }
          throw new StringIndexOutOfBoundsException("length=" + originalLength + " startPos=" + writeOffset);
        } catch (java.lang.RuntimeException caughtTextWriteFailure) {
          textWriteFailure = caughtTextWriteFailure;
          textWriteFailureForContext = textWriteFailure;
          textWriteFailureBeforeDescriptions = textWriteFailureForContext;
          textWriteMessagePrefix = new StringBuilder().append("td.J(");
          if (sourceText == null) {
            sourceTextDescription = "null";
          } else {
            sourceTextDescription = "{...}";
          }
          textWriteMessageBeforeDestination = ((StringBuilder) (Object) textWriteMessagePrefix).append(sourceTextDescription).append(',');
          if (destination == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) textWriteFailureBeforeDescriptions), ((StringBuilder) (Object) textWriteMessageBeforeDestination).append(destinationDescription).append(',').append(writeOffset).append(',').append(methodGuard).append(')').toString());
        }
    }

    final void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        try {
            this.animationTicks = this.animationTicks + 1;
            super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
        } catch (RuntimeException pointerUpdateFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pointerUpdateFailure), "td.H(" + hoverGuard + ',' + parentY + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentX + ')');
        }
    }

    final static void advanceLogoAnimationTick(byte methodGuard) {
        int guardRemainder = -28 % ((methodGuard - 36) / 43);
        if (DequeCursor.logoAnimationTick != -DiskCacheWorker.logoStartDelayTicks + 0 && 250 - DiskCacheWorker.logoStartDelayTicks == DequeCursor.logoAnimationTick) {
        }
        DequeCursor.logoAnimationTick = DequeCursor.logoAnimationTick + 1;
    }

    final boolean requestKeyboardFocus(byte methodGuard, UiWidget focusContext) {
        RuntimeException focusFailureForContext = null;
        RuntimeException focusFailureBeforeDescription = null;
        StringBuilder focusMessagePrefix = null;
        String focusContextDescription = null;
        RuntimeException focusFailure = null;
        try {
          if (methodGuard > -30) {
            this.renderWidget(89, -88, (byte) -40, -90);
          }
          return false;
        } catch (java.lang.RuntimeException caughtFocusFailure) {
          focusFailure = caughtFocusFailure;
          focusFailureForContext = focusFailure;
          focusFailureBeforeDescription = focusFailureForContext;
          focusMessagePrefix = new StringBuilder().append("td.UA(").append(methodGuard).append(',');
          if (focusContext == null) {
            focusContextDescription = "null";
          } else {
            focusContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) focusFailureBeforeDescription), ((StringBuilder) (Object) focusMessagePrefix).append(focusContextDescription).append(')').toString());
        }
    }

    final static void recycleAllScorePopups(byte methodGuard) {
        if (methodGuard != -93) {
            return;
        }
        GmtTimestampSupport.activeScorePopups.moveAllTo(PcmResampler.availableScorePopups, (byte) -70);
    }

    ValidationIconWidget(ValidationProvider validationProvider) {
        try {
            this.validationProvider = validationProvider;
        } catch (RuntimeException validationProviderInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) validationProviderInitializationFailure), "td.<init>(" + (validationProvider != null ? "{...}" : "null") + ')');
        }
    }

    final String getHoverText(byte methodGuard) {
        if (methodGuard != 69) {
            return (String) null;
        }
        if (this.pointerInside) {
            return this.validationProvider.getDebouncedValidationMessage(-21666);
        }
        return null;
    }

    static {
        emptyNameLoginMethod = new LoginMethod("");
    }
}
