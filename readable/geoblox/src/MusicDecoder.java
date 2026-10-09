/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class MusicDecoder extends IntrusiveNode {
    private boolean pingPongLoop;
    private static int[] longBitReverseIndices;
    private static VorbisResidue[] residues;
    private int sampleCount;
    private static int[] shortBitReverseIndices;
    static VorbisCodebook[] codebooks;
    private static int shortBlockSize;
    private static float[] workBlock;
    private static boolean[] modeLongBlockFlags;
    private static float[] longMdctTrigB;
    private boolean previousFloorAbsent;
    private static int bitCursor;
    private static int byteCursor;
    private static VorbisMapping[] mappings;
    private static float[] shortMdctTrigB;
    private static float[] shortMdctTrigC;
    private int previousRightWindowLength;
    private int pcmWriteCursor;
    private static float[] longMdctTrigA;
    private byte[] pcmBytes;
    private float[] previousBlock;
    private static int[] modeMappingIndices;
    private static float[] shortMdctTrigA;
    private static int longBlockSize;
    private int loopStart;
    private byte[][] packets;
    private static MusicDecodeStage[] floors;
    private static float[] longMdctTrigC;
    private static boolean setupLoaded;
    private int sampleRateHz;
    private static byte[] bitstreamBytes;
    private int previousBlockSize;
    private int packetCursor;
    private int loopEnd;

    private final static void setBitInput(byte[] inputBytes, int startByte) {
        bitstreamBytes = inputBytes;
        byteCursor = startByte;
        bitCursor = 0;
    }

    final static float unpackVorbisFloat(int packedValue) {
        int mantissa = packedValue & 2097151;
        int signBit = packedValue & -2147483648;
        int exponent = (packedValue & 2145386496) >> 21;
        if (signBit != 0) {
            mantissa = -mantissa;
        }
        return (float)((double)mantissa * Math.pow(2.0, (double)(exponent - 788)));
    }

    final static MusicDecoder loadById(ResourceArchive archive, int groupId, int fileId) {
        try {
            MusicDecoder decoderBeforeReturn = null;
            if (!MusicDecoder.ensureSetupLoaded(archive)) {
                archive.isFileAvailable((byte) 37, groupId, fileId);
                return null;
            }
            byte[] containerBytes = archive.getFile(groupId, -28153, fileId);
            if (containerBytes == null) {
                return null;
            }
            Object unusedNullDecoderSnapshot = null;
            try {
                decoderBeforeReturn = new MusicDecoder(containerBytes);
            } catch (IOException containerReadFailure) {
                containerReadFailure.printStackTrace();
            }
            return decoderBeforeReturn;
        } catch (RuntimeException | Error uncheckedLoadFailure) {
            throw uncheckedLoadFailure;
        } catch (Throwable checkedLoadFailure) {
            throw new RuntimeException(checkedLoadFailure);
        }
    }

    final PcmSample decodePcmBudgeted(int[] sampleBudget) {
        int sampleIndex = 0;
        int pcmIndexBeforeIncrement = 0;
        int writePosition;
        int samplesToWrite;
        int unsignedPcmSample;
        float[] decodedSamples;
        byte[] completedPcm;
        if (sampleBudget != null &&
            sampleBudget[0] <= 0) {
          return null;
        }
        if (this.pcmBytes == null) {
          this.previousBlockSize = 0;
          this.previousBlock = new float[longBlockSize];
          this.pcmBytes = new byte[this.sampleCount];
          this.pcmWriteCursor = 0;
          this.packetCursor = 0;
        }
        while (this.packetCursor < this.packets.length) {
          if (sampleBudget != null &&
              sampleBudget[0] <= 0) {
            return null;
          }
          decodedSamples = this.decodePacket(this.packetCursor);
          if (decodedSamples != null) {
            writePosition = this.pcmWriteCursor;
            samplesToWrite = decodedSamples.length;
            if (samplesToWrite > this.sampleCount - writePosition) {
              samplesToWrite = this.sampleCount - writePosition;
            }
            for (sampleIndex = 0; sampleIndex < samplesToWrite; sampleIndex++) {
              unsignedPcmSample = (int)(128.0f + decodedSamples[sampleIndex] * 128.0f);
              if ((unsignedPcmSample & -256) != 0) {
                unsignedPcmSample = ~unsignedPcmSample >> 31;
              }
              pcmIndexBeforeIncrement = writePosition;
              writePosition++;
              this.pcmBytes[pcmIndexBeforeIncrement] = (byte)(unsignedPcmSample - 128);
            }
            if (sampleBudget != null) {
              sampleBudget[0] = sampleBudget[0] - (writePosition - this.pcmWriteCursor);
            }
            this.pcmWriteCursor = writePosition;
          }
          this.packetCursor = this.packetCursor + 1;
        }
        this.previousBlock = null;
        completedPcm = this.pcmBytes;
        this.pcmBytes = null;
        return new PcmSample(this.sampleRateHz, completedPcm, this.loopStart, this.loopEnd, this.pingPongLoop);
    }

    final static int readBit() {
        int bitValue = bitstreamBytes[byteCursor] >> bitCursor & 1;
        bitCursor = bitCursor + 1;
        byteCursor = byteCursor + (bitCursor >> 3);
        bitCursor = bitCursor & 7;
        return bitValue;
    }

    final static int readBits(int bitCount) {
        int chunkMask = 0;
        int chunkBitsThenMask = 0;
        int value = 0;
        int outputShift = 0;
        int chunkBitsThenMaskLiteralPhase1;
        while (bitCount >= 8 - bitCursor) {
            chunkBitsThenMask = 8 - bitCursor;
            chunkMask = (1 << chunkBitsThenMask) - 1;
            value = value + ((bitstreamBytes[byteCursor] >> bitCursor & chunkMask) << outputShift);
            bitCursor = 0;
            byteCursor = byteCursor + 1;
            outputShift = outputShift + chunkBitsThenMask;
            bitCount = bitCount - chunkBitsThenMask;
        }
        if (bitCount > 0) {
            chunkBitsThenMaskLiteralPhase1 = (1 << bitCount) - 1;
            value = value + ((bitstreamBytes[byteCursor] >> bitCursor & chunkBitsThenMaskLiteralPhase1) << outputShift);
            bitCursor = bitCursor + bitCount;
        }
        return value;
    }

    final static MusicDecoder loadByName(ResourceArchive archive, String groupName, String fileName) {
        try {
            MusicDecoder decoderBeforeReturn = null;
            if (!MusicDecoder.ensureSetupLoaded(archive)) {
                archive.isNamedFileAvailable((byte) 113, fileName, groupName);
                return null;
            }
            byte[] containerBytes = archive.getNamedFile(0, fileName, groupName);
            if (containerBytes == null) {
                return null;
            }
            Object unusedNullDecoderSnapshot = null;
            try {
                decoderBeforeReturn = new MusicDecoder(containerBytes);
            } catch (IOException containerReadFailure) {
                containerReadFailure.printStackTrace();
            }
            return decoderBeforeReturn;
        } catch (RuntimeException | Error uncheckedLoadFailure) {
            throw uncheckedLoadFailure;
        } catch (Throwable checkedLoadFailure) {
            throw new RuntimeException(checkedLoadFailure);
        }
    }

    private final void readPacketContainer(byte[] containerBytes) throws IOException {
        int packetIndex = 0;
        int packetLength = 0;
        int lengthChunk = 0;
        byte[] packetBytes = null;
        ByteArrayBuffer containerBuffer = new ByteArrayBuffer(containerBytes);
        this.sampleRateHz = containerBuffer.readIntBE((byte) -53);
        this.sampleCount = containerBuffer.readIntBE((byte) -128);
        this.loopStart = containerBuffer.readIntBE((byte) -128);
        this.loopEnd = containerBuffer.readIntBE((byte) -89);
        if (this.loopEnd < 0) {
            this.loopEnd = ~this.loopEnd;
            this.pingPongLoop = true;
        }
        int packetCount = containerBuffer.readIntBE((byte) -108);
        if (packetCount < 0) {
            throw new IOException();
        }
        this.packets = new byte[packetCount][];
        for (packetIndex = 0; packetIndex < packetCount; packetIndex++) {
            packetLength = 0;
            do {
                lengthChunk = containerBuffer.readUnsignedByte((byte) 34);
                packetLength = packetLength + lengthChunk;
            } while (lengthChunk >= 255);
            packetBytes = new byte[packetLength];
            containerBuffer.readBytes(29915, packetLength, packetBytes, 0);
            this.packets[packetIndex] = packetBytes;
        }
    }

    final PcmSample decodePcm() {
        int sampleIndex = 0;
        int pcmIndexBeforeIncrement = 0;
        byte[] decodedPcmBytes;
        int pcmWritePosition;
        int packetIndex;
        float[] decodedSamples;
        int samplesToWrite;
        int unsignedPcmSample;
        this.previousBlockSize = 0;
        this.previousBlock = new float[longBlockSize];
        decodedPcmBytes = new byte[this.sampleCount];
        pcmWritePosition = 0;
        packetIndex = 0;
        while (true) {
          if (packetIndex >= this.packets.length) {
            this.previousBlock = null;
            return new PcmSample(this.sampleRateHz, decodedPcmBytes, this.loopStart, this.loopEnd, this.pingPongLoop);
          }
          decodedSamples = this.decodePacket(packetIndex);
          if (decodedSamples == null) {
            packetIndex++;
            continue;
          }
          samplesToWrite = decodedSamples.length;
          if (samplesToWrite > this.sampleCount - pcmWritePosition) {
            samplesToWrite = this.sampleCount - pcmWritePosition;
          }
          for (sampleIndex = 0; sampleIndex < samplesToWrite; sampleIndex++) {
            unsignedPcmSample = (int)(128.0f + decodedSamples[sampleIndex] * 128.0f);
            if ((unsignedPcmSample & -256) != 0) {
              unsignedPcmSample = ~unsignedPcmSample >> 31;
            }
            pcmIndexBeforeIncrement = pcmWritePosition;
            pcmWritePosition++;
            decodedPcmBytes[pcmIndexBeforeIncrement] = (byte)(unsignedPcmSample - 128);
          }
          packetIndex++;
        }
    }

    final static void decodeSetup(byte[] setupBytes) {
        int trigAIndex = 0;
        int trigBIndex = 0;
        int trigCIndex = 0;
        int bitReverseIndex = 0;
        int modeIndex = 0;
        int blockSizeBeforeStore = 0;
        boolean[] modeFlagsArray = null;
        int modeFlagIndex = 0;
        boolean modeLongBlockBeforeStore = false;
        int blockSizeKind;
        int blockSize;
        int halfBlockSize;
        int quarterBlockSize;
        int eighthBlockSize;
        float[] mdctTrigA;
        float[] mdctTrigB;
        float[] mdctTrigC;
        int[] bitReverseIndices;
        int bitReverseWidth;
        int codebookCount;
        int codebookIndex;
        int timeConfigurationCount;
        int floorCount;
        int timeConfigurationIndex;
        int floorIndex;
        int residueCount;
        int residueIndex;
        int mappingCount;
        int mappingIndex;
        int modeCount;
        MusicDecoder.setBitInput(setupBytes, 0);
        shortBlockSize = 1 << MusicDecoder.readBits(4);
        longBlockSize = 1 << MusicDecoder.readBits(4);
        workBlock = new float[longBlockSize];
        for (blockSizeKind = 0; blockSizeKind < 2; blockSizeKind++) {
          if (blockSizeKind == 0) {
            blockSizeBeforeStore = shortBlockSize;
          } else {
            blockSizeBeforeStore = longBlockSize;
          }
          blockSize = blockSizeBeforeStore;
          halfBlockSize = blockSize >> 1;
          quarterBlockSize = blockSize >> 2;
          eighthBlockSize = blockSize >> 3;
          mdctTrigA = new float[halfBlockSize];
          for (trigAIndex = 0; trigAIndex < quarterBlockSize; trigAIndex++) {
            mdctTrigA[2 * trigAIndex] = (float)Math.cos((double)(4 * trigAIndex) * 3.141592653589793 / (double)blockSize);
            mdctTrigA[2 * trigAIndex + 1] = -(float)Math.sin((double)(4 * trigAIndex) * 3.141592653589793 / (double)blockSize);
          }
          mdctTrigB = new float[halfBlockSize];
          for (trigBIndex = 0; trigBIndex < quarterBlockSize; trigBIndex++) {
            mdctTrigB[2 * trigBIndex] = (float)Math.cos((double)(2 * trigBIndex + 1) * 3.141592653589793 / (double)(2 * blockSize));
            mdctTrigB[2 * trigBIndex + 1] = (float)Math.sin((double)(2 * trigBIndex + 1) * 3.141592653589793 / (double)(2 * blockSize));
          }
          mdctTrigC = new float[quarterBlockSize];
          for (trigCIndex = 0; trigCIndex < eighthBlockSize; trigCIndex++) {
            mdctTrigC[2 * trigCIndex] = (float)Math.cos((double)(4 * trigCIndex + 2) * 3.141592653589793 / (double)blockSize);
            mdctTrigC[2 * trigCIndex + 1] = -(float)Math.sin((double)(4 * trigCIndex + 2) * 3.141592653589793 / (double)blockSize);
          }
          bitReverseIndices = new int[eighthBlockSize];
          bitReverseWidth = SpriteConstructionSupport.unsignedBitLength((byte) 58, eighthBlockSize - 1);
          for (bitReverseIndex = 0; bitReverseIndex < eighthBlockSize; bitReverseIndex++) {
            bitReverseIndices[bitReverseIndex] = TextValidationFailure.reverseLowBitsIntoAccumulator(bitReverseIndex, 0, bitReverseWidth);
          }
          if (blockSizeKind == 0) {
            shortMdctTrigA = mdctTrigA;
            shortMdctTrigB = mdctTrigB;
            shortMdctTrigC = mdctTrigC;
            shortBitReverseIndices = bitReverseIndices;
            continue;
          }
          longMdctTrigA = mdctTrigA;
          longMdctTrigB = mdctTrigB;
          longMdctTrigC = mdctTrigC;
          longBitReverseIndices = bitReverseIndices;
        }
        codebookCount = MusicDecoder.readBits(8) + 1;
        codebooks = new VorbisCodebook[codebookCount];
        for (codebookIndex = 0; codebookIndex < codebookCount; codebookIndex++) {
          codebooks[codebookIndex] = new VorbisCodebook();
        }
        timeConfigurationCount = MusicDecoder.readBits(6) + 1;
        for (timeConfigurationIndex = 0; timeConfigurationIndex < timeConfigurationCount; timeConfigurationIndex++) {
          MusicDecoder.readBits(16);
        }
        floorCount = MusicDecoder.readBits(6) + 1;
        floors = new MusicDecodeStage[floorCount];
        for (floorIndex = 0; floorIndex < floorCount; floorIndex++) {
          floors[floorIndex] = new MusicDecodeStage();
        }
        residueCount = MusicDecoder.readBits(6) + 1;
        residues = new VorbisResidue[residueCount];
        for (residueIndex = 0; residueIndex < residueCount; residueIndex++) {
          residues[residueIndex] = new VorbisResidue();
        }
        mappingCount = MusicDecoder.readBits(6) + 1;
        mappings = new VorbisMapping[mappingCount];
        for (mappingIndex = 0; mappingIndex < mappingCount; mappingIndex++) {
          mappings[mappingIndex] = new VorbisMapping();
        }
        modeCount = MusicDecoder.readBits(6) + 1;
        modeLongBlockFlags = new boolean[modeCount];
        modeMappingIndices = new int[modeCount];
        for (modeIndex = 0; modeIndex < modeCount; modeIndex++) {
          modeFlagsArray = (boolean[]) (modeLongBlockFlags);
          modeFlagIndex = modeIndex;
          modeLongBlockBeforeStore = !(MusicDecoder.readBit() == 0);
          modeFlagsArray[modeFlagIndex] = modeLongBlockBeforeStore;
          MusicDecoder.readBits(16);
          MusicDecoder.readBits(16);
          modeMappingIndices[modeIndex] = MusicDecoder.readBits(8);
        }
        setupLoaded = true;
    }

    public static void releaseSharedDecoderResources() {
        bitstreamBytes = null;
        codebooks = null;
        floors = null;
        residues = null;
        mappings = null;
        modeLongBlockFlags = null;
        modeMappingIndices = null;
        workBlock = null;
        shortMdctTrigA = null;
        shortMdctTrigB = null;
        shortMdctTrigC = null;
        longMdctTrigA = null;
        longMdctTrigB = null;
        longMdctTrigC = null;
        shortBitReverseIndices = null;
        longBitReverseIndices = null;
    }

    private final float[] decodePacket(int packetIndex) {
        int butterflyIndex = 0;
        int blockSizeBeforeStore = 0;
        int previousWindowFlagBeforeStore = 0;
        int nextWindowFlagBeforeStore = 0;
        int floorAbsentBeforeStore = 0;
        float[] trigABeforeStore = null;
        float[] trigBBeforeStore = null;
        float[] trigCBeforeStore = null;
        int[] bitReverseBeforeStore = null;
        boolean previousFloorAbsentBeforeStore = false;
        int modeIndex;
        int longBlockValue;
        int blockSize;
        int previousWindowLongValue;
        int nextWindowLongValue;
        int halfBlockSizeForWindow;
        int leftWindowStart;
        int leftWindowEnd;
        int leftWindowLength;
        int rightWindowStart;
        int rightWindowEnd;
        int rightWindowLength;
        VorbisMapping mapping;
        int floorAbsentValue;
        int muxOrResidueSkipValue;
        int floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize;
        Object overlapResult;
        int floorIndex;
        float[] recycledPreviousBlock;
        int eighthBlockSizeOrOverlapIndex;
        float[] transformBlockAlias;
        int overlapSourceOrDestinationIndex;
        int scalingIndexOrUnusedMirrorCursorSnapshot;
        float[] mdctTrigA;
        float[] mdctTrigB;
        float[] mdctTrigC;
        int[] unusedBitReverseAlias;
        int rotationIndexOrTransformBitWidth;
        int butterflyStageOrReorderOrWindowIndex;
        float rotationDifferenceOrButterflyUpperA;
        float rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine;
        int butterflySpanOrBitReversePartner;
        float rotationCosineOrButterflyLowerAOrPostRotationNegativeSine;
        int trigStrideOrSwapBase;
        float rotationNegativeSineOrButterflyLowerBOrPostRotationUpperA;
        int butterflyGroupOrSwapPartnerBase;
        float butterflyCosineOrSwapSampleOrPostRotationUpperB;
        int butterflyUpperBase;
        float butterflyNegativeSineOrPostRotationLowerA;
        int butterflyLowerBase;
        float postRotationLowerB;
        float postRotationMix;
        int butterflyOffset;
        float butterflyUpperA;
        float butterflyUpperB;
        float butterflyLowerA;
        float butterflyLowerB;
        float butterflyCosine;
        float butterflyNegativeSine;
        float[] overlapSamplesAlias;
        int mirrorFillIndex;
        VorbisResidue residue;
        int[] intermediateUnusedBitReverseAlias;
        float[] intermediateTransformBlockAlias;
        float[] intermediateOverlapSamplesAlias;
        int[] bitReverseIndices;
        float[] sharedWorkBlockAlias;
        float[] allocatedOverlapSamples;
        float[] residueWorkBlockAlias;
        int muxOrResidueSkipValuePhase2;
        int floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase2;
        int floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase3;
        int floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4;
        int eighthBlockSizeOrOverlapIndexPhase2;
        int overlapSourceOrDestinationIndexNestedPhase2;
        int scalingIndexOrUnusedMirrorCursorSnapshotNestedPhase2;
        int rotationIndexOrTransformBitWidthNestedPhase2;
        int rotationIndexOrTransformBitWidthNestedPhase3;
        int butterflyStageOrReorderOrWindowIndexNestedPhase2;
        int butterflyStageOrReorderOrWindowIndexNestedPhase3;
        int butterflyStageOrReorderOrWindowIndexNestedPhase4;
        int butterflyStageOrReorderOrWindowIndexNestedPhase5;
        int butterflyStageOrReorderOrWindowIndexNestedPhase6;
        int butterflyStageOrReorderOrWindowIndexNestedPhase7;
        int butterflyStageOrReorderOrWindowIndexNestedPhase8;
        int butterflyStageOrReorderOrWindowIndexNestedPhase9;
        int butterflyStageOrReorderOrWindowIndexNestedPhase10;
        int butterflyStageOrReorderOrWindowIndexNestedPhase11;
        int butterflyStageOrReorderOrWindowIndexNestedPhase12;
        float rotationDifferenceOrButterflyUpperANestedPhase2;
        float rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSineNestedPhase2;
        float rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSineNestedPhase3;
        float rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSineNestedPhase4;
        float rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSineNestedPhase5;
        int butterflySpanOrBitReversePartnerNestedPhase2;
        float rotationCosineOrButterflyLowerAOrPostRotationNegativeSineNestedPhase2;
        float rotationCosineOrButterflyLowerAOrPostRotationNegativeSineNestedPhase3;
        int trigStrideOrSwapBaseNestedPhase2;
        float rotationNegativeSineOrButterflyLowerBOrPostRotationUpperANestedPhase2;
        float rotationNegativeSineOrButterflyLowerBOrPostRotationUpperANestedPhase3;
        int butterflyGroupOrSwapPartnerBaseNestedPhase2;
        float butterflyCosineOrSwapSampleOrPostRotationUpperBNestedPhase2;
        float butterflyCosineOrSwapSampleOrPostRotationUpperBNestedPhase3;
        float butterflyNegativeSineOrPostRotationLowerANestedPhase2;
        float postRotationMixNestedPhase2;
        int eighthBlockSizeOrOverlapIndexPhase2NestedPhase2;
        float butterflyCosineOrSwapSampleOrPostRotationUpperBNestedPhase2LiteralPhase1;
        float butterflyCosineOrSwapSampleOrPostRotationUpperBNestedPhase2LiteralPhase2;
        float butterflyCosineOrSwapSampleOrPostRotationUpperBNestedPhase2LiteralPhase3;
        int quarterBlockSize;
        int overlapSampleCount;
        MusicDecoder.setBitInput(this.packets[packetIndex], 0);
        MusicDecoder.readBit();
        modeIndex = MusicDecoder.readBits(SpriteConstructionSupport.unsignedBitLength((byte) 58, modeMappingIndices.length - 1));
        longBlockValue = modeLongBlockFlags[modeIndex] ? 1 : 0;
        if (longBlockValue == 0) {
          blockSizeBeforeStore = shortBlockSize;
        } else {
          blockSizeBeforeStore = longBlockSize;
        }
        blockSize = blockSizeBeforeStore;
        previousWindowLongValue = 0;
        nextWindowLongValue = 0;
        if (longBlockValue != 0) {
          previousWindowFlagBeforeStore = (MusicDecoder.readBit() == 0) ? 0 : 1;
          previousWindowLongValue = previousWindowFlagBeforeStore;
          nextWindowFlagBeforeStore = (MusicDecoder.readBit() == 0) ? 0 : 1;
          nextWindowLongValue = nextWindowFlagBeforeStore;
        }
        halfBlockSizeForWindow = blockSize >> 1;
        if (longBlockValue != 0 &&
            previousWindowLongValue == 0) {
          leftWindowStart = (blockSize >> 2) - (shortBlockSize >> 2);
          leftWindowEnd = (blockSize >> 2) + (shortBlockSize >> 2);
          leftWindowLength = shortBlockSize >> 1;
        } else {
          leftWindowStart = 0;
          leftWindowEnd = halfBlockSizeForWindow;
          leftWindowLength = blockSize >> 1;
        }
        if (longBlockValue != 0 &&
            nextWindowLongValue == 0) {
          rightWindowStart = blockSize - (blockSize >> 2) - (shortBlockSize >> 2);
          rightWindowEnd = blockSize - (blockSize >> 2) + (shortBlockSize >> 2);
          rightWindowLength = shortBlockSize >> 1;
        } else {
          rightWindowStart = halfBlockSizeForWindow;
          rightWindowEnd = blockSize;
          rightWindowLength = blockSize >> 1;
        }
        mapping = mappings[modeMappingIndices[modeIndex]];
        muxOrResidueSkipValue = mapping.mux;
        floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize = mapping.floorIndices[muxOrResidueSkipValue];
        floorAbsentBeforeStore = (floors[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize].decodeFloorPacket()) ? 0 : 1;
        floorAbsentValue = floorAbsentBeforeStore;
        muxOrResidueSkipValuePhase2 = floorAbsentValue;
        for (floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase2 = 0; floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase2 < mapping.submapCount; floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase2++) {
          residue = residues[mapping.residueIndices[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase2]];
          residueWorkBlockAlias = workBlock;
          residue.decodeResidue(residueWorkBlockAlias, blockSize >> 1, muxOrResidueSkipValuePhase2 != 0);
        }
        if (floorAbsentValue == 0) {
          floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase3 = mapping.mux;
          floorIndex = mapping.floorIndices[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase3];
          floors[floorIndex].applyFloorCurve(workBlock, blockSize >> 1);
        }
        if (floorAbsentValue != 0) {
          for (floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4 = blockSize >> 1; floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4 < blockSize; floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4++) {
            workBlock[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4] = 0.0f;
          }
        } else {
          floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4 = blockSize >> 1;
          quarterBlockSize = blockSize >> 2;
          eighthBlockSizeOrOverlapIndex = blockSize >> 3;
          sharedWorkBlockAlias = workBlock;
          intermediateTransformBlockAlias = sharedWorkBlockAlias;
          transformBlockAlias = intermediateTransformBlockAlias;
          for (scalingIndexOrUnusedMirrorCursorSnapshot = 0; scalingIndexOrUnusedMirrorCursorSnapshot < floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4; scalingIndexOrUnusedMirrorCursorSnapshot++) {
            transformBlockAlias[scalingIndexOrUnusedMirrorCursorSnapshot] = transformBlockAlias[scalingIndexOrUnusedMirrorCursorSnapshot] * 0.5f;
          }
          mirrorFillIndex = floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4;
          scalingIndexOrUnusedMirrorCursorSnapshotNestedPhase2 = mirrorFillIndex;
          while (mirrorFillIndex < blockSize) {
            transformBlockAlias[mirrorFillIndex] = -transformBlockAlias[blockSize - mirrorFillIndex - 1];
            mirrorFillIndex++;
          }
          if (longBlockValue == 0) {
            trigABeforeStore = (float[]) (shortMdctTrigA);
          } else {
            trigABeforeStore = (float[]) (longMdctTrigA);
          }
          mdctTrigA = trigABeforeStore;
          if (longBlockValue == 0) {
            trigBBeforeStore = (float[]) (shortMdctTrigB);
          } else {
            trigBBeforeStore = (float[]) (longMdctTrigB);
          }
          mdctTrigB = trigBBeforeStore;
          if (longBlockValue == 0) {
            trigCBeforeStore = (float[]) (shortMdctTrigC);
          } else {
            trigCBeforeStore = (float[]) (longMdctTrigC);
          }
          mdctTrigC = trigCBeforeStore;
          if (longBlockValue == 0) {
            bitReverseBeforeStore = (int[]) (shortBitReverseIndices);
          } else {
            bitReverseBeforeStore = (int[]) (longBitReverseIndices);
          }
          bitReverseIndices = bitReverseBeforeStore;
          intermediateUnusedBitReverseAlias = bitReverseIndices;
          unusedBitReverseAlias = intermediateUnusedBitReverseAlias;
          for (rotationIndexOrTransformBitWidth = 0; rotationIndexOrTransformBitWidth < quarterBlockSize; rotationIndexOrTransformBitWidth++) {
            rotationDifferenceOrButterflyUpperA = transformBlockAlias[4 * rotationIndexOrTransformBitWidth] - transformBlockAlias[blockSize - 4 * rotationIndexOrTransformBitWidth - 1];
            rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine = transformBlockAlias[4 * rotationIndexOrTransformBitWidth + 2] - transformBlockAlias[blockSize - 4 * rotationIndexOrTransformBitWidth - 3];
            rotationCosineOrButterflyLowerAOrPostRotationNegativeSine = mdctTrigA[2 * rotationIndexOrTransformBitWidth];
            rotationNegativeSineOrButterflyLowerBOrPostRotationUpperA = mdctTrigA[2 * rotationIndexOrTransformBitWidth + 1];
            transformBlockAlias[blockSize - 4 * rotationIndexOrTransformBitWidth - 1] = rotationDifferenceOrButterflyUpperA * rotationCosineOrButterflyLowerAOrPostRotationNegativeSine - rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine * rotationNegativeSineOrButterflyLowerBOrPostRotationUpperA;
            transformBlockAlias[blockSize - 4 * rotationIndexOrTransformBitWidth - 3] = rotationDifferenceOrButterflyUpperA * rotationNegativeSineOrButterflyLowerBOrPostRotationUpperA + rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine * rotationCosineOrButterflyLowerAOrPostRotationNegativeSine;
          }
          for (rotationIndexOrTransformBitWidthNestedPhase2 = 0; rotationIndexOrTransformBitWidthNestedPhase2 < eighthBlockSizeOrOverlapIndex; rotationIndexOrTransformBitWidthNestedPhase2++) {
            rotationDifferenceOrButterflyUpperANestedPhase2 = transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4 + 3 + 4 * rotationIndexOrTransformBitWidthNestedPhase2];
            rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSineNestedPhase2 = transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4 + 1 + 4 * rotationIndexOrTransformBitWidthNestedPhase2];
            rotationCosineOrButterflyLowerAOrPostRotationNegativeSineNestedPhase2 = transformBlockAlias[4 * rotationIndexOrTransformBitWidthNestedPhase2 + 3];
            rotationNegativeSineOrButterflyLowerBOrPostRotationUpperANestedPhase2 = transformBlockAlias[4 * rotationIndexOrTransformBitWidthNestedPhase2 + 1];
            transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4 + 3 + 4 * rotationIndexOrTransformBitWidthNestedPhase2] = rotationDifferenceOrButterflyUpperANestedPhase2 + rotationCosineOrButterflyLowerAOrPostRotationNegativeSineNestedPhase2;
            transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4 + 1 + 4 * rotationIndexOrTransformBitWidthNestedPhase2] = rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSineNestedPhase2 + rotationNegativeSineOrButterflyLowerBOrPostRotationUpperANestedPhase2;
            butterflyCosineOrSwapSampleOrPostRotationUpperB = mdctTrigA[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4 - 4 - 4 * rotationIndexOrTransformBitWidthNestedPhase2];
            butterflyNegativeSineOrPostRotationLowerA = mdctTrigA[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4 - 3 - 4 * rotationIndexOrTransformBitWidthNestedPhase2];
            transformBlockAlias[4 * rotationIndexOrTransformBitWidthNestedPhase2 + 3] = (rotationDifferenceOrButterflyUpperANestedPhase2 - rotationCosineOrButterflyLowerAOrPostRotationNegativeSineNestedPhase2) * butterflyCosineOrSwapSampleOrPostRotationUpperB - (rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSineNestedPhase2 - rotationNegativeSineOrButterflyLowerBOrPostRotationUpperANestedPhase2) * butterflyNegativeSineOrPostRotationLowerA;
            transformBlockAlias[4 * rotationIndexOrTransformBitWidthNestedPhase2 + 1] = (rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSineNestedPhase2 - rotationNegativeSineOrButterflyLowerBOrPostRotationUpperANestedPhase2) * butterflyCosineOrSwapSampleOrPostRotationUpperB + (rotationDifferenceOrButterflyUpperANestedPhase2 - rotationCosineOrButterflyLowerAOrPostRotationNegativeSineNestedPhase2) * butterflyNegativeSineOrPostRotationLowerA;
          }
          rotationIndexOrTransformBitWidthNestedPhase3 = SpriteConstructionSupport.unsignedBitLength((byte) 58, blockSize - 1);
          for (butterflyStageOrReorderOrWindowIndex = 0; butterflyStageOrReorderOrWindowIndex < rotationIndexOrTransformBitWidthNestedPhase3 - 3; butterflyStageOrReorderOrWindowIndex++) {
            butterflySpanOrBitReversePartner = blockSize >> butterflyStageOrReorderOrWindowIndex + 2;
            trigStrideOrSwapBase = 8 << butterflyStageOrReorderOrWindowIndex;
            for (butterflyGroupOrSwapPartnerBase = 0; butterflyGroupOrSwapPartnerBase < 2 << butterflyStageOrReorderOrWindowIndex; butterflyGroupOrSwapPartnerBase++) {
              butterflyUpperBase = blockSize - butterflySpanOrBitReversePartner * 2 * butterflyGroupOrSwapPartnerBase;
              butterflyLowerBase = blockSize - butterflySpanOrBitReversePartner * (2 * butterflyGroupOrSwapPartnerBase + 1);
              for (butterflyIndex = 0; butterflyIndex < blockSize >> butterflyStageOrReorderOrWindowIndex + 4; butterflyIndex++) {
                butterflyOffset = 4 * butterflyIndex;
                butterflyUpperA = transformBlockAlias[butterflyUpperBase - 1 - butterflyOffset];
                butterflyUpperB = transformBlockAlias[butterflyUpperBase - 3 - butterflyOffset];
                butterflyLowerA = transformBlockAlias[butterflyLowerBase - 1 - butterflyOffset];
                butterflyLowerB = transformBlockAlias[butterflyLowerBase - 3 - butterflyOffset];
                transformBlockAlias[butterflyUpperBase - 1 - butterflyOffset] = butterflyUpperA + butterflyLowerA;
                transformBlockAlias[butterflyUpperBase - 3 - butterflyOffset] = butterflyUpperB + butterflyLowerB;
                butterflyCosine = mdctTrigA[butterflyIndex * trigStrideOrSwapBase];
                butterflyNegativeSine = mdctTrigA[butterflyIndex * trigStrideOrSwapBase + 1];
                transformBlockAlias[butterflyLowerBase - 1 - butterflyOffset] = (butterflyUpperA - butterflyLowerA) * butterflyCosine - (butterflyUpperB - butterflyLowerB) * butterflyNegativeSine;
                transformBlockAlias[butterflyLowerBase - 3 - butterflyOffset] = (butterflyUpperB - butterflyLowerB) * butterflyCosine + (butterflyUpperA - butterflyLowerA) * butterflyNegativeSine;
              }
            }
          }
          butterflyStageOrReorderOrWindowIndexNestedPhase2 = 1;
          while (true) {
            if (butterflyStageOrReorderOrWindowIndexNestedPhase2 < eighthBlockSizeOrOverlapIndex - 1) {
              butterflySpanOrBitReversePartnerNestedPhase2 = bitReverseIndices[butterflyStageOrReorderOrWindowIndexNestedPhase2];
              if (butterflyStageOrReorderOrWindowIndexNestedPhase2 >= butterflySpanOrBitReversePartnerNestedPhase2) {
                butterflyStageOrReorderOrWindowIndexNestedPhase2++;
                continue;
              }
              trigStrideOrSwapBaseNestedPhase2 = 8 * butterflyStageOrReorderOrWindowIndexNestedPhase2;
              butterflyGroupOrSwapPartnerBaseNestedPhase2 = 8 * butterflySpanOrBitReversePartnerNestedPhase2;
              butterflyCosineOrSwapSampleOrPostRotationUpperBNestedPhase2 = transformBlockAlias[trigStrideOrSwapBaseNestedPhase2 + 1];
              transformBlockAlias[trigStrideOrSwapBaseNestedPhase2 + 1] = transformBlockAlias[butterflyGroupOrSwapPartnerBaseNestedPhase2 + 1];
              transformBlockAlias[butterflyGroupOrSwapPartnerBaseNestedPhase2 + 1] = butterflyCosineOrSwapSampleOrPostRotationUpperBNestedPhase2;
              butterflyCosineOrSwapSampleOrPostRotationUpperBNestedPhase2LiteralPhase1 = transformBlockAlias[trigStrideOrSwapBaseNestedPhase2 + 3];
              transformBlockAlias[trigStrideOrSwapBaseNestedPhase2 + 3] = transformBlockAlias[butterflyGroupOrSwapPartnerBaseNestedPhase2 + 3];
              transformBlockAlias[butterflyGroupOrSwapPartnerBaseNestedPhase2 + 3] = butterflyCosineOrSwapSampleOrPostRotationUpperBNestedPhase2LiteralPhase1;
              butterflyCosineOrSwapSampleOrPostRotationUpperBNestedPhase2LiteralPhase2 = transformBlockAlias[trigStrideOrSwapBaseNestedPhase2 + 5];
              transformBlockAlias[trigStrideOrSwapBaseNestedPhase2 + 5] = transformBlockAlias[butterflyGroupOrSwapPartnerBaseNestedPhase2 + 5];
              transformBlockAlias[butterflyGroupOrSwapPartnerBaseNestedPhase2 + 5] = butterflyCosineOrSwapSampleOrPostRotationUpperBNestedPhase2LiteralPhase2;
              butterflyCosineOrSwapSampleOrPostRotationUpperBNestedPhase2LiteralPhase3 = transformBlockAlias[trigStrideOrSwapBaseNestedPhase2 + 7];
              transformBlockAlias[trigStrideOrSwapBaseNestedPhase2 + 7] = transformBlockAlias[butterflyGroupOrSwapPartnerBaseNestedPhase2 + 7];
              transformBlockAlias[butterflyGroupOrSwapPartnerBaseNestedPhase2 + 7] = butterflyCosineOrSwapSampleOrPostRotationUpperBNestedPhase2LiteralPhase3;
              butterflyStageOrReorderOrWindowIndexNestedPhase2++;
              continue;
            }
            break;
          }
          for (butterflyStageOrReorderOrWindowIndexNestedPhase3 = 0; butterflyStageOrReorderOrWindowIndexNestedPhase3 < floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4; butterflyStageOrReorderOrWindowIndexNestedPhase3++) {
            transformBlockAlias[butterflyStageOrReorderOrWindowIndexNestedPhase3] = transformBlockAlias[2 * butterflyStageOrReorderOrWindowIndexNestedPhase3 + 1];
          }
          for (butterflyStageOrReorderOrWindowIndexNestedPhase4 = 0; butterflyStageOrReorderOrWindowIndexNestedPhase4 < eighthBlockSizeOrOverlapIndex; butterflyStageOrReorderOrWindowIndexNestedPhase4++) {
            transformBlockAlias[blockSize - 1 - 2 * butterflyStageOrReorderOrWindowIndexNestedPhase4] = transformBlockAlias[4 * butterflyStageOrReorderOrWindowIndexNestedPhase4];
            transformBlockAlias[blockSize - 2 - 2 * butterflyStageOrReorderOrWindowIndexNestedPhase4] = transformBlockAlias[4 * butterflyStageOrReorderOrWindowIndexNestedPhase4 + 1];
            transformBlockAlias[blockSize - quarterBlockSize - 1 - 2 * butterflyStageOrReorderOrWindowIndexNestedPhase4] = transformBlockAlias[4 * butterflyStageOrReorderOrWindowIndexNestedPhase4 + 2];
            transformBlockAlias[blockSize - quarterBlockSize - 2 - 2 * butterflyStageOrReorderOrWindowIndexNestedPhase4] = transformBlockAlias[4 * butterflyStageOrReorderOrWindowIndexNestedPhase4 + 3];
          }
          for (butterflyStageOrReorderOrWindowIndexNestedPhase5 = 0; butterflyStageOrReorderOrWindowIndexNestedPhase5 < eighthBlockSizeOrOverlapIndex; butterflyStageOrReorderOrWindowIndexNestedPhase5++) {
            rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSineNestedPhase3 = mdctTrigC[2 * butterflyStageOrReorderOrWindowIndexNestedPhase5];
            rotationCosineOrButterflyLowerAOrPostRotationNegativeSineNestedPhase3 = mdctTrigC[2 * butterflyStageOrReorderOrWindowIndexNestedPhase5 + 1];
            rotationNegativeSineOrButterflyLowerBOrPostRotationUpperANestedPhase3 = transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4 + 2 * butterflyStageOrReorderOrWindowIndexNestedPhase5];
            butterflyCosineOrSwapSampleOrPostRotationUpperBNestedPhase3 = transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4 + 2 * butterflyStageOrReorderOrWindowIndexNestedPhase5 + 1];
            butterflyNegativeSineOrPostRotationLowerANestedPhase2 = transformBlockAlias[blockSize - 2 - 2 * butterflyStageOrReorderOrWindowIndexNestedPhase5];
            postRotationLowerB = transformBlockAlias[blockSize - 1 - 2 * butterflyStageOrReorderOrWindowIndexNestedPhase5];
            postRotationMix = rotationCosineOrButterflyLowerAOrPostRotationNegativeSineNestedPhase3 * (rotationNegativeSineOrButterflyLowerBOrPostRotationUpperANestedPhase3 - butterflyNegativeSineOrPostRotationLowerANestedPhase2) + rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSineNestedPhase3 * (butterflyCosineOrSwapSampleOrPostRotationUpperBNestedPhase3 + postRotationLowerB);
            transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4 + 2 * butterflyStageOrReorderOrWindowIndexNestedPhase5] = (rotationNegativeSineOrButterflyLowerBOrPostRotationUpperANestedPhase3 + butterflyNegativeSineOrPostRotationLowerANestedPhase2 + postRotationMix) * 0.5f;
            transformBlockAlias[blockSize - 2 - 2 * butterflyStageOrReorderOrWindowIndexNestedPhase5] = (rotationNegativeSineOrButterflyLowerBOrPostRotationUpperANestedPhase3 + butterflyNegativeSineOrPostRotationLowerANestedPhase2 - postRotationMix) * 0.5f;
            postRotationMixNestedPhase2 = rotationCosineOrButterflyLowerAOrPostRotationNegativeSineNestedPhase3 * (butterflyCosineOrSwapSampleOrPostRotationUpperBNestedPhase3 + postRotationLowerB) - rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSineNestedPhase3 * (rotationNegativeSineOrButterflyLowerBOrPostRotationUpperANestedPhase3 - butterflyNegativeSineOrPostRotationLowerANestedPhase2);
            transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4 + 2 * butterflyStageOrReorderOrWindowIndexNestedPhase5 + 1] = (butterflyCosineOrSwapSampleOrPostRotationUpperBNestedPhase3 - postRotationLowerB + postRotationMixNestedPhase2) * 0.5f;
            transformBlockAlias[blockSize - 1 - 2 * butterflyStageOrReorderOrWindowIndexNestedPhase5] = (-butterflyCosineOrSwapSampleOrPostRotationUpperBNestedPhase3 + postRotationLowerB + postRotationMixNestedPhase2) * 0.5f;
          }
          for (butterflyStageOrReorderOrWindowIndexNestedPhase6 = 0; butterflyStageOrReorderOrWindowIndexNestedPhase6 < quarterBlockSize; butterflyStageOrReorderOrWindowIndexNestedPhase6++) {
            transformBlockAlias[butterflyStageOrReorderOrWindowIndexNestedPhase6] = transformBlockAlias[2 * butterflyStageOrReorderOrWindowIndexNestedPhase6 + floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4] * mdctTrigB[2 * butterflyStageOrReorderOrWindowIndexNestedPhase6] + transformBlockAlias[2 * butterflyStageOrReorderOrWindowIndexNestedPhase6 + 1 + floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4] * mdctTrigB[2 * butterflyStageOrReorderOrWindowIndexNestedPhase6 + 1];
            transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4 - 1 - butterflyStageOrReorderOrWindowIndexNestedPhase6] = transformBlockAlias[2 * butterflyStageOrReorderOrWindowIndexNestedPhase6 + floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4] * mdctTrigB[2 * butterflyStageOrReorderOrWindowIndexNestedPhase6 + 1] - transformBlockAlias[2 * butterflyStageOrReorderOrWindowIndexNestedPhase6 + 1 + floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4] * mdctTrigB[2 * butterflyStageOrReorderOrWindowIndexNestedPhase6];
          }
          for (butterflyStageOrReorderOrWindowIndexNestedPhase7 = 0; butterflyStageOrReorderOrWindowIndexNestedPhase7 < quarterBlockSize; butterflyStageOrReorderOrWindowIndexNestedPhase7++) {
            transformBlockAlias[blockSize - quarterBlockSize + butterflyStageOrReorderOrWindowIndexNestedPhase7] = -sharedWorkBlockAlias[butterflyStageOrReorderOrWindowIndexNestedPhase7];
          }
          for (butterflyStageOrReorderOrWindowIndexNestedPhase8 = 0; butterflyStageOrReorderOrWindowIndexNestedPhase8 < quarterBlockSize; butterflyStageOrReorderOrWindowIndexNestedPhase8++) {
            transformBlockAlias[butterflyStageOrReorderOrWindowIndexNestedPhase8] = transformBlockAlias[quarterBlockSize + butterflyStageOrReorderOrWindowIndexNestedPhase8];
          }
          for (butterflyStageOrReorderOrWindowIndexNestedPhase9 = 0; butterflyStageOrReorderOrWindowIndexNestedPhase9 < quarterBlockSize; butterflyStageOrReorderOrWindowIndexNestedPhase9++) {
            transformBlockAlias[quarterBlockSize + butterflyStageOrReorderOrWindowIndexNestedPhase9] = -transformBlockAlias[quarterBlockSize - butterflyStageOrReorderOrWindowIndexNestedPhase9 - 1];
          }
          for (butterflyStageOrReorderOrWindowIndexNestedPhase10 = 0; butterflyStageOrReorderOrWindowIndexNestedPhase10 < quarterBlockSize; butterflyStageOrReorderOrWindowIndexNestedPhase10++) {
            transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSizePhase4 + butterflyStageOrReorderOrWindowIndexNestedPhase10] = transformBlockAlias[blockSize - butterflyStageOrReorderOrWindowIndexNestedPhase10 - 1];
          }
          for (butterflyStageOrReorderOrWindowIndexNestedPhase11 = leftWindowStart; butterflyStageOrReorderOrWindowIndexNestedPhase11 < leftWindowEnd; butterflyStageOrReorderOrWindowIndexNestedPhase11++) {
            rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSineNestedPhase4 = (float)Math.sin(((double)(butterflyStageOrReorderOrWindowIndexNestedPhase11 - leftWindowStart) + 0.5) / (double)leftWindowLength * 0.5 * 3.141592653589793);
            workBlock[butterflyStageOrReorderOrWindowIndexNestedPhase11] = workBlock[butterflyStageOrReorderOrWindowIndexNestedPhase11] * (float)Math.sin(1.5707963267948966 * (double)rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSineNestedPhase4 * (double)rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSineNestedPhase4);
          }
          for (butterflyStageOrReorderOrWindowIndexNestedPhase12 = rightWindowStart; butterflyStageOrReorderOrWindowIndexNestedPhase12 < rightWindowEnd; butterflyStageOrReorderOrWindowIndexNestedPhase12++) {
            rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSineNestedPhase5 = (float)Math.sin(((double)(butterflyStageOrReorderOrWindowIndexNestedPhase12 - rightWindowStart) + 0.5) / (double)rightWindowLength * 0.5 * 3.141592653589793 + 1.5707963267948966);
            workBlock[butterflyStageOrReorderOrWindowIndexNestedPhase12] = workBlock[butterflyStageOrReorderOrWindowIndexNestedPhase12] * (float)Math.sin(1.5707963267948966 * (double)rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSineNestedPhase5 * (double)rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSineNestedPhase5);
          }
        }
        overlapResult = null;
        if (this.previousBlockSize > 0) {
          overlapSampleCount = this.previousBlockSize + blockSize >> 2;
          allocatedOverlapSamples = new float[overlapSampleCount];
          intermediateOverlapSamplesAlias = allocatedOverlapSamples;
          overlapSamplesAlias = intermediateOverlapSamplesAlias;
          overlapResult = overlapSamplesAlias;
          if (!this.previousFloorAbsent) {
            for (eighthBlockSizeOrOverlapIndexPhase2 = 0; eighthBlockSizeOrOverlapIndexPhase2 < this.previousRightWindowLength; eighthBlockSizeOrOverlapIndexPhase2++) {
              overlapSourceOrDestinationIndex = (this.previousBlockSize >> 1) + eighthBlockSizeOrOverlapIndexPhase2;
              overlapSamplesAlias[eighthBlockSizeOrOverlapIndexPhase2] = overlapSamplesAlias[eighthBlockSizeOrOverlapIndexPhase2] + this.previousBlock[overlapSourceOrDestinationIndex];
            }
          }
          if (floorAbsentValue == 0) {
            for (eighthBlockSizeOrOverlapIndexPhase2NestedPhase2 = leftWindowStart; eighthBlockSizeOrOverlapIndexPhase2NestedPhase2 < blockSize >> 1; eighthBlockSizeOrOverlapIndexPhase2NestedPhase2++) {
              overlapSourceOrDestinationIndexNestedPhase2 = allocatedOverlapSamples.length - (blockSize >> 1) + eighthBlockSizeOrOverlapIndexPhase2NestedPhase2;
              overlapSamplesAlias[overlapSourceOrDestinationIndexNestedPhase2] = overlapSamplesAlias[overlapSourceOrDestinationIndexNestedPhase2] + workBlock[eighthBlockSizeOrOverlapIndexPhase2NestedPhase2];
            }
          }
        }
        recycledPreviousBlock = this.previousBlock;
        this.previousBlock = workBlock;
        workBlock = recycledPreviousBlock;
        this.previousBlockSize = blockSize;
        this.previousRightWindowLength = rightWindowEnd - (blockSize >> 1);
        previousFloorAbsentBeforeStore = !(floorAbsentValue == 0);
        this.previousFloorAbsent = previousFloorAbsentBeforeStore;
        return (float[]) (overlapResult);
    }

    private final static boolean ensureSetupLoaded(ResourceArchive archive) {
        byte[] setupBytes = null;
        if (!setupLoaded) {
            setupBytes = archive.getFile(0, -28153, 0);
            if (setupBytes == null) {
                return false;
            }
            MusicDecoder.decodeSetup(setupBytes);
        }
        return true;
    }

    private MusicDecoder(byte[] containerBytes) throws IOException {
        this.readPacketContainer(containerBytes);
    }

    static {
        setupLoaded = false;
    }
}
