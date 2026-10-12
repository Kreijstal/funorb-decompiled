/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatch extends IntrusiveNode {
    static int field_n;
    static String field_u;
    static int field_t;
    int globalGain;
    static boolean field_w;
    static String field_p;
    static RgbSprite field_z;
    byte[] notePans;
    short[] pitchAndLoopFlags;
    private int[] sampleIds;
    MusicPatchEnvelope[] envelopes;
    static String field_o;
    byte[] noteGains;
    byte[] exclusiveGroups;
    static RgbSprite[] field_m;
    PcmSample[] samples;

    final static void a(AnimationFrameSet param0, byte param1) {
        try {
          IntPair.field_q = param0;
          if (param1 != -34) {
            field_m = (RgbSprite[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "io.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_z = null;
        field_o = null;
        field_m = null;
        if (param0 != 52) {
          return;
        }
        field_u = null;
    }

    final void releaseSampleIds(int obfuscationGuard) {
        if (obfuscationGuard <= 117) {
          this.sampleIds = (int[]) null;
        }
        this.sampleIds = null;
    }

    final static boolean a(int[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 <= 106) {
            var4 = (int[]) null;
            MusicPatch.a((int[]) null, (byte) -31);
          }
          var2_int = 0;
          while (true) {
            if (var2_int >= 8) {
              return false;
            }
            if (param0[var2_int] == 0) {
              var2_int++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("io.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean prepareSamples(int obfuscationGuard, byte[] noteMask, int[] budget, SoundCache soundCache) {
        int key = 0;
        int resultSuccess = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String maskDescription = null;
        StringBuilder budgetContext = null;
        String budgetDescription = null;
        StringBuilder cacheContext = null;
        String cacheDescription = null;
        RuntimeException caughtFailure = null;
        int prepared = 0;
        RuntimeException failure = null;
        int previousSampleId = 0;
        Object sample = null;
        int sampleId = 0;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          prepared = 1;
          previousSampleId = 0;
          sample = null;
          if (obfuscationGuard != 11008) {
            field_o = (String) null;
          }
          for (key = 0; key < 128; key++) {
            if (noteMask == null ||
              noteMask[key] != 0) {
              sampleId = this.sampleIds[key];
              if (sampleId != 0) {
                if (previousSampleId != sampleId) {
                  previousSampleId = sampleId;
                  sampleId--;
                  if ((1 & sampleId) != 0) {
                    sample = soundCache.loadMusicSampleById(budget, 36, sampleId >> 2);
                  } else {
                    sample = soundCache.loadSoundEffectById(true, budget, sampleId >> 2);
                  }
                  if (sample == null) {
                    prepared = 0;
                  }
                }
                if (sample != null) {
                  this.samples[key] = (PcmSample) (sample);
                  this.sampleIds[key] = 0;
                }
              }
            }
          }
          resultSuccess = prepared;
          return resultSuccess != 0;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("io.C(").append(obfuscationGuard).append(',');
          if (noteMask == null) {
            maskDescription = "null";
          } else {
            maskDescription = "{...}";
          }
          budgetContext = ((StringBuilder) (Object) errorContext).append(maskDescription).append(',');
          if (budget == null) {
            budgetDescription = "null";
          } else {
            budgetDescription = "{...}";
          }
          cacheContext = ((StringBuilder) (Object) budgetContext).append(budgetDescription).append(',');
          if (soundCache == null) {
            cacheDescription = "null";
          } else {
            cacheDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) cacheContext).append(cacheDescription).append(')').toString());
        }
    }

    MusicPatch(byte[] packedPatch) {
        int envelopeRunByteIndex = 0;
        int newEnvelopeIndex = 0;
        MusicPatchEnvelope newEnvelope = null;
        int groupValueByteIndex = 0;
        int panKey = 0;
        int panValueByteIndex = 0;
        byte[] allocatedGainCurve = null;
        byte[] allocatedPanCurve = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String patchDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        int groupRunCount = 0;
        byte[] groupRuns = null;
        int groupRunByteIndex = 0;
        int panRunCount = 0;
        byte[] panRuns = null;
        int panRunByteIndex = 0;
        int envelopeRunCount = 0;
        byte[] envelopeRuns = null;
        byte[] envelopeMap = null;
        int envelopeCount = 0;
        int selectedEnvelopeIndex = 0;
        MusicPatchEnvelope[] envelopeTable = null;
        int envelopeMapIndex = 0;
        int envelopeMapCode = 0;
        byte[] gainCurve = null;
        MusicPatchEnvelope envelopeBeingAllocated = null;
        byte[] panCurve = null;
        int volumePointCount = 0;
        int sampleRunCount = 0;
        byte[] sampleRuns = null;
        int sampleRunByteIndex = 0;
        int pitchLowKey = 0;
        int sampleRunIndex = 0;
        int sampleId = 0;
        int sampleKey = 0;
        int groupKey = 0;
        Object selectedEnvelope = null;
        int envelopeKey = 0;
        int gainKey = 0;
        int gainCurveLevel = 0;
        int volumeLevelIndex = 0;
        int nextGainCurveKey = 0;
        int nextGainCurveLevel = 0;
        int gainInterpolationNumerator = 0;
        int gainInterpolationKey = 0;
        int interpolatedGainLevel = 0;
        int adjustedPan = 0;
        int panInterpolationKey = 0;
        PacketBuffer input = null;
        byte[] envelopeMapAlias = null;
        MusicPatchEnvelope envelopeAllocationAlias = null;
        byte[] sampleRunsAlias = null;
        byte[] groupRunsAlias = null;
        byte[] panRunsAlias = null;
        byte[] envelopeRunsAlias = null;
        MusicPatchEnvelope envelopeForLevels = null;
        byte[] gainCurveAlias = null;
        byte[] panCurveAlias = null;
        MusicPatchEnvelope envelopeForReleaseTimes = null;
        MusicPatchEnvelope envelopeForVolumeTimes = null;
        MusicPatchEnvelope envelopeForKeyScaling = null;
        MusicPatchEnvelope envelopeForVibratoDepth = null;
        MusicPatchEnvelope envelopeForVibratoDelay = null;
        byte[] allocatedEnvelopeMap = null;
        byte[] allocatedSampleRuns = null;
        byte[] allocatedGroupRuns = null;
        byte[] allocatedPanRuns = null;
        byte[] allocatedEnvelopeRuns = null;
        byte[] allocatedPanCurveAlias = null;
        int groupValueCursor;
        int panValueCursor;
        int lowPitchAccumulator;
        int highPitchAccumulator;
        int releaseTimeAccumulator;
        int volumeTimeAccumulator;
        int gainCurveKeyAccumulator;
        int panCurveKeyAccumulator;
        int pitchHighKey;
        int sampleRunRemaining;
        int groupRunRemaining;
        int panRunRemaining;
        int envelopeRunRemaining;
        int gainRunRemaining;
        int groupRunIndex;
        int panRunIndex;
        int envelopeRunIndex;
        int gainRunIndex;
        int exclusiveGroup;
        int panValue;
        int gainValue;
        int envelopeLevelsIndex;
        int gainCurveLevelIndex;
        int panCurveLevelIndex;
        int releaseTimesEnvelopeIndex;
        int volumeTimesEnvelopeIndex;
        int gainCurveTimeIndex;
        int panCurveTimeIndex;
        int decayEnvelopeIndex;
        int keyScalingEnvelopeIndex;
        int vibratoRateEnvelopeIndex;
        int vibratoDepthEnvelopeIndex;
        int vibratoDelayEnvelopeIndex;
        int panCurveOffset;
        int releaseTimeIndex;
        int volumeTimeIndex;
        int gainPrefixKey;
        int panPrefixKey;
        int adjustedPrefixPan;
        int nextPanCurveOffset;
        int panInterpolationNumerator;
        int unusedPanInterpolationKey;
        int interpolatedPanOffset;
        int allocatedEnvelopeIndex;
        int gainCurvePointCount;
        int panCurvePointCount;
        int releasePointCount;
        int releaseLevelIndex;
        int gainSuffixKey;
        int currentGainCurveKey;
        int currentPanCurveKey;
        int gainCurveSegmentIndex;
        int panCurveSegmentIndex;
        int nextPanCurveKey;
        int panSuffixKey;
        int adjustedSuffixPan;
        try {
          this.notePans = new byte[128];
          this.samples = new PcmSample[128];
          this.exclusiveGroups = new byte[128];
          this.pitchAndLoopFlags = new short[128];
          this.sampleIds = new int[128];
          this.envelopes = new MusicPatchEnvelope[128];
          this.noteGains = new byte[128];
          input = new PacketBuffer(packedPatch);
          for (groupRunCount = 0; input.payload[groupRunCount + input.position] != 0; groupRunCount++) {
          }
          allocatedGroupRuns = new byte[groupRunCount];
          groupRunsAlias = allocatedGroupRuns;
          groupRuns = groupRunsAlias;
          for (groupRunByteIndex = 0; groupRunByteIndex < groupRunCount; groupRunByteIndex++) {
            groupRuns[groupRunByteIndex] = input.readByte((byte) 8);
          }
          groupRunCount++;
          input.position = input.position + 1;
          groupValueCursor = input.position;
          input.position = input.position + groupRunCount;
          for (panRunCount = 0; input.payload[panRunCount + input.position] != 0; panRunCount++) {
          }
          allocatedPanRuns = new byte[panRunCount];
          panRunsAlias = allocatedPanRuns;
          panRuns = panRunsAlias;
          for (panRunByteIndex = 0; panRunByteIndex < panRunCount; panRunByteIndex++) {
            panRuns[panRunByteIndex] = input.readByte((byte) -120);
          }
          panRunCount++;
          input.position = input.position + 1;
          panValueCursor = input.position;
          input.position = input.position + panRunCount;
          for (envelopeRunCount = 0; input.payload[envelopeRunCount + input.position] != 0; envelopeRunCount++) {
          }
          allocatedEnvelopeRuns = new byte[envelopeRunCount];
          envelopeRunsAlias = allocatedEnvelopeRuns;
          envelopeRuns = envelopeRunsAlias;
          for (envelopeRunByteIndex = 0; envelopeRunCount > envelopeRunByteIndex; envelopeRunByteIndex++) {
            envelopeRuns[envelopeRunByteIndex] = input.readByte((byte) -113);
          }
          envelopeRunCount++;
          input.position = input.position + 1;
          allocatedEnvelopeMap = new byte[envelopeRunCount];
          envelopeMapAlias = allocatedEnvelopeMap;
          envelopeMap = envelopeMapAlias;
          if (envelopeRunCount > 1) {
            allocatedEnvelopeMap[1] = (byte) 1;
            selectedEnvelopeIndex = 1;
            envelopeCount = 2;
            for (envelopeMapIndex = 2; envelopeMapIndex < envelopeRunCount; envelopeMapIndex++) {
              envelopeMapCode = input.readUnsignedByte(0);
              if (envelopeMapCode != 0) {
                if (envelopeMapCode <= selectedEnvelopeIndex) {
                  envelopeMapCode--;
                }
                selectedEnvelopeIndex = envelopeMapCode;
              } else {
                newEnvelopeIndex = envelopeCount;
                envelopeCount++;
                selectedEnvelopeIndex = newEnvelopeIndex;
              }
              envelopeMap[envelopeMapIndex] = (byte)selectedEnvelopeIndex;
            }
          } else {
            envelopeCount = envelopeRunCount;
          }
          envelopeTable = new MusicPatchEnvelope[envelopeCount];
          for (allocatedEnvelopeIndex = 0; allocatedEnvelopeIndex < envelopeTable.length; allocatedEnvelopeIndex++) {
            newEnvelope = new MusicPatchEnvelope();
            envelopeTable[allocatedEnvelopeIndex] = newEnvelope;
            envelopeAllocationAlias = newEnvelope;
            envelopeBeingAllocated = envelopeAllocationAlias;
            volumePointCount = input.readUnsignedByte(0);
            if (volumePointCount > 0) {
              envelopeBeingAllocated.volumeEnvelope = new byte[2 * volumePointCount];
            }
            releasePointCount = input.readUnsignedByte(0);
            if (0 < releasePointCount) {
              envelopeBeingAllocated.releaseEnvelope = new byte[2 + releasePointCount * 2];
              envelopeAllocationAlias.releaseEnvelope[1] = (byte)64;
            }
          }
          gainCurvePointCount = input.readUnsignedByte(0);
          if (gainCurvePointCount <= 0) {
            allocatedGainCurve = null;
          } else {
            allocatedGainCurve = new byte[2 * gainCurvePointCount];
          }
          gainCurveAlias = allocatedGainCurve;
          gainCurve = gainCurveAlias;
          panCurvePointCount = input.readUnsignedByte(0);
          if (0 < panCurvePointCount) {
            allocatedPanCurve = new byte[panCurvePointCount * 2];
          } else {
            allocatedPanCurve = null;
          }
          allocatedPanCurveAlias = allocatedPanCurve;
          panCurveAlias = allocatedPanCurveAlias;
          panCurve = panCurveAlias;
          for (sampleRunCount = 0; 0 != input.payload[input.position + sampleRunCount]; sampleRunCount++) {
          }
          allocatedSampleRuns = new byte[sampleRunCount];
          sampleRunsAlias = allocatedSampleRuns;
          sampleRuns = sampleRunsAlias;
          for (sampleRunByteIndex = 0; sampleRunByteIndex < sampleRunCount; sampleRunByteIndex++) {
            sampleRuns[sampleRunByteIndex] = input.readByte((byte) -53);
          }
          sampleRunCount++;
          input.position = input.position + 1;
          lowPitchAccumulator = 0;
          for (pitchLowKey = 0; 128 > pitchLowKey; pitchLowKey++) {
            lowPitchAccumulator = lowPitchAccumulator + input.readUnsignedByte(0);
            this.pitchAndLoopFlags[pitchLowKey] = (short)lowPitchAccumulator;
          }
          highPitchAccumulator = 0;
          for (pitchHighKey = 0; 128 > pitchHighKey; pitchHighKey++) {
            highPitchAccumulator = highPitchAccumulator + input.readUnsignedByte(0);
            this.pitchAndLoopFlags[pitchHighKey] = (short)(this.pitchAndLoopFlags[pitchHighKey] + (highPitchAccumulator << 8));
          }
          sampleRunRemaining = 0;
          sampleRunIndex = 0;
          sampleId = 0;
          for (sampleKey = 0; sampleKey < 128; sampleKey++) {
            if (0 == sampleRunRemaining) {
              if (allocatedSampleRuns.length <= sampleRunIndex) {
                sampleRunRemaining = -1;
              } else {
                sampleRunRemaining = sampleRuns[sampleRunIndex++];
              }
              sampleId = input.readVarInt(110);
            }
            this.pitchAndLoopFlags[sampleKey] = (short)(this.pitchAndLoopFlags[sampleKey] + (rn.bitwiseAnd(-1 + sampleId, 2) << 14));
            this.sampleIds[sampleKey] = sampleId;
            sampleRunRemaining--;
          }
          groupRunRemaining = 0;
          groupRunIndex = 0;
          exclusiveGroup = 0;
          for (groupKey = 0; groupKey < 128; groupKey++) {
            if (this.sampleIds[groupKey] != 0) {
              if (groupRunRemaining == 0) {
                groupValueByteIndex = groupValueCursor;
                groupValueCursor++;
                exclusiveGroup = -1 + input.payload[groupValueByteIndex];
                if (groupRunIndex >= allocatedGroupRuns.length) {
                  groupRunRemaining = -1;
                } else {
                  groupRunRemaining = groupRuns[groupRunIndex++];
                }
              }
              groupRunRemaining--;
              this.exclusiveGroups[groupKey] = (byte)exclusiveGroup;
            }
          }
          panRunIndex = 0;
          panRunRemaining = 0;
          panValue = 0;
          for (panKey = 0; panKey < 128; panKey++) {
            if (this.sampleIds[panKey] != 0) {
              if (panRunRemaining == 0) {
                panValueByteIndex = panValueCursor;
                panValueCursor++;
                panValue = 16 + input.payload[panValueByteIndex] << 2;
                if (allocatedPanRuns.length > panRunIndex) {
                  panRunRemaining = panRuns[panRunIndex++];
                } else {
                  panRunRemaining = -1;
                }
              }
              panRunRemaining--;
              this.notePans[panKey] = (byte)panValue;
            }
          }
          envelopeRunIndex = 0;
          envelopeRunRemaining = 0;
          selectedEnvelope = null;
          for (envelopeKey = 0; envelopeKey < 128; envelopeKey++) {
            if (0 != this.sampleIds[envelopeKey]) {
              if (envelopeRunRemaining == 0) {
                selectedEnvelope = envelopeTable[allocatedEnvelopeMap[envelopeRunIndex]];
                if (envelopeRunIndex < allocatedEnvelopeRuns.length) {
                  envelopeRunRemaining = envelopeRuns[envelopeRunIndex++];
                } else {
                  envelopeRunRemaining = -1;
                }
              }
              this.envelopes[envelopeKey] = (MusicPatchEnvelope) (selectedEnvelope);
              envelopeRunRemaining--;
            }
          }
          gainRunIndex = 0;
          gainRunRemaining = 0;
          gainValue = 0;
          for (gainKey = 0; gainKey < 128; gainKey++) {
            if (gainRunRemaining == 0) {
              if (gainRunIndex >= allocatedSampleRuns.length) {
                gainRunRemaining = -1;
              } else {
                gainRunRemaining = sampleRuns[gainRunIndex++];
              }
              if (this.sampleIds[gainKey] > 0) {
                gainValue = input.readUnsignedByte(0) + 1;
              }
            }
            this.noteGains[gainKey] = (byte)gainValue;
            gainRunRemaining--;
          }
          this.globalGain = input.readUnsignedByte(0) + 1;
          for (envelopeLevelsIndex = 0; envelopeLevelsIndex < envelopeCount; envelopeLevelsIndex++) {
            envelopeForLevels = envelopeTable[envelopeLevelsIndex];
            if (null != envelopeForLevels.volumeEnvelope) {
              for (volumeLevelIndex = 1; volumeLevelIndex < envelopeForLevels.volumeEnvelope.length; volumeLevelIndex += 2) {
                envelopeForLevels.volumeEnvelope[volumeLevelIndex] = input.readByte((byte) -89);
              }
            }
            if (null != envelopeForLevels.releaseEnvelope) {
              for (releaseLevelIndex = 3; releaseLevelIndex < envelopeForLevels.releaseEnvelope.length - 2; releaseLevelIndex += 2) {
                envelopeForLevels.releaseEnvelope[releaseLevelIndex] = input.readByte((byte) 103);
              }
            }
          }
          if (null != gainCurve) {
            for (gainCurveLevelIndex = 1; gainCurveLevelIndex < gainCurveAlias.length; gainCurveLevelIndex += 2) {
              gainCurve[gainCurveLevelIndex] = input.readByte((byte) 111);
            }
          }
          if (panCurve != null) {
            for (panCurveLevelIndex = 1; allocatedPanCurveAlias.length > panCurveLevelIndex; panCurveLevelIndex += 2) {
              panCurve[panCurveLevelIndex] = input.readByte((byte) 116);
            }
          }
          for (releaseTimesEnvelopeIndex = 0; envelopeCount > releaseTimesEnvelopeIndex; releaseTimesEnvelopeIndex++) {
            envelopeForReleaseTimes = envelopeTable[releaseTimesEnvelopeIndex];
            if (null != envelopeForReleaseTimes.releaseEnvelope) {
              releaseTimeAccumulator = 0;
              for (releaseTimeIndex = 2; releaseTimeIndex < envelopeForReleaseTimes.releaseEnvelope.length; releaseTimeIndex += 2) {
                releaseTimeAccumulator = 1 + releaseTimeAccumulator + input.readUnsignedByte(0);
                envelopeForReleaseTimes.releaseEnvelope[releaseTimeIndex] = (byte)releaseTimeAccumulator;
              }
            }
          }
          for (volumeTimesEnvelopeIndex = 0; volumeTimesEnvelopeIndex < envelopeCount; volumeTimesEnvelopeIndex++) {
            envelopeForVolumeTimes = envelopeTable[volumeTimesEnvelopeIndex];
            if (null != envelopeForVolumeTimes.volumeEnvelope) {
              volumeTimeAccumulator = 0;
              for (volumeTimeIndex = 2; volumeTimeIndex < envelopeForVolumeTimes.volumeEnvelope.length; volumeTimeIndex += 2) {
                volumeTimeAccumulator = input.readUnsignedByte(0) + (1 + volumeTimeAccumulator);
                envelopeForVolumeTimes.volumeEnvelope[volumeTimeIndex] = (byte)volumeTimeAccumulator;
              }
            }
          }
          if (gainCurve != null) {
            gainCurveKeyAccumulator = input.readUnsignedByte(0);
            gainCurve[0] = (byte)gainCurveKeyAccumulator;
            for (gainCurveTimeIndex = 2; gainCurveTimeIndex < gainCurveAlias.length; gainCurveTimeIndex += 2) {
              gainCurveKeyAccumulator = gainCurveKeyAccumulator + 1 + input.readUnsignedByte(0);
              gainCurve[gainCurveTimeIndex] = (byte)gainCurveKeyAccumulator;
            }
            currentGainCurveKey = gainCurveAlias[0];
            gainCurveLevel = gainCurveAlias[1];
            for (gainPrefixKey = 0; currentGainCurveKey > gainPrefixKey; gainPrefixKey++) {
              this.noteGains[gainPrefixKey] = (byte)(32 + gainCurveLevel * this.noteGains[gainPrefixKey] >> 6);
            }
            for (gainCurveSegmentIndex = 2; gainCurveSegmentIndex < gainCurveAlias.length; gainCurveSegmentIndex += 2) {
              nextGainCurveKey = gainCurveAlias[gainCurveSegmentIndex];
              nextGainCurveLevel = gainCurve[1 + gainCurveSegmentIndex];
              gainInterpolationNumerator = (-currentGainCurveKey + nextGainCurveKey) * gainCurveLevel + (-currentGainCurveKey + nextGainCurveKey) / 2;
              for (gainInterpolationKey = currentGainCurveKey; nextGainCurveKey > gainInterpolationKey; gainInterpolationKey++) {
                interpolatedGainLevel = MusicPatchPcmStream.floorDivide(-currentGainCurveKey + nextGainCurveKey, gainInterpolationNumerator, 1589591487);
                gainInterpolationNumerator = gainInterpolationNumerator + (nextGainCurveLevel - gainCurveLevel);
                this.noteGains[gainInterpolationKey] = (byte)(32 + interpolatedGainLevel * this.noteGains[gainInterpolationKey] >> 6);
              }
              gainCurveLevel = nextGainCurveLevel;
              currentGainCurveKey = nextGainCurveKey;
            }
            for (gainSuffixKey = currentGainCurveKey; gainSuffixKey < 128; gainSuffixKey++) {
              this.noteGains[gainSuffixKey] = (byte)(32 + this.noteGains[gainSuffixKey] * gainCurveLevel >> 6);
            }
            gainCurve = null;
          }
          if (null != panCurve) {
            panCurveKeyAccumulator = input.readUnsignedByte(0);
            panCurve[0] = (byte)panCurveKeyAccumulator;
            for (panCurveTimeIndex = 2; allocatedPanCurveAlias.length > panCurveTimeIndex; panCurveTimeIndex += 2) {
              panCurveKeyAccumulator = panCurveKeyAccumulator + 1 + input.readUnsignedByte(0);
              panCurve[panCurveTimeIndex] = (byte)panCurveKeyAccumulator;
            }
            currentPanCurveKey = allocatedPanCurveAlias[0];
            panCurveOffset = allocatedPanCurveAlias[1] << 1;
            for (panPrefixKey = 0; panPrefixKey < currentPanCurveKey; panPrefixKey++) {
              adjustedPrefixPan = panCurveOffset + (255 & this.notePans[panPrefixKey]);
              if (adjustedPrefixPan < 0) {
                adjustedPrefixPan = 0;
              }
              if (adjustedPrefixPan > 128) {
                adjustedPrefixPan = 128;
              }
              this.notePans[panPrefixKey] = (byte)adjustedPrefixPan;
            }
            panCurveSegmentIndex = 2;
            while (panCurveSegmentIndex < allocatedPanCurveAlias.length) {
              nextPanCurveKey = allocatedPanCurveAlias[panCurveSegmentIndex];
              nextPanCurveOffset = panCurve[panCurveSegmentIndex + 1] << 1;
              panInterpolationNumerator = (-currentPanCurveKey + nextPanCurveKey) / 2 + panCurveOffset * (-currentPanCurveKey + nextPanCurveKey);
              panInterpolationKey = currentPanCurveKey;
              unusedPanInterpolationKey = panInterpolationKey;
              while (panInterpolationKey < nextPanCurveKey) {
                interpolatedPanOffset = MusicPatchPcmStream.floorDivide(-currentPanCurveKey + nextPanCurveKey, panInterpolationNumerator, 1589591487);
                adjustedPan = interpolatedPanOffset + (255 & this.notePans[panInterpolationKey]);
                if (adjustedPan < 0) {
                  adjustedPan = 0;
                }
                if (128 < adjustedPan) {
                  adjustedPan = 128;
                }
                this.notePans[panInterpolationKey] = (byte)adjustedPan;
                panInterpolationNumerator = panInterpolationNumerator + (nextPanCurveOffset - panCurveOffset);
                panInterpolationKey++;
              }
              panCurveSegmentIndex += 2;
              panCurveOffset = nextPanCurveOffset;
              currentPanCurveKey = nextPanCurveKey;
            }
            panCurve = null;
            for (panSuffixKey = currentPanCurveKey; panSuffixKey < 128; panSuffixKey++) {
              adjustedSuffixPan = panCurveOffset + (this.notePans[panSuffixKey] & 255);
              if (adjustedSuffixPan < 0) {
                adjustedSuffixPan = 0;
              }
              if (adjustedSuffixPan > 128) {
                adjustedSuffixPan = 128;
              }
              this.notePans[panSuffixKey] = (byte)adjustedSuffixPan;
            }
          }
          for (decayEnvelopeIndex = 0; envelopeCount > decayEnvelopeIndex; decayEnvelopeIndex++) {
            envelopeTable[decayEnvelopeIndex].decayRate = input.readUnsignedByte(0);
          }
          for (keyScalingEnvelopeIndex = 0; keyScalingEnvelopeIndex < envelopeCount; keyScalingEnvelopeIndex++) {
            envelopeForKeyScaling = envelopeTable[keyScalingEnvelopeIndex];
            if (envelopeForKeyScaling.volumeEnvelope != null) {
              envelopeForKeyScaling.volumeKeyScaling = input.readUnsignedByte(0);
            }
            if (null != envelopeForKeyScaling.releaseEnvelope) {
              envelopeForKeyScaling.releaseKeyScaling = input.readUnsignedByte(0);
            }
            if (0 < envelopeForKeyScaling.decayRate) {
              envelopeForKeyScaling.decayKeyScaling = input.readUnsignedByte(0);
            }
          }
          for (vibratoRateEnvelopeIndex = 0; envelopeCount > vibratoRateEnvelopeIndex; vibratoRateEnvelopeIndex++) {
            envelopeTable[vibratoRateEnvelopeIndex].vibratoRate = input.readUnsignedByte(0);
          }
          for (vibratoDepthEnvelopeIndex = 0; vibratoDepthEnvelopeIndex < envelopeCount; vibratoDepthEnvelopeIndex++) {
            envelopeForVibratoDepth = envelopeTable[vibratoDepthEnvelopeIndex];
            if (envelopeForVibratoDepth.vibratoRate > 0) {
              envelopeForVibratoDepth.vibratoDepth = input.readUnsignedByte(0);
            }
          }
          for (vibratoDelayEnvelopeIndex = 0; vibratoDelayEnvelopeIndex < envelopeCount; vibratoDelayEnvelopeIndex++) {
            envelopeForVibratoDelay = envelopeTable[vibratoDelayEnvelopeIndex];
            if (envelopeForVibratoDelay.vibratoDepth > 0) {
              envelopeForVibratoDelay.vibratoDelay = input.readUnsignedByte(0);
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("io.<init>(");
          if (packedPatch == null) {
            patchDescription = "null";
          } else {
            patchDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(patchDescription).append(')').toString());
        }
    }

    static {
        field_u = "This <%0> is currently carrying the <%2>. Are you sure you wish to replace it with the <%1>? The <%2> will be lost forever if you do this.";
        field_p = "Open";
        field_o = "Play Campaign";
    }
}
