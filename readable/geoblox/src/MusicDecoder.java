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
            chunkBitsThenMask = (1 << bitCount) - 1;
            value = value + ((bitstreamBytes[byteCursor] >> bitCursor & chunkBitsThenMask) << outputShift);
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
        int blockSizeKindOrCodebookCount;
        int blockSizeOrCodebookIndexOrTimeCountOrFloorCount;
        int halfBlockSizeOrTimeIndexOrFloorIndexOrResidueCount;
        int quarterBlockSizeOrResidueIndexOrMappingCount;
        int eighthBlockSizeOrMappingIndexOrModeCount;
        float[] mdctTrigA;
        float[] mdctTrigB;
        float[] mdctTrigC;
        int[] bitReverseIndices;
        int bitReverseWidth;
        MusicDecoder.setBitInput(setupBytes, 0);
        shortBlockSize = 1 << MusicDecoder.readBits(4);
        longBlockSize = 1 << MusicDecoder.readBits(4);
        workBlock = new float[longBlockSize];
        for (blockSizeKindOrCodebookCount = 0; blockSizeKindOrCodebookCount < 2; blockSizeKindOrCodebookCount++) {
          if (blockSizeKindOrCodebookCount == 0) {
            blockSizeBeforeStore = shortBlockSize;
          } else {
            blockSizeBeforeStore = longBlockSize;
          }
          blockSizeOrCodebookIndexOrTimeCountOrFloorCount = blockSizeBeforeStore;
          halfBlockSizeOrTimeIndexOrFloorIndexOrResidueCount = blockSizeOrCodebookIndexOrTimeCountOrFloorCount >> 1;
          quarterBlockSizeOrResidueIndexOrMappingCount = blockSizeOrCodebookIndexOrTimeCountOrFloorCount >> 2;
          eighthBlockSizeOrMappingIndexOrModeCount = blockSizeOrCodebookIndexOrTimeCountOrFloorCount >> 3;
          mdctTrigA = new float[halfBlockSizeOrTimeIndexOrFloorIndexOrResidueCount];
          for (trigAIndex = 0; trigAIndex < quarterBlockSizeOrResidueIndexOrMappingCount; trigAIndex++) {
            mdctTrigA[2 * trigAIndex] = (float)Math.cos((double)(4 * trigAIndex) * 3.141592653589793 / (double)blockSizeOrCodebookIndexOrTimeCountOrFloorCount);
            mdctTrigA[2 * trigAIndex + 1] = -(float)Math.sin((double)(4 * trigAIndex) * 3.141592653589793 / (double)blockSizeOrCodebookIndexOrTimeCountOrFloorCount);
          }
          mdctTrigB = new float[halfBlockSizeOrTimeIndexOrFloorIndexOrResidueCount];
          for (trigBIndex = 0; trigBIndex < quarterBlockSizeOrResidueIndexOrMappingCount; trigBIndex++) {
            mdctTrigB[2 * trigBIndex] = (float)Math.cos((double)(2 * trigBIndex + 1) * 3.141592653589793 / (double)(2 * blockSizeOrCodebookIndexOrTimeCountOrFloorCount));
            mdctTrigB[2 * trigBIndex + 1] = (float)Math.sin((double)(2 * trigBIndex + 1) * 3.141592653589793 / (double)(2 * blockSizeOrCodebookIndexOrTimeCountOrFloorCount));
          }
          mdctTrigC = new float[quarterBlockSizeOrResidueIndexOrMappingCount];
          for (trigCIndex = 0; trigCIndex < eighthBlockSizeOrMappingIndexOrModeCount; trigCIndex++) {
            mdctTrigC[2 * trigCIndex] = (float)Math.cos((double)(4 * trigCIndex + 2) * 3.141592653589793 / (double)blockSizeOrCodebookIndexOrTimeCountOrFloorCount);
            mdctTrigC[2 * trigCIndex + 1] = -(float)Math.sin((double)(4 * trigCIndex + 2) * 3.141592653589793 / (double)blockSizeOrCodebookIndexOrTimeCountOrFloorCount);
          }
          bitReverseIndices = new int[eighthBlockSizeOrMappingIndexOrModeCount];
          bitReverseWidth = SpriteConstructionSupport.unsignedBitLength((byte) 58, eighthBlockSizeOrMappingIndexOrModeCount - 1);
          for (bitReverseIndex = 0; bitReverseIndex < eighthBlockSizeOrMappingIndexOrModeCount; bitReverseIndex++) {
            bitReverseIndices[bitReverseIndex] = TextValidationFailure.reverseLowBitsIntoAccumulator(bitReverseIndex, 0, bitReverseWidth);
          }
          if (blockSizeKindOrCodebookCount == 0) {
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
        blockSizeKindOrCodebookCount = MusicDecoder.readBits(8) + 1;
        codebooks = new VorbisCodebook[blockSizeKindOrCodebookCount];
        for (blockSizeOrCodebookIndexOrTimeCountOrFloorCount = 0; blockSizeOrCodebookIndexOrTimeCountOrFloorCount < blockSizeKindOrCodebookCount; blockSizeOrCodebookIndexOrTimeCountOrFloorCount++) {
          codebooks[blockSizeOrCodebookIndexOrTimeCountOrFloorCount] = new VorbisCodebook();
        }
        blockSizeOrCodebookIndexOrTimeCountOrFloorCount = MusicDecoder.readBits(6) + 1;
        for (halfBlockSizeOrTimeIndexOrFloorIndexOrResidueCount = 0; halfBlockSizeOrTimeIndexOrFloorIndexOrResidueCount < blockSizeOrCodebookIndexOrTimeCountOrFloorCount; halfBlockSizeOrTimeIndexOrFloorIndexOrResidueCount++) {
          MusicDecoder.readBits(16);
        }
        blockSizeOrCodebookIndexOrTimeCountOrFloorCount = MusicDecoder.readBits(6) + 1;
        floors = new MusicDecodeStage[blockSizeOrCodebookIndexOrTimeCountOrFloorCount];
        for (halfBlockSizeOrTimeIndexOrFloorIndexOrResidueCount = 0; halfBlockSizeOrTimeIndexOrFloorIndexOrResidueCount < blockSizeOrCodebookIndexOrTimeCountOrFloorCount; halfBlockSizeOrTimeIndexOrFloorIndexOrResidueCount++) {
          floors[halfBlockSizeOrTimeIndexOrFloorIndexOrResidueCount] = new MusicDecodeStage();
        }
        halfBlockSizeOrTimeIndexOrFloorIndexOrResidueCount = MusicDecoder.readBits(6) + 1;
        residues = new VorbisResidue[halfBlockSizeOrTimeIndexOrFloorIndexOrResidueCount];
        for (quarterBlockSizeOrResidueIndexOrMappingCount = 0; quarterBlockSizeOrResidueIndexOrMappingCount < halfBlockSizeOrTimeIndexOrFloorIndexOrResidueCount; quarterBlockSizeOrResidueIndexOrMappingCount++) {
          residues[quarterBlockSizeOrResidueIndexOrMappingCount] = new VorbisResidue();
        }
        quarterBlockSizeOrResidueIndexOrMappingCount = MusicDecoder.readBits(6) + 1;
        mappings = new VorbisMapping[quarterBlockSizeOrResidueIndexOrMappingCount];
        for (eighthBlockSizeOrMappingIndexOrModeCount = 0; eighthBlockSizeOrMappingIndexOrModeCount < quarterBlockSizeOrResidueIndexOrMappingCount; eighthBlockSizeOrMappingIndexOrModeCount++) {
          mappings[eighthBlockSizeOrMappingIndexOrModeCount] = new VorbisMapping();
        }
        eighthBlockSizeOrMappingIndexOrModeCount = MusicDecoder.readBits(6) + 1;
        modeLongBlockFlags = new boolean[eighthBlockSizeOrMappingIndexOrModeCount];
        modeMappingIndices = new int[eighthBlockSizeOrMappingIndexOrModeCount];
        for (modeIndex = 0; modeIndex < eighthBlockSizeOrMappingIndexOrModeCount; modeIndex++) {
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
        int floorIndexOrQuarterBlockSizeOrOverlapLength;
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
        muxOrResidueSkipValue = floorAbsentValue;
        for (floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize = 0; floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize < mapping.submapCount; floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize++) {
          residue = residues[mapping.residueIndices[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize]];
          residueWorkBlockAlias = workBlock;
          residue.decodeResidue(residueWorkBlockAlias, blockSize >> 1, muxOrResidueSkipValue != 0);
        }
        if (floorAbsentValue == 0) {
          floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize = mapping.mux;
          floorIndexOrQuarterBlockSizeOrOverlapLength = mapping.floorIndices[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize];
          floors[floorIndexOrQuarterBlockSizeOrOverlapLength].applyFloorCurve(workBlock, blockSize >> 1);
        }
        if (floorAbsentValue != 0) {
          for (floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize = blockSize >> 1; floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize < blockSize; floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize++) {
            workBlock[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize] = 0.0f;
          }
        } else {
          floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize = blockSize >> 1;
          floorIndexOrQuarterBlockSizeOrOverlapLength = blockSize >> 2;
          eighthBlockSizeOrOverlapIndex = blockSize >> 3;
          sharedWorkBlockAlias = workBlock;
          intermediateTransformBlockAlias = sharedWorkBlockAlias;
          transformBlockAlias = intermediateTransformBlockAlias;
          for (scalingIndexOrUnusedMirrorCursorSnapshot = 0; scalingIndexOrUnusedMirrorCursorSnapshot < floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize; scalingIndexOrUnusedMirrorCursorSnapshot++) {
            transformBlockAlias[scalingIndexOrUnusedMirrorCursorSnapshot] = transformBlockAlias[scalingIndexOrUnusedMirrorCursorSnapshot] * 0.5f;
          }
          mirrorFillIndex = floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize;
          scalingIndexOrUnusedMirrorCursorSnapshot = mirrorFillIndex;
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
          for (rotationIndexOrTransformBitWidth = 0; rotationIndexOrTransformBitWidth < floorIndexOrQuarterBlockSizeOrOverlapLength; rotationIndexOrTransformBitWidth++) {
            rotationDifferenceOrButterflyUpperA = transformBlockAlias[4 * rotationIndexOrTransformBitWidth] - transformBlockAlias[blockSize - 4 * rotationIndexOrTransformBitWidth - 1];
            rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine = transformBlockAlias[4 * rotationIndexOrTransformBitWidth + 2] - transformBlockAlias[blockSize - 4 * rotationIndexOrTransformBitWidth - 3];
            rotationCosineOrButterflyLowerAOrPostRotationNegativeSine = mdctTrigA[2 * rotationIndexOrTransformBitWidth];
            rotationNegativeSineOrButterflyLowerBOrPostRotationUpperA = mdctTrigA[2 * rotationIndexOrTransformBitWidth + 1];
            transformBlockAlias[blockSize - 4 * rotationIndexOrTransformBitWidth - 1] = rotationDifferenceOrButterflyUpperA * rotationCosineOrButterflyLowerAOrPostRotationNegativeSine - rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine * rotationNegativeSineOrButterflyLowerBOrPostRotationUpperA;
            transformBlockAlias[blockSize - 4 * rotationIndexOrTransformBitWidth - 3] = rotationDifferenceOrButterflyUpperA * rotationNegativeSineOrButterflyLowerBOrPostRotationUpperA + rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine * rotationCosineOrButterflyLowerAOrPostRotationNegativeSine;
          }
          for (rotationIndexOrTransformBitWidth = 0; rotationIndexOrTransformBitWidth < eighthBlockSizeOrOverlapIndex; rotationIndexOrTransformBitWidth++) {
            rotationDifferenceOrButterflyUpperA = transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize + 3 + 4 * rotationIndexOrTransformBitWidth];
            rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine = transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize + 1 + 4 * rotationIndexOrTransformBitWidth];
            rotationCosineOrButterflyLowerAOrPostRotationNegativeSine = transformBlockAlias[4 * rotationIndexOrTransformBitWidth + 3];
            rotationNegativeSineOrButterflyLowerBOrPostRotationUpperA = transformBlockAlias[4 * rotationIndexOrTransformBitWidth + 1];
            transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize + 3 + 4 * rotationIndexOrTransformBitWidth] = rotationDifferenceOrButterflyUpperA + rotationCosineOrButterflyLowerAOrPostRotationNegativeSine;
            transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize + 1 + 4 * rotationIndexOrTransformBitWidth] = rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine + rotationNegativeSineOrButterflyLowerBOrPostRotationUpperA;
            butterflyCosineOrSwapSampleOrPostRotationUpperB = mdctTrigA[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize - 4 - 4 * rotationIndexOrTransformBitWidth];
            butterflyNegativeSineOrPostRotationLowerA = mdctTrigA[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize - 3 - 4 * rotationIndexOrTransformBitWidth];
            transformBlockAlias[4 * rotationIndexOrTransformBitWidth + 3] = (rotationDifferenceOrButterflyUpperA - rotationCosineOrButterflyLowerAOrPostRotationNegativeSine) * butterflyCosineOrSwapSampleOrPostRotationUpperB - (rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine - rotationNegativeSineOrButterflyLowerBOrPostRotationUpperA) * butterflyNegativeSineOrPostRotationLowerA;
            transformBlockAlias[4 * rotationIndexOrTransformBitWidth + 1] = (rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine - rotationNegativeSineOrButterflyLowerBOrPostRotationUpperA) * butterflyCosineOrSwapSampleOrPostRotationUpperB + (rotationDifferenceOrButterflyUpperA - rotationCosineOrButterflyLowerAOrPostRotationNegativeSine) * butterflyNegativeSineOrPostRotationLowerA;
          }
          rotationIndexOrTransformBitWidth = SpriteConstructionSupport.unsignedBitLength((byte) 58, blockSize - 1);
          for (butterflyStageOrReorderOrWindowIndex = 0; butterflyStageOrReorderOrWindowIndex < rotationIndexOrTransformBitWidth - 3; butterflyStageOrReorderOrWindowIndex++) {
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
          butterflyStageOrReorderOrWindowIndex = 1;
          while (true) {
            if (butterflyStageOrReorderOrWindowIndex < eighthBlockSizeOrOverlapIndex - 1) {
              butterflySpanOrBitReversePartner = bitReverseIndices[butterflyStageOrReorderOrWindowIndex];
              if (butterflyStageOrReorderOrWindowIndex >= butterflySpanOrBitReversePartner) {
                butterflyStageOrReorderOrWindowIndex++;
                continue;
              }
              trigStrideOrSwapBase = 8 * butterflyStageOrReorderOrWindowIndex;
              butterflyGroupOrSwapPartnerBase = 8 * butterflySpanOrBitReversePartner;
              butterflyCosineOrSwapSampleOrPostRotationUpperB = transformBlockAlias[trigStrideOrSwapBase + 1];
              transformBlockAlias[trigStrideOrSwapBase + 1] = transformBlockAlias[butterflyGroupOrSwapPartnerBase + 1];
              transformBlockAlias[butterflyGroupOrSwapPartnerBase + 1] = butterflyCosineOrSwapSampleOrPostRotationUpperB;
              butterflyCosineOrSwapSampleOrPostRotationUpperB = transformBlockAlias[trigStrideOrSwapBase + 3];
              transformBlockAlias[trigStrideOrSwapBase + 3] = transformBlockAlias[butterflyGroupOrSwapPartnerBase + 3];
              transformBlockAlias[butterflyGroupOrSwapPartnerBase + 3] = butterflyCosineOrSwapSampleOrPostRotationUpperB;
              butterflyCosineOrSwapSampleOrPostRotationUpperB = transformBlockAlias[trigStrideOrSwapBase + 5];
              transformBlockAlias[trigStrideOrSwapBase + 5] = transformBlockAlias[butterflyGroupOrSwapPartnerBase + 5];
              transformBlockAlias[butterflyGroupOrSwapPartnerBase + 5] = butterflyCosineOrSwapSampleOrPostRotationUpperB;
              butterflyCosineOrSwapSampleOrPostRotationUpperB = transformBlockAlias[trigStrideOrSwapBase + 7];
              transformBlockAlias[trigStrideOrSwapBase + 7] = transformBlockAlias[butterflyGroupOrSwapPartnerBase + 7];
              transformBlockAlias[butterflyGroupOrSwapPartnerBase + 7] = butterflyCosineOrSwapSampleOrPostRotationUpperB;
              butterflyStageOrReorderOrWindowIndex++;
              continue;
            }
            break;
          }
          for (butterflyStageOrReorderOrWindowIndex = 0; butterflyStageOrReorderOrWindowIndex < floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize; butterflyStageOrReorderOrWindowIndex++) {
            transformBlockAlias[butterflyStageOrReorderOrWindowIndex] = transformBlockAlias[2 * butterflyStageOrReorderOrWindowIndex + 1];
          }
          for (butterflyStageOrReorderOrWindowIndex = 0; butterflyStageOrReorderOrWindowIndex < eighthBlockSizeOrOverlapIndex; butterflyStageOrReorderOrWindowIndex++) {
            transformBlockAlias[blockSize - 1 - 2 * butterflyStageOrReorderOrWindowIndex] = transformBlockAlias[4 * butterflyStageOrReorderOrWindowIndex];
            transformBlockAlias[blockSize - 2 - 2 * butterflyStageOrReorderOrWindowIndex] = transformBlockAlias[4 * butterflyStageOrReorderOrWindowIndex + 1];
            transformBlockAlias[blockSize - floorIndexOrQuarterBlockSizeOrOverlapLength - 1 - 2 * butterflyStageOrReorderOrWindowIndex] = transformBlockAlias[4 * butterflyStageOrReorderOrWindowIndex + 2];
            transformBlockAlias[blockSize - floorIndexOrQuarterBlockSizeOrOverlapLength - 2 - 2 * butterflyStageOrReorderOrWindowIndex] = transformBlockAlias[4 * butterflyStageOrReorderOrWindowIndex + 3];
          }
          for (butterflyStageOrReorderOrWindowIndex = 0; butterflyStageOrReorderOrWindowIndex < eighthBlockSizeOrOverlapIndex; butterflyStageOrReorderOrWindowIndex++) {
            rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine = mdctTrigC[2 * butterflyStageOrReorderOrWindowIndex];
            rotationCosineOrButterflyLowerAOrPostRotationNegativeSine = mdctTrigC[2 * butterflyStageOrReorderOrWindowIndex + 1];
            rotationNegativeSineOrButterflyLowerBOrPostRotationUpperA = transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize + 2 * butterflyStageOrReorderOrWindowIndex];
            butterflyCosineOrSwapSampleOrPostRotationUpperB = transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize + 2 * butterflyStageOrReorderOrWindowIndex + 1];
            butterflyNegativeSineOrPostRotationLowerA = transformBlockAlias[blockSize - 2 - 2 * butterflyStageOrReorderOrWindowIndex];
            postRotationLowerB = transformBlockAlias[blockSize - 1 - 2 * butterflyStageOrReorderOrWindowIndex];
            postRotationMix = rotationCosineOrButterflyLowerAOrPostRotationNegativeSine * (rotationNegativeSineOrButterflyLowerBOrPostRotationUpperA - butterflyNegativeSineOrPostRotationLowerA) + rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine * (butterflyCosineOrSwapSampleOrPostRotationUpperB + postRotationLowerB);
            transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize + 2 * butterflyStageOrReorderOrWindowIndex] = (rotationNegativeSineOrButterflyLowerBOrPostRotationUpperA + butterflyNegativeSineOrPostRotationLowerA + postRotationMix) * 0.5f;
            transformBlockAlias[blockSize - 2 - 2 * butterflyStageOrReorderOrWindowIndex] = (rotationNegativeSineOrButterflyLowerBOrPostRotationUpperA + butterflyNegativeSineOrPostRotationLowerA - postRotationMix) * 0.5f;
            postRotationMix = rotationCosineOrButterflyLowerAOrPostRotationNegativeSine * (butterflyCosineOrSwapSampleOrPostRotationUpperB + postRotationLowerB) - rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine * (rotationNegativeSineOrButterflyLowerBOrPostRotationUpperA - butterflyNegativeSineOrPostRotationLowerA);
            transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize + 2 * butterflyStageOrReorderOrWindowIndex + 1] = (butterflyCosineOrSwapSampleOrPostRotationUpperB - postRotationLowerB + postRotationMix) * 0.5f;
            transformBlockAlias[blockSize - 1 - 2 * butterflyStageOrReorderOrWindowIndex] = (-butterflyCosineOrSwapSampleOrPostRotationUpperB + postRotationLowerB + postRotationMix) * 0.5f;
          }
          for (butterflyStageOrReorderOrWindowIndex = 0; butterflyStageOrReorderOrWindowIndex < floorIndexOrQuarterBlockSizeOrOverlapLength; butterflyStageOrReorderOrWindowIndex++) {
            transformBlockAlias[butterflyStageOrReorderOrWindowIndex] = transformBlockAlias[2 * butterflyStageOrReorderOrWindowIndex + floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize] * mdctTrigB[2 * butterflyStageOrReorderOrWindowIndex] + transformBlockAlias[2 * butterflyStageOrReorderOrWindowIndex + 1 + floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize] * mdctTrigB[2 * butterflyStageOrReorderOrWindowIndex + 1];
            transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize - 1 - butterflyStageOrReorderOrWindowIndex] = transformBlockAlias[2 * butterflyStageOrReorderOrWindowIndex + floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize] * mdctTrigB[2 * butterflyStageOrReorderOrWindowIndex + 1] - transformBlockAlias[2 * butterflyStageOrReorderOrWindowIndex + 1 + floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize] * mdctTrigB[2 * butterflyStageOrReorderOrWindowIndex];
          }
          for (butterflyStageOrReorderOrWindowIndex = 0; butterflyStageOrReorderOrWindowIndex < floorIndexOrQuarterBlockSizeOrOverlapLength; butterflyStageOrReorderOrWindowIndex++) {
            transformBlockAlias[blockSize - floorIndexOrQuarterBlockSizeOrOverlapLength + butterflyStageOrReorderOrWindowIndex] = -sharedWorkBlockAlias[butterflyStageOrReorderOrWindowIndex];
          }
          for (butterflyStageOrReorderOrWindowIndex = 0; butterflyStageOrReorderOrWindowIndex < floorIndexOrQuarterBlockSizeOrOverlapLength; butterflyStageOrReorderOrWindowIndex++) {
            transformBlockAlias[butterflyStageOrReorderOrWindowIndex] = transformBlockAlias[floorIndexOrQuarterBlockSizeOrOverlapLength + butterflyStageOrReorderOrWindowIndex];
          }
          for (butterflyStageOrReorderOrWindowIndex = 0; butterflyStageOrReorderOrWindowIndex < floorIndexOrQuarterBlockSizeOrOverlapLength; butterflyStageOrReorderOrWindowIndex++) {
            transformBlockAlias[floorIndexOrQuarterBlockSizeOrOverlapLength + butterflyStageOrReorderOrWindowIndex] = -transformBlockAlias[floorIndexOrQuarterBlockSizeOrOverlapLength - butterflyStageOrReorderOrWindowIndex - 1];
          }
          for (butterflyStageOrReorderOrWindowIndex = 0; butterflyStageOrReorderOrWindowIndex < floorIndexOrQuarterBlockSizeOrOverlapLength; butterflyStageOrReorderOrWindowIndex++) {
            transformBlockAlias[floorIndexOrSubmapIndexOrMuxOrZeroFillIndexOrHalfBlockSize + butterflyStageOrReorderOrWindowIndex] = transformBlockAlias[blockSize - butterflyStageOrReorderOrWindowIndex - 1];
          }
          for (butterflyStageOrReorderOrWindowIndex = leftWindowStart; butterflyStageOrReorderOrWindowIndex < leftWindowEnd; butterflyStageOrReorderOrWindowIndex++) {
            rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine = (float)Math.sin(((double)(butterflyStageOrReorderOrWindowIndex - leftWindowStart) + 0.5) / (double)leftWindowLength * 0.5 * 3.141592653589793);
            workBlock[butterflyStageOrReorderOrWindowIndex] = workBlock[butterflyStageOrReorderOrWindowIndex] * (float)Math.sin(1.5707963267948966 * (double)rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine * (double)rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine);
          }
          for (butterflyStageOrReorderOrWindowIndex = rightWindowStart; butterflyStageOrReorderOrWindowIndex < rightWindowEnd; butterflyStageOrReorderOrWindowIndex++) {
            rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine = (float)Math.sin(((double)(butterflyStageOrReorderOrWindowIndex - rightWindowStart) + 0.5) / (double)rightWindowLength * 0.5 * 3.141592653589793 + 1.5707963267948966);
            workBlock[butterflyStageOrReorderOrWindowIndex] = workBlock[butterflyStageOrReorderOrWindowIndex] * (float)Math.sin(1.5707963267948966 * (double)rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine * (double)rotationDifferenceOrButterflyUpperBOrPostRotationCosineOrWindowSine);
          }
        }
        overlapResult = null;
        if (this.previousBlockSize > 0) {
          floorIndexOrQuarterBlockSizeOrOverlapLength = this.previousBlockSize + blockSize >> 2;
          allocatedOverlapSamples = new float[floorIndexOrQuarterBlockSizeOrOverlapLength];
          intermediateOverlapSamplesAlias = allocatedOverlapSamples;
          overlapSamplesAlias = intermediateOverlapSamplesAlias;
          overlapResult = overlapSamplesAlias;
          if (!this.previousFloorAbsent) {
            for (eighthBlockSizeOrOverlapIndex = 0; eighthBlockSizeOrOverlapIndex < this.previousRightWindowLength; eighthBlockSizeOrOverlapIndex++) {
              overlapSourceOrDestinationIndex = (this.previousBlockSize >> 1) + eighthBlockSizeOrOverlapIndex;
              overlapSamplesAlias[eighthBlockSizeOrOverlapIndex] = overlapSamplesAlias[eighthBlockSizeOrOverlapIndex] + this.previousBlock[overlapSourceOrDestinationIndex];
            }
          }
          if (floorAbsentValue == 0) {
            for (eighthBlockSizeOrOverlapIndex = leftWindowStart; eighthBlockSizeOrOverlapIndex < blockSize >> 1; eighthBlockSizeOrOverlapIndex++) {
              overlapSourceOrDestinationIndex = allocatedOverlapSamples.length - (blockSize >> 1) + eighthBlockSizeOrOverlapIndex;
              overlapSamplesAlias[overlapSourceOrDestinationIndex] = overlapSamplesAlias[overlapSourceOrDestinationIndex] + workBlock[eighthBlockSizeOrOverlapIndex];
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
