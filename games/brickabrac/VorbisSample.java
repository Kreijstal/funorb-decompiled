/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class VorbisSample extends IntrusiveNode {
    private static int[] shortBitReverse;
    private static int bytePosition;
    private static int longBlockSize;
    private static int bitOffset;
    private static boolean setupReady;
    private static VorbisFloor1[] floors;
    private static float[] shortTrigA;
    private int previousBlockSize;
    private static VorbisResidue[] residues;
    private boolean pingPong;
    private int previousRightWindowCount;
    private static VorbisMapping[] mappings;
    private static float[] longTrigC;
    private static int[] longBitReverse;
    private static float[] shortTrigC;
    private static float[] shortTrigB;
    private static byte[] bitData;
    private float[] previousBlock;
    private static float[] blockScratch;
    private int nextPacket;
    private static int shortBlockSize;
    private boolean previousSilent;
    private static float[] longTrigA;
    private static boolean[] longBlockModes;
    private int sampleCount;
    private int outputPosition;
    static VorbisCodebook[] codebooks;
    private int loopStart;
    private int loopEnd;
    private static int[] modeMappings;
    private static float[] longTrigB;
    private int sampleRate;
    private byte[][] packets;
    private byte[] outputSamples;

    final static int readBit() {
        int bit = bitData[bytePosition] >> bitOffset & 1;
        bitOffset = bitOffset + 1;
        bytePosition = bytePosition + (bitOffset >> 3);
        bitOffset = bitOffset & 7;
        return bit;
    }

    private final static boolean ensureSetup(ResourceArchive archive) {
        byte[] setupData = null;
        if (!setupReady) {
          setupData = archive.takeFile(0, 0, 4);
          if (setupData == null) {
            return false;
          }
          VorbisSample.decodeSetup(setupData);
        }
        return true;
    }

    final static VorbisSample load(ResourceArchive archive, int groupId, int fileId) {
        try {
          VorbisSample sample = null;
          if (!VorbisSample.ensureSetup(archive)) {
            archive.ensureFileAvailable(fileId, groupId, (byte) 102);
            return null;
          }
          byte[] data = archive.takeFile(fileId, groupId, 4);
          if (data == null) {
            return null;
          }
          Object unusedSampleObject = null;
          try {
            sample = new VorbisSample(data);
          } catch (IOException invalidContainer) {
            invalidContainer.printStackTrace();
          }
          return sample;
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    final static int readBits(int count) {
        int mask = 0;
        int availableBits = 0;
        int value = 0;
        int outputShift = 0;
        int tailMask;
        while (count >= 8 - bitOffset) {
          availableBits = 8 - bitOffset;
          mask = (1 << availableBits) - 1;
          value = value + ((bitData[bytePosition] >> bitOffset & mask) << outputShift);
          bitOffset = 0;
          bytePosition = bytePosition + 1;
          outputShift = outputShift + availableBits;
          count = count - availableBits;
        }
        if (count > 0) {
          tailMask = (1 << count) - 1;
          value = value + ((bitData[bytePosition] >> bitOffset & tailMask) << outputShift);
          bitOffset = bitOffset + count;
        }
        return value;
    }

    private final static void setBitInput(byte[] data, int offset) {
        bitData = data;
        bytePosition = offset;
        bitOffset = 0;
    }

    final static float unpackFloat(int packed) {
        int mantissa = packed & 2097151;
        int sign = packed & -2147483648;
        int exponent = (packed & 2145386496) >> 21;
        if (sign != 0) {
          mantissa = -mantissa;
        }
        return (float)((double)mantissa * Math.pow(2.0, (double)(exponent - 788)));
    }

    private final void decodeContainer(byte[] data) throws IOException {
        int packetIndex = 0;
        int packetLength = 0;
        int lengthChunk = 0;
        byte[] packetData = null;
        PacketBuffer packet = new PacketBuffer(data);
        this.sampleRate = packet.readInt(255);
        this.sampleCount = packet.readInt(255);
        this.loopStart = packet.readInt(255);
        this.loopEnd = packet.readInt(255);
        if (this.loopEnd < 0) {
          this.loopEnd = ~this.loopEnd;
          this.pingPong = true;
        }
        int packetCount = packet.readInt(255);
        if (packetCount < 0) {
          throw new IOException();
        }
        this.packets = new byte[packetCount][];
        for (packetIndex = 0; packetIndex < packetCount; packetIndex++) {
          packetLength = 0;
          do {
            lengthChunk = packet.readUnsignedByte(255);
            packetLength = packetLength + lengthChunk;
          } while (lengthChunk >= 255);
          packetData = new byte[packetLength];
          packet.readBytes(0, packetData, 115, packetLength);
          this.packets[packetIndex] = packetData;
        }
    }

    final PcmSound toPcmSound() {
        int packetIndex = 0;
        int sampleIndex = 0;
        int writeIndex = 0;
        byte[] samples;
        int position;
        float[] overlapSamples;
        int availableSamples;
        int unsignedSample;
        this.previousBlockSize = 0;
        this.previousBlock = new float[longBlockSize];
        samples = new byte[this.sampleCount];
        position = 0;
        for (packetIndex = 0; packetIndex < this.packets.length; packetIndex++) {
          overlapSamples = this.decodePacket(packetIndex);
          if (overlapSamples != null) {
            availableSamples = overlapSamples.length;
            if (availableSamples > this.sampleCount - position) {
              availableSamples = this.sampleCount - position;
            }
            for (sampleIndex = 0; sampleIndex < availableSamples; sampleIndex++) {
              unsignedSample = (int)(128.0f + overlapSamples[sampleIndex] * 128.0f);
              if ((unsignedSample & -256) != 0) {
                unsignedSample = ~unsignedSample >> 31;
              }
              writeIndex = position;
              position++;
              samples[writeIndex] = (byte)(unsignedSample - 128);
            }
          }
        }
        this.previousBlock = null;
        return new PcmSound(this.sampleRate, samples, this.loopStart, this.loopEnd, this.pingPong);
    }

    final static void decodeSetup(byte[] data) {
        int trigAIndex = 0;
        int trigBIndex = 0;
        int trigCIndex = 0;
        int permutationIndex = 0;
        int modeIndex = 0;
        int selectedBlockSize = 0;
        boolean[] modeFlagTarget = null;
        int modeFlagIndex = 0;
        boolean longBlockFlag = false;
        int blockKind;
        int blockSize;
        int halfBlock;
        int quarterBlock;
        int eighthBlock;
        float[] trigA;
        float[] trigB;
        float[] trigC;
        int[] bitReverse;
        int permutationBits;
        int codebookCount;
        int codebookIndex;
        int timeCount;
        int floorCount;
        int timeIndex;
        int floorIndex;
        int residueCount;
        int residueIndex;
        int mappingCount;
        int mappingIndex;
        int modeCount;
        VorbisSample.setBitInput(data, 0);
        shortBlockSize = 1 << VorbisSample.readBits(4);
        longBlockSize = 1 << VorbisSample.readBits(4);
        blockScratch = new float[longBlockSize];
        for (blockKind = 0; blockKind < 2; blockKind++) {
          if (blockKind == 0) {
            selectedBlockSize = shortBlockSize;
          } else {
            selectedBlockSize = longBlockSize;
          }
          blockSize = selectedBlockSize;
          halfBlock = blockSize >> 1;
          quarterBlock = blockSize >> 2;
          eighthBlock = blockSize >> 3;
          trigA = new float[halfBlock];
          for (trigAIndex = 0; trigAIndex < quarterBlock; trigAIndex++) {
            trigA[2 * trigAIndex] = (float)Math.cos((double)(4 * trigAIndex) * 3.141592653589793 / (double)blockSize);
            trigA[2 * trigAIndex + 1] = -(float)Math.sin((double)(4 * trigAIndex) * 3.141592653589793 / (double)blockSize);
          }
          trigB = new float[halfBlock];
          for (trigBIndex = 0; trigBIndex < quarterBlock; trigBIndex++) {
            trigB[2 * trigBIndex] = (float)Math.cos((double)(2 * trigBIndex + 1) * 3.141592653589793 / (double)(2 * blockSize));
            trigB[2 * trigBIndex + 1] = (float)Math.sin((double)(2 * trigBIndex + 1) * 3.141592653589793 / (double)(2 * blockSize));
          }
          trigC = new float[quarterBlock];
          for (trigCIndex = 0; trigCIndex < eighthBlock; trigCIndex++) {
            trigC[2 * trigCIndex] = (float)Math.cos((double)(4 * trigCIndex + 2) * 3.141592653589793 / (double)blockSize);
            trigC[2 * trigCIndex + 1] = -(float)Math.sin((double)(4 * trigCIndex + 2) * 3.141592653589793 / (double)blockSize);
          }
          bitReverse = new int[eighthBlock];
          permutationBits = ed.unsignedBitLength(9, eighthBlock - 1);
          for (permutationIndex = 0; permutationIndex < eighthBlock; permutationIndex++) {
            bitReverse[permutationIndex] = KeyboardInput.reverseLowBits(permutationBits, permutationIndex, -1);
          }
          if (blockKind == 0) {
            shortTrigA = trigA;
            shortTrigB = trigB;
            shortTrigC = trigC;
            shortBitReverse = bitReverse;
          } else {
            longTrigA = trigA;
            longTrigB = trigB;
            longTrigC = trigC;
            longBitReverse = bitReverse;
          }
        }
        codebookCount = VorbisSample.readBits(8) + 1;
        codebooks = new VorbisCodebook[codebookCount];
        for (codebookIndex = 0; codebookIndex < codebookCount; codebookIndex++) {
          codebooks[codebookIndex] = new VorbisCodebook();
        }
        timeCount = VorbisSample.readBits(6) + 1;
        for (timeIndex = 0; timeIndex < timeCount; timeIndex++) {
          VorbisSample.readBits(16);
        }
        floorCount = VorbisSample.readBits(6) + 1;
        floors = new VorbisFloor1[floorCount];
        for (floorIndex = 0; floorIndex < floorCount; floorIndex++) {
          floors[floorIndex] = new VorbisFloor1();
        }
        residueCount = VorbisSample.readBits(6) + 1;
        residues = new VorbisResidue[residueCount];
        for (residueIndex = 0; residueIndex < residueCount; residueIndex++) {
          residues[residueIndex] = new VorbisResidue();
        }
        mappingCount = VorbisSample.readBits(6) + 1;
        mappings = new VorbisMapping[mappingCount];
        for (mappingIndex = 0; mappingIndex < mappingCount; mappingIndex++) {
          mappings[mappingIndex] = new VorbisMapping();
        }
        modeCount = VorbisSample.readBits(6) + 1;
        longBlockModes = new boolean[modeCount];
        modeMappings = new int[modeCount];
        for (modeIndex = 0; modeIndex < modeCount; modeIndex++) {
          modeFlagTarget = (boolean[]) (longBlockModes);
          modeFlagIndex = modeIndex;
          longBlockFlag = (VorbisSample.readBit() != 0);
          modeFlagTarget[modeFlagIndex] = longBlockFlag;
          VorbisSample.readBits(16);
          VorbisSample.readBits(16);
          modeMappings[modeIndex] = VorbisSample.readBits(8);
        }
        setupReady = true;
    }

    final PcmSound toPcmSoundBudgeted(int[] budget) {
        int sampleIndex = 0;
        int writeIndex = 0;
        int position;
        int availableSamples;
        int unsignedSample;
        float[] overlapSamples;
        byte[] completedOutput;
        if (budget != null &&
          budget[0] <= 0) {
          return null;
        }
        if (this.outputSamples == null) {
          this.previousBlockSize = 0;
          this.previousBlock = new float[longBlockSize];
          this.outputSamples = new byte[this.sampleCount];
          this.outputPosition = 0;
          this.nextPacket = 0;
        }
        while (this.nextPacket < this.packets.length) {
          if (budget != null &&
            budget[0] <= 0) {
            return null;
          }
          overlapSamples = this.decodePacket(this.nextPacket);
          if (overlapSamples != null) {
            position = this.outputPosition;
            availableSamples = overlapSamples.length;
            if (availableSamples > this.sampleCount - position) {
              availableSamples = this.sampleCount - position;
            }
            for (sampleIndex = 0; sampleIndex < availableSamples; sampleIndex++) {
              unsignedSample = (int)(128.0f + overlapSamples[sampleIndex] * 128.0f);
              if ((unsignedSample & -256) != 0) {
                unsignedSample = ~unsignedSample >> 31;
              }
              writeIndex = position;
              position++;
              this.outputSamples[writeIndex] = (byte)(unsignedSample - 128);
            }
            if (budget != null) {
              budget[0] = budget[0] - (position - this.outputPosition);
            }
            this.outputPosition = position;
          }
          this.nextPacket = this.nextPacket + 1;
        }
        this.previousBlock = null;
        completedOutput = this.outputSamples;
        this.outputSamples = null;
        return new PcmSound(this.sampleRate, completedOutput, this.loopStart, this.loopEnd, this.pingPong);
    }

    public static void releaseScratch() {
        bitData = null;
        codebooks = null;
        floors = null;
        residues = null;
        mappings = null;
        longBlockModes = null;
        modeMappings = null;
        blockScratch = null;
        shortTrigA = null;
        shortTrigB = null;
        shortTrigC = null;
        longTrigA = null;
        longTrigB = null;
        longTrigC = null;
        shortBitReverse = null;
        longBitReverse = null;
    }

    final static VorbisSample loadByName(ResourceArchive archive, String groupName, String fileName) {
        try {
          VorbisSample sample = null;
          if (!VorbisSample.ensureSetup(archive)) {
            archive.ensureFileAvailableByName(fileName, groupName, 0);
            return null;
          }
          byte[] data = archive.takeFileByName(85, groupName, fileName);
          if (data == null) {
            return null;
          }
          Object unusedSampleObject = null;
          try {
            sample = new VorbisSample(data);
          } catch (IOException invalidContainer) {
            invalidContainer.printStackTrace();
          }
          return sample;
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    private final float[] decodePacket(int packetIndex) {
        int butterflyIndex = 0;
        int selectedBlockSize = 0;
        int previousLongFlag = 0;
        int nextLongFlag = 0;
        int absentFloorFlag = 0;
        float[] selectedTrigA = null;
        float[] selectedTrigB = null;
        float[] selectedTrigC = null;
        int[] selectedBitReverse = null;
        boolean completedSilentFlag = false;
        int mode;
        int longBlock;
        int blockSize;
        int previousLong;
        int nextLong;
        int windowHalf;
        int leftWindowStart;
        int leftWindowEnd;
        int leftWindowLength;
        int rightWindowStart;
        int rightWindowEnd;
        int rightWindowLength;
        VorbisMapping mapping;
        int silent;
        int selectedSubmap;
        int selectedFloor;
        Object overlapResult;
        int appliedFloor;
        float[] swappedBlock;
        int eighthBlock;
        float[] transformBlock;
        int previousTailIndex;
        int prescaleIndex;
        float[] trigA;
        float[] trigB;
        float[] trigC;
        int[] bitReverse;
        int preRotateIndex;
        int stage;
        float outerDifference;
        float innerDifference;
        int groupSpan;
        float preRotateCos;
        int trigStride;
        float preRotateNegSin;
        int group;
        float mergeCos;
        int leftBase;
        float mergeNegSin;
        int rightBase;
        float reflectedOdd;
        float combinedEven;
        int butterflyOffset;
        float leftOdd1;
        float leftOdd3;
        float rightOdd1;
        float rightOdd3;
        float stageCos;
        float stageNegSin;
        float[] overlapSamples;
        int mirrorIndex;
        VorbisResidue residue;
        int[] bitReverseStorage;
        float[] transformAlias;
        float[] overlapAlias;
        int[] bitReverseAlias;
        float[] transformStorage;
        float[] overlapStorage;
        float[] residueTarget;
        int skipResidue;
        int submapIndex;
        int appliedSubmap;
        int halfBlock;
        int previousTailSample;
        int currentOverlapIndex;
        int unusedMirrorIndex;
        int mergeIndex;
        int blockBits;
        int reverseIndex;
        int compactIndex;
        int scatterIndex;
        int postRotateIndex;
        int finalRotateIndex;
        int negativeTailIndex;
        int shiftQuarterIndex;
        int negativeQuarterIndex;
        int reflectHalfIndex;
        int leftWindowSample;
        int rightWindowSample;
        float upperOdd3;
        float upperOdd1;
        float postRotateCos;
        float leftWindowSine;
        float rightWindowSine;
        int reversedIndex;
        float lowerOdd3;
        float postRotateNegSin;
        int reverseSource;
        float lowerOdd1;
        float forwardEven;
        int reverseDestination;
        float swapOdd1;
        float forwardOdd;
        float reflectedEven;
        float combinedOdd;
        int currentHeadSample;
        float swapOdd3;
        float swapOdd5;
        float swapOdd7;
        int quarterBlock;
        int overlapLength;
        VorbisSample.setBitInput(this.packets[packetIndex], 0);
        VorbisSample.readBit();
        mode = VorbisSample.readBits(ed.unsignedBitLength(9, modeMappings.length - 1));
        longBlock = longBlockModes[mode] ? 1 : 0;
        if (longBlock == 0) {
          selectedBlockSize = shortBlockSize;
        } else {
          selectedBlockSize = longBlockSize;
        }
        blockSize = selectedBlockSize;
        previousLong = 0;
        nextLong = 0;
        if (longBlock != 0) {
          previousLongFlag = (VorbisSample.readBit() == 0) ? 0 : 1;
          previousLong = previousLongFlag;
          nextLongFlag = (VorbisSample.readBit() == 0) ? 0 : 1;
          nextLong = nextLongFlag;
        }
        windowHalf = blockSize >> 1;
        if (longBlock != 0 &&
          previousLong == 0) {
          leftWindowStart = (blockSize >> 2) - (shortBlockSize >> 2);
          leftWindowEnd = (blockSize >> 2) + (shortBlockSize >> 2);
          leftWindowLength = shortBlockSize >> 1;
        } else {
          leftWindowStart = 0;
          leftWindowEnd = windowHalf;
          leftWindowLength = blockSize >> 1;
        }
        if (longBlock != 0 &&
          nextLong == 0) {
          rightWindowStart = blockSize - (blockSize >> 2) - (shortBlockSize >> 2);
          rightWindowEnd = blockSize - (blockSize >> 2) + (shortBlockSize >> 2);
          rightWindowLength = shortBlockSize >> 1;
        } else {
          rightWindowStart = windowHalf;
          rightWindowEnd = blockSize;
          rightWindowLength = blockSize >> 1;
        }
        mapping = mappings[modeMappings[mode]];
        selectedSubmap = mapping.mux;
        selectedFloor = mapping.submapFloors[selectedSubmap];
        absentFloorFlag = (floors[selectedFloor].decode()) ? 0 : 1;
        silent = absentFloorFlag;
        skipResidue = silent;
        for (submapIndex = 0; submapIndex < mapping.submapCount; submapIndex++) {
          residue = residues[mapping.submapResidues[submapIndex]];
          residueTarget = blockScratch;
          residue.decode(residueTarget, blockSize >> 1, skipResidue != 0);
        }
        if (silent == 0) {
          appliedSubmap = mapping.mux;
          appliedFloor = mapping.submapFloors[appliedSubmap];
          floors[appliedFloor].apply(blockScratch, blockSize >> 1);
        }
        if (silent != 0) {
          for (halfBlock = blockSize >> 1; halfBlock < blockSize; halfBlock++) {
            blockScratch[halfBlock] = 0.0f;
          }
        } else {
          halfBlock = blockSize >> 1;
          quarterBlock = blockSize >> 2;
          eighthBlock = blockSize >> 3;
          transformStorage = blockScratch;
          transformAlias = transformStorage;
          transformBlock = transformAlias;
          for (prescaleIndex = 0; prescaleIndex < halfBlock; prescaleIndex++) {
            transformBlock[prescaleIndex] = transformBlock[prescaleIndex] * 0.5f;
          }
          mirrorIndex = halfBlock;
          unusedMirrorIndex = mirrorIndex;
          while (mirrorIndex < blockSize) {
            transformBlock[mirrorIndex] = -transformBlock[blockSize - mirrorIndex - 1];
            mirrorIndex++;
          }
          if (longBlock == 0) {
            selectedTrigA = (float[]) (shortTrigA);
          } else {
            selectedTrigA = (float[]) (longTrigA);
          }
          trigA = selectedTrigA;
          if (longBlock == 0) {
            selectedTrigB = (float[]) (shortTrigB);
          } else {
            selectedTrigB = (float[]) (longTrigB);
          }
          trigB = selectedTrigB;
          if (longBlock == 0) {
            selectedTrigC = (float[]) (shortTrigC);
          } else {
            selectedTrigC = (float[]) (longTrigC);
          }
          trigC = selectedTrigC;
          if (longBlock == 0) {
            selectedBitReverse = (int[]) (shortBitReverse);
          } else {
            selectedBitReverse = (int[]) (longBitReverse);
          }
          bitReverseAlias = selectedBitReverse;
          bitReverseStorage = bitReverseAlias;
          bitReverse = bitReverseStorage;
          for (preRotateIndex = 0; preRotateIndex < quarterBlock; preRotateIndex++) {
            outerDifference = transformBlock[4 * preRotateIndex] - transformBlock[blockSize - 4 * preRotateIndex - 1];
            innerDifference = transformBlock[4 * preRotateIndex + 2] - transformBlock[blockSize - 4 * preRotateIndex - 3];
            preRotateCos = trigA[2 * preRotateIndex];
            preRotateNegSin = trigA[2 * preRotateIndex + 1];
            transformBlock[blockSize - 4 * preRotateIndex - 1] = outerDifference * preRotateCos - innerDifference * preRotateNegSin;
            transformBlock[blockSize - 4 * preRotateIndex - 3] = outerDifference * preRotateNegSin + innerDifference * preRotateCos;
          }
          for (mergeIndex = 0; mergeIndex < eighthBlock; mergeIndex++) {
            upperOdd3 = transformBlock[halfBlock + 3 + 4 * mergeIndex];
            upperOdd1 = transformBlock[halfBlock + 1 + 4 * mergeIndex];
            lowerOdd3 = transformBlock[4 * mergeIndex + 3];
            lowerOdd1 = transformBlock[4 * mergeIndex + 1];
            transformBlock[halfBlock + 3 + 4 * mergeIndex] = upperOdd3 + lowerOdd3;
            transformBlock[halfBlock + 1 + 4 * mergeIndex] = upperOdd1 + lowerOdd1;
            mergeCos = trigA[halfBlock - 4 - 4 * mergeIndex];
            mergeNegSin = trigA[halfBlock - 3 - 4 * mergeIndex];
            transformBlock[4 * mergeIndex + 3] = (upperOdd3 - lowerOdd3) * mergeCos - (upperOdd1 - lowerOdd1) * mergeNegSin;
            transformBlock[4 * mergeIndex + 1] = (upperOdd1 - lowerOdd1) * mergeCos + (upperOdd3 - lowerOdd3) * mergeNegSin;
          }
          blockBits = ed.unsignedBitLength(9, blockSize - 1);
          for (stage = 0; stage < blockBits - 3; stage++) {
            groupSpan = blockSize >> stage + 2;
            trigStride = 8 << stage;
            for (group = 0; group < 2 << stage; group++) {
              leftBase = blockSize - groupSpan * 2 * group;
              rightBase = blockSize - groupSpan * (2 * group + 1);
              for (butterflyIndex = 0; butterflyIndex < blockSize >> stage + 4; butterflyIndex++) {
                butterflyOffset = 4 * butterflyIndex;
                leftOdd1 = transformBlock[leftBase - 1 - butterflyOffset];
                leftOdd3 = transformBlock[leftBase - 3 - butterflyOffset];
                rightOdd1 = transformBlock[rightBase - 1 - butterflyOffset];
                rightOdd3 = transformBlock[rightBase - 3 - butterflyOffset];
                transformBlock[leftBase - 1 - butterflyOffset] = leftOdd1 + rightOdd1;
                transformBlock[leftBase - 3 - butterflyOffset] = leftOdd3 + rightOdd3;
                stageCos = trigA[butterflyIndex * trigStride];
                stageNegSin = trigA[butterflyIndex * trigStride + 1];
                transformBlock[rightBase - 1 - butterflyOffset] = (leftOdd1 - rightOdd1) * stageCos - (leftOdd3 - rightOdd3) * stageNegSin;
                transformBlock[rightBase - 3 - butterflyOffset] = (leftOdd3 - rightOdd3) * stageCos + (leftOdd1 - rightOdd1) * stageNegSin;
              }
            }
          }
          for (reverseIndex = 1; reverseIndex < eighthBlock - 1; reverseIndex++) {
            reversedIndex = bitReverseAlias[reverseIndex];
            if (reverseIndex < reversedIndex) {
              reverseSource = 8 * reverseIndex;
              reverseDestination = 8 * reversedIndex;
              swapOdd1 = transformBlock[reverseSource + 1];
              transformBlock[reverseSource + 1] = transformBlock[reverseDestination + 1];
              transformBlock[reverseDestination + 1] = swapOdd1;
              swapOdd3 = transformBlock[reverseSource + 3];
              transformBlock[reverseSource + 3] = transformBlock[reverseDestination + 3];
              transformBlock[reverseDestination + 3] = swapOdd3;
              swapOdd5 = transformBlock[reverseSource + 5];
              transformBlock[reverseSource + 5] = transformBlock[reverseDestination + 5];
              transformBlock[reverseDestination + 5] = swapOdd5;
              swapOdd7 = transformBlock[reverseSource + 7];
              transformBlock[reverseSource + 7] = transformBlock[reverseDestination + 7];
              transformBlock[reverseDestination + 7] = swapOdd7;
            }
          }
          for (compactIndex = 0; compactIndex < halfBlock; compactIndex++) {
            transformBlock[compactIndex] = transformBlock[2 * compactIndex + 1];
          }
          for (scatterIndex = 0; scatterIndex < eighthBlock; scatterIndex++) {
            transformBlock[blockSize - 1 - 2 * scatterIndex] = transformBlock[4 * scatterIndex];
            transformBlock[blockSize - 2 - 2 * scatterIndex] = transformBlock[4 * scatterIndex + 1];
            transformBlock[blockSize - quarterBlock - 1 - 2 * scatterIndex] = transformBlock[4 * scatterIndex + 2];
            transformBlock[blockSize - quarterBlock - 2 - 2 * scatterIndex] = transformBlock[4 * scatterIndex + 3];
          }
          for (postRotateIndex = 0; postRotateIndex < eighthBlock; postRotateIndex++) {
            postRotateCos = trigC[2 * postRotateIndex];
            postRotateNegSin = trigC[2 * postRotateIndex + 1];
            forwardEven = transformBlock[halfBlock + 2 * postRotateIndex];
            forwardOdd = transformBlock[halfBlock + 2 * postRotateIndex + 1];
            reflectedEven = transformBlock[blockSize - 2 - 2 * postRotateIndex];
            reflectedOdd = transformBlock[blockSize - 1 - 2 * postRotateIndex];
            combinedEven = postRotateNegSin * (forwardEven - reflectedEven) + postRotateCos * (forwardOdd + reflectedOdd);
            transformBlock[halfBlock + 2 * postRotateIndex] = (forwardEven + reflectedEven + combinedEven) * 0.5f;
            transformBlock[blockSize - 2 - 2 * postRotateIndex] = (forwardEven + reflectedEven - combinedEven) * 0.5f;
            combinedOdd = postRotateNegSin * (forwardOdd + reflectedOdd) - postRotateCos * (forwardEven - reflectedEven);
            transformBlock[halfBlock + 2 * postRotateIndex + 1] = (forwardOdd - reflectedOdd + combinedOdd) * 0.5f;
            transformBlock[blockSize - 1 - 2 * postRotateIndex] = (-forwardOdd + reflectedOdd + combinedOdd) * 0.5f;
          }
          for (finalRotateIndex = 0; finalRotateIndex < quarterBlock; finalRotateIndex++) {
            transformBlock[finalRotateIndex] = transformBlock[2 * finalRotateIndex + halfBlock] * trigB[2 * finalRotateIndex] + transformBlock[2 * finalRotateIndex + 1 + halfBlock] * trigB[2 * finalRotateIndex + 1];
            transformBlock[halfBlock - 1 - finalRotateIndex] = transformBlock[2 * finalRotateIndex + halfBlock] * trigB[2 * finalRotateIndex + 1] - transformBlock[2 * finalRotateIndex + 1 + halfBlock] * trigB[2 * finalRotateIndex];
          }
          for (negativeTailIndex = 0; negativeTailIndex < quarterBlock; negativeTailIndex++) {
            transformBlock[blockSize - quarterBlock + negativeTailIndex] = -transformStorage[negativeTailIndex];
          }
          for (shiftQuarterIndex = 0; shiftQuarterIndex < quarterBlock; shiftQuarterIndex++) {
            transformBlock[shiftQuarterIndex] = transformBlock[quarterBlock + shiftQuarterIndex];
          }
          for (negativeQuarterIndex = 0; negativeQuarterIndex < quarterBlock; negativeQuarterIndex++) {
            transformBlock[quarterBlock + negativeQuarterIndex] = -transformBlock[quarterBlock - negativeQuarterIndex - 1];
          }
          for (reflectHalfIndex = 0; reflectHalfIndex < quarterBlock; reflectHalfIndex++) {
            transformBlock[halfBlock + reflectHalfIndex] = transformBlock[blockSize - reflectHalfIndex - 1];
          }
          for (leftWindowSample = leftWindowStart; leftWindowSample < leftWindowEnd; leftWindowSample++) {
            leftWindowSine = (float)Math.sin(((double)(leftWindowSample - leftWindowStart) + 0.5) / (double)leftWindowLength * 0.5 * 3.141592653589793);
            blockScratch[leftWindowSample] = blockScratch[leftWindowSample] * (float)Math.sin(1.5707963267948966 * (double)leftWindowSine * (double)leftWindowSine);
          }
          for (rightWindowSample = rightWindowStart; rightWindowSample < rightWindowEnd; rightWindowSample++) {
            rightWindowSine = (float)Math.sin(((double)(rightWindowSample - rightWindowStart) + 0.5) / (double)rightWindowLength * 0.5 * 3.141592653589793 + 1.5707963267948966);
            blockScratch[rightWindowSample] = blockScratch[rightWindowSample] * (float)Math.sin(1.5707963267948966 * (double)rightWindowSine * (double)rightWindowSine);
          }
        }
        overlapResult = null;
        if (this.previousBlockSize > 0) {
          overlapLength = this.previousBlockSize + blockSize >> 2;
          overlapStorage = new float[overlapLength];
          overlapAlias = overlapStorage;
          overlapSamples = overlapAlias;
          overlapResult = overlapSamples;
          if (!this.previousSilent) {
            for (previousTailSample = 0; previousTailSample < this.previousRightWindowCount; previousTailSample++) {
              previousTailIndex = (this.previousBlockSize >> 1) + previousTailSample;
              overlapSamples[previousTailSample] = overlapSamples[previousTailSample] + this.previousBlock[previousTailIndex];
            }
          }
          if (silent == 0) {
            for (currentHeadSample = leftWindowStart; currentHeadSample < blockSize >> 1; currentHeadSample++) {
              currentOverlapIndex = overlapStorage.length - (blockSize >> 1) + currentHeadSample;
              overlapSamples[currentOverlapIndex] = overlapSamples[currentOverlapIndex] + blockScratch[currentHeadSample];
            }
          }
        }
        swappedBlock = this.previousBlock;
        this.previousBlock = blockScratch;
        blockScratch = swappedBlock;
        this.previousBlockSize = blockSize;
        this.previousRightWindowCount = rightWindowEnd - (blockSize >> 1);
        completedSilentFlag = (silent != 0);
        this.previousSilent = completedSilentFlag;
        return (float[]) (overlapResult);
    }

    private VorbisSample(byte[] data) throws IOException {
        this.decodeContainer(data);
    }

    static {
        setupReady = false;
    }
}
