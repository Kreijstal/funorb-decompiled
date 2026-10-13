/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class VorbisSample extends IntrusiveNode {
    private int decodedSampleCount;
    private int previousRightWindowSize;
    private byte[][] packets;
    private boolean previousBlockSilent;
    private static float[] smallTrigA;
    private int previousBlockSize;
    private static int largeBlockSize;
    private int sampleCount;
    private boolean loopModeFlag;
    private int nextPacketIndex;
    private static int bitIndex;
    private int loopEnd;
    private static int[] largeBitReverse;
    private static int smallBlockSize;
    private static int byteIndex;
    private static float[] largeTrigB;
    private static int[] modeMappingIds;
    private static float[] smallTrigC;
    static VorbisCodebook[] codebooks;
    private static float[] smallTrigB;
    private static boolean setupInitialized;
    private static float[] largeTrigA;
    private static float[] transformScratch;
    private static int[] smallBitReverse;
    private static byte[] bitData;
    private static VorbisResidue[] residues;
    private static VorbisFloor[] floors;
    private static boolean[] modeUsesLargeBlock;
    private byte[] decodedSamples;
    private static VorbisMapping[] mappings;
    private int sampleRate;
    private int loopStart;
    private static float[] largeTrigC;
    private float[] previousBlock;

    final static int readBit() {
        int bit = bitData[byteIndex] >> bitIndex & 1;
        bitIndex = bitIndex + 1;
        byteIndex = byteIndex + (bitIndex >> 3);
        bitIndex = bitIndex & 7;
        return bit;
    }

    final static void decodeSetup(byte[] encodedSetup) {
        int trigAIndex = 0;
        int trigBIndex = 0;
        int trigCIndex = 0;
        int reverseIndex = 0;
        int modeIndex = 0;
        int selectedBlockSize = 0;
        boolean[] modeFlagsTarget = null;
        int modeFlagIndex = 0;
        boolean modeLargeBlockFlag = false;
        int blockKind;
        int blockSize;
        int halfBlockSize;
        int quarterBlockSize;
        int eighthBlockSize;
        float[] trigA;
        float[] trigB;
        float[] trigC;
        int[] bitReverse;
        int reverseBits;
        int codebookCount;
        int codebookIndex;
        int timeTransformCount;
        int floorCount;
        int timeTransformIndex;
        int floorIndex;
        int residueCount;
        int residueIndex;
        int mappingCount;
        int mappingIndex;
        int modeCount;
        VorbisSample.setBitStream(encodedSetup, 0);
        smallBlockSize = 1 << VorbisSample.readBits(4);
        largeBlockSize = 1 << VorbisSample.readBits(4);
        transformScratch = new float[largeBlockSize];
        for (blockKind = 0; blockKind < 2; blockKind++) {
          if (blockKind == 0) {
            selectedBlockSize = smallBlockSize;
          } else {
            selectedBlockSize = largeBlockSize;
          }
          blockSize = selectedBlockSize;
          halfBlockSize = blockSize >> 1;
          quarterBlockSize = blockSize >> 2;
          eighthBlockSize = blockSize >> 3;
          trigA = new float[halfBlockSize];
          for (trigAIndex = 0; trigAIndex < quarterBlockSize; trigAIndex++) {
            trigA[2 * trigAIndex] = (float)Math.cos((double)(4 * trigAIndex) * 3.141592653589793 / (double)blockSize);
            trigA[2 * trigAIndex + 1] = -(float)Math.sin((double)(4 * trigAIndex) * 3.141592653589793 / (double)blockSize);
          }
          trigB = new float[halfBlockSize];
          for (trigBIndex = 0; trigBIndex < quarterBlockSize; trigBIndex++) {
            trigB[2 * trigBIndex] = (float)Math.cos((double)(2 * trigBIndex + 1) * 3.141592653589793 / (double)(2 * blockSize));
            trigB[2 * trigBIndex + 1] = (float)Math.sin((double)(2 * trigBIndex + 1) * 3.141592653589793 / (double)(2 * blockSize));
          }
          trigC = new float[quarterBlockSize];
          for (trigCIndex = 0; trigCIndex < eighthBlockSize; trigCIndex++) {
            trigC[2 * trigCIndex] = (float)Math.cos((double)(4 * trigCIndex + 2) * 3.141592653589793 / (double)blockSize);
            trigC[2 * trigCIndex + 1] = -(float)Math.sin((double)(4 * trigCIndex + 2) * 3.141592653589793 / (double)blockSize);
          }
          bitReverse = new int[eighthBlockSize];
          reverseBits = ModalDialog.bitLength(eighthBlockSize - 1, -13337);
          for (reverseIndex = 0; reverseIndex < eighthBlockSize; reverseIndex++) {
            bitReverse[reverseIndex] = qt.reverseBits(reverseIndex, reverseBits, (byte) -114);
          }
          if (blockKind == 0) {
            smallTrigA = trigA;
            smallTrigB = trigB;
            smallTrigC = trigC;
            smallBitReverse = bitReverse;
          } else {
            largeTrigA = trigA;
            largeTrigB = trigB;
            largeTrigC = trigC;
            largeBitReverse = bitReverse;
          }
        }
        codebookCount = VorbisSample.readBits(8) + 1;
        codebooks = new VorbisCodebook[codebookCount];
        for (codebookIndex = 0; codebookIndex < codebookCount; codebookIndex++) {
          codebooks[codebookIndex] = new VorbisCodebook();
        }
        timeTransformCount = VorbisSample.readBits(6) + 1;
        for (timeTransformIndex = 0; timeTransformIndex < timeTransformCount; timeTransformIndex++) {
          VorbisSample.readBits(16);
        }
        floorCount = VorbisSample.readBits(6) + 1;
        floors = new VorbisFloor[floorCount];
        for (floorIndex = 0; floorIndex < floorCount; floorIndex++) {
          floors[floorIndex] = new VorbisFloor();
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
        modeUsesLargeBlock = new boolean[modeCount];
        modeMappingIds = new int[modeCount];
        for (modeIndex = 0; modeIndex < modeCount; modeIndex++) {
          modeFlagsTarget = (boolean[]) (modeUsesLargeBlock);
          modeFlagIndex = modeIndex;
          modeLargeBlockFlag = (VorbisSample.readBit() != 0);
          modeFlagsTarget[modeFlagIndex] = modeLargeBlockFlag;
          VorbisSample.readBits(16);
          VorbisSample.readBits(16);
          modeMappingIds[modeIndex] = VorbisSample.readBits(8);
        }
        setupInitialized = true;
    }

    private final static void setBitStream(byte[] data, int byteOffset) {
        bitData = data;
        byteIndex = byteOffset;
        bitIndex = 0;
    }

    final static int readBits(int bitCount) {
        int byteMask = 0;
        int availableBits = 0;
        int value = 0;
        int valueShift = 0;
        int remainingMask;
        while (bitCount >= 8 - bitIndex) {
          availableBits = 8 - bitIndex;
          byteMask = (1 << availableBits) - 1;
          value = value + ((bitData[byteIndex] >> bitIndex & byteMask) << valueShift);
          bitIndex = 0;
          byteIndex = byteIndex + 1;
          valueShift = valueShift + availableBits;
          bitCount = bitCount - availableBits;
        }
        if (bitCount > 0) {
          remainingMask = (1 << bitCount) - 1;
          value = value + ((bitData[byteIndex] >> bitIndex & remainingMask) << valueShift);
          bitIndex = bitIndex + bitCount;
        }
        return value;
    }

    final PcmSample decodeToPcm(int[] sampleBudget) {
        int sampleIndex = 0;
        int writeIndex = 0;
        int outputPosition;
        int outputCount;
        int unsignedSample;
        float[] packetSamples;
        byte[] samples;
        if (sampleBudget != null &&
          sampleBudget[0] <= 0) {
          return null;
        }
        if (this.decodedSamples == null) {
          this.previousBlockSize = 0;
          this.previousBlock = new float[largeBlockSize];
          this.decodedSamples = new byte[this.sampleCount];
          this.decodedSampleCount = 0;
          this.nextPacketIndex = 0;
        }
        while (this.nextPacketIndex < this.packets.length) {
          if (sampleBudget != null &&
            sampleBudget[0] <= 0) {
            return null;
          }
          packetSamples = this.decodePacket(this.nextPacketIndex);
          if (packetSamples != null) {
            outputPosition = this.decodedSampleCount;
            outputCount = packetSamples.length;
            if (outputCount > this.sampleCount - outputPosition) {
              outputCount = this.sampleCount - outputPosition;
            }
            for (sampleIndex = 0; sampleIndex < outputCount; sampleIndex++) {
              unsignedSample = (int)(128.0f + packetSamples[sampleIndex] * 128.0f);
              if ((unsignedSample & -256) != 0) {
                unsignedSample = ~unsignedSample >> 31;
              }
              writeIndex = outputPosition;
              outputPosition++;
              this.decodedSamples[writeIndex] = (byte)(unsignedSample - 128);
            }
            if (sampleBudget != null) {
              sampleBudget[0] = sampleBudget[0] - (outputPosition - this.decodedSampleCount);
            }
            this.decodedSampleCount = outputPosition;
          }
          this.nextPacketIndex = this.nextPacketIndex + 1;
        }
        this.previousBlock = null;
        samples = this.decodedSamples;
        this.decodedSamples = null;
        return new PcmSample(this.sampleRate, samples, this.loopStart, this.loopEnd, this.loopModeFlag);
    }

    private final float[] decodePacket(int packetIndex) {
        int butterflyIndex = 0;
        int selectedBlockSize = 0;
        int previousWindowFlag = 0;
        int nextWindowFlag = 0;
        int floorSilentFlag = 0;
        float[] selectedTrigA = null;
        float[] selectedTrigB = null;
        float[] selectedTrigC = null;
        int[] selectedBitReverse = null;
        boolean blockSilentFlag = false;
        int modeId;
        int usesLargeBlock;
        int blockSize;
        int previousUsesLargeBlock;
        int nextUsesLargeBlock;
        int halfBlockSize;
        int leftWindowStart;
        int leftWindowEnd;
        int leftWindowSize;
        int rightWindowStart;
        int rightWindowEnd;
        int rightWindowSize;
        VorbisMapping mapping;
        int silent;
        int selectedSubmap;
        int floorId;
        Object overlapOutputReference;
        int activeFloorId;
        float[] oldPreviousBlock;
        int eighthBlockSize;
        float[] transformBuffer;
        int previousOverlapSampleIndex;
        int scaleIndex;
        float[] trigA;
        float[] trigB;
        float[] trigC;
        int[] bitReverseAlias;
        int preRotationIndex;
        int stage;
        float preRotationReal;
        float preRotationImaginary;
        int groupSize;
        float preRotationCosine;
        int trigStride;
        float preRotationSine;
        int groupIndex;
        float firstButterflyCosine;
        int firstGroupEnd;
        float firstButterflySine;
        int secondGroupEnd;
        float postRotationImaginaryB;
        float postRotationMixReal;
        int butterflyOffset;
        float butterflyRealA;
        float butterflyImaginaryA;
        float butterflyRealB;
        float butterflyImaginaryB;
        float stageCosine;
        float stageSine;
        float[] overlapOutput;
        int mirrorIndex;
        VorbisResidue residue;
        int[] bitReverseBufferAlias;
        float[] transformBufferAlias;
        float[] overlapBufferAlias;
        int[] bitReverse;
        float[] transformBufferSource;
        float[] overlapBuffer;
        float[] residueOutput;
        int skipResidue;
        int submapIndex;
        int activeSubmap;
        int halfTransformSize;
        int previousOverlapIndex;
        int currentOverlapOutputIndex;
        int initialMirrorIndex;
        int firstButterflyIndex;
        int blockLog2;
        int reverseIndex;
        int compactIndex;
        int reorderIndex;
        int postRotationIndex;
        int finalRotationIndex;
        int copyTailIndex;
        int copyHeadIndex;
        int reflectHeadIndex;
        int reflectTailIndex;
        int leftWindowIndex;
        int rightWindowIndex;
        float firstButterflyRealA;
        float firstButterflyImaginaryA;
        float postRotationCosine;
        float leftWindowSine;
        float rightWindowSine;
        int reversedIndex;
        float firstButterflyRealB;
        float postRotationSine;
        int firstSwapOffset;
        float firstButterflyImaginaryB;
        float postRotationRealA;
        int secondSwapOffset;
        float swapOne;
        float postRotationImaginaryA;
        float postRotationRealB;
        float postRotationMixImaginary;
        int currentOverlapIndex;
        float swapThree;
        float swapFive;
        float swapSeven;
        int quarterTransformSize;
        int overlapLength;
        VorbisSample.setBitStream(this.packets[packetIndex], 0);
        VorbisSample.readBit();
        modeId = VorbisSample.readBits(ModalDialog.bitLength(modeMappingIds.length - 1, -13337));
        usesLargeBlock = modeUsesLargeBlock[modeId] ? 1 : 0;
        if (usesLargeBlock == 0) {
          selectedBlockSize = smallBlockSize;
        } else {
          selectedBlockSize = largeBlockSize;
        }
        blockSize = selectedBlockSize;
        previousUsesLargeBlock = 0;
        nextUsesLargeBlock = 0;
        if (usesLargeBlock != 0) {
          previousWindowFlag = (VorbisSample.readBit() == 0) ? 0 : 1;
          previousUsesLargeBlock = previousWindowFlag;
          nextWindowFlag = (VorbisSample.readBit() == 0) ? 0 : 1;
          nextUsesLargeBlock = nextWindowFlag;
        }
        halfBlockSize = blockSize >> 1;
        if (usesLargeBlock != 0 &&
          previousUsesLargeBlock == 0) {
          leftWindowStart = (blockSize >> 2) - (smallBlockSize >> 2);
          leftWindowEnd = (blockSize >> 2) + (smallBlockSize >> 2);
          leftWindowSize = smallBlockSize >> 1;
        } else {
          leftWindowStart = 0;
          leftWindowEnd = halfBlockSize;
          leftWindowSize = blockSize >> 1;
        }
        if (usesLargeBlock != 0 &&
          nextUsesLargeBlock == 0) {
          rightWindowStart = blockSize - (blockSize >> 2) - (smallBlockSize >> 2);
          rightWindowEnd = blockSize - (blockSize >> 2) + (smallBlockSize >> 2);
          rightWindowSize = smallBlockSize >> 1;
        } else {
          rightWindowStart = halfBlockSize;
          rightWindowEnd = blockSize;
          rightWindowSize = blockSize >> 1;
        }
        mapping = mappings[modeMappingIds[modeId]];
        selectedSubmap = mapping.selectedSubmap;
        floorId = mapping.floorIds[selectedSubmap];
        floorSilentFlag = (floors[floorId].decodeFloor()) ? 0 : 1;
        silent = floorSilentFlag;
        skipResidue = silent;
        for (submapIndex = 0; submapIndex < mapping.submapCount; submapIndex++) {
          residue = residues[mapping.residueIds[submapIndex]];
          residueOutput = transformScratch;
          residue.decode(residueOutput, blockSize >> 1, skipResidue != 0);
        }
        if (silent == 0) {
          activeSubmap = mapping.selectedSubmap;
          activeFloorId = mapping.floorIds[activeSubmap];
          floors[activeFloorId].applyFloor(transformScratch, blockSize >> 1);
        }
        if (silent != 0) {
          for (halfTransformSize = blockSize >> 1; halfTransformSize < blockSize; halfTransformSize++) {
            transformScratch[halfTransformSize] = 0.0f;
          }
        } else {
          halfTransformSize = blockSize >> 1;
          quarterTransformSize = blockSize >> 2;
          eighthBlockSize = blockSize >> 3;
          transformBufferSource = transformScratch;
          transformBufferAlias = transformBufferSource;
          transformBuffer = transformBufferAlias;
          for (scaleIndex = 0; scaleIndex < halfTransformSize; scaleIndex++) {
            transformBuffer[scaleIndex] = transformBuffer[scaleIndex] * 0.5f;
          }
          mirrorIndex = halfTransformSize;
          initialMirrorIndex = mirrorIndex;
          while (mirrorIndex < blockSize) {
            transformBuffer[mirrorIndex] = -transformBuffer[blockSize - mirrorIndex - 1];
            mirrorIndex++;
          }
          if (usesLargeBlock == 0) {
            selectedTrigA = (float[]) (smallTrigA);
          } else {
            selectedTrigA = (float[]) (largeTrigA);
          }
          trigA = selectedTrigA;
          if (usesLargeBlock == 0) {
            selectedTrigB = (float[]) (smallTrigB);
          } else {
            selectedTrigB = (float[]) (largeTrigB);
          }
          trigB = selectedTrigB;
          if (usesLargeBlock == 0) {
            selectedTrigC = (float[]) (smallTrigC);
          } else {
            selectedTrigC = (float[]) (largeTrigC);
          }
          trigC = selectedTrigC;
          if (usesLargeBlock == 0) {
            selectedBitReverse = (int[]) (smallBitReverse);
          } else {
            selectedBitReverse = (int[]) (largeBitReverse);
          }
          bitReverse = selectedBitReverse;
          bitReverseBufferAlias = bitReverse;
          bitReverseAlias = bitReverseBufferAlias;
          for (preRotationIndex = 0; preRotationIndex < quarterTransformSize; preRotationIndex++) {
            preRotationReal = transformBuffer[4 * preRotationIndex] - transformBuffer[blockSize - 4 * preRotationIndex - 1];
            preRotationImaginary = transformBuffer[4 * preRotationIndex + 2] - transformBuffer[blockSize - 4 * preRotationIndex - 3];
            preRotationCosine = trigA[2 * preRotationIndex];
            preRotationSine = trigA[2 * preRotationIndex + 1];
            transformBuffer[blockSize - 4 * preRotationIndex - 1] = preRotationReal * preRotationCosine - preRotationImaginary * preRotationSine;
            transformBuffer[blockSize - 4 * preRotationIndex - 3] = preRotationReal * preRotationSine + preRotationImaginary * preRotationCosine;
          }
          for (firstButterflyIndex = 0; firstButterflyIndex < eighthBlockSize; firstButterflyIndex++) {
            firstButterflyRealA = transformBuffer[halfTransformSize + 3 + 4 * firstButterflyIndex];
            firstButterflyImaginaryA = transformBuffer[halfTransformSize + 1 + 4 * firstButterflyIndex];
            firstButterflyRealB = transformBuffer[4 * firstButterflyIndex + 3];
            firstButterflyImaginaryB = transformBuffer[4 * firstButterflyIndex + 1];
            transformBuffer[halfTransformSize + 3 + 4 * firstButterflyIndex] = firstButterflyRealA + firstButterflyRealB;
            transformBuffer[halfTransformSize + 1 + 4 * firstButterflyIndex] = firstButterflyImaginaryA + firstButterflyImaginaryB;
            firstButterflyCosine = trigA[halfTransformSize - 4 - 4 * firstButterflyIndex];
            firstButterflySine = trigA[halfTransformSize - 3 - 4 * firstButterflyIndex];
            transformBuffer[4 * firstButterflyIndex + 3] = (firstButterflyRealA - firstButterflyRealB) * firstButterflyCosine - (firstButterflyImaginaryA - firstButterflyImaginaryB) * firstButterflySine;
            transformBuffer[4 * firstButterflyIndex + 1] = (firstButterflyImaginaryA - firstButterflyImaginaryB) * firstButterflyCosine + (firstButterflyRealA - firstButterflyRealB) * firstButterflySine;
          }
          blockLog2 = ModalDialog.bitLength(blockSize - 1, -13337);
          for (stage = 0; stage < blockLog2 - 3; stage++) {
            groupSize = blockSize >> stage + 2;
            trigStride = 8 << stage;
            for (groupIndex = 0; groupIndex < 2 << stage; groupIndex++) {
              firstGroupEnd = blockSize - groupSize * 2 * groupIndex;
              secondGroupEnd = blockSize - groupSize * (2 * groupIndex + 1);
              for (butterflyIndex = 0; butterflyIndex < blockSize >> stage + 4; butterflyIndex++) {
                butterflyOffset = 4 * butterflyIndex;
                butterflyRealA = transformBuffer[firstGroupEnd - 1 - butterflyOffset];
                butterflyImaginaryA = transformBuffer[firstGroupEnd - 3 - butterflyOffset];
                butterflyRealB = transformBuffer[secondGroupEnd - 1 - butterflyOffset];
                butterflyImaginaryB = transformBuffer[secondGroupEnd - 3 - butterflyOffset];
                transformBuffer[firstGroupEnd - 1 - butterflyOffset] = butterflyRealA + butterflyRealB;
                transformBuffer[firstGroupEnd - 3 - butterflyOffset] = butterflyImaginaryA + butterflyImaginaryB;
                stageCosine = trigA[butterflyIndex * trigStride];
                stageSine = trigA[butterflyIndex * trigStride + 1];
                transformBuffer[secondGroupEnd - 1 - butterflyOffset] = (butterflyRealA - butterflyRealB) * stageCosine - (butterflyImaginaryA - butterflyImaginaryB) * stageSine;
                transformBuffer[secondGroupEnd - 3 - butterflyOffset] = (butterflyImaginaryA - butterflyImaginaryB) * stageCosine + (butterflyRealA - butterflyRealB) * stageSine;
              }
            }
          }
          for (reverseIndex = 1; reverseIndex < eighthBlockSize - 1; reverseIndex++) {
            reversedIndex = bitReverse[reverseIndex];
            if (reverseIndex < reversedIndex) {
              firstSwapOffset = 8 * reverseIndex;
              secondSwapOffset = 8 * reversedIndex;
              swapOne = transformBuffer[firstSwapOffset + 1];
              transformBuffer[firstSwapOffset + 1] = transformBuffer[secondSwapOffset + 1];
              transformBuffer[secondSwapOffset + 1] = swapOne;
              swapThree = transformBuffer[firstSwapOffset + 3];
              transformBuffer[firstSwapOffset + 3] = transformBuffer[secondSwapOffset + 3];
              transformBuffer[secondSwapOffset + 3] = swapThree;
              swapFive = transformBuffer[firstSwapOffset + 5];
              transformBuffer[firstSwapOffset + 5] = transformBuffer[secondSwapOffset + 5];
              transformBuffer[secondSwapOffset + 5] = swapFive;
              swapSeven = transformBuffer[firstSwapOffset + 7];
              transformBuffer[firstSwapOffset + 7] = transformBuffer[secondSwapOffset + 7];
              transformBuffer[secondSwapOffset + 7] = swapSeven;
            }
          }
          for (compactIndex = 0; compactIndex < halfTransformSize; compactIndex++) {
            transformBuffer[compactIndex] = transformBuffer[2 * compactIndex + 1];
          }
          for (reorderIndex = 0; reorderIndex < eighthBlockSize; reorderIndex++) {
            transformBuffer[blockSize - 1 - 2 * reorderIndex] = transformBuffer[4 * reorderIndex];
            transformBuffer[blockSize - 2 - 2 * reorderIndex] = transformBuffer[4 * reorderIndex + 1];
            transformBuffer[blockSize - quarterTransformSize - 1 - 2 * reorderIndex] = transformBuffer[4 * reorderIndex + 2];
            transformBuffer[blockSize - quarterTransformSize - 2 - 2 * reorderIndex] = transformBuffer[4 * reorderIndex + 3];
          }
          for (postRotationIndex = 0; postRotationIndex < eighthBlockSize; postRotationIndex++) {
            postRotationCosine = trigC[2 * postRotationIndex];
            postRotationSine = trigC[2 * postRotationIndex + 1];
            postRotationRealA = transformBuffer[halfTransformSize + 2 * postRotationIndex];
            postRotationImaginaryA = transformBuffer[halfTransformSize + 2 * postRotationIndex + 1];
            postRotationRealB = transformBuffer[blockSize - 2 - 2 * postRotationIndex];
            postRotationImaginaryB = transformBuffer[blockSize - 1 - 2 * postRotationIndex];
            postRotationMixReal = postRotationSine * (postRotationRealA - postRotationRealB) + postRotationCosine * (postRotationImaginaryA + postRotationImaginaryB);
            transformBuffer[halfTransformSize + 2 * postRotationIndex] = (postRotationRealA + postRotationRealB + postRotationMixReal) * 0.5f;
            transformBuffer[blockSize - 2 - 2 * postRotationIndex] = (postRotationRealA + postRotationRealB - postRotationMixReal) * 0.5f;
            postRotationMixImaginary = postRotationSine * (postRotationImaginaryA + postRotationImaginaryB) - postRotationCosine * (postRotationRealA - postRotationRealB);
            transformBuffer[halfTransformSize + 2 * postRotationIndex + 1] = (postRotationImaginaryA - postRotationImaginaryB + postRotationMixImaginary) * 0.5f;
            transformBuffer[blockSize - 1 - 2 * postRotationIndex] = (-postRotationImaginaryA + postRotationImaginaryB + postRotationMixImaginary) * 0.5f;
          }
          for (finalRotationIndex = 0; finalRotationIndex < quarterTransformSize; finalRotationIndex++) {
            transformBuffer[finalRotationIndex] = transformBuffer[2 * finalRotationIndex + halfTransformSize] * trigB[2 * finalRotationIndex] + transformBuffer[2 * finalRotationIndex + 1 + halfTransformSize] * trigB[2 * finalRotationIndex + 1];
            transformBuffer[halfTransformSize - 1 - finalRotationIndex] = transformBuffer[2 * finalRotationIndex + halfTransformSize] * trigB[2 * finalRotationIndex + 1] - transformBuffer[2 * finalRotationIndex + 1 + halfTransformSize] * trigB[2 * finalRotationIndex];
          }
          for (copyTailIndex = 0; copyTailIndex < quarterTransformSize; copyTailIndex++) {
            transformBuffer[blockSize - quarterTransformSize + copyTailIndex] = -transformBufferSource[copyTailIndex];
          }
          for (copyHeadIndex = 0; copyHeadIndex < quarterTransformSize; copyHeadIndex++) {
            transformBuffer[copyHeadIndex] = transformBuffer[quarterTransformSize + copyHeadIndex];
          }
          for (reflectHeadIndex = 0; reflectHeadIndex < quarterTransformSize; reflectHeadIndex++) {
            transformBuffer[quarterTransformSize + reflectHeadIndex] = -transformBuffer[quarterTransformSize - reflectHeadIndex - 1];
          }
          for (reflectTailIndex = 0; reflectTailIndex < quarterTransformSize; reflectTailIndex++) {
            transformBuffer[halfTransformSize + reflectTailIndex] = transformBuffer[blockSize - reflectTailIndex - 1];
          }
          for (leftWindowIndex = leftWindowStart; leftWindowIndex < leftWindowEnd; leftWindowIndex++) {
            leftWindowSine = (float)Math.sin(((double)(leftWindowIndex - leftWindowStart) + 0.5) / (double)leftWindowSize * 0.5 * 3.141592653589793);
            transformScratch[leftWindowIndex] = transformScratch[leftWindowIndex] * (float)Math.sin(1.5707963267948966 * (double)leftWindowSine * (double)leftWindowSine);
          }
          for (rightWindowIndex = rightWindowStart; rightWindowIndex < rightWindowEnd; rightWindowIndex++) {
            rightWindowSine = (float)Math.sin(((double)(rightWindowIndex - rightWindowStart) + 0.5) / (double)rightWindowSize * 0.5 * 3.141592653589793 + 1.5707963267948966);
            transformScratch[rightWindowIndex] = transformScratch[rightWindowIndex] * (float)Math.sin(1.5707963267948966 * (double)rightWindowSine * (double)rightWindowSine);
          }
        }
        overlapOutputReference = null;
        if (this.previousBlockSize > 0) {
          overlapLength = this.previousBlockSize + blockSize >> 2;
          overlapBuffer = new float[overlapLength];
          overlapBufferAlias = overlapBuffer;
          overlapOutput = overlapBufferAlias;
          overlapOutputReference = overlapOutput;
          if (!this.previousBlockSilent) {
            for (previousOverlapIndex = 0; previousOverlapIndex < this.previousRightWindowSize; previousOverlapIndex++) {
              previousOverlapSampleIndex = (this.previousBlockSize >> 1) + previousOverlapIndex;
              overlapOutput[previousOverlapIndex] = overlapOutput[previousOverlapIndex] + this.previousBlock[previousOverlapSampleIndex];
            }
          }
          if (silent == 0) {
            for (currentOverlapIndex = leftWindowStart; currentOverlapIndex < blockSize >> 1; currentOverlapIndex++) {
              currentOverlapOutputIndex = overlapBuffer.length - (blockSize >> 1) + currentOverlapIndex;
              overlapOutput[currentOverlapOutputIndex] = overlapOutput[currentOverlapOutputIndex] + transformScratch[currentOverlapIndex];
            }
          }
        }
        oldPreviousBlock = this.previousBlock;
        this.previousBlock = transformScratch;
        transformScratch = oldPreviousBlock;
        this.previousBlockSize = blockSize;
        this.previousRightWindowSize = rightWindowEnd - (blockSize >> 1);
        blockSilentFlag = (silent != 0);
        this.previousBlockSilent = blockSilentFlag;
        return (float[]) (overlapOutputReference);
    }

    public static void releaseSetup() {
        bitData = null;
        codebooks = null;
        floors = null;
        residues = null;
        mappings = null;
        modeUsesLargeBlock = null;
        modeMappingIds = null;
        transformScratch = null;
        smallTrigA = null;
        smallTrigB = null;
        smallTrigC = null;
        largeTrigA = null;
        largeTrigB = null;
        largeTrigC = null;
        smallBitReverse = null;
        largeBitReverse = null;
    }

    private final static boolean ensureSetup(ResourceArchive archive) {
        byte[] encodedSetup = null;
        if (!setupInitialized) {
          encodedSetup = archive.getFile((byte) 49, 0, 0);
          if (encodedSetup == null) {
            return false;
          }
          VorbisSample.decodeSetup(encodedSetup);
        }
        return true;
    }

    final PcmSample decodeAllToPcm() {
        int packetIndex = 0;
        int sampleIndex = 0;
        int writeIndex = 0;
        byte[] samples;
        int outputPosition;
        float[] packetSamples;
        int outputCount;
        int unsignedSample;
        this.previousBlockSize = 0;
        this.previousBlock = new float[largeBlockSize];
        samples = new byte[this.sampleCount];
        outputPosition = 0;
        for (packetIndex = 0; packetIndex < this.packets.length; packetIndex++) {
          packetSamples = this.decodePacket(packetIndex);
          if (packetSamples != null) {
            outputCount = packetSamples.length;
            if (outputCount > this.sampleCount - outputPosition) {
              outputCount = this.sampleCount - outputPosition;
            }
            for (sampleIndex = 0; sampleIndex < outputCount; sampleIndex++) {
              unsignedSample = (int)(128.0f + packetSamples[sampleIndex] * 128.0f);
              if ((unsignedSample & -256) != 0) {
                unsignedSample = ~unsignedSample >> 31;
              }
              writeIndex = outputPosition;
              outputPosition++;
              samples[writeIndex] = (byte)(unsignedSample - 128);
            }
          }
        }
        this.previousBlock = null;
        return new PcmSample(this.sampleRate, samples, this.loopStart, this.loopEnd, this.loopModeFlag);
    }

    final static VorbisSample loadByName(ResourceArchive archive, String groupName, String fileName) {
        try {
          VorbisSample sample = null;
          if (!VorbisSample.ensureSetup(archive)) {
            archive.ensureFileAvailableByName(-88, fileName, groupName);
            return null;
          }
          byte[] encodedSample = archive.getFileByName(fileName, 46, groupName);
          if (encodedSample == null) {
            return null;
          }
          Object unusedSampleReference = null;
          try {
            sample = new VorbisSample(encodedSample);
          } catch (IOException containerError) {
            containerError.printStackTrace();
          }
          return sample;
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    private final void decodePacketContainer(byte[] encodedSample) throws IOException {
        int packetIndex = 0;
        int packetLength = 0;
        int lengthByte = 0;
        byte[] packet = null;
        PacketBuffer buffer = new PacketBuffer(encodedSample);
        this.sampleRate = buffer.readInt(1);
        this.sampleCount = buffer.readInt(1);
        this.loopStart = buffer.readInt(1);
        this.loopEnd = buffer.readInt(1);
        if (this.loopEnd < 0) {
          this.loopEnd = ~this.loopEnd;
          this.loopModeFlag = true;
        }
        int packetCount = buffer.readInt(1);
        if (packetCount < 0) {
          throw new IOException();
        }
        this.packets = new byte[packetCount][];
        for (packetIndex = 0; packetIndex < packetCount; packetIndex++) {
          packetLength = 0;
          do {
            lengthByte = buffer.readUnsignedByte(0);
            packetLength = packetLength + lengthByte;
          } while (lengthByte >= 255);
          packet = new byte[packetLength];
          buffer.readBytes(0, packetLength, 0, packet);
          this.packets[packetIndex] = packet;
        }
    }

    final static VorbisSample load(ResourceArchive archive, int groupId, int fileId) {
        try {
          VorbisSample sample = null;
          if (!VorbisSample.ensureSetup(archive)) {
            archive.ensureFileAvailable(groupId, fileId, 0);
            return null;
          }
          byte[] encodedSample = archive.getFile((byte) 69, fileId, groupId);
          if (encodedSample == null) {
            return null;
          }
          Object unusedSampleReference = null;
          try {
            sample = new VorbisSample(encodedSample);
          } catch (IOException containerError) {
            containerError.printStackTrace();
          }
          return sample;
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    final static float unpackFloat(int packedValue) {
        int mantissa = packedValue & 2097151;
        int signBit = packedValue & -2147483648;
        int exponent = (packedValue & 2145386496) >> 21;
        if (signBit != 0) {
          mantissa = -mantissa;
        }
        return (float)((double)mantissa * Math.pow(2.0, (double)(exponent - 788)));
    }

    private VorbisSample(byte[] encodedSample) throws IOException {
        this.decodePacketContainer(encodedSample);
    }

    static {
        setupInitialized = false;
    }
}
