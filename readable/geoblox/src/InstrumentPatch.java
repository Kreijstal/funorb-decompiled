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
        int keyGroupRunDecodeIndex = 0;
        int panRunByteCount = 0;
        byte[] panRuns = null;
        int panRunDecodeIndex = 0;
        int envelopeRunByteCountOrMapLength = 0;
        byte[] envelopeRuns = null;
        byte[] envelopeAssignments = null;
        int envelopeCount = 0;
        int currentEnvelopeIndex = 0;
        InstrumentEnvelope[] envelopes = null;
        int envelopeAssignmentIndex = 0;
        int encodedEnvelopeIndex = 0;
        byte[] volumeCurve = null;
        InstrumentEnvelope newEnvelope = null;
        byte[] panCurve = null;
        int volumeEnvelopePointCount = 0;
        int sampleRunByteCount = 0;
        byte[] sampleRuns = null;
        int sampleRunDecodeIndex = 0;
        int pitchLowKeyIndex = 0;
        int sampleIdRunCursor = 0;
        int encodedSampleId = 0;
        int sampleIdKeyIndex = 0;
        int keyGroupKeyIndex = 0;
        Object currentEnvelope = null;
        int envelopeKeyIndex = 0;
        int volumeKeyIndex = 0;
        int volumeScaleQ6 = 0;
        int volumeEnvelopeValueByteIndex = 0;
        int nextVolumeCurveKey = 0;
        int nextVolumeScaleQ6 = 0;
        int volumeInterpolationNumerator = 0;
        int volumeInterpolationKeyIndex = 0;
        int interpolatedVolumeScaleQ6 = 0;
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
        int keyGroupValueCursor;
        int panValueCursor;
        int pitchLowAccumulator;
        int pitchHighAccumulator;
        int releaseEnvelopeTimeAccumulator;
        int volumeEnvelopeTimeAccumulator;
        int volumeCurveKeyAccumulator;
        int panCurveKeyAccumulator;
        int pitchHighKeyIndex;
        int sampleIdRunRemaining;
        int keyGroupRunRemaining;
        int panRunRemaining;
        int envelopeRunRemaining;
        int volumeRunRemaining;
        int keyGroupRunCursor;
        int panRunCursor;
        int envelopeRunCursor;
        int volumeRunCursor;
        int currentKeyGroup;
        int currentPanValue;
        int currentVolume;
        int envelopeValueDecodeIndex;
        int volumeCurveValueByteIndex;
        int panCurveValueByteIndex;
        int releaseEnvelopeTimeDecodeIndex;
        int volumeEnvelopeTimeDecodeIndex;
        int volumeCurveKeyByteIndex;
        int panCurveKeyByteIndex;
        int decayEnvelopeDecodeIndex;
        int keyScalingEnvelopeDecodeIndex;
        int vibratoPhaseEnvelopeDecodeIndex;
        int vibratoDepthEnvelopeDecodeIndex;
        int vibratoRampEnvelopeDecodeIndex;
        int panCurveOffset;
        int releaseEnvelopeTimeByteIndex;
        int volumeEnvelopeTimeByteIndex;
        int volumePrefixKeyIndex;
        int panPrefixKeyIndex;
        int prefixClampedPan;
        int nextPanCurveOffset;
        int panInterpolationNumerator;
        int unusedPanInterpolationStartKeySnapshot;
        int interpolatedPanCurveOffset;
        int envelopeConstructionIndex;
        int volumeCurvePointCount;
        int panCurvePointCount;
        int releaseEnvelopePointCount;
        int releaseEnvelopeValueByteIndex;
        int volumeTailKeyIndex;
        int previousVolumeCurveKey;
        int previousPanCurveKey;
        int volumeCurvePairIndex;
        int panCurvePairIndex;
        int nextPanCurveKey;
        int panTailKeyIndex;
        int tailClampedPan;
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
          for (keyGroupRunDecodeIndex = 0; keyGroupRunDecodeIndex < keyGroupRunByteCount; keyGroupRunDecodeIndex++) {
            keyGroupRuns[keyGroupRunDecodeIndex] = patchInput.readSignedByte((byte) 81);
          }
          patchInput.position = patchInput.position + 1;
          keyGroupRunByteCount++;
          keyGroupValueCursor = patchInput.position;
          patchInput.position = patchInput.position + keyGroupRunByteCount;
          for (panRunByteCount = 0; 0 != patchInput.bytes[panRunByteCount + patchInput.position]; panRunByteCount++) {
          }
          panRunsStorage = new byte[panRunByteCount];
          panRunsAlias = panRunsStorage;
          panRuns = panRunsAlias;
          for (panRunDecodeIndex = 0; panRunDecodeIndex < panRunByteCount; panRunDecodeIndex++) {
            panRuns[panRunDecodeIndex] = patchInput.readSignedByte((byte) 91);
          }
          panRunByteCount++;
          patchInput.position = patchInput.position + 1;
          panValueCursor = patchInput.position;
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
            for (envelopeAssignmentIndex = 2; envelopeRunByteCountOrMapLength > envelopeAssignmentIndex; envelopeAssignmentIndex++) {
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
              envelopeAssignments[envelopeAssignmentIndex] = (byte)currentEnvelopeIndex;
            }
          } else {
            envelopeCount = envelopeRunByteCountOrMapLength;
          }
          envelopes = new InstrumentEnvelope[envelopeCount];
          for (envelopeConstructionIndex = 0; envelopeConstructionIndex < envelopes.length; envelopeConstructionIndex++) {
            newEnvelopeStorage = new InstrumentEnvelope();
            envelopes[envelopeConstructionIndex] = newEnvelopeStorage;
            newEnvelopeAlias = newEnvelopeStorage;
            newEnvelope = newEnvelopeAlias;
            volumeEnvelopePointCount = patchInput.readUnsignedByte((byte) 34);
            if (0 < volumeEnvelopePointCount) {
              newEnvelope.volumeEnvelope = new byte[2 * volumeEnvelopePointCount];
            }
            releaseEnvelopePointCount = patchInput.readUnsignedByte((byte) 34);
            if (0 < releaseEnvelopePointCount) {
              newEnvelope.releaseEnvelope = new byte[2 * releaseEnvelopePointCount + 2];
              newEnvelopeAlias.releaseEnvelope[1] = (byte)64;
            }
          }
          volumeCurvePointCount = patchInput.readUnsignedByte((byte) 34);
          if (volumeCurvePointCount <= 0) {
            optionalVolumeCurve = null;
          } else {
            optionalVolumeCurve = new byte[volumeCurvePointCount * 2];
          }
          volumeCurveAlias = optionalVolumeCurve;
          volumeCurve = volumeCurveAlias;
          panCurvePointCount = patchInput.readUnsignedByte((byte) 34);
          if (0 >= panCurvePointCount) {
            optionalPanCurve = null;
          } else {
            optionalPanCurve = new byte[panCurvePointCount * 2];
          }
          panCurveAlias = optionalPanCurve;
          panCurve = panCurveAlias;
          for (sampleRunByteCount = 0; patchInput.bytes[sampleRunByteCount + patchInput.position] != 0; sampleRunByteCount++) {
          }
          sampleRunsStorage = new byte[sampleRunByteCount];
          sampleRunsAlias = sampleRunsStorage;
          sampleRuns = sampleRunsAlias;
          for (sampleRunDecodeIndex = 0; sampleRunByteCount > sampleRunDecodeIndex; sampleRunDecodeIndex++) {
            sampleRuns[sampleRunDecodeIndex] = patchInput.readSignedByte((byte) 127);
          }
          patchInput.position = patchInput.position + 1;
          sampleRunByteCount++;
          pitchLowAccumulator = 0;
          for (pitchLowKeyIndex = 0; pitchLowKeyIndex < 128; pitchLowKeyIndex++) {
            pitchLowAccumulator = pitchLowAccumulator + patchInput.readUnsignedByte((byte) 34);
            this.pitchOffsetsAndLoopFlag[pitchLowKeyIndex] = (short)pitchLowAccumulator;
          }
          pitchHighAccumulator = 0;
          for (pitchHighKeyIndex = 0; pitchHighKeyIndex < 128; pitchHighKeyIndex++) {
            pitchHighAccumulator = pitchHighAccumulator + patchInput.readUnsignedByte((byte) 34);
            this.pitchOffsetsAndLoopFlag[pitchHighKeyIndex] = (short)(this.pitchOffsetsAndLoopFlag[pitchHighKeyIndex] + (pitchHighAccumulator << 8));
          }
          sampleIdRunRemaining = 0;
          sampleIdRunCursor = 0;
          encodedSampleId = 0;
          for (sampleIdKeyIndex = 0; sampleIdKeyIndex < 128; sampleIdKeyIndex++) {
            if (sampleIdRunRemaining == 0) {
              if (sampleRunsStorage.length > sampleIdRunCursor) {
                sampleIdRunRemaining = sampleRuns[sampleIdRunCursor++];
              } else {
                sampleIdRunRemaining = -1;
              }
              encodedSampleId = patchInput.readVariableIntBE((byte) -116);
            }
            this.pitchOffsetsAndLoopFlag[sampleIdKeyIndex] = (short)(this.pitchOffsetsAndLoopFlag[sampleIdKeyIndex] + ProxySocketConnector.andInt(-1 + encodedSampleId << 14, 32768));
            this.encodedSampleIds[sampleIdKeyIndex] = encodedSampleId;
            sampleIdRunRemaining--;
          }
          keyGroupRunCursor = 0;
          keyGroupRunRemaining = 0;
          currentKeyGroup = 0;
          for (keyGroupKeyIndex = 0; keyGroupKeyIndex < 128; keyGroupKeyIndex++) {
            if (this.encodedSampleIds[keyGroupKeyIndex] != 0) {
              if (keyGroupRunRemaining == 0) {
                keyGroupValueReadIndexSnapshot = keyGroupValueCursor;
                keyGroupValueCursor++;
                currentKeyGroup = -1 + patchInput.bytes[keyGroupValueReadIndexSnapshot];
                if (keyGroupRunCursor >= keyGroupRunsStorage.length) {
                  keyGroupRunRemaining = -1;
                } else {
                  keyGroupRunRemaining = keyGroupRuns[keyGroupRunCursor++];
                }
              }
              keyGroupRunRemaining--;
              this.keyGroups[keyGroupKeyIndex] = (byte)currentKeyGroup;
            }
          }
          panRunCursor = 0;
          panRunRemaining = 0;
          currentPanValue = 0;
          for (panKeyIndex = 0; panKeyIndex < 128; panKeyIndex++) {
            if (0 != this.encodedSampleIds[panKeyIndex]) {
              if (panRunRemaining == 0) {
                panValueReadIndexSnapshot = panValueCursor;
                panValueCursor++;
                currentPanValue = 16 + patchInput.bytes[panValueReadIndexSnapshot] << 2;
                if (panRunsStorage.length > panRunCursor) {
                  panRunRemaining = panRuns[panRunCursor++];
                } else {
                  panRunRemaining = -1;
                }
              }
              this.keyPans[panKeyIndex] = (byte)currentPanValue;
              panRunRemaining--;
            }
          }
          envelopeRunRemaining = 0;
          envelopeRunCursor = 0;
          currentEnvelope = null;
          for (envelopeKeyIndex = 0; envelopeKeyIndex < 128; envelopeKeyIndex++) {
            if (0 != this.encodedSampleIds[envelopeKeyIndex]) {
              if (envelopeRunRemaining == 0) {
                currentEnvelope = envelopes[envelopeAssignmentsStorage[envelopeRunCursor]];
                if (envelopeRunCursor < envelopeRunsStorage.length) {
                  envelopeRunRemaining = envelopeRuns[envelopeRunCursor++];
                } else {
                  envelopeRunRemaining = -1;
                }
              }
              envelopeRunRemaining--;
              this.keyEnvelopes[envelopeKeyIndex] = (InstrumentEnvelope) (currentEnvelope);
            }
          }
          volumeRunCursor = 0;
          volumeRunRemaining = 0;
          currentVolume = 0;
          for (volumeKeyIndex = 0; volumeKeyIndex < 128; volumeKeyIndex++) {
            if (0 == volumeRunRemaining) {
              if (sampleRunsStorage.length > volumeRunCursor) {
                volumeRunRemaining = sampleRuns[volumeRunCursor++];
              } else {
                volumeRunRemaining = -1;
              }
              if (0 < this.encodedSampleIds[volumeKeyIndex]) {
                currentVolume = patchInput.readUnsignedByte((byte) 34) + 1;
              }
            }
            volumeRunRemaining--;
            this.keyVolumes[volumeKeyIndex] = (byte)currentVolume;
          }
          this.globalVolume = 1 + patchInput.readUnsignedByte((byte) 34);
          for (envelopeValueDecodeIndex = 0; envelopeCount > envelopeValueDecodeIndex; envelopeValueDecodeIndex++) {
            envelopeForValues = envelopes[envelopeValueDecodeIndex];
            if (null != envelopeForValues.volumeEnvelope) {
              for (volumeEnvelopeValueByteIndex = 1; envelopeForValues.volumeEnvelope.length > volumeEnvelopeValueByteIndex; volumeEnvelopeValueByteIndex += 2) {
                envelopeForValues.volumeEnvelope[volumeEnvelopeValueByteIndex] = patchInput.readSignedByte((byte) 76);
              }
            }
            if (envelopeForValues.releaseEnvelope != null) {
              for (releaseEnvelopeValueByteIndex = 3; -2 + envelopeForValues.releaseEnvelope.length > releaseEnvelopeValueByteIndex; releaseEnvelopeValueByteIndex += 2) {
                envelopeForValues.releaseEnvelope[releaseEnvelopeValueByteIndex] = patchInput.readSignedByte((byte) 102);
              }
            }
          }
          if (null != volumeCurve) {
            for (volumeCurveValueByteIndex = 1; volumeCurveValueByteIndex < volumeCurveAlias.length; volumeCurveValueByteIndex += 2) {
              volumeCurve[volumeCurveValueByteIndex] = patchInput.readSignedByte((byte) 96);
            }
          }
          if (panCurve != null) {
            for (panCurveValueByteIndex = 1; panCurveAlias.length > panCurveValueByteIndex; panCurveValueByteIndex += 2) {
              panCurve[panCurveValueByteIndex] = patchInput.readSignedByte((byte) 75);
            }
          }
          for (releaseEnvelopeTimeDecodeIndex = 0; releaseEnvelopeTimeDecodeIndex < envelopeCount; releaseEnvelopeTimeDecodeIndex++) {
            releaseEnvelopeForTimes = envelopes[releaseEnvelopeTimeDecodeIndex];
            if (null != releaseEnvelopeForTimes.releaseEnvelope) {
              releaseEnvelopeTimeAccumulator = 0;
              for (releaseEnvelopeTimeByteIndex = 2; releaseEnvelopeTimeByteIndex < releaseEnvelopeForTimes.releaseEnvelope.length; releaseEnvelopeTimeByteIndex += 2) {
                releaseEnvelopeTimeAccumulator = patchInput.readUnsignedByte((byte) 34) + (1 + releaseEnvelopeTimeAccumulator);
                releaseEnvelopeForTimes.releaseEnvelope[releaseEnvelopeTimeByteIndex] = (byte)releaseEnvelopeTimeAccumulator;
              }
            }
          }
          for (volumeEnvelopeTimeDecodeIndex = 0; envelopeCount > volumeEnvelopeTimeDecodeIndex; volumeEnvelopeTimeDecodeIndex++) {
            volumeEnvelopeForTimes = envelopes[volumeEnvelopeTimeDecodeIndex];
            if (null != volumeEnvelopeForTimes.volumeEnvelope) {
              volumeEnvelopeTimeAccumulator = 0;
              for (volumeEnvelopeTimeByteIndex = 2; volumeEnvelopeTimeByteIndex < volumeEnvelopeForTimes.volumeEnvelope.length; volumeEnvelopeTimeByteIndex += 2) {
                volumeEnvelopeTimeAccumulator = patchInput.readUnsignedByte((byte) 34) + (1 + volumeEnvelopeTimeAccumulator);
                volumeEnvelopeForTimes.volumeEnvelope[volumeEnvelopeTimeByteIndex] = (byte)volumeEnvelopeTimeAccumulator;
              }
            }
          }
          if (null != volumeCurve) {
            volumeCurveKeyAccumulator = patchInput.readUnsignedByte((byte) 34);
            volumeCurve[0] = (byte)volumeCurveKeyAccumulator;
            for (volumeCurveKeyByteIndex = 2; volumeCurveKeyByteIndex < volumeCurveAlias.length; volumeCurveKeyByteIndex += 2) {
              volumeCurveKeyAccumulator = patchInput.readUnsignedByte((byte) 34) + 1 + volumeCurveKeyAccumulator;
              volumeCurve[volumeCurveKeyByteIndex] = (byte)volumeCurveKeyAccumulator;
            }
            previousVolumeCurveKey = volumeCurveAlias[0];
            volumeScaleQ6 = volumeCurveAlias[1];
            for (volumePrefixKeyIndex = 0; previousVolumeCurveKey > volumePrefixKeyIndex; volumePrefixKeyIndex++) {
              this.keyVolumes[volumePrefixKeyIndex] = (byte)(this.keyVolumes[volumePrefixKeyIndex] * volumeScaleQ6 + 32 >> 6);
            }
            for (volumeCurvePairIndex = 2; volumeCurveAlias.length > volumeCurvePairIndex; volumeCurvePairIndex += 2) {
              nextVolumeCurveKey = volumeCurveAlias[volumeCurvePairIndex];
              nextVolumeScaleQ6 = volumeCurve[1 + volumeCurvePairIndex];
              volumeInterpolationNumerator = volumeScaleQ6 * (nextVolumeCurveKey - previousVolumeCurveKey) + (-previousVolumeCurveKey + nextVolumeCurveKey) / 2;
              for (volumeInterpolationKeyIndex = previousVolumeCurveKey; nextVolumeCurveKey > volumeInterpolationKeyIndex; volumeInterpolationKeyIndex++) {
                interpolatedVolumeScaleQ6 = PacketBuffer.divideFloorWithPositiveDivisor(nextVolumeCurveKey - previousVolumeCurveKey, (byte) -6, volumeInterpolationNumerator);
                this.keyVolumes[volumeInterpolationKeyIndex] = (byte)(32 + this.keyVolumes[volumeInterpolationKeyIndex] * interpolatedVolumeScaleQ6 >> 6);
                volumeInterpolationNumerator = volumeInterpolationNumerator + (nextVolumeScaleQ6 - volumeScaleQ6);
              }
              previousVolumeCurveKey = nextVolumeCurveKey;
              volumeScaleQ6 = nextVolumeScaleQ6;
            }
            for (volumeTailKeyIndex = previousVolumeCurveKey; volumeTailKeyIndex < 128; volumeTailKeyIndex++) {
              this.keyVolumes[volumeTailKeyIndex] = (byte)(32 + this.keyVolumes[volumeTailKeyIndex] * volumeScaleQ6 >> 6);
            }
            volumeCurve = null;
          }
          if (panCurve != null) {
            panCurveKeyAccumulator = patchInput.readUnsignedByte((byte) 34);
            panCurve[0] = (byte)panCurveKeyAccumulator;
            for (panCurveKeyByteIndex = 2; panCurveKeyByteIndex < panCurveAlias.length; panCurveKeyByteIndex += 2) {
              panCurveKeyAccumulator = patchInput.readUnsignedByte((byte) 34) + 1 + panCurveKeyAccumulator;
              panCurve[panCurveKeyByteIndex] = (byte)panCurveKeyAccumulator;
            }
            previousPanCurveKey = panCurveAlias[0];
            panCurveOffset = panCurveAlias[1] << 1;
            for (panPrefixKeyIndex = 0; previousPanCurveKey > panPrefixKeyIndex; panPrefixKeyIndex++) {
              prefixClampedPan = (255 & this.keyPans[panPrefixKeyIndex]) + panCurveOffset;
              if (prefixClampedPan < 0) {
                prefixClampedPan = 0;
              }
              if (prefixClampedPan > 128) {
                prefixClampedPan = 128;
              }
              this.keyPans[panPrefixKeyIndex] = (byte)prefixClampedPan;
            }
            panCurvePairIndex = 2;
            while (panCurvePairIndex < panCurveAlias.length) {
              nextPanCurveKey = panCurveAlias[panCurvePairIndex];
              nextPanCurveOffset = panCurve[panCurvePairIndex + 1] << 1;
              panInterpolationNumerator = (nextPanCurveKey - previousPanCurveKey) * panCurveOffset + (-previousPanCurveKey + nextPanCurveKey) / 2;
              panCurveKeyIndex = previousPanCurveKey;
              unusedPanInterpolationStartKeySnapshot = panCurveKeyIndex;
              while (nextPanCurveKey > panCurveKeyIndex) {
                interpolatedPanCurveOffset = PacketBuffer.divideFloorWithPositiveDivisor(nextPanCurveKey - previousPanCurveKey, (byte) -6, panInterpolationNumerator);
                clampedPan = (this.keyPans[panCurveKeyIndex] & 255) + interpolatedPanCurveOffset;
                if (clampedPan < 0) {
                  clampedPan = 0;
                }
                if (clampedPan > 128) {
                  clampedPan = 128;
                }
                this.keyPans[panCurveKeyIndex] = (byte)clampedPan;
                panInterpolationNumerator = panInterpolationNumerator + (nextPanCurveOffset - panCurveOffset);
                panCurveKeyIndex++;
              }
              panCurvePairIndex += 2;
              panCurveOffset = nextPanCurveOffset;
              previousPanCurveKey = nextPanCurveKey;
            }
            for (panTailKeyIndex = previousPanCurveKey; panTailKeyIndex < 128; panTailKeyIndex++) {
              tailClampedPan = (this.keyPans[panTailKeyIndex] & 255) + panCurveOffset;
              if (tailClampedPan < 0) {
                tailClampedPan = 0;
              }
              if (tailClampedPan > 128) {
                tailClampedPan = 128;
              }
              this.keyPans[panTailKeyIndex] = (byte)tailClampedPan;
            }
            panCurve = null;
          }
          for (decayEnvelopeDecodeIndex = 0; envelopeCount > decayEnvelopeDecodeIndex; decayEnvelopeDecodeIndex++) {
            envelopes[decayEnvelopeDecodeIndex].decayRate = patchInput.readUnsignedByte((byte) 34);
          }
          for (keyScalingEnvelopeDecodeIndex = 0; keyScalingEnvelopeDecodeIndex < envelopeCount; keyScalingEnvelopeDecodeIndex++) {
            envelopeForKeyScaling = envelopes[keyScalingEnvelopeDecodeIndex];
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
          for (vibratoPhaseEnvelopeDecodeIndex = 0; envelopeCount > vibratoPhaseEnvelopeDecodeIndex; vibratoPhaseEnvelopeDecodeIndex++) {
            envelopes[vibratoPhaseEnvelopeDecodeIndex].vibratoPhaseStep = patchInput.readUnsignedByte((byte) 34);
          }
          for (vibratoDepthEnvelopeDecodeIndex = 0; vibratoDepthEnvelopeDecodeIndex < envelopeCount; vibratoDepthEnvelopeDecodeIndex++) {
            envelopeForVibratoDepth = envelopes[vibratoDepthEnvelopeDecodeIndex];
            if (envelopeForVibratoDepth.vibratoPhaseStep > 0) {
              envelopeForVibratoDepth.vibratoDepth = patchInput.readUnsignedByte((byte) 34);
            }
          }
          for (vibratoRampEnvelopeDecodeIndex = 0; vibratoRampEnvelopeDecodeIndex < envelopeCount; vibratoRampEnvelopeDecodeIndex++) {
            envelopeForVibratoRamp = envelopes[vibratoRampEnvelopeDecodeIndex];
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
