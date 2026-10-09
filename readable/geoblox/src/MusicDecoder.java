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
        int remainingBitMask;
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
            remainingBitMask = (1 << bitCount) - 1;
            value = value + ((bitstreamBytes[byteCursor] >> bitCursor & remainingBitMask) << outputShift);
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
        int packetMux;
        int decodedFloorIndex;
        Object overlapResult;
        int floorIndex;
        float[] recycledPreviousBlock;
        int eighthBlockSize;
        float[] transformBlockAlias;
        int previousOverlapSourceIndex;
        int halfScaleIndex;
        float[] mdctTrigA;
        float[] mdctTrigB;
        float[] mdctTrigC;
        int[] unusedBitReverseAlias;
        int preRotationIndex;
        int butterflyStage;
        float preRotationDifferenceA;
        float preRotationDifferenceB;
        int butterflySpan;
        float preRotationCosine;
        int butterflyTrigStride;
        float preRotationNegativeSine;
        int butterflyGroup;
        float preButterflyCosine;
        int butterflyUpperBase;
        float preButterflyNegativeSine;
        int butterflyLowerBase;
        float postRotationLowerB;
        float postRotationMixA;
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
        int residueSkipValue;
        int residueSubmapIndex;
        int floorMux;
        int zeroFillIndexOrHalfBlockSize;
        int previousOverlapIndex;
        int currentOverlapDestinationIndex;
        int unusedMirrorCursorSnapshot;
        int preButterflyIndex;
        int transformBitWidth;
        int bitReverseIndex;
        int oddSampleCompactIndex;
        int quarterReorderIndex;
        int postRotationIndex;
        int finalRotationIndex;
        int finalQuarterNegateIndex;
        int firstQuarterCopyIndex;
        int secondQuarterMirrorIndex;
        int thirdQuarterCopyIndex;
        int leftWindowIndex;
        int rightWindowIndex;
        float preButterflyUpperA;
        float preButterflyUpperB;
        float postRotationCosine;
        float leftWindowSine;
        float rightWindowSine;
        int bitReversePartnerIndex;
        float preButterflyLowerA;
        float postRotationNegativeSine;
        int bitReverseSwapBase;
        float preButterflyLowerB;
        float postRotationUpperA;
        int bitReversePartnerBase;
        float bitReverseSwapSampleOne;
        float postRotationUpperB;
        float postRotationLowerA;
        float postRotationMixB;
        int currentOverlapSourceIndex;
        float bitReverseSwapSampleThree;
        float bitReverseSwapSampleFive;
        float bitReverseSwapSampleSeven;
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
        packetMux = mapping.mux;
        decodedFloorIndex = mapping.floorIndices[packetMux];
        floorAbsentBeforeStore = (floors[decodedFloorIndex].decodeFloorPacket()) ? 0 : 1;
        floorAbsentValue = floorAbsentBeforeStore;
        residueSkipValue = floorAbsentValue;
        for (residueSubmapIndex = 0; residueSubmapIndex < mapping.submapCount; residueSubmapIndex++) {
          residue = residues[mapping.residueIndices[residueSubmapIndex]];
          residueWorkBlockAlias = workBlock;
          residue.decodeResidue(residueWorkBlockAlias, blockSize >> 1, residueSkipValue != 0);
        }
        if (floorAbsentValue == 0) {
          floorMux = mapping.mux;
          floorIndex = mapping.floorIndices[floorMux];
          floors[floorIndex].applyFloorCurve(workBlock, blockSize >> 1);
        }
        if (floorAbsentValue != 0) {
          for (zeroFillIndexOrHalfBlockSize = blockSize >> 1; zeroFillIndexOrHalfBlockSize < blockSize; zeroFillIndexOrHalfBlockSize++) {
            workBlock[zeroFillIndexOrHalfBlockSize] = 0.0f;
          }
        } else {
          zeroFillIndexOrHalfBlockSize = blockSize >> 1;
          quarterBlockSize = blockSize >> 2;
          eighthBlockSize = blockSize >> 3;
          sharedWorkBlockAlias = workBlock;
          intermediateTransformBlockAlias = sharedWorkBlockAlias;
          transformBlockAlias = intermediateTransformBlockAlias;
          for (halfScaleIndex = 0; halfScaleIndex < zeroFillIndexOrHalfBlockSize; halfScaleIndex++) {
            transformBlockAlias[halfScaleIndex] = transformBlockAlias[halfScaleIndex] * 0.5f;
          }
          mirrorFillIndex = zeroFillIndexOrHalfBlockSize;
          unusedMirrorCursorSnapshot = mirrorFillIndex;
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
          for (preRotationIndex = 0; preRotationIndex < quarterBlockSize; preRotationIndex++) {
            preRotationDifferenceA = transformBlockAlias[4 * preRotationIndex] - transformBlockAlias[blockSize - 4 * preRotationIndex - 1];
            preRotationDifferenceB = transformBlockAlias[4 * preRotationIndex + 2] - transformBlockAlias[blockSize - 4 * preRotationIndex - 3];
            preRotationCosine = mdctTrigA[2 * preRotationIndex];
            preRotationNegativeSine = mdctTrigA[2 * preRotationIndex + 1];
            transformBlockAlias[blockSize - 4 * preRotationIndex - 1] = preRotationDifferenceA * preRotationCosine - preRotationDifferenceB * preRotationNegativeSine;
            transformBlockAlias[blockSize - 4 * preRotationIndex - 3] = preRotationDifferenceA * preRotationNegativeSine + preRotationDifferenceB * preRotationCosine;
          }
          for (preButterflyIndex = 0; preButterflyIndex < eighthBlockSize; preButterflyIndex++) {
            preButterflyUpperA = transformBlockAlias[zeroFillIndexOrHalfBlockSize + 3 + 4 * preButterflyIndex];
            preButterflyUpperB = transformBlockAlias[zeroFillIndexOrHalfBlockSize + 1 + 4 * preButterflyIndex];
            preButterflyLowerA = transformBlockAlias[4 * preButterflyIndex + 3];
            preButterflyLowerB = transformBlockAlias[4 * preButterflyIndex + 1];
            transformBlockAlias[zeroFillIndexOrHalfBlockSize + 3 + 4 * preButterflyIndex] = preButterflyUpperA + preButterflyLowerA;
            transformBlockAlias[zeroFillIndexOrHalfBlockSize + 1 + 4 * preButterflyIndex] = preButterflyUpperB + preButterflyLowerB;
            preButterflyCosine = mdctTrigA[zeroFillIndexOrHalfBlockSize - 4 - 4 * preButterflyIndex];
            preButterflyNegativeSine = mdctTrigA[zeroFillIndexOrHalfBlockSize - 3 - 4 * preButterflyIndex];
            transformBlockAlias[4 * preButterflyIndex + 3] = (preButterflyUpperA - preButterflyLowerA) * preButterflyCosine - (preButterflyUpperB - preButterflyLowerB) * preButterflyNegativeSine;
            transformBlockAlias[4 * preButterflyIndex + 1] = (preButterflyUpperB - preButterflyLowerB) * preButterflyCosine + (preButterflyUpperA - preButterflyLowerA) * preButterflyNegativeSine;
          }
          transformBitWidth = SpriteConstructionSupport.unsignedBitLength((byte) 58, blockSize - 1);
          for (butterflyStage = 0; butterflyStage < transformBitWidth - 3; butterflyStage++) {
            butterflySpan = blockSize >> butterflyStage + 2;
            butterflyTrigStride = 8 << butterflyStage;
            for (butterflyGroup = 0; butterflyGroup < 2 << butterflyStage; butterflyGroup++) {
              butterflyUpperBase = blockSize - butterflySpan * 2 * butterflyGroup;
              butterflyLowerBase = blockSize - butterflySpan * (2 * butterflyGroup + 1);
              for (butterflyIndex = 0; butterflyIndex < blockSize >> butterflyStage + 4; butterflyIndex++) {
                butterflyOffset = 4 * butterflyIndex;
                butterflyUpperA = transformBlockAlias[butterflyUpperBase - 1 - butterflyOffset];
                butterflyUpperB = transformBlockAlias[butterflyUpperBase - 3 - butterflyOffset];
                butterflyLowerA = transformBlockAlias[butterflyLowerBase - 1 - butterflyOffset];
                butterflyLowerB = transformBlockAlias[butterflyLowerBase - 3 - butterflyOffset];
                transformBlockAlias[butterflyUpperBase - 1 - butterflyOffset] = butterflyUpperA + butterflyLowerA;
                transformBlockAlias[butterflyUpperBase - 3 - butterflyOffset] = butterflyUpperB + butterflyLowerB;
                butterflyCosine = mdctTrigA[butterflyIndex * butterflyTrigStride];
                butterflyNegativeSine = mdctTrigA[butterflyIndex * butterflyTrigStride + 1];
                transformBlockAlias[butterflyLowerBase - 1 - butterflyOffset] = (butterflyUpperA - butterflyLowerA) * butterflyCosine - (butterflyUpperB - butterflyLowerB) * butterflyNegativeSine;
                transformBlockAlias[butterflyLowerBase - 3 - butterflyOffset] = (butterflyUpperB - butterflyLowerB) * butterflyCosine + (butterflyUpperA - butterflyLowerA) * butterflyNegativeSine;
              }
            }
          }
          bitReverseIndex = 1;
          while (true) {
            if (bitReverseIndex < eighthBlockSize - 1) {
              bitReversePartnerIndex = bitReverseIndices[bitReverseIndex];
              if (bitReverseIndex >= bitReversePartnerIndex) {
                bitReverseIndex++;
                continue;
              }
              bitReverseSwapBase = 8 * bitReverseIndex;
              bitReversePartnerBase = 8 * bitReversePartnerIndex;
              bitReverseSwapSampleOne = transformBlockAlias[bitReverseSwapBase + 1];
              transformBlockAlias[bitReverseSwapBase + 1] = transformBlockAlias[bitReversePartnerBase + 1];
              transformBlockAlias[bitReversePartnerBase + 1] = bitReverseSwapSampleOne;
              bitReverseSwapSampleThree = transformBlockAlias[bitReverseSwapBase + 3];
              transformBlockAlias[bitReverseSwapBase + 3] = transformBlockAlias[bitReversePartnerBase + 3];
              transformBlockAlias[bitReversePartnerBase + 3] = bitReverseSwapSampleThree;
              bitReverseSwapSampleFive = transformBlockAlias[bitReverseSwapBase + 5];
              transformBlockAlias[bitReverseSwapBase + 5] = transformBlockAlias[bitReversePartnerBase + 5];
              transformBlockAlias[bitReversePartnerBase + 5] = bitReverseSwapSampleFive;
              bitReverseSwapSampleSeven = transformBlockAlias[bitReverseSwapBase + 7];
              transformBlockAlias[bitReverseSwapBase + 7] = transformBlockAlias[bitReversePartnerBase + 7];
              transformBlockAlias[bitReversePartnerBase + 7] = bitReverseSwapSampleSeven;
              bitReverseIndex++;
              continue;
            }
            break;
          }
          for (oddSampleCompactIndex = 0; oddSampleCompactIndex < zeroFillIndexOrHalfBlockSize; oddSampleCompactIndex++) {
            transformBlockAlias[oddSampleCompactIndex] = transformBlockAlias[2 * oddSampleCompactIndex + 1];
          }
          for (quarterReorderIndex = 0; quarterReorderIndex < eighthBlockSize; quarterReorderIndex++) {
            transformBlockAlias[blockSize - 1 - 2 * quarterReorderIndex] = transformBlockAlias[4 * quarterReorderIndex];
            transformBlockAlias[blockSize - 2 - 2 * quarterReorderIndex] = transformBlockAlias[4 * quarterReorderIndex + 1];
            transformBlockAlias[blockSize - quarterBlockSize - 1 - 2 * quarterReorderIndex] = transformBlockAlias[4 * quarterReorderIndex + 2];
            transformBlockAlias[blockSize - quarterBlockSize - 2 - 2 * quarterReorderIndex] = transformBlockAlias[4 * quarterReorderIndex + 3];
          }
          for (postRotationIndex = 0; postRotationIndex < eighthBlockSize; postRotationIndex++) {
            postRotationCosine = mdctTrigC[2 * postRotationIndex];
            postRotationNegativeSine = mdctTrigC[2 * postRotationIndex + 1];
            postRotationUpperA = transformBlockAlias[zeroFillIndexOrHalfBlockSize + 2 * postRotationIndex];
            postRotationUpperB = transformBlockAlias[zeroFillIndexOrHalfBlockSize + 2 * postRotationIndex + 1];
            postRotationLowerA = transformBlockAlias[blockSize - 2 - 2 * postRotationIndex];
            postRotationLowerB = transformBlockAlias[blockSize - 1 - 2 * postRotationIndex];
            postRotationMixA = postRotationNegativeSine * (postRotationUpperA - postRotationLowerA) + postRotationCosine * (postRotationUpperB + postRotationLowerB);
            transformBlockAlias[zeroFillIndexOrHalfBlockSize + 2 * postRotationIndex] = (postRotationUpperA + postRotationLowerA + postRotationMixA) * 0.5f;
            transformBlockAlias[blockSize - 2 - 2 * postRotationIndex] = (postRotationUpperA + postRotationLowerA - postRotationMixA) * 0.5f;
            postRotationMixB = postRotationNegativeSine * (postRotationUpperB + postRotationLowerB) - postRotationCosine * (postRotationUpperA - postRotationLowerA);
            transformBlockAlias[zeroFillIndexOrHalfBlockSize + 2 * postRotationIndex + 1] = (postRotationUpperB - postRotationLowerB + postRotationMixB) * 0.5f;
            transformBlockAlias[blockSize - 1 - 2 * postRotationIndex] = (-postRotationUpperB + postRotationLowerB + postRotationMixB) * 0.5f;
          }
          for (finalRotationIndex = 0; finalRotationIndex < quarterBlockSize; finalRotationIndex++) {
            transformBlockAlias[finalRotationIndex] = transformBlockAlias[2 * finalRotationIndex + zeroFillIndexOrHalfBlockSize] * mdctTrigB[2 * finalRotationIndex] + transformBlockAlias[2 * finalRotationIndex + 1 + zeroFillIndexOrHalfBlockSize] * mdctTrigB[2 * finalRotationIndex + 1];
            transformBlockAlias[zeroFillIndexOrHalfBlockSize - 1 - finalRotationIndex] = transformBlockAlias[2 * finalRotationIndex + zeroFillIndexOrHalfBlockSize] * mdctTrigB[2 * finalRotationIndex + 1] - transformBlockAlias[2 * finalRotationIndex + 1 + zeroFillIndexOrHalfBlockSize] * mdctTrigB[2 * finalRotationIndex];
          }
          for (finalQuarterNegateIndex = 0; finalQuarterNegateIndex < quarterBlockSize; finalQuarterNegateIndex++) {
            transformBlockAlias[blockSize - quarterBlockSize + finalQuarterNegateIndex] = -sharedWorkBlockAlias[finalQuarterNegateIndex];
          }
          for (firstQuarterCopyIndex = 0; firstQuarterCopyIndex < quarterBlockSize; firstQuarterCopyIndex++) {
            transformBlockAlias[firstQuarterCopyIndex] = transformBlockAlias[quarterBlockSize + firstQuarterCopyIndex];
          }
          for (secondQuarterMirrorIndex = 0; secondQuarterMirrorIndex < quarterBlockSize; secondQuarterMirrorIndex++) {
            transformBlockAlias[quarterBlockSize + secondQuarterMirrorIndex] = -transformBlockAlias[quarterBlockSize - secondQuarterMirrorIndex - 1];
          }
          for (thirdQuarterCopyIndex = 0; thirdQuarterCopyIndex < quarterBlockSize; thirdQuarterCopyIndex++) {
            transformBlockAlias[zeroFillIndexOrHalfBlockSize + thirdQuarterCopyIndex] = transformBlockAlias[blockSize - thirdQuarterCopyIndex - 1];
          }
          for (leftWindowIndex = leftWindowStart; leftWindowIndex < leftWindowEnd; leftWindowIndex++) {
            leftWindowSine = (float)Math.sin(((double)(leftWindowIndex - leftWindowStart) + 0.5) / (double)leftWindowLength * 0.5 * 3.141592653589793);
            workBlock[leftWindowIndex] = workBlock[leftWindowIndex] * (float)Math.sin(1.5707963267948966 * (double)leftWindowSine * (double)leftWindowSine);
          }
          for (rightWindowIndex = rightWindowStart; rightWindowIndex < rightWindowEnd; rightWindowIndex++) {
            rightWindowSine = (float)Math.sin(((double)(rightWindowIndex - rightWindowStart) + 0.5) / (double)rightWindowLength * 0.5 * 3.141592653589793 + 1.5707963267948966);
            workBlock[rightWindowIndex] = workBlock[rightWindowIndex] * (float)Math.sin(1.5707963267948966 * (double)rightWindowSine * (double)rightWindowSine);
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
            for (previousOverlapIndex = 0; previousOverlapIndex < this.previousRightWindowLength; previousOverlapIndex++) {
              previousOverlapSourceIndex = (this.previousBlockSize >> 1) + previousOverlapIndex;
              overlapSamplesAlias[previousOverlapIndex] = overlapSamplesAlias[previousOverlapIndex] + this.previousBlock[previousOverlapSourceIndex];
            }
          }
          if (floorAbsentValue == 0) {
            for (currentOverlapSourceIndex = leftWindowStart; currentOverlapSourceIndex < blockSize >> 1; currentOverlapSourceIndex++) {
              currentOverlapDestinationIndex = allocatedOverlapSamples.length - (blockSize >> 1) + currentOverlapSourceIndex;
              overlapSamplesAlias[currentOverlapDestinationIndex] = overlapSamplesAlias[currentOverlapDestinationIndex] + workBlock[currentOverlapSourceIndex];
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
