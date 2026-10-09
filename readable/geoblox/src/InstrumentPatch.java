/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InstrumentPatch extends IntrusiveNode {
    byte[] keyPans;
    private int[] encodedSampleIds;
    byte[] keyVolumes;
    PcmSample[] keySamples;
    static boolean tooltipSuppressed;
    static java.math.BigInteger loginModPowModulus;
    short[] pitchOffsetsAndLoopFlag;
    InstrumentEnvelope[] keyEnvelopes;
    byte[] keyGroups;
    static int earnedAchievementMask;
    static FullscreenFocusCanvas activeFullscreenCanvas;
    int globalVolume;

    final boolean loadSelectedSamples(int[] sampleBudget, byte[] noteSelectionMask, int methodGuard, SoundSampleCache sampleCache) {
        int keyIndex = 0;
        int allLoadedResult = 0;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String budgetContextDescription = null;
        StringBuilder maskContextBuilder = null;
        String maskContextDescription = null;
        StringBuilder providerContextBuilder = null;
        String providerContextDescription = null;
        RuntimeException caughtFailure = null;
        int allLoaded = 0;
        RuntimeException failure = null;
        int previousEncodedSampleId = 0;
        Object resolvedSample = null;
        int encodedSampleId = 0;
        int controlFlagSnapshot = 0;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          allLoaded = 1;
          previousEncodedSampleId = 0;
          resolvedSample = null;
          for (keyIndex = 0; keyIndex < 128; keyIndex++) {
            if (noteSelectionMask == null ||
                  noteSelectionMask[keyIndex] != 0) {
              encodedSampleId = this.encodedSampleIds[keyIndex];
              if (encodedSampleId != 0) {
                if (encodedSampleId != previousEncodedSampleId) {
                  previousEncodedSampleId = encodedSampleId;
                  encodedSampleId--;
                  if ((encodedSampleId & 1) != 0) {
                    resolvedSample = sampleCache.getVorbisSampleById(encodedSampleId >> 2, 1, sampleBudget);
                  } else {
                    resolvedSample = sampleCache.getSynthesizedSampleById(encodedSampleId >> 2, sampleBudget, false);
                  }
                  if (resolvedSample == null) {
                    allLoaded = 0;
                  }
                }
                if (resolvedSample != null) {
                  this.keySamples[keyIndex] = (PcmSample) (resolvedSample);
                  this.encodedSampleIds[keyIndex] = 0;
                }
              }
            }
          }
          if (methodGuard <= 8) {
            tooltipSuppressed = true;
          }
          allLoadedResult = allLoaded;
          return allLoadedResult != 0;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContextCause = failure;
          failureContextBuilder = new StringBuilder().append("vl.C(");
          if (sampleBudget == null) {
            budgetContextDescription = "null";
          } else {
            budgetContextDescription = "{...}";
          }
          maskContextBuilder = ((StringBuilder) (Object) failureContextBuilder).append(budgetContextDescription).append(',');
          if (noteSelectionMask == null) {
            maskContextDescription = "null";
          } else {
            maskContextDescription = "{...}";
          }
          providerContextBuilder = ((StringBuilder) (Object) maskContextBuilder).append(maskContextDescription).append(',').append(methodGuard).append(',');
          if (sampleCache == null) {
            providerContextDescription = "null";
          } else {
            providerContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) providerContextBuilder).append(providerContextDescription).append(')').toString());
        }
    }

    public static void releaseStaticReferences(boolean methodGuard) {
        if (!methodGuard) {
            loginModPowModulus = (java.math.BigInteger) null;
        }
        activeFullscreenCanvas = null;
        loginModPowModulus = null;
    }

    final static InstrumentPatch loadInstrumentPatch(int patchId, byte methodGuard, ResourceArchive archive) {
        byte[] packedPatch = null;
        RuntimeException failure = null;
        byte[] packedPatchResult = null;
        Object missingPatchResult = null;
        InstrumentPatch decodedPatchResult = null;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String archiveContextDescription = null;
        RuntimeException caughtFailure = null;
        try {
          packedPatchResult = archive.getSingleFile(28319, patchId);
          packedPatch = packedPatchResult;
          if (methodGuard < 26) {
            earnedAchievementMask = 30;
          }
          if (packedPatchResult != null) {
            decodedPatchResult = new InstrumentPatch(packedPatchResult);
            return decodedPatchResult;
          }
          missingPatchResult = null;
          return (InstrumentPatch) (missingPatchResult);
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContextCause = failure;
          failureContextBuilder = new StringBuilder().append("vl.D(").append(patchId).append(',').append(methodGuard).append(',');
          if (archive == null) {
            archiveContextDescription = "null";
          } else {
            archiveContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(archiveContextDescription).append(')').toString());
        }
    }

    final void clearEncodedSampleIds(byte methodGuard) {
        if (methodGuard > -94) {
            this.pitchOffsetsAndLoopFlag = (short[]) null;
        }
        this.encodedSampleIds = null;
    }

    final static void drawHorizontalThreePartStrip(Sprite[] sprites, int stripWidth, int stripTop, int stripLeftThenTileX, byte methodGuard) {
        RuntimeException drawFailureBeforeDescription = null;
        StringBuilder drawMessagePrefix = null;
        String spritesDescription = null;
        RuntimeException caughtDrawFailure = null;
        int leftWidth = 0;
        RuntimeException drawFailureForContext = null;
        int rightWidth = 0;
        int tileWidth = 0;
        int tileStartX = 0;
        int tileEndX = 0;
        int unusedClientControlSnapshot = 0;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (sprites != null &&
              stripWidth > 0) {
            leftWidth = sprites[0].fullWidth;
            rightWidth = sprites[2].fullWidth;
            tileWidth = sprites[1].fullWidth;
            sprites[0].draw(stripLeftThenTileX, stripTop);
            sprites[2].draw(stripLeftThenTileX + stripWidth - rightWidth, stripTop);
            SoftwareRasterizer.saveClip(ClientOptionSupport.sharedSavedClip);
            SoftwareRasterizer.intersectClip(stripLeftThenTileX + leftWidth, stripTop, stripLeftThenTileX + stripWidth - rightWidth, stripTop + sprites[1].fullHeight);
            tileStartX = leftWidth + stripLeftThenTileX;
            tileEndX = stripWidth + (stripLeftThenTileX - rightWidth);
            for (stripLeftThenTileX = tileStartX; stripLeftThenTileX < tileEndX; stripLeftThenTileX = stripLeftThenTileX + tileWidth) {
              sprites[1].draw(stripLeftThenTileX, stripTop);
            }
            SoftwareRasterizer.restoreClip(ClientOptionSupport.sharedSavedClip);
            if (methodGuard != 107) {
              loginModPowModulus = (java.math.BigInteger) null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException drawFailure) {
          caughtDrawFailure = drawFailure;
          drawFailureForContext = caughtDrawFailure;
          drawFailureBeforeDescription = drawFailureForContext;
          drawMessagePrefix = new StringBuilder().append("vl.B(");
          if (sprites == null) {
            spritesDescription = "null";
          } else {
            spritesDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) drawFailureBeforeDescription), ((StringBuilder) (Object) drawMessagePrefix).append(spritesDescription).append(',').append(stripWidth).append(',').append(stripTop).append(',').append(stripLeftThenTileX).append(',').append(methodGuard).append(')').toString());
        }
    }

    private InstrumentPatch(byte[] packedPatch) {
        int envelopeRunReadIndex = 0;
        int newEnvelopeIndex = 0;
        InstrumentEnvelope newEnvelopeStorage = null;
        int keyGroupValueReadIndexSnapshot = 0;
        int panKeyIndex = 0;
        int panValueReadIndexSnapshot = 0;
        byte[] optionalVolumeCurve = null;
        byte[] optionalPanCurve = null;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String inputContextDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        int keyGroupRunByteCount = 0;
        byte[] keyGroupRuns = null;
        int keyGroupReadIndexOrCursor = 0;
        int panRunByteCount = 0;
        byte[] panRuns = null;
        int panReadIndexOrCursor = 0;
        int envelopeRunByteCountOrMapLength = 0;
        byte[] envelopeRuns = null;
        byte[] envelopeAssignments = null;
        int envelopeCount = 0;
        int currentEnvelopeIndex = 0;
        InstrumentEnvelope[] envelopes = null;
        int envelopeIndexOrCurvePointCount = 0;
        int encodedEnvelopeIndex = 0;
        byte[] volumeCurve = null;
        InstrumentEnvelope newEnvelope = null;
        byte[] panCurve = null;
        int envelopePointCount = 0;
        int sampleRunByteCount = 0;
        byte[] sampleRuns = null;
        int pitchOrCurveTimeAccumulator = 0;
        int remainingRunLength = 0;
        int runReadIndex = 0;
        int encodedSampleId = 0;
        int keyIndexOrKeyGroup = 0;
        int keyIndexOrPan = 0;
        Object currentEnvelope = null;
        int keyIndexOrVolume = 0;
        int envelopeIndexOrCurveKey = 0;
        int curveValue = 0;
        int curvePairOrKeyIndex = 0;
        int nextCurveKeyOrClampedPan = 0;
        int nextCurveValueOrClampedPan = 0;
        int interpolationNumerator = 0;
        int curveKeyIndexOrAlias = 0;
        int interpolatedCurveValue = 0;
        int clampedPan = 0;
        int panCurveKeyIndex = 0;
        ByteArrayBuffer patchInput = null;
        byte[] envelopeAssignmentsAlias = null;
        InstrumentEnvelope newEnvelopeAlias = null;
        byte[] sampleRunsAlias = null;
        byte[] keyGroupRunsAlias = null;
        byte[] panRunsAlias = null;
        byte[] envelopeRunsAlias = null;
        InstrumentEnvelope envelopeForValues = null;
        byte[] volumeCurveAlias = null;
        byte[] panCurveAlias = null;
        InstrumentEnvelope releaseEnvelopeForTimes = null;
        InstrumentEnvelope volumeEnvelopeForTimes = null;
        InstrumentEnvelope envelopeForKeyScaling = null;
        InstrumentEnvelope envelopeForVibratoDepth = null;
        InstrumentEnvelope envelopeForVibratoRamp = null;
        byte[] envelopeAssignmentsStorage = null;
        byte[] sampleRunsStorage = null;
        byte[] keyGroupRunsStorage = null;
        byte[] panRunsStorage = null;
        byte[] envelopeRunsStorage = null;
        int keyGroupReadIndexOrCursorLiteralPhase1;
        int panReadIndexOrCursorLiteralPhase1;
        int pitchOrCurveTimeAccumulatorLiteralPhase1;
        int pitchOrCurveTimeAccumulatorLiteralPhase2;
        int pitchOrCurveTimeAccumulatorLiteralPhase3;
        int pitchOrCurveTimeAccumulatorLiteralPhase4;
        int pitchOrCurveTimeAccumulatorLiteralPhase5;
        int pitchOrCurveTimeAccumulatorLiteralPhase6;
        int remainingRunLengthLiteralPhase1;
        int remainingRunLengthLiteralPhase2;
        int remainingRunLengthLiteralPhase3;
        int remainingRunLengthLiteralPhase4;
        int remainingRunLengthLiteralPhase5;
        int remainingRunLengthLiteralPhase6;
        int runReadIndexLiteralPhase1;
        int runReadIndexLiteralPhase2;
        int runReadIndexLiteralPhase3;
        int runReadIndexLiteralPhase4;
        int keyIndexOrKeyGroupLiteralPhase1;
        int keyIndexOrPanLiteralPhase1;
        int keyIndexOrVolumeLiteralPhase1;
        int envelopeIndexOrCurveKeyLiteralPhase1;
        int envelopeIndexOrCurveKeyLiteralPhase2;
        int envelopeIndexOrCurveKeyLiteralPhase3;
        int envelopeIndexOrCurveKeyLiteralPhase4;
        int envelopeIndexOrCurveKeyLiteralPhase5;
        int envelopeIndexOrCurveKeyLiteralPhase6;
        int envelopeIndexOrCurveKeyLiteralPhase7;
        int envelopeIndexOrCurveKeyLiteralPhase8;
        int envelopeIndexOrCurveKeyLiteralPhase9;
        int envelopeIndexOrCurveKeyLiteralPhase10;
        int envelopeIndexOrCurveKeyLiteralPhase11;
        int envelopeIndexOrCurveKeyLiteralPhase12;
        int curveValueLiteralPhase1;
        int curvePairOrKeyIndexLiteralPhase1;
        int curvePairOrKeyIndexLiteralPhase2;
        int curvePairOrKeyIndexLiteralPhase3;
        int curvePairOrKeyIndexLiteralPhase4;
        int nextCurveKeyOrClampedPanLiteralPhase1;
        int nextCurveValueOrClampedPanLiteralPhase1;
        int interpolationNumeratorLiteralPhase1;
        int curveKeyIndexOrAliasLiteralPhase1;
        int interpolatedCurveValueLiteralPhase1;
        try {
          this.keyPans = new byte[128];
          this.keyEnvelopes = new InstrumentEnvelope[128];
          this.keySamples = new PcmSample[128];
          this.encodedSampleIds = new int[128];
          this.pitchOffsetsAndLoopFlag = new short[128];
          this.keyGroups = new byte[128];
          this.keyVolumes = new byte[128];
          patchInput = new ByteArrayBuffer(packedPatch);
          for (keyGroupRunByteCount = 0; patchInput.bytes[keyGroupRunByteCount + patchInput.position] != 0; keyGroupRunByteCount++) {
          }
          keyGroupRunsStorage = new byte[keyGroupRunByteCount];
          keyGroupRunsAlias = keyGroupRunsStorage;
          keyGroupRuns = keyGroupRunsAlias;
          for (keyGroupReadIndexOrCursor = 0; keyGroupReadIndexOrCursor < keyGroupRunByteCount; keyGroupReadIndexOrCursor++) {
            keyGroupRuns[keyGroupReadIndexOrCursor] = patchInput.readSignedByte((byte) 81);
          }
          patchInput.position = patchInput.position + 1;
          keyGroupRunByteCount++;
          keyGroupReadIndexOrCursorLiteralPhase1 = patchInput.position;
          patchInput.position = patchInput.position + keyGroupRunByteCount;
          for (panRunByteCount = 0; 0 != patchInput.bytes[panRunByteCount + patchInput.position]; panRunByteCount++) {
          }
          panRunsStorage = new byte[panRunByteCount];
          panRunsAlias = panRunsStorage;
          panRuns = panRunsAlias;
          for (panReadIndexOrCursor = 0; panReadIndexOrCursor < panRunByteCount; panReadIndexOrCursor++) {
            panRuns[panReadIndexOrCursor] = patchInput.readSignedByte((byte) 91);
          }
          panRunByteCount++;
          patchInput.position = patchInput.position + 1;
          panReadIndexOrCursorLiteralPhase1 = patchInput.position;
          patchInput.position = patchInput.position + panRunByteCount;
          for (envelopeRunByteCountOrMapLength = 0; patchInput.bytes[envelopeRunByteCountOrMapLength + patchInput.position] != 0; envelopeRunByteCountOrMapLength++) {
          }
          envelopeRunsStorage = new byte[envelopeRunByteCountOrMapLength];
          envelopeRunsAlias = envelopeRunsStorage;
          envelopeRuns = envelopeRunsAlias;
          for (envelopeRunReadIndex = 0; envelopeRunReadIndex < envelopeRunByteCountOrMapLength; envelopeRunReadIndex++) {
            envelopeRuns[envelopeRunReadIndex] = patchInput.readSignedByte((byte) 125);
          }
          patchInput.position = patchInput.position + 1;
          envelopeRunByteCountOrMapLength++;
          envelopeAssignmentsStorage = new byte[envelopeRunByteCountOrMapLength];
          envelopeAssignmentsAlias = envelopeAssignmentsStorage;
          envelopeAssignments = envelopeAssignmentsAlias;
          if (envelopeRunByteCountOrMapLength > 1) {
            envelopeAssignmentsStorage[1] = (byte) 1;
            currentEnvelopeIndex = 1;
            envelopeCount = 2;
            for (envelopeIndexOrCurvePointCount = 2; envelopeRunByteCountOrMapLength > envelopeIndexOrCurvePointCount; envelopeIndexOrCurvePointCount++) {
              encodedEnvelopeIndex = patchInput.readUnsignedByte((byte) 34);
              if (0 == encodedEnvelopeIndex) {
                newEnvelopeIndex = envelopeCount;
                envelopeCount++;
                currentEnvelopeIndex = newEnvelopeIndex;
              } else {
                if (encodedEnvelopeIndex <= currentEnvelopeIndex) {
                  encodedEnvelopeIndex--;
                }
                currentEnvelopeIndex = encodedEnvelopeIndex;
              }
              envelopeAssignments[envelopeIndexOrCurvePointCount] = (byte)currentEnvelopeIndex;
            }
          } else {
            envelopeCount = envelopeRunByteCountOrMapLength;
          }
          envelopes = new InstrumentEnvelope[envelopeCount];
          for (envelopeIndexOrCurvePointCount = 0; envelopeIndexOrCurvePointCount < envelopes.length; envelopeIndexOrCurvePointCount++) {
            newEnvelopeStorage = new InstrumentEnvelope();
            envelopes[envelopeIndexOrCurvePointCount] = newEnvelopeStorage;
            newEnvelopeAlias = newEnvelopeStorage;
            newEnvelope = newEnvelopeAlias;
            envelopePointCount = patchInput.readUnsignedByte((byte) 34);
            if (0 < envelopePointCount) {
              newEnvelope.volumeEnvelope = new byte[2 * envelopePointCount];
            }
            envelopePointCount = patchInput.readUnsignedByte((byte) 34);
            if (0 < envelopePointCount) {
              newEnvelope.releaseEnvelope = new byte[2 * envelopePointCount + 2];
              newEnvelopeAlias.releaseEnvelope[1] = (byte)64;
            }
          }
          envelopeIndexOrCurvePointCount = patchInput.readUnsignedByte((byte) 34);
          if (envelopeIndexOrCurvePointCount <= 0) {
            optionalVolumeCurve = null;
          } else {
            optionalVolumeCurve = new byte[envelopeIndexOrCurvePointCount * 2];
          }
          volumeCurveAlias = optionalVolumeCurve;
          volumeCurve = volumeCurveAlias;
          envelopeIndexOrCurvePointCount = patchInput.readUnsignedByte((byte) 34);
          if (0 >= envelopeIndexOrCurvePointCount) {
            optionalPanCurve = null;
          } else {
            optionalPanCurve = new byte[envelopeIndexOrCurvePointCount * 2];
          }
          panCurveAlias = optionalPanCurve;
          panCurve = panCurveAlias;
          for (sampleRunByteCount = 0; patchInput.bytes[sampleRunByteCount + patchInput.position] != 0; sampleRunByteCount++) {
          }
          sampleRunsStorage = new byte[sampleRunByteCount];
          sampleRunsAlias = sampleRunsStorage;
          sampleRuns = sampleRunsAlias;
          for (pitchOrCurveTimeAccumulator = 0; sampleRunByteCount > pitchOrCurveTimeAccumulator; pitchOrCurveTimeAccumulator++) {
            sampleRuns[pitchOrCurveTimeAccumulator] = patchInput.readSignedByte((byte) 127);
          }
          patchInput.position = patchInput.position + 1;
          sampleRunByteCount++;
          pitchOrCurveTimeAccumulatorLiteralPhase1 = 0;
          for (remainingRunLength = 0; remainingRunLength < 128; remainingRunLength++) {
            pitchOrCurveTimeAccumulatorLiteralPhase1 = pitchOrCurveTimeAccumulatorLiteralPhase1 + patchInput.readUnsignedByte((byte) 34);
            this.pitchOffsetsAndLoopFlag[remainingRunLength] = (short)pitchOrCurveTimeAccumulatorLiteralPhase1;
          }
          pitchOrCurveTimeAccumulatorLiteralPhase2 = 0;
          for (remainingRunLengthLiteralPhase1 = 0; remainingRunLengthLiteralPhase1 < 128; remainingRunLengthLiteralPhase1++) {
            pitchOrCurveTimeAccumulatorLiteralPhase2 = pitchOrCurveTimeAccumulatorLiteralPhase2 + patchInput.readUnsignedByte((byte) 34);
            this.pitchOffsetsAndLoopFlag[remainingRunLengthLiteralPhase1] = (short)(this.pitchOffsetsAndLoopFlag[remainingRunLengthLiteralPhase1] + (pitchOrCurveTimeAccumulatorLiteralPhase2 << 8));
          }
          remainingRunLengthLiteralPhase2 = 0;
          runReadIndex = 0;
          encodedSampleId = 0;
          for (keyIndexOrKeyGroup = 0; keyIndexOrKeyGroup < 128; keyIndexOrKeyGroup++) {
            if (remainingRunLengthLiteralPhase2 == 0) {
              if (sampleRunsStorage.length > runReadIndex) {
                remainingRunLengthLiteralPhase2 = sampleRuns[runReadIndex++];
              } else {
                remainingRunLengthLiteralPhase2 = -1;
              }
              encodedSampleId = patchInput.readVariableIntBE((byte) -116);
            }
            this.pitchOffsetsAndLoopFlag[keyIndexOrKeyGroup] = (short)(this.pitchOffsetsAndLoopFlag[keyIndexOrKeyGroup] + ProxySocketConnector.andInt(-1 + encodedSampleId << 14, 32768));
            this.encodedSampleIds[keyIndexOrKeyGroup] = encodedSampleId;
            remainingRunLengthLiteralPhase2--;
          }
          runReadIndexLiteralPhase1 = 0;
          remainingRunLengthLiteralPhase3 = 0;
          keyIndexOrKeyGroupLiteralPhase1 = 0;
          for (keyIndexOrPan = 0; keyIndexOrPan < 128; keyIndexOrPan++) {
            if (this.encodedSampleIds[keyIndexOrPan] != 0) {
              if (remainingRunLengthLiteralPhase3 == 0) {
                keyGroupValueReadIndexSnapshot = keyGroupReadIndexOrCursorLiteralPhase1;
                keyGroupReadIndexOrCursorLiteralPhase1++;
                keyIndexOrKeyGroupLiteralPhase1 = -1 + patchInput.bytes[keyGroupValueReadIndexSnapshot];
                if (runReadIndexLiteralPhase1 >= keyGroupRunsStorage.length) {
                  remainingRunLengthLiteralPhase3 = -1;
                } else {
                  remainingRunLengthLiteralPhase3 = keyGroupRuns[runReadIndexLiteralPhase1++];
                }
              }
              remainingRunLengthLiteralPhase3--;
              this.keyGroups[keyIndexOrPan] = (byte)keyIndexOrKeyGroupLiteralPhase1;
            }
          }
          runReadIndexLiteralPhase2 = 0;
          remainingRunLengthLiteralPhase4 = 0;
          keyIndexOrPanLiteralPhase1 = 0;
          for (panKeyIndex = 0; panKeyIndex < 128; panKeyIndex++) {
            if (0 != this.encodedSampleIds[panKeyIndex]) {
              if (remainingRunLengthLiteralPhase4 == 0) {
                panValueReadIndexSnapshot = panReadIndexOrCursorLiteralPhase1;
                panReadIndexOrCursorLiteralPhase1++;
                keyIndexOrPanLiteralPhase1 = 16 + patchInput.bytes[panValueReadIndexSnapshot] << 2;
                if (panRunsStorage.length > runReadIndexLiteralPhase2) {
                  remainingRunLengthLiteralPhase4 = panRuns[runReadIndexLiteralPhase2++];
                } else {
                  remainingRunLengthLiteralPhase4 = -1;
                }
              }
              this.keyPans[panKeyIndex] = (byte)keyIndexOrPanLiteralPhase1;
              remainingRunLengthLiteralPhase4--;
            }
          }
          remainingRunLengthLiteralPhase5 = 0;
          runReadIndexLiteralPhase3 = 0;
          currentEnvelope = null;
          for (keyIndexOrVolume = 0; keyIndexOrVolume < 128; keyIndexOrVolume++) {
            if (0 != this.encodedSampleIds[keyIndexOrVolume]) {
              if (remainingRunLengthLiteralPhase5 == 0) {
                currentEnvelope = envelopes[envelopeAssignmentsStorage[runReadIndexLiteralPhase3]];
                if (runReadIndexLiteralPhase3 < envelopeRunsStorage.length) {
                  remainingRunLengthLiteralPhase5 = envelopeRuns[runReadIndexLiteralPhase3++];
                } else {
                  remainingRunLengthLiteralPhase5 = -1;
                }
              }
              remainingRunLengthLiteralPhase5--;
              this.keyEnvelopes[keyIndexOrVolume] = (InstrumentEnvelope) (currentEnvelope);
            }
          }
          runReadIndexLiteralPhase4 = 0;
          remainingRunLengthLiteralPhase6 = 0;
          keyIndexOrVolumeLiteralPhase1 = 0;
          for (envelopeIndexOrCurveKey = 0; envelopeIndexOrCurveKey < 128; envelopeIndexOrCurveKey++) {
            if (0 == remainingRunLengthLiteralPhase6) {
              if (sampleRunsStorage.length > runReadIndexLiteralPhase4) {
                remainingRunLengthLiteralPhase6 = sampleRuns[runReadIndexLiteralPhase4++];
              } else {
                remainingRunLengthLiteralPhase6 = -1;
              }
              if (0 < this.encodedSampleIds[envelopeIndexOrCurveKey]) {
                keyIndexOrVolumeLiteralPhase1 = patchInput.readUnsignedByte((byte) 34) + 1;
              }
            }
            remainingRunLengthLiteralPhase6--;
            this.keyVolumes[envelopeIndexOrCurveKey] = (byte)keyIndexOrVolumeLiteralPhase1;
          }
          this.globalVolume = 1 + patchInput.readUnsignedByte((byte) 34);
          for (envelopeIndexOrCurveKeyLiteralPhase1 = 0; envelopeCount > envelopeIndexOrCurveKeyLiteralPhase1; envelopeIndexOrCurveKeyLiteralPhase1++) {
            envelopeForValues = envelopes[envelopeIndexOrCurveKeyLiteralPhase1];
            if (null != envelopeForValues.volumeEnvelope) {
              for (curvePairOrKeyIndex = 1; envelopeForValues.volumeEnvelope.length > curvePairOrKeyIndex; curvePairOrKeyIndex += 2) {
                envelopeForValues.volumeEnvelope[curvePairOrKeyIndex] = patchInput.readSignedByte((byte) 76);
              }
            }
            if (envelopeForValues.releaseEnvelope != null) {
              for (curvePairOrKeyIndex = 3; -2 + envelopeForValues.releaseEnvelope.length > curvePairOrKeyIndex; curvePairOrKeyIndex += 2) {
                envelopeForValues.releaseEnvelope[curvePairOrKeyIndex] = patchInput.readSignedByte((byte) 102);
              }
            }
          }
          if (null != volumeCurve) {
            for (envelopeIndexOrCurveKeyLiteralPhase2 = 1; envelopeIndexOrCurveKeyLiteralPhase2 < volumeCurveAlias.length; envelopeIndexOrCurveKeyLiteralPhase2 += 2) {
              volumeCurve[envelopeIndexOrCurveKeyLiteralPhase2] = patchInput.readSignedByte((byte) 96);
            }
          }
          if (panCurve != null) {
            for (envelopeIndexOrCurveKeyLiteralPhase3 = 1; panCurveAlias.length > envelopeIndexOrCurveKeyLiteralPhase3; envelopeIndexOrCurveKeyLiteralPhase3 += 2) {
              panCurve[envelopeIndexOrCurveKeyLiteralPhase3] = patchInput.readSignedByte((byte) 75);
            }
          }
          for (envelopeIndexOrCurveKeyLiteralPhase4 = 0; envelopeIndexOrCurveKeyLiteralPhase4 < envelopeCount; envelopeIndexOrCurveKeyLiteralPhase4++) {
            releaseEnvelopeForTimes = envelopes[envelopeIndexOrCurveKeyLiteralPhase4];
            if (null != releaseEnvelopeForTimes.releaseEnvelope) {
              pitchOrCurveTimeAccumulatorLiteralPhase3 = 0;
              for (curvePairOrKeyIndexLiteralPhase1 = 2; curvePairOrKeyIndexLiteralPhase1 < releaseEnvelopeForTimes.releaseEnvelope.length; curvePairOrKeyIndexLiteralPhase1 += 2) {
                pitchOrCurveTimeAccumulatorLiteralPhase3 = patchInput.readUnsignedByte((byte) 34) + (1 + pitchOrCurveTimeAccumulatorLiteralPhase3);
                releaseEnvelopeForTimes.releaseEnvelope[curvePairOrKeyIndexLiteralPhase1] = (byte)pitchOrCurveTimeAccumulatorLiteralPhase3;
              }
            }
          }
          for (envelopeIndexOrCurveKeyLiteralPhase5 = 0; envelopeCount > envelopeIndexOrCurveKeyLiteralPhase5; envelopeIndexOrCurveKeyLiteralPhase5++) {
            volumeEnvelopeForTimes = envelopes[envelopeIndexOrCurveKeyLiteralPhase5];
            if (null != volumeEnvelopeForTimes.volumeEnvelope) {
              pitchOrCurveTimeAccumulatorLiteralPhase4 = 0;
              for (curvePairOrKeyIndexLiteralPhase2 = 2; curvePairOrKeyIndexLiteralPhase2 < volumeEnvelopeForTimes.volumeEnvelope.length; curvePairOrKeyIndexLiteralPhase2 += 2) {
                pitchOrCurveTimeAccumulatorLiteralPhase4 = patchInput.readUnsignedByte((byte) 34) + (1 + pitchOrCurveTimeAccumulatorLiteralPhase4);
                volumeEnvelopeForTimes.volumeEnvelope[curvePairOrKeyIndexLiteralPhase2] = (byte)pitchOrCurveTimeAccumulatorLiteralPhase4;
              }
            }
          }
          if (null != volumeCurve) {
            pitchOrCurveTimeAccumulatorLiteralPhase5 = patchInput.readUnsignedByte((byte) 34);
            volumeCurve[0] = (byte)pitchOrCurveTimeAccumulatorLiteralPhase5;
            for (envelopeIndexOrCurveKeyLiteralPhase6 = 2; envelopeIndexOrCurveKeyLiteralPhase6 < volumeCurveAlias.length; envelopeIndexOrCurveKeyLiteralPhase6 += 2) {
              pitchOrCurveTimeAccumulatorLiteralPhase5 = patchInput.readUnsignedByte((byte) 34) + 1 + pitchOrCurveTimeAccumulatorLiteralPhase5;
              volumeCurve[envelopeIndexOrCurveKeyLiteralPhase6] = (byte)pitchOrCurveTimeAccumulatorLiteralPhase5;
            }
            envelopeIndexOrCurveKeyLiteralPhase6 = volumeCurveAlias[0];
            curveValue = volumeCurveAlias[1];
            for (curvePairOrKeyIndexLiteralPhase3 = 0; envelopeIndexOrCurveKeyLiteralPhase6 > curvePairOrKeyIndexLiteralPhase3; curvePairOrKeyIndexLiteralPhase3++) {
              this.keyVolumes[curvePairOrKeyIndexLiteralPhase3] = (byte)(this.keyVolumes[curvePairOrKeyIndexLiteralPhase3] * curveValue + 32 >> 6);
            }
            for (curvePairOrKeyIndexLiteralPhase3 = 2; volumeCurveAlias.length > curvePairOrKeyIndexLiteralPhase3; curvePairOrKeyIndexLiteralPhase3 += 2) {
              nextCurveKeyOrClampedPan = volumeCurveAlias[curvePairOrKeyIndexLiteralPhase3];
              nextCurveValueOrClampedPan = volumeCurve[1 + curvePairOrKeyIndexLiteralPhase3];
              interpolationNumerator = curveValue * (nextCurveKeyOrClampedPan - envelopeIndexOrCurveKeyLiteralPhase6) + (-envelopeIndexOrCurveKeyLiteralPhase6 + nextCurveKeyOrClampedPan) / 2;
              for (curveKeyIndexOrAlias = envelopeIndexOrCurveKeyLiteralPhase6; nextCurveKeyOrClampedPan > curveKeyIndexOrAlias; curveKeyIndexOrAlias++) {
                interpolatedCurveValue = PacketBuffer.divideFloorWithPositiveDivisor(nextCurveKeyOrClampedPan - envelopeIndexOrCurveKeyLiteralPhase6, (byte) -6, interpolationNumerator);
                this.keyVolumes[curveKeyIndexOrAlias] = (byte)(32 + this.keyVolumes[curveKeyIndexOrAlias] * interpolatedCurveValue >> 6);
                interpolationNumerator = interpolationNumerator + (nextCurveValueOrClampedPan - curveValue);
              }
              envelopeIndexOrCurveKeyLiteralPhase6 = nextCurveKeyOrClampedPan;
              curveValue = nextCurveValueOrClampedPan;
            }
            for (nextCurveKeyOrClampedPan = envelopeIndexOrCurveKeyLiteralPhase6; nextCurveKeyOrClampedPan < 128; nextCurveKeyOrClampedPan++) {
              this.keyVolumes[nextCurveKeyOrClampedPan] = (byte)(32 + this.keyVolumes[nextCurveKeyOrClampedPan] * curveValue >> 6);
            }
            volumeCurve = null;
          }
          if (panCurve != null) {
            pitchOrCurveTimeAccumulatorLiteralPhase6 = patchInput.readUnsignedByte((byte) 34);
            panCurve[0] = (byte)pitchOrCurveTimeAccumulatorLiteralPhase6;
            for (envelopeIndexOrCurveKeyLiteralPhase7 = 2; envelopeIndexOrCurveKeyLiteralPhase7 < panCurveAlias.length; envelopeIndexOrCurveKeyLiteralPhase7 += 2) {
              pitchOrCurveTimeAccumulatorLiteralPhase6 = patchInput.readUnsignedByte((byte) 34) + 1 + pitchOrCurveTimeAccumulatorLiteralPhase6;
              panCurve[envelopeIndexOrCurveKeyLiteralPhase7] = (byte)pitchOrCurveTimeAccumulatorLiteralPhase6;
            }
            envelopeIndexOrCurveKeyLiteralPhase7 = panCurveAlias[0];
            curveValueLiteralPhase1 = panCurveAlias[1] << 1;
            for (curvePairOrKeyIndexLiteralPhase4 = 0; envelopeIndexOrCurveKeyLiteralPhase7 > curvePairOrKeyIndexLiteralPhase4; curvePairOrKeyIndexLiteralPhase4++) {
              nextCurveKeyOrClampedPanLiteralPhase1 = (255 & this.keyPans[curvePairOrKeyIndexLiteralPhase4]) + curveValueLiteralPhase1;
              if (nextCurveKeyOrClampedPanLiteralPhase1 < 0) {
                nextCurveKeyOrClampedPanLiteralPhase1 = 0;
              }
              if (nextCurveKeyOrClampedPanLiteralPhase1 > 128) {
                nextCurveKeyOrClampedPanLiteralPhase1 = 128;
              }
              this.keyPans[curvePairOrKeyIndexLiteralPhase4] = (byte)nextCurveKeyOrClampedPanLiteralPhase1;
            }
            curvePairOrKeyIndexLiteralPhase4 = 2;
            while (curvePairOrKeyIndexLiteralPhase4 < panCurveAlias.length) {
              nextCurveKeyOrClampedPanLiteralPhase1 = panCurveAlias[curvePairOrKeyIndexLiteralPhase4];
              nextCurveValueOrClampedPanLiteralPhase1 = panCurve[curvePairOrKeyIndexLiteralPhase4 + 1] << 1;
              interpolationNumeratorLiteralPhase1 = (nextCurveKeyOrClampedPanLiteralPhase1 - envelopeIndexOrCurveKeyLiteralPhase7) * curveValueLiteralPhase1 + (-envelopeIndexOrCurveKeyLiteralPhase7 + nextCurveKeyOrClampedPanLiteralPhase1) / 2;
              panCurveKeyIndex = envelopeIndexOrCurveKeyLiteralPhase7;
              curveKeyIndexOrAliasLiteralPhase1 = panCurveKeyIndex;
              while (nextCurveKeyOrClampedPanLiteralPhase1 > panCurveKeyIndex) {
                interpolatedCurveValueLiteralPhase1 = PacketBuffer.divideFloorWithPositiveDivisor(nextCurveKeyOrClampedPanLiteralPhase1 - envelopeIndexOrCurveKeyLiteralPhase7, (byte) -6, interpolationNumeratorLiteralPhase1);
                clampedPan = (this.keyPans[panCurveKeyIndex] & 255) + interpolatedCurveValueLiteralPhase1;
                if (clampedPan < 0) {
                  clampedPan = 0;
                }
                if (clampedPan > 128) {
                  clampedPan = 128;
                }
                this.keyPans[panCurveKeyIndex] = (byte)clampedPan;
                interpolationNumeratorLiteralPhase1 = interpolationNumeratorLiteralPhase1 + (nextCurveValueOrClampedPanLiteralPhase1 - curveValueLiteralPhase1);
                panCurveKeyIndex++;
              }
              curvePairOrKeyIndexLiteralPhase4 += 2;
              curveValueLiteralPhase1 = nextCurveValueOrClampedPanLiteralPhase1;
              envelopeIndexOrCurveKeyLiteralPhase7 = nextCurveKeyOrClampedPanLiteralPhase1;
            }
            for (nextCurveKeyOrClampedPanLiteralPhase1 = envelopeIndexOrCurveKeyLiteralPhase7; nextCurveKeyOrClampedPanLiteralPhase1 < 128; nextCurveKeyOrClampedPanLiteralPhase1++) {
              nextCurveValueOrClampedPanLiteralPhase1 = (this.keyPans[nextCurveKeyOrClampedPanLiteralPhase1] & 255) + curveValueLiteralPhase1;
              if (nextCurveValueOrClampedPanLiteralPhase1 < 0) {
                nextCurveValueOrClampedPanLiteralPhase1 = 0;
              }
              if (nextCurveValueOrClampedPanLiteralPhase1 > 128) {
                nextCurveValueOrClampedPanLiteralPhase1 = 128;
              }
              this.keyPans[nextCurveKeyOrClampedPanLiteralPhase1] = (byte)nextCurveValueOrClampedPanLiteralPhase1;
            }
            panCurve = null;
          }
          for (envelopeIndexOrCurveKeyLiteralPhase8 = 0; envelopeCount > envelopeIndexOrCurveKeyLiteralPhase8; envelopeIndexOrCurveKeyLiteralPhase8++) {
            envelopes[envelopeIndexOrCurveKeyLiteralPhase8].decayRate = patchInput.readUnsignedByte((byte) 34);
          }
          for (envelopeIndexOrCurveKeyLiteralPhase9 = 0; envelopeIndexOrCurveKeyLiteralPhase9 < envelopeCount; envelopeIndexOrCurveKeyLiteralPhase9++) {
            envelopeForKeyScaling = envelopes[envelopeIndexOrCurveKeyLiteralPhase9];
            if (null != envelopeForKeyScaling.volumeEnvelope) {
              envelopeForKeyScaling.volumeEnvelopeKeyScaling = patchInput.readUnsignedByte((byte) 34);
            }
            if (envelopeForKeyScaling.releaseEnvelope != null) {
              envelopeForKeyScaling.releaseEnvelopeKeyScaling = patchInput.readUnsignedByte((byte) 34);
            }
            if (envelopeForKeyScaling.decayRate > 0) {
              envelopeForKeyScaling.decayKeyScaling = patchInput.readUnsignedByte((byte) 34);
            }
          }
          for (envelopeIndexOrCurveKeyLiteralPhase10 = 0; envelopeCount > envelopeIndexOrCurveKeyLiteralPhase10; envelopeIndexOrCurveKeyLiteralPhase10++) {
            envelopes[envelopeIndexOrCurveKeyLiteralPhase10].vibratoPhaseStep = patchInput.readUnsignedByte((byte) 34);
          }
          for (envelopeIndexOrCurveKeyLiteralPhase11 = 0; envelopeIndexOrCurveKeyLiteralPhase11 < envelopeCount; envelopeIndexOrCurveKeyLiteralPhase11++) {
            envelopeForVibratoDepth = envelopes[envelopeIndexOrCurveKeyLiteralPhase11];
            if (envelopeForVibratoDepth.vibratoPhaseStep > 0) {
              envelopeForVibratoDepth.vibratoDepth = patchInput.readUnsignedByte((byte) 34);
            }
          }
          for (envelopeIndexOrCurveKeyLiteralPhase12 = 0; envelopeIndexOrCurveKeyLiteralPhase12 < envelopeCount; envelopeIndexOrCurveKeyLiteralPhase12++) {
            envelopeForVibratoRamp = envelopes[envelopeIndexOrCurveKeyLiteralPhase12];
            if (0 < envelopeForVibratoRamp.vibratoDepth) {
              envelopeForVibratoRamp.vibratoRampTicks = patchInput.readUnsignedByte((byte) 34);
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContextCause = failure;
          failureContextBuilder = new StringBuilder().append("vl.<init>(");
          if (packedPatch == null) {
            inputContextDescription = "null";
          } else {
            inputContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(inputContextDescription).append(')').toString());
        }
    }

    static {
        tooltipSuppressed = false;
        loginModPowModulus = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
