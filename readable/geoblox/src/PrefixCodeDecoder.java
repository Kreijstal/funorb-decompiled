/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PrefixCodeDecoder {
    static int field_b;
    private int[] decodeTree;
    static IntrusiveDeque pendingFifoAcknowledgements;
    static IntrusiveDeque trackedSoundEffectStreams;
    static int pointerXSnapshot;
    static GameApplet field_d;

    final static String readCompressedText(ByteArrayBuffer buffer, int guardAndDestinationOffset, int maximumDecodedLength) {
        int decodedLength = 0;
        Exception suppressedDecodeFailure = null;
        RuntimeException textFailureForContext = null;
        byte[] decodedBytes = null;
        String decodedText = null;
        String decodedTextBeforeReturn = null;
        String failureTextBeforeReturn = null;
        RuntimeException textFailureBeforeDescription = null;
        StringBuilder textMessagePrefix = null;
        String bufferDescription = null;
        Throwable caughtTextFailure = null;
        try {
          try {
            decodedLength = buffer.readUnsignedSmart(guardAndDestinationOffset + 1);
            if (decodedLength > maximumDecodedLength) {
              decodedLength = maximumDecodedLength;
            }
            decodedBytes = new byte[decodedLength];
            buffer.position = buffer.position + SessionTextState.compressedTextDecoder.decodePrefixBytes(decodedBytes, buffer.position, buffer.bytes, guardAndDestinationOffset, -127, decodedLength);
            decodedText = ByteTextDecodingSupport.decodeTextSlice(guardAndDestinationOffset ^ -103, decodedBytes, 0, decodedLength);
            decodedTextBeforeReturn = decodedText;
            return decodedTextBeforeReturn;
          } catch (java.lang.Exception decodeFailure) {
            caughtTextFailure = decodeFailure;
            suppressedDecodeFailure = (Exception) (Object) caughtTextFailure;
            failureTextBeforeReturn = "Cabbage";
            return failureTextBeforeReturn;
          }
        } catch (java.lang.RuntimeException textFailure) {
          caughtTextFailure = textFailure;
          textFailureForContext = (RuntimeException) (Object) caughtTextFailure;
          textFailureBeforeDescription = textFailureForContext;
          textMessagePrefix = new StringBuilder().append("qa.A(");
          if (buffer == null) {
            bufferDescription = "null";
          } else {
            bufferDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) textFailureBeforeDescription), ((StringBuilder) (Object) textMessagePrefix).append(bufferDescription).append(',').append(guardAndDestinationOffset).append(',').append(maximumDecodedLength).append(')').toString());
        }
    }

    final static CoverageBitmapFont buildCoverageFontFromDecodedSprites(byte[] metrics, boolean runNullMetricsGuardCall) {
        CoverageBitmapFont font = null;
        RuntimeException fontFailureForContext = null;
        byte[] unusedNullMetricsSnapshot = null;
        CoverageBitmapFont fontBeforeReturn = null;
        RuntimeException fontFailureBeforeMetricsDescription = null;
        StringBuilder fontMessagePrefix = null;
        String metricsDescription = null;
        RuntimeException caughtFontFailure = null;
        try {
          if (runNullMetricsGuardCall) {
            unusedNullMetricsSnapshot = (byte[]) null;
            PrefixCodeDecoder.buildCoverageFontFromDecodedSprites((byte[]) null, false);
          }
          if (metrics == null) {
            return null;
          }
          font = new CoverageBitmapFont(metrics, GameplaySession.decodedSpriteXOffsets, GmtTimestampSupport.decodedSpriteYOffsets, DualLinkNode.decodedSpriteWidths, ProgressBarWidget.decodedSpriteHeights, NanoFrameTimer.decodedSpritePalette, TextConcatenationSupport.decodedSpriteIndices);
          MidiPcmStream.clearDecodedSpriteWorkingArrays(true);
          fontBeforeReturn = font;
          return fontBeforeReturn;
        } catch (java.lang.RuntimeException fontFailure) {
          caughtFontFailure = fontFailure;
          fontFailureForContext = caughtFontFailure;
          fontFailureBeforeMetricsDescription = fontFailureForContext;
          fontMessagePrefix = new StringBuilder().append("qa.D(");
          if (metrics == null) {
            metricsDescription = "null";
          } else {
            metricsDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) fontFailureBeforeMetricsDescription), ((StringBuilder) (Object) fontMessagePrefix).append(metricsDescription).append(',').append(runNullMetricsGuardCall).append(')').toString());
        }
    }

    private final int decodePrefixBytes(byte[] destination, int sourceOffset, byte[] source, int destinationPosition, int methodGuard, int outputLengthThenEnd) {
        int nodeAfterBit7 = 0;
        int writeIndexAfterBit7 = 0;
        int nodeAfterBit6 = 0;
        int writeIndexAfterBit6 = 0;
        int nodeAfterBit5 = 0;
        int writeIndexAfterBit5 = 0;
        int nodeAfterBit4 = 0;
        int writeIndexAfterBit4 = 0;
        int nodeAfterBit3 = 0;
        int writeIndexAfterBit3 = 0;
        int nodeAfterBit2 = 0;
        int writeIndexAfterBit2 = 0;
        int nodeAfterBit1 = 0;
        int writeIndexAfterBit1 = 0;
        int nodeAfterBit0 = 0;
        int writeIndexAfterBit0 = 0;
        int zeroConsumedBytesBeforeReturn = 0;
        int consumedBytesBeforeReturn = 0;
        RuntimeException decodingFailureBeforeDestination = null;
        StringBuilder decodingMessagePrefix = null;
        String destinationDescription = null;
        StringBuilder decodingMessageBeforeSource = null;
        String sourceDescription = null;
        RuntimeException caughtDecodingFailure = null;
        int treeIndex = 0;
        RuntimeException decodingFailureForContext = null;
        int unusedArithmeticGuardResult = 0;
        int sourceIndex = 0;
        int signedSourceByte = 0;
        int nodeValue = 0;
        int unusedClientGuardSnapshot = 0;
        unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (0 == outputLengthThenEnd) {
            zeroConsumedBytesBeforeReturn = 0;
            return zeroConsumedBytesBeforeReturn;
          }
          unusedArithmeticGuardResult = 121 / ((-63 - methodGuard) / 59);
          treeIndex = 0;
          outputLengthThenEnd = outputLengthThenEnd + destinationPosition;
          sourceIndex = sourceOffset;
          while (true) {
            signedSourceByte = source[sourceIndex];
            if (signedSourceByte < 0) {
              treeIndex = this.decodeTree[treeIndex];
            } else {
              treeIndex++;
            }
            L2: {
              nodeAfterBit7 = this.decodeTree[treeIndex];
              nodeValue = nodeAfterBit7;
              if (nodeAfterBit7 < 0) {
                writeIndexAfterBit7 = destinationPosition;
                destinationPosition++;
                destination[writeIndexAfterBit7] = (byte)(~nodeValue);
                if (destinationPosition >= outputLengthThenEnd) {
                  break L2;
                }
                treeIndex = 0;
              }
              if (0 == (64 & signedSourceByte)) {
                treeIndex++;
              } else {
                treeIndex = this.decodeTree[treeIndex];
              }
              nodeAfterBit6 = this.decodeTree[treeIndex];
              nodeValue = nodeAfterBit6;
              if (nodeAfterBit6 < 0) {
                writeIndexAfterBit6 = destinationPosition;
                destinationPosition++;
                destination[writeIndexAfterBit6] = (byte)(~nodeValue);
                if (destinationPosition >= outputLengthThenEnd) {
                  break L2;
                }
                treeIndex = 0;
              }
              if ((signedSourceByte & 32) != 0) {
                treeIndex = this.decodeTree[treeIndex];
              } else {
                treeIndex++;
              }
              nodeAfterBit5 = this.decodeTree[treeIndex];
              nodeValue = nodeAfterBit5;
              if (nodeAfterBit5 < 0) {
                writeIndexAfterBit5 = destinationPosition;
                destinationPosition++;
                destination[writeIndexAfterBit5] = (byte)(~nodeValue);
                if (outputLengthThenEnd <= destinationPosition) {
                  break L2;
                }
                treeIndex = 0;
              }
              if ((signedSourceByte & 16) == 0) {
                treeIndex++;
              } else {
                treeIndex = this.decodeTree[treeIndex];
              }
              nodeAfterBit4 = this.decodeTree[treeIndex];
              nodeValue = nodeAfterBit4;
              if (nodeAfterBit4 < 0) {
                writeIndexAfterBit4 = destinationPosition;
                destinationPosition++;
                destination[writeIndexAfterBit4] = (byte)(~nodeValue);
                if (outputLengthThenEnd <= destinationPosition) {
                  break L2;
                }
                treeIndex = 0;
              }
              if ((8 & signedSourceByte) == 0) {
                treeIndex++;
              } else {
                treeIndex = this.decodeTree[treeIndex];
              }
              nodeAfterBit3 = this.decodeTree[treeIndex];
              nodeValue = nodeAfterBit3;
              if (nodeAfterBit3 < 0) {
                writeIndexAfterBit3 = destinationPosition;
                destinationPosition++;
                destination[writeIndexAfterBit3] = (byte)(~nodeValue);
                if (outputLengthThenEnd <= destinationPosition) {
                  break L2;
                }
                treeIndex = 0;
              }
              if ((signedSourceByte & 4) != 0) {
                treeIndex = this.decodeTree[treeIndex];
              } else {
                treeIndex++;
              }
              nodeAfterBit2 = this.decodeTree[treeIndex];
              nodeValue = nodeAfterBit2;
              if (nodeAfterBit2 < 0) {
                writeIndexAfterBit2 = destinationPosition;
                destinationPosition++;
                destination[writeIndexAfterBit2] = (byte)(~nodeValue);
                if (outputLengthThenEnd <= destinationPosition) {
                  return sourceIndex + 1 - sourceOffset;
                }
                treeIndex = 0;
              }
              if ((signedSourceByte & 2) != 0) {
                treeIndex = this.decodeTree[treeIndex];
              } else {
                treeIndex++;
              }
              nodeAfterBit1 = this.decodeTree[treeIndex];
              nodeValue = nodeAfterBit1;
              if (nodeAfterBit1 < 0) {
                writeIndexAfterBit1 = destinationPosition;
                destinationPosition++;
                destination[writeIndexAfterBit1] = (byte)(~nodeValue);
                if (destinationPosition >= outputLengthThenEnd) {
                  break L2;
                }
                treeIndex = 0;
              }
              if (0 == (1 & signedSourceByte)) {
                treeIndex++;
              } else {
                treeIndex = this.decodeTree[treeIndex];
              }
              nodeAfterBit0 = this.decodeTree[treeIndex];
              nodeValue = nodeAfterBit0;
              if (nodeAfterBit0 >= 0) {
                sourceIndex++;
                continue;
              }
              writeIndexAfterBit0 = destinationPosition;
              destinationPosition++;
              destination[writeIndexAfterBit0] = (byte)(~nodeValue);
              if (destinationPosition < outputLengthThenEnd) {
                treeIndex = 0;
                sourceIndex++;
                continue;
              }
            }
            consumedBytesBeforeReturn = sourceIndex + 1 - sourceOffset;
            return consumedBytesBeforeReturn;
          }
        } catch (java.lang.RuntimeException decodingFailure) {
          caughtDecodingFailure = decodingFailure;
          decodingFailureForContext = caughtDecodingFailure;
          decodingFailureBeforeDestination = decodingFailureForContext;
          decodingMessagePrefix = new StringBuilder().append("qa.E(");
          if (destination == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          decodingMessageBeforeSource = ((StringBuilder) (Object) decodingMessagePrefix).append(destinationDescription).append(',').append(sourceOffset).append(',');
          if (source == null) {
            sourceDescription = "null";
          } else {
            sourceDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) decodingFailureBeforeDestination), ((StringBuilder) (Object) decodingMessageBeforeSource).append(sourceDescription).append(',').append(destinationPosition).append(',').append(methodGuard).append(',').append(outputLengthThenEnd).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 > -1) {
            PrefixCodeDecoder.advanceMenuAvatarAnimation((byte) -72);
            pendingFifoAcknowledgements = null;
            trackedSoundEffectStreams = null;
            return;
        }
        pendingFifoAcknowledgements = null;
        trackedSoundEffectStreams = null;
    }

    final static void advanceMenuAvatarAnimation(byte methodGuard) {
        int frameStepTicksBeforeDecrement = 0;
        int heldFrameShockTicksSnapshot = 0;
        int heldFrameTintWithoutShockSnapshot = 0;
        int heldFrameTintAfterShockSnapshot = 0;
        int blinkFrameResetShockTicksSnapshot = 0;
        int blinkFrameResetTintWithoutShockSnapshot = 0;
        int blinkFrameResetTintAfterShockSnapshot = 0;
        int rightSteerShockTicksSnapshot = 0;
        int rightSteerTintTicksSnapshot = 0;
        int neutralStepUpShockTicksSnapshot = 0;
        int neutralStepUpTintTicksSnapshot = 0;
        int nonneutralHoldShockTicksSnapshot = 0;
        int nonneutralHoldTintTicksSnapshot = 0;
        int neutralHoldShockTicksSnapshot = 0;
        int neutralHoldTintTicksSnapshot = 0;
        int neutralStepDownShockTicksSnapshot = 0;
        int neutralStepDownTintTicksSnapshot = 0;
        int leftSteerShockTicksSnapshot = 0;
        int leftSteerTintWithoutShockSnapshot = 0;
        int leftSteerTintAfterShockSnapshot = 0;
        int leftFallbackRightSteerShockTicksSnapshot = 0;
        int leftFallbackRightSteerTintTicksSnapshot = 0;
        int leftFallbackNeutralStepUpShockTicksSnapshot = 0;
        int leftFallbackNeutralStepUpTintTicksSnapshot = 0;
        int leftFallbackNonneutralHoldShockTicksSnapshot = 0;
        int leftFallbackNonneutralHoldTintTicksSnapshot = 0;
        int leftFallbackNeutralHoldShockTicksSnapshot = 0;
        int leftFallbackNeutralHoldTintTicksSnapshot = 0;
        int leftFallbackNeutralStepDownShockTicksSnapshot = 0;
        int leftFallbackNeutralStepDownTintTicksSnapshot = 0;
        float avatarTintFadeFactor;
        int avatarFrameOffsetInSegment;
        int unusedClientControlSnapshot;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        if (methodGuard < 72) {
          return;
        }
        frameStepTicksBeforeDecrement = CacheFileState.avatarFrameStepTicks;
        CacheFileState.avatarFrameStepTicks = CacheFileState.avatarFrameStepTicks - 1;
        if (0 <= frameStepTicksBeforeDecrement) {
          LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
          IterableNodeHashTable.avatarBlinkClockTicks = IterableNodeHashTable.avatarBlinkClockTicks + 1;
          if (IterableNodeHashTable.avatarBlinkClockTicks % 600 < 30) {
            DiskCacheWorker.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
          }
          avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
          heldFrameShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
          WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
          if (heldFrameShockTicksSnapshot <= 0) {
            heldFrameTintWithoutShockSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
            MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
            if (heldFrameTintWithoutShockSnapshot <= 0) {
              return;
            }
            DisplayModeInfo.avatarTintColor = ((int)(GzipInflater.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GmtTimestampSupport.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * UsernameAvailabilityValidator.avatarTintBlueDelta));
            return;
          }
          IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
          heldFrameTintAfterShockSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
          MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
          if (heldFrameTintAfterShockSnapshot <= 0) {
            return;
          }
          DisplayModeInfo.avatarTintColor = ((int)(GzipInflater.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GmtTimestampSupport.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * UsernameAvailabilityValidator.avatarTintBlueDelta));
          return;
        }
        if (DiskCacheWorker.avatarFeedbackFrameIndex == 0 + MenuScreen.avatarFeedbackFrameBase) {
          DiskCacheWorker.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 3;
          CacheFileState.avatarFrameStepTicks = 20;
          LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
          IterableNodeHashTable.avatarBlinkClockTicks = IterableNodeHashTable.avatarBlinkClockTicks + 1;
          if (IterableNodeHashTable.avatarBlinkClockTicks % 600 < 30) {
            DiskCacheWorker.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
          }
          avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
          blinkFrameResetShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
          WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
          if (blinkFrameResetShockTicksSnapshot <= 0) {
            blinkFrameResetTintWithoutShockSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
            MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
            if (blinkFrameResetTintWithoutShockSnapshot <= 0) {
              return;
            }
            DisplayModeInfo.avatarTintColor = ((int)(GzipInflater.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GmtTimestampSupport.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * UsernameAvailabilityValidator.avatarTintBlueDelta));
            return;
          }
          IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
          blinkFrameResetTintAfterShockSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
          MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
          if (blinkFrameResetTintAfterShockSnapshot <= 0) {
            return;
          }
          DisplayModeInfo.avatarTintColor = ((int)(GzipInflater.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GmtTimestampSupport.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * UsernameAvailabilityValidator.avatarTintBlueDelta));
          return;
        }
        avatarFrameOffsetInSegment = DiskCacheWorker.avatarFeedbackFrameIndex - MenuScreen.avatarFeedbackFrameBase;
        if (FullscreenSupport.avatarSteeringDirectionId != 1) {
          if ((FullscreenSupport.avatarSteeringDirectionId == 2) &&
              (avatarFrameOffsetInSegment < 5)) {
            DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex + 1;
            CacheFileState.avatarFrameStepTicks = 20;
            LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
            IterableNodeHashTable.avatarBlinkClockTicks = IterableNodeHashTable.avatarBlinkClockTicks + 1;
            if (IterableNodeHashTable.avatarBlinkClockTicks % 600 < 30) {
              DiskCacheWorker.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
            }
            avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
            rightSteerShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
            WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
            if (rightSteerShockTicksSnapshot > 0) {
              IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
            }
            rightSteerTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
            MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
            if (rightSteerTintTicksSnapshot > 0) {
              DisplayModeInfo.avatarTintColor = ((int)(GzipInflater.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GmtTimestampSupport.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * UsernameAvailabilityValidator.avatarTintBlueDelta));
            }
            return;
          }
          if ((FullscreenSupport.avatarSteeringDirectionId == 0) &&
              (avatarFrameOffsetInSegment < 3)) {
            DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex + 1;
            CacheFileState.avatarFrameStepTicks = 20;
            LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
            IterableNodeHashTable.avatarBlinkClockTicks = IterableNodeHashTable.avatarBlinkClockTicks + 1;
            if (IterableNodeHashTable.avatarBlinkClockTicks % 600 < 30) {
              DiskCacheWorker.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
            }
            avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
            neutralStepUpShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
            WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
            if (neutralStepUpShockTicksSnapshot > 0) {
              IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
            }
            neutralStepUpTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
            MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
            if (neutralStepUpTintTicksSnapshot > 0) {
              DisplayModeInfo.avatarTintColor = ((int)(GzipInflater.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GmtTimestampSupport.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * UsernameAvailabilityValidator.avatarTintBlueDelta));
            }
            return;
          }
          if (FullscreenSupport.avatarSteeringDirectionId != 0) {
            CacheFileState.avatarFrameStepTicks = 20;
            LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
            IterableNodeHashTable.avatarBlinkClockTicks = IterableNodeHashTable.avatarBlinkClockTicks + 1;
            if (IterableNodeHashTable.avatarBlinkClockTicks % 600 < 30) {
              DiskCacheWorker.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
            }
            avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
            nonneutralHoldShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
            WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
            if (nonneutralHoldShockTicksSnapshot > 0) {
              IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
            }
            nonneutralHoldTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
            MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
            if (nonneutralHoldTintTicksSnapshot > 0) {
              DisplayModeInfo.avatarTintColor = ((int)(GzipInflater.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GmtTimestampSupport.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * UsernameAvailabilityValidator.avatarTintBlueDelta));
            }
            return;
          }
          if (avatarFrameOffsetInSegment <= 3) {
            CacheFileState.avatarFrameStepTicks = 20;
            LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
            IterableNodeHashTable.avatarBlinkClockTicks = IterableNodeHashTable.avatarBlinkClockTicks + 1;
            if (IterableNodeHashTable.avatarBlinkClockTicks % 600 < 30) {
              DiskCacheWorker.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
            }
            avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
            neutralHoldShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
            WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
            if (neutralHoldShockTicksSnapshot > 0) {
              IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
            }
            neutralHoldTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
            MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
            if (neutralHoldTintTicksSnapshot > 0) {
              DisplayModeInfo.avatarTintColor = ((int)(GzipInflater.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GmtTimestampSupport.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * UsernameAvailabilityValidator.avatarTintBlueDelta));
            }
            return;
          }
          DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex - 1;
          CacheFileState.avatarFrameStepTicks = 20;
          LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
          IterableNodeHashTable.avatarBlinkClockTicks = IterableNodeHashTable.avatarBlinkClockTicks + 1;
          if (IterableNodeHashTable.avatarBlinkClockTicks % 600 < 30) {
            DiskCacheWorker.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
          }
          avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
          neutralStepDownShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
          WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
          if (neutralStepDownShockTicksSnapshot > 0) {
            IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
          }
          neutralStepDownTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
          MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
          if (neutralStepDownTintTicksSnapshot > 0) {
            DisplayModeInfo.avatarTintColor = ((int)(GzipInflater.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GmtTimestampSupport.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * UsernameAvailabilityValidator.avatarTintBlueDelta));
          }
          return;
        }
        if (avatarFrameOffsetInSegment > 1) {
          DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex - 1;
          CacheFileState.avatarFrameStepTicks = 20;
          LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
          IterableNodeHashTable.avatarBlinkClockTicks = IterableNodeHashTable.avatarBlinkClockTicks + 1;
          if (IterableNodeHashTable.avatarBlinkClockTicks % 600 < 30) {
            DiskCacheWorker.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
          }
          avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
          leftSteerShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
          WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
          if (leftSteerShockTicksSnapshot <= 0) {
            leftSteerTintWithoutShockSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
            MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
            if (leftSteerTintWithoutShockSnapshot <= 0) {
              return;
            }
            DisplayModeInfo.avatarTintColor = ((int)(GzipInflater.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GmtTimestampSupport.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * UsernameAvailabilityValidator.avatarTintBlueDelta));
            return;
          }
          IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
          leftSteerTintAfterShockSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
          MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
          if (leftSteerTintAfterShockSnapshot > 0) {
            DisplayModeInfo.avatarTintColor = ((int)(GzipInflater.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GmtTimestampSupport.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * UsernameAvailabilityValidator.avatarTintBlueDelta));
          }
          return;
        }
        if ((FullscreenSupport.avatarSteeringDirectionId == 2) &&
            (avatarFrameOffsetInSegment < 5)) {
          DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex + 1;
          CacheFileState.avatarFrameStepTicks = 20;
          LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
          IterableNodeHashTable.avatarBlinkClockTicks = IterableNodeHashTable.avatarBlinkClockTicks + 1;
          if (IterableNodeHashTable.avatarBlinkClockTicks % 600 < 30) {
            DiskCacheWorker.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
          }
          avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
          leftFallbackRightSteerShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
          WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
          if (leftFallbackRightSteerShockTicksSnapshot > 0) {
            IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
          }
          leftFallbackRightSteerTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
          MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
          if (leftFallbackRightSteerTintTicksSnapshot > 0) {
            DisplayModeInfo.avatarTintColor = ((int)(GzipInflater.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GmtTimestampSupport.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * UsernameAvailabilityValidator.avatarTintBlueDelta));
          }
          return;
        }
        if ((FullscreenSupport.avatarSteeringDirectionId == 0) &&
            (avatarFrameOffsetInSegment < 3)) {
          DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex + 1;
          CacheFileState.avatarFrameStepTicks = 20;
          LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
          IterableNodeHashTable.avatarBlinkClockTicks = IterableNodeHashTable.avatarBlinkClockTicks + 1;
          if (IterableNodeHashTable.avatarBlinkClockTicks % 600 < 30) {
            DiskCacheWorker.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
          }
          avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
          leftFallbackNeutralStepUpShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
          WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
          if (leftFallbackNeutralStepUpShockTicksSnapshot > 0) {
            IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
          }
          leftFallbackNeutralStepUpTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
          MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
          if (leftFallbackNeutralStepUpTintTicksSnapshot > 0) {
            DisplayModeInfo.avatarTintColor = ((int)(GzipInflater.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GmtTimestampSupport.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * UsernameAvailabilityValidator.avatarTintBlueDelta));
          }
          return;
        }
        if (FullscreenSupport.avatarSteeringDirectionId != 0) {
          CacheFileState.avatarFrameStepTicks = 20;
          LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
          IterableNodeHashTable.avatarBlinkClockTicks = IterableNodeHashTable.avatarBlinkClockTicks + 1;
          if (IterableNodeHashTable.avatarBlinkClockTicks % 600 < 30) {
            DiskCacheWorker.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
          }
          avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
          leftFallbackNonneutralHoldShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
          WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
          if (leftFallbackNonneutralHoldShockTicksSnapshot > 0) {
            IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
          }
          leftFallbackNonneutralHoldTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
          MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
          if (leftFallbackNonneutralHoldTintTicksSnapshot > 0) {
            DisplayModeInfo.avatarTintColor = ((int)(GzipInflater.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GmtTimestampSupport.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * UsernameAvailabilityValidator.avatarTintBlueDelta));
          }
          return;
        }
        if (avatarFrameOffsetInSegment <= 3) {
          CacheFileState.avatarFrameStepTicks = 20;
          LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
          IterableNodeHashTable.avatarBlinkClockTicks = IterableNodeHashTable.avatarBlinkClockTicks + 1;
          if (IterableNodeHashTable.avatarBlinkClockTicks % 600 < 30) {
            DiskCacheWorker.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
          }
          avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
          leftFallbackNeutralHoldShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
          WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
          if (leftFallbackNeutralHoldShockTicksSnapshot > 0) {
            IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
          }
          leftFallbackNeutralHoldTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
          MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
          if (leftFallbackNeutralHoldTintTicksSnapshot > 0) {
            DisplayModeInfo.avatarTintColor = ((int)(GzipInflater.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GmtTimestampSupport.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * UsernameAvailabilityValidator.avatarTintBlueDelta));
          }
          return;
        }
        DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex - 1;
        CacheFileState.avatarFrameStepTicks = 20;
        LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
        IterableNodeHashTable.avatarBlinkClockTicks = IterableNodeHashTable.avatarBlinkClockTicks + 1;
        if (IterableNodeHashTable.avatarBlinkClockTicks % 600 < 30) {
          DiskCacheWorker.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 0;
        }
        avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
        leftFallbackNeutralStepDownShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
        WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
        if (leftFallbackNeutralStepDownShockTicksSnapshot > 0) {
          IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
        }
        leftFallbackNeutralStepDownTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
        MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
        if (leftFallbackNeutralStepDownTintTicksSnapshot > 0) {
          DisplayModeInfo.avatarTintColor = ((int)(GzipInflater.avatarTintGreenDelta * avatarTintFadeFactor) << 8) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GmtTimestampSupport.avatarTintRedDelta) << 16) + (int)(avatarTintFadeFactor * UsernameAvailabilityValidator.avatarTintBlueDelta));
        }
        return;
    }

    private PrefixCodeDecoder() throws Throwable {
        throw new Error();
    }

    static {
        field_b = 0;
        pendingFifoAcknowledgements = new IntrusiveDeque();
        pointerXSnapshot = 0;
        trackedSoundEffectStreams = new IntrusiveDeque();
        field_d = null;
    }
}
