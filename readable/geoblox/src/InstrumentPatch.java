/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InstrumentPatch extends IntrusiveNode {
    byte[] keyPans;
    private int[] encodedSampleIds;
    byte[] keyVolumes;
    PcmSample[] keySamples;
    static boolean field_q;
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
            if (!((noteSelectionMask != null) &&
                  (noteSelectionMask[keyIndex] == 0))) {
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
            field_q = true;
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

    public static void b(boolean param0) {
        if (!param0) {
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

    final static void a(Sprite[] param0, int param1, int param2, int param3, byte param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Geoblox.clientControlFlowFlag;
        try {
          if ((param0 != null) &&
              (param1 > 0)) {
            var5_int = param0[0].fullWidth;
            var6 = param0[2].fullWidth;
            var7 = param0[1].fullWidth;
            param0[0].draw(param3, param2);
            param0[2].draw(param3 + param1 - var6, param2);
            SoftwareRasterizer.saveClip(ClientOptionSupport.sharedSavedClip);
            SoftwareRasterizer.intersectClip(param3 + var5_int, param2, param3 + param1 - var6, param2 + param0[1].fullHeight);
            var8 = var5_int + param3;
            var9 = param1 + (param3 - var6);
            for (param3 = var8; param3 < var9; param3 = param3 + var7) {
              param0[1].draw(param3, param2);
            }
            SoftwareRasterizer.restoreClip(ClientOptionSupport.sharedSavedClip);
            if (param4 != 107) {
              loginModPowModulus = (java.math.BigInteger) null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("vl.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
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
          keyGroupReadIndexOrCursor = patchInput.position;
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
          panReadIndexOrCursor = patchInput.position;
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
          pitchOrCurveTimeAccumulator = 0;
          for (remainingRunLength = 0; remainingRunLength < 128; remainingRunLength++) {
            pitchOrCurveTimeAccumulator = pitchOrCurveTimeAccumulator + patchInput.readUnsignedByte((byte) 34);
            this.pitchOffsetsAndLoopFlag[remainingRunLength] = (short)pitchOrCurveTimeAccumulator;
          }
          pitchOrCurveTimeAccumulator = 0;
          for (remainingRunLength = 0; remainingRunLength < 128; remainingRunLength++) {
            pitchOrCurveTimeAccumulator = pitchOrCurveTimeAccumulator + patchInput.readUnsignedByte((byte) 34);
            this.pitchOffsetsAndLoopFlag[remainingRunLength] = (short)(this.pitchOffsetsAndLoopFlag[remainingRunLength] + (pitchOrCurveTimeAccumulator << 8));
          }
          remainingRunLength = 0;
          runReadIndex = 0;
          encodedSampleId = 0;
          for (keyIndexOrKeyGroup = 0; keyIndexOrKeyGroup < 128; keyIndexOrKeyGroup++) {
            if (remainingRunLength == 0) {
              if (sampleRunsStorage.length > runReadIndex) {
                remainingRunLength = sampleRuns[runReadIndex++];
              } else {
                remainingRunLength = -1;
              }
              encodedSampleId = patchInput.readVariableIntBE((byte) -116);
            }
            this.pitchOffsetsAndLoopFlag[keyIndexOrKeyGroup] = (short)(this.pitchOffsetsAndLoopFlag[keyIndexOrKeyGroup] + ProxySocketConnector.andInt(-1 + encodedSampleId << 14, 32768));
            this.encodedSampleIds[keyIndexOrKeyGroup] = encodedSampleId;
            remainingRunLength--;
          }
          runReadIndex = 0;
          remainingRunLength = 0;
          keyIndexOrKeyGroup = 0;
          for (keyIndexOrPan = 0; keyIndexOrPan < 128; keyIndexOrPan++) {
            if (this.encodedSampleIds[keyIndexOrPan] != 0) {
              if (remainingRunLength == 0) {
                keyGroupValueReadIndexSnapshot = keyGroupReadIndexOrCursor;
                keyGroupReadIndexOrCursor++;
                keyIndexOrKeyGroup = -1 + patchInput.bytes[keyGroupValueReadIndexSnapshot];
                if (runReadIndex >= keyGroupRunsStorage.length) {
                  remainingRunLength = -1;
                } else {
                  remainingRunLength = keyGroupRuns[runReadIndex++];
                }
              }
              remainingRunLength--;
              this.keyGroups[keyIndexOrPan] = (byte)keyIndexOrKeyGroup;
            }
          }
          runReadIndex = 0;
          remainingRunLength = 0;
          keyIndexOrPan = 0;
          for (panKeyIndex = 0; panKeyIndex < 128; panKeyIndex++) {
            if (0 != this.encodedSampleIds[panKeyIndex]) {
              if (remainingRunLength == 0) {
                panValueReadIndexSnapshot = panReadIndexOrCursor;
                panReadIndexOrCursor++;
                keyIndexOrPan = 16 + patchInput.bytes[panValueReadIndexSnapshot] << 2;
                if (panRunsStorage.length > runReadIndex) {
                  remainingRunLength = panRuns[runReadIndex++];
                } else {
                  remainingRunLength = -1;
                }
              }
              this.keyPans[panKeyIndex] = (byte)keyIndexOrPan;
              remainingRunLength--;
            }
          }
          remainingRunLength = 0;
          runReadIndex = 0;
          currentEnvelope = null;
          for (keyIndexOrVolume = 0; keyIndexOrVolume < 128; keyIndexOrVolume++) {
            if (0 != this.encodedSampleIds[keyIndexOrVolume]) {
              if (remainingRunLength == 0) {
                currentEnvelope = envelopes[envelopeAssignmentsStorage[runReadIndex]];
                if (runReadIndex < envelopeRunsStorage.length) {
                  remainingRunLength = envelopeRuns[runReadIndex++];
                } else {
                  remainingRunLength = -1;
                }
              }
              remainingRunLength--;
              this.keyEnvelopes[keyIndexOrVolume] = (InstrumentEnvelope) (currentEnvelope);
            }
          }
          runReadIndex = 0;
          remainingRunLength = 0;
          keyIndexOrVolume = 0;
          for (envelopeIndexOrCurveKey = 0; envelopeIndexOrCurveKey < 128; envelopeIndexOrCurveKey++) {
            if (0 == remainingRunLength) {
              if (sampleRunsStorage.length > runReadIndex) {
                remainingRunLength = sampleRuns[runReadIndex++];
              } else {
                remainingRunLength = -1;
              }
              if (0 < this.encodedSampleIds[envelopeIndexOrCurveKey]) {
                keyIndexOrVolume = patchInput.readUnsignedByte((byte) 34) + 1;
              }
            }
            remainingRunLength--;
            this.keyVolumes[envelopeIndexOrCurveKey] = (byte)keyIndexOrVolume;
          }
          this.globalVolume = 1 + patchInput.readUnsignedByte((byte) 34);
          for (envelopeIndexOrCurveKey = 0; envelopeCount > envelopeIndexOrCurveKey; envelopeIndexOrCurveKey++) {
            envelopeForValues = envelopes[envelopeIndexOrCurveKey];
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
            for (envelopeIndexOrCurveKey = 1; envelopeIndexOrCurveKey < volumeCurveAlias.length; envelopeIndexOrCurveKey += 2) {
              volumeCurve[envelopeIndexOrCurveKey] = patchInput.readSignedByte((byte) 96);
            }
          }
          if (panCurve != null) {
            for (envelopeIndexOrCurveKey = 1; panCurveAlias.length > envelopeIndexOrCurveKey; envelopeIndexOrCurveKey += 2) {
              panCurve[envelopeIndexOrCurveKey] = patchInput.readSignedByte((byte) 75);
            }
          }
          for (envelopeIndexOrCurveKey = 0; envelopeIndexOrCurveKey < envelopeCount; envelopeIndexOrCurveKey++) {
            releaseEnvelopeForTimes = envelopes[envelopeIndexOrCurveKey];
            if (null != releaseEnvelopeForTimes.releaseEnvelope) {
              pitchOrCurveTimeAccumulator = 0;
              for (curvePairOrKeyIndex = 2; curvePairOrKeyIndex < releaseEnvelopeForTimes.releaseEnvelope.length; curvePairOrKeyIndex += 2) {
                pitchOrCurveTimeAccumulator = patchInput.readUnsignedByte((byte) 34) + (1 + pitchOrCurveTimeAccumulator);
                releaseEnvelopeForTimes.releaseEnvelope[curvePairOrKeyIndex] = (byte)pitchOrCurveTimeAccumulator;
              }
            }
          }
          for (envelopeIndexOrCurveKey = 0; envelopeCount > envelopeIndexOrCurveKey; envelopeIndexOrCurveKey++) {
            volumeEnvelopeForTimes = envelopes[envelopeIndexOrCurveKey];
            if (null != volumeEnvelopeForTimes.volumeEnvelope) {
              pitchOrCurveTimeAccumulator = 0;
              for (curvePairOrKeyIndex = 2; curvePairOrKeyIndex < volumeEnvelopeForTimes.volumeEnvelope.length; curvePairOrKeyIndex += 2) {
                pitchOrCurveTimeAccumulator = patchInput.readUnsignedByte((byte) 34) + (1 + pitchOrCurveTimeAccumulator);
                volumeEnvelopeForTimes.volumeEnvelope[curvePairOrKeyIndex] = (byte)pitchOrCurveTimeAccumulator;
              }
            }
          }
          if (null != volumeCurve) {
            pitchOrCurveTimeAccumulator = patchInput.readUnsignedByte((byte) 34);
            volumeCurve[0] = (byte)pitchOrCurveTimeAccumulator;
            for (envelopeIndexOrCurveKey = 2; envelopeIndexOrCurveKey < volumeCurveAlias.length; envelopeIndexOrCurveKey += 2) {
              pitchOrCurveTimeAccumulator = patchInput.readUnsignedByte((byte) 34) + 1 + pitchOrCurveTimeAccumulator;
              volumeCurve[envelopeIndexOrCurveKey] = (byte)pitchOrCurveTimeAccumulator;
            }
            envelopeIndexOrCurveKey = volumeCurveAlias[0];
            curveValue = volumeCurveAlias[1];
            for (curvePairOrKeyIndex = 0; envelopeIndexOrCurveKey > curvePairOrKeyIndex; curvePairOrKeyIndex++) {
              this.keyVolumes[curvePairOrKeyIndex] = (byte)(this.keyVolumes[curvePairOrKeyIndex] * curveValue + 32 >> 6);
            }
            for (curvePairOrKeyIndex = 2; volumeCurveAlias.length > curvePairOrKeyIndex; curvePairOrKeyIndex += 2) {
              nextCurveKeyOrClampedPan = volumeCurveAlias[curvePairOrKeyIndex];
              nextCurveValueOrClampedPan = volumeCurve[1 + curvePairOrKeyIndex];
              interpolationNumerator = curveValue * (nextCurveKeyOrClampedPan - envelopeIndexOrCurveKey) + (-envelopeIndexOrCurveKey + nextCurveKeyOrClampedPan) / 2;
              for (curveKeyIndexOrAlias = envelopeIndexOrCurveKey; nextCurveKeyOrClampedPan > curveKeyIndexOrAlias; curveKeyIndexOrAlias++) {
                interpolatedCurveValue = PacketBuffer.divideFloorWithPositiveDivisor(nextCurveKeyOrClampedPan - envelopeIndexOrCurveKey, (byte) -6, interpolationNumerator);
                this.keyVolumes[curveKeyIndexOrAlias] = (byte)(32 + this.keyVolumes[curveKeyIndexOrAlias] * interpolatedCurveValue >> 6);
                interpolationNumerator = interpolationNumerator + (nextCurveValueOrClampedPan - curveValue);
              }
              envelopeIndexOrCurveKey = nextCurveKeyOrClampedPan;
              curveValue = nextCurveValueOrClampedPan;
            }
            for (nextCurveKeyOrClampedPan = envelopeIndexOrCurveKey; nextCurveKeyOrClampedPan < 128; nextCurveKeyOrClampedPan++) {
              this.keyVolumes[nextCurveKeyOrClampedPan] = (byte)(32 + this.keyVolumes[nextCurveKeyOrClampedPan] * curveValue >> 6);
            }
            volumeCurve = null;
          }
          if (panCurve != null) {
            pitchOrCurveTimeAccumulator = patchInput.readUnsignedByte((byte) 34);
            panCurve[0] = (byte)pitchOrCurveTimeAccumulator;
            for (envelopeIndexOrCurveKey = 2; envelopeIndexOrCurveKey < panCurveAlias.length; envelopeIndexOrCurveKey += 2) {
              pitchOrCurveTimeAccumulator = patchInput.readUnsignedByte((byte) 34) + 1 + pitchOrCurveTimeAccumulator;
              panCurve[envelopeIndexOrCurveKey] = (byte)pitchOrCurveTimeAccumulator;
            }
            envelopeIndexOrCurveKey = panCurveAlias[0];
            curveValue = panCurveAlias[1] << 1;
            for (curvePairOrKeyIndex = 0; envelopeIndexOrCurveKey > curvePairOrKeyIndex; curvePairOrKeyIndex++) {
              nextCurveKeyOrClampedPan = (255 & this.keyPans[curvePairOrKeyIndex]) + curveValue;
              if (nextCurveKeyOrClampedPan < 0) {
                nextCurveKeyOrClampedPan = 0;
              }
              if (nextCurveKeyOrClampedPan > 128) {
                nextCurveKeyOrClampedPan = 128;
              }
              this.keyPans[curvePairOrKeyIndex] = (byte)nextCurveKeyOrClampedPan;
            }
            curvePairOrKeyIndex = 2;
            while (curvePairOrKeyIndex < panCurveAlias.length) {
              nextCurveKeyOrClampedPan = panCurveAlias[curvePairOrKeyIndex];
              nextCurveValueOrClampedPan = panCurve[curvePairOrKeyIndex + 1] << 1;
              interpolationNumerator = (nextCurveKeyOrClampedPan - envelopeIndexOrCurveKey) * curveValue + (-envelopeIndexOrCurveKey + nextCurveKeyOrClampedPan) / 2;
              panCurveKeyIndex = envelopeIndexOrCurveKey;
              curveKeyIndexOrAlias = panCurveKeyIndex;
              while (nextCurveKeyOrClampedPan > panCurveKeyIndex) {
                interpolatedCurveValue = PacketBuffer.divideFloorWithPositiveDivisor(nextCurveKeyOrClampedPan - envelopeIndexOrCurveKey, (byte) -6, interpolationNumerator);
                clampedPan = (this.keyPans[panCurveKeyIndex] & 255) + interpolatedCurveValue;
                if (clampedPan < 0) {
                  clampedPan = 0;
                }
                if (clampedPan > 128) {
                  clampedPan = 128;
                }
                this.keyPans[panCurveKeyIndex] = (byte)clampedPan;
                interpolationNumerator = interpolationNumerator + (nextCurveValueOrClampedPan - curveValue);
                panCurveKeyIndex++;
              }
              curvePairOrKeyIndex += 2;
              curveValue = nextCurveValueOrClampedPan;
              envelopeIndexOrCurveKey = nextCurveKeyOrClampedPan;
            }
            for (nextCurveKeyOrClampedPan = envelopeIndexOrCurveKey; nextCurveKeyOrClampedPan < 128; nextCurveKeyOrClampedPan++) {
              nextCurveValueOrClampedPan = (this.keyPans[nextCurveKeyOrClampedPan] & 255) + curveValue;
              if (nextCurveValueOrClampedPan < 0) {
                nextCurveValueOrClampedPan = 0;
              }
              if (nextCurveValueOrClampedPan > 128) {
                nextCurveValueOrClampedPan = 128;
              }
              this.keyPans[nextCurveKeyOrClampedPan] = (byte)nextCurveValueOrClampedPan;
            }
            panCurve = null;
          }
          for (envelopeIndexOrCurveKey = 0; envelopeCount > envelopeIndexOrCurveKey; envelopeIndexOrCurveKey++) {
            envelopes[envelopeIndexOrCurveKey].decayRate = patchInput.readUnsignedByte((byte) 34);
          }
          for (envelopeIndexOrCurveKey = 0; envelopeIndexOrCurveKey < envelopeCount; envelopeIndexOrCurveKey++) {
            envelopeForKeyScaling = envelopes[envelopeIndexOrCurveKey];
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
          for (envelopeIndexOrCurveKey = 0; envelopeCount > envelopeIndexOrCurveKey; envelopeIndexOrCurveKey++) {
            envelopes[envelopeIndexOrCurveKey].vibratoPhaseStep = patchInput.readUnsignedByte((byte) 34);
          }
          for (envelopeIndexOrCurveKey = 0; envelopeIndexOrCurveKey < envelopeCount; envelopeIndexOrCurveKey++) {
            envelopeForVibratoDepth = envelopes[envelopeIndexOrCurveKey];
            if (envelopeForVibratoDepth.vibratoPhaseStep > 0) {
              envelopeForVibratoDepth.vibratoDepth = patchInput.readUnsignedByte((byte) 34);
            }
          }
          for (envelopeIndexOrCurveKey = 0; envelopeIndexOrCurveKey < envelopeCount; envelopeIndexOrCurveKey++) {
            envelopeForVibratoRamp = envelopes[envelopeIndexOrCurveKey];
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
        field_q = false;
        loginModPowModulus = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
